package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.URI;

/* renamed from: o.FragmentBuilder_BindHmlNTBSuccessFragment */
public final class FragmentBuilder_BindHmlNTBSuccessFragment {
    public final URI write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHmlNTBSuccessFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((FragmentBuilder_BindHmlNTBSuccessFragment) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        URI uri = this.write;
        if (uri != null) {
            return uri.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OneInteractionPath(value=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHmlNTBSuccessFragment(URI uri) {
        onGetStartedClick.write((Object) uri, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.write = uri;
    }
}
