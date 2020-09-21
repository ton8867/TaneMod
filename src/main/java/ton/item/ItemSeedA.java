package ton.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ton.main.Tane;

public class ItemSeedA extends ItemFood{
	public ItemSeedA(int amount,boolean isWolfFood) {
		super(amount,1F,isWolfFood);
		String name = "seeda";
		this.setCreativeTab(Tane.TaneItems);
		this.setUnlocalizedName(name);
		this.setTextureName("tane:seedA");
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
		PotionEffect effect = new PotionEffect(Potion.regeneration.id,40,1);
		player.addPotionEffect(effect);
		super.onEaten(itemStack, world, player);
		return itemStack;
	}
}
