package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver */
public class C3758xd990f62c implements Parcelable {
    public static final Parcelable.Creator<C3758xd990f62c> CREATOR = new Parcelable.Creator<C3758xd990f62c>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3758xd990f62c(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3758xd990f62c[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public int read;

    public final int describeContents() {
        return 0;
    }

    protected C3758xd990f62c(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.read);
    }

    public C3758xd990f62c(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = "normal";
    }

    public C3758xd990f62c(String str, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = "normal";
        this.read = i;
    }
}
