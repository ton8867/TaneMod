package ton.register;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import ton.main.Tane;

public class RegisterRecipes {
	public static void registry(Tane mod) {
		GameRegistry.addShapelessRecipe(new ItemStack(Items.wheat_seeds,4),
			Items.wheat,
			new ItemStack(RegisterTool.Sickle,1,OreDictionary.WILDCARD_VALUE)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(RegisterItem.AojiruLow,1),
			Items.potionitem,
			Items.wheat_seeds,
			Items.wheat_seeds,
			Items.wheat_seeds,
			Items.wheat_seeds,
			Items.wheat_seeds);
		GameRegistry.addRecipe(new ItemStack(RegisterTool.Sickle),
		    "xxz",
		    "x y",
		    "  y",
		    'x',Items.iron_ingot,
		    'z',Blocks.iron_block,
		    'y',Items.stick
		);
		GameRegistry.addShapelessRecipe(new ItemStack(RegisterItem.SeedAsh,3),
			RegisterItem.CursedSeed,
			RegisterItem.HolySeed
			);
		GameRegistry.addSmelting(RegisterBlock.TaneIronOre,new ItemStack(RegisterItem.TaneIron,1),0.1F);//かまど
		GameRegistry.addSmelting(RegisterBlock.TaneOre,new ItemStack(RegisterItem.TaneIngot,1),0.1F);
		GameRegistry.addSmelting(RegisterBlock.TaneDiamondOre, new ItemStack(RegisterItem.TaneDiamond,1), 0.5F);
	}
}
