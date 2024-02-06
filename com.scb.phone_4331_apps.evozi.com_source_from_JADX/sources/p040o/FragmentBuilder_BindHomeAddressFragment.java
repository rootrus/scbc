package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.URI;

/* renamed from: o.FragmentBuilder_BindHomeAddressFragment */
public final class FragmentBuilder_BindHomeAddressFragment {
    public final URI MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FragmentBuilder_BindHomeAddressFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((FragmentBuilder_BindHomeAddressFragment) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        URI uri = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (uri != null) {
            return uri.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Interaction(value=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindHomeAddressFragment(URI uri) {
        onGetStartedClick.write((Object) uri, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.MediaBrowserCompat$CustomActionResultReceiver = uri;
    }
}
