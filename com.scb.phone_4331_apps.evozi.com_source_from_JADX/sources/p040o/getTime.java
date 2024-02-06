package p040o;

/* renamed from: o.getTime */
public final class getTime {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final boolean MediaBrowserCompat$SearchResultReceiver;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTime)) {
            return false;
        }
        getTime gettime = (getTime) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gettime.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) gettime.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gettime.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gettime.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gettime.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gettime.read) && this.MediaBrowserCompat$SearchResultReceiver == gettime.MediaBrowserCompat$SearchResultReceiver;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        if (str6 != null) {
            i = str6.hashCode();
        }
        boolean z = this.MediaBrowserCompat$SearchResultReceiver;
        if (z) {
            z = true;
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpsellConfig(iconPath=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", simulatorTitle=");
        sb.append(this.RatingCompat);
        sb.append(", simulatorDescription=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", minimumPrincipal=");
        sb.append(this.write);
        sb.append(", maximumPrincipal=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", principalStepSize=");
        sb.append(this.read);
        sb.append(", simulatorEnableFlag=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getTime(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        onGetStartedClick.write((Object) str, "iconPath");
        onGetStartedClick.write((Object) str2, "simulatorTitle");
        onGetStartedClick.write((Object) str3, "simulatorDescription");
        onGetStartedClick.write((Object) str4, "minimumPrincipal");
        onGetStartedClick.write((Object) str5, "maximumPrincipal");
        onGetStartedClick.write((Object) str6, "principalStepSize");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.RatingCompat = str2;
        this.IconCompatParcelizer = str3;
        this.write = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.read = str6;
        this.MediaBrowserCompat$SearchResultReceiver = z;
    }
}
