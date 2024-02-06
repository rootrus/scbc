package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ExceptionParser */
public final class ExceptionParser extends setCurrentItemInternal {
    @SerializedName("accountTo")
    public final uncaughtException IconCompatParcelizer;
    @SerializedName("qrCode")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("additionalMetaData")
    public final addPoints MediaBrowserCompat$ItemReceiver;
    @SerializedName("totalInterest")
    public final double MediaBrowserCompat$MediaItem;
    @SerializedName("remainingBalance")
    public final double MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("transactionDateTime")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2707x50fd9e4a;
    @SerializedName("totalFee")
    public final double MediaDescriptionCompat;
    @SerializedName("subdeposits")
    public final List<setExceptionParser> MediaMetadataCompat;
    @SerializedName("transactionId")
    public final String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("totalTax")
    public final double ParcelableVolumeInfo;
    @SerializedName("totalAmount")
    public final double RatingCompat;
    @SerializedName("netAmount")
    public final double read;
    @SerializedName("accountFrom")
    public final uncaughtException write;

    public ExceptionParser() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionParser)) {
            return false;
        }
        ExceptionParser exceptionParser = (ExceptionParser) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) exceptionParser.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2707x50fd9e4a, (Object) exceptionParser.f2707x50fd9e4a) && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, exceptionParser.MediaBrowserCompat$SearchResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) exceptionParser.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) exceptionParser.MediaBrowserCompat$ItemReceiver) && Double.compare(this.read, exceptionParser.read) == 0 && Double.compare(this.RatingCompat, exceptionParser.RatingCompat) == 0 && Double.compare(this.MediaBrowserCompat$MediaItem, exceptionParser.MediaBrowserCompat$MediaItem) == 0 && Double.compare(this.ParcelableVolumeInfo, exceptionParser.ParcelableVolumeInfo) == 0 && Double.compare(this.MediaDescriptionCompat, exceptionParser.MediaDescriptionCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) exceptionParser.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) exceptionParser.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) exceptionParser.MediaMetadataCompat);
    }

    public final int hashCode() {
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f2707x50fd9e4a;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        addPoints addpoints = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = addpoints != null ? addpoints.hashCode() : 0;
        long doubleToLongBits2 = Double.doubleToLongBits(this.read);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.RatingCompat);
        int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        long doubleToLongBits4 = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
        int i5 = (int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32));
        long doubleToLongBits5 = Double.doubleToLongBits(this.ParcelableVolumeInfo);
        int i6 = (int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32));
        long doubleToLongBits6 = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i7 = (int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32));
        uncaughtException uncaughtexception = this.write;
        int hashCode5 = uncaughtexception != null ? uncaughtexception.hashCode() : 0;
        uncaughtException uncaughtexception2 = this.IconCompatParcelizer;
        int hashCode6 = uncaughtexception2 != null ? uncaughtexception2.hashCode() : 0;
        List<setExceptionParser> list = this.MediaMetadataCompat;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransferConfirmationEntity(transactionId=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", transactionDateTime=");
        sb.append(this.f2707x50fd9e4a);
        sb.append(", remainingBalance=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", qrCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", additionalMetaData=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", netAmount=");
        sb.append(this.read);
        sb.append(", totalAmount=");
        sb.append(this.RatingCompat);
        sb.append(", totalInterest=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", totalTax=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", totalFee=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", accountFrom=");
        sb.append(this.write);
        sb.append(", accountTo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", subdeposits=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    private /* synthetic */ ExceptionParser(byte b) {
        this((String) null, (String) null, 0.0d, (String) null, (addPoints) null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (uncaughtException) null, (uncaughtException) null, (List<setExceptionParser>) null);
    }

    private ExceptionParser(String str, String str2, double d, String str3, addPoints addpoints, double d2, double d3, double d4, double d5, double d6, uncaughtException uncaughtexception, uncaughtException uncaughtexception2, List<setExceptionParser> list) {
        this.MediaSessionCompat$ResultReceiverWrapper = null;
        this.f2707x50fd9e4a = null;
        this.MediaBrowserCompat$SearchResultReceiver = 0.0d;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.read = 0.0d;
        this.RatingCompat = 0.0d;
        this.MediaBrowserCompat$MediaItem = 0.0d;
        this.ParcelableVolumeInfo = 0.0d;
        this.MediaDescriptionCompat = 0.0d;
        this.write = null;
        this.IconCompatParcelizer = null;
        this.MediaMetadataCompat = null;
    }
}
