package p040o;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: o.setOnSuggestionListener */
public final class setOnSuggestionListener {
    public static int IconCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }
}
