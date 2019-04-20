package salad.mod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MetalBlock1 extends BlockBase
{

	public MetalBlock1(String name, Material material) 
	{
		super(name, material);

		setSoundType(SoundType.METAL);
		setHardness(4.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 1);
	}
}
