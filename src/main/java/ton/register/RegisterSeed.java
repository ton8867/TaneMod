package ton.register;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import ton.main.Tane;

public class RegisterSeed {
	public static void registry( Tane mod ) {
		MinecraftForge.addGrassSeed(new ItemStack(RegisterItem.CursedSeed),1);
		}
}

