package scp.items;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.World;
import scp.mod_SCP;
import scp.entities.SCPEntity015Boss;

public class SCPItem015 extends SCPItemDocument
{
	public Random rand = new Random();
	public int pipes[]= {1, 0, 1, 1, 1, 0, 1, 1, 2, 0, 1, 0, 0, 2, 1,
			             1, 2, 1, 0, 0, 0, 0, 2, 1, 1, 1, 0, 0, 1, 1,
			             1, 1, 0, 1, 2, 0, 0, 1, 1, 0, 1, 0, 2, 1, 2,
			             0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 
			             1, 0, 1, 2, 0, 1, 2, 0, 1, 1, 0, 0, 0, 1, 0,
			             1, 0, 1, 1, 1, 0, 0, 0, 1, 2, 0, 1, 1, 2, 1,
			             2, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1,
			             0, 0, 1, 1, 0, 1, 2, 0, 0, 1, 0, 0, 0, 0, 2,
			             1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 2, 1, 1,
			             0, 0, 1, 2, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1,
			             0, 1, 2, 1, 1, 0, 1, 2, 0, 0, 1, 0, 1, 1, 1,
			             0, 0, 0, 0, 2, 1, 1, 1, 0, 1, 1, 0, 0, 0, 2,
			             1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0,
			             0, 0, 1, 0, 1, 1, 0, 2, 0, 0, 0, 1, 2, 1, 0,
			             1, 2, 0, 0, 2, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0,
			             1, 0, 2, 1, 1, 0, 0, 1, 1, 0, 1, 2, 1, 0, 0};
	
	public int pipes1[]= {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1,
            			  1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1,
            			  1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1,
            			  0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 
            			  1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0,
            			  1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1,
            			  0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1,
            			  0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1,
            			  1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1,
            			  0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1,
            			  1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1,
            			  0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1,
            			  1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0,
            			  0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1,
            			  1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0,
            			  1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1};

	public int pipes2[]= {1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1,
            			  1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1,
            			  1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1,
            			  0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 
            			  1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0,
            			  1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1,
            			  0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1,
            			  0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0,
            			  1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0,
            			  0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1,
            			  0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1,
            			  0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0,
            			  1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0,
            			  0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0,
            			  0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0,
            			  1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0};
	
	public SCPItem015(int i)
	{
		super(i, 1);
		maxStackSize = 1;
		setMaxDamage(1);
	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4)
	{
		list.add("\u00a7eSCP-015");
		list.add("\u00a77Pipe Nightmare");
	}

