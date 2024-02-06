package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.closeLogFile */
public final class closeLogFile extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<closeLogFile> CREATOR = new write();
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    private final String MediaBrowserCompat$SearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final String read;

    public final int describeContents() {
        return 0;
    }

    public closeLogFile(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.IconCompatParcelizer = str5;
        this.read = str6;
        this.MediaBrowserCompat$CustomActionResultReceiver = str7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public closeLogFile(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        onGetStartedClick.write((Object) parcel, "source");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.closeLogFile$write */
    public static final class write implements Parcelable.Creator<closeLogFile> {
        write() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new closeLogFile(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new closeLogFile[i];
        }
    }
}
