package buildcraft.api.filler;

import buildcraft.api.core.IBox;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;

public interface IFillerPattern {

	public int getId();

	public void setId(int id);

	public boolean iteratePattern(TileEntity tile, IBox box, ItemStack stackToPlace);

	@SideOnly(Side.CLIENT)
	public Icon getTexture();

	public String getName();

}
