package p040o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: o.cancelLoadInBackground */
public final class cancelLoadInBackground implements ReflectiveGenericLifecycleObserver<Drawable, byte[]> {
    private final ReflectiveGenericLifecycleObserver<Bitmap, byte[]> MediaBrowserCompat$CustomActionResultReceiver;
    private final CheckParameters_MembersInjector MediaBrowserCompat$ItemReceiver;
    private final ReflectiveGenericLifecycleObserver<setUseDefaultMargins, byte[]> read;

    public cancelLoadInBackground(CheckParameters_MembersInjector checkParameters_MembersInjector, ReflectiveGenericLifecycleObserver<Bitmap, byte[]> reflectiveGenericLifecycleObserver, ReflectiveGenericLifecycleObserver<setUseDefaultMargins, byte[]> reflectiveGenericLifecycleObserver2) {
        this.MediaBrowserCompat$ItemReceiver = checkParameters_MembersInjector;
        this.MediaBrowserCompat$CustomActionResultReceiver = reflectiveGenericLifecycleObserver;
        this.read = reflectiveGenericLifecycleObserver2;
    }

    public final performOptionsMenuClosed<byte[]> MediaBrowserCompat$ItemReceiver(performOptionsMenuClosed<Drawable> performoptionsmenuclosed, onActivityResult onactivityresult) {
        Drawable write = performoptionsmenuclosed.write();
        getLastCustomNonConfigurationInstance getlastcustomnonconfigurationinstance = null;
        if (write instanceof BitmapDrawable) {
            ReflectiveGenericLifecycleObserver<Bitmap, byte[]> reflectiveGenericLifecycleObserver = this.MediaBrowserCompat$CustomActionResultReceiver;
            Bitmap bitmap = ((BitmapDrawable) write).getBitmap();
            CheckParameters_MembersInjector checkParameters_MembersInjector = this.MediaBrowserCompat$ItemReceiver;
            if (bitmap != null) {
                getlastcustomnonconfigurationinstance = new getLastCustomNonConfigurationInstance(bitmap, checkParameters_MembersInjector);
            }
            return reflectiveGenericLifecycleObserver.MediaBrowserCompat$ItemReceiver(getlastcustomnonconfigurationinstance, onactivityresult);
        } else if (write instanceof setUseDefaultMargins) {
            return this.read.MediaBrowserCompat$ItemReceiver(performoptionsmenuclosed, onactivityresult);
        } else {
            return null;
        }
    }
}
