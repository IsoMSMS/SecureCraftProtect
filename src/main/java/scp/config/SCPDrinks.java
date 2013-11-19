package scp.config;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import scp.SCPPotion;
import scp.items.SCPItemCup;
import scp.items.SCPItemCupFilled;

public class SCPDrinks
{
	public SCPDrinks()
	{
		super();
	}
	public static Item itemCupEmpty;
	public static SCPItemCupFilled itemCupMycelium;
	public static SCPItemCupFilled itemCupNetherrack;
	public static SCPItemCupFilled itemCupCoal;
	public static SCPItemCupFilled itemCupGlowstone;
	public static SCPItemCupFilled itemCupGold;
	public static SCPItemCupFilled itemCupAppleGold;
	public static SCPItemCupFilled itemCupCactus;
	public static SCPItemCupFilled itemCupSlowSand;
	public static SCPItemCupFilled itemCupObsidian;
	public static SCPItemCupFilled itemCupFeather;
	public static SCPItemCupFilled itemCupSpiderEye;
	public static SCPItemCupFilled itemCupGlass;
	public static SCPItemCupFilled itemCupPumpkin;
	public static SCPItemCupFilled itemCupApple;
	public static SCPItemCupFilled itemCupStone;
	public static SCPItemCupFilled itemCupClay;
	public static SCPItemCupFilled itemCupSugar;
	public static SCPItemCupFilled itemCupRottenFlesh;
	public static SCPItemCupFilled itemCupIron;
	public static SCPItemCupFilled itemCupDiamond;
	public static SCPItemCupFilled itemCupRedstone;
	public static SCPItemCupFilled itemCupCobweb;
	public static SCPItemCupFilled itemCupBone;
	public static SCPItemCupFilled itemCupSlimeBall;
	public static SCPItemCupFilled itemCupBlood;
	public static void init()
	{
		itemCupEmpty		= (new SCPItemCup(7000).setUnlocalizedName("Empty Cup"));
		itemCupMycelium		= (SCPItemCupFilled)(new SCPItemCupFilled(7001, 10124161, false, 0).setPotionEffect(Potion.confusion.id, 30, 2, 1F).setUnlocalizedName("Cup with Mycelium"));
		itemCupNetherrack	= (SCPItemCupFilled)(new SCPItemCupFilled(7002, 5975598, true, 6817800).setPotionEffect(Potion.fireResistance.id, 30, 2, 1F).setUnlocalizedName("Cup with Netherrack"));
		itemCupCoal			= (SCPItemCupFilled)(new SCPItemCupFilled(7003, 1776411, false, 0).setPotionEffect(Potion.weakness.id, 30, 2, 1F).setUnlocalizedName("Cup with Coal"));
		itemCupGlowstone	= (SCPItemCupFilled)(new SCPItemCupFilled(7004, 16759902, true, 7499593).setPotionEffect(Potion.blindness.id, 30, 2, 1F).setUnlocalizedName("Cup with Glowstone"));
		itemCupGold			= (SCPItemCupFilled)(new SCPItemCupFilled(7005, 14605824, false, 0).setPotionEffect(Potion.moveSpeed.id, 10, 1, 1F).setUnlocalizedName("Cup with Gold"));
		itemCupAppleGold	= (SCPItemCupFilled)(new SCPItemCupFilled(7006, 15396439, false, 0).setPotionEffect(Potion.heal.id, 30, 2, 1F).setUnlocalizedName("Cup with Golden Apple"));
		itemCupCactus		= (SCPItemCupFilled)(new SCPItemCupFilled(7007, 1346852, false, 0).setPotionEffect(Potion.harm.id, 30, 2, 1F).setUnlocalizedName("Cup with Cactus"));
		itemCupSlowSand		= (SCPItemCupFilled)(new SCPItemCupFilled(7008, 4206115, true, 4206115).setPotionEffect(Potion.moveSlowdown.id, 30, 2, 1F).setUnlocalizedName("Cup with Soul Sand"));
		itemCupObsidian		= (SCPItemCupFilled)(new SCPItemCupFilled(7009, 1052697, true, 3812948).setPotionEffect(Potion.resistance.id, 30, 5, 1F).setUnlocalizedName("Cup with Obsidian"));
		itemCupFeather		= (SCPItemCupFilled)(new SCPItemCupFilled(7010, 16777215, false, 0).setPotionEffect(Potion.jump.id, 30, 2, 1F).setUnlocalizedName("Cup with Feathers"));
		itemCupSpiderEye	= (SCPItemCupFilled)(new SCPItemCupFilled(7011, 6620715, false, 0).setPotionEffect(Potion.poison.id, 30, 2, 1F).setUnlocalizedName("Cup with Spider Eyes"));
		itemCupGlass		= (SCPItemCupFilled)(new SCPItemCupFilled(7012, 11785947, false, 0).setPotionEffect(Potion.waterBreathing.id, 30, 2, 1F).setUnlocalizedName("Cup with Glass"));
		itemCupPumpkin		= (SCPItemCupFilled)(new SCPItemCupFilled(7013, 14913565, false, 0).setPotionEffect(SCPPotion.shake.id, 5, 1, 1F).setUnlocalizedName("Cup with Moldy Pumpkin"));
		itemCupApple		= (SCPItemCupFilled)(new SCPItemCupFilled(7014, 16718891, false, 0).setPotionEffect(Potion.regeneration.id, 30, 2, 1F).setUnlocalizedName("Apple Juice"));
		itemCupStone		= (SCPItemCupFilled)(new SCPItemCupFilled(7015, 4473924, false, 0).setPotionEffect(SCPPotion.crystal.id, 3, 0, 1F).setUnlocalizedName("Cup with Stone"));
		itemCupClay			= (SCPItemCupFilled)(new SCPItemCupFilled(7016, 10791096, false, 0).setPotionEffect(Potion.poison.id, 17, 1, 1F).setUnlocalizedName("Cup with Clay"));
		itemCupSugar		= (SCPItemCupFilled)(new SCPItemCupFilled(7017, 16777215, true, 16777215).setPotionEffect(Potion.moveSpeed.id, 30, 3, 1F).setUnlocalizedName("Cup with Redbull"));
		itemCupRottenFlesh	= (SCPItemCupFilled)(new SCPItemCupFilled(7018, 7298075, true, 9130787).setPotionEffect(Potion.hunger.id, 50, 2, 1F).setUnlocalizedName("Cup with Rotten Stuff (yuck)"));
		itemCupIron			= (SCPItemCupFilled)(new SCPItemCupFilled(7019, 14211288, false, 0).setPotionEffect(Potion.damageBoost.id, 30, 2, 1F).setUnlocalizedName("Cup with Iron"));
		itemCupDiamond		= (SCPItemCupFilled)(new SCPItemCupFilled(7020, 4910545, false, 0).setPotionEffect(Potion.digSpeed.id, 50, 5, 1F).setUnlocalizedName("Cup with Diamond"));
		itemCupRedstone		= (SCPItemCupFilled)(new SCPItemCupFilled(7021, 7471104, true, 16711680).setPotionEffect(SCPPotion.electricity.id, 5, 1, 1F).setUnlocalizedName("Cup with Redstone"));
		itemCupCobweb		= (SCPItemCupFilled)(new SCPItemCupFilled(7022, 11382197, false, 0).setPotionEffect(Potion.moveSlowdown.id, 8, 1, 1F).setUnlocalizedName("Cup with Web"));
		itemCupBone			= (SCPItemCupFilled)(new SCPItemCupFilled(7023, 16777215, false, 0).setPotionEffect(SCPPotion.skeleton.id, 30, 0, 1F).setUnlocalizedName("Cup with Bone Fragments"));
		itemCupSlimeBall	= (SCPItemCupFilled)(new SCPItemCupFilled(7024, 3211033, false, 0).setPotionEffect(SCPPotion.sticky.id, 30, 0, 1F).setUnlocalizedName("Cup with Slime"));
		itemCupBlood		= (SCPItemCupFilled)(new SCPItemCupFilled(7025, 8323072, false, 0).setPotionEffect(SCPPotion.bloodStone.id, 600, 0, 1F).setUnlocalizedName("Cup with Blood"));
	}

}
