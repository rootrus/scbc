package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.keyType */
public final class keyType {
    public static final keyType$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new keyType$MediaBrowserCompat$ItemReceiver((byte) 0);
    @SerializedName("currentAddress")
    private final valueType IconCompatParcelizer;
    @SerializedName("currentHomeSameFlag")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("mailingworkSameFlag")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("homeAddress")
    private final valueType MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("workHomeSameFlag")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final String f5544x50fd9e4a;
    @SerializedName("mailingCurrentSameFlag")
    private final String MediaDescriptionCompat;
    @SerializedName("homeRegisteredSameFlag")
    private final String MediaMetadataCompat;
    @SerializedName("workAddress")
    private final valueType MediaSessionCompat$QueueItem;
    @SerializedName("workRegisteredSameFlag")
    private final String ParcelableVolumeInfo;
    @SerializedName("mailingHomeSameFlag")
    private final String RatingCompat;
    @SerializedName("currentRegisteredSameFlag")
    private final String read;
    @SerializedName("currentworkSameFlag")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof keyType)) {
            return false;
        }
        keyType keytype = (keyType) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) keytype.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) keytype.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) keytype.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) keytype.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) keytype.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f5544x50fd9e4a, (Object) keytype.f5544x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) keytype.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) keytype.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) keytype.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) keytype.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) keytype.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) keytype.MediaDescriptionCompat);
    }

    public final int hashCode() {
        valueType valuetype = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode = valuetype != null ? valuetype.hashCode() : 0;
        valueType valuetype2 = this.MediaSessionCompat$QueueItem;
        int hashCode2 = valuetype2 != null ? valuetype2.hashCode() : 0;
        valueType valuetype3 = this.IconCompatParcelizer;
        int hashCode3 = valuetype3 != null ? valuetype3.hashCode() : 0;
        String str = this.MediaMetadataCompat;
        int hashCode4 = str != null ? str.hashCode() : 0;
        String str2 = this.ParcelableVolumeInfo;
        int hashCode5 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f5544x50fd9e4a;
        int hashCode6 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode7 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode9 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.RatingCompat;
        int hashCode10 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$MediaItem;
        int hashCode11 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaDescriptionCompat;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AddressRegistrationRequest(homeAddress=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", workingAddress=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", currentAddress=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", homeRegisteredSameFlag=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", workRegisteredSameFlag=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", workHomeSameFlag=");
        sb.append(this.f5544x50fd9e4a);
        sb.append(", currentRegisteredSameFlag=");
        sb.append(this.read);
        sb.append(", currentHomeSameFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", currentworkSameFlag=");
        sb.append(this.write);
        sb.append(", mailingHomeSameFlag=");
        sb.append(this.RatingCompat);
        sb.append(", mailingworkSameFlag=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", mailingCurrentSameFlag=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }

    public keyType(valueType valuetype, valueType valuetype2, valueType valuetype3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        onGetStartedClick.write((Object) str, "homeRegisteredSameFlag");
        onGetStartedClick.write((Object) str2, "workRegisteredSameFlag");
        onGetStartedClick.write((Object) str3, "workHomeSameFlag");
        onGetStartedClick.write((Object) str4, "currentRegisteredSameFlag");
        onGetStartedClick.write((Object) str5, "currentHomeSameFlag");
        onGetStartedClick.write((Object) str6, "currentworkSameFlag");
        onGetStartedClick.write((Object) str7, "mailingHomeSameFlag");
        onGetStartedClick.write((Object) str8, "mailingworkSameFlag");
        onGetStartedClick.write((Object) str9, "mailingCurrentSameFlag");
        this.MediaBrowserCompat$SearchResultReceiver = valuetype;
        this.MediaSessionCompat$QueueItem = valuetype2;
        this.IconCompatParcelizer = valuetype3;
        this.MediaMetadataCompat = str;
        this.ParcelableVolumeInfo = str2;
        this.f5544x50fd9e4a = str3;
        this.read = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.write = str6;
        this.RatingCompat = str7;
        this.MediaBrowserCompat$MediaItem = str8;
        this.MediaDescriptionCompat = str9;
    }

    public /* synthetic */ keyType(valueType valuetype, valueType valuetype2, valueType valuetype3) {
        this(valuetype, valuetype2, valuetype3, "0", "0", "0", "0", "0", "0", "0", "0", "0");
    }
}
