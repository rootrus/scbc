package p040o;

import android.graphics.Canvas;
import android.graphics.Typeface;
import com.github.mikephil.charting.charts.RadarChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.C10821Element;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subMatrix4f */
public final class subMatrix4f extends subLong4 {
    private RadarChart MediaBrowserCompat$SearchResultReceiver;

    public subMatrix4f(rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer, C10821Element.DataType dataType, RadarChart radarChart) {
        super(iconCompatParcelizer, dataType);
        this.MediaBrowserCompat$SearchResultReceiver = radarChart;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Canvas canvas) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper && this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver) {
            subShort4 read = subShort4.read(0.5f, 0.25f);
            this.read.setTypeface((Typeface) null);
            this.read.setTextSize(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver());
            this.read.setColor(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
            float AppCompatDelegateImpl$ListMenuDecorView = this.MediaBrowserCompat$SearchResultReceiver.AppCompatDelegateImpl$ListMenuDecorView();
            float backgroundResource = this.MediaBrowserCompat$SearchResultReceiver.setBackgroundResource();
            subShort4 MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            subShort4 read2 = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            for (int i = 0; i < ((subFloat3) ((addI32) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver()).MediaBrowserCompat$ItemReceiver()).PlaybackStateCompat$CustomAction(); i++) {
                float f = (float) i;
                String MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$ItemReceiver(f);
                subShort3.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, (this.MediaBrowserCompat$SearchResultReceiver.AppCompatDelegateImpl$ListMenuDecorView.write * backgroundResource) + (((float) this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction) / 2.0f), ((f * AppCompatDelegateImpl$ListMenuDecorView) + this.MediaBrowserCompat$SearchResultReceiver.setPopupCallback) % 360.0f, read2);
                write(canvas, MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver - (((float) this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor) / 2.0f), read, BitmapDescriptorFactory.HUE_RED);
            }
            subShort4.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
            subShort4.IconCompatParcelizer(read2);
            subShort4.IconCompatParcelizer(read);
        }
    }
}
