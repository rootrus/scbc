package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p040o.setForceShowIcon;
import p040o.setGravity;
import p040o.setMaxWidth;
import p040o.setPadding;

public class MenuItemWrapperICS extends setForceShowIcon<setGravity> implements MenuItem {
    private Method IconCompatParcelizer;

    public MenuItemWrapperICS(Context context, setGravity setgravity) {
        super(context, setgravity);
    }

    public int getItemId() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getItemId();
    }

    public int getGroupId() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getGroupId();
    }

    public int getOrder() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getOrder();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setTitle(i);
        return this;
    }

    public CharSequence getTitle() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setTitleCondensed(charSequence);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getTitleCondensed();
    }

    public MenuItem setIcon(Drawable drawable) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setIcon(drawable);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setIcon(i);
        return this;
    }

    public Drawable getIcon() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getIntent();
    }

    public MenuItem setShortcut(char c, char c2) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setNumericShortcut(c, i);
        return this;
    }

    public char getNumericShortcut() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getNumericShortcut();
    }

    public int getNumericModifiers() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setAlphabeticShortcut(c, i);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean z) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).isCheckable();
    }

    public MenuItem setChecked(boolean z) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).isChecked();
    }

    public MenuItem setVisible(boolean z) {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).setVisible(z);
    }

    public boolean isVisible() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).isVisible();
    }

    public MenuItem setEnabled(boolean z) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return read(((setGravity) this.MediaBrowserCompat$ItemReceiver).getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemWrapperICS$MediaBrowserCompat$ItemReceiver(this, onMenuItemClickListener) : null);
        return this;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setActionView(view);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setActionView(i);
        View actionView = ((setGravity) this.MediaBrowserCompat$ItemReceiver).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((setGravity) this.MediaBrowserCompat$ItemReceiver).setActionView((View) new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((setGravity) this.MediaBrowserCompat$ItemReceiver).getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? (View) ((CollapsibleActionViewWrapper) actionView).IconCompatParcelizer : actionView;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver(actionProvider != null ? write(actionProvider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        setMaxWidth write = ((setGravity) this.MediaBrowserCompat$ItemReceiver).write();
        if (write instanceof IconCompatParcelizer) {
            return ((IconCompatParcelizer) write).MediaBrowserCompat$CustomActionResultReceiver;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).expandActionView();
    }

    public boolean collapseActionView() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setOnActionExpandListener(onActionExpandListener != null ? new MenuItemWrapperICS$MediaBrowserCompat$CustomActionResultReceiver(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver(charSequence);
        return this;
    }

    public CharSequence getContentDescription() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer(charSequence);
        return this;
    }

    public CharSequence getTooltipText() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setIconTintList(colorStateList);
        return this;
    }

    public ColorStateList getIconTintList() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getIconTintList();
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((setGravity) this.MediaBrowserCompat$ItemReceiver).setIconTintMode(mode);
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((setGravity) this.MediaBrowserCompat$ItemReceiver).getIconTintMode();
    }

    public void MediaBrowserCompat$ItemReceiver(boolean z) {
        try {
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = ((setGravity) this.MediaBrowserCompat$ItemReceiver).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.IconCompatParcelizer.invoke(this.MediaBrowserCompat$ItemReceiver, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    /* access modifiers changed from: protected */
    public IconCompatParcelizer write(ActionProvider actionProvider) {
        return new IconCompatParcelizer(this.read, actionProvider);
    }

    public class IconCompatParcelizer extends setMaxWidth {
        public final ActionProvider MediaBrowserCompat$CustomActionResultReceiver;

        public IconCompatParcelizer(Context context, ActionProvider actionProvider) {
            super(context);
            this.MediaBrowserCompat$CustomActionResultReceiver = actionProvider;
        }

        public View read() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.onCreateActionView();
        }

        public boolean write() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.onPerformDefaultAction();
        }

        public boolean MediaBrowserCompat$CustomActionResultReceiver() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.hasSubMenu();
        }

        public void read(SubMenu subMenu) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onPrepareSubMenu(MenuItemWrapperICS.this.read(subMenu));
        }
    }

    static class CollapsibleActionViewWrapper extends FrameLayout implements setPadding {
        final CollapsibleActionView IconCompatParcelizer;

        CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.IconCompatParcelizer = (CollapsibleActionView) view;
            addView(view);
        }

        public final void write() {
            this.IconCompatParcelizer.onActionViewExpanded();
        }

        public final void IconCompatParcelizer() {
            this.IconCompatParcelizer.onActionViewCollapsed();
        }
    }
}
