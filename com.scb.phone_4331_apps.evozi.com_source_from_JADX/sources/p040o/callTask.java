package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.callTask */
public class callTask extends ForwardingFuture implements Parcelable {
    public static final Parcelable.Creator<callTask> CREATOR = new Parcelable.Creator<callTask>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new callTask(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new callTask[i];
        }
    };
    public boolean MediaBrowserCompat$ItemReceiver = false;

    public int describeContents() {
        return 0;
    }

    public callTask() {
        super(CrashlyticsReportJsonTransform$$Lambda$1.SEPARATOR);
    }

    public callTask(boolean z) {
        super(CrashlyticsReportJsonTransform$$Lambda$1.REVAMP_SEPARATOR);
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    protected callTask(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt() == 1 ? true : z;
    }

    public final void write(Parcel parcel, int i) {
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
    }
}
