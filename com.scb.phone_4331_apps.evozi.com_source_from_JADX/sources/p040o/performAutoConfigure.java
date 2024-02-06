package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.performAutoConfigure */
public final class performAutoConfigure implements Parcelable {
    public static final Parcelable.Creator<performAutoConfigure> CREATOR = new Parcelable.Creator<performAutoConfigure>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new performAutoConfigure(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new performAutoConfigure[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ performAutoConfigure(performAutoConfigure$MediaBrowserCompat$ItemReceiver performautoconfigure_mediabrowsercompat_itemreceiver, byte b) {
        this(performautoconfigure_mediabrowsercompat_itemreceiver);
    }

    private performAutoConfigure(performAutoConfigure$MediaBrowserCompat$ItemReceiver performautoconfigure_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = performautoconfigure_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = performautoconfigure_mediabrowsercompat_itemreceiver.read;
        this.IconCompatParcelizer = performautoconfigure_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
        this.read = performautoconfigure_mediabrowsercompat_itemreceiver.write;
        this.write = performautoconfigure_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    protected performAutoConfigure(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        this.write = parcel.readString();
    }

    public static performAutoConfigure$MediaBrowserCompat$ItemReceiver read() {
        return new performAutoConfigure$MediaBrowserCompat$ItemReceiver((byte) 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
    }
}
