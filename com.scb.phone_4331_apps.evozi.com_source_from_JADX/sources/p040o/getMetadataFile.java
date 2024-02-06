package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getMetadataFile */
public final class getMetadataFile extends zzuk implements Parcelable {
    public static final Parcelable.Creator<getMetadataFile> CREATOR = new Parcelable.Creator<getMetadataFile>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getMetadataFile(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getMetadataFile[i];
        }
    };
    public List<getBinaryImagesFile> write;

    public final int describeContents() {
        return 0;
    }

    public getMetadataFile() {
    }

    protected getMetadataFile(Parcel parcel) {
        this.write = parcel.createTypedArrayList(getBinaryImagesFile.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.write);
    }

    public static getMetadataFile MediaBrowserCompat$ItemReceiver() {
        return new getMetadataFile();
    }
}
