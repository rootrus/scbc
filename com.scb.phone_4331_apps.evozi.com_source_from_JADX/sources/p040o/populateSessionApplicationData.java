package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.populateSessionApplicationData */
public final class populateSessionApplicationData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public List<captureReportData> IconCompatParcelizer;
    public String write;

    /* renamed from: o.populateSessionApplicationData$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            onGetStartedClick.write((Object) parcel, "in");
            String readString = parcel.readString();
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
            return new populateSessionApplicationData(readString, arrayList);
        }

        public final Object[] newArray(int i) {
            return new populateSessionApplicationData[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
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

    public populateSessionApplicationData(String str, List<captureReportData> list) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        this.write = str;
        this.IconCompatParcelizer = list;
    }
}
