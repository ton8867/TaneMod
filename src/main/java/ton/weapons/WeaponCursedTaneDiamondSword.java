package ton.weapons;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ton.main.Tane;

public class WeaponCursedTaneDiamondSword extends ItemSword{
	public PotionEffect [] effects;
	public WeaponCursedTaneDiamondSword(ToolMaterial toolMaterial) {
		super(toolMaterial);
		String name="tanediamondsword_cursed";
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tane.TaneItems);
		this.setMaxDamage(120000);
		this.setMaxStackSize(1);
		this.setTextureName("tane:cursedseeddiamond_sword");
		GameRegistry.registerItem(this, name);
	}
	@Override
	public boolean hasEffect(ItemStack itemStack) {
		return true;
	}
	@Override
	public boolean hitEntity(ItemStack itemStack,EntityLivingBase target,EntityLivingBase player) {
		PotionEffect effect=new PotionEffect(Potion.moveSlowdown.id,5,500);
		target.addPotionEffect(effect);
		PotionEffect effect2= new PotionEffect(Potion.poison.id,20,500);
		target.addPotionEffect(effect2);
		PotionEffect effect3 = new PotionEffect(Potion.wither.id,5,255);
		target.addPotionEffect(effect3);
		itemStack.damageItem(1,player);
		return true;
	}
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity,int itemSlot,boolean isSelected){
		EntityPlayer player = (EntityPlayer)entity;
		if(isSelected){
			PotionEffect effect = new PotionEffect(Potion.digSlowdown.id,5,5);
			player.addPotionEffect(effect);
			PotionEffect effect1 = new PotionEffect(Potion.jump.id,5,50);
			player.addPotionEffect(effect1);
			PotionEffect effect2 = new PotionEffect(Potion.wither.id,5,255);
			player.addPotionEffect(effect2);
			PotionEffect effect3 = new PotionEffect(Potion.moveSpeed.id,5,255);
			player.addPotionEffect(effect3);
			PotionEffect effect4 = new PotionEffect(Potion.hunger.id,5,5);
			player.addPotionEffect(effect4);
			PotionEffect effect5 = new PotionEffect(Potion.blindness.id,40,255);
			player.addPotionEffect(effect5);
			PotionEffect effect6 = new PotionEffect(Potion.confusion.id,40,255);
			player.addPotionEffect(effect6);
			PotionEffect effect7 = new PotionEffect(Potion.poison.id,5,255);
			player.addPotionEffect(effect7);
		}
		super.onUpdate(stack, world, entity, itemSlot,isSelected);
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
			list.add("Curse");
	}
}
