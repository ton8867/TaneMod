package ton.register;

import cpw.mods.fml.common.registry.GameRegistry;
import ton.generator.WorldOreGenerator;
import ton.main.Tane;

public class RegisterWorldGen {
	public static void registry(Tane mod) {
		GameRegistry.registerWorldGenerator(new WorldOreGenerator(), 0);
	}
}
