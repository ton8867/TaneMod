package ton.register;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import ton.main.Tane;
import ton.tools.ToolSickle;

public class RegisterTool {
	public static ItemTool Sickle;
	public static void registry( Tane mod ) {
		Sickle = new ToolSickle(EnumHelper.addToolMaterial("Sickle", 0, 90, 10.0F, 8.0F, 10)
		.setRepairItem(new ItemStack(Items.iron_ingot))) {
			public void onCreated(ItemStack stack,World world,EntityPlayer player) {
				player.triggerAchievement(RegisterAchievement.CreateSickle);
				super.onCreated(stack, world, player);
			}
		};
		return;
	}
}
