package salad.mod.util.handlers;

import net.minecraftforge.fml.common.registry.GameRegistry;
import salad.mod.objects.blocks.machines.alloy_caster.TileEntityAlloyCaster;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityAlloyCaster.class, "alloy_caster");
	}
}
