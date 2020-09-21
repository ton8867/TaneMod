package ton.register;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import ton.achievement.TaneEvent;
import ton.main.Tane;

public class RegisterAchievement {
	public static Achievement GetTheCurse;
	public static Achievement TheBeginningOfEverything;
	public static Achievement GetSeedIron;
	public static Achievement AteTheCurse;
	public static Achievement CreateSickle;
	public static Achievement DrinkAojiru;
	public static Achievement GetTheHoly;
	public static Achievement CursevsHoly;
	public static Achievement HolyisDelicious;
	public static Achievement GetNewMetal;
	public static void registory(Tane mod) {
/*主*/
		 TheBeginningOfEverything = new Achievement("TheBeginningOfEverything","TheBeginningOfEverything",0,0,new ItemStack(Items.wheat_seeds,0,0),null).registerStat();
		 CreateSickle = new Achievement("CreateSickle","CreateSickle", 2,0,new ItemStack(RegisterItem.KakushiSickle,0,0),TheBeginningOfEverything).registerStat();
		 GetSeedIron = new Achievement("GetSeedIron","GetSeedIron", 2,1,new ItemStack(RegisterItem.TaneIron,0,0),TheBeginningOfEverything).registerStat();
		 DrinkAojiru = new Achievement("DrinkAojiru", "DrinkAojiru", 2,2, new ItemStack(RegisterItem.AojiruLow), TheBeginningOfEverything);
		 GetNewMetal=new Achievement("GetNewMetal", "GetNewMetal", 2, 3, new ItemStack(RegisterItem.TaneIngot), TheBeginningOfEverything);
		 AchievementPage.registerAchievementPage(new AchievementPage("TaneModMain", new Achievement[] {TheBeginningOfEverything,GetSeedIron,CreateSickle,DrinkAojiru}));
/*呪*/
		 GetTheCurse = new Achievement("GetTheCurse", "GetTheCurse", 0, 0,new ItemStack(RegisterItem.CursedSeed, 0,0),null).registerStat();
		 AteTheCurse = new Achievement("AteTheCurse","AteTheCurse", 2,0,new ItemStack(RegisterItem.CursedSeed,0,0),GetTheCurse).registerStat();
		 AchievementPage.registerAchievementPage(new AchievementPage("TanemodCurse", new Achievement[] {GetTheCurse,AteTheCurse}));
/*聖*/
		 GetTheHoly = new Achievement("GetTheHoly", "GetTheHoly", 0, 0, new ItemStack(RegisterItem.HolySeed,0,0), null).registerStat();
		 CursevsHoly = new Achievement("CursevsHoly", "CursevsHoly", 2, 0, Items.wheat_seeds, GetTheHoly).registerStat();
		 HolyisDelicious = new Achievement("HolyisDelicious", "HolyisDelicious", 2, 2, Items.cooked_beef, GetTheHoly).registerStat();
		 AchievementPage.registerAchievementPage(new AchievementPage("TanemodHoly", new Achievement[] {GetTheHoly,CursevsHoly,HolyisDelicious}));

		 MinecraftForge.EVENT_BUS.register(new TaneEvent());
		 return;
	}
}
