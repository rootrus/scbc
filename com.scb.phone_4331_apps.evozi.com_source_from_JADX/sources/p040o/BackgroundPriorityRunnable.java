package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.BackgroundPriorityRunnable */
public class BackgroundPriorityRunnable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new BackgroundPriorityRunnable$MediaBrowserCompat$ItemReceiver();
    public String read;
    public List<getLevel> write;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(1);
    }
}
