package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getProjectId */
public final class getProjectId implements Parcelable {
    public static final Parcelable.Creator<getProjectId> CREATOR = new Parcelable.Creator<getProjectId>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getProjectId(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getProjectId[i];
        }
    };
    public String IconCompatParcelizer;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public getProjectId() {
    }

    protected getProjectId(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.write = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
    }
}
