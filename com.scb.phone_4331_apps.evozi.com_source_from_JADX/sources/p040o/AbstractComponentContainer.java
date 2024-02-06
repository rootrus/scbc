package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.AbstractComponentContainer */
public final class AbstractComponentContainer extends AnalyticsConnectorRegistrar {
    public static final Parcelable.Creator<AbstractComponentContainer> CREATOR = new Parcelable.Creator<AbstractComponentContainer>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AbstractComponentContainer(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AbstractComponentContainer[i];
        }
    };
    public String AppCompatActivity;
    public String AppCompatDialogFragment;
    public String AppCompatViewInflater;
    public String setExpandedFormat;

    public final int describeContents() {
        return 0;
    }

    public AbstractComponentContainer() {
    }

    protected AbstractComponentContainer(Parcel parcel) {
        super(parcel);
        this.AppCompatActivity = parcel.readString();
        this.AppCompatDialogFragment = parcel.readString();
        this.AppCompatViewInflater = parcel.readString();
        this.setExpandedFormat = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.AppCompatActivity);
        parcel.writeString(this.AppCompatDialogFragment);
        parcel.writeString(this.AppCompatViewInflater);
        parcel.writeString(this.setExpandedFormat);
    }
}
