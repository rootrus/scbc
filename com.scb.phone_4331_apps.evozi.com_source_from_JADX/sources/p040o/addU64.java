package p040o;

import com.github.mikephil.charting.charts.PieChart;
import java.text.DecimalFormat;

/* renamed from: o.addU64 */
public class addU64 extends addU16 {
    private PieChart IconCompatParcelizer;
    public DecimalFormat MediaBrowserCompat$ItemReceiver;

    public addU64() {
        this.MediaBrowserCompat$ItemReceiver = new DecimalFormat("###,###,##0.0");
    }

    public addU64(PieChart pieChart) {
        this();
        this.IconCompatParcelizer = pieChart;
    }

    public String MediaBrowserCompat$ItemReceiver(float f) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$ItemReceiver.format((double) f));
        sb.append(" %");
        return sb.toString();
    }

    public final String IconCompatParcelizer(float f) {
        PieChart pieChart = this.IconCompatParcelizer;
        if (pieChart == null || !pieChart.setIcon) {
            return this.MediaBrowserCompat$ItemReceiver.format((double) f);
        }
        return MediaBrowserCompat$ItemReceiver(f);
    }
}
