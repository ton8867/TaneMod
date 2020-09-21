package ton.register;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ton.item.ItemCursedSeed;
import ton.item.ItemHolySeed;
import ton.item.ItemSeedA;
import ton.item.ItemSeedAsh;
import ton.item.ItemSeedB;
import ton.item.ItemSeedDrinkLow;
import ton.item.ItemTaneIngot;
import ton.item.ItemTaneIron_Ingot;
import ton.main.Tane;

public class RegisterItem {

	public static Item TaneIron;
	public static Item TaneDiamond;
	public static Item KakushiSickle;
	public static Item SeedAsh;
	public static Item TaneCurseIngot;
	public static Item TaneHolyIngot;
	public static Item TaneIngot;

	public static ItemFood SeedA;
	public static ItemFood SeedB;
	public static ItemFood AojiruLow;

	public static ItemSeedFood HolySeed;
	public static ItemSeedFood CursedSeed;

	public static void registry( Tane mod ) {
		CursedSeed = new ItemCursedSeed();
		SeedA = new ItemSeedA(1,false);
		SeedB = new ItemSeedB(1,false);
		KakushiSickle=new Item().setUnlocalizedName("KakushiSickle").setTextureName("tane:toolSickle").setMaxStackSize(64);GameRegistry.registerItem(KakushiSickle, "KakushiSickle");
		TaneIron = new ItemTaneIron_Ingot() {
			@Override
			public void onCreated(ItemStack stack,World world, EntityPlayer player) {
				player.triggerAchievement(RegisterAchievement.GetSeedIron);
				super.onCreated(stack, world, player);
			}
		};
		TaneDiamond = new Item().setUnlocalizedName("tanediamond").setCreativeTab(Tane.TaneItems).setTextureName("tane:tane_daimond").setMaxStackSize(64);GameRegistry.registerItem(TaneDiamond, "tanediamond");
		AojiruLow = new ItemSeedDrinkLow(10,false);
		HolySeed=new ItemHolySeed();
		SeedAsh=new ItemSeedAsh() {
			@Override
			public void onCreated(ItemStack itemStack,World world,EntityPlayer player) {
				int x=0;
				int y=0;
				int z=0;
				player.triggerAchievement(RegisterAchievement.CursevsHoly);
				x=player.getPlayerCoordinates().posX;
				y=player.getPlayerCoordinates().posY;
				z=player.getPlayerCoordinates().posZ;
				this.explode(world,x,y,z);
				super.onCreated(itemStack, world, player);
			}
			public void explode(World world,int x,int y,int z) {
				world.createExplosion(null, x+0.5, y+0.5, z+0.5,2F,true);
			}
		};
		TaneCurseIngot=new Item().setCreativeTab(Tane.TaneItems).setUnlocalizedName("tanecurse_ingot").setTextureName("tane:puretanecurseingot").setMaxStackSize(64);GameRegistry.registerItem(TaneCurseIngot,"tanecurse_ingot");
		TaneHolyIngot=new Item().setCreativeTab(Tane.TaneItems).setUnlocalizedName("taneholy_ingot").setTextureName("tane:taneholyingot").setMaxStackSize(64);GameRegistry.registerItem(TaneHolyIngot, "taneholy_ingot");
		TaneIngot=new ItemTaneIngot() {
			@Override
			public void onCreated(ItemStack stack,World world, EntityPlayer player) {
				player.triggerAchievement(RegisterAchievement.GetNewMetal);
				super.onCreated(stack, world, player);
			}
		};
		return;
	}


}
