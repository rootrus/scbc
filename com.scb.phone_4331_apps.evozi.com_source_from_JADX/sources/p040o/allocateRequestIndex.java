package p040o;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: o.allocateRequestIndex */
public final class allocateRequestIndex implements setSharedElementEnterTransition<Uri, InputStream> {
    private final Context read;

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        Uri uri = (Uri) obj;
        if (!AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(i, i2)) {
            return null;
        }
        noteStateNotSaved<Long> notestatenotsaved = supportInvalidateOptionsMenu.IconCompatParcelizer;
        Long l = (Long) (onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.containsKey(notestatenotsaved) ? onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.get(notestatenotsaved) : notestatenotsaved.read);
        if (!(l != null && l.longValue() == -1)) {
            return null;
        }
        unregisterListener unregisterlistener = new unregisterListener(uri);
        Context context = this.read;
        return new C1536x6a517a85(unregisterlistener, onRequestPermissionsResult.read(context, uri, new onRequestPermissionsResult$MediaBrowserCompat$ItemReceiver(context.getContentResolver())));
    }

    public final /* synthetic */ boolean write(Object obj) {
        Uri uri = (Uri) obj;
        return AlertController$RecycleListView.IconCompatParcelizer(uri) && uri.getPathSegments().contains("video");
    }

    public allocateRequestIndex(Context context) {
        this.read = context.getApplicationContext();
    }

    /* renamed from: o.allocateRequestIndex$IconCompatParcelizer */
    public static class IconCompatParcelizer implements setReenterTransition<Uri, InputStream> {
        private final Context write;

        public IconCompatParcelizer(Context context) {
            this.write = context;
        }

        public final setSharedElementEnterTransition<Uri, InputStream> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new allocateRequestIndex(this.write);
        }
    }
}
