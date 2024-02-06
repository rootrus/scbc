package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getWorkingFileForSession */
public final class getWorkingFileForSession extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getWorkingFileForSession> CREATOR = new getWorkingFileForSession$MediaBrowserCompat$ItemReceiver();
    private final String IconCompatParcelizer;
    private final getLogAsString MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$SearchResultReceiver;
    private final String MediaMetadataCompat;
    private final String read;

    public final int describeContents() {
        return 0;
    }

    public getWorkingFileForSession(String str, String str2, String str3, String str4, String str5, getLogAsString getlogasstring) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.MediaMetadataCompat = str4;
        this.IconCompatParcelizer = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = getlogasstring;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public getWorkingFileForSession(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (getLogAsString) parcel.readParcelable(getLogAsString.class.getClassLoader()));
        onGetStartedClick.write((Object) parcel, "source");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
    }
}
