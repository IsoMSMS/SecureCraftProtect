package scp.items;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.World;
import scp.mod_SCP;
import scp.entities.SCPEntity080;

public class SCPItem080 extends SCPItemDocument
{
	public SCPItem080(int i)
	{
		super(i, 1);
		maxStackSize = 1;
		setMaxDamage(1);
	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4)
	{
		list.add("\u00a7eSCP-080");
		list.add("\u00a77The Boogieman");
	}

	public boolean isFull3D()
	{
		return true;
	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		if (par3World.isRemote)
		{
			return true;
		}

		else
		{
			int var11 = par3World.getBlockId(par4, par5, par6);
			par4 += Facing.offsetsXForSide[par7];
			par5 += Facing.offsetsYForSide[par7];
			par6 += Facing.offsetsZForSide[par7];
			double var12 = 0.0D;

			if (par7 == 1 && var11 == Block.fence.blockID || var11 == Block.netherFence.blockID)
			{
				var12 = 0.5D;
			}

			if (spawnCreature(par3World, par1ItemStack.getItemDamage(), (double)par4 + 0.5D, (double)par5 + var12, (double)par6 + 0.5D) && !par2EntityPlayer.capabilities.isCreativeMode)
			{
				--par1ItemStack.stackSize;
			}

			int i = par3World.getBlockId(par4, par5, par6);

			for(int height = -1; height <= 3; height++)
				for(int length = -1; length <= 4; length++)
					for(int width = -1; width <= 4; width++)
					{					
						par3World.setBlock(par4 + length, par5 + height, par6 + width, Block.blockSteel.blockID, 0, 2);		
					}

			for(int height = 0; height <= 2; height++)
				for(int length = 0; length <= 3; length++)
					for(int width = 0; width <= 3; width++)
					{
						par3World.setBlock(par4 + length, par5 + height, par6 + width, 0, 0, 2);				
					}

			par3World.setBlock(par4 + 2, par5, par6 + 2, Block.torchRedstoneActive.blockID, 0, 2);	

			par3World.setBlock(par4 + 1, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.blockID, 2, 2);
			par3World.setBlock(par4 + 3, par5 + 1, par6, mod_SCP.KeycardSlotLv2.blockID, 0, 2);
			ItemDoor.placeDoorBlock(par3World, par4 + 2, par5, par6 - 1, 1, Block.doorSteel);

			//(par4 + 3, par5 + 1, par6 + 2);

			par2EntityPlayer.addChatMessage("SCP-080 Spawned." +    

					" | [Type: \u00a7eEuclid\u00a7f]");

			return true;

		}
	}

	public static boolean spawnCreature(World par0World, int par1, double par2, double par4, double par6)
	{
		SCPEntity080 var8 = new SCPEntity080(par0World);
		var8.setLocationAndAngles(par2 + 3, par4 + 1, par6 + 2, par0World.rand.nextFloat() * 360.0F, 0.0F);
		par0World.spawnEntityInWorld(var8);
		((EntityLiving)var8).playLivingSound();

		return var8 != null;
	}
}