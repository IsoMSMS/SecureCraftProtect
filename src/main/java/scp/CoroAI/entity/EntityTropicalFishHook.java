package scp.CoroAI.entity;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityTropicalFishHook extends Entity implements IEntityAdditionalSpawnData {

   private int xTile = -1;
   private int yTile = -1;
   private int zTile = -1;
   private int inTile = 0;
   public boolean inGround = false;
   public int shake = 0;
   public EntityLiving angler;			//sexay
   private int ticksInGround;
   private int ticksInAir = 0;
   public int ticksCatchable = 0;
   public Entity bobber = null;
   private int field_6149_an;
   private double field_6148_ao;
   private double field_6147_ap;
   private double field_6146_aq;
   private double field_6145_ar;
   private double field_6144_as;


   public EntityTropicalFishHook(World var1) {
      super(var1);
      this.setSize(0.25F, 0.25F);
      this.ignoreFrustumCheck = true;
   }
   
   @Override
   public boolean isInRangeToRenderVec3D(Vec3 asd)
   {
	   return asd.distanceTo(Vec3.createVectorHelper(this.posX, this.posY, this.posZ)) < 80; 
       
   }
   
   @Override
   public void setDead()
   {
	   if (!inGround) {
		   AxisAlignedBB var18 = AxisAlignedBB.getBoundingBox(this.boundingBox.minX, this.boundingBox.minY, this.boundingBox.minZ, this.boundingBox.maxX, this.boundingBox.maxY, this.boundingBox.maxZ);
           if(!this.worldObj.isAABBInMaterial(var18, Material.water)) {
        	   int sdfsdf = 0;
           }
		   
	   }
       isDead = true;
   }

   public EntityTropicalFishHook(World var1, EntityLiving var2, float speed) {
      super(var1);
      this.renderDistanceWeight = 10D;
      this.ignoreFrustumCheck = true;
      this.angler = var2;
      if (var2 instanceof c_PlayerProxy) {
    	  ((c_PlayerProxy)this.angler).fishEntity = this;
      }
      this.setSize(0.25F, 0.25F);
      this.setLocationAndAngles(var2.posX, var2.posY + 1.62D - (double)var2.yOffset, var2.posZ, var2.rotationYaw, var2.rotationPitch);
      this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F);
      this.posY -= 0.10000000149011612D;
      this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F);
      this.setPosition(this.posX, this.posY, this.posZ);
      this.yOffset = 0.0F;
      float var3 = 0.4F;
      this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F) * var3);
      this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F) * var3);
      this.motionY = (double)(-MathHelper.sin(this.rotationPitch / 180.0F * 3.1415927F) * var3);
      this.calculateVelocity(this.motionX, this.motionY, this.motionZ, 1.5F, 1);
      motionX = motionX * speed;
      motionY = motionY * speed;
      motionZ = motionZ * speed;
   }

   protected void entityInit() {}

   public void calculateVelocity(double var1, double var3, double var5, float var7, float var8) {
      float var9 = MathHelper.sqrt_double(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.rand.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.rand.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.rand.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.motionX = var1;
      this.motionY = var3;
      this.motionZ = var5;
      float var10 = MathHelper.sqrt_double(var1 * var1 + var5 * var5);
      this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.ticksInGround = 0;
   }

   public void onUpdate() {
      super.onUpdate();
      
      if (angler == null) { setDead(); return; }
      
      if (angler instanceof c_PlayerProxy) {
    	  if (this.angler.isDead) {
    		  this.setDead();
    	  }
	     	if (((c_PlayerProxy)this.angler).fishEntity != this) {
	     		//System.out.println(System.currentTimeMillis() + " - no owner, fishEntity:" + ((c_PlayerProxy)this.angler).fishEntity);
	     		this.setDead();
	     	}
      }
      
      if(this.field_6149_an > 0) {
         double var21 = this.posX + (this.field_6148_ao - this.posX) / (double)this.field_6149_an;
         double var22 = this.posY + (this.field_6147_ap - this.posY) / (double)this.field_6149_an;
         double var23 = this.posZ + (this.field_6146_aq - this.posZ) / (double)this.field_6149_an;

         double var7;
         for(var7 = this.field_6145_ar - (double)this.rotationYaw; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.rotationYaw = (float)((double)this.rotationYaw + var7 / (double)this.field_6149_an);
         this.rotationPitch = (float)((double)this.rotationPitch + (this.field_6144_as - (double)this.rotationPitch) / (double)this.field_6149_an);
         --this.field_6149_an;
         this.setPosition(var21, var22, var23);
         this.setRotation(this.rotationYaw, this.rotationPitch);
      } else {
         if(this.worldObj.isRemote) {
        	 
            ItemStack var1 = null;
            if (angler instanceof c_PlayerProxy) {
            	var1 = ((c_PlayerProxy)this.angler).getCurrentEquippedItem();
            }
            if(this.angler.isDead || !this.angler.isEntityAlive() || var1 == null/* || var1.getItem() != Item.fishingRod*/ || this.getDistanceSqToEntity(this.angler) > 1024.0D) {
               this.setDead();
               if (angler instanceof c_PlayerProxy) {
               	((c_PlayerProxy)this.angler).fishEntity = null;
               }
               //this.angler.fishEntity = null;
               return;
            }

            if(this.bobber != null) {
               if(!this.bobber.isDead) {
                  this.posX = this.bobber.posX;
                  this.posY = this.bobber.boundingBox.minY + (double)this.bobber.height * 0.8D;
                  this.posZ = this.bobber.posZ;
                  return;
               }

               this.bobber = null;
            }
         }

         if(this.shake > 0) {
            --this.shake;
         }

         if(this.inGround) {
            int var19 = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);
            if(var19 == this.inTile) {
               ++this.ticksInGround;
               if(this.ticksInGround == 1200) {
                  this.setDead();
               }

               return;
            }

            this.inGround = false;
            this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
            this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
            this.motionZ *= (double)(this.rand.nextFloat() * 0.2F);
            this.ticksInGround = 0;
            this.ticksInAir = 0;
         } else {
            ++this.ticksInAir;
         }

         Vec3 var20 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
         Vec3 var2 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
         MovingObjectPosition var3 = this.worldObj.rayTraceBlocks(var20, var2);
         var20 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
         var2 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
         if(var3 != null) {
            var2 = Vec3.createVectorHelper(var3.hitVec.xCoord, var3.hitVec.yCoord, var3.hitVec.zCoord);
         }

         Entity var4 = null;
         List var5 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
         double var6 = 0.0D;

         double var13;
         for(int var8 = 0; var8 < var5.size(); ++var8) {
            Entity var9 = (Entity)var5.get(var8);
            if(var9.canBeCollidedWith() && !(var9 instanceof c_PlayerProxy) && (var9 != this.angler || this.ticksInAir >= 10)) {
               float var10 = 0.3F;
               AxisAlignedBB var11 = var9.boundingBox.expand((double)var10, (double)var10, (double)var10);
               MovingObjectPosition var12 = var11.calculateIntercept(var20, var2);
               if(var12 != null) {
                  var13 = var20.distanceTo(var12.hitVec);
                  if(var13 < var6 || var6 == 0.0D) {
                     var4 = var9;
                     var6 = var13;
                  }
               }
            }
         }

         if(var4 != null) {
            var3 = new MovingObjectPosition(var4);
         }

         if(var3 != null) {
            if(var3.entityHit != null) {
            	//temp damage change
               if(var3.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.angler), 0)) {
                  this.bobber = var3.entityHit;
               }
            } else {
               this.inGround = true;
            }
         }

         if(!this.inGround) {
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            float var24 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / 3.1415927410125732D);

            for(this.rotationPitch = (float)(Math.atan2(this.motionY, (double)var24) * 180.0D / 3.1415927410125732D); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F) {
               ;
            }

            while(this.rotationPitch - this.prevRotationPitch >= 180.0F) {
               this.prevRotationPitch += 360.0F;
            }

            while(this.rotationYaw - this.prevRotationYaw < -180.0F) {
               this.prevRotationYaw -= 360.0F;
            }

            while(this.rotationYaw - this.prevRotationYaw >= 180.0F) {
               this.prevRotationYaw += 360.0F;
            }

            this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
            this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
            float var25 = 0.92F;
            if(this.onGround || this.isCollidedHorizontally) {
               var25 = 0.5F;
            }

            byte var27 = 5;
            double var26 = 0.0D;

            for(int var29 = 0; var29 < var27; ++var29) {
               double var14 = this.boundingBox.minY + (this.boundingBox.maxY - this.boundingBox.minY) * (double)(var29 + 0) / (double)var27 - 0.125D + 0.125D;
               double var16 = this.boundingBox.minY + (this.boundingBox.maxY - this.boundingBox.minY) * (double)(var29 + 1) / (double)var27 - 0.125D + 0.125D;
               AxisAlignedBB var18 = AxisAlignedBB.getBoundingBox(this.boundingBox.minX, var14, this.boundingBox.minZ, this.boundingBox.maxX, var16, this.boundingBox.maxZ);
               if(this.worldObj.isAABBInMaterial(var18, Material.water)) {
                  var26 += 1.0D / (double)var27;
               }
            }

            if(var26 > 0.0D) {
               if(this.ticksCatchable > 0) {
                  --this.ticksCatchable;
               } else {
                  short var28 = 500;
                  if(this.worldObj.canLightningStrikeAt(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY) + 1, MathHelper.floor_double(this.posZ))) {
                     var28 = 300;
                  }

                  if(this.rand.nextInt(var28) == 0) {
                     this.ticksCatchable = this.rand.nextInt(30) + 10;
                     this.motionY -= 0.20000000298023224D;
                     this.worldObj.playSoundAtEntity(this, "random.splash", 0.25F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
                     float var30 = (float)MathHelper.floor_double(this.boundingBox.minY);

                     int var15;
                     float var17;
                     float var31;
                     for(var15 = 0; (float)var15 < 1.0F + this.width * 20.0F; ++var15) {
                        var31 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width;
                        var17 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width;
                        this.worldObj.spawnParticle("bubble", this.posX + (double)var31, (double)(var30 + 1.0F), this.posZ + (double)var17, this.motionX, this.motionY - (double)(this.rand.nextFloat() * 0.2F), this.motionZ);
                     }

                     for(var15 = 0; (float)var15 < 1.0F + this.width * 20.0F; ++var15) {
                        var31 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width;
                        var17 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width;
                        this.worldObj.spawnParticle("splash", this.posX + (double)var31, (double)(var30 + 1.0F), this.posZ + (double)var17, this.motionX, this.motionY, this.motionZ);
                     }
                  }
               }
            }

            if(this.ticksCatchable > 0) {
               this.motionY -= (double)(this.rand.nextFloat() * this.rand.nextFloat() * this.rand.nextFloat()) * 0.2D;
            }

            var13 = var26 * 2.0D - 1.0D;
            this.motionY += 0.03999999910593033D * var13;
            if(var26 > 0.0D) {
               var25 = (float)((double)var25 * 0.9D);
               this.motionY *= 0.8D;
            }

            this.motionX *= (double)var25;
            this.motionY *= (double)var25;
            this.motionZ *= (double)var25;
            this.setPosition(this.posX, this.posY, this.posZ);
         }
      }
   }

   public void writeEntityToNBT(NBTTagCompound var1) {
      var1.setShort("xTile", (short)this.xTile);
      var1.setShort("yTile", (short)this.yTile);
      var1.setShort("zTile", (short)this.zTile);
      var1.setByte("inTile", (byte)this.inTile);
      var1.setByte("shake", (byte)this.shake);
      var1.setByte("inGround", (byte)(this.inGround?1:0));
   }

   public void readEntityFromNBT(NBTTagCompound var1) {
      this.xTile = var1.getShort("xTile");
      this.yTile = var1.getShort("yTile");
      this.zTile = var1.getShort("zTile");
      this.inTile = var1.getByte("inTile") & 255;
      this.shake = var1.getByte("shake") & 255;
      this.inGround = var1.getByte("inGround") == 1;
   }

   public int catchFish() {
      byte var1 = 0;
      if(this.bobber != null) {
         double var2 = this.angler.posX - this.posX;
         double var4 = this.angler.posY - this.posY;
         double var6 = this.angler.posZ - this.posZ;
         double var8 = (double)MathHelper.sqrt_double(var2 * var2 + var4 * var4 + var6 * var6);
         double var10 = 0.1D;
         this.bobber.motionX += var2 * var10;
         this.bobber.motionY += var4 * var10 + (double)MathHelper.sqrt_double(var8) * 0.08D;
         this.bobber.motionZ += var6 * var10;
         var1 = 3;
      } else if(this.ticksCatchable > 0) {
         EntityItem var13 = new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, new ItemStack(Item.fishRaw));
         double var3 = this.angler.posX - this.posX;
         double var5 = this.angler.posY - this.posY;
         double var7 = this.angler.posZ - this.posZ;
         double var9 = (double)MathHelper.sqrt_double(var3 * var3 + var5 * var5 + var7 * var7);
         double var11 = 0.1D;
         var13.motionX = var3 * var11;
         var13.motionY = var5 * var11 + (double)MathHelper.sqrt_double(var9) * 0.08D;
         var13.motionZ = var7 * var11;
         this.worldObj.spawnEntityInWorld(var13);
         //this.angler.addStat(StatList.fishCaughtStat, 1);
         var1 = 1;
      }

      if(this.inGround) {
         var1 = 2;
      }

      this.setDead();
      if (angler instanceof c_PlayerProxy) {
      	((c_PlayerProxy)this.angler).fishEntity = null;
      }
      return var1;
   }

	@Override
	public void writeSpawnData(ByteArrayDataOutput data) {
		int id = 0;
		if (angler != null) {
			id = angler.entityId;
		}
		data.writeInt(id);
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void readSpawnData(ByteArrayDataInput data) {
		Entity ent = getEntByID(data.readInt());
		if (ent instanceof EntityLiving) {
			angler = (EntityLiving)ent;
			if (angler instanceof c_PlayerProxy) {
		    	  ((c_PlayerProxy)this.angler).fishEntity = this;
		      }
		}
		// TODO Auto-generated method stub
		
	}
	
	@SideOnly(Side.CLIENT)
	public Entity getEntByID(int id) {
		return FMLClientHandler.instance().getClient().theWorld.getEntityByID(id);
	}
}
