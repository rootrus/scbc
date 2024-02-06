package p040o;

/* renamed from: o.getCurrentScreenClass */
public final class getCurrentScreenClass {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final zzwk MediaBrowserCompat$ItemReceiver;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentScreenClass)) {
            return false;
        }
        getCurrentScreenClass getcurrentscreenclass = (getCurrentScreenClass) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcurrentscreenclass.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcurrentscreenclass.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getcurrentscreenclass.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcurrentscreenclass.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcurrentscreenclass.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getcurrentscreenclass.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getcurrentscreenclass.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        zzwk zzwk = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = zzwk != null ? zzwk.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreFill(collateralCode=");
        sb.append(this.write);
        sb.append(", collateralOwnership=");
        sb.append(this.read);
        sb.append(", residentialStatus=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", collateralPrice=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", collateralLocation=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", insuranceFire=");
        sb.append(this.RatingCompat);
        sb.append(", insuranceCreditLife=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getCurrentScreenClass(String str, String str2, String str3, String str4, zzwk zzwk, String str5, String str6) {
        onGetStartedClick.write((Object) str, "collateralCode");
        onGetStartedClick.write((Object) str2, "collateralOwnership");
        onGetStartedClick.write((Object) str3, "residentialStatus");
        onGetStartedClick.write((Object) str4, "collateralPrice");
        onGetStartedClick.write((Object) zzwk, "collateralLocation");
        onGetStartedClick.write((Object) str5, "insuranceFire");
        onGetStartedClick.write((Object) str6, "insuranceCreditLife");
        this.write = str;
        this.read = str2;
        this.MediaMetadataCompat = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$ItemReceiver = zzwk;
        this.RatingCompat = str5;
        this.IconCompatParcelizer = str6;
    }
}
