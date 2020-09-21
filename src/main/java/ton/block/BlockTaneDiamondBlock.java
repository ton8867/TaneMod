package ton.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ton.main.Tane;

public class BlockTaneDiamondBlock extends Block{
	public BlockTaneDiamondBlock(){
		super(Material.rock);
		String name="tanediamond_block";
		this.setBlockName(name);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
		this.setStepSound(Block.soundTypeStone);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName("tane:TaneDiamondBlock");
		this.setCreativeTab(Tane.TaneBlocks);
		GameRegistry.registerBlock(this, name);
	}
}
