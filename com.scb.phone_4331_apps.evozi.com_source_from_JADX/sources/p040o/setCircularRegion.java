package p040o;

/* renamed from: o.setCircularRegion */
public final class setCircularRegion {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final Double MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCircularRegion)) {
            return false;
        }
        setCircularRegion setcircularregion = (setCircularRegion) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setcircularregion.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setcircularregion.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcircularregion.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setcircularregion.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setcircularregion.IconCompatParcelizer);
    }

    public final int hashCode() {
        Double d = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = d != null ? d.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BillPayment(paymentAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountTo=");
        sb.append(this.write);
        sb.append(", ref1=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", ref2=");
        sb.append(this.read);
        sb.append(", ref3=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setCircularRegion(Double d, String str, String str2, String str3, String str4) {
        this.MediaBrowserCompat$ItemReceiver = d;
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
    }
}
