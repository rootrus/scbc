package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getDeviceArchitecture */
public class getDeviceArchitecture implements Parcelable {
    public static final Parcelable.Creator<getDeviceArchitecture> CREATOR = new Parcelable.Creator<getDeviceArchitecture>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getDeviceArchitecture(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getDeviceArchitecture[i];
        }
    };
    public List<String> MediaBrowserCompat$CustomActionResultReceiver;
    public List<String> read;
    public List<String> write;

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ getDeviceArchitecture(read read2, byte b) {
        this(read2);
    }

    private getDeviceArchitecture(read read2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$ItemReceiver;
        this.read = read2.read;
        this.write = read2.write;
    }

    protected getDeviceArchitecture(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.createStringArrayList();
        this.read = parcel.createStringArrayList();
        this.write = parcel.createStringArrayList();
    }

    public static read read() {
        return new read((byte) 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeStringList(this.read);
        parcel.writeStringList(this.write);
    }

    /* renamed from: o.getDeviceArchitecture$read */
    public static final class read {
        public List<String> MediaBrowserCompat$ItemReceiver;
        public List<String> read;
        public List<String> write;

        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
        }
    }
}
