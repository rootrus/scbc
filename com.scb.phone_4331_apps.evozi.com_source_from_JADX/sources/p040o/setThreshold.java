package p040o;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: o.setThreshold */
public final class setThreshold {
    private Object IconCompatParcelizer;

    private setThreshold(Object obj) {
        this.IconCompatParcelizer = obj;
    }

    public final Object write() {
        return this.IconCompatParcelizer;
    }

    public static setThreshold read(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new setThreshold(PointerIcon.getSystemIcon(context, i));
        }
        return new setThreshold((Object) null);
    }
}
