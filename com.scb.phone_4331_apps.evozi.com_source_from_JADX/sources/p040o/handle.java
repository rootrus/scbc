package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.handle */
public final class handle implements Parcelable {
    public static final Parcelable.Creator<handle> CREATOR = new Parcelable.Creator<handle>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new handle(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new handle[i];
        }
    };
    public Long IconCompatParcelizer;

    public final int describeContents() {
        return 0;
    }

    public handle(Long l) {
        this.IconCompatParcelizer = l;
    }

    protected handle(Parcel parcel) {
        if (parcel.readByte() == 0) {
            this.IconCompatParcelizer = null;
        } else {
            this.IconCompatParcelizer = Long.valueOf(parcel.readLong());
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.IconCompatParcelizer == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeLong(this.IconCompatParcelizer.longValue());
    }
}
