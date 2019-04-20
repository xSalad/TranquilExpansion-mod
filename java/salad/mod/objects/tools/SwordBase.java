package salad.mod.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import salad.mod.Main;
import salad.mod.init.ItemInit;
import salad.mod.util.interfaces.IHasModel;

public class SwordBase extends ItemSword implements IHasModel
{
		public SwordBase(String name, ToolMaterial material)
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