package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getDescription */
public final class getDescription {
    @SerializedName("bankCode")
    public final String IconCompatParcelizer;
    @SerializedName("accountTo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountFrom")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transferType")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("promptpayType")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("promptpayId")
    public final String MediaDescriptionCompat;
    @SerializedName("transferAmount")
    public final String MediaMetadataCompat;
    @SerializedName("bankLogo")
    public final String read;
    @SerializedName("accountToName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDescription)) {
            return false;
        }
        getDescription getdescription = (getDescription) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getdescription.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getdescription.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getdescription.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getdescription.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getdescription.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getdescription.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getdescription.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getdescription.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getdescription.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.IconCompatParcelizer;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.read;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransferRepeatEntity(transferType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", accountFrom=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountTo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountToName=");
        sb.append(this.write);
        sb.append(", promptpayType=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", promptpayId=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", bankCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transferAmount=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", bankLogo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}