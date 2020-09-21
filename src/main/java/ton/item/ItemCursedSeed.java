package ton.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ton.main.Tane;
import ton.register.RegisterAchievement;

public class ItemCursedSeed extends ItemSeedFood{
	public PotionEffect [] effects;
	public ItemCursedSeed() {
		super(0, 0.0F, Blocks.wheat,Blocks.farmland);
		String name = "cursedseed";
		this.setCreativeTab(Tane.TaneItems);
		this.setUnlocalizedName(name);
		this.setTextureName("tane:cursedseed");
		this.setAlwaysEdible();
		this.setMaxStackSize(64);
		GameRegistry.registerItem( this,name );
	}
	@Override
	public int getMaxItemUseDuration(ItemStack itemStack) {
		return 120;
	}
	@Override
	public ItemStack onEaten(ItemStack itemStack,World world, EntityPlayer player) {
		player.triggerAchievement(RegisterAchievement.AteTheCurse);
		PotionEffect effect = new PotionEffect(Potion.digSlowdown.id,2400,5);
		player.addPotionEffect(effect);
		PotionEffect effect1 = new PotionEffect(Potion.moveSlowdown.id,2400,5);
		player.addPotionEffect(effect1);
		PotionEffect effect2 = new PotionEffect(Potion.wither.id,2400,255);
		player.addPotionEffect(effect2);
		PotionEffect effect3 = new PotionEffect(Potion.weakness.id,2400,20);
		player.addPotionEffect(effect3);
		PotionEffect effect4 = new PotionEffect(Potion.hunger.id,2400,5);
		player.addPotionEffect(effect4);
		PotionEffect effect5 = new PotionEffect(Potion.blindness.id,2400,20);
		player.addPotionEffect(effect5);
		PotionEffect effect6 = new PotionEffect(Potion.confusion.id,2400,20);
		player.addPotionEffect(effect6);
		PotionEffect effect7 = new PotionEffect(Potion.poison.id,2400,255);
		player.addPotionEffect(effect7);
		super.onEaten(itemStack, world, player);
		return itemStack;
	}
}

