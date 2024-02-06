package p040o;

import java.io.InputStream;
import java.net.URL;

/* renamed from: o.markFragmentsCreated */
public final class markFragmentsCreated implements setSharedElementEnterTransition<URL, InputStream> {
    private final setSharedElementEnterTransition<setInitialSavedState, InputStream> MediaBrowserCompat$ItemReceiver;

    public final /* bridge */ /* synthetic */ boolean write(Object obj) {
        return true;
    }

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new setInitialSavedState((URL) obj), i, i2, onactivityresult);
    }

    public markFragmentsCreated(setSharedElementEnterTransition<setInitialSavedState, InputStream> setsharedelemententertransition) {
        this.MediaBrowserCompat$ItemReceiver = setsharedelemententertransition;
    }

    /* renamed from: o.markFragmentsCreated$write */
    public static class write implements setReenterTransition<URL, InputStream> {
        public final setSharedElementEnterTransition<URL, InputStream> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new markFragmentsCreated(shouldshowrequestpermissionrationale.read(setInitialSavedState.class, InputStream.class));
        }
    }
}
