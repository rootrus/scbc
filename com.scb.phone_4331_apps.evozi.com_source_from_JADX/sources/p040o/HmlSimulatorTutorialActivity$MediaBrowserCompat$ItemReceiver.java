package p040o;

import java.math.BigDecimal;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.HmlWorkAddressActivity;

/* renamed from: o.HmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver */
public final class HmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public List<HmlWorkAddressActivity.read> MediaBrowserCompat$ItemReceiver;
    public OffsetDateTime MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public BigDecimal MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public OffsetDateTime MediaSessionCompat$QueueItem;
    public int MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token;
    public BigDecimal ParcelableVolumeInfo;
    public BigDecimal RatingCompat;
    public String read;
    public String write;

    private HmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public HmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver(int i, String str, String str2, BigDecimal bigDecimal, OffsetDateTime offsetDateTime, String str3, String str4, String str5, OffsetDateTime offsetDateTime2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str6, String str7, List<HmlWorkAddressActivity.read> list) {
        this.MediaSessionCompat$ResultReceiverWrapper = i;
        this.MediaSessionCompat$Token = str;
        this.IconCompatParcelizer = str2;
        this.MediaDescriptionCompat = bigDecimal;
        this.MediaBrowserCompat$MediaItem = offsetDateTime;
        this.MediaMetadataCompat = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.MediaSessionCompat$QueueItem = offsetDateTime2;
        this.ParcelableVolumeInfo = bigDecimal2;
        this.RatingCompat = bigDecimal3;
        this.read = str6;
        this.write = str7;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver = (HmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver) obj;
        if (this.MediaSessionCompat$ResultReceiverWrapper != hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper) {
            return false;
        }
        String str = this.MediaSessionCompat$Token;
        if (str == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token != null : !str.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer != null : !str2.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
            return false;
        }
        BigDecimal bigDecimal = this.MediaDescriptionCompat;
        if (bigDecimal == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat != null : !bigDecimal.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat)) {
            return false;
        }
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$MediaItem;
        if (offsetDateTime == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem != null : !offsetDateTime.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str3 = this.MediaMetadataCompat;
        if (str3 == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat != null : !str3.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver != null : !str4.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str5 == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver != null : !str5.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        OffsetDateTime offsetDateTime2 = this.MediaSessionCompat$QueueItem;
        if (offsetDateTime2 == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem != null : !offsetDateTime2.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem)) {
            return false;
        }
        BigDecimal bigDecimal2 = this.ParcelableVolumeInfo;
        if (bigDecimal2 == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo != null : !bigDecimal2.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.RatingCompat;
        if (bigDecimal3 == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.RatingCompat != null : !bigDecimal3.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.RatingCompat)) {
            return false;
        }
        String str6 = this.read;
        if (str6 == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.read != null : !str6.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.read)) {
            return false;
        }
        String str7 = this.write;
        if (str7 == null ? hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.write != null : !str7.equals(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.write)) {
            return false;
        }
        List<HmlWorkAddressActivity.read> list = this.MediaBrowserCompat$ItemReceiver;
        List<HmlWorkAddressActivity.read> list2 = hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.MediaSessionCompat$ResultReceiverWrapper;
        String str = this.MediaSessionCompat$Token;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        BigDecimal bigDecimal = this.MediaDescriptionCompat;
        int hashCode3 = bigDecimal != null ? bigDecimal.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode5 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = str5 != null ? str5.hashCode() : 0;
        OffsetDateTime offsetDateTime2 = this.MediaSessionCompat$QueueItem;
        int hashCode8 = offsetDateTime2 != null ? offsetDateTime2.hashCode() : 0;
        BigDecimal bigDecimal2 = this.ParcelableVolumeInfo;
        int hashCode9 = bigDecimal2 != null ? bigDecimal2.hashCode() : 0;
        BigDecimal bigDecimal3 = this.RatingCompat;
        int hashCode10 = bigDecimal3 != null ? bigDecimal3.hashCode() : 0;
        String str6 = this.read;
        int hashCode11 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.write;
        int hashCode12 = str7 != null ? str7.hashCode() : 0;
        List<HmlWorkAddressActivity.read> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((((((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i2;
    }
}
