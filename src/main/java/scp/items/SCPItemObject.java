package scp.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import scp.mod_SCP;

public class SCPItemObject extends Item
{
	public SCPItemObject(int i)
	{
		super(i);
		this.setCreativeTab(mod_SCP.tabItemSCP);
	}

	public void updateIcons(IconRegister par1)
	{
		String name = getUnlocalizedName();
		name = name.replace("item.", "");
		name = name.trim();
		iconIndex = par1.registerIcon(mod_SCP.modid + ":" + name);
	}
}
