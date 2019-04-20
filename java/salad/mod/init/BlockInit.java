package salad.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import salad.mod.objects.blocks.BlockBase;
import salad.mod.objects.blocks.GalariteOre;
import salad.mod.objects.blocks.MetalBlock1;
import salad.mod.objects.blocks.MetalBlock2;
import salad.mod.objects.blocks.SeariumOre;
import salad.mod.objects.blocks.StoneBase;
import salad.mod.objects.blocks.machines.alloy_caster.BlockAlloyCaster;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//ores
	public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.ROCK);
	public static final Block TIN_ORE = new BlockBase("tin_ore", Material.ROCK);
	public static final Block TITANIUM_ORE = new BlockBase("titanium_ore", Material.ROCK);
	public static final Block LUMIUM_ORE = new BlockBase("lumium_ore", Material.ROCK);
	public static final Block SEARIUM_ORE = new SeariumOre("searium_ore", Material.ROCK);
	public static final Block GALARITE_ORE = new GalariteOre("galarite_ore", Material.ROCK);
	public static final Block VALIUM_ORE = new SeariumOre("valium_ore", Material.ROCK);
	public static final Block TEKRITIUM_ORE = new BlockBase("tekritium_ore", Material.ROCK);
	public static final Block DOOMIUM_ORE = new BlockBase("doomium_ore", Material.ROCK);
	public static final Block CREATITE_ORE = new BlockBase("creatite_ore", Material.ROCK);
	
	//blocks
	public static final Block COPPER_BLOCK = new MetalBlock1("copper_block", Material.IRON);
	public static final Block TIN_BLOCK = new MetalBlock1("tin_block", Material.IRON);
	public static final Block TITANIUM_BLOCK = new MetalBlock2("titanium_block", Material.IRON);
	public static final Block SEARIUM_BLOCK = new MetalBlock2("searium_block", Material.IRON);
	public static final Block GALARITE_BLOCK = new MetalBlock2("galarite_block", Material.IRON);
	public static final Block VALIUM_BLOCK = new MetalBlock2("valium_block", Material.IRON);
	public static final Block TEKRITIUM_BLOCK = new MetalBlock2("tekritium_block", Material.IRON);
	public static final Block HARDENED_COBBLE = new StoneBase("hardened_cobble", Material.ROCK);
	public static final Block HUGO_BLOCK = new StoneBase("hugo_block", Material.ROCK);
	public static final Block WHITE_BRICKS = new StoneBase ("white_bricks", Material.ROCK);
	public static final Block LIGHT_GRAY_BRICKS = new StoneBase ("light_gray_bricks", Material.ROCK);
	public static final Block GRAY_BRICKS = new StoneBase ("gray_bricks", Material.ROCK);
	public static final Block BLACK_BRICKS = new StoneBase ("black_bricks", Material.ROCK);
	public static final Block BROWN_BRICKS = new StoneBase ("brown_bricks", Material.ROCK);
	public static final Block RED_BRICKS = new StoneBase ("red_bricks", Material.ROCK);
	public static final Block ORANGE_BRICKS = new StoneBase ("orange_bricks", Material.ROCK);
	public static final Block YELLOW_BRICKS = new StoneBase ("yellow_bricks", Material.ROCK);
	public static final Block LIME_GREEN_BRICKS = new StoneBase ("lime_green_bricks", Material.ROCK);
	public static final Block GREEN_BRICKS = new StoneBase ("green_bricks", Material.ROCK);
	public static final Block CYAN_BRICKS = new StoneBase ("cyan_bricks", Material.ROCK);
	public static final Block LIGHT_BLUE_BRICKS = new StoneBase ("light_blue_bricks", Material.ROCK);
	public static final Block BLUE_BRICKS = new StoneBase ("blue_bricks", Material.ROCK);
	public static final Block PURPLE_BRICKS = new StoneBase ("purple_bricks", Material.ROCK);
	public static final Block MAGENTA_BRICKS = new StoneBase ("magenta_bricks", Material.ROCK);
	public static final Block PINK_BRICKS = new StoneBase ("pink_bricks", Material.ROCK);
	
	//machines
	public static final Block ALLOY_CASTER = new BlockAlloyCaster("alloy_caster");
}
