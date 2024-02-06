package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.RadarChart */
public final class RadarChart {
    @SerializedName("countryList")
    public final List<setEntryLabelTextSize> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("tcAcceptRequired")
    public final int read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarChart)) {
            return false;
        }
        RadarChart radarChart = (RadarChart) obj;
        return this.read == radarChart.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) radarChart.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        int i = this.read;
        List<setEntryLabelTextSize> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        return (i * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittanceLandingResponseEntity(tcAcceptRequired=");
        sb.append(this.read);
        sb.append(", countryList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private RadarChart(int i, List<setEntryLabelTextSize> list) {
        this.read = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public static /* synthetic */ RadarChart write(RadarChart radarChart, List list) {
        return new RadarChart(radarChart.read, list);
    }
}
