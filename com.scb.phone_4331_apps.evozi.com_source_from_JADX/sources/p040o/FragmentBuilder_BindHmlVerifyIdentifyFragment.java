package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: o.FragmentBuilder_BindHmlVerifyIdentifyFragment */
public final class FragmentBuilder_BindHmlVerifyIdentifyFragment {
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlVerifyIdentifyFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((FragmentBuilder_BindHmlVerifyIdentifyFragment) obj).MediaBrowserCompat$ItemReceiver);
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
        sb.append("OperatingSystemVersion(value=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlVerifyIdentifyFragment(String str) {
        onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
