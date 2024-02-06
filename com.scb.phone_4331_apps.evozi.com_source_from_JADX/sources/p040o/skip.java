package p040o;

import com.github.mikephil.charting.charts.RadarChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p040o.isComplex;

/* renamed from: o.skip */
public final class skip extends subBoolean<RadarChart> {
    public skip(RadarChart radarChart) {
        super(radarChart);
    }

    /* access modifiers changed from: protected */
    public final isComplex.C13709 write(int i, float f, float f2) {
        int i2 = i;
        this.MediaBrowserCompat$CustomActionResultReceiver.clear();
        float f3 = ((RadarChart) this.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer().IconCompatParcelizer;
        float f4 = ((RadarChart) this.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer().MediaBrowserCompat$ItemReceiver;
        float AppCompatDelegateImpl$ListMenuDecorView = ((RadarChart) this.MediaBrowserCompat$ItemReceiver).AppCompatDelegateImpl$ListMenuDecorView();
        float backgroundResource = ((RadarChart) this.MediaBrowserCompat$ItemReceiver).setBackgroundResource();
        subShort4 read = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        int i3 = 0;
        while (i3 < ((addI32) ((RadarChart) this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$SearchResultReceiver()).read()) {
            subByte2 write = ((addI32) ((RadarChart) this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$SearchResultReceiver()).write(i3);
            addI8 MediaBrowserCompat$ItemReceiver = write.MediaBrowserCompat$ItemReceiver(i2);
            float f5 = (float) i2;
            subShort3.IconCompatParcelizer(((RadarChart) this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver(), (MediaBrowserCompat$ItemReceiver.IconCompatParcelizer - ((RadarChart) this.MediaBrowserCompat$ItemReceiver).AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer) * backgroundResource * f4, (AppCompatDelegateImpl$ListMenuDecorView * f5 * f3) + ((RadarChart) this.MediaBrowserCompat$ItemReceiver).setPopupCallback, read);
            List<isComplex.C13709> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            float f6 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            float f7 = read.MediaBrowserCompat$ItemReceiver;
            float f8 = read.MediaBrowserCompat$CustomActionResultReceiver;
            isComplex.C13709 r7 = r8;
            isComplex.C13709 r8 = new isComplex.C13709(f5, f6, f7, f8, i3, write.IconCompatParcelizer());
            list.add(r7);
            i3++;
            i2 = i;
        }
        List<isComplex.C13709> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        float MediaBrowserCompat$ItemReceiver2 = ((RadarChart) this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver(f, f2) / ((RadarChart) this.MediaBrowserCompat$ItemReceiver).setBackgroundResource();
        isComplex.C13709 r3 = null;
        float f9 = Float.MAX_VALUE;
        for (int i4 = 0; i4 < list2.size(); i4++) {
            isComplex.C13709 r5 = list2.get(i4);
            float abs = Math.abs(r5.MediaDescriptionCompat - MediaBrowserCompat$ItemReceiver2);
            if (abs < f9) {
                r3 = r5;
                f9 = abs;
            }
        }
        return r3;
    }
}
