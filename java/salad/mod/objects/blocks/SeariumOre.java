package salad.mod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SeariumOre extends BlockBase
{

	public SeariumOre(String name, Material material) 
	{
		super(name, material);

		setSoundType(SoundType.STONE);
		setHardness(6.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 3);
	}
}
