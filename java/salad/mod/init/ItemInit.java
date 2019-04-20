package salad.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;
import salad.mod.objects.armour.ArmorBase;
import salad.mod.objects.items.Cog;
import salad.mod.objects.items.Cogframe;
import salad.mod.objects.items.ItemBase;
import salad.mod.objects.tools.AxeBase;
import salad.mod.objects.tools.AxeTekritium;
import salad.mod.objects.tools.HoeBase;
import salad.mod.objects.tools.PickaxeBase;
import salad.mod.objects.tools.PickaxeTekritium;
import salad.mod.objects.tools.ShovelBase;
import salad.mod.objects.tools.ShovelTekritium;
import salad.mod.objects.tools.SwordBase;
import salad.mod.objects.tools.SwordTekritium;
import salad.mod.util.Reference;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	    //Materials
	public static final ToolMaterial MATERIAL_SEARIUM = EnumHelper.addToolMaterial("material_searium", 4, 2200, 10.0F, 5.5F, 12);
	public static final ToolMaterial MATERIAL_TEKRITIUM = EnumHelper.addToolMaterial("material_tekritium", 4, 2600, 11.0F, 6.0F, 13);
	public static final ArmorMaterial ARMOR_MATERIAL_SEARIUM = EnumHelper.addArmorMaterial("armor_material_searium", Reference.MODID + ":searium", 17, new int[] {4, 7, 9, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
		

		//items
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");	
	public static final Item SEARIUM_INGOT = new ItemBase("searium_ingot");
	public static final Item REINFORCED_SEARIUM = new ItemBase("reinforced_searium");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item TITANIUM_INGOT = new ItemBase("titanium_ingot");
	public static final Item VALIUM_INGOT = new ItemBase("valium_ingot");
	public static final Item TEKRITIUM_INGOT = new ItemBase("tekritium_ingot");
	public static final Item ENRICHED_TEKRITIUM = new ItemBase ("enriched_tekritium");
	public static final Item GALARITE_INGOT = new ItemBase("galarite_ingot");
	public static final Item ENRICHED_GALARITE = new ItemBase("enriched_galarite");
	public static final Item GALARITE_CLUMP = new ItemBase("galarite_clump");
	public static final Item LARGE_GALARITE_CLUMP = new ItemBase("large_galarite_clump");
    public static final Item ENERGIZED_CRYSTAL = new ItemBase("energized_crystal");
	public static final Item HYPER_ENERGIZED_CRYSTAL = new ItemBase("hyper_energized_crystal");;
	public static final Item SEARIUM_INFUSED_GEM = new ItemBase("searium_infused_gem");
	public static final Item SEARIUM_TOOL_ROD = new ItemBase("searium_tool_rod");
	public static final Item OBSIDIAN_TOOL_ROD = new ItemBase("obsidian_tool_rod");
	public static final Item NETHER_SCALES = new ItemBase("nether_scales");
	public static final Item COG_FRAME = new Cogframe("cog_frame");
	public static final Item COPPER_COG = new Cog("copper_cog");
	public static final Item TIN_COG = new Cog("tin_cog");
	public static final Item IRON_COG = new Cog("iron_cog");
	public static final Item TITANIUM_COG = new Cog("titanium_cog");
	public static final Item SEARIUM_COG = new Cog("searium_cog");
	public static final Item TEKRITIUM_COG = new Cog("tekritium_cog");
	public static final Item COPPER_DUST = new ItemBase("copper_dust");
	public static final Item GALARITE_DUST = new ItemBase("galarite_dust");
	public static final Item STEEL_DUST = new ItemBase("steel_dust");
	public static final Item COAL_DUST = new ItemBase("coal_dust");
	public static final Item IRON_DUST = new ItemBase("iron_dust");
	public static final Item TIN_DUST = new ItemBase("tin_dust");
	public static final Item THERMAL_POWDER = new ItemBase("thermal_powder");
	public static final Item HEAVY_SCALES = new ItemBase("heavy_scales");
	public static final Item REINFORCED_GLASS_PANEL = new ItemBase("reinforced_glass_panel");
	public static final Item OBSIDIAN_PLATING = new ItemBase("obsidian_plating");
	public static final Item CIRCUIT_BOARD = new ItemBase("circuit_board");
	public static final Item FORTIFIED_MACHINE_PLATING = new ItemBase("fortified_machine_plating");
	public static final Item STORAGE_TANK = new ItemBase("storage_tank");
	public static final Item ADVANCED_PIPE = new ItemBase("advanced_pipe");

	//Tools
	public static final ItemSword SEARIUM_SWORD = new SwordBase("searium_sword", MATERIAL_SEARIUM);
	public static final ItemSpade SEARIUM_SHOVEL = new ShovelBase("searium_shovel", MATERIAL_SEARIUM);
	public static final ItemPickaxe SEARIUM_PICKAXE = new PickaxeBase("searium_pickaxe", MATERIAL_SEARIUM);
	public static final ItemTool SEARIUM_AXE = new AxeBase("searium_axe", MATERIAL_SEARIUM);
	public static final ItemHoe SEARIUM_HOE = new HoeBase("searium_hoe", MATERIAL_SEARIUM);
	public static final ItemSword TEKRITIUM_SWORD = new SwordTekritium("tekritium_sword", MATERIAL_TEKRITIUM);
	public static final ItemSpade TEKRITIUM_SHOVEL = new ShovelTekritium("tekritium_shovel", MATERIAL_TEKRITIUM);
	public static final ItemPickaxe TEKRITIUM_PICKAXE = new PickaxeTekritium("tekritium_pickaxe", MATERIAL_TEKRITIUM);
	public static final ItemTool TEKRITIUM_AXE = new AxeTekritium("tekritium_axe", MATERIAL_TEKRITIUM);
	public static final ItemHoe TEKRITIUM_HOE = new HoeBase("tekritium_hoe", MATERIAL_TEKRITIUM);
		
	//Armor
	public static final Item SEARIUM_HELMET = new ArmorBase("searium_helmet", ARMOR_MATERIAL_SEARIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item SEARIUM_CHESTPLATE = new ArmorBase("searium_chestplate", ARMOR_MATERIAL_SEARIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item SEARIUM_LEGGINGS = new ArmorBase("searium_leggings", ARMOR_MATERIAL_SEARIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item SEARIUM_BOOTS = new ArmorBase("searium_boots", ARMOR_MATERIAL_SEARIUM, 1, EntityEquipmentSlot.FEET);
		}
