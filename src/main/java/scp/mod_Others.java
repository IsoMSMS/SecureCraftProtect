package scp;

import java.util.Map;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBlaze;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.src.BaseMod;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.BiomeGenTaiga;

import org.lwjgl.input.Keyboard;

import scp.blocks.SCPBlock015;
import scp.blocks.SCPBlockDesk;
import scp.blocks.SCPBlockSlideDoor;
import scp.blocks.SCPBlockStoneCoffin;
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
import scp.entities.SCPEntity1440;
import scp.entities.SCPEntity173;
import scp.entities.SCPEntity217Cow;
import scp.entities.SCPEntity217Creeper;
import scp.entities.SCPEntity217Pig;
import scp.entities.SCPEntity217Spider;
import scp.entities.SCPEntity217Testificate;
import scp.entities.SCPEntity217Zombie;
import scp.entities.SCPEntity222Clone;
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
import scp.entities.SCPEntity846;
import scp.entities.SCPEntity872;
import scp.entities.SCPEntity966;
import scp.entities.SCPEntity997;
import scp.entities.SCPEntity999;
import scp.entities.SCPEntityAtomicGrenade;
import scp.entities.SCPEntityClassD027;
import scp.entities.SCPEntityClassDGuy;
import scp.entities.SCPEntityRat;
import scp.entities.SCPEntityReal682;
import scp.guis.SCPGuiDocument;
import scp.models.SCPModel019n2;
import scp.models.SCPModel023;
import scp.models.SCPModel049;
import scp.models.SCPModel053;
import scp.models.SCPModel058;
import scp.models.SCPModel087;
import scp.models.SCPModel096Aggro;
import scp.models.SCPModel096Cry;
import scp.models.SCPModel096Docile;
import scp.models.SCPModel1000;
import scp.models.SCPModel106;
import scp.models.SCPModel111;
import scp.models.SCPModel131;
import scp.models.SCPModel1440;
import scp.models.SCPModel173;
import scp.models.SCPModel217Cow;
import scp.models.SCPModel217Creeper;
import scp.models.SCPModel217Pig;
import scp.models.SCPModel217Spider;
import scp.models.SCPModel217Testificate;
import scp.models.SCPModel217Zombie;
import scp.models.SCPModel280;
import scp.models.SCPModel372;
import scp.models.SCPModel457;
import scp.models.SCPModel472;
import scp.models.SCPModel50AEJ;
import scp.models.SCPModel513;
import scp.models.SCPModel538;
import scp.models.SCPModel594Naked;
import scp.models.SCPModel594UnSheered;
import scp.models.SCPModel629;
import scp.models.SCPModel682;
import scp.models.SCPModel846;
import scp.models.SCPModel872;
import scp.models.SCPModel966;
import scp.models.SCPModel997;
import scp.models.SCPModel999;
import scp.models.SCPModelClassDGuy;
import scp.models.SCPModelRat;
import scp.models.SCPModelReal682;
import scp.renders.SCPBlockRenders;
import scp.renders.SCPRender015Boss;
import scp.renders.SCPRender058;
import scp.renders.SCPRender629;
import scp.renders.SCPRender682;
import scp.renders.SCPRender999;
import scp.renders.SCPRenderGrenade;
import scp.renders.SCPRenderInventory;
import scp.renders.SCPRenderProjectile;
import scp.worldgen.SCPWorldGen006;
import scp.worldgen.SCPWorldGen143;
import scp.worldgen.SCPWorldGenCustomMinable;
import scp.worldgen.SCPWorldGenSCP354;

public class mod_Others extends BaseMod
{
	int create = 0;
	Random rand = new Random();

	//World Generation
	public SCPWorldGenSCP354 worldgenlakes = new SCPWorldGenSCP354(mod_SCP.SCP354Still.blockID);
	public SCPWorldGen006 scp006Gen = new SCPWorldGen006(mod_SCP.SCP006Still.blockID);
	public SCPWorldGen143 scp143Gen = new SCPWorldGen143();

