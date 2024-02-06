package p040o;

import java.util.List;

/* renamed from: o.setTransitionTypes */
public final class setTransitionTypes {
    public final GeofencingEvent IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<ambientEnabled> MediaBrowserCompat$ItemReceiver;
    public final String MediaMetadataCompat;
    public final String read;
    public final Double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTransitionTypes)) {
            return false;
        }
        setTransitionTypes settransitiontypes = (setTransitionTypes) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) settransitiontypes.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) settransitiontypes.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) settransitiontypes.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) settransitiontypes.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) settransitiontypes.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) settransitiontypes.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        Double d = this.write;
        int hashCode4 = d != null ? d.hashCode() : 0;
        GeofencingEvent geofencingEvent = this.IconCompatParcelizer;
        int hashCode5 = geofencingEvent != null ? geofencingEvent.hashCode() : 0;
        List<ambientEnabled> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InsurancePaymentConfirmation(transactionDateTime=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionToken=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", paymentId=");
        sb.append(this.read);
        sb.append(", remainingBalance=");
        sb.append(this.write);
        sb.append(", merchantMetaData=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", buttons=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setTransitionTypes(String str, String str2, String str3, Double d, GeofencingEvent geofencingEvent, List<ambientEnabled> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaMetadataCompat = str2;
        this.read = str3;
        this.write = d;
        this.IconCompatParcelizer = geofencingEvent;
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
