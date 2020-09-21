package ton.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ton.main.Tane;

public class ItemTaneIron_Ingot extends Item{
	public ItemTaneIron_Ingot() {
		String name="taneiron_ingot";
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tane.TaneItems);
		this.setTextureName("tane:taneiron_ingot");
		this.setMaxStackSize(64);
		GameRegistry.registerItem(this, name);
	}
}
