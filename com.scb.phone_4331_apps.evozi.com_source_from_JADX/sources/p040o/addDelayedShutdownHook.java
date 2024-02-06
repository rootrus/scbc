package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.addDelayedShutdownHook */
public final class addDelayedShutdownHook extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new addDelayedShutdownHook$MediaBrowserCompat$ItemReceiver();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String RatingCompat;
    public String read;

    public addDelayedShutdownHook() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    private /* synthetic */ addDelayedShutdownHook(byte b) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public addDelayedShutdownHook(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.MediaMetadataCompat = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.MediaSessionCompat$QueueItem = str6;
        this.RatingCompat = str7;
        this.read = str8;
        this.MediaDescriptionCompat = str9;
        this.MediaBrowserCompat$CustomActionResultReceiver = str10;
    }
}
