package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: o.FragmentBuilder_BindHmlSelectAccountFragment */
public final class FragmentBuilder_BindHmlSelectAccountFragment {
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlSelectAccountFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((FragmentBuilder_BindHmlSelectAccountFragment) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceLocale(value=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlSelectAccountFragment(String str) {
        onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
