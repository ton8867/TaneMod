package ton.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ton.main.Tane;

public class BlockTaneIronOre extends Block{
	public BlockTaneIronOre() {
		super(Material.rock);
		String name="taneiron_ore";
		this.setCreativeTab(Tane.TaneBlocks);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundTypeStone);
		this.setHarvestLevel("pickaxe", 1);
		this.setBlockName(name);
		this.setBlockTextureName("tane:TaneIronOre");
		GameRegistry.registerBlock(this, name);
	}
}
