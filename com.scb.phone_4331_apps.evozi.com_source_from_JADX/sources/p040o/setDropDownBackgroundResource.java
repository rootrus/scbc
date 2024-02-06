package p040o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: o.setDropDownBackgroundResource */
public abstract class setDropDownBackgroundResource implements ServiceConnection {
    public abstract void MediaBrowserCompat$CustomActionResultReceiver(setOnDismissListener setondismisslistener);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MediaBrowserCompat$ItemReceiver mediaBrowserCompat$ItemReceiver;
        if (iBinder == null) {
            mediaBrowserCompat$ItemReceiver = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("o.MediaBrowserCompat$ItemReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof MediaBrowserCompat$ItemReceiver)) {
                mediaBrowserCompat$ItemReceiver = new C1237xfb448b17(iBinder);
            } else {
                mediaBrowserCompat$ItemReceiver = (MediaBrowserCompat$ItemReceiver) queryLocalInterface;
            }
        }
        MediaBrowserCompat$CustomActionResultReceiver(new setOnDismissListener(mediaBrowserCompat$ItemReceiver, componentName) {
        });
    }
}
