package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getPublishedEvents */
public final class getPublishedEvents implements Parcelable {
    public static final Parcelable.Creator<getPublishedEvents> CREATOR = new Parcelable.Creator<getPublishedEvents>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getPublishedEvents(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getPublishedEvents[i];
        }
    };
    public String IconCompatParcelizer;
    public intoSet MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    private readString RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public getPublishedEvents(String str, intoSet intoset, String str2, String str3, String str4, String str5, readString readstring, String str6) {
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = intoset;
        this.read = str2;
        this.write = str3;
        this.IconCompatParcelizer = str4;
        this.MediaMetadataCompat = str5;
        this.RatingCompat = readstring;
        this.MediaBrowserCompat$ItemReceiver = str6;
    }

    protected getPublishedEvents(Parcel parcel) {
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = (intoSet) parcel.readParcelable(intoSet.class.getClassLoader());
        this.read = parcel.readString();
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.RatingCompat = readString.valueOf(parcel.readString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.RatingCompat.name());
    }
}
