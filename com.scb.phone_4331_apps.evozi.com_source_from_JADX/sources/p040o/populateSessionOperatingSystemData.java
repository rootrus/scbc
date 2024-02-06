package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.populateSessionOperatingSystemData */
public final class populateSessionOperatingSystemData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C5151xf3b1a0bb();
    public List<captureReportData> IconCompatParcelizer;
    public List<String> MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public populateSessionOperatingSystemData() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeStringList(this.MediaBrowserCompat$CustomActionResultReceiver);
        List<captureReportData> list = this.IconCompatParcelizer;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (captureReportData writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public populateSessionOperatingSystemData(String str, String str2, List<String> list, List<captureReportData> list2) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.IconCompatParcelizer = list2;
    }

    private /* synthetic */ populateSessionOperatingSystemData(byte b) {
        this("", "", new ArrayList(), HmlNationalIdActivity.IconCompatParcelizer);
    }
}
