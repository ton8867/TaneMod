package ton.main;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigCore {
	public static Configuration cfg;
	public static int tanediamondmaxgen;
	public static int taneironmaxgen;
	public static int taneoremaxgen;
	public static int taneironoreformationaltitude;
	public static int tanediamondoreformationaltitude;
	public static int taneoreformarionalitude;
	private static final String maxoregen="MaxOreGenerator";
	private static final String oreformalt ="Oreformationaltitude";
	private static final String other="other";
	public static void load_config(FMLPreInitializationEvent event) {
		cfg=new Configuration(event.getSuggestedConfigurationFile(),Reference.MOD_VERSION, false);
		try {
			cfg.load();
			tanediamondmaxgen=cfg.getInt("tanediamond",maxoregen,  3,  1,64,"Maximum number of tane diamond ore produced in one vein");
			taneironmaxgen=cfg.getInt("taneiron", maxoregen, 8, 1, 64, "Maximum number of tane iron ore produced in one vein");
			taneoremaxgen=cfg.getInt("taneore", maxoregen, 2, 1, 64, "Maximum number of tane ore produced in one vein");
			taneoreformarionalitude=cfg.getInt("taneore", oreformalt, 14, 8, 60, "tane ore formation altitude");
			tanediamondoreformationaltitude=cfg.getInt("tanediamond", oreformalt, 14, 8, 60, "tane diamond ore formation altitude");
			taneironoreformationaltitude=cfg.getInt("taneiron", oreformalt,30, 8, 60, "tane iron ore formation altitude");
		}finally {
			cfg.save();
		}
	}
}
