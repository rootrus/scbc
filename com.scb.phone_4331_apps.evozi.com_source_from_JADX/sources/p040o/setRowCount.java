package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;

/* renamed from: o.setRowCount */
public final class setRowCount implements onCreateAnimation<setUseDefaultMargins> {
    private final onCreateAnimation<Bitmap> IconCompatParcelizer;

    public setRowCount(onCreateAnimation<Bitmap> oncreateanimation) {
        if (oncreateanimation != null) {
            this.IconCompatParcelizer = oncreateanimation;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final performOptionsMenuClosed<setUseDefaultMargins> MediaBrowserCompat$ItemReceiver(Context context, performOptionsMenuClosed<setUseDefaultMargins> performoptionsmenuclosed, int i, int i2) {
        setUseDefaultMargins write = performoptionsmenuclosed.write();
        getLastCustomNonConfigurationInstance getlastcustomnonconfigurationinstance = new getLastCustomNonConfigurationInstance(write.read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver, Glide.IconCompatParcelizer(context).MediaBrowserCompat$CustomActionResultReceiver);
        performOptionsMenuClosed<Bitmap> MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(context, getlastcustomnonconfigurationinstance, i, i2);
        if (!getlastcustomnonconfigurationinstance.equals(MediaBrowserCompat$ItemReceiver)) {
            getlastcustomnonconfigurationinstance.MediaBrowserCompat$CustomActionResultReceiver();
        }
        onCreateAnimation<Bitmap> oncreateanimation = this.IconCompatParcelizer;
        write.read.IconCompatParcelizer.IconCompatParcelizer(oncreateanimation, MediaBrowserCompat$ItemReceiver.write());
        return performoptionsmenuclosed;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof setRowCount) {
            return this.IconCompatParcelizer.equals(((setRowCount) obj).IconCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MessageDigest messageDigest) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(messageDigest);
    }
}
