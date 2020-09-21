package ton.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import ton.creativetab.TaneBlocksTab;
import ton.creativetab.TaneItemsTab;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.MOD_VERSION)
public class Tane {

	public static CreativeTabs TaneItems = new TaneItemsTab("TaneItems");
	public static CreativeTabs TaneBlocks = new TaneBlocksTab("TaneBlocks");

		@EventHandler
		public void preInit(FMLPreInitializationEvent event) {
			RegisterMaster.preregistry(this);
			ConfigCore.load_config(event);
		}

		@EventHandler
		public void init(FMLInitializationEvent event) {
			RegisterMaster.registry(this);
		}

		@EventHandler
		public void postInit(FMLPostInitializationEvent event) {
			RegisterMaster.postregistry(this);
		}
	}
