package p040o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.nIncLoadSO */
public final class nIncLoadSO extends setTitleMarginBottom {
    public static final Parcelable.Creator<nIncLoadSO> CREATOR = new Parcelable.ClassLoaderCreator<nIncLoadSO>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new nIncLoadSO(parcel, (ClassLoader) null, (byte) 0);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new nIncLoadSO(parcel, classLoader, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new nIncLoadSO[i];
        }
    };
    public final AppCompatCheckBox<String, Bundle> read;

    /* synthetic */ nIncLoadSO(Parcel parcel, ClassLoader classLoader, byte b) {
        this(parcel, classLoader);
    }

    public nIncLoadSO(Parcelable parcelable) {
        super(parcelable);
        this.read = new AppCompatCheckBox<>();
    }

    private nIncLoadSO(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.read = new AppCompatCheckBox<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.read.put(strArr[i], bundleArr[i]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.read.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 << 1;
            strArr[i2] = (String) this.read.read[i3];
            bundleArr[i2] = (Bundle) this.read.read[i3 + 1];
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }
}
