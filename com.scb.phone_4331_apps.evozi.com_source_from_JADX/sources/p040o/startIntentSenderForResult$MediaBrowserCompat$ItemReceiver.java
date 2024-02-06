package p040o;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* renamed from: o.startIntentSenderForResult$MediaBrowserCompat$ItemReceiver */
public class startIntentSenderForResult$MediaBrowserCompat$ItemReceiver implements setReenterTransition<Uri, ParcelFileDescriptor>, C1589xdb4af160<ParcelFileDescriptor> {
    private final ContentResolver IconCompatParcelizer;

    public startIntentSenderForResult$MediaBrowserCompat$ItemReceiver(ContentResolver contentResolver) {
        this.IconCompatParcelizer = contentResolver;
    }

    public final onCreateOptionsMenu<ParcelFileDescriptor> write(Uri uri) {
        return new onHiddenChanged(this.IconCompatParcelizer, uri);
    }

    public final setSharedElementEnterTransition<Uri, ParcelFileDescriptor> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
        return new startIntentSenderForResult(this);
    }
}
