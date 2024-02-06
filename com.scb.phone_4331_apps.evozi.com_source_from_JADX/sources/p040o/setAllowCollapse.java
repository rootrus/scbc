package p040o;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* renamed from: o.setAllowCollapse */
public final class setAllowCollapse {
    public static Spanned write(String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i);
        }
        return Html.fromHtml(str);
    }
}
