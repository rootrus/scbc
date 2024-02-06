package p040o;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: o.setArguments */
public final class setArguments<Data> implements setSharedElementEnterTransition<Uri, Data> {
    private final AssetManager MediaBrowserCompat$ItemReceiver;
    private final setArguments$MediaBrowserCompat$CustomActionResultReceiver<Data> read;

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        Uri uri = (Uri) obj;
        return new C1536x6a517a85(new unregisterListener(uri), this.read.read(this.MediaBrowserCompat$ItemReceiver, uri.toString().substring(22)));
    }

    public final /* synthetic */ boolean write(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    public setArguments(AssetManager assetManager, setArguments$MediaBrowserCompat$CustomActionResultReceiver<Data> setarguments_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$ItemReceiver = assetManager;
        this.read = setarguments_mediabrowsercompat_customactionresultreceiver;
    }

    /* renamed from: o.setArguments$IconCompatParcelizer */
    public static class IconCompatParcelizer implements setReenterTransition<Uri, InputStream>, setArguments$MediaBrowserCompat$CustomActionResultReceiver<InputStream> {
        private final AssetManager IconCompatParcelizer;

        public IconCompatParcelizer(AssetManager assetManager) {
            this.IconCompatParcelizer = assetManager;
        }

        public final setSharedElementEnterTransition<Uri, InputStream> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new setArguments(this.IconCompatParcelizer, this);
        }

        public final onCreateOptionsMenu<InputStream> read(AssetManager assetManager, String str) {
            return new onOptionsItemSelected(assetManager, str);
        }
    }

    /* renamed from: o.setArguments$write */
    public static class write implements setReenterTransition<Uri, ParcelFileDescriptor>, setArguments$MediaBrowserCompat$CustomActionResultReceiver<ParcelFileDescriptor> {
        private final AssetManager MediaBrowserCompat$CustomActionResultReceiver;

        public write(AssetManager assetManager) {
            this.MediaBrowserCompat$CustomActionResultReceiver = assetManager;
        }

        public final setSharedElementEnterTransition<Uri, ParcelFileDescriptor> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new setArguments(this.MediaBrowserCompat$CustomActionResultReceiver, this);
        }

        public final onCreateOptionsMenu<ParcelFileDescriptor> read(AssetManager assetManager, String str) {
            return new onDestroy(assetManager, str);
        }
    }
}