	public boolean isFull3D()
	{
		return true;
	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		--par1ItemStack.stackSize;
		if (par3World.isRemote)
		{
			--par1ItemStack.stackSize;
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
				par1ItemStack.stackSize = 0;
			}
			int i = par3World.getBlockId(par4, par5, par6);

			for(int height = -1; height <= 5; height++)
				for(int length = -1; length <= 15; length++)
					for(int width = -1; width <= 15; width++)
					{					
						par3World.setBlock(par4 + length, par5 + height, par6 + width, Block.stone.blockID, 0, 2);					
					}

			for(int height = 0; height <= 4; height++)
				for(int length = 0; length <= 14; length++)
					for(int width = 0; width <= 14; width++)
					{
						par3World.setBlock(par4 + length, par5 + height, par6 + width, 0, 0, 2);				
					}
				
			//FLOOR
			for(int width = 0; width <= 224; width++)
			{
				if(pipes[width] == 1){
				if(width <= 14) par3World.setBlock(par4 + width, par5, par6 + 14, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 15 && width <= 29) par3World.setBlock(par4 + width - 14 - 1, par5, par6 + 13, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 30 && width <= 44) par3World.setBlock(par4 + width - 14*2 - 2, par5, par6 + 12, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 45 && width <= 59) par3World.setBlock(par4 + width - 14*3 - 3, par5, par6 + 11, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 60 && width <= 74) par3World.setBlock(par4 + width - 14*4 - 4, par5, par6 + 10, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 75 && width <= 89) par3World.setBlock(par4 + width - 14*5 - 5, par5, par6 + 9, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 90 && width <= 104) par3World.setBlock(par4 + width - 14*6 - 6, par5, par6 + 8, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 105 && width <= 119) par3World.setBlock(par4 + width - 14*7 - 7, par5, par6 + 7, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 120 && width <= 134) par3World.setBlock(par4 + width - 14*8 - 8, par5, par6 + 6, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 135 && width <= 149) par3World.setBlock(par4 + width - 14*9 - 9, par5, par6 + 5, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 150 && width <= 164) par3World.setBlock(par4 + width - 14*10 - 10, par5, par6 + 4, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 165 && width <= 179) par3World.setBlock(par4 + width - 14*11 - 11, par5, par6 + 3, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 180 && width <= 194) par3World.setBlock(par4 + width - 14*12 - 12, par5, par6 + 2, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 195 && width <= 209) par3World.setBlock(par4 + width - 14*13 - 13, par5, par6 + 1, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 210 && width <= 224) par3World.setBlock(par4 + width - 14*14 - 14, par5, par6, mod_SCP.SCP015.blockID, 0, 2);	
				}
				if(pipes[width] == 2)
				{
					if(width <= 14) par3World.setBlock(par4 + width, par5, par6 + 14, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 15 && width <= 29) par3World.setBlock(par4 + width - 14 - 1, par5, par6 + 13, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 30 && width <= 44) par3World.setBlock(par4 + width - 14*2 - 2, par5, par6 + 12, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 45 && width <= 59) par3World.setBlock(par4 + width - 14*3 - 3, par5, par6 + 11, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 60 && width <= 74) par3World.setBlock(par4 + width - 14*4 - 4, par5, par6 + 10, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 75 && width <= 89) par3World.setBlock(par4 + width - 14*5 - 5, par5, par6 + 9, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 90 && width <= 104) par3World.setBlock(par4 + width - 14*6 - 6, par5, par6 + 8, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 105 && width <= 119) par3World.setBlock(par4 + width - 14*7 - 7, par5, par6 + 7, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 120 && width <= 134) par3World.setBlock(par4 + width - 14*8 - 8, par5, par6 + 6, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 135 && width <= 149) par3World.setBlock(par4 + width - 14*9 - 9, par5, par6 + 5, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 150 && width <= 164) par3World.setBlock(par4 + width - 14*10 - 10, par5, par6 + 4, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 165 && width <= 179) par3World.setBlock(par4 + width - 14*11 - 11, par5, par6 + 3, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 180 && width <= 194) par3World.setBlock(par4 + width - 14*12 - 12, par5, par6 + 2, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 195 && width <= 209) par3World.setBlock(par4 + width - 14*13 - 13, par5, par6 + 1, mod_SCP.Machinery.blockID, 0, 2);
					else if(width >= 210 && width <= 224) par3World.setBlock(par4 + width - 14*14 - 14, par5, par6, mod_SCP.Machinery.blockID, 0, 2);	
				}
			}
			
			//LEVEL 2
			for(int width = 0; width <= 224; width++)
			{
				if(pipes2[width] == 1){
				if(width <= 14) par3World.setBlock(par4 + width, par5, par6 + 14, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 15 && width <= 29) par3World.setBlock(par4 + width - 14 - 1, par5 + 1, par6 + 13, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 30 && width <= 44) par3World.setBlock(par4 + width - 14*2 - 2, par5 + 1, par6 + 12, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 45 && width <= 59) par3World.setBlock(par4 + width - 14*3 - 3, par5 + 1, par6 + 11, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 60 && width <= 74) par3World.setBlock(par4 + width - 14*4 - 4, par5 + 1, par6 + 10, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 75 && width <= 89) par3World.setBlock(par4 + width - 14*5 - 5, par5 + 1, par6 + 9, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 90 && width <= 104) par3World.setBlock(par4 + width - 14*6 - 6, par5 + 1, par6 + 8, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 105 && width <= 119) par3World.setBlock(par4 + width - 14*7 - 7, par5 + 1, par6 + 7, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 120 && width <= 134) par3World.setBlock(par4 + width - 14*8 - 8, par5 + 1, par6 + 6, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 135 && width <= 149) par3World.setBlock(par4 + width - 14*9 - 9, par5 + 1, par6 + 5, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 150 && width <= 164) par3World.setBlock(par4 + width - 14*10 - 10, par5 + 1, par6 + 4, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 165 && width <= 179) par3World.setBlock(par4 + width - 14*11 - 11, par5 + 1, par6 + 3, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 180 && width <= 194) par3World.setBlock(par4 + width - 14*12 - 12, par5 + 1, par6 + 2, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 195 && width <= 209) par3World.setBlock(par4 + width - 14*13 - 13, par5 + 1, par6 + 1, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 210 && width <= 224) par3World.setBlock(par4 + width - 14*14 - 14, par5 + 1, par6, mod_SCP.SCP015.blockID, 0, 2);	
				}
			}
			
			//LEVEL 3
			for(int width = 0; width <= 224; width++)
			{
				if(pipes1[width] == 1){
				if(width <= 14) par3World.setBlock(par4 + width, par5 + 2, par6 + 14, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 15 && width <= 29) par3World.setBlock(par4 + width - 14 - 1, par5 + 2, par6 + 13, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 30 && width <= 44) par3World.setBlock(par4 + width - 14*2 - 2, par5 + 2, par6 + 12, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 45 && width <= 59) par3World.setBlock(par4 + width - 14*3 - 3, par5 + 2, par6 + 11, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 60 && width <= 74) par3World.setBlock(par4 + width - 14*4 - 4, par5 + 2, par6 + 10, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 75 && width <= 89) par3World.setBlock(par4 + width - 14*5 - 5, par5 + 2, par6 + 9, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 90 && width <= 104) par3World.setBlock(par4 + width - 14*6 - 6, par5 + 2, par6 + 8, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 105 && width <= 119) par3World.setBlock(par4 + width - 14*7 - 7, par5 + 2, par6 + 7, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 120 && width <= 134) par3World.setBlock(par4 + width - 14*8 - 8, par5 + 2, par6 + 6, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 135 && width <= 149) par3World.setBlock(par4 + width - 14*9 - 9, par5 + 2, par6 + 5, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 150 && width <= 164) par3World.setBlock(par4 + width - 14*10 - 10, par5 + 2, par6 + 4, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 165 && width <= 179) par3World.setBlock(par4 + width - 14*11 - 11, par5 + 2, par6 + 3, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 180 && width <= 194) par3World.setBlock(par4 + width - 14*12 - 12, par5 + 2, par6 + 2, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 195 && width <= 209) par3World.setBlock(par4 + width - 14*13 - 13, par5 + 2, par6 + 1, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 210 && width <= 224) par3World.setBlock(par4 + width - 14*14 - 14, par5 + 2, par6, mod_SCP.SCP015.blockID, 0, 2);		
				}
			}

			//LEVEL 4
			for(int width = 0; width <= 224; width++)
			{
				if(pipes[width] == 1){
				if(width <= 14) par3World.setBlock(par4 + width, par5, par6 + 14, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 15 && width <= 29) par3World.setBlock(par4 + width - 14 - 1, par5 + 3, par6 + 13, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 30 && width <= 44) par3World.setBlock(par4 + width - 14*2 - 2, par5 + 3, par6 + 12, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 45 && width <= 59) par3World.setBlock(par4 + width - 14*3 - 3, par5 + 3, par6 + 11, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 60 && width <= 74) par3World.setBlock(par4 + width - 14*4 - 4, par5 + 3, par6 + 10, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 75 && width <= 89) par3World.setBlock(par4 + width - 14*5 - 5, par5 + 3, par6 + 9, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 90 && width <= 104) par3World.setBlock(par4 + width - 14*6 - 6, par5 + 3, par6 + 8, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 105 && width <= 119) par3World.setBlock(par4 + width - 14*7 - 7, par5 + 3, par6 + 7, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 120 && width <= 134) par3World.setBlock(par4 + width - 14*8 - 8, par5 + 3, par6 + 6, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 135 && width <= 149) par3World.setBlock(par4 + width - 14*9 - 9, par5 + 3, par6 + 5, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 150 && width <= 164) par3World.setBlock(par4 + width - 14*10 - 10, par5 + 3, par6 + 4, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 165 && width <= 179) par3World.setBlock(par4 + width - 14*11 - 11, par5 + 3, par6 + 3, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 180 && width <= 194) par3World.setBlock(par4 + width - 14*12 - 12, par5 + 3, par6 + 2, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 195 && width <= 209) par3World.setBlock(par4 + width - 14*13 - 13, par5 + 3, par6 + 1, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 210 && width <= 224) par3World.setBlock(par4 + width - 14*14 - 14, par5 + 3, par6, mod_SCP.SCP015.blockID, 0, 2);	
				}
			}
			
			//ROOF
			for(int width = 0; width <= 224; width++)
			{
				if(pipes2[width] == 1){
				if(width <= 14) par3World.setBlock(par4 + width, par5, par6 + 14, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 15 && width <= 29) par3World.setBlock(par4 + width - 14 - 1, par5 + 4, par6 + 13, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 30 && width <= 44) par3World.setBlock(par4 + width - 14*2 - 2, par5 + 4, par6 + 12, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 45 && width <= 59) par3World.setBlock(par4 + width - 14*3 - 3, par5 + 4, par6 + 11, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 60 && width <= 74) par3World.setBlock(par4 + width - 14*4 - 4, par5 + 4, par6 + 10, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 75 && width <= 89) par3World.setBlock(par4 + width - 14*5 - 5, par5 + 4, par6 + 9, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 90 && width <= 104) par3World.setBlock(par4 + width - 14*6 - 6, par5 + 4, par6 + 8, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 105 && width <= 119) par3World.setBlock(par4 + width - 14*7 - 7, par5 + 4, par6 + 7, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 120 && width <= 134) par3World.setBlock(par4 + width - 14*8 - 8, par5 + 4, par6 + 6, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 135 && width <= 149) par3World.setBlock(par4 + width - 14*9 - 9, par5 + 4, par6 + 5, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 150 && width <= 164) par3World.setBlock(par4 + width - 14*10 - 10, par5 + 4, par6 + 4, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 165 && width <= 179) par3World.setBlock(par4 + width - 14*11 - 11, par5 + 4, par6 + 3, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 180 && width <= 194) par3World.setBlock(par4 + width - 14*12 - 12, par5 + 4, par6 + 2, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 195 && width <= 209) par3World.setBlock(par4 + width - 14*13 - 13, par5 + 4, par6 + 1, mod_SCP.SCP015.blockID, 0, 2);
				else if(width >= 210 && width <= 224) par3World.setBlock(par4 + width - 14*14 - 14, par5 + 4, par6, mod_SCP.SCP015.blockID, 0, 2);		
				}
			}
			for(int width = 0; width <= 3; width++)
			{
				for(int length = 0; length <= 3; length++)
				{
					for(int height = 0; height <= 2; height++)
					{
						par3World.setBlock(par4 + width + 5, par5 + height, par6 + length + 5, 0);
						--par1ItemStack.stackSize;
					}
				}
			}

			par3World.setBlock(par4 + 2, par5 + 1, par6 - 2, mod_SCP.KeycardSlotLv2.blockID, 2, 2);
			par3World.setBlock(par4 + 4, par5 + 1, par6, mod_SCP.KeycardSlotLv2.blockID, 0, 2);
			ItemDoor.placeDoorBlock(par3World, par4 + 3, par5, par6 - 1, 1, Block.doorSteel);
			par2EntityPlayer.addChatMessage("SCP-015 Spawned." + " | [Type: \u00a7eEuclid\u00a7f]");
			par2EntityPlayer.addStat(mod_SCP.summonSCP015Boss, 1);
			
			par1ItemStack.stackSize = 0;
			return true;
		}
	}
	
	public static boolean spawnCreature(World par0World, int par1, double par2, double par4, double par6)
	{
		SCPEntity015Boss var8 = new SCPEntity015Boss(par0World);
		var8.setLocationAndAngles(par2 + 7, par4, par6 + 7, par0World.rand.nextFloat() * 360.0F, 0.0F);
		par0World.spawnEntityInWorld(var8);
		((EntityLiving)var8).playLivingSound();

		return var8 != null;
	}
}


