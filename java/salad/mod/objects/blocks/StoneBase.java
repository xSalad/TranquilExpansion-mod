package salad.mod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class StoneBase extends BlockBase
{

	public StoneBase(String name, Material material) 
	{
		super(name, material);

		setSoundType(SoundType.STONE);
		setHardness(4.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 0);
	}
}
