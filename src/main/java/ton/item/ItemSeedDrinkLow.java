package ton.item;

import javax.annotation.Nonnull;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ton.main.Tane;
import ton.register.RegisterAchievement;

public class ItemSeedDrinkLow extends ItemFood{

	public PotionEffect [] effects;

	public ItemSeedDrinkLow(int amount,boolean isWolfFood) {
		super(amount,1F,isWolfFood);
		String name = "aojirulow";
		this.setCreativeTab(Tane.TaneItems);
		this.setTextureName("tane:aojirulow");
		this.setUnlocalizedName(name);
		this.setAlwaysEdible();
		this.setMaxStackSize(1);
		GameRegistry.registerItem(this,name);
		return;
	}
	@Override
	public int getMaxItemUseDuration(ItemStack p_77626_1_) {
		return 80;
	}
	@Override
	public ItemStack onEaten(ItemStack itemStack,World world,EntityPlayer player) {
		player.triggerAchievement(RegisterAchievement.DrinkAojiru);
		PotionEffect effect = new PotionEffect(Potion.poison.id,40,1);
		player.addPotionEffect(effect);
		PotionEffect effect1 = new PotionEffect(Potion.confusion.id,160,2);
		player.addPotionEffect(effect1);
		PotionEffect effect2 = new PotionEffect(Potion.regeneration.id,40,1);
		player.addPotionEffect(effect2);
		super.onEaten(itemStack, world, player);
		return new ItemStack(Items.glass_bottle);
	}
	@Override
	public EnumAction getItemUseAction(@Nonnull ItemStack itemStack) {
		return EnumAction.drink;
	}

}
