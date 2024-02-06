package p040o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: o.ActionMenuItemView */
public abstract class ActionMenuItemView {
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    Object write;

    /* renamed from: o.ActionMenuItemView$read */
    public interface read {
        void IconCompatParcelizer(ActionMenuItemView actionMenuItemView);

        boolean IconCompatParcelizer(ActionMenuItemView actionMenuItemView, Menu menu);

        boolean MediaBrowserCompat$CustomActionResultReceiver(ActionMenuItemView actionMenuItemView, MenuItem menuItem);

        boolean read(ActionMenuItemView actionMenuItemView, Menu menu);
    }

    public abstract View IconCompatParcelizer();

    public abstract void IconCompatParcelizer(int i);

    public abstract void IconCompatParcelizer(CharSequence charSequence);

    public abstract Menu MediaBrowserCompat$CustomActionResultReceiver();

    public abstract void MediaBrowserCompat$ItemReceiver(View view);

    public boolean MediaBrowserCompat$MediaItem() {
        return false;
    }

    public abstract CharSequence MediaBrowserCompat$SearchResultReceiver();

    public abstract CharSequence MediaMetadataCompat();

    public abstract void RatingCompat();

    public abstract void read();

    public abstract void read(int i);

    public abstract void read(CharSequence charSequence);

    public abstract MenuInflater write();

    public void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }
}
