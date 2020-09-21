package ton.generator;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import ton.main.ConfigCore;
import ton.register.RegisterBlock;

public class WorldOreGenerator implements IWorldGenerator{

	public WorldGenerator TaneIronOre;
	public WorldGenerator TaneDiamondOre;
	public WorldGenerator TaneOre;

	public WorldOreGenerator(){
		TaneIronOre = new WorldGenMinable(RegisterBlock.TaneIronOre, ConfigCore.taneironmaxgen);
		TaneDiamondOre = new WorldGenMinable(RegisterBlock.TaneDiamondOre, ConfigCore.tanediamondmaxgen);
		TaneOre = new WorldGenMinable(RegisterBlock.TaneOre, ConfigCore.taneoremaxgen);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,IChunkProvider chunkProvider) {
		if (world.provider instanceof WorldProviderSurface) {
			TaneIronOreGenerator(world,random, chunkX<<4, chunkZ<<4);
			TaneDiamondOreGenerator(world,random,chunkX<<4,chunkZ<<4);
			TaneOreGenerator(world,random,chunkX<<4,chunkZ<<4);
		}
	}

	private void TaneIronOreGenerator(World world,Random random,int x, int z) {
		for(int i = 0; i < 8; i++) {
			int genX = x + random.nextInt(16);
			int genY = 1 + random.nextInt(ConfigCore.taneironoreformationaltitude);
			int genZ = z + random.nextInt(16);
			TaneIronOre.generate(world, random, genX, genY, genZ);
		}
	}
	private void TaneDiamondOreGenerator(World world,Random random,int x, int z) {
		for(int i = 0; i < 8; i++) {
			int genX = x + random.nextInt(16);
			int genY = 1 + random.nextInt(ConfigCore.tanediamondoreformationaltitude);
			int genZ = z + random.nextInt(16);
			TaneDiamondOre.generate(world, random, genX, genY, genZ);
		}
	}
	private void TaneOreGenerator(World world,Random random,int x, int z) {
		for(int i = 0; i < 8; i++) {
			int genX = x + random.nextInt(16);
			int genY = 1 + random.nextInt(ConfigCore.taneoreformarionalitude);
			int genZ = z + random.nextInt(16);
			TaneDiamondOre.generate(world, random, genX, genY, genZ);
		}
	}
}
