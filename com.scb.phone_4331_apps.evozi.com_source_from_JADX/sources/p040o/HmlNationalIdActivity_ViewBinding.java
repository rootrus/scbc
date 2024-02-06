package p040o;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;

/* renamed from: o.HmlNationalIdActivity_ViewBinding */
public class HmlNationalIdActivity_ViewBinding extends HmlNdidNationalIdInputActivity {
    public static final <K, V> Map<K, V> read(HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>... hmlVerifyEmailSuccessfulActivityArr) {
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivityArr, "pairs");
        if (hmlVerifyEmailSuccessfulActivityArr.length > 0) {
            return HmlNdidSelectIdpActivity.write(hmlVerifyEmailSuccessfulActivityArr, new LinkedHashMap(HmlNdidSelectIdpActivity.read(hmlVerifyEmailSuccessfulActivityArr.length)));
        }
        HmlNTBeKYCLandingActivity_ViewBinding hmlNTBeKYCLandingActivity_ViewBinding = HmlNTBeKYCLandingActivity_ViewBinding.read;
        if (hmlNTBeKYCLandingActivity_ViewBinding != null) {
            return hmlNTBeKYCLandingActivity_ViewBinding;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    public static final <K, V> void MediaBrowserCompat$CustomActionResultReceiver(Map<? super K, ? super V> map, HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>[] hmlVerifyEmailSuccessfulActivityArr) {
        onGetStartedClick.write((Object) map, "$this$putAll");
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivityArr, "pairs");
        for (HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V> hmlVerifyEmailSuccessfulActivity : hmlVerifyEmailSuccessfulActivityArr) {
            map.put(hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver, hmlVerifyEmailSuccessfulActivity.write);
        }
    }

    public static final <K, V> void IconCompatParcelizer(Map<? super K, ? super V> map, Iterable<? extends HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>> iterable) {
        onGetStartedClick.write((Object) map, "$this$putAll");
        onGetStartedClick.write((Object) iterable, "pairs");
        for (HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity : iterable) {
            map.put(hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver, hmlVerifyEmailSuccessfulActivity.write);
        }
    }

    public static final <K, V> void MediaBrowserCompat$CustomActionResultReceiver(Map<? super K, ? super V> map, BaseJuristicPinActivity_ViewBinding<? extends HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>> baseJuristicPinActivity_ViewBinding) {
        onGetStartedClick.write((Object) map, "$this$putAll");
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "pairs");
        Iterator<? extends HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>> read = baseJuristicPinActivity_ViewBinding.read();
        while (read.hasNext()) {
            HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = (HmlVerifyEmailSuccessfulActivity) read.next();
            map.put(hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver, hmlVerifyEmailSuccessfulActivity.write);
        }
    }

    public static final <K, V> Map<K, V> read(Iterable<? extends HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>> iterable) {
        onGetStartedClick.write((Object) iterable, "$this$toMap");
        if (!(iterable instanceof Collection)) {
            return HmlNdidSelectIdpActivity.read(HmlNdidSelectIdpActivity.MediaBrowserCompat$ItemReceiver(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            HmlNTBeKYCLandingActivity_ViewBinding hmlNTBeKYCLandingActivity_ViewBinding = HmlNTBeKYCLandingActivity_ViewBinding.read;
            if (hmlNTBeKYCLandingActivity_ViewBinding != null) {
                return hmlNTBeKYCLandingActivity_ViewBinding;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        } else if (size != 1) {
            return HmlNdidSelectIdpActivity.MediaBrowserCompat$ItemReceiver(iterable, new LinkedHashMap(HmlNdidSelectIdpActivity.read(collection.size())));
        } else {
            HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = (HmlVerifyEmailSuccessfulActivity) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "pair");
            Map<K, V> singletonMap = Collections.singletonMap(hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver, hmlVerifyEmailSuccessfulActivity.write);
            onGetStartedClick.IconCompatParcelizer((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
            return singletonMap;
        }
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M MediaBrowserCompat$ItemReceiver(Iterable<? extends HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>> iterable, M m) {
        onGetStartedClick.write((Object) iterable, "$this$toMap");
        onGetStartedClick.write((Object) m, "destination");
        HmlNdidSelectIdpActivity.IconCompatParcelizer(m, iterable);
        return m;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M write(HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>[] hmlVerifyEmailSuccessfulActivityArr, M m) {
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivityArr, "$this$toMap");
        onGetStartedClick.write((Object) m, "destination");
        HmlNdidSelectIdpActivity.MediaBrowserCompat$CustomActionResultReceiver(m, hmlVerifyEmailSuccessfulActivityArr);
        return m;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M write(BaseJuristicPinActivity_ViewBinding<? extends HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>> baseJuristicPinActivity_ViewBinding, M m) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "$this$toMap");
        onGetStartedClick.write((Object) m, "destination");
        HmlNdidSelectIdpActivity.MediaBrowserCompat$CustomActionResultReceiver(m, baseJuristicPinActivity_ViewBinding);
        return m;
    }

    public static final <K, V> Map<K, V> read(Map<K, ? extends V> map) {
        onGetStartedClick.write((Object) map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        if (size == 0) {
            HmlNTBeKYCLandingActivity_ViewBinding hmlNTBeKYCLandingActivity_ViewBinding = HmlNTBeKYCLandingActivity_ViewBinding.read;
            if (hmlNTBeKYCLandingActivity_ViewBinding != null) {
                return hmlNTBeKYCLandingActivity_ViewBinding;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        } else if (size != 1) {
            return map;
        } else {
            onGetStartedClick.write((Object) map, "$this$toSingletonMap");
            Map.Entry next = map.entrySet().iterator().next();
            Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
            onGetStartedClick.IconCompatParcelizer((Object) singletonMap, "java.util.Collections.singletonMap(key, value)");
            onGetStartedClick.IconCompatParcelizer((Object) singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
            return singletonMap;
        }
    }
}
