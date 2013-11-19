package scp.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import scp.SCP;

public class SCPBlock extends Block
{
    public SCPBlock(int par1, int par2, Material mat)
    {
        super(par1, mat);
        this.setCreativeTab(SCP.tabBlockSCP);
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }
    
    public void registerIcons(IconRegister par1)
    {
    	blockIcon = par1.registerIcon("scp:" + this.getUnlocalizedName());
    }
}
