package salad.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import salad.mod.init.ModRecipes;
import salad.mod.proxy.CommonProxy;
import salad.mod.tabs.TranquilExpansion;
import salad.mod.util.Reference;
import salad.mod.util.handlers.RegistryHandler;
import salad.mod.world.ModWorldGen;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static final CreativeTabs tranquilexpansion = new TranquilExpansion("tranquilexpansion");
	
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		RegistryHandler.initRegistries();
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	{
		ModRecipes.init();
	}
}
