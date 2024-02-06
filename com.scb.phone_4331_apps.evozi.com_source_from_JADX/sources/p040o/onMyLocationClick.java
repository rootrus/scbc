package p040o;

/* renamed from: o.onMyLocationClick */
public final class onMyLocationClick {
    public final Double IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onMyLocationClick)) {
            return false;
        }
        onMyLocationClick onmylocationclick = (onMyLocationClick) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onmylocationclick.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onmylocationclick.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onmylocationclick.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onmylocationclick.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onmylocationclick.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) onmylocationclick.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        Double d = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = d != null ? d.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BillPayment(paymentAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountTo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountFrom=");
        sb.append(this.write);
        sb.append(", ref1=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", ref2=");
        sb.append(this.read);
        sb.append(", ref3=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }

    public onMyLocationClick(Double d, String str, String str2, String str3, String str4, String str5) {
        this.IconCompatParcelizer = d;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.read = str4;
        this.MediaBrowserCompat$MediaItem = str5;
    }
}
