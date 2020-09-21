package ton.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TaneBlocksTab extends CreativeTabs{
	public TaneBlocksTab(String label) {
		super(label);
	}
	@Override
	public Item getTabIconItem() {
		return Items.melon_seeds;
	}
}
