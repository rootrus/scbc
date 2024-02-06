package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.clearLog */
public final class clearLog implements Parcelable {
    public static final write CREATOR = new write((byte) 0);
    public final String IconCompatParcelizer;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public clearLog(String str, String str2) {
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public clearLog(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
    }

    /* renamed from: o.clearLog$write */
    public static final class write implements Parcelable.Creator<clearLog> {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new clearLog(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new clearLog[i];
        }
    }
}
