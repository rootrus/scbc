package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getMinidumpFile */
public class getMinidumpFile implements Parcelable {
    public static final Parcelable.Creator<getMinidumpFile> CREATOR = new Parcelable.Creator<getMinidumpFile>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getMinidumpFile(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getMinidumpFile[i];
        }
    };
    public String read;
    public String write;

    public int describeContents() {
        return 0;
    }

    private getMinidumpFile() {
    }

    protected getMinidumpFile(Parcel parcel) {
        this.write = parcel.readString();
        this.read = parcel.readString();
    }

    public static getMinidumpFile IconCompatParcelizer() {
        return new getMinidumpFile();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeString(this.read);
    }
}
