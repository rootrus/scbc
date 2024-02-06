package p040o;

/* renamed from: o.getTiltGesturesEnabled */
public final class getTiltGesturesEnabled {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTiltGesturesEnabled)) {
            return false;
        }
        getTiltGesturesEnabled gettiltgesturesenabled = (getTiltGesturesEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gettiltgesturesenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gettiltgesturesenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gettiltgesturesenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gettiltgesturesenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gettiltgesturesenabled.MediaBrowserCompat$ItemReceiver) && this.MediaMetadataCompat == gettiltgesturesenabled.MediaMetadataCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) gettiltgesturesenabled.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) gettiltgesturesenabled.MediaDescriptionCompat);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        int i2 = this.MediaMetadataCompat;
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Channel(countryName=");
        sb.append(this.write);
        sb.append(", channelType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", agentType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", currencyCode=");
        sb.append(this.read);
        sb.append(", decimalAmountFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", sortSequence=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", logoImageURL=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", name=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }

    public getTiltGesturesEnabled(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
        onGetStartedClick.write((Object) str, "countryName");
        onGetStartedClick.write((Object) str2, "channelType");
        onGetStartedClick.write((Object) str3, "agentType");
        onGetStartedClick.write((Object) str4, "currencyCode");
        onGetStartedClick.write((Object) str5, "decimalAmountFlag");
        onGetStartedClick.write((Object) str6, "logoImageURL");
        onGetStartedClick.write((Object) str7, "name");
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.MediaMetadataCompat = i;
        this.MediaBrowserCompat$SearchResultReceiver = str6;
        this.MediaDescriptionCompat = str7;
    }
}
