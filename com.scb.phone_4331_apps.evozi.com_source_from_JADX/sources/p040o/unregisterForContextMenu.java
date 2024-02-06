package p040o;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.unregisterForContextMenu */
public final class unregisterForContextMenu implements setSharedElementEnterTransition<Uri, InputStream> {
    private static final Set<String> IconCompatParcelizer = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    private final setSharedElementEnterTransition<setInitialSavedState, InputStream> write;

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        return this.write.IconCompatParcelizer(new setInitialSavedState(((Uri) obj).toString()), i, i2, onactivityresult);
    }

    public final /* synthetic */ boolean write(Object obj) {
        return IconCompatParcelizer.contains(((Uri) obj).getScheme());
    }

    public unregisterForContextMenu(setSharedElementEnterTransition<setInitialSavedState, InputStream> setsharedelemententertransition) {
        this.write = setsharedelemententertransition;
    }
}
