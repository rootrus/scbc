package p040o;

/* renamed from: o.setCountry */
public final class setCountry {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final boolean RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCountry)) {
            return false;
        }
        setCountry setcountry = (setCountry) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setcountry.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setcountry.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setcountry.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setcountry.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcountry.MediaBrowserCompat$CustomActionResultReceiver) && this.RatingCompat == setcountry.RatingCompat;
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        boolean z = this.RatingCompat;
        if (z) {
            z = true;
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditLimit(aumValue=");
        sb.append(this.write);
        sb.append(", accountSegmentCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountSegmentDesc=");
        sb.append(this.read);
        sb.append(", minCreditLimit=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", maxCreditLimit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", showCreditLimitFlag=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }

    public setCountry(String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) str, "aumValue");
        onGetStartedClick.write((Object) str2, "accountSegmentCode");
        onGetStartedClick.write((Object) str3, "accountSegmentDesc");
        onGetStartedClick.write((Object) str4, "minCreditLimit");
        onGetStartedClick.write((Object) str5, "maxCreditLimit");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.RatingCompat = z;
    }
}
