package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.CommonUtils;

/* renamed from: o.performCreateApp */
public final class performCreateApp extends CommonUtils.C31811 implements Parcelable {
    public static final Parcelable.Creator<performCreateApp> CREATOR = new Parcelable.Creator<performCreateApp>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new performCreateApp(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new performCreateApp[i];
        }
    };
    public int read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ performCreateApp(write write2, byte b) {
        this(write2);
    }

    private performCreateApp(write write2) {
        super((CommonUtils.C31811.read) write2);
        this.read = write2.write;
        this.write = write2.read;
    }

    protected performCreateApp(Parcel parcel) {
        super(parcel);
        this.read = parcel.readInt();
        this.write = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.read);
        parcel.writeString(this.write);
    }

    public static performCreateApp$MediaBrowserCompat$ItemReceiver read() {
        return new performCreateApp$MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: o.performCreateApp$write */
    public static abstract class write<T extends CommonUtils.C31811, B extends write<T, B>> extends CommonUtils.C31811.read<T, B> {
        String read;
        int write;

        public final B read(int i) {
            this.write = i;
            return (write) IconCompatParcelizer();
        }

        public final B IconCompatParcelizer(String str) {
            this.read = str;
            return (write) IconCompatParcelizer();
        }
    }
}
