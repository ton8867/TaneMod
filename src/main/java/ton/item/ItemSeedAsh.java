package ton.item;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ton.main.Tane;

public class ItemSeedAsh extends Item{
	public ItemSeedAsh() {
		String name="seed_ash";
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tane.TaneItems);
		this.setMaxStackSize(64);
		this.setTextureName("tane:seed_ash");
		GameRegistry.registerItem(this, name);
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
			list.add("§4Warning:Explode");
	}
}
