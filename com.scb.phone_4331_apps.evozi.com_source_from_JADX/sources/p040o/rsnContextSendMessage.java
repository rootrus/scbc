package p040o;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.IdCaptureBackActivity_MembersInjector;

/* renamed from: o.rsnContextSendMessage */
public final class rsnContextSendMessage<T extends IdCaptureBackActivity_MembersInjector> implements rsnClosureCreate<T> {
    final List<T> IconCompatParcelizer = new ArrayList();
    private final LatLng read;

    public rsnContextSendMessage(LatLng latLng) {
        this.read = latLng;
    }

    public final LatLng MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    public final Collection<T> read() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.IconCompatParcelizer.size();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StaticCluster{mCenter=");
        sb.append(this.read);
        sb.append(", mItems.size=");
        sb.append(this.IconCompatParcelizer.size());
        sb.append('}');
        return sb.toString();
    }

    public final int hashCode() {
        return this.read.hashCode() + this.IconCompatParcelizer.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rsnContextSendMessage)) {
            return false;
        }
        rsnContextSendMessage rsncontextsendmessage = (rsnContextSendMessage) obj;
        if (!rsncontextsendmessage.read.equals(this.read) || !rsncontextsendmessage.IconCompatParcelizer.equals(this.IconCompatParcelizer)) {
            return false;
        }
        return true;
    }
}
