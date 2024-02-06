package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: o.FragmentBuilder_BindHmlUserInfoFragment */
public final class FragmentBuilder_BindHmlUserInfoFragment {
    public final String write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlUserInfoFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((FragmentBuilder_BindHmlUserInfoFragment) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceType(value=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlUserInfoFragment(String str) {
        onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.write = str;
    }
}
