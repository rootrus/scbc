package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.onPreExecute */
public final class onPreExecute implements Parcelable {
    public static final Parcelable.Creator<onPreExecute> CREATOR = new Parcelable.Creator<onPreExecute>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new onPreExecute(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new onPreExecute[i];
        }
    };
    public Double MediaBrowserCompat$CustomActionResultReceiver;
    public List<performCreateApp> read;
    public Double write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ onPreExecute(read read2, byte b) {
        this(read2);
    }

    protected onPreExecute(Parcel parcel) {
        if (parcel.readByte() == 0) {
            this.write = null;
        } else {
            this.write = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(parcel.readDouble());
        }
        this.read = parcel.createTypedArrayList(performCreateApp.CREATOR);
    }

    private onPreExecute(read read2) {
        this.write = read2.IconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$ItemReceiver;
        this.read = read2.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static read MediaBrowserCompat$ItemReceiver() {
        return new read((byte) 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.write == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.write.doubleValue());
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver.doubleValue());
        }
        parcel.writeTypedList(this.read);
    }

    /* renamed from: o.onPreExecute$read */
    public static final class read {
        public Double IconCompatParcelizer;
        public List<performCreateApp> MediaBrowserCompat$CustomActionResultReceiver;
        public Double MediaBrowserCompat$ItemReceiver;

        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
        }
    }
}
