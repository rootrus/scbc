package p040o;

import java.math.BigDecimal;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.onNextClicked */
public final class onNextClicked {
    public OffsetDateTime IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public BigDecimal MediaBrowserCompat$ItemReceiver;
    public BigDecimal MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public OffsetDateTime MediaMetadataCompat;
    public int RatingCompat;
    public BigDecimal read;
    public OffsetDateTime write;

    onNextClicked() {
    }

    public onNextClicked(String str, int i, OffsetDateTime offsetDateTime, BigDecimal bigDecimal, BigDecimal bigDecimal2, OffsetDateTime offsetDateTime2, BigDecimal bigDecimal3, OffsetDateTime offsetDateTime3, String str2, String str3) {
        this.MediaDescriptionCompat = str;
        this.RatingCompat = i;
        this.write = offsetDateTime;
        this.MediaBrowserCompat$MediaItem = bigDecimal;
        this.read = bigDecimal2;
        this.IconCompatParcelizer = offsetDateTime2;
        this.MediaBrowserCompat$ItemReceiver = bigDecimal3;
        this.MediaMetadataCompat = offsetDateTime3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        onNextClicked onnextclicked = (onNextClicked) obj;
        if (this.RatingCompat != onnextclicked.RatingCompat) {
            return false;
        }
        String str = this.MediaDescriptionCompat;
        if (str == null ? onnextclicked.MediaDescriptionCompat != null : !str.equals(onnextclicked.MediaDescriptionCompat)) {
            return false;
        }
        OffsetDateTime offsetDateTime = this.write;
        if (offsetDateTime == null ? onnextclicked.write != null : !offsetDateTime.equals(onnextclicked.write)) {
            return false;
        }
        BigDecimal bigDecimal = this.MediaBrowserCompat$MediaItem;
        if (bigDecimal == null ? onnextclicked.MediaBrowserCompat$MediaItem != null : !bigDecimal.equals(onnextclicked.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        BigDecimal bigDecimal2 = this.read;
        if (bigDecimal2 == null ? onnextclicked.read != null : !bigDecimal2.equals(onnextclicked.read)) {
            return false;
        }
        OffsetDateTime offsetDateTime2 = this.IconCompatParcelizer;
        if (offsetDateTime2 == null ? onnextclicked.IconCompatParcelizer != null : !offsetDateTime2.equals(onnextclicked.IconCompatParcelizer)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.MediaBrowserCompat$ItemReceiver;
        if (bigDecimal3 == null ? onnextclicked.MediaBrowserCompat$ItemReceiver != null : !bigDecimal3.equals(onnextclicked.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        OffsetDateTime offsetDateTime3 = this.MediaMetadataCompat;
        if (offsetDateTime3 == null ? onnextclicked.MediaMetadataCompat != null : !offsetDateTime3.equals(onnextclicked.MediaMetadataCompat)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null ? onnextclicked.MediaBrowserCompat$CustomActionResultReceiver != null : !str2.equals(onnextclicked.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        String str4 = onnextclicked.MediaBrowserCompat$SearchResultReceiver;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.RatingCompat;
        OffsetDateTime offsetDateTime = this.write;
        int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        BigDecimal bigDecimal = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = bigDecimal != null ? bigDecimal.hashCode() : 0;
        BigDecimal bigDecimal2 = this.read;
        int hashCode4 = bigDecimal2 != null ? bigDecimal2.hashCode() : 0;
        OffsetDateTime offsetDateTime2 = this.IconCompatParcelizer;
        int hashCode5 = offsetDateTime2 != null ? offsetDateTime2.hashCode() : 0;
        BigDecimal bigDecimal3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = bigDecimal3 != null ? bigDecimal3.hashCode() : 0;
        OffsetDateTime offsetDateTime3 = this.MediaMetadataCompat;
        int hashCode7 = offsetDateTime3 != null ? offsetDateTime3.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode8 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }
}
