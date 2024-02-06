package p040o;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: o.ValueParser */
public class ValueParser {
    @SerializedName("beneficiaryName")
    public String IconCompatParcelizer;
    @SerializedName("claimedList")
    public List<ShapeFillParser> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("currency")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("endDate")
    public String MediaBrowserCompat$MediaItem;
    @SerializedName("issueType")
    public String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("startDate")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2794x50fd9e4a;
    @SerializedName("documentNo")
    public String MediaDescriptionCompat;
    @SerializedName("lgAmount")
    public BigDecimal MediaMetadataCompat;
    @SerializedName("nextFeePaymentAmount")
    public BigDecimal MediaSessionCompat$QueueItem;
    @SerializedName("tierKey")
    public String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("sortSequence")
    public int ParcelableVolumeInfo;
    @SerializedName("feeRate")
    public BigDecimal RatingCompat;
    @SerializedName("claimedFlag")
    public String read;
    @SerializedName("debitAccount")
    public String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValueParser valueParser = (ValueParser) obj;
        if (this.ParcelableVolumeInfo != valueParser.ParcelableVolumeInfo) {
            return false;
        }
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str == null ? valueParser.MediaSessionCompat$ResultReceiverWrapper != null : !str.equals(valueParser.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null ? valueParser.IconCompatParcelizer != null : !str2.equals(valueParser.IconCompatParcelizer)) {
            return false;
        }
        BigDecimal bigDecimal = this.MediaMetadataCompat;
        if (bigDecimal == null ? valueParser.MediaMetadataCompat != null : !bigDecimal.equals(valueParser.MediaMetadataCompat)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$MediaItem;
        if (str3 == null ? valueParser.MediaBrowserCompat$MediaItem != null : !str3.equals(valueParser.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str4 == null ? valueParser.MediaBrowserCompat$SearchResultReceiver != null : !str4.equals(valueParser.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str5 = this.write;
        if (str5 == null ? valueParser.write != null : !str5.equals(valueParser.write)) {
            return false;
        }
        String str6 = this.MediaDescriptionCompat;
        if (str6 == null ? valueParser.MediaDescriptionCompat != null : !str6.equals(valueParser.MediaDescriptionCompat)) {
            return false;
        }
        String str7 = this.f2794x50fd9e4a;
        if (str7 == null ? valueParser.f2794x50fd9e4a != null : !str7.equals(valueParser.f2794x50fd9e4a)) {
            return false;
        }
        BigDecimal bigDecimal2 = this.MediaSessionCompat$QueueItem;
        if (bigDecimal2 == null ? valueParser.MediaSessionCompat$QueueItem != null : !bigDecimal2.equals(valueParser.MediaSessionCompat$QueueItem)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.RatingCompat;
        if (bigDecimal3 == null ? valueParser.RatingCompat != null : !bigDecimal3.equals(valueParser.RatingCompat)) {
            return false;
        }
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        if (str8 == null ? valueParser.MediaBrowserCompat$ItemReceiver != null : !str8.equals(valueParser.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str9 = this.read;
        if (str9 == null ? valueParser.read != null : !str9.equals(valueParser.read)) {
            return false;
        }
        List<ShapeFillParser> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<ShapeFillParser> list2 = valueParser.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.ParcelableVolumeInfo;
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        BigDecimal bigDecimal = this.MediaMetadataCompat;
        int hashCode3 = bigDecimal != null ? bigDecimal.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.f2794x50fd9e4a;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        BigDecimal bigDecimal2 = this.MediaSessionCompat$QueueItem;
        int hashCode9 = bigDecimal2 != null ? bigDecimal2.hashCode() : 0;
        BigDecimal bigDecimal3 = this.RatingCompat;
        int hashCode10 = bigDecimal3 != null ? bigDecimal3.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode11 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.read;
        int hashCode12 = str9 != null ? str9.hashCode() : 0;
        List<ShapeFillParser> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((((((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i2;
    }
}
