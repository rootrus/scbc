package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.CrashlyticsReportDataCapture */
public final class CrashlyticsReportDataCapture implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CrashlyticsReportDataCapture$MediaBrowserCompat$ItemReceiver();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportDataCapture)) {
            return false;
        }
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = (CrashlyticsReportDataCapture) obj;
        return this.MediaBrowserCompat$ItemReceiver == crashlyticsReportDataCapture.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) crashlyticsReportDataCapture.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) crashlyticsReportDataCapture.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            z = true;
        }
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentRiskAssessmentAnswerDisplay(isSelected=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", choice=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", score=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public CrashlyticsReportDataCapture(boolean z, String str, String str2) {
        onGetStartedClick.write((Object) str, "choice");
        onGetStartedClick.write((Object) str2, "score");
        this.MediaBrowserCompat$ItemReceiver = z;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
