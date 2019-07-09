package salad.mod.objects.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import salad.mod.init.ItemInit;

public class GalariteOre extends BlockBase
{

	public GalariteOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(6.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 4);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ItemInit.GALARITE_CLUMP;
	}
	
	@Override
	public int quantityDropped(Random rand) 
	{
		int max = 5;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
