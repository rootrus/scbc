package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.reclaimKey */
public final class reclaimKey {
    @SerializedName("cardSubType")
    private final String IconCompatParcelizer;
    @SerializedName("cardType")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("oldCardMaskedNo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tilesVersion")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("oldCardRef")
    private final String MediaDescriptionCompat;
    @SerializedName("oldCardSubType")
    private final String MediaMetadataCompat;
    @SerializedName("oldCardType")
    private final String RatingCompat;
    @SerializedName("binNo")
    private final String read;
    @SerializedName("accountNo")
    private final String write;

    public reclaimKey(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reclaimKey)) {
            return false;
        }
        reclaimKey reclaimkey = (reclaimKey) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) reclaimkey.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) reclaimkey.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) reclaimkey.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) reclaimkey.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) reclaimkey.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) reclaimkey.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) reclaimkey.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) reclaimkey.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) reclaimkey.MediaMetadataCompat);
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
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.RatingCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaMetadataCompat;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardVerificationRequest(accountNo=");
        sb.append(this.write);
        sb.append(", cardType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", cardSubType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", binNo=");
        sb.append(this.read);
        sb.append(", tilesVersion=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", oldCardRef=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", oldCardMaskedNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", oldCardType=");
        sb.append(this.RatingCompat);
        sb.append(", oldCardSubType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    public reclaimKey(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        onGetStartedClick.write((Object) str, "accountNo");
        onGetStartedClick.write((Object) str2, "cardType");
        onGetStartedClick.write((Object) str3, "cardSubType");
        onGetStartedClick.write((Object) str4, "binNo");
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
        this.MediaBrowserCompat$MediaItem = str5;
        this.MediaDescriptionCompat = str6;
        this.MediaBrowserCompat$ItemReceiver = str7;
        this.RatingCompat = str8;
        this.MediaMetadataCompat = str9;
    }

    private /* synthetic */ reclaimKey(String str, String str2, String str3, String str4, String str5, byte b) {
        this(str, str2, str3, str4, str5, (String) null, (String) null, (String) null, (String) null);
    }
}
