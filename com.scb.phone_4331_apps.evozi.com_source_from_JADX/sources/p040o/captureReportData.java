package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.captureReportData */
public final class captureReportData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    /* renamed from: o.captureReportData$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new captureReportData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new captureReportData[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof captureReportData)) {
            return false;
        }
        captureReportData capturereportdata = (captureReportData) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) capturereportdata.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) capturereportdata.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) capturereportdata.write) && this.MediaBrowserCompat$ItemReceiver == capturereportdata.MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            z = true;
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FundFilterItemDisplay(id=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(", longDescription=");
        sb.append(this.write);
        sb.append(", requiredPeriod=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
    }

    public captureReportData(String str, String str2, String str3, boolean z) {
        onGetStartedClick.write((Object) str, Name.MARK);
        onGetStartedClick.write((Object) str2, "description");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public /* synthetic */ captureReportData(String str, String str2) {
        this(str, str2, (String) null, true);
    }
}
