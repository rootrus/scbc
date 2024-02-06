package p040o;

import android.util.TypedValue;
import android.view.View;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.onStart */
public final class onStart {
    static {
        new TypedValue();
    }

    @SafeVarargs
    private static <T> T[] IconCompatParcelizer(T... tArr) {
        int i = 0;
        for (T t : tArr) {
            if (t != null) {
                tArr[i] = t;
                i++;
            }
        }
        return i != r0 ? Arrays.copyOf(tArr, i) : tArr;
    }

    @SafeVarargs
    public static <T> List<T> write(T... tArr) {
        return new onCancel(IconCompatParcelizer(tArr));
    }

    public static <T> T IconCompatParcelizer(View view, int i, String str, Class<T> cls) {
        return write(view.findViewById(i), i, str, cls);
    }

    public static View IconCompatParcelizer(View view, int i, String str) {
        String str2;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        if (view.isInEditMode()) {
            str2 = "<unavailable while editing>";
        } else {
            str2 = view.getContext().getResources().getResourceEntryName(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Required view '");
        sb.append(str2);
        sb.append("' with ID ");
        sb.append(i);
        sb.append(" for ");
        sb.append(str);
        sb.append(" was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
        throw new IllegalStateException(sb.toString());
    }

    public static <T> T MediaBrowserCompat$CustomActionResultReceiver(View view, int i, String str, Class<T> cls) {
        return write(IconCompatParcelizer(view, i, str), i, str, cls);
    }

    public static <T> T write(View view, int i, String str, Class<T> cls) {
        String str2;
        try {
            return cls.cast(view);
        } catch (ClassCastException e) {
            if (view.isInEditMode()) {
                str2 = "<unavailable while editing>";
            } else {
                str2 = view.getContext().getResources().getResourceEntryName(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("View '");
            sb.append(str2);
            sb.append("' with ID ");
            sb.append(i);
            sb.append(" for ");
            sb.append(str);
            sb.append(" was of the wrong type. See cause for more info.");
            throw new IllegalStateException(sb.toString(), e);
        }
    }

    public static <T> T MediaBrowserCompat$CustomActionResultReceiver(Object obj, String str, String str2, Class<T> cls) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Parameter #");
            sb.append(1);
            sb.append(" of method '");
            sb.append(str);
            sb.append("' was of the wrong type for parameter #");
            sb.append(1);
            sb.append(" of method '");
            sb.append(str2);
            sb.append("'. See cause for more info.");
            throw new IllegalStateException(sb.toString(), e);
        }
    }
}
