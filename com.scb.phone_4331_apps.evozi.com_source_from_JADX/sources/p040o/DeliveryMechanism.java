package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.DeliveryMechanism */
public final class DeliveryMechanism extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<DeliveryMechanism> CREATOR = new Parcelable.Creator<DeliveryMechanism>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DeliveryMechanism(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DeliveryMechanism[i];
        }
    };
    public List<DataTransportState> IconCompatParcelizer;

    public final int describeContents() {
        return 0;
    }

    public DeliveryMechanism() {
    }

    public DeliveryMechanism(List<DataTransportState> list) {
        this.IconCompatParcelizer = list;
    }

    protected DeliveryMechanism(Parcel parcel) {
        this.IconCompatParcelizer = parcel.createTypedArrayList(DataTransportState.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.IconCompatParcelizer);
    }
}
