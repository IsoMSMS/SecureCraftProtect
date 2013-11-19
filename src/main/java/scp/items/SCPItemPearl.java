package scp.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class SCPItemPearl extends Item
{
	public static String SCP;
	public SCPItemPearl(int i, String SCPID)
	{
		super(i);
		this.SCP = SCPID;
		this.setCreativeTab(SCP.tabSCP);
		this.setUnlocalizedName(SCPID);
		this.setTextureName("scp:"+SCPID);
	}

}
