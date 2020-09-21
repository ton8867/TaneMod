package ton.block;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ton.main.Tane;

public class BlockTaneOre extends Block{
	public BlockTaneOre() {
		super(Material.rock);
		String name="tane_ore";
		this.setCreativeTab(Tane.TaneBlocks);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundTypeStone);
		this.setHarvestLevel("pickaxe", 2);
		this.setBlockName(name);
		this.setBlockTextureName("tane:tane_ore");
		GameRegistry.registerBlock(this, name);
	}
}
