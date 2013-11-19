package scp;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import scp.blocks.SCPBlockTab;
import scp.config.SCPBlocks;
import scp.entities.SCPEntity015Boss;
import scp.entities.SCPEntity015Projectile;
import scp.entities.SCPEntity019n2;
import scp.entities.SCPEntity023;
import scp.entities.SCPEntity049;
import scp.entities.SCPEntity053;
import scp.entities.SCPEntity058;
import scp.entities.SCPEntity073;
import scp.entities.SCPEntity076;
import scp.entities.SCPEntity080;
import scp.entities.SCPEntity087;
import scp.entities.SCPEntity096Cry;
import scp.entities.SCPEntity096Docile;
import scp.entities.SCPEntity096Mad;
import scp.entities.SCPEntity1000;
import scp.entities.SCPEntity106;
import scp.entities.SCPEntity111;
import scp.entities.SCPEntity131;
import scp.entities.SCPEntity173;
import scp.entities.SCPEntity217Cow;
import scp.entities.SCPEntity217Creeper;
import scp.entities.SCPEntity217Pig;
import scp.entities.SCPEntity217Spider;
import scp.entities.SCPEntity217Testificate;
import scp.entities.SCPEntity217Zombie;
import scp.entities.SCPEntity273;
import scp.entities.SCPEntity280;
import scp.entities.SCPEntity372;
import scp.entities.SCPEntity457;
import scp.entities.SCPEntity472;
import scp.entities.SCPEntity50AEJ;
import scp.entities.SCPEntity513;
import scp.entities.SCPEntity538;
import scp.entities.SCPEntity594;
import scp.entities.SCPEntity594Naked;
import scp.entities.SCPEntity629;
import scp.entities.SCPEntity682;
import scp.entities.SCPEntity872;
import scp.entities.SCPEntity966;
import scp.entities.SCPEntity997;
import scp.entities.SCPEntity999;
import scp.entities.SCPEntityClassD027;
import scp.entities.SCPEntityClassDGuy;
import scp.entities.SCPEntityMountableBlock;
import scp.entities.SCPEntityRat;
import scp.entities.SCPEntityReal682;
import scp.guis.SCPGuiHandler;
import scp.items.SCPDocumentItems;
import scp.items.SCPItem002;
import scp.items.SCPItem006;
import scp.items.SCPItem009;
import scp.items.SCPItem015;
import scp.items.SCPItem019;
import scp.items.SCPItem023;
import scp.items.SCPItem027;
import scp.items.SCPItem049;
import scp.items.SCPItem053;
import scp.items.SCPItem058;
import scp.items.SCPItem073;
import scp.items.SCPItem076;
import scp.items.SCPItem079;
import scp.items.SCPItem080;
import scp.items.SCPItem087;
import scp.items.SCPItem096;
import scp.items.SCPItem1000;
import scp.items.SCPItem106;
import scp.items.SCPItem111;
import scp.items.SCPItem131;
import scp.items.SCPItem143;
import scp.items.SCPItem151;
import scp.items.SCPItem173;
import scp.items.SCPItem261;
import scp.items.SCPItem273;
import scp.items.SCPItem280;
import scp.items.SCPItem294;
import scp.items.SCPItem310;
import scp.items.SCPItem354;
import scp.items.SCPItem372;
import scp.items.SCPItem409;
import scp.items.SCPItem457;
import scp.items.SCPItem472;
import scp.items.SCPItem513;
import scp.items.SCPItem538;
import scp.items.SCPItem594;
import scp.items.SCPItem629;
import scp.items.SCPItem682;
import scp.items.SCPItem789J;
import scp.items.SCPItem822;
import scp.items.SCPItem872;
import scp.items.SCPItem914;
import scp.items.SCPItem966;
import scp.items.SCPItem997;
import scp.items.SCPItem999;
import scp.items.SCPItemArmorSpawns;
import scp.items.SCPItemDescription;
import scp.items.SCPItemsTab;
import scp.recipes.SCPDocumentManager;
import scp.recipes.SCPRecipes;
import scp.recipes.SCPRecipes000J;
import scp.renders.SCPRender019;
import scp.renders.SCPRender261;
import scp.renders.SCPRender294;
import scp.renders.SCPRenderRemoteDoorComp;
import scp.renders.SCPRenderShelf;
import scp.tileentities.SCPTileEntity015;
import scp.tileentities.SCPTileEntity019;
import scp.tileentities.SCPTileEntity076;
import scp.tileentities.SCPTileEntity079;
import scp.tileentities.SCPTileEntity151;
import scp.tileentities.SCPTileEntity261;
import scp.tileentities.SCPTileEntity294;
import scp.tileentities.SCPTileEntity914;
import scp.tileentities.SCPTileEntityAlarm;
import scp.tileentities.SCPTileEntityFlesh;
import scp.tileentities.SCPTileEntityRemoteDoorComp;
import scp.tileentities.SCPTileEntityShelf;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = SCP.modid, name = "SCPCraft", version = "1.4")
@NetworkMod(clientSideRequired=true, serverSideRequired=false,
clientPacketHandlerSpec =
@SidedPacketHandler(channels = {"SCPCraft" }, packetHandler = SCPClientPacketHandler.class),
serverPacketHandlerSpec =
@SidedPacketHandler(channels = {"SCPCraft" }, packetHandler = SCPServerPacketHandler.class))
/*
 *  SCPCraft made by Phuck_Yu_Too (www.youtube.com/superbowserfreak11)
 */

