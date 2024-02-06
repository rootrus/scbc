package p040o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

/* renamed from: o.HmlNationalIdActivity */
public final class HmlNationalIdActivity implements List, Serializable, RandomAccess, FundOnboardingSuccessActivity_ViewBinding {
    public static final HmlNationalIdActivity IconCompatParcelizer = new HmlNationalIdActivity();

    public final /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int hashCode() {
        return 1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public final /* synthetic */ Object set(int i, Object obj) {
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

    private HmlNationalIdActivity() {
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            onGetStartedClick.write((Object) (Void) obj, "element");
        }
        return false;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Void) {
            onGetStartedClick.write((Object) (Void) obj, "element");
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            onGetStartedClick.write((Object) (Void) obj, "element");
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        onGetStartedClick.write((Object) collection, "elements");
        return collection.isEmpty();
    }

    public final Iterator iterator() {
        return HmlNTBEkycPassportLandingActivity.IconCompatParcelizer;
    }

    public final ListIterator listIterator() {
        return HmlNTBEkycPassportLandingActivity.IconCompatParcelizer;
    }

    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return HmlNTBEkycPassportLandingActivity.IconCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private final Object readResolve() {
        return IconCompatParcelizer;
    }

    public final /* synthetic */ Object get(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
