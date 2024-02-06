package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getCurrentKeyframe$MediaBrowserCompat$ItemReceiver */
public final class getCurrentKeyframe$MediaBrowserCompat$ItemReceiver {
    @SerializedName("documentDetail")
    final String IconCompatParcelizer;
    @SerializedName("documentDesc")
    final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("iconPath")
    final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("resubmitReasonDesc")
    final String MediaBrowserCompat$MediaItem;
    @SerializedName("uploadedQuantity")
    final int MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("minQuantity")
    final Integer MediaDescriptionCompat;
    @SerializedName("sortSequence")
    final int MediaMetadataCompat;
    @SerializedName("maxQuantity")
    final Integer RatingCompat;
    @SerializedName("documentCode")
    final String read;
    @SerializedName("documentStatus")
    final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentKeyframe$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        getCurrentKeyframe$MediaBrowserCompat$ItemReceiver getcurrentkeyframe_mediabrowsercompat_itemreceiver = (getCurrentKeyframe$MediaBrowserCompat$ItemReceiver) obj;
        return this.MediaMetadataCompat == getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaMetadataCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcurrentkeyframe_mediabrowsercompat_itemreceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getcurrentkeyframe_mediabrowsercompat_itemreceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcurrentkeyframe_mediabrowsercompat_itemreceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getcurrentkeyframe_mediabrowsercompat_itemreceiver.RatingCompat) && this.MediaBrowserCompat$SearchResultReceiver == getcurrentkeyframe_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
    }

    public final int hashCode() {
        int i = this.MediaMetadataCompat;
        String str = this.read;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        Integer num = this.MediaDescriptionCompat;
        int hashCode7 = num != null ? num.hashCode() : 0;
        Integer num2 = this.RatingCompat;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return (((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i2) * 31) + this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HMLDocumentTypesEntity(sortSequence=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", documentCode=");
        sb.append(this.read);
        sb.append(", documentDesc=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", documentDetail=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", documentStatus=");
        sb.append(this.write);
        sb.append(", resubmitReasonDesc=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", iconPath=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", minQuantity=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", maxQuantity=");
        sb.append(this.RatingCompat);
        sb.append(", uploadedQuantity=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
