package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.populateExecutionData */
public final class populateExecutionData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public final List<populateEventApplicationData> MediaBrowserCompat$ItemReceiver;
    public List<populateBinaryImagesList> read;

    /* renamed from: o.populateExecutionData$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((populateBinaryImagesList) populateBinaryImagesList.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add((populateEventApplicationData) populateEventApplicationData.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            return new populateExecutionData(arrayList, arrayList2);
        }

        public final Object[] newArray(int i) {
            return new populateExecutionData[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof populateExecutionData)) {
            return false;
        }
        populateExecutionData populateexecutiondata = (populateExecutionData) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) populateexecutiondata.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) populateexecutiondata.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<populateBinaryImagesList> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<populateEventApplicationData> list2 = this.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RiskQuestionnaireDisplay(assessments=");
        sb.append(this.read);
        sb.append(", summaries=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        List<populateBinaryImagesList> list = this.read;
        parcel.writeInt(list.size());
        for (populateBinaryImagesList writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        List<populateEventApplicationData> list2 = this.MediaBrowserCompat$ItemReceiver;
        parcel.writeInt(list2.size());
        for (populateEventApplicationData writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
    }

    public populateExecutionData(List<populateBinaryImagesList> list, List<populateEventApplicationData> list2) {
        onGetStartedClick.write((Object) list, "assessments");
        onGetStartedClick.write((Object) list2, "summaries");
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
    }
}
