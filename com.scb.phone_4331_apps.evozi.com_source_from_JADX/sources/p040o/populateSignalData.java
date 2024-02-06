package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.populateSignalData */
public final class populateSignalData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public List<captureReportData> read;

    /* renamed from: o.populateSignalData$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            onGetStartedClick.write((Object) parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((captureReportData) captureReportData.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new populateSignalData(readString, readString2, arrayList);
        }

        public final Object[] newArray(int i) {
            return new populateSignalData[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        List<captureReportData> list = this.read;
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

    public populateSignalData(String str, String str2, List<captureReportData> list) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "hint");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = list;
    }
}
