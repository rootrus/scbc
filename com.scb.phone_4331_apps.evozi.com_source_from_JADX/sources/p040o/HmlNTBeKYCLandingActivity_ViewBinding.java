package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.HmlNTBeKYCLandingActivity_ViewBinding */
public final class HmlNTBeKYCLandingActivity_ViewBinding implements Map, Serializable, FundOnboardingSuccessActivity_ViewBinding {
    public static final HmlNTBeKYCLandingActivity_ViewBinding read = new HmlNTBeKYCLandingActivity_ViewBinding();

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    private HmlNTBeKYCLandingActivity_ViewBinding() {
    }

    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            onGetStartedClick.write((Object) (Void) obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    private final Object readResolve() {
        return read;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final /* bridge */ Set<Object> keySet() {
        return HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final /* bridge */ Collection values() {
        return HmlNationalIdActivity.IconCompatParcelizer;
    }
}
