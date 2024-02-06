package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setIdentifierFromUtf8Bytes */
public final class setIdentifierFromUtf8Bytes implements Parcelable {
    public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
    public final boolean IconCompatParcelizer;
    private final String MediaBrowserCompat$ItemReceiver;
    private final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public setIdentifierFromUtf8Bytes(String str, String str2, String str3, boolean z) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.IconCompatParcelizer = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public setIdentifierFromUtf8Bytes(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readByte() != 1 ? false : true);
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
    }

    /* renamed from: o.setIdentifierFromUtf8Bytes$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<setIdentifierFromUtf8Bytes> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new setIdentifierFromUtf8Bytes(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setIdentifierFromUtf8Bytes[i];
        }
    }
}
