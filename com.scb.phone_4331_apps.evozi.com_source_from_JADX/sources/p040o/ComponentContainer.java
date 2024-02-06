package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.ComponentContainer */
public final class ComponentContainer extends C4416factory implements Parcelable {
    public static final Parcelable.Creator<ComponentContainer> CREATOR = new Parcelable.Creator<ComponentContainer>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ComponentContainer(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ComponentContainer[i];
        }
    };
    public String Keep;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f2689x50fd9e4a;
    public boolean MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    public List<validateInterface> MediaSessionCompat$Token;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.MediaSessionCompat$ResultReceiverWrapper ? (byte) 1 : 0);
        parcel.writeTypedList(this.MediaSessionCompat$Token);
        parcel.writeByte(this.MediaSessionCompat$QueueItem ? (byte) 1 : 0);
        parcel.writeByte(this.f2689x50fd9e4a ? (byte) 1 : 0);
        parcel.writeString(this.Keep);
    }

    public ComponentContainer() {
    }

    protected ComponentContainer(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readByte() != 0;
        this.MediaSessionCompat$Token = parcel.createTypedArrayList(validateInterface.CREATOR);
        this.MediaSessionCompat$QueueItem = parcel.readByte() != 0;
        this.f2689x50fd9e4a = parcel.readByte() == 0 ? false : z;
        this.Keep = parcel.readString();
    }
}
