package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.DeepLinkEntry */
public final class DeepLinkEntry {
    @SerializedName("merchantTerminalId")
    public final String IconCompatParcelizer;
    @SerializedName("merchantId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("merchantName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("urlLogo")
    public final String read;
    @SerializedName("transNo")
    public final String write;

    /* renamed from: o.DeepLinkEntry$Type */
    public class Type extends setCurrentItemInternal {
        @SerializedName("billerLogo")
        public String IconCompatParcelizer;
        @SerializedName("backgroundImage")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("billerName")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("prefix")
        public String MediaBrowserCompat$MediaItem;
        @SerializedName("maskRefFlag")
        public boolean MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("remainingBalance")

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public Double f2541x50fd9e4a;
        @SerializedName("bookingId")
        public String MediaDescriptionCompat;
        @SerializedName("paymentId")
        public String MediaMetadataCompat;
        @SerializedName("qrCode")
        public String MediaSessionCompat$QueueItem;
        @SerializedName("ref2")
        public String MediaSessionCompat$ResultReceiverWrapper;
        @SerializedName("ref3")
        public String MediaSessionCompat$Token;
        @SerializedName("ref1")
        public String ParcelableVolumeInfo;
        @SerializedName("dateTime")
        public String RatingCompat;
        @SerializedName("additionalMetaData")
        public addPoints read;
        @SerializedName("transactionToken")
        private String setHasDecor;
        @SerializedName("addToFavouriteFlag")
        public Integer write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkEntry)) {
            return false;
        }
        DeepLinkEntry deepLinkEntry = (DeepLinkEntry) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) deepLinkEntry.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) deepLinkEntry.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) deepLinkEntry.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) deepLinkEntry.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) deepLinkEntry.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtraDataEntity(merchantId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", merchantName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", merchantTerminalId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transNo=");
        sb.append(this.write);
        sb.append(", urlLogo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
