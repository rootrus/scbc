package p040o;

import java.util.List;
import p040o.Geofence;

/* renamed from: o.FusedLocationProviderClient */
public final class FusedLocationProviderClient {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<Geofence.Builder> MediaBrowserCompat$ItemReceiver;
    public final boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FusedLocationProviderClient)) {
            return false;
        }
        FusedLocationProviderClient fusedLocationProviderClient = (FusedLocationProviderClient) obj;
        return this.write == fusedLocationProviderClient.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fusedLocationProviderClient.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fusedLocationProviderClient.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        boolean z = this.write;
        if (z) {
            z = true;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<Geofence.Builder> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlProductCatalogue(promoFlag=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", options=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.FusedLocationProviderClient$zza */
    public final class zza {
        public final Double IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            Double d = this.IconCompatParcelizer;
            if (d != null) {
                i = d.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CreditCardFullAmount(merchantId=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", terminalId=");
            sb.append(this.write);
            sb.append(", orderReference=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", paymentAmount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public zza(String str, String str2, String str3, Double d) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.write = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.IconCompatParcelizer = d;
        }
    }

    public FusedLocationProviderClient(boolean z, String str, List<Geofence.Builder> list) {
        onGetStartedClick.write((Object) list, "options");
        this.write = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
