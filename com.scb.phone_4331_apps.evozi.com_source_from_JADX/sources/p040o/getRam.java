package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getRam */
public final class getRam implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$Token;
    public final String RatingCompat;
    public final String read;
    public final String write;

    /* renamed from: o.getRam$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new getRam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new getRam[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaSessionCompat$Token);
    }

    public getRam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        onGetStartedClick.write((Object) str, "addressNumber");
        onGetStartedClick.write((Object) str2, "village");
        onGetStartedClick.write((Object) str3, "unitNumber");
        onGetStartedClick.write((Object) str4, "floorNumber");
        onGetStartedClick.write((Object) str5, "moo");
        onGetStartedClick.write((Object) str6, "trok");
        onGetStartedClick.write((Object) str7, "soi");
        onGetStartedClick.write((Object) str8, "thanon");
        onGetStartedClick.write((Object) str9, "district");
        onGetStartedClick.write((Object) str10, "amphur");
        onGetStartedClick.write((Object) str11, "province");
        onGetStartedClick.write((Object) str12, "zipCode");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaSessionCompat$QueueItem = str2;
        this.MediaMetadataCompat = str3;
        this.read = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.MediaDescriptionCompat = str6;
        this.MediaBrowserCompat$MediaItem = str7;
        this.RatingCompat = str8;
        this.IconCompatParcelizer = str9;
        this.write = str10;
        this.MediaBrowserCompat$SearchResultReceiver = str11;
        this.MediaSessionCompat$Token = str12;
    }
}
