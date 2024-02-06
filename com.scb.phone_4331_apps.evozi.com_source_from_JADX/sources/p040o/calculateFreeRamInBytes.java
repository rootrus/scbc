package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.calculateFreeRamInBytes */
public final class calculateFreeRamInBytes implements Parcelable {
    public static final Parcelable.Creator<calculateFreeRamInBytes> CREATOR = new Parcelable.Creator<calculateFreeRamInBytes>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new calculateFreeRamInBytes(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new calculateFreeRamInBytes[i];
        }
    };
    public int IconCompatParcelizer;
    public List<calculateUsedDiskSpaceInBytes> write;

    public final int describeContents() {
        return 0;
    }

    public calculateFreeRamInBytes(int i, List<calculateUsedDiskSpaceInBytes> list) {
        this.IconCompatParcelizer = i;
        this.write = list;
    }

    protected calculateFreeRamInBytes(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readInt();
        this.write = parcel.createTypedArrayList(calculateUsedDiskSpaceInBytes.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeTypedList(this.write);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof calculateFreeRamInBytes)) {
            return false;
        }
        calculateFreeRamInBytes calculatefreeraminbytes = (calculateFreeRamInBytes) obj;
        if (this.IconCompatParcelizer != calculatefreeraminbytes.IconCompatParcelizer) {
            return false;
        }
        List<calculateUsedDiskSpaceInBytes> list = this.write;
        if (list != null) {
            return list.equals(calculatefreeraminbytes.write);
        }
        if (calculatefreeraminbytes.write != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        List<calculateUsedDiskSpaceInBytes> list = this.write;
        return (i * 31) + (list != null ? list.hashCode() : 0);
    }
}
