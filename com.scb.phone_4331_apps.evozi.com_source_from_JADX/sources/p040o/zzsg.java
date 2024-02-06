package p040o;

/* renamed from: o.zzsg */
public final class zzsg {
    public final String IconCompatParcelizer;
    public final Double MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final zzrm RatingCompat;
    public final Double read;
    public final Double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsg)) {
            return false;
        }
        zzsg zzsg = (zzsg) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zzsg.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzsg.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzsg.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzsg.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzsg.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzsg.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        zzrm zzrm = this.RatingCompat;
        int i = 0;
        int hashCode = zzrm != null ? zzrm.hashCode() : 0;
        Double d = this.write;
        int hashCode2 = d != null ? d.hashCode() : 0;
        Double d2 = this.read;
        int hashCode3 = d2 != null ? d2.hashCode() : 0;
        Double d3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = d3 != null ? d3.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int hashCode5 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepositAdditionalLimit(status=");
        sb.append(this.RatingCompat);
        sb.append(", creditLimit=");
        sb.append(this.write);
        sb.append(", creditUsed=");
        sb.append(this.read);
        sb.append(", availableCredit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", cardRefNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", limitLabel=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public zzsg(zzrm zzrm, Double d, Double d2, Double d3, String str, String str2) {
        this.RatingCompat = zzrm;
        this.write = d;
        this.read = d2;
        this.MediaBrowserCompat$CustomActionResultReceiver = d3;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
