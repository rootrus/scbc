package p040o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.TypeCastException;

/* renamed from: o.HmlNTBEkycNdidLandingActivity */
public class HmlNTBEkycNdidLandingActivity extends HmlNTBOperatingBankActivity {
    public static final <T> boolean MediaBrowserCompat$CustomActionResultReceiver(Collection<? super T> collection, Iterable<? extends T> iterable) {
        onGetStartedClick.write((Object) collection, "$this$addAll");
        onGetStartedClick.write((Object) iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean read(List<T> list, FundFactSheetActivity<? super T, Boolean> fundFactSheetActivity) {
        int i;
        boolean z = false;
        if (list instanceof RandomAccess) {
            onGetStartedClick.write((Object) list, "$this$lastIndex");
            int size = list.size() - 1;
            if (size >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    T t = list.get(i2);
                    if (!fundFactSheetActivity.invoke(t).booleanValue()) {
                        if (i != i2) {
                            list.set(i, t);
                        }
                        i++;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i >= list.size()) {
                return false;
            }
            onGetStartedClick.write((Object) list, "$this$lastIndex");
            int size2 = list.size() - 1;
            if (size2 >= i) {
                while (true) {
                    list.remove(size2);
                    if (size2 == i) {
                        break;
                    }
                    size2--;
                }
            }
            return true;
        } else if (list != null) {
            Iterator it = onAddAccountClick.write(list).iterator();
            while (it.hasNext()) {
                if (fundFactSheetActivity.invoke(it.next()).booleanValue()) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }
}
