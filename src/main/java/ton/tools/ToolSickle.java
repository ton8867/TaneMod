package ton.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import ton.main.Tane;

public class ToolSickle extends ItemTool{
	private static final Set canHarvestBlock = Sets.newHashSet(new Block[] { Blocks.leaves,Blocks.leaves2 });
	public ToolSickle(ToolMaterial toolMaterial) {
		super(0.0F,toolMaterial,canHarvestBlock);
		String name="sickle";
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tane.TaneItems);
		this.setTextureName("tane:toolsickle");
		this.setMaxDamage(90);
		this.setMaxStackSize(1);
		GameRegistry.registerItem(this, name);
	}
	@Override
	public boolean func_150897_b(Block block) {
		if(block.getMaterial()==Material.leaves) {
			return true;
		}else {
			return false;
		}
	 }
	@Override
	public boolean hitEntity(ItemStack itemStack,EntityLivingBase target,EntityLivingBase player) {
		itemStack.damageItem(4, player);
		return true;
	}
	@Override
	public EnumAction getItemUseAction(ItemStack itemStack) {
		return EnumAction.block;
	}
	@Override
	public int getMaxItemUseDuration(ItemStack itemStack) {
		return 150;
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack,World world,EntityPlayer player) {
		player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
		return itemStack;
	}
	@Override
	public boolean hasContainerItem(ItemStack stack){
		return true;
	}
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		if (itemStack.getMaxDamage()==itemStack.getItemDamage()) {
			return (ItemStack) null;
		}else {
			ItemStack newItemStack = itemStack.copy();
			newItemStack.setItemDamage(itemStack.getItemDamage()+1);
			return newItemStack;
		}
	}
}
