package p040o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.HmlETBOperatingBankActivity */
public class HmlETBOperatingBankActivity extends HmlNTBBusinessIndustrySelectionActivity {
    public static final <T> List<T> MediaBrowserCompat$CustomActionResultReceiver(T... tArr) {
        onGetStartedClick.write((Object) tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new NTBPinLoginActivity_ViewBinding(tArr, true));
    }

    public static final <T> ArrayList<T> IconCompatParcelizer(T... tArr) {
        onGetStartedClick.write((Object) tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new NTBPinLoginActivity_ViewBinding(tArr, true));
    }

    public static final <T> List<T> write(List<? extends T> list) {
        onGetStartedClick.write((Object) list, "$this$optimizeReadOnlyList");
        int size = list.size();
        if (size == 0) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        }
        if (size != 1) {
            return list;
        }
        List<T> singletonList = Collections.singletonList(list.get(0));
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static /* synthetic */ int write(List list, Comparable comparable) {
        int size = list.size();
        onGetStartedClick.write((Object) list, "$this$binarySearch");
        int size2 = list.size();
        if (size < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("fromIndex (");
            sb.append(0);
            sb.append(") is greater than toIndex (");
            sb.append(size);
            sb.append(").");
            throw new IllegalArgumentException(sb.toString());
        } else if (size <= size2) {
            int i = size - 1;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 > i) {
                    return -(i2 + 1);
                }
                int i4 = (i2 + i) >>> 1;
                Comparable comparable2 = (Comparable) list.get(i4);
                if (comparable2 == comparable) {
                    i3 = 0;
                } else if (comparable2 == null) {
                    i3 = -1;
                } else if (comparable != null) {
                    i3 = comparable2.compareTo(comparable);
                }
                if (i3 < 0) {
                    i2 = i4 + 1;
                } else if (i3 <= 0) {
                    return i4;
                } else {
                    i = i4 - 1;
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toIndex (");
            sb2.append(size);
            sb2.append(") is greater than size (");
            sb2.append(size2);
            sb2.append(").");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
    }
}
