package p040o;

import java.util.Collections;
import java.util.List;

/* renamed from: o.setSharedElementEnterTransition$MediaBrowserCompat$CustomActionResultReceiver */
public class C1536x6a517a85<Data> {
    public final onCreateOptionsMenu<Data> MediaBrowserCompat$ItemReceiver;
    public final isStateSaved read;
    public final List<isStateSaved> write;

    public C1536x6a517a85(isStateSaved isstatesaved, onCreateOptionsMenu<Data> oncreateoptionsmenu) {
        this(isstatesaved, Collections.emptyList(), oncreateoptionsmenu);
    }

    private C1536x6a517a85(isStateSaved isstatesaved, List<isStateSaved> list, onCreateOptionsMenu<Data> oncreateoptionsmenu) {
        if (isstatesaved != null) {
            this.read = isstatesaved;
            if (list != null) {
                this.write = list;
                if (oncreateoptionsmenu != null) {
                    this.MediaBrowserCompat$ItemReceiver = oncreateoptionsmenu;
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }
}
