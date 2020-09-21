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

public class ItemHolySeed extends ItemSeedFood{
	public PotionEffect [] effects;

	public ItemHolySeed() {
		super(5,1F,Blocks.wheat,Blocks.farmland);
		String name="holyseed";
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tane.TaneItems);
		this.setAlwaysEdible();
		this.setMaxStackSize(64);
		this.setTextureName("tane:holyseed");
		GameRegistry.registerItem(this, name);
	}
	@Override
	public int getMaxItemUseDuration(ItemStack itemStack) {
		return 50;
	}
	@Override
	public ItemStack onEaten(ItemStack itemStack,World world,EntityPlayer player) {
		player.triggerAchievement(RegisterAchievement.HolyisDelicious);
		PotionEffect effect = new PotionEffect(Potion.regeneration.id,80,1);
		player.addPotionEffect(effect);
		PotionEffect effect1 = new PotionEffect(Potion.resistance.id,80,1);
		player.addPotionEffect(effect1);
		PotionEffect effect2 = new PotionEffect(Potion.moveSpeed.id,80,1);
		player.addPotionEffect(effect2);
		player.removePotionEffect(Potion.confusion.getId());
		player.removePotionEffect(Potion.digSlowdown.getId());
		player.removePotionEffect(Potion.hunger.getId());
		player.removePotionEffect(Potion.moveSlowdown.getId());
		player.removePotionEffect(Potion.wither.getId());
		player.removePotionEffect(Potion.blindness.getId());
		player.removePotionEffect(Potion.poison.getId());
		player.removePotionEffect(Potion.weakness.getId());
		super.onEaten(itemStack, world, player);
		return itemStack;
	}
	@Override
    public boolean hasEffect(ItemStack itemStack){
        return true;
    }
}
