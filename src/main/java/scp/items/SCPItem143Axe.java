package scp.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import scp.SCP;
import scp.config.SCPBlocks;

public class SCPItem143Axe extends ItemTool
{
	private static Block blocksEffectiveAgainst[];

	public SCPItem143Axe(int i, EnumToolMaterial enumtoolmaterial)
	{
		super(i, 3, enumtoolmaterial, blocksEffectiveAgainst);
		this.setCreativeTab(SCP.tabItemSCP);
		setMaxDamage(1000);
	}

	public float getStrVsBlock(ItemStack itemstack, Block block)
	{
		if(block != null && block.blockMaterial == Material.iron)
		{
			return efficiencyOnProperMaterial;
		} 
		else
		{
			return super.getStrVsBlock(itemstack, block);
		}
	}

	static
	{
		blocksEffectiveAgainst = (new Block[] {
				Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.stairsWoodBirch, Block.stairsWoodJungle, Block.stairsWoodSpruce, Block.stairsWoodOak, Block.pumpkin, Block.pumpkinLantern, SCPBlocks.blockSCP143Log
		});
	}

	public String getTextureFile()
	{
		return "/SCPCraft/textures/SCPItems.png";
	}
}