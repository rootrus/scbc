package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getStartDelayProgress */
public final class getStartDelayProgress {
    @SerializedName("applicationUuid")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("operatingAccount")
    private final CubicCurveData write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStartDelayProgress)) {
            return false;
        }
        getStartDelayProgress getstartdelayprogress = (getStartDelayProgress) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getstartdelayprogress.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getstartdelayprogress.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        CubicCurveData cubicCurveData = this.write;
        if (cubicCurveData != null) {
            i = cubicCurveData.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlAddOperatingAccountRequest(applicationUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", operatingAccount=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getStartDelayProgress(String str, CubicCurveData cubicCurveData) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) cubicCurveData, "operatingAccount");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = cubicCurveData;
    }
}
