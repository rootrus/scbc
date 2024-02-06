package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.onBind */
public final class onBind {
    @SerializedName("accountTo")
    public final String IconCompatParcelizer;
    @SerializedName("promptpayId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("promptpayType")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transferDateTime")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("transferAmount")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("regenerateFlag")
    public final String MediaDescriptionCompat;
    @SerializedName("sortSequence")
    public final Integer MediaMetadataCompat;
    @SerializedName("transferType")
    public final String MediaSessionCompat$QueueItem;
    @SerializedName("transferId")
    public final String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("repeatFlag")
    public final String RatingCompat;
    @SerializedName("bankLogo")
    public final String read;
    @SerializedName("accountToName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onBind)) {
            return false;
        }
        onBind onbind = (onBind) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) onbind.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) onbind.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) onbind.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onbind.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onbind.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) onbind.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onbind.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) onbind.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) onbind.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onbind.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onbind.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) onbind.MediaSessionCompat$QueueItem);
    }

    public final int hashCode() {
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Integer num = this.MediaMetadataCompat;
        int hashCode2 = num != null ? num.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.RatingCompat;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaDescriptionCompat;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode10 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode11 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaSessionCompat$QueueItem;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransferHistoryTransactionEntity(transferId=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", sortSequence=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", transferDateTime=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", accountTo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountToName=");
        sb.append(this.write);
        sb.append(", transferAmount=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", bankLogo=");
        sb.append(this.read);
        sb.append(", repeatFlag=");
        sb.append(this.RatingCompat);
        sb.append(", regenerateFlag=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", promptpayId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", promptpayType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transferType=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(")");
        return sb.toString();
    }
}
