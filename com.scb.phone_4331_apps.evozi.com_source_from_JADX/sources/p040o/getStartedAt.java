package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getStartedAt */
public final class getStartedAt extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public String IconCompatParcelizer;
    public getEndedAt MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public final String read;

    /* renamed from: o.getStartedAt$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new getStartedAt(parcel.readInt() != 0 ? (getEndedAt) getEndedAt.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new getStartedAt[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        getEndedAt getendedat = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getendedat != null) {
            parcel.writeInt(1);
            getendedat.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
    }

    public getStartedAt(getEndedAt getendedat, String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "callbackUrl");
        onGetStartedClick.write((Object) str2, "customDescription");
        onGetStartedClick.write((Object) str3, "displayName");
        this.MediaBrowserCompat$CustomActionResultReceiver = getendedat;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
    }
}
