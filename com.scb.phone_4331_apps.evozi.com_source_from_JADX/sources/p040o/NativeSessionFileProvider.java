package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.NativeSessionFileProvider */
public class NativeSessionFileProvider extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<NativeSessionFileProvider> CREATOR = new Parcelable.Creator<NativeSessionFileProvider>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new NativeSessionFileProvider(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new NativeSessionFileProvider[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private boolean MediaDescriptionCompat;
    public int read;

    public int describeContents() {
        return 0;
    }

    protected NativeSessionFileProvider(NativeSessionFileProvider$MediaBrowserCompat$ItemReceiver nativeSessionFileProvider$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$ItemReceiver = nativeSessionFileProvider$MediaBrowserCompat$ItemReceiver.write;
        this.IconCompatParcelizer = nativeSessionFileProvider$MediaBrowserCompat$ItemReceiver.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = nativeSessionFileProvider$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.read = nativeSessionFileProvider$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        this.write = nativeSessionFileProvider$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        this.MediaDescriptionCompat = false;
    }

    protected NativeSessionFileProvider(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readInt();
        boolean z = true;
        this.MediaDescriptionCompat = parcel.readByte() != 0;
        this.write = parcel.readByte() == 0 ? false : z;
    }

    public static NativeSessionFileProvider$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver() {
        return new read((byte) 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.read);
        parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
        parcel.writeByte(this.write ? (byte) 1 : 0);
    }

    /* renamed from: o.NativeSessionFileProvider$read */
    public static class read extends NativeSessionFileProvider$MediaBrowserCompat$ItemReceiver<NativeSessionFileProvider, read> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ NativeSessionFileProvider$MediaBrowserCompat$ItemReceiver write() {
            return this;
        }

        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
        }

        public final NativeSessionFileProvider MediaBrowserCompat$CustomActionResultReceiver() {
            return new NativeSessionFileProvider((NativeSessionFileProvider$MediaBrowserCompat$ItemReceiver) this);
        }
    }
}
