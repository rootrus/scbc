package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p040o.SwitchCompat;
import p040o.setTag;

class RecyclerView$AlertController$RecycleListView extends RecyclerView.read {
    final /* synthetic */ RecyclerView MediaBrowserCompat$CustomActionResultReceiver;

    RecyclerView$AlertController$RecycleListView(RecyclerView recyclerView) {
        this.MediaBrowserCompat$CustomActionResultReceiver = recyclerView;
    }

    public final void write() {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((String) null);
        boolean z = true;
        this.MediaBrowserCompat$CustomActionResultReceiver.ExpandedMenuView.f24x50fd9e4a = true;
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(true);
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver.size() <= 0) {
            z = false;
        }
        if (!z) {
            this.MediaBrowserCompat$CustomActionResultReceiver.requestLayout();
        }
    }

    public final void IconCompatParcelizer(int i, int i2, Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((String) null);
        setTag settag = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
        boolean z = false;
        if (i2 > 0) {
            settag.MediaBrowserCompat$CustomActionResultReceiver.add(settag.MediaBrowserCompat$CustomActionResultReceiver(4, i, i2, obj));
            settag.write |= 4;
            if (settag.MediaBrowserCompat$CustomActionResultReceiver.size() == 1) {
                z = true;
            }
        }
        if (z) {
            IconCompatParcelizer();
        }
    }

    public final void write(int i, int i2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((String) null);
        setTag settag = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
        boolean z = false;
        if (i2 > 0) {
            settag.MediaBrowserCompat$CustomActionResultReceiver.add(settag.MediaBrowserCompat$CustomActionResultReceiver(1, i, i2, (Object) null));
            settag.write |= 1;
            if (settag.MediaBrowserCompat$CustomActionResultReceiver.size() == 1) {
                z = true;
            }
        }
        if (z) {
            IconCompatParcelizer();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((String) null);
        setTag settag = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
        boolean z = false;
        if (i2 > 0) {
            settag.MediaBrowserCompat$CustomActionResultReceiver.add(settag.MediaBrowserCompat$CustomActionResultReceiver(2, i, i2, (Object) null));
            settag.write |= 2;
            if (settag.MediaBrowserCompat$CustomActionResultReceiver.size() == 1) {
                z = true;
            }
        }
        if (z) {
            IconCompatParcelizer();
        }
    }

    public final void IconCompatParcelizer(int i, int i2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((String) null);
        setTag settag = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
        boolean z = false;
        if (i != i2) {
            settag.MediaBrowserCompat$CustomActionResultReceiver.add(settag.MediaBrowserCompat$CustomActionResultReceiver(8, i, i2, (Object) null));
            settag.write |= 8;
            if (settag.MediaBrowserCompat$CustomActionResultReceiver.size() == 1) {
                z = true;
            }
        }
        if (z) {
            IconCompatParcelizer();
        }
    }

    private void IconCompatParcelizer() {
        if (!RecyclerView.read || !this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat || !this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor) {
            this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.requestLayout();
            return;
        }
        RecyclerView recyclerView = this.MediaBrowserCompat$CustomActionResultReceiver;
        SwitchCompat.MediaBrowserCompat$ItemReceiver((View) recyclerView, recyclerView.MenuItemImpl);
    }
}
