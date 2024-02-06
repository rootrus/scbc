package p040o;

import com.github.mikephil.charting.charts.PieChart;
import java.text.DecimalFormat;

/* renamed from: o.FragmentBuilder_BindDummyAndroid41Fragment */
public final class FragmentBuilder_BindDummyAndroid41Fragment extends addU64 {
    public FragmentBuilder_BindDummyAndroid41Fragment(PieChart pieChart, DecimalFormat decimalFormat) {
        super(pieChart);
        this.MediaBrowserCompat$ItemReceiver = decimalFormat;
    }

    public final String MediaBrowserCompat$ItemReceiver(float f) {
        if (f < 12.0f) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$ItemReceiver.format((double) f));
        sb.append("%");
        return sb.toString();
    }
}
