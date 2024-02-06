package p040o;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.List;

/* renamed from: o.addCircle */
public final class addCircle {
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final List<addMarker> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addCircle)) {
            return false;
        }
        addCircle addcircle = (addCircle) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) addcircle.MediaBrowserCompat$ItemReceiver) && this.MediaBrowserCompat$CustomActionResultReceiver == addcircle.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) addcircle.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            z = true;
        }
        List<addMarker> list = this.write;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + (z ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationChannel(notificationChannel=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", channelEnabledFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", categoryList=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public addCircle(String str, boolean z, List<addMarker> list) {
        onGetStartedClick.write((Object) str, "notificationChannel");
        onGetStartedClick.write((Object) list, "categoryList");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.write = list;
    }

    /* renamed from: o.addCircle$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements FragmentBuilder_BindFundSelectAccountFragment {
        private final int IconCompatParcelizer;
        private final int read;

        private IconCompatParcelizer() {
        }

        public IconCompatParcelizer(int i, int i2) {
            this.IconCompatParcelizer = i;
            this.read = i2;
        }

        public final String MediaBrowserCompat$ItemReceiver() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append("x");
            sb.append(this.read);
            return sb.toString();
        }

        public final Bitmap write(Bitmap bitmap) {
            Rect MediaBrowserCompat$CustomActionResultReceiver = CTRSV.MediaBrowserCompat$CustomActionResultReceiver(bitmap.getWidth(), bitmap.getHeight(), this.IconCompatParcelizer, this.read);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, MediaBrowserCompat$CustomActionResultReceiver.width(), MediaBrowserCompat$CustomActionResultReceiver.height(), true);
            if (createScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return createScaledBitmap;
        }
    }
}
