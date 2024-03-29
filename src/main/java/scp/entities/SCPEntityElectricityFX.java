package scp.entities;

import net.minecraft.client.particle.EntityRainFX;
import net.minecraft.world.World;
import scp.mod_SCP;

public class SCPEntityElectricityFX extends EntityRainFX
{
    public SCPEntityElectricityFX(World par1World, double par2, double par4, double par6, double par8, double par10, double par12)
    {
        super(par1World, par2, par4, par6);
        this.particleGravity = -0.04F;
        this.setParticleTextureIndex(61);
        this.motionX = par8;
        this.motionY = par10 + 0.1D;
        this.motionZ = par12;
    }
}
