package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setExtraTopOffset */
public final class setExtraTopOffset {
    @SerializedName("proxyStatus")
    public final String IconCompatParcelizer;
    @SerializedName("accountNo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("proxyId")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("defaultFlag")
    private final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("sortSequence")
    public final int MediaDescriptionCompat;
    @SerializedName("displayName")
    private final String MediaMetadataCompat;
    @SerializedName("defaultAmount")
    private final String RatingCompat;
    @SerializedName("proxyType")
    public final String read;
    @SerializedName("rtpFlag")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setExtraTopOffset)) {
            return false;
        }
        setExtraTopOffset setextratopoffset = (setExtraTopOffset) obj;
        return this.MediaDescriptionCompat == setextratopoffset.MediaDescriptionCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setextratopoffset.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setextratopoffset.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setextratopoffset.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setextratopoffset.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setextratopoffset.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setextratopoffset.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setextratopoffset.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setextratopoffset.RatingCompat);
    }

    public final int hashCode() {
        int i = this.MediaDescriptionCompat;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaMetadataCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.RatingCompat;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return (((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromptpayProxyEntity(sortSequence=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", proxyId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", proxyType=");
        sb.append(this.read);
        sb.append(", proxyStatus=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", rtpFlag=");
        sb.append(this.write);
        sb.append(", displayName=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", defaultFlag=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", defaultAmount=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }
}
