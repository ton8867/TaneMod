package ton.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ton.main.Tane;

public class ItemTaneIngot extends Item{
	public ItemTaneIngot() {
		String name="tane_ingot";
		this.setCreativeTab(Tane.TaneItems);
		this.setUnlocalizedName(name);
		this.setTextureName("tane:tane_ingot");
		this.setMaxStackSize(64);
		GameRegistry.registerItem(this,name);
	}
}
