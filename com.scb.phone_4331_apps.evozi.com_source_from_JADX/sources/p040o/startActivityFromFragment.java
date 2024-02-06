package p040o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;

/* renamed from: o.startActivityFromFragment */
public final class startActivityFromFragment implements isVisible<Uri, Bitmap> {
    private final findFragmentById MediaBrowserCompat$ItemReceiver;
    private final CheckParameters_MembersInjector write;

    public final /* synthetic */ boolean IconCompatParcelizer(Object obj, onActivityResult onactivityresult) throws IOException {
        return "android.resource".equals(((Uri) obj).getScheme());
    }

    public final /* synthetic */ performOptionsMenuClosed MediaBrowserCompat$CustomActionResultReceiver(Object obj, int i, int i2, onActivityResult onactivityresult) throws IOException {
        performOptionsMenuClosed<Drawable> read = this.MediaBrowserCompat$ItemReceiver.read((Uri) obj);
        if (read == null) {
            return null;
        }
        return onResumeFragments.IconCompatParcelizer(this.write, read.write(), i, i2);
    }

    public startActivityFromFragment(findFragmentById findfragmentbyid, CheckParameters_MembersInjector checkParameters_MembersInjector) {
        this.MediaBrowserCompat$ItemReceiver = findfragmentbyid;
        this.write = checkParameters_MembersInjector;
    }
}
