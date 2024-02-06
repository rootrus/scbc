package p040o;

/* renamed from: o.addDependency */
public final class addDependency {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaMetadataCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addDependency)) {
            return false;
        }
        addDependency adddependency = (addDependency) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) adddependency.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) adddependency.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) adddependency.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) adddependency.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) adddependency.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) adddependency.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountAmountDisplay(amount=");
        sb.append(this.write);
        sb.append(", interest=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tax=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", closingFee=");
        sb.append(this.read);
        sb.append(", fee=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", netAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public addDependency(String str, String str2, String str3, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) str, "amount");
        onGetStartedClick.write((Object) str2, "interest");
        onGetStartedClick.write((Object) str3, "tax");
        onGetStartedClick.write((Object) str4, "closingFee");
        onGetStartedClick.write((Object) str5, "fee");
        onGetStartedClick.write((Object) str6, "netAmount");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaMetadataCompat = str3;
        this.read = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.IconCompatParcelizer = str6;
    }
}
