package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: o.populateEventApplicationData */
public final class populateEventApplicationData implements Comparable<populateEventApplicationData>, Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    private int MediaBrowserCompat$CustomActionResultReceiver;
    public String read;
    public int write;

    /* renamed from: o.populateEventApplicationData$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new populateEventApplicationData(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new populateEventApplicationData[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof populateEventApplicationData)) {
            return false;
        }
        populateEventApplicationData populateeventapplicationdata = (populateEventApplicationData) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == populateeventapplicationdata.MediaBrowserCompat$CustomActionResultReceiver && this.write == populateeventapplicationdata.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) populateeventapplicationdata.read);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = this.write;
        String str = this.read;
        return (((i * 31) + i2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentRiskAssessmentQuestionSummaryDisplay(section=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", questionNumber=");
        sb.append(this.write);
        sb.append(", summary=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.write);
        parcel.writeString(this.read);
    }

    public populateEventApplicationData(int i, int i2, String str) {
        onGetStartedClick.write((Object) str, ErrorBundle.SUMMARY_ENTRY);
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.write = i2;
        this.read = str;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        populateEventApplicationData populateeventapplicationdata = (populateEventApplicationData) obj;
        onGetStartedClick.write((Object) populateeventapplicationdata, "other");
        return onGetStartedClick.IconCompatParcelizer(this.write, populateeventapplicationdata.write);
    }
}
