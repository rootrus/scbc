package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.populateBinaryImagesList */
public final class populateBinaryImagesList implements Comparable<populateBinaryImagesList>, Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public List<CrashlyticsReportDataCapture> IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    private int read;
    private boolean write;

    /* renamed from: o.populateBinaryImagesList$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList.add((CrashlyticsReportDataCapture) CrashlyticsReportDataCapture.CREATOR.createFromParcel(parcel));
                readInt3--;
            }
            return new populateBinaryImagesList(readInt, readInt2, readString, z, arrayList);
        }

        public final Object[] newArray(int i) {
            return new populateBinaryImagesList[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof populateBinaryImagesList)) {
            return false;
        }
        populateBinaryImagesList populatebinaryimageslist = (populateBinaryImagesList) obj;
        return this.read == populatebinaryimageslist.read && this.MediaBrowserCompat$ItemReceiver == populatebinaryimageslist.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) populatebinaryimageslist.MediaBrowserCompat$CustomActionResultReceiver) && this.write == populatebinaryimageslist.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) populatebinaryimageslist.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.read;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.write;
        if (z) {
            z = true;
        }
        List<CrashlyticsReportDataCapture> list = this.IconCompatParcelizer;
        if (list != null) {
            i3 = list.hashCode();
        }
        return (((((((i * 31) + i2) * 31) + hashCode) * 31) + (z ? 1 : 0)) * 31) + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentRiskAssessmentQuestionDisplay(section=");
        sb.append(this.read);
        sb.append(", questionNumber=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", question=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", isDisplay=");
        sb.append(this.write);
        sb.append(", answers=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.read);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.write ? 1 : 0);
        List<CrashlyticsReportDataCapture> list = this.IconCompatParcelizer;
        parcel.writeInt(list.size());
        for (CrashlyticsReportDataCapture writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public populateBinaryImagesList(int i, int i2, String str, boolean z, List<CrashlyticsReportDataCapture> list) {
        onGetStartedClick.write((Object) str, "question");
        onGetStartedClick.write((Object) list, "answers");
        this.read = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = z;
        this.IconCompatParcelizer = list;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        populateBinaryImagesList populatebinaryimageslist = (populateBinaryImagesList) obj;
        onGetStartedClick.write((Object) populatebinaryimageslist, "other");
        return onGetStartedClick.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, populatebinaryimageslist.MediaBrowserCompat$ItemReceiver);
    }
}
