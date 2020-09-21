package ton.register;

import net.minecraft.block.Block;
import ton.block.BlockTaneDiamondBlock;
import ton.block.BlockTaneDiamondOre;
import ton.block.BlockTaneIronOre;
import ton.block.BlockTaneOre;
import ton.block.BlockTanebunriM_mk1;
import ton.main.Tane;

public class RegisterBlock {

	public static Block TaneIronOre;
	public static Block TanebunriM_Mk1;
	public static Block TaneDiamondOre;
	public static Block CursedSeedCrop;
	public static Block TaneDiamondBlock;
	public static Block TaneOre;

	public static void registory (Tane mod){
		TaneDiamondBlock = new BlockTaneDiamondBlock();
		TaneIronOre = new BlockTaneIronOre();
		TanebunriM_Mk1 = new BlockTanebunriM_mk1();
		TaneDiamondOre =new BlockTaneDiamondOre();
		TaneOre=new BlockTaneOre();
	}
}