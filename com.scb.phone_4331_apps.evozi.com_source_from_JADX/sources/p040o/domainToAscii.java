package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.domainToAscii */
public final class domainToAscii extends setCurrentItemInternal {
    @SerializedName("loanId")
    public final String IconCompatParcelizer;
    @SerializedName("refId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("monthlyPayment")
    public final double MediaBrowserCompat$ItemReceiver;
    @SerializedName("totalPayment")
    public final double MediaBrowserCompat$MediaItem;
    @SerializedName("totalPrincipal")
    public final double MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("totalRequestedPurchase")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final double f2573x50fd9e4a;
    @SerializedName("totalInterest")
    public final double MediaDescriptionCompat;
    @SerializedName("term")
    public final String MediaMetadataCompat;
    @SerializedName("verifiedEmail")
    public final String MediaSessionCompat$QueueItem;
    @SerializedName("transactionDate")
    public final String MediaSessionCompat$Token;
    @SerializedName("totalPurchase")
    public final double ParcelableVolumeInfo;
    @SerializedName("totalApprovedPayment")
    public final double RatingCompat;
    @SerializedName("installments")
    public final List<portColonOffset> read;
    @SerializedName("rate")
    public final String write;

    public domainToAscii() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof domainToAscii)) {
            return false;
        }
        domainToAscii domaintoascii = (domainToAscii) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) domaintoascii.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) domaintoascii.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) domaintoascii.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) domaintoascii.MediaBrowserCompat$CustomActionResultReceiver) && Double.compare(this.f2573x50fd9e4a, domaintoascii.f2573x50fd9e4a) == 0 && Double.compare(this.RatingCompat, domaintoascii.RatingCompat) == 0 && Double.compare(this.ParcelableVolumeInfo, domaintoascii.ParcelableVolumeInfo) == 0 && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, domaintoascii.MediaBrowserCompat$SearchResultReceiver) == 0 && Double.compare(this.MediaBrowserCompat$MediaItem, domaintoascii.MediaBrowserCompat$MediaItem) == 0 && Double.compare(this.MediaBrowserCompat$ItemReceiver, domaintoascii.MediaBrowserCompat$ItemReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) domaintoascii.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) domaintoascii.read) && Double.compare(this.MediaDescriptionCompat, domaintoascii.MediaDescriptionCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) domaintoascii.MediaSessionCompat$QueueItem);
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.MediaMetadataCompat;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.f2573x50fd9e4a);
        int i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.RatingCompat);
        int i4 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.ParcelableVolumeInfo);
        int i5 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        long doubleToLongBits4 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        int i6 = (int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32));
        long doubleToLongBits5 = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
        int i7 = (int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32));
        long doubleToLongBits6 = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        int i8 = (int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32));
        String str5 = this.MediaSessionCompat$Token;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        List<portColonOffset> list = this.read;
        if (list != null) {
            i2 = list.hashCode();
            i = hashCode2;
        } else {
            i = hashCode2;
            i2 = 0;
        }
        long doubleToLongBits7 = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i9 = (int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32));
        String str6 = this.MediaSessionCompat$QueueItem;
        return (((((((((((((((((((((((((hashCode * 31) + i) * 31) + hashCode3) * 31) + hashCode4) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + hashCode5) * 31) + i2) * 31) + i9) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeejungInstallmentsConfirmationResponseEntity(term=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", rate=");
        sb.append(this.write);
        sb.append(", loanId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", refId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", totalRequestedPurchase=");
        sb.append(this.f2573x50fd9e4a);
        sb.append(", totalApprovedPayment=");
        sb.append(this.RatingCompat);
        sb.append(", totalPurchase=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", totalPrincipal=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", totalPayment=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", monthlyPayment=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transactionDate=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", installments=");
        sb.append(this.read);
        sb.append(", totalInterest=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", verifiedEmail=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(")");
        return sb.toString();
    }

    private /* synthetic */ domainToAscii(byte b) {
        this((String) null, (String) null, (String) null, (String) null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (String) null, (List<? extends portColonOffset>) null, 0.0d, (String) null);
    }

    private domainToAscii(String str, String str2, String str3, String str4, double d, double d2, double d3, double d4, double d5, double d6, String str5, List<? extends portColonOffset> list, double d7, String str6) {
        this.MediaMetadataCompat = null;
        this.write = null;
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.f2573x50fd9e4a = 0.0d;
        this.RatingCompat = 0.0d;
        this.ParcelableVolumeInfo = 0.0d;
        this.MediaBrowserCompat$SearchResultReceiver = 0.0d;
        this.MediaBrowserCompat$MediaItem = 0.0d;
        this.MediaBrowserCompat$ItemReceiver = 0.0d;
        this.MediaSessionCompat$Token = null;
        this.read = null;
        this.MediaDescriptionCompat = 0.0d;
        this.MediaSessionCompat$QueueItem = null;
    }
}
