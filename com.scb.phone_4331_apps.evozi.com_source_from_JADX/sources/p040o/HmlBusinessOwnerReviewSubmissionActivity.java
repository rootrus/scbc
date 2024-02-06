package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.HmlBusinessOwnerReviewSubmissionActivity */
public final class HmlBusinessOwnerReviewSubmissionActivity extends HmlBusinessOwnerGuidelinesActivity {
    public static final <T> int MediaBrowserCompat$ItemReceiver(T[] tArr, T t) {
        onGetStartedClick.write((Object) tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) t, (Object) tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final char write(char[] cArr) {
        onGetStartedClick.write((Object) cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final <C extends Collection<? super T>, T> C MediaBrowserCompat$ItemReceiver(T[] tArr, C c) {
        onGetStartedClick.write((Object) tArr, "$this$filterNotNullTo");
        onGetStartedClick.write((Object) c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    private static <T, C extends Collection<? super T>> C read(T[] tArr, C c) {
        onGetStartedClick.write((Object) tArr, "$this$toCollection");
        onGetStartedClick.write((Object) c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    public static final <T> List<T> write(T[] tArr) {
        onGetStartedClick.write((Object) tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        }
        if (length != 1) {
            onGetStartedClick.write((Object) tArr, "$this$toMutableList");
            onGetStartedClick.write((Object) tArr, "$this$asCollection");
            return new ArrayList<>(new NTBPinLoginActivity_ViewBinding(tArr, false));
        }
        List<T> singletonList = Collections.singletonList(tArr[0]);
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static final <T> Set<T> MediaBrowserCompat$ItemReceiver(T[] tArr) {
        onGetStartedClick.write((Object) tArr, "$this$toSet");
        int length = tArr.length;
        if (length == 0) {
            return HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (length != 1) {
            return (Set) read(tArr, new LinkedHashSet(HmlNdidSelectIdpActivity.read(tArr.length)));
        }
        Set<T> singleton = Collections.singleton(tArr[0]);
        onGetStartedClick.IconCompatParcelizer((Object) singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }

    private static <A extends Appendable> A MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, FundFactSheetActivity<? super Byte, ? extends CharSequence> fundFactSheetActivity) {
        onGetStartedClick.write((Object) bArr, "$this$joinTo");
        onGetStartedClick.write((Object) a, "buffer");
        onGetStartedClick.write((Object) charSequence, "separator");
        onGetStartedClick.write((Object) charSequence2, "prefix");
        onGetStartedClick.write((Object) charSequence3, "postfix");
        onGetStartedClick.write((Object) charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (fundFactSheetActivity != null) {
                a.append((CharSequence) fundFactSheetActivity.invoke(Byte.valueOf(b)));
            } else {
                a.append(String.valueOf(b));
            }
        }
        a.append(charSequence3);
        return a;
    }

    public static <A extends Appendable> A write(char[] cArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, FundFactSheetActivity<? super Character, ? extends CharSequence> fundFactSheetActivity) {
        onGetStartedClick.write((Object) cArr, "$this$joinTo");
        onGetStartedClick.write((Object) a, "buffer");
        onGetStartedClick.write((Object) charSequence, "separator");
        onGetStartedClick.write((Object) charSequence2, "prefix");
        onGetStartedClick.write((Object) charSequence3, "postfix");
        onGetStartedClick.write((Object) charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (char c : cArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (fundFactSheetActivity != null) {
                a.append((CharSequence) fundFactSheetActivity.invoke(Character.valueOf(c)));
            } else {
                a.append(c);
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, CharSequence charSequence, FundFactSheetActivity fundFactSheetActivity) {
        CharSequence charSequence2 = "";
        CharSequence charSequence3 = "";
        CharSequence charSequence4 = "...";
        onGetStartedClick.write((Object) bArr, "$this$joinToString");
        onGetStartedClick.write((Object) charSequence, "separator");
        onGetStartedClick.write((Object) charSequence2, "prefix");
        onGetStartedClick.write((Object) charSequence3, "postfix");
        onGetStartedClick.write((Object) charSequence4, "truncated");
        String obj = ((StringBuilder) MediaBrowserCompat$CustomActionResultReceiver(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, charSequence4, fundFactSheetActivity)).toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "joinTo(StringBuilder(), …ed, transform).toString()");
        return obj;
    }
}
