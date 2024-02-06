package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event$Builder$MediaBrowserCompat$ItemReceiver */
public final class C3071x65de3bd5 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3072xc5b47fa2();
    public final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final String read;
    public final double write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3071x65de3bd5)) {
            return false;
        }
        C3071x65de3bd5 autoValue_CrashlyticsReport_Session_Event$Builder$MediaBrowserCompat$ItemReceiver = (C3071x65de3bd5) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) autoValue_CrashlyticsReport_Session_Event$Builder$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) autoValue_CrashlyticsReport_Session_Event$Builder$MediaBrowserCompat$ItemReceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) autoValue_CrashlyticsReport_Session_Event$Builder$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver) && Double.compare(this.write, autoValue_CrashlyticsReport_Session_Event$Builder$MediaBrowserCompat$ItemReceiver.write) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) autoValue_CrashlyticsReport_Session_Event$Builder$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.write);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxRate(conversionType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", fromCurrency=");
        sb.append(this.read);
        sb.append(", toCurrency=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", rate=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeDouble(this.write);
        parcel.writeString(this.IconCompatParcelizer);
    }

    public C3071x65de3bd5(String str, String str2, String str3, double d, String str4) {
        onGetStartedClick.write((Object) str, "conversionType");
        onGetStartedClick.write((Object) str2, "fromCurrency");
        onGetStartedClick.write((Object) str3, "toCurrency");
        onGetStartedClick.write((Object) str4, "description");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.write = d;
        this.IconCompatParcelizer = str4;
    }
}
