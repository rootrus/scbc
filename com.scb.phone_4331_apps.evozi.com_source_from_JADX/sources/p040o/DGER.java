package p040o;

import android.net.Uri;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: o.DGER */
public final class DGER {
    public final Integer MediaBrowserCompat$ItemReceiver;
    public final Uri read;
    public boolean write;

    private DGER(Uri uri) {
        String obj = uri.toString();
        if (obj.startsWith("file:///") && !new File(obj.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(obj, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.read = uri;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.write = true;
    }

    private DGER(int i) {
        this.read = null;
        this.MediaBrowserCompat$ItemReceiver = Integer.valueOf(i);
        this.write = true;
    }

    public static DGER write(int i) {
        return new DGER(i);
    }

    public static DGER MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("file:///android_asset/");
            sb.append(str);
            return IconCompatParcelizer(sb.toString());
        }
        throw new NullPointerException("Asset name must not be null");
    }

    public static DGER IconCompatParcelizer(String str) {
        if (str != null) {
            if (!str.contains("://")) {
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("file:///");
                sb.append(str);
                str = sb.toString();
            }
            return new DGER(Uri.parse(str));
        }
        throw new NullPointerException("Uri must not be null");
    }
}
