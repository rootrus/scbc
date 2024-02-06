package p040o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.NTBPinLoginActivity_ViewBinding */
public final class NTBPinLoginActivity_ViewBinding<T> implements Collection<T>, FundOnboardingSuccessActivity_ViewBinding {
    private final T[] read;
    private final boolean write;

    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final <T> T[] toArray(T[] tArr) {
        return NtbDiscoverSearchActivity.write(this, tArr);
    }

    public NTBPinLoginActivity_ViewBinding(T[] tArr, boolean z) {
        onGetStartedClick.write((Object) tArr, "values");
        this.read = tArr;
        this.write = z;
    }

    public final boolean isEmpty() {
        return this.read.length == 0;
    }

    public final boolean contains(Object obj) {
        T[] tArr = this.read;
        onGetStartedClick.write((Object) tArr, "$this$contains");
        return HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver(tArr, obj) >= 0;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        onGetStartedClick.write((Object) collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<T> iterator() {
        T[] tArr = this.read;
        onGetStartedClick.write((Object) tArr, "array");
        return new NtbDiscoverActivity<>(tArr);
    }

    public final Object[] toArray() {
        T[] tArr = this.read;
        boolean z = this.write;
        onGetStartedClick.write((Object) tArr, "$this$copyToArrayOfAny");
        if (z && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) tArr.getClass(), (Object) Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        onGetStartedClick.IconCompatParcelizer((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }

    public final /* bridge */ int size() {
        return this.read.length;
    }
}
