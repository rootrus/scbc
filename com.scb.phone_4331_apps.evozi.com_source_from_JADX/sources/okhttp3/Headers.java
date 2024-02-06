package okhttp3;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.TypeCastException;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import p040o.AddAccountConsentActivity;
import p040o.C1132xe4073f0a;
import p040o.FundOnboardingSuccessActivity;
import p040o.FundOnboardingSuccessActivity_ViewBinding;
import p040o.GoodToKnowActivity;
import p040o.HmlNationalIdActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.NtbDiscoverActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.OffshoreCurrencyActivity;
import p040o.QuickAccountSelectAdapter$HeaderHolder_ViewBinding;
import p040o.ScbsInputActivity;
import p040o.onGetStartedClick;

public final class Headers implements Iterable<HmlVerifyEmailSuccessfulActivity<? extends String, ? extends String>>, FundOnboardingSuccessActivity_ViewBinding {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private final String[] namesAndValues;

    /* renamed from: of */
    public static final Headers m3580of(Map<String, String> map) {
        return Companion.mo44764of(map);
    }

    /* renamed from: of */
    public static final Headers m3581of(String... strArr) {
        return Companion.mo44765of(strArr);
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
        this(strArr);
    }

    public final String get(String str) {
        onGetStartedClick.write((Object) str, "name");
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        onGetStartedClick.write((Object) str, "name");
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding getInstant(String str) {
        onGetStartedClick.write((Object) str, "name");
        Date date = getDate(str);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m6369deprecated_size() {
        return size();
    }

    public final String name(int i) {
        return this.namesAndValues[i << 1];
    }

    public final String value(int i) {
        return this.namesAndValues[(i << 1) + 1];
    }

    public final Set<String> names() {
        onGetStartedClick.write((Object) FundOnboardingSuccessActivity.IconCompatParcelizer, "$this$CASE_INSENSITIVE_ORDER");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        onGetStartedClick.IconCompatParcelizer((Object) comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        onGetStartedClick.IconCompatParcelizer((Object) unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final List<String> values(String str) {
        onGetStartedClick.write((Object) str, "name");
        int size = size();
        List list = null;
        for (int i = 0; i < size; i++) {
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, name(i), true)) {
                if (list == null) {
                    list = new ArrayList(2);
                }
                list.add(value(i));
            }
        }
        if (list == null) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        onGetStartedClick.IconCompatParcelizer((Object) unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = (long) (strArr.length << 1);
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.namesAndValues[i].length();
        }
        return length;
    }

    public final Iterator<HmlVerifyEmailSuccessfulActivity<String, String>> iterator() {
        int size = size();
        HmlVerifyEmailSuccessfulActivity[] hmlVerifyEmailSuccessfulActivityArr = new HmlVerifyEmailSuccessfulActivity[size];
        for (int i = 0; i < size; i++) {
            hmlVerifyEmailSuccessfulActivityArr[i] = new HmlVerifyEmailSuccessfulActivity(name(i), value(i));
        }
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivityArr, "array");
        return new NtbDiscoverActivity<>(hmlVerifyEmailSuccessfulActivityArr);
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        Collection namesAndValues$okhttp = builder.getNamesAndValues$okhttp();
        String[] strArr = this.namesAndValues;
        onGetStartedClick.write((Object) namesAndValues$okhttp, "$this$addAll");
        onGetStartedClick.write((Object) strArr, "elements");
        onGetStartedClick.write((Object) strArr, "$this$asList");
        List asList = Arrays.asList(strArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        namesAndValues$okhttp.addAll(asList);
        return builder;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(name(i));
            sb.append(": ");
            sb.append(value(i));
            sb.append("\n");
        }
        String obj = sb.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder().apply(builderAction).toString()");
        return obj;
    }

    public final Map<String, List<String>> toMultimap() {
        onGetStartedClick.write((Object) FundOnboardingSuccessActivity.IconCompatParcelizer, "$this$CASE_INSENSITIVE_ORDER");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        onGetStartedClick.IconCompatParcelizer((Object) comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        int i = 0;
        while (i < size) {
            String name = name(i);
            Locale locale = Locale.US;
            onGetStartedClick.IconCompatParcelizer((Object) locale, "Locale.US");
            if (name != null) {
                String lowerCase = name.toLowerCase(locale);
                onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                List list = (List) treeMap.get(lowerCase);
                if (list == null) {
                    list = new ArrayList(2);
                    treeMap.put(lowerCase, list);
                }
                list.add(value(i));
                i++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return treeMap;
    }

    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder addLenient$okhttp(String str) {
            onGetStartedClick.write((Object) str, "line");
            Builder builder = this;
            int MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) str, ':', 1, false);
            if (MediaBrowserCompat$CustomActionResultReceiver != -1) {
                String substring = str.substring(0, MediaBrowserCompat$CustomActionResultReceiver);
                onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(MediaBrowserCompat$CustomActionResultReceiver + 1);
                onGetStartedClick.IconCompatParcelizer((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                builder.addLenient$okhttp(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                onGetStartedClick.IconCompatParcelizer((Object) substring3, "(this as java.lang.String).substring(startIndex)");
                builder.addLenient$okhttp("", substring3);
            } else {
                builder.addLenient$okhttp("", str);
            }
            return builder;
        }

        public final Builder add(String str) {
            onGetStartedClick.write((Object) str, "line");
            Builder builder = this;
            int MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((CharSequence) str, ':', 0, false);
            if (MediaBrowserCompat$CustomActionResultReceiver != -1) {
                String substring = str.substring(0, MediaBrowserCompat$CustomActionResultReceiver);
                onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (substring != null) {
                    String obj = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(substring).toString();
                    String substring2 = str.substring(MediaBrowserCompat$CustomActionResultReceiver + 1);
                    onGetStartedClick.IconCompatParcelizer((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                    builder.add(obj, substring2);
                    return builder;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected header: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        public final Builder add(String str, String str2) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            Headers.Companion.checkName(str);
            Headers.Companion.checkValue(str2, str);
            builder.addLenient$okhttp(str, str2);
            return builder;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            Headers.Companion.checkName(str);
            builder.addLenient$okhttp(str, str2);
            return builder;
        }

        public final Builder addAll(Headers headers) {
            onGetStartedClick.write((Object) headers, "headers");
            Builder builder = this;
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                builder.addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return builder;
        }

        public final Builder add(String str, Date date) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) date, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            builder.add(str, DatesKt.toHttpDateString(date));
            return builder;
        }

        public final Builder add(String str, QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) quickAccountSelectAdapter$HeaderHolder_ViewBinding, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            builder.add(str, new Date(quickAccountSelectAdapter$HeaderHolder_ViewBinding.toEpochMilli()));
            return builder;
        }

        public final Builder set(String str, Date date) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) date, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            builder.set(str, DatesKt.toHttpDateString(date));
            return builder;
        }

        public final Builder set(String str, QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) quickAccountSelectAdapter$HeaderHolder_ViewBinding, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return set(str, new Date(quickAccountSelectAdapter$HeaderHolder_ViewBinding.toEpochMilli()));
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            builder.namesAndValues.add(str);
            builder.namesAndValues.add(GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str2).toString());
            return builder;
        }

        public final Builder removeAll(String str) {
            onGetStartedClick.write((Object) str, "name");
            Builder builder = this;
            int i = 0;
            while (i < builder.namesAndValues.size()) {
                if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, builder.namesAndValues.get(i), true)) {
                    builder.namesAndValues.remove(i);
                    builder.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return builder;
        }

        public final Builder set(String str, String str2) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            Headers.Companion.checkName(str);
            Headers.Companion.checkValue(str2, str);
            builder.removeAll(str);
            builder.addLenient$okhttp(str, str2);
            return builder;
        }

        public final String get(String str) {
            onGetStartedClick.write((Object) str, "name");
            OffshoreCurrencyActivity.IconCompatParcelizer iconCompatParcelizer = OffshoreCurrencyActivity.MediaBrowserCompat$ItemReceiver;
            OffshoreCurrencyActivity write = ScbsInputActivity.write(new OffshoreCurrencyActivity(this.namesAndValues.size() - 2, 0, -1), 2);
            int i = write.IconCompatParcelizer;
            int i2 = write.write;
            int i3 = write.read;
            if (i3 >= 0) {
                if (i > i2) {
                    return null;
                }
            } else if (i < i2) {
                return null;
            }
            while (!GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, this.namesAndValues.get(i), true)) {
                if (i == i2) {
                    return null;
                }
                i += i3;
            }
            return this.namesAndValues.get(i + 1);
        }

        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, (NtbDiscoverFundFilterActivity) null);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        /* access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            OffshoreCurrencyActivity.IconCompatParcelizer iconCompatParcelizer = OffshoreCurrencyActivity.MediaBrowserCompat$ItemReceiver;
            OffshoreCurrencyActivity write = ScbsInputActivity.write(new OffshoreCurrencyActivity(strArr.length - 2, 0, -1), 2);
            int i = write.IconCompatParcelizer;
            int i2 = write.write;
            int i3 = write.read;
            if (i3 >= 0) {
                if (i > i2) {
                    return null;
                }
            } else if (i < i2) {
                return null;
            }
            while (!GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, strArr[i], true)) {
                if (i == i2) {
                    return null;
                }
                i += i3;
            }
            return strArr[i + 1];
        }

        /* renamed from: of */
        public final Headers mo44765of(String... strArr) {
            AddAccountConsentActivity addAccountConsentActivity;
            onGetStartedClick.write((Object) strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                if (clone != null) {
                    String[] strArr2 = (String[]) clone;
                    int length = strArr2.length;
                    int i = 0;
                    while (i < length) {
                        if (strArr2[i] != null) {
                            String str = strArr2[i];
                            if (str != null) {
                                strArr2[i] = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str).toString();
                                i++;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        }
                    }
                    int length2 = strArr2.length;
                    if (length2 <= Integer.MIN_VALUE) {
                        C1132xe4073f0a addAccountConsentActivity$MediaBrowserCompat$CustomActionResultReceiver = AddAccountConsentActivity.MediaBrowserCompat$CustomActionResultReceiver;
                        addAccountConsentActivity = AddAccountConsentActivity.MediaBrowserCompat$MediaItem;
                    } else {
                        addAccountConsentActivity = new AddAccountConsentActivity(0, length2 - 1);
                    }
                    OffshoreCurrencyActivity write = ScbsInputActivity.write(addAccountConsentActivity, 2);
                    int i2 = write.IconCompatParcelizer;
                    int i3 = write.write;
                    int i4 = write.read;
                    if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                        while (true) {
                            String str2 = strArr2[i2];
                            String str3 = strArr2[i2 + 1];
                            Companion companion = this;
                            companion.checkName(str2);
                            companion.checkValue(str3, str2);
                            if (i2 == i3) {
                                break;
                            }
                            i2 += i4;
                        }
                    }
                    return new Headers(strArr2, (NtbDiscoverFundFilterActivity) null);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m6371deprecated_of(String... strArr) {
            onGetStartedClick.write((Object) strArr, "namesAndValues");
            return mo44765of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: of */
        public final Headers mo44764of(Map<String, String> map) {
            onGetStartedClick.write((Object) map, "$this$toHeaders");
            String[] strArr = new String[(map.size() << 1)];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                if (str != null) {
                    String obj = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str).toString();
                    if (str2 != null) {
                        String obj2 = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str2).toString();
                        Companion companion = this;
                        companion.checkName(obj);
                        companion.checkValue(obj2, obj);
                        strArr[i] = obj;
                        strArr[i + 1] = obj2;
                        i += 2;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return new Headers(strArr, (NtbDiscoverFundFilterActivity) null);
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m6370deprecated_of(Map<String, String> map) {
            onGetStartedClick.write((Object) map, "headers");
            return mo44764of(map);
        }

        /* access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                    i++;
                } else {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }
    }
}