public class SCP
{
	public static final String modid = "SCPCraft";
	public static String SCPCraftVersion = "SCPCraft v1.3 [1.5.2]";

	// Textures
	public static int Safe = 253;
	public static int Euclid = 254;
	public static int Keter = 255;

	//Misc
	public static boolean isActive = true;
	public World worldObj;
	private SCPGuiHandler guiHandler = new SCPGuiHandler();		
	public static final CreativeTabs tabBlockSCP = new SCPBlockTab(12, "scp");
	public static final CreativeTabs tabItemSCP = new SCPItemsTab(13, "scp");
	public static final CreativeTabs tabSCP = new SCPCreativeTab(14, "scp");
	public static final CreativeTabs tabCupsSCP = new SCPCupsTab(15, "scp");

	//StepSounds
	public static final SCPStepSoundPocketDimension soundPDFootstep = new SCPStepSoundPocketDimension("pocketDimension", 1.0F, 1F);

	//WorldTypes
	// public static final WorldType SCP167 = new SCPWorldType167(4, "SCP-167");

	//Blocks

	//Items

	//Spawner Documents
	public static final Item SCP173S = (new SCPItem173(5000).setUnlocalizedName("SCP173S"));
	public static final Item SCP111S = (new SCPItem111(5001).setUnlocalizedName("SCP111S"));
	public static final Item SCP914S = (new SCPItem914(5002).setUnlocalizedName("SCP914S"));
	public static final Item SCP019S = (new SCPItem019(5003).setUnlocalizedName("SCP019S"));
	public static final Item SCP457S = (new SCPItem457(5004).setUnlocalizedName("SCP457S"));
	public static final Item SCP294S = (new SCPItem294(5005).setUnlocalizedName("SCP294S"));
	public static final Item SCP513S = (new SCPItem513(5006).setUnlocalizedName("SCP513S"));
	public static final Item SCP049S = (new SCPItem049(5007).setUnlocalizedName("SCP049S"));
	public static final Item SCP087S = (new SCPItem087(5008).setUnlocalizedName("SCP087S"));
	public static final Item SCP1000S = (new SCPItem1000(5009).setUnlocalizedName("SCP1000S"));
	public static final Item SCP131S = (new SCPItem131(5010).setUnlocalizedName("SCP131S"));
	public static final Item SCP999S = (new SCPItem999(5011).setUnlocalizedName("SCP999S"));
	public static final Item SCP261S = (new SCPItem261(5012).setUnlocalizedName("SCP261S"));
	public static final Item SCP629S = (new SCPItem629(5013).setUnlocalizedName("SCP629S"));
	public static final Item SCP354S = (new SCPItem354(5014).setUnlocalizedName("SCP354S"));
	public static final Item SCP096S = (new SCPItem096(5015).setUnlocalizedName("SCP096S"));
	public static final Item SCP538S = (new SCPItem538(5016).setUnlocalizedName("SCP538S"));
	public static final Item SCP106S = (new SCPItem106(5017).setUnlocalizedName("SCP106S"));
	public static final Item SCP080S = (new SCPItem080(5018).setUnlocalizedName("SCP080S"));
	public static final Item SCP280S = (new SCPItem280(5019).setUnlocalizedName("SCP280S"));
	public static final Item SCP409S = (new SCPItem409(5020).setUnlocalizedName("SCP409S"));
	public static final Item SCP310S = (new SCPItem310(5021).setUnlocalizedName("SCP310S"));
	public static final Item SCP594S = (new SCPItem594(5022).setUnlocalizedName("SCP594S"));
	public static final Item SCP143S = (new SCPItem143(5023).setUnlocalizedName("SCP143S"));
	public static final Item SCP058S = (new SCPItem058(5024).setUnlocalizedName("SCP058S"));
	public static final Item SCP966S = (new SCPItem966(5025).setUnlocalizedName("SCP966S"));
	public static final Item SCP872S = (new SCPItem872(5026).setUnlocalizedName("SCP872S"));
	public static final Item SCP006S = (new SCPItem006(5027).setUnlocalizedName("SCP006S"));
	//	public static final Item SCP1440S = (new SCPItem1440(5028).setUnlocalizedName("SCP1440S"));
	public static final Item SCP789JS = (new SCPItem789J(5029).setUnlocalizedName("SCP789JS"));
	public static final Item SCP015S = (new SCPItem015(5030).setUnlocalizedName("SCP015S"));
	public static final Item SCP053S = (new SCPItem053(5031).setUnlocalizedName("SCP053S"));
	public static final Item SCP073S = (new SCPItem073(5032).setUnlocalizedName("SCP073S"));
	public static final Item SCP027S = (new SCPItem027(5033).setUnlocalizedName("SCP027S"));
	public static final Item SCP076S = (new SCPItem076(5034).setUnlocalizedName("SCP076S"));
	public static final Item SCP997S = (new SCPItem997(5035).setUnlocalizedName("SCP997S"));
	public static final Item SCP079S = (new SCPItem079(5036).setUnlocalizedName("SCP079S"));
	public static final Item SCP372S = (new SCPItem372(5037).setUnlocalizedName("SCP372S"));
	public static final Item SCP151S = (new SCPItem151(5038).setUnlocalizedName("SCP151S"));
	public static final Item SCP472S = (new SCPItem472(5039).setUnlocalizedName("SCP472S"));
	//	public static final Item SCP846S = (new SCPItem846(5040).setUnlocalizedName("SCP846S"));
	public static final Item SCP273S = (new SCPItem273(5041).setUnlocalizedName("SCP273S"));
	public static final Item SCP002S = (new SCPItem002(5042).setUnlocalizedName("SCP002S"));
	public static final Item SCP822S = (new SCPItem822(5043).setUnlocalizedName("SCP822S"));
	public static final Item SCP023S = (new SCPItem023(5044).setUnlocalizedName("SCP023S"));
	public static final Item SCP009S = (new SCPItem009(5045).setUnlocalizedName("SCP009S"));
	public static final Item SCP682S = (new SCPItem682(5046).setUnlocalizedName("SCP682S"));
	public static final Item SCP500S = (new SCPDocumentItems(5047, "SCP-500", "Panacea", "\u00a72", 1, SCP500G, 16).setUnlocalizedName("SCP500S"));
	public static final Item SCP063S = (new SCPDocumentItems(5048, "SCP-063", "The World's Best TothBrush", "\u00a72", 1, TothBrush, 1).setUnlocalizedName("SCP063S"));
	public static final Item SCP1025S = (new SCPDocumentItems(5049, "SCP-1025", "Encyclopedia of Diseases", "\u00a72", 1, SCP1025, 1).setUnlocalizedName("SCP1025S"));
	public static final Item SCP109S = (new SCPDocumentItems(5050, "SCP-109", "Infinite Canteen", "\u00a7e", 2, SCP109, 1).setUnlocalizedName("SCP109S"));
	public static final Item SCP50AEJS = (new SCPDocumentItems(5051, "SCP-50-AE-J", "The Deagle", "\u00a7e", 2, SCP50AEJ, 1).setUnlocalizedName("SCP50AEJS"));
	public static final Item SCP420JS = (new SCPDocumentItems(5052, "SCP-420-J", "The Best \u00a7kShit \u00a77in the World", "\u00a72", 1, SCP420J, 2).setUnlocalizedName("SCP420JS"));
	public static final Item SCP458S = (new SCPDocumentItems(5053, "SCP-458", "The Never-Ending Pizza Box", "\u00a72", 1, SCP458, 1).setUnlocalizedName("SCP458S"));
	public static final Item SCP217S = (new SCPDocumentItems(5054, "SCP-217", "The Clockwork Virus", "\u00a74", 3, SCP217, 1).setUnlocalizedName("SCP217S"));
	public static final Item SCP912S = (new SCPItemArmorSpawns(5055, "SCP-912", "Autonomous SWAT Armor", "\u00a72", 1, SCP912Head, SCP912Shirt, SCP912Pants, SCP912Shoes, 1).setUnlocalizedName("SCP912HS"));

