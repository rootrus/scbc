package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Unbinder */
public final class Unbinder {
    @SerializedName("accountFrom")
    public final String IconCompatParcelizer;
    @SerializedName("additionalMetaData")
    public final setOnCameraMoveStartedListener MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("amount")
    public final double MediaBrowserCompat$ItemReceiver;
    @SerializedName("fee")
    public final double MediaBrowserCompat$MediaItem;
    @SerializedName("ref3")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("serviceType")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2560x50fd9e4a;
    @SerializedName("paymentId")
    public final String MediaDescriptionCompat;
    @SerializedName("ref2")
    public final String MediaMetadataCompat;
    @SerializedName("senderBankLogo")
    public final String MediaSessionCompat$QueueItem;
    @SerializedName("timestamp")
    public final String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("serviceNumber")
    public final String MediaSessionCompat$Token;
    @SerializedName("senderBank")
    public final String ParcelableVolumeInfo;
    @SerializedName("ref1")
    public final String RatingCompat;
    @SerializedName("accountFromName")
    public final String read;
    @SerializedName("biller")
    public final findEntry write;

    /* renamed from: o.Unbinder$-CC  reason: invalid class name */
    public final class CC {
        @SerializedName("partnerId")
        public final String IconCompatParcelizer;
        @SerializedName("amount")
        public final float MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("accountTo")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("partnerTransactionId")
        public final String MediaBrowserCompat$MediaItem;
        @SerializedName("partnerType")
        public final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("ref1")
        public final String MediaDescriptionCompat;
        @SerializedName("partnerName")
        public final String MediaMetadataCompat;
        @SerializedName("ref2")
        public final String MediaSessionCompat$ResultReceiverWrapper;
        @SerializedName("ref3")
        public final String ParcelableVolumeInfo;
        @SerializedName("partnerSubType")
        public final String RatingCompat;
        @SerializedName("accountFrom")
        public final String read;
        @SerializedName("merchantMetaData")
        public final parseParameters write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CC)) {
                return false;
            }
            CC r3 = (CC) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && Float.compare(this.MediaBrowserCompat$CustomActionResultReceiver, r3.MediaBrowserCompat$CustomActionResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) r3.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) r3.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) r3.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) r3.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) r3.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) r3.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) r3.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            int floatToIntBits = Float.floatToIntBits(this.MediaBrowserCompat$CustomActionResultReceiver);
            String str2 = this.MediaMetadataCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$MediaItem;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaDescriptionCompat;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaSessionCompat$ResultReceiverWrapper;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.IconCompatParcelizer;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.ParcelableVolumeInfo;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.read;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode9 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.RatingCompat;
            int hashCode10 = str10 != null ? str10.hashCode() : 0;
            parseParameters parseparameters = this.write;
            if (parseparameters != null) {
                i = parseparameters.hashCode();
            }
            return (((((((((((((((((((((hashCode * 31) + floatToIntBits) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BillPaymentPartnerEntity(accountTo=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", amount=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", partnerName=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", partnerTransactionId=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", ref1=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", ref2=");
            sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
            sb.append(", partnerId=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", ref3=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", accountFrom=");
            sb.append(this.read);
            sb.append(", partnerType=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", partnerSubType=");
            sb.append(this.RatingCompat);
            sb.append(", merchantMetaData=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Unbinder)) {
            return false;
        }
        Unbinder unbinder = (Unbinder) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) unbinder.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) unbinder.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) unbinder.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) unbinder.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) unbinder.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2560x50fd9e4a, (Object) unbinder.f2560x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) unbinder.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) unbinder.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) unbinder.MediaBrowserCompat$SearchResultReceiver) && Double.compare(this.MediaBrowserCompat$ItemReceiver, unbinder.MediaBrowserCompat$ItemReceiver) == 0 && Double.compare(this.MediaBrowserCompat$MediaItem, unbinder.MediaBrowserCompat$MediaItem) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) unbinder.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) unbinder.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) unbinder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) unbinder.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaSessionCompat$Token;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.f2560x50fd9e4a;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.RatingCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
        int i2 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
        String str10 = this.ParcelableVolumeInfo;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaSessionCompat$QueueItem;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        findEntry findentry = this.write;
        int hashCode12 = findentry != null ? findentry.hashCode() : 0;
        setOnCameraMoveStartedListener setoncameramovestartedlistener = this.MediaBrowserCompat$CustomActionResultReceiver;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i) * 31) + i2) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (setoncameramovestartedlistener != null ? setoncameramovestartedlistener.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BillPaymentTransactionsEntity(paymentId=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", timestamp=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", accountFrom=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountFromName=");
        sb.append(this.read);
        sb.append(", serviceNumber=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", serviceType=");
        sb.append(this.f2560x50fd9e4a);
        sb.append(", ref1=");
        sb.append(this.RatingCompat);
        sb.append(", ref2=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", ref3=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", amount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", fee=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", senderBank=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", senderBankLogo=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", biller=");
        sb.append(this.write);
        sb.append(", additionalMetaData=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
