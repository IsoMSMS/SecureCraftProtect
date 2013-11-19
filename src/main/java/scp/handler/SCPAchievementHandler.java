package scp.handler;

import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import scp.config.SCPBlocks;
import scp.config.SCPItems;
import scp.config.SCPPearls;

public class SCPAchievementHandler
{
	public static Achievement achReinforcedIron, achCraftCrafter, achBreakSCP019, achClassD, achPizzaBreak, achClassDShirt, achClassDPants;
	public static Achievement achClassDBoots, achSCP629, achSCP457, achHealer, achHacker, achBrushYourToths;
	public static Achievement achNoSmoking, achPainKiller, achBestShit, achChallenge, achClassDNoob;
	public static Achievement achCainWin, achAbelWin, achSCP015, achPocketD;
	public static AchievementPage scpAchPage;
	static Achievement[] scpAchList;
	
	public SCPAchievementHandler(){
		super();
	}
	
	public static void init()
	{
		achReinforcedIron	= (new Achievement(1000, "achReinforcedIron",		 0,  0, SCPBlocks.blockLocker,			null)).setIndependent().registerAchievement();
		achCraftCrafter		= (new Achievement(1001, "achCraftCrafter",			 0, -1, SCPBlocks.blockDocumentTable,	achReinforcedIron)).registerAchievement();
		achBreakSCP019		= (new Achievement(1002, "achBreakSCP019",			 1,  1, SCPItems.itemItem019,			achCraftCrafter)).registerAchievement();
		achClassD			= (new Achievement(1003, "achClassD",				 1,  2, SCPItems.itemGasMask,			achCraftCrafter)).registerAchievement();
		achPizzaBreak		= (new Achievement(1004, "achPizzaBreak",			-1,  1, SCPItems.itemSCP458,			achCraftCrafter)).registerAchievement();
		achClassDShirt		= (new Achievement(1005, "achClassDShirt",			-1,  2, SCPItems.itemClassDShirt,		achReinforcedIron)).registerAchievement();
		achClassDPants		= (new Achievement(1006, "achClassDPants",			-2,  2, SCPItems.itemClassDPants,		achClassDShirt)).registerAchievement();
		achClassDBoots		= (new Achievement(1007, "achClassDBoots",			-3,  2, SCPItems.itemClassDShoes,		achClassDPants)).registerAchievement();
		achSCP629			= (new Achievement(1008, "achSCP629",				-1, -1, SCPPearls.itemPearl629,			achCraftCrafter)).registerAchievement();
		achSCP457			= (new Achievement(1009, "achSCP457",				-1, -2, SCPPearls.itemPearl457,			achCraftCrafter)).registerAchievement();
		achHealer			= (new Achievement(1010, "achHealer",				-1, -3, SCPPearls.itemPearl049,			achCraftCrafter)).registerAchievement();
		achHacker			= (new Achievement(1011, "achHacker",				 1, -1, SCPPearls.itemPearl079,			achCraftCrafter)).registerAchievement();
		achBrushYourToths	= (new Achievement(1012, "achBrushYourToths",		-1,  3, SCPItems.itemTothBrush,			achCraftCrafter)).registerAchievement();
		achNoSmoking		= (new Achievement(1013, "achNoSmoking",			 1,  3, SCPBlocks.blockSmokeBlock,		achCraftCrafter)).registerAchievement();
		achPainKiller		= (new Achievement(1014, "achPainKiller",			-1,  4, SCPItems.itemSCP500G,			achCraftCrafter)).registerAchievement();
		achBestShit			= (new Achievement(1015, "achBestShit",				 1,  4, SCPItems.itemSCP420J,			achCraftCrafter)).registerAchievement();
		achChallenge		= (new Achievement(1016, "achChallenge",			 1, -2, SCPPearls.itemPearl087,			achCraftCrafter)).registerAchievement();
		achClassDNoob		= (new Achievement(1017, "achClassDNoob",			 1,  5, SCPItems.itemL1Keycard,			achCraftCrafter)).registerAchievement();
		achCainWin			= (new Achievement(1018, "achCainWin",				 1, -3, SCPPearls.itemPearl073,			achCraftCrafter)).registerAchievement();
		achAbelWin			= (new Achievement(1019, "achAbelWin",				 1, -4, SCPPearls.itemPearl076,			achCraftCrafter)).registerAchievement();
		achSCP015			= (new Achievement(1020, "achSCP015",				-1, -4, SCPPearls.itemPearl015,			achCraftCrafter)).registerAchievement();
		achPocketD			= (new Achievement(1021, "achPocketD",				-2, -4, SCPPearls.itemPearl106,			achCraftCrafter)).registerAchievement();

		scpAchList = new Achievement[]{achReinforcedIron, achCraftCrafter, achBreakSCP019, achClassD, achPizzaBreak, achClassDShirt, achClassDPants, achClassDBoots, achSCP629, achSCP457, achHealer, achHacker, achBrushYourToths, achNoSmoking, achPainKiller, achBestShit, achChallenge, achClassDNoob, achCainWin, achAbelWin, achSCP015, achPocketD};

		scpAchPage = new AchievementPage("SCP Craft", scpAchList);
		AchievementPage.registerAchievementPage(scpAchPage);

	}
}
