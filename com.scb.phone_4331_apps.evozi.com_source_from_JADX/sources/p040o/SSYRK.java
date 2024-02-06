package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: o.SSYRK */
public final class SSYRK extends View.BaseSavedState {
    public static final Parcelable.Creator<SSYRK> CREATOR = new Parcelable.Creator<SSYRK>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SSYRK(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SSYRK[i];
        }
    };
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public int read;
    public int write;

    /* synthetic */ SSYRK(Parcel parcel, byte b) {
        this(parcel);
    }

    public SSYRK(Parcelable parcelable) {
        super(parcelable);
    }

    private SSYRK(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt();
        this.write = parcel.readInt();
        this.read = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.write);
        parcel.writeInt(this.read);
    }
}
