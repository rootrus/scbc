package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p040o.ContentFrameLayout;
import p040o.setFirstBaselineToTopHeight;
import p040o.setTabSelected;

/* renamed from: o.setTextMetricsParamsCompat */
public class setTextMetricsParamsCompat {
    private static final setDecorPadding MediaBrowserCompat$CustomActionResultReceiver;
    private static final setSupportAllCaps<String, Typeface> write = new setSupportAllCaps<>(16);

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            MediaBrowserCompat$CustomActionResultReceiver = new setSelector();
        } else if (Build.VERSION.SDK_INT >= 26) {
            MediaBrowserCompat$CustomActionResultReceiver = new setAttachListener();
        } else if (Build.VERSION.SDK_INT >= 24 && DropDownListView.read()) {
            MediaBrowserCompat$CustomActionResultReceiver = new DropDownListView();
        } else if (Build.VERSION.SDK_INT >= 21) {
            MediaBrowserCompat$CustomActionResultReceiver = new setAllowStacking();
        } else {
            MediaBrowserCompat$CustomActionResultReceiver = new setDecorPadding();
        }
    }

    public static Typeface read(Resources resources, int i, int i2) {
        return write.get(IconCompatParcelizer(resources, i, i2));
    }

    private static String IconCompatParcelizer(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }

    public static Typeface write(Context context, C1488x49a1d4db setfirstbaselinetotopheight_mediabrowsercompat_customactionresultreceiver, Resources resources, int i, int i2, ContentFrameLayout.read read, Handler handler, boolean z) {
        Typeface typeface;
        if (setfirstbaselinetotopheight_mediabrowsercompat_customactionresultreceiver instanceof setFirstBaselineToTopHeight.IconCompatParcelizer) {
            setFirstBaselineToTopHeight.IconCompatParcelizer iconCompatParcelizer = (setFirstBaselineToTopHeight.IconCompatParcelizer) setfirstbaselinetotopheight_mediabrowsercompat_customactionresultreceiver;
            boolean z2 = false;
            if (!z ? read == null : iconCompatParcelizer.read() == 0) {
                z2 = true;
            }
            typeface = setTabSelected.MediaBrowserCompat$CustomActionResultReceiver(context, iconCompatParcelizer.IconCompatParcelizer(), read, handler, z2, z ? iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver() : -1, i2);
        } else {
            typeface = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(context, (setFirstBaselineToTopHeight.write) setfirstbaselinetotopheight_mediabrowsercompat_customactionresultreceiver, resources, i2);
            if (read != null) {
                if (typeface != null) {
                    read.IconCompatParcelizer(typeface, handler);
                } else {
                    read.write(-3, handler);
                }
            }
        }
        if (typeface != null) {
            write.put(IconCompatParcelizer(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface IconCompatParcelizer(Context context, Resources resources, int i, String str, int i2) {
        Typeface MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(context, resources, i, str, i2);
        if (MediaBrowserCompat$ItemReceiver != null) {
            write.put(IconCompatParcelizer(resources, i, i2), MediaBrowserCompat$ItemReceiver);
        }
        return MediaBrowserCompat$ItemReceiver;
    }

    public static Typeface MediaBrowserCompat$ItemReceiver(Context context, CancellationSignal cancellationSignal, setTabSelected.IconCompatParcelizer[] iconCompatParcelizerArr, int i) {
        return MediaBrowserCompat$CustomActionResultReceiver.write(context, cancellationSignal, iconCompatParcelizerArr, i);
    }
}
