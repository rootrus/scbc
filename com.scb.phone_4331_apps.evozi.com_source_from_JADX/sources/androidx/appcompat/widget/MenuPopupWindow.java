package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import p040o.MenuItemImpl;
import p040o.setContentHeight;
import p040o.setOnMenuItemClickListener;
import p040o.setUiOptions;

public final class MenuPopupWindow extends setUiOptions implements setOnMenuItemClickListener {
    public static Method MediaBrowserCompat$ItemReceiver;
    public setOnMenuItemClickListener read;

    static {
        try {
            MediaBrowserCompat$ItemReceiver = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(Context context, int i, int i2) {
        super(context, (AttributeSet) null, i, i2);
    }

    public final DropDownListView IconCompatParcelizer(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    public final void write(MenuItemImpl menuItemImpl, MenuItem menuItem) {
        setOnMenuItemClickListener setonmenuitemclicklistener = this.read;
        if (setonmenuitemclicklistener != null) {
            setonmenuitemclicklistener.write(menuItemImpl, menuItem);
        }
    }

    public final void IconCompatParcelizer(MenuItemImpl menuItemImpl, MenuItem menuItem) {
        setOnMenuItemClickListener setonmenuitemclicklistener = this.read;
        if (setonmenuitemclicklistener != null) {
            setonmenuitemclicklistener.IconCompatParcelizer(menuItemImpl, menuItem);
        }
    }

    public static class MenuDropDownListView extends DropDownListView {
        final int IconCompatParcelizer;
        final int MediaBrowserCompat$ItemReceiver;
        private MenuItem MediaBrowserCompat$SearchResultReceiver;
        private setOnMenuItemClickListener write;

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public final /* bridge */ /* synthetic */ int write(int i, int i2, int i3, int i4, int i5) {
            return super.write(i, i2, i3, i4, i5);
        }

        public final /* bridge */ /* synthetic */ boolean write(MotionEvent motionEvent, int i) {
            return super.write(motionEvent, i);
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.MediaBrowserCompat$ItemReceiver = 22;
                this.IconCompatParcelizer = 21;
                return;
            }
            this.MediaBrowserCompat$ItemReceiver = 21;
            this.IconCompatParcelizer = 22;
        }

        public void setHoverListener(setOnMenuItemClickListener setonmenuitemclicklistener) {
            this.write = setonmenuitemclicklistener;
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.MediaBrowserCompat$ItemReceiver) {
                if (listMenuItemView.isEnabled() && listMenuItemView.IconCompatParcelizer.hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.IconCompatParcelizer) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((setContentHeight) getAdapter()).read.read(false);
                return true;
            }
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            setContentHeight setcontentheight;
            int pointToPosition;
            int i2;
            if (this.write != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    setcontentheight = (setContentHeight) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    setcontentheight = (setContentHeight) adapter;
                }
                androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < setcontentheight.getCount()) {
                    menuItemImpl = setcontentheight.getItem(i2);
                }
                MenuItem menuItem = this.MediaBrowserCompat$SearchResultReceiver;
                if (menuItem != menuItemImpl) {
                    MenuItemImpl menuItemImpl2 = setcontentheight.read;
                    if (menuItem != null) {
                        this.write.IconCompatParcelizer(menuItemImpl2, menuItem);
                    }
                    this.MediaBrowserCompat$SearchResultReceiver = menuItemImpl;
                    if (menuItemImpl != null) {
                        this.write.write(menuItemImpl2, menuItemImpl);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }
}
