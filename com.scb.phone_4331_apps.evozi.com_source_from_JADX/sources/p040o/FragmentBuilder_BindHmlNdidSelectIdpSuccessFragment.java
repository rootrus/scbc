package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: o.FragmentBuilder_BindHmlNdidSelectIdpSuccessFragment */
public final class FragmentBuilder_BindHmlNdidSelectIdpSuccessFragment {
    public final String write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlNdidSelectIdpSuccessFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((FragmentBuilder_BindHmlNdidSelectIdpSuccessFragment) obj).write);
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
        sb.append("SharedSecret(value=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlNdidSelectIdpSuccessFragment(String str) {
        onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.write = str;
    }
}
