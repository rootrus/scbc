package p040o;

import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: o.onPreparePanel */
public final class onPreparePanel {
    private static volatile int IconCompatParcelizer = 700;
    private static final File MediaBrowserCompat$CustomActionResultReceiver = new File("/proc/self/fd");
    private static volatile int MediaBrowserCompat$ItemReceiver = 128;
    private static volatile onPreparePanel write;
    private final boolean MediaMetadataCompat;
    private boolean RatingCompat = true;
    private int read;

    public static onPreparePanel IconCompatParcelizer() {
        if (write == null) {
            synchronized (onPreparePanel.class) {
                if (write == null) {
                    write = new onPreparePanel();
                }
            }
        }
        return write;
    }

    onPreparePanel() {
        boolean z = true;
        if (Build.MODEL != null && Build.MODEL.length() >= 7) {
            String substring = Build.MODEL.substring(0, 7);
            char c = 65535;
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (Build.VERSION.SDK_INT == 26) {
                        z = false;
                        break;
                    }
                    break;
            }
        }
        this.MediaMetadataCompat = z;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(int i, int i2, boolean z, boolean z2) {
        if (!z || !this.MediaMetadataCompat || Build.VERSION.SDK_INT < 26 || z2 || i < MediaBrowserCompat$ItemReceiver || i2 < MediaBrowserCompat$ItemReceiver || !read()) {
            return false;
        }
        return true;
    }

    private boolean read() {
        boolean z;
        synchronized (this) {
            boolean z2 = true;
            int i = this.read + 1;
            this.read = i;
            if (i >= 50) {
                this.read = 0;
                int length = MediaBrowserCompat$CustomActionResultReceiver.list().length;
                if (length >= IconCompatParcelizer) {
                    z2 = false;
                }
                this.RatingCompat = z2;
                if (!z2 && Log.isLoggable("Downsampler", 5)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                    sb.append(length);
                    sb.append(", limit ");
                    sb.append(IconCompatParcelizer);
                    Log.w("Downsampler", sb.toString());
                }
            }
            z = this.RatingCompat;
        }
        return z;
    }
}
