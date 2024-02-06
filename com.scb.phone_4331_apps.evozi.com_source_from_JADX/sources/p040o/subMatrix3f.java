package p040o;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.charts.RadarChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subMatrix3f */
public final class subMatrix3f extends subShort2 {
    private RadarChart MediaDescriptionCompat;
    private Path RatingCompat = new Path();

    public subMatrix3f(rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer, addToPack addtopack, RadarChart radarChart) {
        super(iconCompatParcelizer, addtopack);
        this.MediaDescriptionCompat = radarChart;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(float f, float f2) {
        double d;
        int i;
        int i2 = this.IconCompatParcelizer.MediaDescriptionCompat;
        double abs = (double) Math.abs(f2 - f);
        if (i2 == 0 || abs <= 0.0d || Double.isInfinite(abs)) {
            this.IconCompatParcelizer.MediaMetadataCompat = new float[0];
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = new float[0];
            this.IconCompatParcelizer.MediaBrowserCompat$MediaItem = 0;
            return;
        }
        double read = (double) subShort3.read(abs / ((double) i2));
        double read2 = (double) subShort3.read(Math.pow(10.0d, (double) ((int) Math.log10(read))));
        if (((int) (read / read2)) > 5) {
            read = Math.floor(read2 * 10.0d);
        }
        int i3 = (read > 0.0d ? 1 : (read == 0.0d ? 0 : -1));
        double ceil = i3 == 0 ? 0.0d : Math.ceil(((double) f) / read) * read;
        if (i3 == 0) {
            d = 0.0d;
        } else {
            d = subShort3.MediaBrowserCompat$CustomActionResultReceiver(Math.floor(((double) f2) / read) * read);
        }
        if (i3 != 0) {
            i = 0;
            for (double d2 = ceil; d2 <= d; d2 += read) {
                i++;
            }
        } else {
            i = 0;
        }
        int i4 = i + 1;
        this.IconCompatParcelizer.MediaBrowserCompat$MediaItem = i4;
        if (this.IconCompatParcelizer.MediaMetadataCompat.length < i4) {
            this.IconCompatParcelizer.MediaMetadataCompat = new float[i4];
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (ceil == 0.0d) {
                ceil = 0.0d;
            }
            this.IconCompatParcelizer.MediaMetadataCompat[i5] = (float) ceil;
            ceil += read;
        }
        if (read < 1.0d) {
            this.IconCompatParcelizer.read = (int) Math.ceil(-Math.log10(read));
        } else {
            this.IconCompatParcelizer.read = 0;
        }
        this.IconCompatParcelizer.IconCompatParcelizer = this.IconCompatParcelizer.MediaMetadataCompat[0];
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaMetadataCompat[i4 - 1];
        this.IconCompatParcelizer.write = Math.abs(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver - this.IconCompatParcelizer.IconCompatParcelizer);
    }

    public final void MediaBrowserCompat$ItemReceiver(Canvas canvas) {
        String str;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper && this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver) {
            this.read.setTypeface((Typeface) null);
            this.read.setTextSize(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver());
            this.read.setColor(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
            subShort4 MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
            subShort4 read = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            float backgroundResource = this.MediaDescriptionCompat.setBackgroundResource();
            int i = this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor ? this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem : this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem - 1;
            for (int i2 = !this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction; i2 < i; i2++) {
                subShort3.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, (this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat[i2] - this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) * backgroundResource, this.MediaDescriptionCompat.setPopupCallback, read);
                addToPack addtopack = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (i2 < 0 || i2 >= addtopack.MediaMetadataCompat.length) {
                    str = "";
                } else {
                    str = addtopack.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$ItemReceiver(addtopack.MediaMetadataCompat[i2]);
                }
                canvas.drawText(str, read.MediaBrowserCompat$ItemReceiver + 10.0f, read.MediaBrowserCompat$CustomActionResultReceiver, this.read);
            }
            subShort4.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
            subShort4.IconCompatParcelizer(read);
        }
    }

    public final void write(Canvas canvas) {
        List<createFieldPack> list = this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
        if (list != null) {
            float AppCompatDelegateImpl$ListMenuDecorView = this.MediaDescriptionCompat.AppCompatDelegateImpl$ListMenuDecorView();
            float backgroundResource = this.MediaDescriptionCompat.setBackgroundResource();
            subShort4 MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
            subShort4 read = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).MediaSessionCompat$ResultReceiverWrapper) {
                    this.write.setColor(0);
                    this.write.setPathEffect((PathEffect) null);
                    this.write.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
                    float f = this.MediaDescriptionCompat.AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer;
                    Path path = this.RatingCompat;
                    path.reset();
                    for (int i2 = 0; i2 < ((subFloat3) ((addI32) this.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver()).MediaBrowserCompat$ItemReceiver()).PlaybackStateCompat$CustomAction(); i2++) {
                        subShort3.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, (BitmapDescriptorFactory.HUE_RED - f) * backgroundResource, (((float) i2) * AppCompatDelegateImpl$ListMenuDecorView) + this.MediaDescriptionCompat.setPopupCallback, read);
                        if (i2 == 0) {
                            path.moveTo(read.MediaBrowserCompat$ItemReceiver, read.MediaBrowserCompat$CustomActionResultReceiver);
                        } else {
                            path.lineTo(read.MediaBrowserCompat$ItemReceiver, read.MediaBrowserCompat$CustomActionResultReceiver);
                        }
                    }
                    path.close();
                    canvas.drawPath(path, this.write);
                }
            }
            subShort4.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
            subShort4.IconCompatParcelizer(read);
        }
    }
}
