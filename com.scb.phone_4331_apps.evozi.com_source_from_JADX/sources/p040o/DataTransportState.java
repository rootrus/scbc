package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.DataTransportState */
public final class DataTransportState extends waitForDataCollectionPermission implements Parcelable {
    public static final Parcelable.Creator<DataTransportState> CREATOR = new Parcelable.Creator<DataTransportState>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DataTransportState(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DataTransportState[i];
        }
    };
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaSessionCompat$ResultReceiverWrapper;

    public final int describeContents() {
        return 0;
    }

    public DataTransportState(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        super(i, str, str2, str3, str4, str5, str6, str7, str8);
        this.MediaBrowserCompat$SearchResultReceiver = str9;
        this.MediaSessionCompat$ResultReceiverWrapper = str10;
    }

    protected DataTransportState(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
    }
}
