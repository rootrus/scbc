package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.removeForwardSlashesIn */
public final class removeForwardSlashesIn implements Parcelable {
    public static final Parcelable.Creator<removeForwardSlashesIn> CREATOR = new Parcelable.Creator<removeForwardSlashesIn>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new removeForwardSlashesIn(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new removeForwardSlashesIn[i];
        }
    };
    public AutoValue_CrashlyticsReport_CustomAttribute IconCompatParcelizer;
    public AutoValue_CrashlyticsReport_CustomAttribute MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public AutoValue_CrashlyticsReport_CustomAttribute MediaBrowserCompat$MediaItem;
    public boolean read;
    public boolean write;

    public final int describeContents() {
        return 0;
    }

    public removeForwardSlashesIn() {
    }

    protected removeForwardSlashesIn(Parcel parcel) {
        boolean z = true;
        this.write = parcel.readByte() != 0;
        this.read = parcel.readByte() != 0;
        this.MediaBrowserCompat$ItemReceiver = parcel.readByte() == 0 ? false : z;
        this.MediaBrowserCompat$MediaItem = (AutoValue_CrashlyticsReport_CustomAttribute) parcel.readParcelable(AutoValue_CrashlyticsReport_CustomAttribute.class.getClassLoader());
        this.IconCompatParcelizer = (AutoValue_CrashlyticsReport_CustomAttribute) parcel.readParcelable(AutoValue_CrashlyticsReport_CustomAttribute.class.getClassLoader());
        this.MediaBrowserCompat$CustomActionResultReceiver = (AutoValue_CrashlyticsReport_CustomAttribute) parcel.readParcelable(AutoValue_CrashlyticsReport_CustomAttribute.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.write ? (byte) 1 : 0);
        parcel.writeByte(this.read ? (byte) 1 : 0);
        parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
        parcel.writeParcelable(this.MediaBrowserCompat$MediaItem, i);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
    }

    public static removeForwardSlashesIn IconCompatParcelizer() {
        return new removeForwardSlashesIn();
    }
}
