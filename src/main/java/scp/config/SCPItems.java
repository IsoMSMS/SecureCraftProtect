package scp.config;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import scp.SCP;
import scp.SCPArmorMaterial;
import scp.SCPClassDItemArmor;
import scp.blocks.SCPBlockCustomWater.SCP006Flowing;
import scp.blocks.SCPBlockCustomWater.SCP354Flowing;
import scp.blocks.SCPBlockItem;
import scp.items.SCP143Bucket;
import scp.items.SCP217Cow;
import scp.items.SCP217Creeper;
import scp.items.SCP217Pig;
import scp.items.SCP217Spider;
import scp.items.SCP217Testificate;
import scp.items.SCP217Zombie;
import scp.items.SCPItem000J;
import scp.items.SCPItem1023ARC;
import scp.items.SCPItem1025;
import scp.items.SCPItem109;
import scp.items.SCPItem143Axe;
import scp.items.SCPItem143PickAxe;
import scp.items.SCPItem143Spade;
import scp.items.SCPItem143Sword;
import scp.items.SCPItem217;
import scp.items.SCPItem420J;
import scp.items.SCPItem458;
import scp.items.SCPItem500;
import scp.items.SCPItem50AEJ;
import scp.items.SCPItemCorrodedDoor;
import scp.items.SCPItemInfraRedGlasses;
import scp.items.SCPItemJewelry;
import scp.items.SCPItemL1Keycard;
import scp.items.SCPItemObject;
import scp.items.SCPItemPoster;
import scp.items.SCPItemRecord;
import scp.items.SCPItemSlideDoor;
import scp.items.SCPItemTothBrush;
import scp.items.SCPItemWrench;

public class SCPItems
{
	public static Item itemGasMask;
	public static Item itemClassDShirt;
	public static Item itemClassDPants;
	public static Item itemClassDShoes;
	public static Item itemItem019;
	public static Item itemItem294;
	public static Item itemSCP458;
	public static Item itemSCP912Head;
	public static Item itemSCP912Shirt;
	public static Item itemSCP912Pants;
	public static Item itemSCP912Shoes;
	public static Item itemSCP217;
	public static Item itemVirusPig;
	public static Item itemVirusSpider;
	public static Item itemVirusZombie;
	public static Item itemItem261;
	public static Item itemWrench;
	public static Item itemVirusCow;
	public static Item itemL1Keycard;
	public static Item itemL2Keycard;
	public static Item itemL3Keycard;
	public static Item itemOmniKeycard;
	public static Item itemSCP500G;
	public static Item itemSCP500B;
	public static Item itemGodlyWrench;
	public static Item itemSCP420J;
	public static Item itemTothBrush;
	public static SCPItemJewelry itemSCP427;
	public static Item itemSCP143Pickaxe;
	public static Item itemSCP143Spade;
	public static Item itemSCP143Sword;
	public static Item itemSCP143Axe;
	public static Item itemSCP1023ARC;
	public static Item itemCorrodedDoorItem;
	public static Item itemInfraRedGlasses;
	public static Item itemSCP50AEJ;
	public static Item itemVirusCreeper;
	public static Item itemSCP1025;
	public static Item itemSlideDoorItem;
	public static Item itemSCP109;
	public static Item itemItemSCPPoster;
	public static Item itemRecord173;
	public static Item itemCircuit;
	public static Item itemVirusTestificate;
	public static Item itemRecord106;
	public static Item itemSCP000J;
	public static SCP143Bucket itemSCP143Bucket;
	public static Item itemBucket006;
	public static Item itemBucket354;
	public static Item itemBucketWater;
	public static Item itemRecord914;
	public static Item itemRecord173E;
	public static Item itemRecord789J;
	public static Item itemRecord079;
	public static EnumToolMaterial SCP143;
	public static EnumArmorMaterial ClassD, SCP912;
	public SCPItems()
	{
		super();
	}
	
	public static void init()
	{
		SCP143 = EnumHelper.addToolMaterial("SCP143",	500, 10, 17F, 4, 12);
		ClassD = EnumHelper.addArmorMaterial("ClassD",	 29, (new int[] { 2,  7,  5,  3}),   9); 
		SCP912 = EnumHelper.addArmorMaterial("SCP912",	500, (new int[] {40, 90, 70, 50}), 100);

	}
	
