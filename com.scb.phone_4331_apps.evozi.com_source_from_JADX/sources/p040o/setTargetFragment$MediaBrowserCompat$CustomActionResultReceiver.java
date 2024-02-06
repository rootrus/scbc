package p040o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: o.setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver implements setReenterTransition<Integer, AssetFileDescriptor> {
    private final Resources MediaBrowserCompat$CustomActionResultReceiver;

    public setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver(Resources resources) {
        this.MediaBrowserCompat$CustomActionResultReceiver = resources;
    }

    public final setSharedElementEnterTransition<Integer, AssetFileDescriptor> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
        return new setTargetFragment(this.MediaBrowserCompat$CustomActionResultReceiver, shouldshowrequestpermissionrationale.read(Uri.class, AssetFileDescriptor.class));
    }
}
