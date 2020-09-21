package ton.block;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import ton.main.Tane;
import ton.register.RegisterItem;

public class BlockTaneDiamondOre extends Block{
	public BlockTaneDiamondOre() {
		super(Material.rock);
		String name="tanediamond_ore";
		this.setCreativeTab(Tane.TaneBlocks);
		this.setHardness(5.0F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundTypeStone);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockName(name);
		this.setBlockTextureName("tane:TaneDiamondOre");
		GameRegistry.registerBlock(this, name);
	}
	@Override
    public Item getItemDropped(int meta, Random random,int fortune){
        return RegisterItem.TaneDiamond;
    }

    @Override
    public int getExpDrop(IBlockAccess iBlockAccess,int meta,int fortune) {
    	return 5;
    }
}
