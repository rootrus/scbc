package p040o;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.setForceShowIcon */
public abstract class setForceShowIcon<T> extends ExpandedMenuView<T> {
    private Map<setBaselineAlignedChildIndex, SubMenu> IconCompatParcelizer;
    public final Context read;
    private Map<setGravity, MenuItem> write;

    public setForceShowIcon(Context context, T t) {
        super(t);
        this.read = context;
    }

    public final MenuItem IconCompatParcelizer(MenuItem menuItem) {
        MenuItem menuItem2;
        if (!(menuItem instanceof setGravity)) {
            return menuItem;
        }
        setGravity setgravity = (setGravity) menuItem;
        if (this.write == null) {
            this.write = new setTextAppearance();
        }
        MenuItem menuItem3 = this.write.get(menuItem);
        if (menuItem3 != null) {
            return menuItem3;
        }
        Context context = this.read;
        if (Build.VERSION.SDK_INT >= 16) {
            menuItem2 = new MenuItemWrapperICS$CollapsibleActionViewWrapper(context, setgravity);
        } else {
            menuItem2 = new MenuItemWrapperICS(context, setgravity);
        }
        MenuItem menuItem4 = menuItem2;
        this.write.put(setgravity, menuItem4);
        return menuItem4;
    }

    public final SubMenu read(SubMenu subMenu) {
        if (!(subMenu instanceof setBaselineAlignedChildIndex)) {
            return subMenu;
        }
        setBaselineAlignedChildIndex setbaselinealignedchildindex = (setBaselineAlignedChildIndex) subMenu;
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new setTextAppearance();
        }
        SubMenu subMenu2 = this.IconCompatParcelizer.get(setbaselinealignedchildindex);
        if (subMenu2 != null) {
            return subMenu2;
        }
        setTransitioning settransitioning = new setTransitioning(this.read, setbaselinealignedchildindex);
        this.IconCompatParcelizer.put(setbaselinealignedchildindex, settransitioning);
        return settransitioning;
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        Map<setGravity, MenuItem> map = this.write;
        if (map != null) {
            map.clear();
        }
        Map<setBaselineAlignedChildIndex, SubMenu> map2 = this.IconCompatParcelizer;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        Map<setGravity, MenuItem> map = this.write;
        if (map != null) {
            Iterator<setGravity> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(int i) {
        Map<setGravity, MenuItem> map = this.write;
        if (map != null) {
            Iterator<setGravity> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
