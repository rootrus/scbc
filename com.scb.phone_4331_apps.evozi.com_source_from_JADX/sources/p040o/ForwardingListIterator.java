package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ForwardingListIterator */
public final class ForwardingListIterator {
    @SerializedName("alley")
    private String IconCompatParcelizer;
    @SerializedName("province")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("postalCode")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("subDistrict")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("number")
    private String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("village")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f2710x50fd9e4a;
    @SerializedName("moo")
    private String MediaDescriptionCompat;
    @SerializedName("road")
    private String MediaMetadataCompat;
    @SerializedName("unit")
    private String RatingCompat;
    @SerializedName("floor")
    private String read;
    @SerializedName("district")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardingListIterator)) {
            return false;
        }
        ForwardingListIterator forwardingListIterator = (ForwardingListIterator) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) forwardingListIterator.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) forwardingListIterator.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) forwardingListIterator.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2710x50fd9e4a, (Object) forwardingListIterator.f2710x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) forwardingListIterator.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) forwardingListIterator.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) forwardingListIterator.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) forwardingListIterator.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) forwardingListIterator.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) forwardingListIterator.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) forwardingListIterator.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.f2710x50fd9e4a;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaMetadataCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.write;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$ItemReceiver;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressLocaleRequest(unitNumber=");
        sb.append(this.RatingCompat);
        sb.append(", floorNumber=");
        sb.append(this.read);
        sb.append(", number=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", village=");
        sb.append(this.f2710x50fd9e4a);
        sb.append(", moo=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", alley=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", road=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", district=");
        sb.append(this.write);
        sb.append(", subDistrict=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", province=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", postalCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public ForwardingListIterator(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.RatingCompat = str;
        this.read = str2;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
        this.f2710x50fd9e4a = str4;
        this.MediaDescriptionCompat = str5;
        this.IconCompatParcelizer = str6;
        this.MediaMetadataCompat = str7;
        this.write = str8;
        this.MediaBrowserCompat$MediaItem = str9;
        this.MediaBrowserCompat$CustomActionResultReceiver = str10;
        this.MediaBrowserCompat$ItemReceiver = str11;
    }
}
