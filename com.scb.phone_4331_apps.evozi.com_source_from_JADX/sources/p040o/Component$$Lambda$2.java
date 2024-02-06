package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Component$$Lambda$2 */
public final class Component$$Lambda$2 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    private final int IconCompatParcelizer;
    public final List<isAlwaysEager> MediaBrowserCompat$ItemReceiver;
    public final setInstantiation read;

    /* renamed from: o.Component$$Lambda$2$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList.add((isAlwaysEager) isAlwaysEager.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            return new Component$$Lambda$2(readInt, arrayList, (setInstantiation) setInstantiation.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new Component$$Lambda$2[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Component$$Lambda$2)) {
            return false;
        }
        Component$$Lambda$2 component$$Lambda$2 = (Component$$Lambda$2) obj;
        return this.IconCompatParcelizer == component$$Lambda$2.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) component$$Lambda$2.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) component$$Lambda$2.read);
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        List<isAlwaysEager> list = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        setInstantiation setinstantiation = this.read;
        if (setinstantiation != null) {
            i2 = setinstantiation.hashCode();
        }
        return (((i * 31) + hashCode) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECouponTransactionDisplay(numOfTransaction=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transactions=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", pagination=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.IconCompatParcelizer);
        List<isAlwaysEager> list = this.MediaBrowserCompat$ItemReceiver;
        parcel.writeInt(list.size());
        for (isAlwaysEager writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        this.read.writeToParcel(parcel, 0);
    }

    public Component$$Lambda$2(int i, List<isAlwaysEager> list, setInstantiation setinstantiation) {
        onGetStartedClick.write((Object) list, "transactions");
        onGetStartedClick.write((Object) setinstantiation, "pagination");
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = setinstantiation;
    }
}
