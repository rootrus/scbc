package p040o;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: o.setTextOff */
public class setTextOff {
    private final Object write;

    private setTextOff(Object obj) {
        this.write = obj;
    }

    public int MediaBrowserCompat$CustomActionResultReceiver() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.write).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int read() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.write).getSystemWindowInsetTop();
        }
        return 0;
    }

    public int write() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.write).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int IconCompatParcelizer() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.write).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public boolean MediaBrowserCompat$MediaItem() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.write).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean RatingCompat() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.write).isConsumed();
        }
        return false;
    }

    public setTextOff MediaBrowserCompat$ItemReceiver() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new setTextOff(((WindowInsets) this.write).consumeSystemWindowInsets());
        }
        return null;
    }

    public setTextOff MediaBrowserCompat$ItemReceiver(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new setTextOff(((WindowInsets) this.write).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Object obj2 = this.write;
        Object obj3 = ((setTextOff) obj).write;
        if (obj2 != null) {
            return obj2.equals(obj3);
        }
        if (obj3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.write;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    static setTextOff IconCompatParcelizer(Object obj) {
        if (obj == null) {
            return null;
        }
        return new setTextOff(obj);
    }

    static Object read(setTextOff settextoff) {
        if (settextoff == null) {
            return null;
        }
        return settextoff.write;
    }
}
