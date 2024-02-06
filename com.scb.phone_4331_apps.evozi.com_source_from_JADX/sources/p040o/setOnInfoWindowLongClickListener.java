package p040o;

/* renamed from: o.setOnInfoWindowLongClickListener */
public final class setOnInfoWindowLongClickListener {
    public final boolean IconCompatParcelizer;
    public final setOnInfoWindowClickListener MediaBrowserCompat$CustomActionResultReceiver;
    public final setOnCameraMoveListener MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final setOnMapLongClickListener MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnInfoWindowLongClickListener)) {
            return false;
        }
        setOnInfoWindowLongClickListener setoninfowindowlongclicklistener = (setOnInfoWindowLongClickListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setoninfowindowlongclicklistener.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setoninfowindowlongclicklistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setoninfowindowlongclicklistener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setoninfowindowlongclicklistener.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setoninfowindowlongclicklistener.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setoninfowindowlongclicklistener.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setoninfowindowlongclicklistener.read) && this.IconCompatParcelizer == setoninfowindowlongclicklistener.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setoninfowindowlongclicklistener.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setoninfowindowlongclicklistener.write);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        setOnCameraMoveListener setoncameramovelistener = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = setoncameramovelistener != null ? setoncameramovelistener.hashCode() : 0;
        setOnInfoWindowClickListener setoninfowindowclicklistener = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = setoninfowindowclicklistener != null ? setoninfowindowclicklistener.hashCode() : 0;
        setOnMapLongClickListener setonmaplongclicklistener = this.MediaDescriptionCompat;
        int hashCode4 = setonmaplongclicklistener != null ? setonmaplongclicklistener.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode6 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode7 = str4 != null ? str4.hashCode() : 0;
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode8 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (z ? 1 : 0)) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PayNowVerification(transactionToken=");
        sb.append(this.RatingCompat);
        sb.append(", accountFrom=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountTo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", txnDetails=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", transactionDateTime=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", rateExpiredTime=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", annotation=");
        sb.append(this.read);
        sb.append(", duplicateTransaction=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", header=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setOnInfoWindowLongClickListener(String str, setOnCameraMoveListener setoncameramovelistener, setOnInfoWindowClickListener setoninfowindowclicklistener, setOnMapLongClickListener setonmaplongclicklistener, String str2, String str3, String str4, boolean z, String str5, String str6) {
        onGetStartedClick.write((Object) str, "transactionToken");
        onGetStartedClick.write((Object) setoncameramovelistener, "accountFrom");
        onGetStartedClick.write((Object) setoninfowindowclicklistener, "accountTo");
        onGetStartedClick.write((Object) setonmaplongclicklistener, "txnDetails");
        onGetStartedClick.write((Object) str2, "transactionDateTime");
        onGetStartedClick.write((Object) str3, "rateExpiredTime");
        onGetStartedClick.write((Object) str4, "annotation");
        onGetStartedClick.write((Object) str5, "header");
        onGetStartedClick.write((Object) str6, "description");
        this.RatingCompat = str;
        this.MediaBrowserCompat$ItemReceiver = setoncameramovelistener;
        this.MediaBrowserCompat$CustomActionResultReceiver = setoninfowindowclicklistener;
        this.MediaDescriptionCompat = setonmaplongclicklistener;
        this.MediaBrowserCompat$MediaItem = str2;
        this.MediaMetadataCompat = str3;
        this.read = str4;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.write = str6;
    }

    public /* synthetic */ setOnInfoWindowLongClickListener(setOnCameraMoveListener setoncameramovelistener, setOnInfoWindowClickListener setoninfowindowclicklistener, setOnMapLongClickListener setonmaplongclicklistener, String str) {
        this("", setoncameramovelistener, setoninfowindowclicklistener, setonmaplongclicklistener, "", "", str, false, "", "");
    }
}
