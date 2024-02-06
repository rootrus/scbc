package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.setModelClass */
public final class setModelClass implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public final List<isSimulator> IconCompatParcelizer;

    /* renamed from: o.setModelClass$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((isSimulator) parcel.readParcelable(setModelClass.class.getClassLoader()));
                readInt--;
            }
            return new setModelClass(arrayList);
        }

        public final Object[] newArray(int i) {
            return new setModelClass[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setModelClass) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((setModelClass) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<isSimulator> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidActivationLandingDisplay(prepaidCardList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        List<isSimulator> list = this.IconCompatParcelizer;
        parcel.writeInt(list.size());
        for (isSimulator writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    public setModelClass(List<isSimulator> list) {
        onGetStartedClick.write((Object) list, "prepaidCardList");
        this.IconCompatParcelizer = list;
    }
}
