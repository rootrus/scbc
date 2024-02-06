package p040o;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: o.ShapePathParser */
public class ShapePathParser extends setCurrentItemInternal {
    @SerializedName("availablePnLimit")
    public BigDecimal IconCompatParcelizer;
    @SerializedName("accountStatusIconUrl")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("longDisclaimer")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("noteAmount")
    public int MediaBrowserCompat$MediaItem;
    @SerializedName("paidLabel")
    public String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("productIconUrl")
    public String MediaDescriptionCompat;
    @SerializedName("noteList")
    public List<JsonReader> MediaMetadataCompat;
    @SerializedName("shortDisclaimer")
    public String MediaSessionCompat$QueueItem;
    @SerializedName("totalPnPrincipal")
    public BigDecimal MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("sortSequence")
    public int MediaSessionCompat$Token;
    @SerializedName("totalLabel")
    public String ParcelableVolumeInfo;
    @SerializedName("pnLimit")
    public BigDecimal RatingCompat;
    @SerializedName("accountNo")
    public String read;
    @SerializedName("middleLabel")
    public String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShapePathParser shapePathParser = (ShapePathParser) obj;
        if (this.MediaSessionCompat$Token != shapePathParser.MediaSessionCompat$Token || this.MediaBrowserCompat$MediaItem != shapePathParser.MediaBrowserCompat$MediaItem) {
            return false;
        }
        String str = this.read;
        if (str == null ? shapePathParser.read != null : !str.equals(shapePathParser.read)) {
            return false;
        }
        BigDecimal bigDecimal = this.MediaSessionCompat$ResultReceiverWrapper;
        if (bigDecimal == null ? shapePathParser.MediaSessionCompat$ResultReceiverWrapper != null : !bigDecimal.equals(shapePathParser.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        BigDecimal bigDecimal2 = this.IconCompatParcelizer;
        if (bigDecimal2 == null ? shapePathParser.IconCompatParcelizer != null : !bigDecimal2.equals(shapePathParser.IconCompatParcelizer)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.RatingCompat;
        if (bigDecimal3 == null ? shapePathParser.RatingCompat != null : !bigDecimal3.equals(shapePathParser.RatingCompat)) {
            return false;
        }
        List<JsonReader> list = this.MediaMetadataCompat;
        if (list == null ? shapePathParser.MediaMetadataCompat != null : !list.equals(shapePathParser.MediaMetadataCompat)) {
            return false;
        }
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null ? shapePathParser.MediaDescriptionCompat != null : !str2.equals(shapePathParser.MediaDescriptionCompat)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str3 == null ? shapePathParser.MediaBrowserCompat$SearchResultReceiver != null : !str3.equals(shapePathParser.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str4 = this.ParcelableVolumeInfo;
        if (str4 == null ? shapePathParser.ParcelableVolumeInfo != null : !str4.equals(shapePathParser.ParcelableVolumeInfo)) {
            return false;
        }
        String str5 = this.write;
        if (str5 == null ? shapePathParser.write != null : !str5.equals(shapePathParser.write)) {
            return false;
        }
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 == null ? shapePathParser.MediaBrowserCompat$CustomActionResultReceiver != null : !str6.equals(shapePathParser.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str7 = this.MediaSessionCompat$QueueItem;
        if (str7 == null ? shapePathParser.MediaSessionCompat$QueueItem != null : !str7.equals(shapePathParser.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        String str9 = shapePathParser.MediaBrowserCompat$ItemReceiver;
        if (str8 != null) {
            return str8.equals(str9);
        }
        if (str9 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.MediaSessionCompat$Token;
        String str = this.read;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        BigDecimal bigDecimal = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode2 = bigDecimal != null ? bigDecimal.hashCode() : 0;
        BigDecimal bigDecimal2 = this.IconCompatParcelizer;
        int hashCode3 = bigDecimal2 != null ? bigDecimal2.hashCode() : 0;
        BigDecimal bigDecimal3 = this.RatingCompat;
        int hashCode4 = bigDecimal3 != null ? bigDecimal3.hashCode() : 0;
        int i3 = this.MediaBrowserCompat$MediaItem;
        List<JsonReader> list = this.MediaMetadataCompat;
        int hashCode5 = list != null ? list.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode6 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.ParcelableVolumeInfo;
        int hashCode8 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode9 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode10 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaSessionCompat$QueueItem;
        int hashCode11 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        return (((((((((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i3) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i2;
    }
}
