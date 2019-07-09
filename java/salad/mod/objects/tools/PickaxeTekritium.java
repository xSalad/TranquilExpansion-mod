package salad.mod.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import salad.mod.Main;
import salad.mod.init.ItemInit;
import salad.mod.util.interfaces.IHasModel;

public class PickaxeTekritium extends ItemPickaxe implements IHasModel
{
		public PickaxeTekritium(String name, ToolMaterial material)
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
		
		@Override
		public boolean hitEntity(ItemStack stack, EntityLivingBase hitEntity, EntityLivingBase attackingEntity) {
		hitEntity.setFire(4);
		return true;
		}
}
