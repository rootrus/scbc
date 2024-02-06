package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.ReportFragment;
import p040o.isCancelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator<ParcelImpl>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelImpl[i];
        }
    };
    private final ReportFragment.write IconCompatParcelizer;

    public int describeContents() {
        return 0;
    }

    protected ParcelImpl(Parcel parcel) {
        this.IconCompatParcelizer = new isCancelable(parcel).MediaDescriptionCompat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        new isCancelable(parcel).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }
}
