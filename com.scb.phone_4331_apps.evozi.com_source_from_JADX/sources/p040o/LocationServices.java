package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.LocationServices */
public final class LocationServices {
    @SerializedName("isBoughtFund")
    public final boolean IconCompatParcelizer;
    @SerializedName("clientList")
    public final List<getGeofenceTransition> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("isClient")
    public final boolean MediaBrowserCompat$ItemReceiver;
    @SerializedName("riskProfile")
    public final getInitialTrigger read;
    @SerializedName("fundList")
    public final getAddress write;

    /* renamed from: o.LocationServices$zza */
    public final class zza {
        @SerializedName("depositList")
        private final List<hasError> IconCompatParcelizer;
        @SerializedName("profile")
        private final getInitialTrigger MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("clientList")
        private final List<getGeofenceTransition> MediaBrowserCompat$ItemReceiver;
        @SerializedName("cardList")
        private final List<getTriggeringGeofences> read;
        @SerializedName("funds")
        private final List<Object> write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationServices)) {
            return false;
        }
        LocationServices locationServices = (LocationServices) obj;
        return this.MediaBrowserCompat$ItemReceiver == locationServices.MediaBrowserCompat$ItemReceiver && this.IconCompatParcelizer == locationServices.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) locationServices.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) locationServices.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) locationServices.write);
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.IconCompatParcelizer;
        if (!z3) {
            z2 = z3;
        }
        getInitialTrigger getinitialtrigger = this.read;
        int i = 0;
        int hashCode = getinitialtrigger != null ? getinitialtrigger.hashCode() : 0;
        List<getGeofenceTransition> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = list != null ? list.hashCode() : 0;
        getAddress getaddress = this.write;
        if (getaddress != null) {
            i = getaddress.hashCode();
        }
        return ((((((((z ? 1 : 0) * true) + (z2 ? 1 : 0)) * 31) + hashCode) * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentNow(isClient=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isBoughtFund=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", riskProfile=");
        sb.append(this.read);
        sb.append(", clientList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", fundList=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public LocationServices(boolean z, boolean z2, getInitialTrigger getinitialtrigger, List<? extends getGeofenceTransition> list, getAddress getaddress) {
        this.MediaBrowserCompat$ItemReceiver = z;
        this.IconCompatParcelizer = z2;
        this.read = getinitialtrigger;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.write = getaddress;
    }
}
