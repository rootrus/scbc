package p040o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.setAllowReturnTransitionOverlap */
public final class setAllowReturnTransitionOverlap {
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    private final Context read;
    public final int write;

    public setAllowReturnTransitionOverlap(IconCompatParcelizer iconCompatParcelizer) {
        boolean z;
        int i;
        boolean z2;
        this.read = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        ActivityManager activityManager = iconCompatParcelizer.write;
        boolean z3 = true;
        if (Build.VERSION.SDK_INT >= 19) {
            z = activityManager.isLowRamDevice();
        } else {
            z = true;
        }
        if (z) {
            i = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver / 2;
        } else {
            i = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        }
        this.write = i;
        ActivityManager activityManager2 = iconCompatParcelizer.write;
        float f = iconCompatParcelizer.MediaMetadataCompat;
        float f2 = iconCompatParcelizer.IconCompatParcelizer;
        int memoryClass = activityManager2.getMemoryClass();
        if (Build.VERSION.SDK_INT >= 19) {
            z2 = activityManager2.isLowRamDevice();
        } else {
            z2 = true;
        }
        int round = Math.round(((float) ((memoryClass << 10) << 10)) * (z2 ? f2 : f));
        float MediaBrowserCompat$ItemReceiver = (float) ((iconCompatParcelizer.RatingCompat.MediaBrowserCompat$ItemReceiver() * iconCompatParcelizer.RatingCompat.write()) << 2);
        int round2 = Math.round(iconCompatParcelizer.read * MediaBrowserCompat$ItemReceiver);
        int round3 = Math.round(MediaBrowserCompat$ItemReceiver * iconCompatParcelizer.MediaDescriptionCompat);
        int i2 = round - this.write;
        int i3 = round3 + round2;
        if (i3 <= i2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = round3;
            this.IconCompatParcelizer = round2;
        } else {
            float f3 = ((float) i2) / (iconCompatParcelizer.read + iconCompatParcelizer.MediaDescriptionCompat);
            this.MediaBrowserCompat$CustomActionResultReceiver = Math.round(iconCompatParcelizer.MediaDescriptionCompat * f3);
            this.IconCompatParcelizer = Math.round(f3 * iconCompatParcelizer.read);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(this.read, (long) this.MediaBrowserCompat$CustomActionResultReceiver));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(this.read, (long) this.IconCompatParcelizer));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(this.read, (long) this.write));
            sb.append(", memory class limited? ");
            sb.append(i3 > round);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(this.read, (long) round));
            sb.append(", memoryClass: ");
            sb.append(iconCompatParcelizer.write.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(Build.VERSION.SDK_INT >= 19 ? iconCompatParcelizer.write.isLowRamDevice() : z3);
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: o.setAllowReturnTransitionOverlap$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private static int MediaBrowserCompat$MediaItem = (Build.VERSION.SDK_INT < 26 ? 4 : 1);
        float IconCompatParcelizer = 0.33f;
        int MediaBrowserCompat$CustomActionResultReceiver = 4194304;
        final Context MediaBrowserCompat$ItemReceiver;
        float MediaDescriptionCompat = 2.0f;
        float MediaMetadataCompat = 0.4f;
        setAllowReturnTransitionOverlap$MediaBrowserCompat$ItemReceiver RatingCompat;
        float read = ((float) MediaBrowserCompat$MediaItem);
        ActivityManager write;

        public IconCompatParcelizer(Context context) {
            boolean z;
            this.MediaBrowserCompat$ItemReceiver = context;
            this.write = (ActivityManager) context.getSystemService("activity");
            this.RatingCompat = new read(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26) {
                ActivityManager activityManager = this.write;
                if (Build.VERSION.SDK_INT >= 19) {
                    z = activityManager.isLowRamDevice();
                } else {
                    z = true;
                }
                if (z) {
                    this.read = BitmapDescriptorFactory.HUE_RED;
                }
            }
        }
    }

    /* renamed from: o.setAllowReturnTransitionOverlap$read */
    static final class read implements setAllowReturnTransitionOverlap$MediaBrowserCompat$ItemReceiver {
        private final DisplayMetrics MediaBrowserCompat$ItemReceiver;

        read(DisplayMetrics displayMetrics) {
            this.MediaBrowserCompat$ItemReceiver = displayMetrics;
        }

        public final int MediaBrowserCompat$ItemReceiver() {
            return this.MediaBrowserCompat$ItemReceiver.widthPixels;
        }

        public final int write() {
            return this.MediaBrowserCompat$ItemReceiver.heightPixels;
        }
    }
}
