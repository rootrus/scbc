package p040o;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: o.Toolbar */
public final class Toolbar {
    public static void IconCompatParcelizer(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