	//Keybindings
	public static KeyBinding keyActivate = new KeyBinding("key.Activate", Keyboard.KEY_N);
	public static KeyBinding keyBlink = new KeyBinding("key.blink", Keyboard.KEY_B);
	public static KeyBinding remoteDoors = new KeyBinding("key.doors", Keyboard.KEY_V);

	//Block Renders
	public static int KeycardSlotID, ToiletID, SmokeBlockID, SCP310ID, CorrodedDoorID, SCP789JID, SCP015ID, SlidingDoorID, 
	SCP079ID, SCP076ID, ShelfID, StoneCoffinID, PosterID, RemoteDoorCompID, SCP273ID, SCP822ID, DeskID, ChairID, AlarmID,
	SCP513ID;
	public SCPBlockRenders renderBlocks = new SCPBlockRenders();
	public SCPRenderInventory renderInv = new SCPRenderInventory();

	//Randomness
	public World worldObj;
	public Minecraft mc = Minecraft.getMinecraft();
	public static boolean remoteDoorActivate;
	public static boolean wantsToTalk = true;


	@Override
	public String getVersion()
	{
		return "";
	}

	@Override
	public void load()
	{
		ModLoader.registerKey(this, keyBlink, true);
		ModLoader.registerKey(this, keyActivate, false);
		ModLoader.registerKey(this, remoteDoors, false);
		ModLoader.registerContainerID(this, 6079);
		KeycardSlotID = ModLoader.getUniqueBlockModelID(this, true);		
		SmokeBlockID = ModLoader.getUniqueBlockModelID(this, true);
		SCP310ID = ModLoader.getUniqueBlockModelID(this, true);
		CorrodedDoorID = ModLoader.getUniqueBlockModelID(this, false);
		SCP789JID = ModLoader.getUniqueBlockModelID(this, true);
		SCP015ID = ModLoader.getUniqueBlockModelID(this, true);
		SlidingDoorID = ModLoader.getUniqueBlockModelID(this, false);
		SCP079ID = ModLoader.getUniqueBlockModelID(this, true);
		SCP076ID = ModLoader.getUniqueBlockModelID(this, true);
		ShelfID = ModLoader.getUniqueBlockModelID(this, true);
		StoneCoffinID = ModLoader.getUniqueBlockModelID(this, true);
		PosterID = ModLoader.getUniqueBlockModelID(this, true);
		RemoteDoorCompID = ModLoader.getUniqueBlockModelID(this, true);
		SCP273ID = ModLoader.getUniqueBlockModelID(this, true);
		SCP822ID = ModLoader.getUniqueBlockModelID(this, true);
		ToiletID = ModLoader.getUniqueBlockModelID(this, true);
		DeskID = ModLoader.getUniqueBlockModelID(this, true);
		ChairID = ModLoader.getUniqueBlockModelID(this, true);
		AlarmID = ModLoader.getUniqueBlockModelID(this, true);
		SCP513ID = ModLoader.getUniqueBlockModelID(this, true);
		ModLoader.addSpawn(SCPEntity1000.class, 4, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] 
				{   
			BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.jungleHills
				});


