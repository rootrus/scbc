package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.CoordinatorLayout */
public abstract class CoordinatorLayout extends RecyclerView.MediaMetadataCompat {
    public boolean MediaSessionCompat$ResultReceiverWrapper = true;

    public abstract boolean IconCompatParcelizer(RecyclerView.setContentView setcontentview);

    public abstract boolean MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i, int i2, int i3, int i4);

    public abstract boolean write(RecyclerView.setContentView setcontentview);

    public abstract boolean write(RecyclerView.setContentView setcontentview, RecyclerView.setContentView setcontentview2, int i, int i2, int i3, int i4);

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview) {
        if (this.MediaSessionCompat$ResultReceiverWrapper) {
            if (!((setcontentview.read & 4) != 0)) {
                return false;
            }
        }
        return true;
    }

    public final boolean IconCompatParcelizer(RecyclerView.setContentView setcontentview, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer2) {
        int i;
        int i2 = iconCompatParcelizer.read;
        int i3 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        View view = setcontentview.write;
        int left = iconCompatParcelizer2 == null ? view.getLeft() : iconCompatParcelizer2.read;
        if (iconCompatParcelizer2 == null) {
            i = view.getTop();
        } else {
            i = iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver;
        }
        int i4 = i;
        if (((setcontentview.read & 8) != 0) || (i2 == left && i3 == i4)) {
            return IconCompatParcelizer(setcontentview);
        }
        view.layout(left, i4, view.getWidth() + left, view.getHeight() + i4);
        return MediaBrowserCompat$ItemReceiver(setcontentview, i2, i3, left, i4);
    }

    public final boolean read(RecyclerView.setContentView setcontentview, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer2) {
        if (iconCompatParcelizer == null || (iconCompatParcelizer.read == iconCompatParcelizer2.read && iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver == iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver)) {
            return write(setcontentview);
        }
        return MediaBrowserCompat$ItemReceiver(setcontentview, iconCompatParcelizer.read, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer2.read, iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final boolean write(RecyclerView.setContentView setcontentview, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer2) {
        if (iconCompatParcelizer.read == iconCompatParcelizer2.read && iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver == iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver) {
            RecyclerView.MediaMetadataCompat.read read = this.MediaDescriptionCompat;
            if (read == null) {
                return false;
            }
            read.write(setcontentview);
            return false;
        }
        return MediaBrowserCompat$ItemReceiver(setcontentview, iconCompatParcelizer.read, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer2.read, iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final boolean MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, RecyclerView.setContentView setcontentview2, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer2) {
        int i;
        int i2;
        int i3 = iconCompatParcelizer.read;
        int i4 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if ((setcontentview2.read & 128) != 0) {
            int i5 = iconCompatParcelizer.read;
            i = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            i2 = i5;
        } else {
            i2 = iconCompatParcelizer2.read;
            i = iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return write(setcontentview, setcontentview2, i3, i4, i2, i);
    }
}
