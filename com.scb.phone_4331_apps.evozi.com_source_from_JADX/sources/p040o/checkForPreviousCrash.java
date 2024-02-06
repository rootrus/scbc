package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.checkForPreviousCrash */
public final class checkForPreviousCrash implements Parcelable {
    public static final Parcelable.Creator<checkForPreviousCrash> CREATOR = new Parcelable.Creator<checkForPreviousCrash>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new checkForPreviousCrash(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new checkForPreviousCrash[i];
        }
    };
    public isBuildIdValid IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public checkForPreviousCrash() {
    }

    public static checkForPreviousCrash write() {
        return new checkForPreviousCrash();
    }

    protected checkForPreviousCrash(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.write = parcel.readString();
        this.IconCompatParcelizer = (isBuildIdValid) parcel.readParcelable(isBuildIdValid.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
    }
}
