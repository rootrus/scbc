package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setActivity */
public class setActivity extends zzuk {
    @SerializedName("dayOfMonth")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("effectiveDate")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("recipientName")
    public String MediaBrowserCompat$MediaItem;
    @SerializedName("function")
    public zzrm MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("scheduleType")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2933x50fd9e4a;
    @SerializedName("scheduleDetailId")
    public int MediaDescriptionCompat;
    @SerializedName("logo")
    public String MediaMetadataCompat;
    @SerializedName("subFunction")
    public String MediaSessionCompat$QueueItem;
    @SerializedName("verificationRequest")
    public onMapReady MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("startDate")
    public String MediaSessionCompat$Token;
    @SerializedName("sortSequence")
    public int ParcelableVolumeInfo;
    @SerializedName("verificationResponse")
    public OnMapReadyCallback PlaybackStateCompat;
    @SerializedName("scheduleMainId")
    public String RatingCompat;
    @SerializedName("endDate")
    public String read;
    @SerializedName("createdDate")
    public String write;

    public setActivity(int i, String str, int i2, String str2, zzrm zzrm, String str3, String str4, String str5, String str6, String str7, String str8, onMapReady onmapready, OnMapReadyCallback onMapReadyCallback, String str9, String str10) {
        this.ParcelableVolumeInfo = i;
        this.RatingCompat = str;
        this.MediaDescriptionCompat = i2;
        this.f2933x50fd9e4a = str2;
        this.MediaBrowserCompat$SearchResultReceiver = zzrm;
        this.MediaSessionCompat$QueueItem = str3;
        this.write = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.MediaSessionCompat$Token = str6;
        this.read = str7;
        this.MediaBrowserCompat$ItemReceiver = str8;
        this.MediaSessionCompat$ResultReceiverWrapper = onmapready;
        this.PlaybackStateCompat = onMapReadyCallback;
        this.MediaBrowserCompat$MediaItem = str9;
        this.MediaMetadataCompat = str10;
    }

    public setActivity(String str, String str2, String str3, String str4) {
        this.f2933x50fd9e4a = str;
        this.MediaSessionCompat$Token = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setActivity setactivity = (setActivity) obj;
        if (this.ParcelableVolumeInfo != setactivity.ParcelableVolumeInfo || this.MediaDescriptionCompat != setactivity.MediaDescriptionCompat) {
            return false;
        }
        String str = this.RatingCompat;
        if (str == null ? setactivity.RatingCompat != null : !str.equals(setactivity.RatingCompat)) {
            return false;
        }
        String str2 = this.f2933x50fd9e4a;
        if (str2 == null ? setactivity.f2933x50fd9e4a != null : !str2.equals(setactivity.f2933x50fd9e4a)) {
            return false;
        }
        zzrm zzrm = this.MediaBrowserCompat$SearchResultReceiver;
        if (zzrm == null ? setactivity.MediaBrowserCompat$SearchResultReceiver != null : !zzrm.equals(setactivity.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str3 = this.MediaSessionCompat$QueueItem;
        if (str3 == null ? setactivity.MediaSessionCompat$QueueItem != null : !str3.equals(setactivity.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str4 = this.write;
        if (str4 == null ? setactivity.write != null : !str4.equals(setactivity.write)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 == null ? setactivity.MediaBrowserCompat$CustomActionResultReceiver != null : !str5.equals(setactivity.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str6 = this.MediaSessionCompat$Token;
        if (str6 == null ? setactivity.MediaSessionCompat$Token != null : !str6.equals(setactivity.MediaSessionCompat$Token)) {
            return false;
        }
        String str7 = this.read;
        if (str7 == null ? setactivity.read != null : !str7.equals(setactivity.read)) {
            return false;
        }
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        if (str8 == null ? setactivity.MediaBrowserCompat$ItemReceiver != null : !str8.equals(setactivity.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        onMapReady onmapready = this.MediaSessionCompat$ResultReceiverWrapper;
        if (onmapready == null ? setactivity.MediaSessionCompat$ResultReceiverWrapper != null : !onmapready.equals(setactivity.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        OnMapReadyCallback onMapReadyCallback = this.PlaybackStateCompat;
        if (onMapReadyCallback == null ? setactivity.PlaybackStateCompat != null : !onMapReadyCallback.equals(setactivity.PlaybackStateCompat)) {
            return false;
        }
        String str9 = this.MediaBrowserCompat$MediaItem;
        if (str9 == null ? setactivity.MediaBrowserCompat$MediaItem != null : !str9.equals(setactivity.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str10 = this.MediaMetadataCompat;
        String str11 = setactivity.MediaMetadataCompat;
        if (str10 != null) {
            return str10.equals(str11);
        }
        if (str11 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.ParcelableVolumeInfo;
        String str = this.RatingCompat;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.MediaDescriptionCompat;
        String str2 = this.f2933x50fd9e4a;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        zzrm zzrm = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = zzrm != null ? zzrm.hashCode() : 0;
        String str3 = this.MediaSessionCompat$QueueItem;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$Token;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        onMapReady onmapready = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode10 = onmapready != null ? onmapready.hashCode() : 0;
        OnMapReadyCallback onMapReadyCallback = this.PlaybackStateCompat;
        int hashCode11 = onMapReadyCallback != null ? onMapReadyCallback.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$MediaItem;
        int hashCode12 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaMetadataCompat;
        return (((((((((((((((((((((((((((i * 31) + hashCode) * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (str10 != null ? str10.hashCode() : 0);
    }
}
