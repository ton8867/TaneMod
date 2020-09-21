package ton.register;

import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import ton.main.Tane;
import ton.weapons.WeaponCursedTaneDiamondSword;

public class RegisterWeapon {
	public static ItemSword CursedTaneDiamondSword;
	public static void registry( Tane mod ){
		CursedTaneDiamondSword=new WeaponCursedTaneDiamondSword(EnumHelper.addToolMaterial("tanediamond_sword", 0, 120000, 0F, 1200.0F, 10));
	}
}
