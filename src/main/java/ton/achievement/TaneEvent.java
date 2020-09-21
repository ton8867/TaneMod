package ton.achievement;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import ton.register.RegisterAchievement;
import ton.register.RegisterItem;

public class TaneEvent {

	@SubscribeEvent
	public void EntityItemPickUpEvent (EntityItemPickupEvent e) {
		if (e.entityPlayer != null && e.item != null && e.item.getEntityItem() != null&& e.item.getEntityItem().getItem() == RegisterItem.CursedSeed){
			e.entityPlayer.triggerAchievement(RegisterAchievement.GetTheCurse);
		}
		if (e.entityPlayer != null && e.item != null && e.item.getEntityItem() != null && e.item.getEntityItem().getItem() == Items.wheat_seeds) {
			e.entityPlayer.triggerAchievement(RegisterAchievement.TheBeginningOfEverything);
		}
	}
}