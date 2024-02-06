package p040o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p040o.ActionMenuItemView;

/* renamed from: o.setShortcut */
public final class setShortcut extends ActionMenuItemView implements MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver {
    private Context IconCompatParcelizer;
    private ActionMenuItemView.read MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private MenuItemImpl MediaBrowserCompat$SearchResultReceiver;
    private WeakReference<View> MediaMetadataCompat;
    private ActionBarContextView read;

    public setShortcut(Context context, ActionBarContextView actionBarContextView, ActionMenuItemView.read read2) {
        this.IconCompatParcelizer = context;
        this.read = actionBarContextView;
        this.MediaBrowserCompat$ItemReceiver = read2;
        MenuItemImpl menuItemImpl = new MenuItemImpl(actionBarContextView.getContext());
        menuItemImpl.MediaBrowserCompat$ItemReceiver = 1;
        this.MediaBrowserCompat$SearchResultReceiver = menuItemImpl;
        menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver((MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) this);
    }

    public final void read(CharSequence charSequence) {
        this.read.setTitle(charSequence);
    }

    public final void IconCompatParcelizer(CharSequence charSequence) {
        this.read.setSubtitle(charSequence);
    }

    public final void read(int i) {
        this.read.setTitle(this.IconCompatParcelizer.getString(i));
    }

    public final void IconCompatParcelizer(int i) {
        this.read.setSubtitle(this.IconCompatParcelizer.getString(i));
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        super.MediaBrowserCompat$ItemReceiver(z);
        this.read.setTitleOptional(z);
    }

    public final boolean MediaBrowserCompat$MediaItem() {
        return this.read.MediaDescriptionCompat;
    }

    public final void MediaBrowserCompat$ItemReceiver(View view) {
        this.read.setCustomView(view);
        this.MediaMetadataCompat = view != null ? new WeakReference<>(view) : null;
    }

    public final void RatingCompat() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this, this.MediaBrowserCompat$SearchResultReceiver);
    }

    public final void read() {
        if (!this.MediaBrowserCompat$MediaItem) {
            this.MediaBrowserCompat$MediaItem = true;
            this.read.sendAccessibilityEvent(32);
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this);
        }
    }

    public final Menu MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final CharSequence MediaBrowserCompat$SearchResultReceiver() {
        return this.read.MediaBrowserCompat$SearchResultReceiver;
    }

    public final CharSequence MediaMetadataCompat() {
        return this.read.MediaBrowserCompat$MediaItem;
    }

    public final View IconCompatParcelizer() {
        WeakReference<View> weakReference = this.MediaMetadataCompat;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final MenuInflater write() {
        return new setIcon(this.read.getContext());
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl, MenuItem menuItem) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, menuItem);
    }

    public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl) {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this, this.MediaBrowserCompat$SearchResultReceiver);
        this.read.write();
    }
}
