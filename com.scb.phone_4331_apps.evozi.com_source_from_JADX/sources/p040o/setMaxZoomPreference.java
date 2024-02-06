package p040o;

import android.widget.ImageView;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;

/* renamed from: o.setMaxZoomPreference */
public final class setMaxZoomPreference {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMaxZoomPreference)) {
            return false;
        }
        setMaxZoomPreference setmaxzoompreference = (setMaxZoomPreference) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setmaxzoompreference.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setmaxzoompreference.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setmaxzoompreference.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setmaxzoompreference.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Occupation(code=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isicCode=");
        sb.append(this.read);
        sb.append(", occupationGroup=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setMaxZoomPreference(String str, String str2, String str3, String str4) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
    }

    public /* synthetic */ setMaxZoomPreference(String str, String str2, String str3) {
        this(str, str2, (String) null, str3);
    }

    /* renamed from: o.setMaxZoomPreference$read */
    public static final class read implements IdExtractor_Factory {
        private final ImageLoader MediaBrowserCompat$ItemReceiver;
        private final BitmapDisplayer write;

        private read() {
        }

        public read(ImageLoader imageLoader, BitmapDisplayer bitmapDisplayer) {
            this.MediaBrowserCompat$ItemReceiver = imageLoader;
            this.write = bitmapDisplayer;
        }

        public final void write(Object obj, ImageView imageView) {
            DisplayImageOptions build = new DisplayImageOptions.Builder().cacheInMemory(false).cacheOnDisk(false).displayer(this.write).build();
            if ((obj instanceof String) || obj == null) {
                this.MediaBrowserCompat$ItemReceiver.displayImage((String) obj, imageView, build);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported model ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
