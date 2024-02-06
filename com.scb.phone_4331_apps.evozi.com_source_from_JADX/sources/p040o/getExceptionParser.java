package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getExceptionParser */
public class getExceptionParser extends setCurrentItemInternal {
    @SerializedName("transactionToken")
    public String AlertController$RecycleListView;
    @SerializedName("accountFromName")
    public String IconCompatParcelizer;
    @SerializedName("accountToDisplayName")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountToBankCode")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountToType")
    public String MediaBrowserCompat$MediaItem;
    @SerializedName("channelFee")
    public double MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("terminalNo")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2832x50fd9e4a;
    @SerializedName("botFee")
    public double MediaDescriptionCompat;
    @SerializedName("fastpayFlag")
    public String MediaMetadataCompat;
    @SerializedName("sequence")
    public String MediaSessionCompat$QueueItem;
    @SerializedName("scbFee")
    public double MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("totalFee")
    public double MediaSessionCompat$Token;
    @SerializedName("pccTraceNo")
    public String ParcelableVolumeInfo;
    @SerializedName("transferType")
    public String PlaybackStateCompat$CustomAction;
    @SerializedName("feeType")
    public String RatingCompat;
    @SerializedName("accountToName")
    public String read;
    @SerializedName("accountTo")
    public String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getExceptionParser)) {
            return false;
        }
        getExceptionParser getexceptionparser = (getExceptionParser) obj;
        if (Double.compare(getexceptionparser.MediaSessionCompat$Token, this.MediaSessionCompat$Token) != 0 || Double.compare(getexceptionparser.MediaSessionCompat$ResultReceiverWrapper, this.MediaSessionCompat$ResultReceiverWrapper) != 0 || Double.compare(getexceptionparser.MediaDescriptionCompat, this.MediaDescriptionCompat) != 0 || Double.compare(getexceptionparser.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$SearchResultReceiver) != 0) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        if (str == null ? getexceptionparser.IconCompatParcelizer != null : !str.equals(getexceptionparser.IconCompatParcelizer)) {
            return false;
        }
        String str2 = this.write;
        if (str2 == null ? getexceptionparser.write != null : !str2.equals(getexceptionparser.write)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 == null ? getexceptionparser.MediaBrowserCompat$ItemReceiver != null : !str3.equals(getexceptionparser.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 == null ? getexceptionparser.MediaBrowserCompat$CustomActionResultReceiver != null : !str4.equals(getexceptionparser.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str5 = this.read;
        if (str5 == null ? getexceptionparser.read != null : !str5.equals(getexceptionparser.read)) {
            return false;
        }
        String str6 = this.MediaBrowserCompat$MediaItem;
        if (str6 == null ? getexceptionparser.MediaBrowserCompat$MediaItem != null : !str6.equals(getexceptionparser.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str7 = this.ParcelableVolumeInfo;
        if (str7 == null ? getexceptionparser.ParcelableVolumeInfo != null : !str7.equals(getexceptionparser.ParcelableVolumeInfo)) {
            return false;
        }
        String str8 = this.PlaybackStateCompat$CustomAction;
        if (str8 == null ? getexceptionparser.PlaybackStateCompat$CustomAction != null : !str8.equals(getexceptionparser.PlaybackStateCompat$CustomAction)) {
            return false;
        }
        String str9 = this.RatingCompat;
        if (str9 == null ? getexceptionparser.RatingCompat != null : !str9.equals(getexceptionparser.RatingCompat)) {
            return false;
        }
        String str10 = this.f2832x50fd9e4a;
        if (str10 == null ? getexceptionparser.f2832x50fd9e4a != null : !str10.equals(getexceptionparser.f2832x50fd9e4a)) {
            return false;
        }
        String str11 = this.MediaSessionCompat$QueueItem;
        if (str11 == null ? getexceptionparser.MediaSessionCompat$QueueItem != null : !str11.equals(getexceptionparser.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str12 = this.AlertController$RecycleListView;
        if (str12 == null ? getexceptionparser.AlertController$RecycleListView != null : !str12.equals(getexceptionparser.AlertController$RecycleListView)) {
            return false;
        }
        String str13 = this.MediaMetadataCompat;
        if (str13 != null) {
            return str13.equals(getexceptionparser.MediaMetadataCompat);
        }
        if (getexceptionparser.MediaMetadataCompat != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaSessionCompat$Token);
        int i13 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaSessionCompat$ResultReceiverWrapper);
        int i14 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i15 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        long doubleToLongBits4 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        int i16 = (int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32));
        String str = this.IconCompatParcelizer;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.write;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        String str5 = this.read;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        String str6 = this.MediaBrowserCompat$MediaItem;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        String str7 = this.ParcelableVolumeInfo;
        if (str7 != null) {
            i7 = str7.hashCode();
        } else {
            i7 = 0;
        }
        String str8 = this.PlaybackStateCompat$CustomAction;
        if (str8 != null) {
            i8 = str8.hashCode();
        } else {
            i8 = 0;
        }
        String str9 = this.RatingCompat;
        if (str9 != null) {
            i9 = str9.hashCode();
        } else {
            i9 = 0;
        }
        String str10 = this.f2832x50fd9e4a;
        if (str10 != null) {
            i10 = str10.hashCode();
        } else {
            i10 = 0;
        }
        String str11 = this.MediaSessionCompat$QueueItem;
        if (str11 != null) {
            i11 = str11.hashCode();
        } else {
            i11 = 0;
        }
        String str12 = this.AlertController$RecycleListView;
        if (str12 != null) {
            i12 = str12.hashCode();
        } else {
            i12 = 0;
        }
        String str13 = this.MediaMetadataCompat;
        return (((((((((((((((((((((((((((((((i13 * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + i9) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + (str13 != null ? str13.hashCode() : 0);
    }
}