		ModLoader.setInGameHook(this, true, false);
	}

	public void takenFromCrafting(EntityPlayer entityplayer, ItemStack itemstack, IInventory iinventory)
	{

		boolean flag = false;
		if(itemstack.itemID == mod_SCP.DocumentTable.blockID)
		{
			entityplayer.addStat(mod_SCP.craftCrafter, 1);
			flag = true;
		}

		if(itemstack.itemID == mod_SCP.GasMask.itemID)
		{
			entityplayer.addStat(mod_SCP.classD, 1);
			flag = true;
		}

		if(itemstack.itemID == mod_SCP.SCP458.itemID)
		{
			entityplayer.addStat(mod_SCP.pizzaBreak, 1);
			flag = true;
		}

		if(itemstack.itemID == mod_SCP.ClassDPants.itemID)
		{
			entityplayer.addStat(mod_SCP.classDpants, 1);
			flag = true;
		}

		if(itemstack.itemID == mod_SCP.ClassDShoes.itemID)
		{
			entityplayer.addStat(mod_SCP.classDboots, 1);
			flag = true;
		}

		if(itemstack.itemID == mod_SCP.ClassDShirt.itemID)
		{
			entityplayer.addStat(mod_SCP.classDshirt, 1);
			flag = true;
		}

		if(itemstack.itemID == mod_SCP.Locker.blockID)
		{
			entityplayer.addStat(mod_SCP.reinforcedIron, 1);
			flag = true;
		}

		if(itemstack.itemID == mod_SCP.TothBrush.itemID)
		{
			entityplayer.addStat(mod_SCP.brushYourToths, 1);
			flag = true;
		}

		if(itemstack.itemID == mod_SCP.SmokeBlock.blockID)
		{
			entityplayer.addStat(mod_SCP.noSmoking, 1);
			flag = true;
		}

		if(itemstack.itemID == mod_SCP.SCP500G.itemID)
		{
			entityplayer.addStat(mod_SCP.painKiller, 1);
			flag = true;
		}

		if(itemstack.itemID == mod_SCP.SCP420J.itemID)
		{
			entityplayer.addStat(mod_SCP.bestShit, 1);
			flag = true;
		}

		if(itemstack.itemID == mod_SCP.L1Keycard.itemID)
		{
			entityplayer.addStat(mod_SCP.ClassDNoob, 1);
			flag = true;
		}
	}

	public void onItemPickup(EntityPlayer entityplayer, ItemStack itemstack) 
	{ 
		if(itemstack.itemID == mod_SCP.Item019.itemID) 
		{ 
			entityplayer.addStat(mod_SCP.breakSCP019, 1);
		}
	}

	//Renders
	public void addRenderer(Map map)
	{
		map.put(SCPEntity173.class, new RenderLiving(new SCPModel173(), 0.5F));
		map.put(SCPEntity111.class, new RenderLiving(new SCPModel111(), 0.5F));
		map.put(SCPEntityClassDGuy.class, new RenderLiving(new SCPModelClassDGuy(), 0.5F));
		map.put(SCPEntity019n2.class, new RenderLiving(new SCPModel019n2(), 0.1F));
		map.put(SCPEntity457.class, new RenderLiving(new SCPModel457(), 0.5F));
		map.put(SCPEntity513.class, new RenderLiving(new SCPModel513(), 0F));
		map.put(SCPEntity217Pig.class, new RenderLiving(new SCPModel217Pig(), 0.5F));
		map.put(SCPEntity217Spider.class, new RenderLiving(new SCPModel217Spider(), 0.5F));
		map.put(SCPEntity087.class, new RenderLiving(new SCPModel087(), 0.5F));
		map.put(SCPEntity049.class, new RenderLiving(new SCPModel049(), 0.5F));
		map.put(SCPEntity217Zombie.class, new RenderLiving(new SCPModel217Zombie(), 0.5F));
		map.put(SCPEntity1000.class, new RenderLiving(new SCPModel1000(), 0.5F));
		map.put(SCPEntity131.class, new RenderLiving(new SCPModel131(), 0.4F));
		map.put(SCPEntity999.class, new SCPRender999(new SCPModel999(3), new SCPModel999(3), 0.5F));
		map.put(SCPEntity629.class, new SCPRender629(new SCPModel629(), 0.5F));
		map.put(SCPEntity096Docile.class, new RenderLiving(new SCPModel096Docile(), 0.5F));
		map.put(SCPEntity096Cry.class, new RenderLiving(new SCPModel096Cry(), 0.5F));
		map.put(SCPEntity096Mad.class, new RenderLiving(new SCPModel096Aggro(), 0.5F));
		map.put(SCPEntity217Cow.class, new RenderLiving(new SCPModel217Cow(), 0.5F));
		map.put(SCPEntity538.class, new RenderLiving(new SCPModel538(), 0.5F));
		map.put(SCPEntity106.class, new RenderLiving(new SCPModel106(), 0.5F));
		map.put(SCPEntity080.class, new RenderLiving(new ModelBiped(), 0.5F));
		map.put(SCPEntity280.class, new RenderLiving(new SCPModel280(), 0.5F));
		map.put(SCPEntity594.class, new RenderLiving(new SCPModel594UnSheered(), 0.5F));
		map.put(SCPEntity594Naked.class, new RenderLiving(new SCPModel594Naked(), 0.5F));
		map.put(SCPEntity058.class, new SCPRender058(new SCPModel058(), 0.4F));
		map.put(SCPEntity966.class, new RenderLiving(new SCPModel966(), 0F));
		map.put(SCPEntity872.class, new RenderLiving(new SCPModel872(), 0.5F));
		map.put(SCPEntity1440.class, new RenderLiving(new SCPModel1440(), 0.5F));
		map.put(SCPEntity50AEJ.class, new RenderLiving(new SCPModel50AEJ(), 0F));
		map.put(SCPEntity217Creeper.class, new RenderLiving(new SCPModel217Creeper(), 0.5F));
		map.put(SCPEntity053.class, new RenderLiving(new SCPModel053(), 0.5F));
		map.put(SCPEntity073.class, new RenderLiving(new ModelBiped(), 0.5F));
		map.put(SCPEntity076.class, new RenderBiped(new ModelBiped(), 0.5F));
		map.put(SCPEntityRat.class, new RenderLiving(new SCPModelRat(), 0.1F));
		map.put(SCPEntityClassD027.class, new RenderLiving(new SCPModelClassDGuy(), 0.5F));
		map.put(SCPEntity997.class, new RenderLiving(new SCPModel997(), 0.5F));
		map.put(SCPEntity222Clone.class, new RenderLiving(new ModelBiped(), 0.5F));
		map.put(SCPEntity217Testificate.class, new RenderLiving(new SCPModel217Testificate(), 0.5F));
		map.put(SCPEntity372.class, new RenderLiving(new SCPModel372(), 0.0F));
		map.put(SCPEntity846.class, new RenderLiving(new SCPModel846(), 0.5F));
		map.put(SCPEntityAtomicGrenade.class, new SCPRenderGrenade(10));
		map.put(SCPEntity472.class, new RenderLiving(new SCPModel472(), 0F));
		map.put(SCPEntity273.class, new RenderLiving(new ModelBiped(), 0.5F));
		map.put(SCPEntity015Boss.class, new SCPRender015Boss(new ModelBlaze(), 1.4F));
		map.put(SCPEntity015Projectile.class, new SCPRenderProjectile(1));
		map.put(SCPEntity023.class, new RenderLiving(new SCPModel023(), 0.5F));
		map.put(SCPEntity682.class, new RenderLiving(new SCPModel682(), 0.5F));
		map.put(SCPEntityReal682.class, new SCPRender682(new SCPModelReal682(), 1.7F));
	//	map.put(SCPEntityButler.class, new RenderLiving(new ModelBiped(), 0.5F));
	}

	public GuiContainer getContainerGUI(EntityClientPlayerMP var1, int var2, int var3, int var4, int var5)
	{
		TileEntity var6 = var1.worldObj.getBlockTileEntity(var3, var4, var5);
		if(var2 == 6079)
		{
			return new SCPGuiDocument(var1.inventory, worldObj, var2, var3, var4);
		}
		return null;
	}			

	@Override
	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{		
		BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);

		if(biomegenbase instanceof BiomeGenTaiga)
		{			
			if (rand.nextInt(100) == 0)
			{
				int randPosX = chunkX + rand.nextInt(16);
				int randPosZ = chunkZ + rand.nextInt(16);
				int randPosY = world.getHeightValue(randPosX, randPosZ);
				int par4 = randPosX;
				int par5 = randPosY;
				int par6 = randPosZ;
				worldgenlakes.generate(world, rand, randPosX, randPosY, randPosZ);
				worldgenlakes.generate(world, rand, par4 - 8, par5, par6);
				worldgenlakes.generate(world, rand, par4, par5, par6 + 8);
				worldgenlakes.generate(world, rand, par4 + 8, par5, par6);
				worldgenlakes.generate(world, rand, par4, par5, par6 - 8);
				worldgenlakes.generate(world, rand, par4 - 8, par5, par6 - 8);
				worldgenlakes.generate(world, rand, par4 + 8, par5, par6 + 8);
				worldgenlakes.generate(world, rand, par4 + 8, par5, par6 -8);
				worldgenlakes.generate(world, rand, par4 - 8, par5, par6 + 8);
				worldgenlakes.generate(world, rand, par4 - 16, par5, par6);
				worldgenlakes.generate(world, rand, par4, par5, par6 + 16);
				worldgenlakes.generate(world, rand, par4 + 16, par5, par6);
				worldgenlakes.generate(world, rand, par4, par5, par6 - 16);
			}		
		}
		if(biomegenbase instanceof BiomeGenForest)
		{			
			if (rand.nextInt(200) == 0)
			{
				int randPosX = chunkX + rand.nextInt(16);
				int randPosZ = chunkZ + rand.nextInt(16);
				int randPosY = world.getHeightValue(randPosX, randPosZ);
				int par4 = randPosX;
				int par5 = randPosY;
				int par6 = randPosZ;
				scp006Gen.generate(world, rand, randPosX, randPosY, randPosZ);
			}			
			if (rand.nextInt(2) == 0)
			{
				int randPosX = chunkX + rand.nextInt(16);
				int randPosZ = chunkZ + rand.nextInt(16);
				int randPosY = world.getHeightValue(randPosX, randPosZ);
				int par4 = randPosX;
				int par5 = randPosY;
				int par6 = randPosZ;
				scp143Gen.generate(world, rand, randPosX, randPosY, randPosZ);
			}		
		}

		for(int i = 0; i < 10; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			(new SCPWorldGenCustomMinable(mod_SCP.Marble.blockID, 50, Block.stone.blockID)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
	}

	@Override
	public boolean renderWorldBlock(RenderBlocks renderblocks, IBlockAccess iblockaccess, int i, int j, int k, Block block, int l)
	{
		if (l == KeycardSlotID) return renderBlocks.RenderKeycardSlot(block, i, j, k, renderblocks);
		if (l == SmokeBlockID) return renderBlocks.renderSmokeBlock(block, i, j, k, renderblocks);
		if (l == SCP310ID) return renderBlocks.renderSCP310(block, i, j, k, renderblocks);
		if (l == CorrodedDoorID) return renderBlocks.CorrodedDoor(block, i, j, k, renderblocks);
		if (l == SCP789JID) return renderBlocks.renderSCP789J(block, i, j, k, renderblocks);
		if (l == SCP015ID) return renderBlocks.renderSCP015((SCPBlock015)block, i, j, k, renderblocks);
		if (l == SlidingDoorID) return renderBlocks.renderSlideDoor((SCPBlockSlideDoor)block, i, j, k, renderblocks);
		if (l == SCP079ID) return renderBlocks.renderSCP079(block, i, j, k, renderblocks);
		if (l == SCP076ID) return renderBlocks.renderSCP076(block, i, j, k, renderblocks);
		if (l == ShelfID) return renderBlocks.renderShelf(block, i, j, k, renderblocks);
		if (l == StoneCoffinID) return renderBlocks.renderStoneCoffin((SCPBlockStoneCoffin)block, i, j, k, renderblocks);
		if (l == PosterID) return renderBlocks.renderPaintings(block, i, j, k, renderblocks);
		if (l == SCP273ID) return renderBlocks.renderPillar(block, i, j, k, renderblocks);
		if (l == SCP822ID) return renderBlocks.renderSCP822(block, i, j, k, renderblocks);
		if (l == ToiletID) return renderBlocks.renderToilet(block, i, j, k, renderblocks);
		if (l == DeskID) return renderBlocks.renderDesk((SCPBlockDesk)block, i, j, k, renderblocks);
		if (l == ChairID) return renderBlocks.renderBlockChairInWorld(renderblocks, iblockaccess, i, j, k, block);
		if (l == AlarmID) return renderBlocks.renderAlarmBlock(block, i, j, k, renderblocks);
		if (l == SCP513ID) return renderBlocks.renderSCP513(block, i, j, k, renderblocks);
		return false;
	}

	@Override
	public void renderInvBlock(RenderBlocks renderer, Block block, int metadata, int modelID)
	{
		Tessellator tessellator = Tessellator.instance;
		if(modelID == ShelfID) renderInv.renderInvShelf(renderer, block, metadata);
		if(modelID == KeycardSlotID) renderInv.renderInvKeySlot(renderer, block, metadata);
		if(modelID == SmokeBlockID) renderInv.renderInvSmokeBlock(renderer, block, metadata);
		if(modelID == SCP310ID) renderInv.renderInvSCP310(renderer, block, metadata);
		if(modelID == SCP789JID) renderInv.renderInvSCP789J(renderer, block, metadata);
		if(modelID == SCP015ID) renderInv.renderInvSCP015(renderer, block, metadata);
		if(modelID == SCP076ID) renderInv.renderInvBlock(renderer, block, metadata);
		if(modelID == StoneCoffinID) renderInv.renderInvStoneCoffin(renderer, block, metadata);
		if(modelID == PosterID) renderInv.renderInvPoster(renderer, block, metadata);
		if(modelID == SCP079ID) renderInv.renderInv079(renderer, block, metadata);
		if(modelID == RemoteDoorCompID) renderInv.renderInvRemoteDoorComp(renderer, block, metadata);
		if(modelID == SCP273ID) renderInv.renderInvPillar(renderer, block, metadata);
		if(modelID == SCP822ID) renderInv.renderInvSCP822(renderer, block, metadata);
		if(modelID == ToiletID) renderInv.renderInvSCP789J(renderer, block, metadata);
		if(modelID == DeskID) renderInv.renderInvDesk(renderer, block, metadata);
		if(modelID == ChairID) renderInv.renderInvChair(renderer, block, metadata);
		if(modelID == AlarmID) renderInv.renderInvAlarm(renderer, block, metadata);
		if(modelID == SCP513ID) renderInv.renderSCP513(renderer, block, metadata);
	}

	public void keyboardEvent(KeyBinding keybinding)
	{
		if(mc.theWorld != null && keybinding == keyBlink && mod_SCP.isActive && mc.currentScreen == null)
		{
			mc.thePlayer.setBlink(5);
		}
		if(mc.theWorld != null && keybinding == keyActivate && mc.currentScreen == null)
		{
			if(mod_SCP.isActive)
			{
				mod_SCP.isActive = false;
				mc.thePlayer.addChatMessage("Blinking has been deactivated!");
				mc.thePlayer.setBlink(300);
			}
			else
			{
				mod_SCP.isActive = true;
				mc.thePlayer.addChatMessage("Blinking has been reactivated!");				
			}
		}
		if(mc.theWorld != null && keybinding == remoteDoors && mc.currentScreen == null && mc.thePlayer.capabilities.isCreativeMode)
		{
			if(this.remoteDoorActivate)
			{
				this.remoteDoorActivate = false;
				mc.thePlayer.addChatMessage("Remote doors have been deactivated!");
			}
			else
			{
				this.remoteDoorActivate = true;
				mc.thePlayer.addChatMessage("Remote doors have been reactivated!");				
			}
		}
	}
}
