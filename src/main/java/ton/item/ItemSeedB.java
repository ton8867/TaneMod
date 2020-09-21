package ton.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ton.main.Tane;

public class ItemSeedB extends ItemFood{
	public ItemSeedB(int amount,boolean isWolfFood) {
		super(amount,1F,isWolfFood);
		String name="seedb";
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tane.TaneItems);
		this.setTextureName("tane:seedB");
		this.setAlwaysEdible();
		this.setMaxStackSize(64);
		GameRegistry.registerItem(this, name);
	}
	@Override
	public int getMaxItemUseDuration(ItemStack itemStack) {
		return 10;
	}
	@Override
	public ItemStack onEaten(ItemStack itemStack,World world, EntityPlayer player) {
		PotionEffect effect = new PotionEffect(Potion.poison.id,40,1);
		player.addPotionEffect(effect);
		PotionEffect effect1 = new PotionEffect(Potion.confusion.id,160,2);
		player.addPotionEffect(effect1);
		super.onEaten(itemStack, world, player);
		return itemStack;
	}
}
