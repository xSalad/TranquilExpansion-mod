package salad.mod.objects.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import salad.mod.Main;
import salad.mod.init.ItemInit;
import salad.mod.util.interfaces.IHasModel;

public class AxeTekritium extends ItemTool implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.ACACIA_FENCE, Blocks.ACACIA_FENCE_GATE, Blocks.BIRCH_FENCE, Blocks.BIRCH_FENCE_GATE, Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_FENCE_GATE, Blocks.JUNGLE_FENCE, Blocks.JUNGLE_FENCE_GATE, Blocks.OAK_FENCE, Blocks.OAK_FENCE_GATE, Blocks.SPRUCE_FENCE, Blocks.SPRUCE_FENCE_GATE, Blocks.WOODEN_SLAB,Blocks.DOUBLE_WOODEN_SLAB, Blocks.ACACIA_DOOR, Blocks.BIRCH_DOOR, Blocks.DARK_OAK_DOOR, Blocks.JUNGLE_DOOR, Blocks.OAK_DOOR, Blocks.SPRUCE_DOOR, Blocks.TRAPPED_CHEST, Blocks.ACACIA_STAIRS, Blocks.BIRCH_STAIRS, Blocks.DARK_OAK_STAIRS, Blocks.JUNGLE_STAIRS, Blocks.OAK_STAIRS, Blocks.SPRUCE_STAIRS, Blocks.TRAPDOOR, Blocks.CRAFTING_TABLE, Blocks.NOTEBLOCK, Blocks.JUKEBOX);
	
	public AxeTekritium(String name, ToolMaterial material)
	{
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tranquilexpansion);
		
		ItemInit.ITEMS.add(this);
	}
	
	public float getStrVsBlock(ItemStack stack, IBlockState state)
	{
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase hitEntity, EntityLivingBase attackingEntity) {
	hitEntity.setFire(4);
	return true;
	}
}
