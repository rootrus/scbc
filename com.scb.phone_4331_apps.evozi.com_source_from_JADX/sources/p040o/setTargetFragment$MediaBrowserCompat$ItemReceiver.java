package p040o;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* renamed from: o.setTargetFragment$MediaBrowserCompat$ItemReceiver */
public class setTargetFragment$MediaBrowserCompat$ItemReceiver implements setReenterTransition<Integer, ParcelFileDescriptor> {
    private final Resources IconCompatParcelizer;

    public setTargetFragment$MediaBrowserCompat$ItemReceiver(Resources resources) {
        this.IconCompatParcelizer = resources;
    }

    public final setSharedElementEnterTransition<Integer, ParcelFileDescriptor> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
        return new setTargetFragment(this.IconCompatParcelizer, shouldshowrequestpermissionrationale.read(Uri.class, ParcelFileDescriptor.class));
    }
}
