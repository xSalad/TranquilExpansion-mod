package salad.mod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{

	public static void init( ) {
		GameRegistry.addSmelting(ItemInit.STEEL_DUST, new ItemStack(ItemInit.STEEL_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(BlockInit.SEARIUM_ORE, new ItemStack(ItemInit.SEARIUM_INGOT, 1), 2.0f);
		GameRegistry.addSmelting(BlockInit.VALIUM_ORE, new ItemStack(ItemInit.VALIUM_INGOT, 1), 2.0f);
		GameRegistry.addSmelting(BlockInit.COPPER_ORE, new ItemStack(ItemInit.COPPER_INGOT, 1), 2.0f);
		GameRegistry.addSmelting(BlockInit.TIN_ORE, new ItemStack(ItemInit.TIN_INGOT, 1), 2.0f);
		GameRegistry.addSmelting(BlockInit.TITANIUM_ORE, new ItemStack(ItemInit.TITANIUM_INGOT, 1), 2.0f);
		GameRegistry.addSmelting(ItemInit.LARGE_GALARITE_CLUMP, new ItemStack(ItemInit.GALARITE_INGOT, 1), 2.0f);
		GameRegistry.addSmelting(BlockInit.TEKRITIUM_ORE, new ItemStack(ItemInit.TEKRITIUM_INGOT, 1), 2.0f);
	}
	
}
