package p040o;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuItemImpl;

/* renamed from: o.nElementCreate2 */
public final class nElementCreate2 extends MenuItemImpl {
    public nElementCreate2(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) MediaBrowserCompat$ItemReceiver(i, i2, i3, charSequence);
        nElementGetSubElements nelementgetsubelements = new nElementGetSubElements(this.write, this, menuItemImpl);
        menuItemImpl.MediaSessionCompat$ResultReceiverWrapper = nelementgetsubelements;
        nelementgetsubelements.setHeaderTitle(menuItemImpl.getTitle());
        return nelementgetsubelements;
    }
}
