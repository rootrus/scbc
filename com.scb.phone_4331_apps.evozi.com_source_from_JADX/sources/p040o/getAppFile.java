package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getAppFile */
public final class getAppFile extends FirebaseCrashlytics implements Parcelable {
    public static final Parcelable.Creator<getAppFile> CREATOR = new Parcelable.Creator<getAppFile>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getAppFile(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getAppFile[i];
        }
    };
    public String MediaBrowserCompat$MediaItem;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ getAppFile(Parcel parcel, byte b) {
        this(parcel);
    }

    public getAppFile() {
    }

    private getAppFile(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$MediaItem = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
    }
}
