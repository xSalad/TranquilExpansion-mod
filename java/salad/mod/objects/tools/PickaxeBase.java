package salad.mod.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import salad.mod.Main;
import salad.mod.init.ItemInit;
import salad.mod.util.interfaces.IHasModel;

public class PickaxeBase extends ItemPickaxe implements IHasModel
{
		public PickaxeBase(String name, ToolMaterial material)
		{
			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.tranquilexpansion);
			
			ItemInit.ITEMS.add(this);
		}
		@Override
		public void registerModels()
		{
			Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
}
