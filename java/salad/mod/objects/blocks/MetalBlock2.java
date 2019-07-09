package salad.mod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MetalBlock2 extends BlockBase
{

	public MetalBlock2(String name, Material material) 
	{
		super(name, material);

		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
	}
}
