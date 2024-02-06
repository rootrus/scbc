package p040o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: o.HmlNTBEkycVerifyIdentifyBranchActivity */
public final class HmlNTBEkycVerifyIdentifyBranchActivity implements Set, Serializable, FundOnboardingSuccessActivity_ViewBinding {
    public static final HmlNTBEkycVerifyIdentifyBranchActivity MediaBrowserCompat$CustomActionResultReceiver = new HmlNTBEkycVerifyIdentifyBranchActivity();

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final Object[] toArray() {
        return NtbDiscoverSearchActivity.write(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        return NtbDiscoverSearchActivity.write(this, tArr);
    }

    public final String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    private HmlNTBEkycVerifyIdentifyBranchActivity() {
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            onGetStartedClick.write((Object) (Void) obj, "element");
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        onGetStartedClick.write((Object) collection, "elements");
        return collection.isEmpty();
    }

    public final Iterator iterator() {
        return HmlNTBEkycPassportLandingActivity.IconCompatParcelizer;
    }

    private final Object readResolve() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
