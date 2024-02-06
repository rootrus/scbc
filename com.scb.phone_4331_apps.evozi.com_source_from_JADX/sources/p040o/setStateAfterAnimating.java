package p040o;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;

/* renamed from: o.setStateAfterAnimating */
public final class setStateAfterAnimating<Data> implements setSharedElementEnterTransition<String, Data> {
    private final setSharedElementEnterTransition<Uri, Data> IconCompatParcelizer;

    public final /* bridge */ /* synthetic */ boolean write(Object obj) {
        return true;
    }

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str));
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
        }
        if (uri == null || !this.IconCompatParcelizer.write(uri)) {
            return null;
        }
        return this.IconCompatParcelizer.IconCompatParcelizer(uri, i, i2, onactivityresult);
    }

    public setStateAfterAnimating(setSharedElementEnterTransition<Uri, Data> setsharedelemententertransition) {
        this.IconCompatParcelizer = setsharedelemententertransition;
    }

    /* renamed from: o.setStateAfterAnimating$read */
    public static class read implements setReenterTransition<String, ParcelFileDescriptor> {
        public final setSharedElementEnterTransition<String, ParcelFileDescriptor> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new setStateAfterAnimating(shouldshowrequestpermissionrationale.read(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: o.setStateAfterAnimating$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements setReenterTransition<String, AssetFileDescriptor> {
        public final setSharedElementEnterTransition<String, AssetFileDescriptor> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new setStateAfterAnimating(shouldshowrequestpermissionrationale.read(Uri.class, AssetFileDescriptor.class));
        }
    }
}
