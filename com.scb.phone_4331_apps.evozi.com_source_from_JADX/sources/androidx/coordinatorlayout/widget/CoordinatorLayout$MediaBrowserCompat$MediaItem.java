package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p040o.setTitleMarginBottom;

public class CoordinatorLayout$MediaBrowserCompat$MediaItem extends setTitleMarginBottom {
    public static final Parcelable.Creator<CoordinatorLayout$MediaBrowserCompat$MediaItem> CREATOR = new Parcelable.ClassLoaderCreator<CoordinatorLayout$MediaBrowserCompat$MediaItem>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CoordinatorLayout$MediaBrowserCompat$MediaItem(parcel, (ClassLoader) null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new CoordinatorLayout$MediaBrowserCompat$MediaItem(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CoordinatorLayout$MediaBrowserCompat$MediaItem[i];
        }
    };
    SparseArray<Parcelable> read;

    public CoordinatorLayout$MediaBrowserCompat$MediaItem(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.read = new SparseArray<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.read.append(iArr[i], readParcelableArray[i]);
        }
    }

    public CoordinatorLayout$MediaBrowserCompat$MediaItem(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray<Parcelable> sparseArray = this.read;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.read.keyAt(i2);
            parcelableArr[i2] = this.read.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
