package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: o.FragmentBuilder_BindHmlWorkAddressFragment */
public final class FragmentBuilder_BindHmlWorkAddressFragment {
    public final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlWorkAddressFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((FragmentBuilder_BindHmlWorkAddressFragment) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OperatingSystemName(value=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlWorkAddressFragment(String str) {
        onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.read = str;
    }
}
