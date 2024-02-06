package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachDstIn */
public final class forEachDstIn extends ZTBSV {
    public static final Parcelable.Creator<forEachDstIn> CREATOR = new forEachDstIn$MediaBrowserCompat$CustomActionResultReceiver();
    public static final read write = new read((byte) 0);

    public static final String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return read.read(str);
    }

    public forEachDstIn() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public forEachDstIn(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        IconCompatParcelizer(parcel);
    }

    /* renamed from: o.forEachDstIn$read */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static String read(String str) {
            return (str == null || str.hashCode() != 233355415 || !str.equals("DEVICE_NOT_REGISTERED")) ? "preregistered" : "switch device";
        }
    }
}
