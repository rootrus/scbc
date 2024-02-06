package p040o;

import java.util.List;

/* renamed from: o.GeofencingEvent */
public final class GeofencingEvent {
    public final setLoiteringDelay MediaBrowserCompat$CustomActionResultReceiver;
    private final setRequestId MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final List<GeofencingApi> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeofencingEvent)) {
            return false;
        }
        GeofencingEvent geofencingEvent = (GeofencingEvent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) geofencingEvent.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) geofencingEvent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) geofencingEvent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) geofencingEvent.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        setRequestId setrequestid = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = setrequestid != null ? setrequestid.hashCode() : 0;
        setLoiteringDelay setloiteringdelay = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = setloiteringdelay != null ? setloiteringdelay.hashCode() : 0;
        List<GeofencingApi> list = this.write;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantMetaData(callbackUrl=");
        sb.append(this.read);
        sb.append(", extraData=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", merchantInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", paymentInfo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public GeofencingEvent(String str, setRequestId setrequestid, setLoiteringDelay setloiteringdelay, List<GeofencingApi> list) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = setrequestid;
        this.MediaBrowserCompat$CustomActionResultReceiver = setloiteringdelay;
        this.write = list;
    }
}
