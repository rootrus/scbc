package p040o;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: o.nContextDump */
public final class nContextDump extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> MediaBrowserCompat$ItemReceiver = new nContextDump();
    private final WeakHashMap<Drawable, Integer> read = new WeakHashMap<>();

    public final /* synthetic */ Object get(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.read.containsKey(drawable)) {
            return this.read.get(drawable);
        }
        return 255;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        Integer num = (Integer) obj2;
        if (Build.VERSION.SDK_INT < 19) {
            this.read.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }

    private nContextDump() {
        super(Integer.class, "drawableAlphaCompat");
    }
}
