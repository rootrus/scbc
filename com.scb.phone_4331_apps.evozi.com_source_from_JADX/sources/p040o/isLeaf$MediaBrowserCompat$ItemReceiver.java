package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.BinaryImagesConverter;

/* renamed from: o.isLeaf$MediaBrowserCompat$ItemReceiver */
public final class isLeaf$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new isLeaf(parcel.readInt() != 0, (BinaryImagesConverter.FileIdStrategy) Enum.valueOf(BinaryImagesConverter.FileIdStrategy.class, parcel.readString()), (BinaryImagesConverter.FileIdStrategy) Enum.valueOf(BinaryImagesConverter.FileIdStrategy.class, parcel.readString()), (NativeFileUtils) Enum.valueOf(NativeFileUtils.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
    }

    public final Object[] newArray(int i) {
        return new isLeaf[i];
    }
}
