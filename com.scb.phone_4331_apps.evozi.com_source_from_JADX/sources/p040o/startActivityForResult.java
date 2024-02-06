package p040o;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.startActivityForResult */
public final class startActivityForResult<Data> implements setSharedElementEnterTransition<Uri, Data> {
    private static final Set<String> IconCompatParcelizer = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    private final setSharedElementEnterTransition<setInitialSavedState, Data> read;

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        return this.read.IconCompatParcelizer(new setInitialSavedState(((Uri) obj).toString()), i, i2, onactivityresult);
    }

    public final /* synthetic */ boolean write(Object obj) {
        return IconCompatParcelizer.contains(((Uri) obj).getScheme());
    }

    public startActivityForResult(setSharedElementEnterTransition<setInitialSavedState, Data> setsharedelemententertransition) {
        this.read = setsharedelemententertransition;
    }

    /* renamed from: o.startActivityForResult$write */
    public static class write implements setReenterTransition<Uri, InputStream> {
        public final setSharedElementEnterTransition<Uri, InputStream> MediaBrowserCompat$CustomActionResultReceiver(shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale) {
            return new startActivityForResult(shouldshowrequestpermissionrationale.read(setInitialSavedState.class, InputStream.class));
        }
    }
}
