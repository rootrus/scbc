package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.isPowerConnected */
public final class isPowerConnected implements Parcelable {
    public static final write CREATOR = new write((byte) 0);
    public final List<performUpdateApp> MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isPowerConnected)) {
            return false;
        }
        isPowerConnected ispowerconnected = (isPowerConnected) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ispowerconnected.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ispowerconnected.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ispowerconnected.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ispowerconnected.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<performUpdateApp> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashCreditPowerLoanRequestResultDisplay(ncbConsent=");
        sb.append(this.write);
        sb.append(", monthlyIncome=");
        sb.append(this.read);
        sb.append(", repaymentAbility=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", product=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public isPowerConnected(String str, String str2, String str3, List<performUpdateApp> list) {
        onGetStartedClick.write((Object) list, "product");
        this.write = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public isPowerConnected(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r0 = r5.readString()
            java.lang.String r1 = r5.readString()
            java.lang.String r2 = r5.readString()
            o.performUpdateApp$IconCompatParcelizer r3 = p040o.performUpdateApp.CREATOR
            android.os.Parcelable$Creator r3 = (android.os.Parcelable.Creator) r3
            java.util.ArrayList r5 = r5.createTypedArrayList(r3)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0021
            o.HmlNationalIdActivity r5 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r5 = (java.util.List) r5
        L_0x0021:
            r4.<init>(r0, r1, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isPowerConnected.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeTypedList(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.isPowerConnected$write */
    public static final class write implements Parcelable.Creator<isPowerConnected> {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new isPowerConnected(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new isPowerConnected[i];
        }
    }
}
