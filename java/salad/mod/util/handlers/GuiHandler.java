package salad.mod.util.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import salad.mod.objects.blocks.machines.alloy_caster.ContainerAlloyCaster;
import salad.mod.objects.blocks.machines.alloy_caster.GuiAlloyCaster;
import salad.mod.objects.blocks.machines.alloy_caster.TileEntityAlloyCaster;
import salad.mod.util.Reference;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ALLOY_CASTER) return new ContainerAlloyCaster(player.inventory, (TileEntityAlloyCaster)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ALLOY_CASTER) return new GuiAlloyCaster(player.inventory, (TileEntityAlloyCaster)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
}
