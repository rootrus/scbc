package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.cacheUserData */
public final class cacheUserData extends remainingCapacity implements Parcelable {
    public static final cacheUserData$MediaBrowserCompat$ItemReceiver CREATOR = new cacheUserData$MediaBrowserCompat$ItemReceiver((byte) 0);
    public boolean IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2803x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token;
    private String ParcelableVolumeInfo;
    public List<String> RatingCompat;
    public String read;

    public cacheUserData() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    private /* synthetic */ cacheUserData(byte b) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List<String>) null, false);
    }

    public cacheUserData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<String> list, boolean z) {
        this.MediaDescriptionCompat = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaSessionCompat$QueueItem = str5;
        this.MediaBrowserCompat$SearchResultReceiver = str6;
        this.MediaMetadataCompat = str7;
        this.ParcelableVolumeInfo = str8;
        this.MediaSessionCompat$Token = str9;
        this.MediaBrowserCompat$MediaItem = str10;
        this.MediaSessionCompat$ResultReceiverWrapper = str11;
        this.f2803x50fd9e4a = str12;
        this.RatingCompat = list;
        this.IconCompatParcelizer = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public cacheUserData(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readByte() != 0);
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.f2803x50fd9e4a);
        parcel.writeStringList(this.RatingCompat);
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
    }
}
