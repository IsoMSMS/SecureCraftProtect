package scp.blocks;

import net.minecraft.creativetab.CreativeTabs;
import scp.mod_SCP;

public final class SCPBlockTab extends CreativeTabs
{
    public SCPBlockTab(int par1, String par2Str)
    {
        super(par1, par2Str);
    }

    public int getTabIconItemIndex()
    {
        return mod_SCP.Locker.blockID;
    }
    
    public String getTabLabel()
    {
        return "SCPBlocks";
    }
}
