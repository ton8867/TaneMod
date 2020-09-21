package ton.main;

import ton.register.RegisterAchievement;
import ton.register.RegisterBlock;
import ton.register.RegisterEntity;
import ton.register.RegisterItem;
import ton.register.RegisterPotion;
import ton.register.RegisterRecipes;
import ton.register.RegisterSeed;
import ton.register.RegisterTool;
import ton.register.RegisterWeapon;
import ton.register.RegisterWorldGen;

public class RegisterMaster {
	public static void preregistry(Tane mod) {
		RegisterItem.registry(mod);
		RegisterPotion.registory(mod);
		RegisterAchievement.registory(mod);
		RegisterBlock.registory(mod);
		RegisterTool.registry(mod);
		RegisterWeapon.registry(mod);
		return;
	}
	public static void registry(Tane mod) {
		RegisterRecipes.registry(mod);
		RegisterWorldGen.registry(mod);
		RegisterSeed.registry(mod);
		RegisterEntity.registory(mod);
		return;
	}
	public static void postregistry(Tane mod) {
		return;
	}
}
