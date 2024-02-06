package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.createBinaryImageJson */
public enum createBinaryImageJson implements Parcelable {
    TAKE_PHOTO,
    UPLOAD_PHOTO,
    UPLOAD_PDF,
    CANCEL;
    
    public static final write CREATOR = null;

    static {
        CREATOR = new write((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(ordinal());
    }

    /* renamed from: o.createBinaryImageJson$write */
    public static final class write implements Parcelable.Creator<createBinaryImageJson> {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return createBinaryImageJson.values()[parcel.readInt()];
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new createBinaryImageJson[i];
        }
    }
}
