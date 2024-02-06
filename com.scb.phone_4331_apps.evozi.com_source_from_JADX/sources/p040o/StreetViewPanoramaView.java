package p040o;

import com.google.gson.annotations.SerializedName;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.StreetViewPanoramaView */
public final class StreetViewPanoramaView {
    public final setOnCameraMoveStartedListener IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final String f2791x50fd9e4a;
    public final double MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    private final String MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$ResultReceiverWrapper;
    public final OffsetDateTime MediaSessionCompat$Token;
    public final String ParcelableVolumeInfo;
    public final String RatingCompat;
    public final String read;
    public final streetNamesEnabled write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaView)) {
            return false;
        }
        StreetViewPanoramaView streetViewPanoramaView = (StreetViewPanoramaView) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) streetViewPanoramaView.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) streetViewPanoramaView.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) streetViewPanoramaView.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) streetViewPanoramaView.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) streetViewPanoramaView.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2791x50fd9e4a, (Object) streetViewPanoramaView.f2791x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) streetViewPanoramaView.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) streetViewPanoramaView.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) streetViewPanoramaView.MediaBrowserCompat$MediaItem) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, streetViewPanoramaView.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.MediaDescriptionCompat, streetViewPanoramaView.MediaDescriptionCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) streetViewPanoramaView.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) streetViewPanoramaView.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) streetViewPanoramaView.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) streetViewPanoramaView.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int hashCode = str != null ? str.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.MediaSessionCompat$Token;
        int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str2 = this.read;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.ParcelableVolumeInfo;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.f2791x50fd9e4a;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.RatingCompat;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i2 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
        String str9 = this.MediaSessionCompat$QueueItem;
        int hashCode10 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode11 = str10 != null ? str10.hashCode() : 0;
        streetNamesEnabled streetnamesenabled = this.write;
        int hashCode12 = streetnamesenabled != null ? streetnamesenabled.hashCode() : 0;
        setOnCameraMoveStartedListener setoncameramovestartedlistener = this.IconCompatParcelizer;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i) * 31) + i2) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (setoncameramovestartedlistener != null ? setoncameramovestartedlistener.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BillPaymentTransactions(paymentId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", timestamp=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", accountFrom=");
        sb.append(this.read);
        sb.append(", accountFromName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", serviceNumber=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", serviceType=");
        sb.append(this.f2791x50fd9e4a);
        sb.append(", ref1=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", ref2=");
        sb.append(this.RatingCompat);
        sb.append(", ref3=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", amount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", fee=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", senderBank=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", senderBankLogo=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", biller=");
        sb.append(this.write);
        sb.append(", additionalMetaData=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public StreetViewPanoramaView(String str, OffsetDateTime offsetDateTime, String str2, String str3, String str4, String str5, String str6, String str7, String str8, double d, double d2, String str9, String str10, streetNamesEnabled streetnamesenabled, setOnCameraMoveStartedListener setoncameramovestartedlistener) {
        onGetStartedClick.write((Object) str, "paymentId");
        onGetStartedClick.write((Object) offsetDateTime, "timestamp");
        onGetStartedClick.write((Object) str2, "accountFrom");
        onGetStartedClick.write((Object) str4, "serviceNumber");
        onGetStartedClick.write((Object) str5, "serviceType");
        onGetStartedClick.write((Object) str6, "ref1");
        this.MediaMetadataCompat = str;
        this.MediaSessionCompat$Token = offsetDateTime;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.ParcelableVolumeInfo = str4;
        this.f2791x50fd9e4a = str5;
        this.MediaBrowserCompat$SearchResultReceiver = str6;
        this.RatingCompat = str7;
        this.MediaBrowserCompat$MediaItem = str8;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
        this.MediaDescriptionCompat = d2;
        this.MediaSessionCompat$QueueItem = str9;
        this.MediaSessionCompat$ResultReceiverWrapper = str10;
        this.write = streetnamesenabled;
        this.IconCompatParcelizer = setoncameramovestartedlistener;
    }

    /* renamed from: o.StreetViewPanoramaView$zza */
    public final class zza extends zzuk {
        public String AlertController$RecycleListView;
        public String AppCompatDelegateImpl$ListMenuDecorView;
        public Double AppCompatDialogFragment;
        public String Keep;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2792x50fd9e4a;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;
        public String ParcelableVolumeInfo;
        public Double PlaybackStateCompat;
        public String PlaybackStateCompat$CustomAction;
        public OffsetDateTime RatingCompat;
        public String read;
        public String setHasDecor;
        public String write;

        public static zza read() {
            return new zza();
        }
    }

    /* renamed from: o.StreetViewPanoramaView$zzb */
    public class zzb {
        @SerializedName("companyCode")
        public String IconCompatParcelizer;
        @SerializedName("dateTime")
        public OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("cinemaNo")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("email")
        public String MediaBrowserCompat$MediaItem;
        @SerializedName("endTime")
        public OffsetDateTime MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("mobileNo")
        public String MediaDescriptionCompat;
        @SerializedName("imagePath")
        public String MediaMetadataCompat;
        @SerializedName("orderId")
        public String MediaSessionCompat$QueueItem;
        @SerializedName("seatNo")
        public String MediaSessionCompat$Token;
        @SerializedName("movieName")
        public String ParcelableVolumeInfo;
        @SerializedName("locationCode")
        public String RatingCompat;
        @SerializedName("amount")
        public Double read;
        @SerializedName("cinemaLocation")
        public String write;

        public static zzb MediaBrowserCompat$CustomActionResultReceiver() {
            return new zzb();
        }
    }
}
