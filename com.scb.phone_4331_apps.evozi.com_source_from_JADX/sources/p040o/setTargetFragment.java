package p040o;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* renamed from: o.setTargetFragment */
public final class setTargetFragment<Data> implements setSharedElementEnterTransition<Integer, Data> {
    private final Resources MediaBrowserCompat$ItemReceiver;
    private final setSharedElementEnterTransition<Uri, Data> read;

    public final /* bridge */ /* synthetic */ boolean write(Object obj) {
        return true;
    }

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        Uri MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver((Integer) obj);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return this.read.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, i, i2, onactivityresult);
    }

    public setTargetFragment(Resources resources, setSharedElementEnterTransition<Uri, Data> setsharedelemententertransition) {
        this.MediaBrowserCompat$ItemReceiver = resources;
        this.read = setsharedelemententertransition;
    }

    private Uri MediaBrowserCompat$CustomActionResultReceiver(Integer num) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(this.MediaBrowserCompat$ItemReceiver.getResourcePackageName(num.intValue()));
            sb.append('/');
            sb.append(this.MediaBrowserCompat$ItemReceiver.getResourceTypeName(num.intValue()));
            sb.append('/');
            sb.append(this.MediaBrowserCompat$ItemReceiver.getResourceEntryName(num.intValue()));
            return Uri.parse(sb.toString());
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Received invalid resource id: ");
            sb2.append(num);
            Log.w("ResourceLoader", sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: o.setTargetFragment$IconCompatParcelizer */
    public static class IconCompatParcelizer implements setReenterTransition<Integer, InputStream> {
        private final Resources write;

        public IconCompatParcelizer(Resources resources) {
            this.write = resources;
        }

        public final setSharedElementEnterTransition<Integer, InputStream> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new setTargetFragment(this.write, shouldshowrequestpermissionrationale.read(Uri.class, InputStream.class));
        }
    }

    /* renamed from: o.setTargetFragment$read */
    public static class read implements setReenterTransition<Integer, Uri> {
        private final Resources write;

        public read(Resources resources) {
            this.write = resources;
        }

        public final setSharedElementEnterTransition<Integer, Uri> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new setTargetFragment(this.write, setUserVisibleHint.MediaBrowserCompat$ItemReceiver());
        }
    }
}
