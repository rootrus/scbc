package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getUuidUtf8Bytes */
public class getUuidUtf8Bytes implements Parcelable {
    public static final Parcelable.Creator<getUuidUtf8Bytes> CREATOR = new Parcelable.Creator<getUuidUtf8Bytes>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getUuidUtf8Bytes(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getUuidUtf8Bytes[i];
        }
    };
    public String AlertController$RecycleListView;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    public Boolean MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public parseEventExecution MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f2601x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public setUuidFromUtf8Bytes PlaybackStateCompat;
    public AutoValue_CrashlyticsReport_Session_Application RatingCompat;

    public int describeContents() {
        return 0;
    }

    public getUuidUtf8Bytes() {
    }

    public getUuidUtf8Bytes(Parcel parcel) {
        Boolean bool;
        this.ParcelableVolumeInfo = parcel.readString();
        this.AlertController$RecycleListView = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        boolean z = false;
        this.f2601x50fd9e4a = parcel.readByte() != 0;
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = (parseEventExecution) parcel.readParcelable(parseEventExecution.class.getClassLoader());
        this.PlaybackStateCompat = (setUuidFromUtf8Bytes) parcel.readParcelable(setUuidFromUtf8Bytes.class.getClassLoader());
        byte readByte = parcel.readByte();
        if (readByte == 0) {
            bool = null;
        } else {
            bool = Boolean.valueOf(readByte == 1 ? true : z);
        }
        this.MediaBrowserCompat$ItemReceiver = bool;
        this.RatingCompat = (AutoValue_CrashlyticsReport_Session_Application) parcel.readParcelable(AutoValue_CrashlyticsReport_Session_Application.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeByte(this.f2601x50fd9e4a ? (byte) 1 : 0);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeParcelable(this.MediaBrowserCompat$SearchResultReceiver, i);
        parcel.writeParcelable(this.PlaybackStateCompat, i);
        Boolean bool = this.MediaBrowserCompat$ItemReceiver;
        parcel.writeByte((byte) (bool == null ? 0 : bool.booleanValue() ? 1 : 2));
        parcel.writeParcelable(this.RatingCompat, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getUuidUtf8Bytes getuuidutf8bytes = (getUuidUtf8Bytes) obj;
        if (this.f2601x50fd9e4a != getuuidutf8bytes.f2601x50fd9e4a) {
            return false;
        }
        String str = this.ParcelableVolumeInfo;
        if (str == null ? getuuidutf8bytes.ParcelableVolumeInfo != null : !str.equals(getuuidutf8bytes.ParcelableVolumeInfo)) {
            return false;
        }
        String str2 = this.AlertController$RecycleListView;
        if (str2 == null ? getuuidutf8bytes.AlertController$RecycleListView != null : !str2.equals(getuuidutf8bytes.AlertController$RecycleListView)) {
            return false;
        }
        String str3 = this.MediaDescriptionCompat;
        if (str3 == null ? getuuidutf8bytes.MediaDescriptionCompat != null : !str3.equals(getuuidutf8bytes.MediaDescriptionCompat)) {
            return false;
        }
        String str4 = this.MediaSessionCompat$Token;
        if (str4 == null ? getuuidutf8bytes.MediaSessionCompat$Token != null : !str4.equals(getuuidutf8bytes.MediaSessionCompat$Token)) {
            return false;
        }
        String str5 = this.MediaSessionCompat$QueueItem;
        if (str5 == null ? getuuidutf8bytes.MediaSessionCompat$QueueItem != null : !str5.equals(getuuidutf8bytes.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str6 = this.MediaBrowserCompat$MediaItem;
        if (str6 == null ? getuuidutf8bytes.MediaBrowserCompat$MediaItem != null : !str6.equals(getuuidutf8bytes.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 == null ? getuuidutf8bytes.MediaBrowserCompat$CustomActionResultReceiver != null : !str7.equals(getuuidutf8bytes.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str8 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str8 == null ? getuuidutf8bytes.MediaSessionCompat$ResultReceiverWrapper != null : !str8.equals(getuuidutf8bytes.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str9 = this.MediaMetadataCompat;
        if (str9 == null ? getuuidutf8bytes.MediaMetadataCompat != null : !str9.equals(getuuidutf8bytes.MediaMetadataCompat)) {
            return false;
        }
        parseEventExecution parseeventexecution = this.MediaBrowserCompat$SearchResultReceiver;
        if (parseeventexecution == null ? getuuidutf8bytes.MediaBrowserCompat$SearchResultReceiver != null : !parseeventexecution.equals(getuuidutf8bytes.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        AutoValue_CrashlyticsReport_Session_Application autoValue_CrashlyticsReport_Session_Application = this.RatingCompat;
        if (autoValue_CrashlyticsReport_Session_Application == null ? getuuidutf8bytes.RatingCompat != null : !autoValue_CrashlyticsReport_Session_Application.equals(getuuidutf8bytes.RatingCompat)) {
            return false;
        }
        Boolean bool = this.MediaBrowserCompat$ItemReceiver;
        if (bool == null ? getuuidutf8bytes.MediaBrowserCompat$ItemReceiver != null : !bool.equals(getuuidutf8bytes.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        setUuidFromUtf8Bytes setuuidfromutf8bytes = this.PlaybackStateCompat;
        setUuidFromUtf8Bytes setuuidfromutf8bytes2 = getuuidutf8bytes.PlaybackStateCompat;
        if (setuuidfromutf8bytes != null) {
            return setuuidfromutf8bytes.equals(setuuidfromutf8bytes2);
        }
        if (setuuidfromutf8bytes2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.ParcelableVolumeInfo;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.AlertController$RecycleListView;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaSessionCompat$Token;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaSessionCompat$QueueItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$MediaItem;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        boolean z = this.f2601x50fd9e4a;
        String str8 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaMetadataCompat;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        parseEventExecution parseeventexecution = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode10 = parseeventexecution != null ? parseeventexecution.hashCode() : 0;
        setUuidFromUtf8Bytes setuuidfromutf8bytes = this.PlaybackStateCompat;
        int hashCode11 = setuuidfromutf8bytes != null ? setuuidfromutf8bytes.hashCode() : 0;
        Boolean bool = this.MediaBrowserCompat$ItemReceiver;
        int hashCode12 = bool != null ? bool.hashCode() : 0;
        AutoValue_CrashlyticsReport_Session_Application autoValue_CrashlyticsReport_Session_Application = this.RatingCompat;
        if (autoValue_CrashlyticsReport_Session_Application != null) {
            i = autoValue_CrashlyticsReport_Session_Application.hashCode();
        }
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (z ? 1 : 0)) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
    }
}
