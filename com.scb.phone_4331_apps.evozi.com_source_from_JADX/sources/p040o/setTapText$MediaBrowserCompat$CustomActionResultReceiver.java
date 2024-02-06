package p040o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p040o.setTapText;

/* renamed from: o.setTapText$MediaBrowserCompat$CustomActionResultReceiver */
public class setTapText$MediaBrowserCompat$CustomActionResultReceiver extends setTapText.write {
    setTapText$MediaBrowserCompat$CustomActionResultReceiver(Context context, Intent intent) {
        super(intent);
    }

    public final Intent read() {
        Uri data = this.MediaBrowserCompat$ItemReceiver.getData();
        if (data == null) {
            return this.MediaBrowserCompat$ItemReceiver;
        }
        read(data);
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
