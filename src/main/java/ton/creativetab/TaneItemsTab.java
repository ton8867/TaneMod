package ton.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TaneItemsTab extends CreativeTabs{
	public TaneItemsTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Items.wheat_seeds;
	}
}
