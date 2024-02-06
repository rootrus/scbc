package p040o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* renamed from: o.findFragmentById */
public final class findFragmentById implements isVisible<Uri, Drawable> {
    private final Context read;

    public final /* synthetic */ boolean IconCompatParcelizer(Object obj, onActivityResult onactivityresult) throws IOException {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public final /* synthetic */ performOptionsMenuClosed MediaBrowserCompat$CustomActionResultReceiver(Object obj, int i, int i2, onActivityResult onactivityresult) throws IOException {
        return read((Uri) obj);
    }

    public findFragmentById(Context context) {
        this.read = context.getApplicationContext();
    }

    public final performOptionsMenuClosed<Drawable> read(Uri uri) {
        Context MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(uri, uri.getAuthority());
        Drawable MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.read, MediaBrowserCompat$ItemReceiver, read(MediaBrowserCompat$ItemReceiver, uri), (Resources.Theme) null);
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return new supportPostponeEnterTransition(MediaBrowserCompat$ItemReceiver2);
        }
        return null;
    }

    private Context MediaBrowserCompat$ItemReceiver(Uri uri, String str) {
        if (str.equals(this.read.getPackageName())) {
            return this.read;
        }
        try {
            return this.read.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.read.getPackageName())) {
                return this.read;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to obtain context or unrecognized Uri format for: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    private static int read(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            int identifier = context.getResources().getIdentifier(str2, str, authority);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier != 0) {
                return identifier;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find resource id for: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString());
        } else if (pathSegments.size() == 1) {
            return MediaBrowserCompat$ItemReceiver(uri);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unrecognized Uri format: ");
            sb2.append(uri);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static int MediaBrowserCompat$ItemReceiver(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized Uri format: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }
}
