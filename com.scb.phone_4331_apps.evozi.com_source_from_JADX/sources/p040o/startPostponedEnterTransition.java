package p040o;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p040o.onRequestPermissionsResult;

/* renamed from: o.startPostponedEnterTransition */
public final class startPostponedEnterTransition implements setSharedElementEnterTransition<Uri, InputStream> {
    private final Context MediaBrowserCompat$ItemReceiver;

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        Uri uri = (Uri) obj;
        if (!AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(i, i2)) {
            return null;
        }
        unregisterListener unregisterlistener = new unregisterListener(uri);
        Context context = this.MediaBrowserCompat$ItemReceiver;
        return new C1536x6a517a85(unregisterlistener, onRequestPermissionsResult.read(context, uri, new onRequestPermissionsResult.read(context.getContentResolver())));
    }

    public final /* synthetic */ boolean write(Object obj) {
        Uri uri = (Uri) obj;
        return AlertController$RecycleListView.IconCompatParcelizer(uri) && !uri.getPathSegments().contains("video");
    }

    public startPostponedEnterTransition(Context context) {
        this.MediaBrowserCompat$ItemReceiver = context.getApplicationContext();
    }

    /* renamed from: o.startPostponedEnterTransition$write */
    public static class write implements setReenterTransition<Uri, InputStream> {
        private final Context write;

        public write(Context context) {
            this.write = context;
        }

        public final setSharedElementEnterTransition<Uri, InputStream> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new startPostponedEnterTransition(this.write);
        }
    }
}
