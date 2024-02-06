package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.CubicCurveData */
public final class CubicCurveData {
    @SerializedName("bankCode")
    private final String read;
    @SerializedName("accountNo")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CubicCurveData)) {
            return false;
        }
        CubicCurveData cubicCurveData = (CubicCurveData) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) cubicCurveData.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) cubicCurveData.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOperatingAccountInfo(bankCode=");
        sb.append(this.read);
        sb.append(", accountNo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public CubicCurveData(String str, String str2) {
        onGetStartedClick.write((Object) str, "bankCode");
        onGetStartedClick.write((Object) str2, "accountNo");
        this.read = str;
        this.write = str2;
    }
}
