package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.ensureBackgroundStateListenerRegistered */
public final class ensureBackgroundStateListenerRegistered implements Parcelable {
    public static final Parcelable.Creator<ensureBackgroundStateListenerRegistered> CREATOR = new Parcelable.Creator<ensureBackgroundStateListenerRegistered>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ensureBackgroundStateListenerRegistered(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ensureBackgroundStateListenerRegistered[i];
        }
    };
    public List<String> IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public DataCollectionDefaultChange MediaBrowserCompat$ItemReceiver;
    public List<String> MediaDescriptionCompat;
    public String RatingCompat;
    public boolean read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public ensureBackgroundStateListenerRegistered() {
    }

    protected ensureBackgroundStateListenerRegistered(Parcel parcel) {
        this.read = parcel.readByte() != 0;
        this.MediaBrowserCompat$ItemReceiver = (DataCollectionDefaultChange) parcel.readParcelable(DataCollectionDefaultChange.class.getClassLoader());
        this.RatingCompat = parcel.readString();
        this.write = parcel.readString();
        this.MediaDescriptionCompat = parcel.readArrayList(String.class.getClassLoader());
        this.IconCompatParcelizer = parcel.readArrayList(String.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.read ? (byte) 1 : 0);
        parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.write);
        parcel.writeList(this.MediaDescriptionCompat);
        parcel.writeList(this.IconCompatParcelizer);
    }
}
