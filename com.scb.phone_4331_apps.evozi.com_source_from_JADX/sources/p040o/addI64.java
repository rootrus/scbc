package p040o;

import android.util.Log;

/* renamed from: o.addI64 */
public final class addI64 extends addI8 {
    public String MediaBrowserCompat$CustomActionResultReceiver;

    public addI64(float f, String str, Object obj) {
        super(f, obj);
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    @Deprecated
    public final float MediaBrowserCompat$CustomActionResultReceiver() {
        Log.i("DEPRECATED", "Pie entries do not have x values");
        return super.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
