package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ForwardingCheckedFuture */
public class ForwardingCheckedFuture implements Parcelable {
    public static final Parcelable.Creator<ForwardingCheckedFuture> CREATOR = new Parcelable.Creator<ForwardingCheckedFuture>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ForwardingCheckedFuture(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ForwardingCheckedFuture[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public int write;

    /* renamed from: o.ForwardingCheckedFuture$SimpleForwardingCheckedFuture */
    public class SimpleForwardingCheckedFuture {
    }

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ ForwardingCheckedFuture(read read2, byte b) {
        this(read2);
    }

    private ForwardingCheckedFuture(read read2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.IconCompatParcelizer;
        this.write = read2.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = read2.write;
        this.read = read2.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = read2.read;
    }

    protected ForwardingCheckedFuture(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readInt();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public static read MediaBrowserCompat$CustomActionResultReceiver() {
        return new read((byte) 0);
    }

    /* renamed from: o.ForwardingCheckedFuture$read */
    public static final class read {
        public String IconCompatParcelizer;
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;

        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
        }
    }
}
