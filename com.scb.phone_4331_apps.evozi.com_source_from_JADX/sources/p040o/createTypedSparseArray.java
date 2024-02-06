package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import com.scb.phone.view.fragment.directdebit.C5907x10730e76;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.createTypedSparseArray */
public final /* synthetic */ class createTypedSparseArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C5907x10730e76 read;

    public /* synthetic */ createTypedSparseArray(C5907x10730e76 directDebitInputBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.read = directDebitInputBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        setMinFrame setminframe = (setMinFrame) obj;
        onGetStartedClick.write((Object) setminframe, "entity");
        String str = setminframe.write;
        if (str != null) {
            return new setWidth(DiskLruCache.VERSION_1.equals(str));
        }
        throw new EntityMappingException("Some mandatory is missing.");
    }
}
