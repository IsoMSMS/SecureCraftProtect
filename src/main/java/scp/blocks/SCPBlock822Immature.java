package scp.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
import scp.mod_SCP;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SCPBlock822Immature extends Block implements IPlantable
{
	public SCPBlock822Immature(int par1, int par2)
	{
		super(par1, Material.cactus);
		this.setTickRandomly(true);
		this.setCreativeTab(mod_SCP.tabBlockSCP);
	}

	public void registerIcons(IconRegister par1)
    {
    	blockIcon = par1.registerIcon(mod_SCP.modid + ":" + this.getUnlocalizedName2());
    }

	/**
	 * Ticks the block if it's been scheduled
	 */
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if (par1World.isAirBlock(par2, par3 + 1, par4))
		{
			int var6;

			for (var6 = 1; par1World.getBlockId(par2, par3 - var6, par4) == this.blockID; ++var6)
			{
				;
			}

			if (var6 < 3)
			{
				int var7 = par1World.getBlockMetadata(par2, par3, par4);

				if (var7 == 15)
				{
					Random rand = new Random();
					int hur = rand.nextInt(2);
					if(hur == 0)
					{
					//	par1World.setBlockWithNotify(par2, par3 + 1, par4, mod_SCP.SCP822Grown.blockID);
					//	par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);
					}
					if(hur == 1)
					{
					//	par1World.setBlockWithNotify(par2, par3 + 1, par4, this.blockID);
					//	par1World.setBlockMetadataWithNotify(par2, par3, par4, 0);
					}
				}
				else
				{
				//	par1World.setBlockMetadataWithNotify(par2, par3, par4, var7 + 1);
				}
			}
		}
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		float var5 = 0.0625F;
		return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2 + var5), (double)par3, (double)((float)par4 + var5), (double)((float)(par2 + 1) - var5), (double)((float)(par3 + 1) - var5), (double)((float)(par4 + 1) - var5));
	}

	@SideOnly(Side.CLIENT)

	/**
	 * Returns the bounding box of the wired rectangular prism to render.
	 */
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		float var5 = 0.0625F;
		return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2 + var5), (double)par3, (double)((float)par4 + var5), (double)((float)(par2 + 1) - var5), (double)(par3 + 1), (double)((float)(par4 + 1) - var5));
	}

	/**
	 * Returns the block texture based on the side being looked at.  Args: side
	 */
/*	public int getBlockTextureFromSide(int par1)
	{
		return par1 == 1 ? this.blockIndexInTexture - 1 : (par1 == 0 ? this.blockIndexInTexture + 1 : this.blockIndexInTexture);
	}*/

	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	 */
	public boolean isOpaqueCube()
	{
		return false;
	}

	/**
	 * The type of render function that is called for this block
	 */
	public int getRenderType()
	{
		return 13;
	}

	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	{
		return !super.canPlaceBlockAt(par1World, par2, par3, par4) ? false : this.canBlockStay(par1World, par2, par3, par4);
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor blockID
	 */
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
	{
		if (!this.canBlockStay(par1World, par2, par3, par4))
		{
			this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
		//	par1World.setBlockWithNotify(par2, par3, par4, 0);
		}
	}

	/**
	 * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
	 */
	public boolean canBlockStay(World par1World, int par2, int par3, int par4)
	{
		if (par1World.getBlockMaterial(par2 - 1, par3, par4).isSolid())
		{
			return false;
		}
		else if (par1World.getBlockMaterial(par2 + 1, par3, par4).isSolid())
		{
			return false;
		}
		else if (par1World.getBlockMaterial(par2, par3, par4 - 1).isSolid())
		{
			return false;
		}
		else if (par1World.getBlockMaterial(par2, par3, par4 + 1).isSolid())
		{
			return false;
		}
		else if (par1World.getBlockId(par2, par3 - 1, par4) == mod_SCP.SCP822.blockID)
		{
			return true;
		}
		else
		{
			int var5 = par1World.getBlockId(par2, par3 - 1, par4);
			return blocksList[var5] != null && blocksList[var5].canSustainPlant(par1World, par2, par3 - 1, par4, ForgeDirection.UP, this);
		}
	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
	 */
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		par5Entity.attackEntityFrom(DamageSource.cactus, 1);
	}

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z)
	{
		return EnumPlantType.Desert;
	}

	@Override
	public int getPlantID(World world, int x, int y, int z)
	{
		return Block.cactus.blockID;
	}

	@Override
	public int getPlantMetadata(World world, int x, int y, int z)
	{
		return -1;
	}
}
