package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: o.nIncDeviceCreate */
public final class nIncDeviceCreate extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<nIncDeviceCreate> CREATOR = new Parcelable.ClassLoaderCreator<nIncDeviceCreate>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new nIncDeviceCreate(parcel, (ClassLoader) null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new nIncDeviceCreate(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new nIncDeviceCreate[i];
        }
    };

    public final int describeContents() {
        return 0;
    }

    public nIncDeviceCreate() {
    }

    public nIncDeviceCreate(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
