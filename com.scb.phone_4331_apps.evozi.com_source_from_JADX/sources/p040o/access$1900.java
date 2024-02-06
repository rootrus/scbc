package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$1900 */
public final class access$1900 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public String MediaDescriptionCompat;
    public String read;
    public String write;

    /* renamed from: o.access$1900$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new access$1900(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new access$1900[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
    }

    public access$1900(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) str, "accountType");
        onGetStartedClick.write((Object) str2, "name");
        onGetStartedClick.write((Object) str4, "desc");
        onGetStartedClick.write((Object) str5, "imageURL");
        onGetStartedClick.write((Object) str6, "header");
        this.MediaBrowserCompat$MediaItem = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.IconCompatParcelizer = str5;
        this.write = str6;
    }
}
