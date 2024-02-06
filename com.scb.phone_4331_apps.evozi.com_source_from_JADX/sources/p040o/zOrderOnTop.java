package p040o;

/* renamed from: o.zOrderOnTop */
public final class zOrderOnTop {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final onInfoWindowClick read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zOrderOnTop)) {
            return false;
        }
        zOrderOnTop zorderontop = (zOrderOnTop) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zorderontop.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zorderontop.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zorderontop.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zorderontop.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zorderontop.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zorderontop.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        onInfoWindowClick oninfowindowclick = this.read;
        if (oninfowindowclick != null) {
            i = oninfowindowclick.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittanceRetryResponse(countryName=");
        sb.append(this.write);
        sb.append(", channelType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", agentType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", currencyCode=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", accountFrom=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", additionalInfo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public zOrderOnTop(String str, String str2, String str3, String str4, String str5, onInfoWindowClick oninfowindowclick) {
        onGetStartedClick.write((Object) str, "countryName");
        onGetStartedClick.write((Object) str2, "channelType");
        onGetStartedClick.write((Object) str3, "agentType");
        onGetStartedClick.write((Object) str4, "currencyCode");
        onGetStartedClick.write((Object) str5, "accountFrom");
        onGetStartedClick.write((Object) oninfowindowclick, "additionalInfo");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.IconCompatParcelizer = str5;
        this.read = oninfowindowclick;
    }
}
