package p040o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuItemImpl;
import p040o.CheckCaptureModule;

/* renamed from: o.setPrimaryBackground */
public abstract class setPrimaryBackground implements CheckCaptureModule.C6375a, setStackedBackground, AdapterView.OnItemClickListener {
    Rect MediaMetadataCompat;

    public final void IconCompatParcelizer(Context context, MenuItemImpl menuItemImpl) {
    }

    public abstract void IconCompatParcelizer(View view);

    public abstract void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

    public abstract void MediaBrowserCompat$ItemReceiver(int i);

    public abstract void MediaBrowserCompat$ItemReceiver(PopupWindow.OnDismissListener onDismissListener);

    public abstract void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl);

    /* access modifiers changed from: protected */
    public boolean MediaBrowserCompat$ItemReceiver() {
        return true;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: i_ */
    public final int mo795i_() {
        return 0;
    }

    public abstract void read(int i);

    public abstract void read(boolean z);

    public abstract void write(int i);

    public final boolean write(MenuItemImpl menuItemImpl) {
        return false;
    }

    setPrimaryBackground() {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        setContentHeight setcontentheight;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            setcontentheight = (setContentHeight) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            setcontentheight = (setContentHeight) listAdapter;
        }
        setcontentheight.read.MediaBrowserCompat$ItemReceiver((MenuItem) listAdapter.getItem(i), this, MediaBrowserCompat$ItemReceiver() ? 0 : 4);
    }

    protected static int MediaBrowserCompat$CustomActionResultReceiver(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    protected static boolean read(MenuItemImpl menuItemImpl) {
        int size = menuItemImpl.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuItemImpl.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
