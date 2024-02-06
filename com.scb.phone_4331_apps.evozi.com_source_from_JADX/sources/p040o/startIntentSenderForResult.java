package p040o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.startIntentSenderForResult */
public final class startIntentSenderForResult<Data> implements setSharedElementEnterTransition<Uri, Data> {
    private static final Set<String> read = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    private final C1589xdb4af160<Data> MediaBrowserCompat$ItemReceiver;

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        Uri uri = (Uri) obj;
        return new C1536x6a517a85(new unregisterListener(uri), this.MediaBrowserCompat$ItemReceiver.write(uri));
    }

    public final /* synthetic */ boolean write(Object obj) {
        return read.contains(((Uri) obj).getScheme());
    }

    public startIntentSenderForResult(C1589xdb4af160<Data> startintentsenderforresult_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$ItemReceiver = startintentsenderforresult_mediabrowsercompat_customactionresultreceiver;
    }

    /* renamed from: o.startIntentSenderForResult$write */
    public static class write implements setReenterTransition<Uri, InputStream>, C1589xdb4af160<InputStream> {
        private final ContentResolver IconCompatParcelizer;

        public write(ContentResolver contentResolver) {
            this.IconCompatParcelizer = contentResolver;
        }

        public final onCreateOptionsMenu<InputStream> write(Uri uri) {
            return new onPrepareOptionsMenu(this.IconCompatParcelizer, uri);
        }

        public final setSharedElementEnterTransition<Uri, InputStream> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new startIntentSenderForResult(this);
        }
    }

    /* renamed from: o.startIntentSenderForResult$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements setReenterTransition<Uri, AssetFileDescriptor>, C1589xdb4af160<AssetFileDescriptor> {
        private final ContentResolver write;

        public IconCompatParcelizer(ContentResolver contentResolver) {
            this.write = contentResolver;
        }

        public final setSharedElementEnterTransition<Uri, AssetFileDescriptor> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new startIntentSenderForResult(this);
        }

        public final onCreateOptionsMenu<AssetFileDescriptor> write(Uri uri) {
            return new onCreateAnimator(this.write, uri);
        }
    }
}