	//Pearls
	
	public static final Item SCPItems = (new SCPItemDescription(6046).setUnlocalizedName("SCPItems"));

	//Drinks

	//Achievements
	//TODO

	@Instance
	public static SCP instance = new SCP();
	public static CommonProxy proxy;

	private static float zLevel;

	//ModLoader Functions
	@Init
	public void load(FMLInitializationEvent event)
	{
		zLevel = -90F;

		MinecraftForge.EVENT_BUS.register(new SCPCraft_EventSounds());

		NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
		//RegisterEntityID		
		registerSCP(SCPEntity111.class, "SCP-111", EntityRegistry.findGlobalUniqueEntityId(), 0x00CC00, 0x77FF49);
		registerSCP(SCPEntityClassDGuy.class, "Class-D Guy", EntityRegistry.findGlobalUniqueEntityId(), 0xFF6600, 0x000000);
		registerSCP(SCPEntity019n2.class, "SCP-019-2", EntityRegistry.findGlobalUniqueEntityId(), 0xFFDA91, 0xFFFCFC);
		registerSCP(SCPEntity457.class, "SCP-457", EntityRegistry.findGlobalUniqueEntityId(), 0xFF0000, 0xFF6600);
		registerSCP(SCPEntity513.class, "SCP-513", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xFF0905);
		registerSCP(SCPEntity087.class, "SCP-087", EntityRegistry.findGlobalUniqueEntityId(), 0xFFFFFF, 0xE0E0E0);
		registerSCP(SCPEntity049.class, "SCP-049", EntityRegistry.findGlobalUniqueEntityId(), 0x550000, 0xffffff);
		registerSCP(SCPEntity217Zombie.class, "Zomborg", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x00CC00);
		registerSCP(SCPEntity217Creeper.class, "CreeperDrone", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x00CC00);
		registerSCP(SCPEntity131.class, "SCP-131", EntityRegistry.findGlobalUniqueEntityId(), 0xFF0000, 0xFFFF00);
		registerSCP(SCPEntity999.class, "SCP-999", EntityRegistry.findGlobalUniqueEntityId(), 0xFF6600, 0xFF780A);
		registerSCP(SCPEntity629.class, "SCP-629", EntityRegistry.findGlobalUniqueEntityId(), 0x8B5A00, 0x8B7500);
		registerSCP(SCPEntity096Docile.class, "SCP-096 Docile", EntityRegistry.findGlobalUniqueEntityId(), 0xFFC4CC, 0x99D9FF);
		registerSCP(SCPEntity096Cry.class, "SCP-096 Crying", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
		registerSCP(SCPEntity096Mad.class, "SCP-096", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
		registerSCP(SCPEntity217Cow.class, "Cowborg", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x999999);
		registerSCP(SCPEntity538.class, "SCP-538", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x494C48);
		registerSCP(SCPEntity106.class, "SCP-106", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x442F1F);
		registerSCP(SCPEntity080.class, "SCP-080", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x555656);
		registerSCP(SCPEntity280.class, "SCP-280", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x8E8D8B);
		registerSCP(SCPEntity594.class, "SCP-594", EntityRegistry.findGlobalUniqueEntityId(), 0x3F0E0B, 0xFFEFE2);
		registerSCP(SCPEntity594Naked.class, "SCP-594Naked", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
		registerSCP(SCPEntity058.class, "SCP-058", EntityRegistry.findGlobalUniqueEntityId(), 0x990000, 0x330000);
		registerSCP(SCPEntity966.class, "SCP-966", EntityRegistry.findGlobalUniqueEntityId(), 0xFFDA91, 0xFFFCFC);
		registerSCP(SCPEntity872.class, "SCP-872", EntityRegistry.findGlobalUniqueEntityId(), 0x555656, 0x5E594D);
		//registerSCP(SCPEntity1440.class, "SCP-1440", EntityRegistry.findGlobalUniqueEntityId(), 0xFFD3A8, 0x555656);
		registerSCP(SCPEntity50AEJ.class, "SCP-50-AE-J", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
		registerSCP(SCPEntity1000.class, "SCP-1000", EntityRegistry.findGlobalUniqueEntityId(), 0x550000, 0xFFDA91);
		registerSCP(SCPEntity053.class, "SCP-053", EntityRegistry.findGlobalUniqueEntityId(), 0xFFEB16, 0xA90AFF);
		registerSCP(SCPEntityClassD027.class, "Class-D Guy 027", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
		registerSCP(SCPEntity997.class, "SCP-997", EntityRegistry.findGlobalUniqueEntityId(), 0x8B5A00, 0x8B7500);
		//registerSCP(SCPEntity222Clone.class, "SCP-222 Clone", 70, 0x000000, 0x000000);
		registerSCP(SCPEntity217Testificate.class, "Testifinator", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x999999);
		registerSCP(SCPEntity372.class, "SCP-372", EntityRegistry.findGlobalUniqueEntityId(), 0x00CC00, 0x00CC00);
		//registerSCP(SCPEntity846.class, "SCP-846", 73, 0x999999, 0x000000);
		registerSCP(SCPEntity472.class, "SCP-472", EntityRegistry.findGlobalUniqueEntityId(), 0xFF0000, 0x820e03);
		registerSCP(SCPEntity273.class, "SCP-273", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xffffff);
		registerSCP(SCPEntity015Boss.class, "The Pipe Boss", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x000000);
		registerSCP(SCPEntity015Projectile.class, "SCP-015projectile", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
		registerSCP(SCPEntity217Pig.class, "Pigbot", EntityRegistry.findGlobalUniqueEntityId(), 0xFF9999, 0x999999);
		registerSCP(SCPEntity217Spider.class, "Spitron", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x999999);
		registerSCP(SCPEntity073.class, "SCP-073", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xffffff);
		registerSCP(SCPEntity076.class, "SCP-076", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xffffff);
		registerSCP(SCPEntityRat.class, "Rat", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xFFDA91);
		registerSCP(SCPEntity173.class, "SCP-173", EntityRegistry.findGlobalUniqueEntityId(), 0xFEF2BF, 0x2BC600);
		registerSCP(SCPEntity023.class, "SCP-023", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x000000);
		registerSCP(SCPEntity682.class, "SCP-682", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0x000000);
		registerSCP(SCPEntityReal682.class, "SCP-682Real", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);
		//registerSCP(SCPEntityButler.class, "Butler", EntityRegistry.findGlobalUniqueEntityId(), -1, -1);

		//Register mod entities
		EntityRegistry.registerModEntity(SCPEntityMountableBlock.class, "SCPEntityMountableBlock", EntityRegistry.findGlobalUniqueEntityId(), this, 250, 5, false);

		RegisterItemDocumentNames(new String[]{
				"SCP-500", "SCP-063", "SCP-1025", "SCP-109", "SCP-50-AE-J", "SCP-420-J", "SCP-458", "SCP-217", "SCP-912"
		});

		RegisterPearl(new Item[]{
				Pearl273, Pearl372, Pearl151, Pearl472, Pearl079, Pearl997, Pearl076, Pearl027, Pearl073, Pearl053, Pearl015, Pearl789J, Pearl872, Pearl966, Pearl058, 
				Pearl310, Pearl409, Pearl594, Pearl143, Pearl280, Pearl080, Pearl106, Pearl538, Pearl079, Pearl629, Pearl087, Pearl173, Pearl111, Pearl914, Pearl294,
				Pearl261, Pearl131, Pearl457, Pearl019, /*Pearl1440, */ Pearl1000, Pearl006, Pearl096, Pearl354, Pearl999, Pearl049, Pearl023, Pearl822, Pearl002, Pearl009
		});

		RegisterItemNames(new Item[]{
				BucketWater, Bucket354, Bucket006, SCP143Bucket, CupSlimeBall, CupBone, SCP000J, Record173, Record106, VirusTestificate, GasMask,
				ClassDShirt, ClassDPants, ClassDShoes, Item019, Item294, Item261, SCP458, SCP912Head, SCP912Pants, SCP912Shoes, SCP912Shirt, SCP217,
				VirusPig, VirusZombie, VirusSpider, VirusCreeper,	Wrench, VirusCow, L1Keycard, L2Keycard, L3Keycard, OmniKeycard,
				SCP500G, SCP500B, SCP427, GodlyWrench, SCP420J, TothBrush, SCP143Pickaxe, SCP143Spade, SCP143Sword, SCP143Axe, CorrodedDoorItem, InfraRedGlasses,
				SCP50AEJ, SCP1025, SCP109, SlideDoorItem, ItemSCPPoster, Circuit, CupEmpty, CupMycelium, CupNetherrack, CupGlowstone, CupCoal, CupAppleGold,
				CupGold, CupSlowSand, CupCactus, CupObsidian, CupSpiderEye, CupFeather,	CupGlass, CupPumpkin, CupApple, CupStone, CupClay, CupSugar, CupRottenFlesh,
				CupIron, CupDiamond, CupRedstone, CupCobweb, CupBone, CupBlood,	SCP1023ARC, Pearl513, Record789J, Record173E, Record914, Record079, /*SCP662 */
		});

		RegisterDocumentNames(new Item[]{
				SCP822S, SCP002S, SCP273S, SCP151S, SCP076S, SCP079S, SCP372S, SCP472S,	SCP997S, SCP027S, SCP015S, SCP073S,	SCP053S, SCP789JS, /*SCP1440S, */SCP1000S,
				SCP006S, SCP058S, SCP966S, SCP143S,	SCP106S, SCP280S, SCP080S, SCP173S,	SCP914S, SCP872S, SCP409S, SCP310S,	SCP087S, SCP049S, SCP019S, SCP294S,
				SCP261S, SCP111S, SCP457S, SCP131S,	SCP513S, SCP999S, SCP096S, SCP629S,	SCP538S, SCP594S, SCP354S, SCP023S, SCP009S, SCP682S, SCP500S, SCP109S,
				SCP063S, SCP458S, SCP50AEJS, SCP420JS, SCP217S, SCP1025S, SCP912S
		});

		RegisterBlocks(new Block[]{
				BloodBlock, Locker, SCP914, DocumentTable, Machinery, SCP019, SCP294, SCP261, SCP354Still, SCP354Flowing, KeycardSlot, KeycardSlotLv2, KeycardSlotLv3, 
				KeycardSlotOmni, SmokeBlock, CorrodedIron, SCPspawner, Granite, SCP409, SCP310, SCP310Fire, ElectricWool, SCP143Leaves, SCP143Log, SCP143Sapling, 
				SCP143Planks, CorrodedDoor, SCP006Still, SCP006Flowing, SCP789J, SCP015, SlidingDoor, GrateBlock, SCP079, SCP076, Shelf, Poster, SCP151, RemoteDoorComputer, 
				SCP273, Flesh, Bone, SCP822, SCP822Grown, SCP009, Toilet, Alarm, stoneDesk, woodDesk, graniteDesk, marbleDesk, Marble, marbleChair, woodenChair, stoneChair, 
				SCP513, OakShelf, SpruceShelf, BirchShelf, JungleShelf
		});

		RegisterPosters(new Block[]{
				Poster173, Poster106, Poster914, Poster372, Poster079
		});

		//addLocalization - potions, deaths, keys, itemgroups, gui
		ModLoader.addLocalization("potion.crystal", "SCP-409");
		ModLoader.addLocalization("potion.electric", "Electricity");
		ModLoader.addLocalization("potion.shake", "Scare");
		ModLoader.addLocalization("potion.bloodstone", "Bloodstone");
		ModLoader.addLocalization("potion.control", "SCP-872");
		ModLoader.addLocalization("potion.vermin", "Vermin God");
		ModLoader.addLocalization("potion.sticky", "Sticky");
		ModLoader.addLocalization("potion.skeleton", "Skeleton King");
		ModLoader.addLocalization("potion.eat", "SCP-002");
		ModLoader.addLocalization("death.crystal", "%1$s got crystalized by SCP-409");
		ModLoader.addLocalization("death.bloodstone", "%1$s has gone mad");
		ModLoader.addLocalization("death.pipeBoss", "%1$ss got piped");
		ModLoader.addLocalization("death.ghost", "%1$ss butt got eaten");
		ModLoader.addLocalization("death.electricity", "%1$s got electrocuted");
		ModLoader.addLocalization("death.143", "%1$s got cut in SCP-143");
		ModLoader.addLocalization("death.106", "%1$s rotted away from SCP-106");
		ModLoader.addLocalization("death.023", "%1$s got stared to death by SCP-023");
		ModLoader.addLocalization("death.682", "%1$s got squashed by SCP-682");
		ModLoader.addLocalization("death.073", "%1$s got countered by SCP-073");
		ModLoader.addLocalization("death.002", "%1$s got eaten by SCP-002");
		ModLoader.addLocalization("key.blink", "Blink");
		ModLoader.addLocalization("key.Activate", "Blink Activation");
		ModLoader.addLocalization("key.doors", "Remote Doors");
		ModLoader.addLocalization("gui.scpachievements", "SCPCraft");

		//Achievements
		SCPAchievementHandler.init();

		//Misc
		ModLoader.registerTileEntity(SCPTileEntity914.class, "SCP-914");
		ModLoader.registerTileEntity(SCPTileEntity294.class, "SCP-294", new SCPRender294());
		ModLoader.registerTileEntity(SCPTileEntity019.class, "SCP-019", new SCPRender019());
		ModLoader.registerTileEntity(SCPTileEntity261.class, "SCP-261", new SCPRender261());	
		ModLoader.registerTileEntity(SCPTileEntity076.class, "SCP-076-1");
		ModLoader.registerTileEntity(SCPTileEntityShelf.class, "Shelf", new SCPRenderShelf());
		ModLoader.registerTileEntity(SCPTileEntity151.class, "SCP-151");
		ModLoader.registerTileEntity(SCPTileEntity015.class, "SCP-015");
		ModLoader.registerTileEntity(SCPTileEntityRemoteDoorComp.class, "RemoteDoorComp", new SCPRenderRemoteDoorComp());
		ModLoader.registerTileEntity(SCPTileEntity079.class, "SCP-079");
		ModLoader.registerTileEntity(SCPTileEntityAlarm.class, "Alarm");
		ModLoader.registerTileEntity(SCPTileEntityFlesh.class, "Flesh");

		SCPRecipes000J.getInstance();
		SCPDocumentManager.getInstance();
		SCPRecipes.recipes();
	}

	//Version
	public String getVersion()
	{
		return SCPCraftVersion;
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{	
		SCPBlocks.init();
		MinecraftForge.EVENT_BUS.register(new SCPCraft_EventSounds());
		NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
		TickRegistry.registerTickHandler(new SCPClientTickHandler(), Side.CLIENT);
	}


	@PostInit
	public void PostInit(FMLPostInitializationEvent event)
	{
		NetworkRegistry.instance().registerGuiHandler(this, guiHandler);
	}

	private void registerSCP(Class<? extends Entity> cl, String name, int id, int background, int foreground) 
	{
		if(background != -1 && foreground != -1)EntityRegistry.registerGlobalEntityID(cl, name, id, background, foreground);
		else EntityRegistry.registerGlobalEntityID(cl, name, id);
		EntityRegistry.registerModEntity(cl, name, id, this, 80, 3, true);
		ModLoader.addLocalization("entity." + name + ".name", name);
	}

	private void RegisterBlocks(Block ablock []) 
	{
		Block ablock1[] = ablock;
		int i = ablock1.length;
		for(int j = 0; j < i; j++)
		{
			Block block = ablock1[j];
			GameRegistry.registerBlock(block);
			Block item = ablock1[j];
			String name = ablock[j].getUnlocalizedName();
			LanguageRegistry.addName(item, name.substring(5));
		}	
	}

	private void RegisterItemDocumentNames(String[] name) 
	{
		int i = name.length;
		for(int j = 0; j < i; j++)
		{
			LanguageRegistry.addName(new ItemStack(SCPItems, 1, j), name[j] + " Item Description");
		}	
	}

	private void RegisterItemNames(Item aitem[]) 
	{
		Item aitem1[] = aitem;
		int i = aitem1.length;
		for(int j = 0; j < i; j++)
		{
			Item item = aitem1[j];
			String name = aitem[j].getUnlocalizedName();
			LanguageRegistry.addName(item, name.substring(5));
		}	
	}

	private void RegisterPosters(Block ablock[])
	{
		Block ablock1[] = ablock;
		int i = ablock1.length;
		for(int j = 0; j < i; j++)
		{
			Block block = ablock1[j];
			LanguageRegistry.addName(block, "SCP Poster");
			GameRegistry.registerBlock(block);
		}	
	}

	private void RegisterPearl(Item aitem[])
	{
		Item aitem1[] = aitem;
		int i = aitem1.length;
		for(int j = 0; j < i; j++)
		{
			String name = aitem[j].getUnlocalizedName();
			Item item = aitem1[j];
			LanguageRegistry.addName(item, name.substring(5) + " Pearl");
		}	
	}

	private void RegisterDocumentNames(Item aitem []) 
	{
		Item aitem1[] = aitem;
		int i = aitem1.length;
		for(int j = 0; j < i; j++)
		{
			Item item = aitem1[j];
			LanguageRegistry.addName(item, "SCP Document");
		}	
	}

	public void baseFilesEdited()
	{
		/*
		 * v = updated; x = made our own file; all are in net.minecraft.*
		 * BlockCrops - *.block - v
		 * BlockPane - *.block - v
		 * ContainerPlayer - *.inventory - v
		 * EntityAnimal - *.entity.passive - v
		 * EntityAINearestAttackableTarget - *.entity.ai - v
		 * EntityCow - *.entity.passive - v
		 * EntityChicken - *.entity.passive - v
		 * EntityLiving - *.entity - v
		 * EntityPig - *.entity.passive - v
		 * EntityPlayer - *.entity.player - v
		 * EntityPlayerMP - *.entity.player - v
		 * EntityRenderer - *.client.renderer - v
		 * EntitySheep - *.entity.passive - v
		 * EntityOcelot - *.entity.passive - v
		 * EntityWolf - *.entity.passive - v
		 * GuiContainerCreative - *.client.gui.inventory - v
		 * GuiInventory - *.client.gui.inventory - v
		 * InventoryEffectRenderer - *.client.renderer - v
		 * InventoryPlayer - *.entity.player - v
		 * Render - *.client.renderer.entity - v
		 * RenderBiped - *.client.renderer.entity - v
		 * RenderCreeper - *.client.renderer.entity - v
		 * RenderEnderman - *.client.renderer.entity - v
		 * RenderLiving - *.client.renderer.entity - v
		 * RenderPig - *.client.renderer.entity - v
		 * RenderPlayer - *.client.renderer.entity - v
		 * RenderSilverfish - *.client.renderer.entity - v
		 * RenderSlime - *.client.renderer.entity - v
		 * RenderSpider - *.client.renderer.entity - v
		 * RenderVillager - *.client.renderer.entity - v
		 * World - *.world - v
		 */
	}
}
