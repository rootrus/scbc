package p040o;

/* renamed from: o.setOnInfoWindowCloseListener */
public final class setOnInfoWindowCloseListener {
    public final float IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaDescriptionCompat;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnInfoWindowCloseListener)) {
            return false;
        }
        setOnInfoWindowCloseListener setoninfowindowcloselistener = (setOnInfoWindowCloseListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setoninfowindowcloselistener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setoninfowindowcloselistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setoninfowindowcloselistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setoninfowindowcloselistener.MediaDescriptionCompat) && Float.compare(this.IconCompatParcelizer, setoninfowindowcloselistener.IconCompatParcelizer) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setoninfowindowcloselistener.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setoninfowindowcloselistener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setoninfowindowcloselistener.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        int floatToIntBits = Float.floatToIntBits(this.IconCompatParcelizer);
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$MediaItem;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + floatToIntBits) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PayNowInfo(countryName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", channelType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", agentType=");
        sb.append(this.read);
        sb.append(", currencyCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", amountFrom=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", phoneNumber=");
        sb.append(this.RatingCompat);
        sb.append(", annotation=");
        sb.append(this.write);
        sb.append(", purpose=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }

    public setOnInfoWindowCloseListener(String str, String str2, String str3, String str4, float f, String str5, String str6, String str7) {
        onGetStartedClick.write((Object) str, "countryName");
        onGetStartedClick.write((Object) str2, "channelType");
        onGetStartedClick.write((Object) str3, "agentType");
        onGetStartedClick.write((Object) str4, "currencyCode");
        onGetStartedClick.write((Object) str5, "phoneNumber");
        onGetStartedClick.write((Object) str7, "purpose");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.MediaDescriptionCompat = str4;
        this.IconCompatParcelizer = f;
        this.RatingCompat = str5;
        this.write = str6;
        this.MediaBrowserCompat$MediaItem = str7;
    }
}
