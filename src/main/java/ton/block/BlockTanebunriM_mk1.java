package ton.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ton.main.Tane;

public class BlockTanebunriM_mk1 extends Block{
	public BlockTanebunriM_mk1() {
		super (Material.iron);
		String name ="tanebunrim_mk1";
		this.setCreativeTab(Tane.TaneBlocks);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundTypeMetal);
		this.setHarvestLevel("pickaxe", 1);
		this.setBlockName(name);
		this.setBlockTextureName("tane:tanebunriM1");
		GameRegistry.registerBlock(this, name);
	}
}
