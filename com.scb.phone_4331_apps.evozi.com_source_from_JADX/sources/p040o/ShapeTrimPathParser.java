package p040o;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: o.ShapeTrimPathParser */
public class ShapeTrimPathParser extends setCurrentItemInternal {
    @SerializedName("availableLgLimit")
    public BigDecimal IconCompatParcelizer;
    @SerializedName("accountNo")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("letterAmount")
    public int MediaBrowserCompat$ItemReceiver;
    @SerializedName("middleLabel")
    public String MediaBrowserCompat$MediaItem;
    @SerializedName("paidLabel")
    public String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("sortSequence")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public int f2783x50fd9e4a;
    @SerializedName("longDisclaimer")
    public String MediaDescriptionCompat;
    @SerializedName("lgLimit")
    public BigDecimal MediaMetadataCompat;
    @SerializedName("totalLgAmount")
    public BigDecimal MediaSessionCompat$QueueItem;
    @SerializedName("totalLabel")
    public String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("shortDisclaimer")
    public String MediaSessionCompat$Token;
    @SerializedName("productIconUrl")
    public String ParcelableVolumeInfo;
    @SerializedName("letterList")
    public List<ValueParser> RatingCompat;
    @SerializedName("claimedAmount")
    public BigDecimal read;
    @SerializedName("totalLgAndClaimed")
    public BigDecimal setHasDecor;
    @SerializedName("accountStatusIconUrl")
    public String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShapeTrimPathParser shapeTrimPathParser = (ShapeTrimPathParser) obj;
        if (this.f2783x50fd9e4a != shapeTrimPathParser.f2783x50fd9e4a || this.MediaBrowserCompat$ItemReceiver != shapeTrimPathParser.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? shapeTrimPathParser.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(shapeTrimPathParser.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        BigDecimal bigDecimal = this.MediaSessionCompat$QueueItem;
        if (bigDecimal == null ? shapeTrimPathParser.MediaSessionCompat$QueueItem != null : !bigDecimal.equals(shapeTrimPathParser.MediaSessionCompat$QueueItem)) {
            return false;
        }
        BigDecimal bigDecimal2 = this.read;
        if (bigDecimal2 == null ? shapeTrimPathParser.read != null : !bigDecimal2.equals(shapeTrimPathParser.read)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.setHasDecor;
        if (bigDecimal3 == null ? shapeTrimPathParser.setHasDecor != null : !bigDecimal3.equals(shapeTrimPathParser.setHasDecor)) {
            return false;
        }
        BigDecimal bigDecimal4 = this.IconCompatParcelizer;
        if (bigDecimal4 == null ? shapeTrimPathParser.IconCompatParcelizer != null : !bigDecimal4.equals(shapeTrimPathParser.IconCompatParcelizer)) {
            return false;
        }
        BigDecimal bigDecimal5 = this.MediaMetadataCompat;
        if (bigDecimal5 == null ? shapeTrimPathParser.MediaMetadataCompat != null : !bigDecimal5.equals(shapeTrimPathParser.MediaMetadataCompat)) {
            return false;
        }
        List<ValueParser> list = this.RatingCompat;
        if (list == null ? shapeTrimPathParser.RatingCompat != null : !list.equals(shapeTrimPathParser.RatingCompat)) {
            return false;
        }
        String str2 = this.ParcelableVolumeInfo;
        if (str2 == null ? shapeTrimPathParser.ParcelableVolumeInfo != null : !str2.equals(shapeTrimPathParser.ParcelableVolumeInfo)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str3 == null ? shapeTrimPathParser.MediaBrowserCompat$SearchResultReceiver != null : !str3.equals(shapeTrimPathParser.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str4 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str4 == null ? shapeTrimPathParser.MediaSessionCompat$ResultReceiverWrapper != null : !str4.equals(shapeTrimPathParser.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$MediaItem;
        if (str5 == null ? shapeTrimPathParser.MediaBrowserCompat$MediaItem != null : !str5.equals(shapeTrimPathParser.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str6 = this.write;
        if (str6 == null ? shapeTrimPathParser.write != null : !str6.equals(shapeTrimPathParser.write)) {
            return false;
        }
        String str7 = this.MediaSessionCompat$Token;
        if (str7 == null ? shapeTrimPathParser.MediaSessionCompat$Token != null : !str7.equals(shapeTrimPathParser.MediaSessionCompat$Token)) {
            return false;
        }
        String str8 = this.MediaDescriptionCompat;
        String str9 = shapeTrimPathParser.MediaDescriptionCompat;
        if (str8 != null) {
            return str8.equals(str9);
        }
        if (str9 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f2783x50fd9e4a;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode = str != null ? str.hashCode() : 0;
        BigDecimal bigDecimal = this.MediaSessionCompat$QueueItem;
        int hashCode2 = bigDecimal != null ? bigDecimal.hashCode() : 0;
        BigDecimal bigDecimal2 = this.read;
        int hashCode3 = bigDecimal2 != null ? bigDecimal2.hashCode() : 0;
        BigDecimal bigDecimal3 = this.setHasDecor;
        int hashCode4 = bigDecimal3 != null ? bigDecimal3.hashCode() : 0;
        BigDecimal bigDecimal4 = this.IconCompatParcelizer;
        int hashCode5 = bigDecimal4 != null ? bigDecimal4.hashCode() : 0;
        BigDecimal bigDecimal5 = this.MediaMetadataCompat;
        int hashCode6 = bigDecimal5 != null ? bigDecimal5.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        List<ValueParser> list = this.RatingCompat;
        int hashCode7 = list != null ? list.hashCode() : 0;
        String str2 = this.ParcelableVolumeInfo;
        int hashCode8 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode9 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode10 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode11 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode12 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaSessionCompat$Token;
        int hashCode13 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaDescriptionCompat;
        return (((((((((((((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (str8 != null ? str8.hashCode() : 0);
    }
}
