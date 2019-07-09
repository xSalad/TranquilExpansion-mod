package salad.mod.world;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import salad.mod.init.BlockInit;

public class ModWorldGen implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		if (world.provider.getDimension() == 0) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		generateOre(BlockInit.SEARIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 3, 10, random.nextInt(6) + 2, 8);
		generateOre(BlockInit.GALARITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 3, 9, random.nextInt(5) + 1, 6);
		generateOre(BlockInit.COPPER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 56, random.nextInt(10) + 3, 11);
		generateOre(BlockInit.TIN_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 14, 48, random.nextInt(7) + 2, 9);
		generateOre(BlockInit.TITANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 8, 22, random.nextInt(6) + 3, 9);
		generateOre(BlockInit.LUMIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 7, 25, random.nextInt(3) + 1, 8);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
