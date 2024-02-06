package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.DataCollectionDefaultChange */
public class DataCollectionDefaultChange implements Parcelable {
    public static final Parcelable.Creator<DataCollectionDefaultChange> CREATOR = new Parcelable.Creator<DataCollectionDefaultChange>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DataCollectionDefaultChange(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DataCollectionDefaultChange[i];
        }
    };
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private long MediaBrowserCompat$ItemReceiver;

    public int describeContents() {
        return 0;
    }

    public DataCollectionDefaultChange(long j, long j2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        this.MediaBrowserCompat$ItemReceiver = j2;
    }

    protected DataCollectionDefaultChange(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readLong();
        this.MediaBrowserCompat$ItemReceiver = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeLong(this.MediaBrowserCompat$ItemReceiver);
    }
}
