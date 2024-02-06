package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.FirebaseApiNotAvailableException */
public final class FirebaseApiNotAvailableException implements Parcelable {
    public static final Parcelable.Creator<FirebaseApiNotAvailableException> CREATOR = new Parcelable.Creator<FirebaseApiNotAvailableException>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FirebaseApiNotAvailableException(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FirebaseApiNotAvailableException[i];
        }
    };
    public Integer IconCompatParcelizer;
    private lambdaFactory$ MediaBrowserCompat$CustomActionResultReceiver;
    public List<FirebaseApp> MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public FirebaseApiNotAvailableException(List<FirebaseApp> list, Integer num, lambdaFactory$ lambdafactory_) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.IconCompatParcelizer = num;
        this.MediaBrowserCompat$CustomActionResultReceiver = lambdafactory_;
    }

    public FirebaseApiNotAvailableException() {
    }

    protected FirebaseApiNotAvailableException(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(FirebaseApp.CREATOR);
        if (parcel.readByte() == 0) {
            this.IconCompatParcelizer = null;
        } else {
            this.IconCompatParcelizer = Integer.valueOf(parcel.readInt());
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = (lambdaFactory$) parcel.readParcelable(onDowngrade.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
        if (this.IconCompatParcelizer == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.IconCompatParcelizer.intValue());
        }
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
    }
}
