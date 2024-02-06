package p040o;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;
import p040o.isComplex;

/* renamed from: o.subBoolean */
public abstract class subBoolean<T extends PieRadarChartBase> implements getImageDimensionMismatch {
    protected List<isComplex.C13709> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
    protected T MediaBrowserCompat$ItemReceiver;

    /* access modifiers changed from: protected */
    public abstract isComplex.C13709 write(int i, float f, float f2);

    public subBoolean(T t) {
        this.MediaBrowserCompat$ItemReceiver = t;
    }

    public final isComplex.C13709 read(float f, float f2) {
        if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(f, f2) > this.MediaBrowserCompat$ItemReceiver.Keep()) {
            return null;
        }
        float write = this.MediaBrowserCompat$ItemReceiver.write(f, f2);
        T t = this.MediaBrowserCompat$ItemReceiver;
        if (t instanceof PieChart) {
            write /= t.IconCompatParcelizer().MediaBrowserCompat$ItemReceiver;
        }
        int IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(write);
        if (IconCompatParcelizer < 0 || IconCompatParcelizer >= this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver().MediaBrowserCompat$ItemReceiver().PlaybackStateCompat$CustomAction()) {
            return null;
        }
        return write(IconCompatParcelizer, f, f2);
    }
}
