package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.doOpenSession */
public final class doOpenSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = new doOpenSession$MediaBrowserCompat$CustomActionResultReceiver();
    public String IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public List<doCloseSessions> MediaBrowserCompat$ItemReceiver;
    public int read;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
        List<doCloseSessions> list = this.MediaBrowserCompat$ItemReceiver;
        parcel.writeInt(list.size());
        for (doCloseSessions writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public doOpenSession(int i, String str, int i2, List<doCloseSessions> list) {
        onGetStartedClick.write((Object) str, "accountName");
        onGetStartedClick.write((Object) list, "subList");
        this.read = i;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
