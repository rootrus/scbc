package p040o;

import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: o.setOnMapLongClickListener */
public final class setOnMapLongClickListener {
    public final String IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final double MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final double read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnMapLongClickListener)) {
            return false;
        }
        setOnMapLongClickListener setonmaplongclicklistener = (setOnMapLongClickListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setonmaplongclicklistener.IconCompatParcelizer) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, setonmaplongclicklistener.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.read, setonmaplongclicklistener.read) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setonmaplongclicklistener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setonmaplongclicklistener.MediaBrowserCompat$ItemReceiver) && Double.compare(this.MediaDescriptionCompat, setonmaplongclicklistener.MediaDescriptionCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setonmaplongclicklistener.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setonmaplongclicklistener.MediaMetadataCompat);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.read);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((((hashCode * 31) + i2) * 31) + i3) * 31) + hashCode2) * 31) + hashCode3) * 31) + i4) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TxnDetails(conversionRate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", amountFrom=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", amountTo=");
        sb.append(this.read);
        sb.append(", currencyCodeFrom=");
        sb.append(this.write);
        sb.append(", currencyCodeTo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", fee=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", feeCurrencyCode=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", details=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    public setOnMapLongClickListener(String str, double d, double d2, String str2, String str3, double d3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "conversionRate");
        onGetStartedClick.write((Object) str2, "currencyCodeFrom");
        onGetStartedClick.write((Object) str3, "currencyCodeTo");
        onGetStartedClick.write((Object) str4, "feeCurrencyCode");
        onGetStartedClick.write((Object) str5, ErrorBundle.DETAIL_ENTRY);
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
        this.read = d2;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaDescriptionCompat = d3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.MediaMetadataCompat = str5;
    }
}
