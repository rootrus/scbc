package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseCustomAttribute */
public final class parseCustomAttribute implements Parcelable {
    public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
    public parseEventDevice IconCompatParcelizer;
    public setMapToolbarEnabled MediaBrowserCompat$CustomActionResultReceiver;
    public parseEventDevice MediaBrowserCompat$ItemReceiver;
    private int MediaMetadataCompat;
    public parseEventDevice read;
    public boolean write;

    public final int describeContents() {
        return 0;
    }

    public parseCustomAttribute() {
        this.MediaBrowserCompat$CustomActionResultReceiver = setMapToolbarEnabled.FAIL;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public parseCustomAttribute(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        this.MediaMetadataCompat = parcel.readInt();
        this.write = parcel.readInt() != 1 ? false : true;
        setMapToolbarEnabled$MediaBrowserCompat$ItemReceiver setmaptoolbarenabled_mediabrowsercompat_itemreceiver = setMapToolbarEnabled.Companion;
        this.MediaBrowserCompat$CustomActionResultReceiver = setMapToolbarEnabled$MediaBrowserCompat$ItemReceiver.write(parcel.readString());
        this.MediaBrowserCompat$ItemReceiver = (parseEventDevice) parcel.readParcelable(parseEventDevice.class.getClassLoader());
        this.IconCompatParcelizer = (parseEventDevice) parcel.readParcelable(parseEventDevice.class.getClassLoader());
        this.read = (parseEventDevice) parcel.readParcelable(parseEventDevice.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaMetadataCompat);
        parcel.writeInt(this.write ? 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver.key);
        parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
        parcel.writeParcelable(this.read, i);
    }

    /* renamed from: o.parseCustomAttribute$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<parseCustomAttribute> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new parseCustomAttribute(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseCustomAttribute[i];
        }
    }
}