	public static void initItems()
	{
		itemGasMask			= (new SCPClassDItemArmor(8000, ClassD, ModLoader.addArmor("classd"), 0, SCP.tabItemSCP)).setUnlocalizedName("Gas Mask");
		itemClassDShirt		= (new SCPClassDItemArmor(8001, ClassD, ModLoader.addArmor("classd"), 1, SCP.tabItemSCP)).setUnlocalizedName("Class-D Shirt");
		itemClassDPants		= (new SCPClassDItemArmor(8002, ClassD, ModLoader.addArmor("classd"), 2, SCP.tabItemSCP)).setUnlocalizedName("Class-D Panties");
		itemClassDShoes		= (new SCPClassDItemArmor(8003, ClassD, ModLoader.addArmor("classd"), 3, SCP.tabItemSCP)).setUnlocalizedName("Class-D Boots");
		itemItem019			= (new SCPBlockItem(8004, SCP019)).setUnlocalizedName("Monster Pot");
		itemItem294			= (new SCPBlockItem(8005, SCP294)).setUnlocalizedName("SCP-294 Item");
		itemSCP458 = (new SCPItem458(8006, 0, 0, false).setAlwaysEdible().setUnlocalizedName("SCP-458"));
		itemSCP912Head = (new SCPClassDItemArmor(8007,SCPArmorMaterial.SCP912, ModLoader.addArmor("912"), 0, SCP.tabSCP)).setUnlocalizedName("SCP-912 Helmet");
		itemSCP912Shirt = (new SCPClassDItemArmor(8008,SCPArmorMaterial.SCP912, ModLoader.addArmor("912"), 1, SCP.tabSCP)).setUnlocalizedName("SCP-912 Shirt");
		itemSCP912Pants = (new SCPClassDItemArmor(8009,SCPArmorMaterial.SCP912, ModLoader.addArmor("912"), 2, SCP.tabSCP)).setUnlocalizedName("SCP-912 Pants");
		itemSCP912Shoes = (new SCPClassDItemArmor(8010,SCPArmorMaterial.SCP912, ModLoader.addArmor("912"), 3, SCP.tabSCP)).setUnlocalizedName("SCP-912 Shoes");
		itemSCP217 = (new SCPItem217(8011, -1).setUnlocalizedName("SCP-217"));
		itemVirusPig = (new SCP217Pig(8012, 0xff7f7f).setUnlocalizedName("Pig DNA With Clockwork Virus"));
		itemVirusSpider = (new SCP217Spider(8013, 0x3e0000).setUnlocalizedName("Spider DNA With Clockwork Virus"));
		itemVirusZombie = (new SCP217Zombie(8014, 0x0c5900).setUnlocalizedName("Zombie DNA With Clockwork Virus"));
		itemItem261 = (new SCPBlockItem(8015, SCP261)).setUnlocalizedName("SCP-261 Item");
		itemWrench = (new SCPItemWrench(8016, 0).setUnlocalizedName("Wrench"));
		itemVirusCow = (new SCP217Cow(8017, 0x7f3300).setUnlocalizedName("Cow DNA With Clockwork Virus"));
		itemL1Keycard = (new SCPItemL1Keycard(8018).setUnlocalizedName("\u00a7eKeycard Lv1"));
		itemL2Keycard = (new SCPItemL1Keycard(8019).setUnlocalizedName("\u00a76Keycard Lv2"));
		itemL3Keycard = (new SCPItemL1Keycard(8020).setUnlocalizedName("\u00a74Keycard Lv3"));
		itemOmniKeycard = (new SCPItemL1Keycard(8021).setUnlocalizedName("\u00a79Omni Keycard"));		
		itemSCP500G = (new SCPItem500(8022, 0, 20).setUnlocalizedName("SCP-500").setMaxStackSize(16));
		itemSCP500B = (new SCPItem500(8023, 1, 0).setUnlocalizedName("SCP-500").setMaxStackSize(1));
		itemGodlyWrench = (new SCPItemWrench(8024, 1).setUnlocalizedName("Wrench"));
		itemSCP420J = (new SCPItem420J(8025).setUnlocalizedName("SCP-420-J"));
		itemTothBrush = (new SCPItemTothBrush(8026, EnumToolMaterial.EMERALD).setUnlocalizedName("SCP-063"));
		itemSCP427 = (SCPItemJewelry) (new SCPItemJewelry(8027, 1, 500, true, EnumRarity.rare).setUnlocalizedName("SCP-427"));
		itemSCP143Pickaxe = (new SCPItem143PickAxe(8028, SCP143)).setUnlocalizedName("SCP-143 Pickaxe");
		itemSCP143Spade = (new SCPItem143Spade(8029, SCP143)).setUnlocalizedName("SCP-143 Spade");
		itemSCP143Sword = (new SCPItem143Sword(8030, SCP143)).setUnlocalizedName("SCP-143 Sword");
		itemSCP143Axe = (new SCPItem143Axe(8031, SCP143)).setUnlocalizedName("SCP-143 Axe");
		itemSCP1023ARC = (new SCPItem1023ARC(8032).setUnlocalizedName("SCP-1023-ARC"));
		itemCorrodedDoorItem = (new SCPItemCorrodedDoor(8033, Material.iron).setUnlocalizedName("Corroded Iron Door"));
		itemInfraRedGlasses = (new SCPItemInfraRedGlasses(8034,SCPArmorMaterial.ClassD, ModLoader.addArmor("infrared"), 0)).setUnlocalizedName("Infrared Glasses");
		itemSCP50AEJ = (new SCPItem50AEJ(8035).setUnlocalizedName("SCP-50-AE-J"));
		itemVirusCreeper = (new SCP217Creeper(8036, 0x00b60e).setUnlocalizedName("Creeper DNA With Clockwork Virus"));
		itemSCP1025 = (new SCPItem1025(8037).setUnlocalizedName("SCP-1025"));
		itemSlideDoorItem = (new SCPItemSlideDoor(8038, Material.iron).setUnlocalizedName("Sliding Door"));
		itemSCP109 = (new SCPItem109(8039).setUnlocalizedName("SCP-109"));
		itemItemSCPPoster = (new SCPItemPoster(8040).setUnlocalizedName("SCP Poster"));
		itemCircuit = new SCPItemObject(8041).setUnlocalizedName("Circuit");
		itemVirusTestificate = new SCP217Testificate(8042, 0xc18f66).setUnlocalizedName("Testificate DNA With Clockwork Virus");
		//itemAtomicGrenade = new SCPItemAtomicGrenade(8043).10).setUnlocalizedName("Throwing");
		itemRecord106 = (new SCPItemRecord(8044, "106", "GlennLeroi").setUnlocalizedName("SCP Record"));
		itemRecord173 = (new SCPItemRecord(8045, "173", "GlennLeroi").setUnlocalizedName("SCP Record"));
		itemSCP000J = (new SCPItem000J(8046).setUnlocalizedName("SCP-000-J"));
		itemSCP143Bucket = (SCP143Bucket)(new SCP143Bucket(8047, 0, 6576458, false).setUnlocalizedName("SCP-143 Bucket")).setMaxStackSize(20);
		itemBucket006 = (new SCP143Bucket(8048, SCP006Flowing.blockID, 9983, true).setUnlocalizedName("SCP-143 SCP-006 Bucket"));
		itemBucket354 = (new SCP143Bucket(8049, SCP354Flowing.blockID, 7602181, true).setUnlocalizedName("SCP-143 SCP-354 Bucket"));
		itemBucketWater = (new SCP143Bucket(8050, Block.waterMoving.blockID, 5017087, true).setUnlocalizedName("SCP-143 Water Bucket"));
		itemRecord914 = (new SCPItemRecord(8051, "914", "GlennLeroi").setUnlocalizedName("SCP Record"));
		itemRecord173E = (new SCPItemRecord(8052, "173E", "GlennLeroi").setUnlocalizedName("SCP Record"));
		itemRecord789J = (new SCPItemRecord(8053, "789J", "GlennLeroi").setUnlocalizedName("SCP Record"));
		itemRecord079 = (new SCPItemRecord(8054, "079", "GlennLeroi").setUnlocalizedName("SCP Record"));
		//itemSCP662 = (new SCPItem662(8055).44).setUnlocalizedName("SCP-662"));
	}

}
