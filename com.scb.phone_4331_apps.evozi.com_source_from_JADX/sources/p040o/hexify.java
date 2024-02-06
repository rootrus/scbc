package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.hexify */
public final class hexify implements Parcelable {
    public static final Parcelable.Creator<hexify> CREATOR = new Parcelable.Creator<hexify>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new hexify(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hexify[i];
        }
    };
    public List<getStringsFileValue> MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ hexify(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private hexify(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.read;
    }

    protected hexify(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(getStringsFileValue.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }

    public static IconCompatParcelizer read() {
        return new IconCompatParcelizer();
    }

    /* renamed from: o.hexify$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public List<getStringsFileValue> read;

        protected IconCompatParcelizer() {
        }
    }
}
