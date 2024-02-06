package p040o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.RadarChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.isComplex;
import p040o.rsnAllocationRead1D;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subInt3 */
public final class subInt3 extends subLong2 {
    private Path MediaBrowserCompat$SearchResultReceiver = new Path();
    private Paint MediaDescriptionCompat;
    private Path MediaMetadataCompat = new Path();
    private Paint RatingCompat;
    private RadarChart read;

    public subInt3(RadarChart radarChart, rsnAllocationRead1D.write write, rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer) {
        super(write, iconCompatParcelizer);
        this.read = radarChart;
        this.MediaBrowserCompat$ItemReceiver = new Paint(1);
        this.MediaBrowserCompat$ItemReceiver.setStyle(Paint.Style.STROKE);
        this.MediaBrowserCompat$ItemReceiver.setStrokeWidth(2.0f);
        this.MediaBrowserCompat$ItemReceiver.setColor(Color.rgb(255, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, 115));
        Paint paint = new Paint(1);
        this.RatingCompat = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.MediaDescriptionCompat = new Paint(1);
    }

    public final void IconCompatParcelizer(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3 = canvas;
        addI32 addi32 = (addI32) this.read.MediaBrowserCompat$SearchResultReceiver();
        int PlaybackStateCompat$CustomAction = ((subFloat3) addi32.MediaBrowserCompat$ItemReceiver()).PlaybackStateCompat$CustomAction();
        Iterator it = addi32.write().iterator();
        while (it.hasNext()) {
            subFloat3 subfloat3 = (subFloat3) it.next();
            if (subfloat3.MediaSessionCompat$ResultReceiverWrapper()) {
                float f = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                float f2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                float AppCompatDelegateImpl$ListMenuDecorView = this.read.AppCompatDelegateImpl$ListMenuDecorView();
                float backgroundResource = this.read.setBackgroundResource();
                subShort4 MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver();
                subShort4 read2 = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                Path path = this.MediaMetadataCompat;
                path.reset();
                int i = 0;
                boolean z = false;
                while (i < subfloat3.PlaybackStateCompat$CustomAction()) {
                    this.write.setColor(subfloat3.MediaBrowserCompat$CustomActionResultReceiver(i));
                    Iterator it2 = it;
                    subShort3.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, (((addU8) subfloat3.MediaBrowserCompat$ItemReceiver(i)).IconCompatParcelizer - this.read.AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer) * backgroundResource * f2, (((float) i) * AppCompatDelegateImpl$ListMenuDecorView * f) + this.read.setPopupCallback, read2);
                    if (!Float.isNaN(read2.MediaBrowserCompat$ItemReceiver)) {
                        if (!z) {
                            path.moveTo(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver);
                            z = true;
                        } else {
                            path.lineTo(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver);
                        }
                    }
                    i++;
                    Canvas canvas4 = canvas;
                    it = it2;
                }
                Iterator it3 = it;
                if (subfloat3.PlaybackStateCompat$CustomAction() > PlaybackStateCompat$CustomAction) {
                    path.lineTo(MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                }
                path.close();
                if (subfloat3.setCheckable()) {
                    Drawable AppCompatDelegateImpl$ListMenuDecorView2 = subfloat3.AppCompatDelegateImpl$ListMenuDecorView();
                    if (AppCompatDelegateImpl$ListMenuDecorView2 != null) {
                        canvas2 = canvas;
                        read(canvas2, path, AppCompatDelegateImpl$ListMenuDecorView2);
                    } else {
                        canvas2 = canvas;
                        write(canvas2, path, subfloat3.setContentView(), subfloat3.AppCompatDialogFragment());
                    }
                } else {
                    canvas2 = canvas;
                }
                this.write.setStrokeWidth(subfloat3.setBackgroundResource());
                this.write.setStyle(Paint.Style.STROKE);
                if (!subfloat3.setCheckable() || subfloat3.AppCompatDialogFragment() < 255) {
                    canvas2.drawPath(path, this.write);
                }
                subShort4.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
                subShort4.IconCompatParcelizer(read2);
                Canvas canvas5 = canvas2;
                it = it3;
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(Canvas canvas) {
        float f;
        int i;
        subShort4 subshort4;
        float f2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        float f3 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        float AppCompatDelegateImpl$ListMenuDecorView = this.read.AppCompatDelegateImpl$ListMenuDecorView();
        float backgroundResource = this.read.setBackgroundResource();
        subShort4 MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver();
        subShort4 read2 = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        subShort4 read3 = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float read4 = subShort3.read(5.0f);
        int i2 = 0;
        while (i2 < ((addI32) this.read.MediaBrowserCompat$SearchResultReceiver()).read()) {
            subFloat3 subfloat3 = (subFloat3) ((addI32) this.read.MediaBrowserCompat$SearchResultReceiver()).write(i2);
            if (subfloat3.MediaSessionCompat$ResultReceiverWrapper() && (subfloat3.ParcelableVolumeInfo() || subfloat3.MediaSessionCompat$Token())) {
                MediaBrowserCompat$ItemReceiver((subByte2) subfloat3);
                addU16 RatingCompat2 = subfloat3.RatingCompat();
                subShort4 read5 = subShort4.read(subfloat3.MediaBrowserCompat$MediaItem());
                read5.MediaBrowserCompat$ItemReceiver = subShort3.read(read5.MediaBrowserCompat$ItemReceiver);
                read5.MediaBrowserCompat$CustomActionResultReceiver = subShort3.read(read5.MediaBrowserCompat$CustomActionResultReceiver);
                int i3 = 0;
                while (i3 < subfloat3.PlaybackStateCompat$CustomAction()) {
                    addU8 addu8 = (addU8) subfloat3.MediaBrowserCompat$ItemReceiver(i3);
                    subShort4 subshort42 = read3;
                    int i4 = i2;
                    float f4 = f2;
                    subShort3.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, (addu8.IconCompatParcelizer - this.read.AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer) * backgroundResource * f3, (((float) i3) * AppCompatDelegateImpl$ListMenuDecorView * f2) + this.read.setPopupCallback, read2);
                    if (subfloat3.ParcelableVolumeInfo()) {
                        this.IconCompatParcelizer.setColor(subfloat3.read(i3));
                        canvas.drawText(RatingCompat2.MediaBrowserCompat$ItemReceiver(addu8.IconCompatParcelizer), read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver - read4, this.IconCompatParcelizer);
                    } else {
                        Canvas canvas2 = canvas;
                    }
                    i3++;
                    read3 = subshort42;
                    i2 = i4;
                    f2 = f4;
                }
                Canvas canvas3 = canvas;
                f = f2;
                subshort4 = read3;
                i = i2;
                subShort4.IconCompatParcelizer(read5);
            } else {
                Canvas canvas4 = canvas;
                f = f2;
                subshort4 = read3;
                i = i2;
            }
            i2 = i + 1;
            read3 = subshort4;
            f2 = f;
        }
        subShort4.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
        subShort4.IconCompatParcelizer(read2);
        subShort4.IconCompatParcelizer(read3);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Canvas canvas, isComplex.C13709[] r20) {
        float f;
        addI32 addi32;
        int i;
        Canvas canvas2 = canvas;
        isComplex.C13709[] r2 = r20;
        float AppCompatDelegateImpl$ListMenuDecorView = this.read.AppCompatDelegateImpl$ListMenuDecorView();
        float backgroundResource = this.read.setBackgroundResource();
        subShort4 MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver();
        subShort4 read2 = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        addI32 addi322 = (addI32) this.read.MediaBrowserCompat$SearchResultReceiver();
        int length = r2.length;
        int i2 = 0;
        while (i2 < length) {
            isComplex.C13709 r12 = r2[i2];
            subFloat3 subfloat3 = (subFloat3) addi322.write(r12.write);
            if (subfloat3 != null && subfloat3.mo18473x50fd9e4a()) {
                addU8 addu8 = (addU8) subfloat3.MediaBrowserCompat$ItemReceiver((int) r12.MediaBrowserCompat$SearchResultReceiver);
                if (MediaBrowserCompat$ItemReceiver(addu8, subfloat3)) {
                    float f2 = addu8.IconCompatParcelizer;
                    float f3 = this.read.AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer;
                    addi32 = addi322;
                    subShort3.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, (f2 - f3) * backgroundResource * this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, (r12.MediaBrowserCompat$SearchResultReceiver * AppCompatDelegateImpl$ListMenuDecorView * this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) + this.read.setPopupCallback, read2);
                    float f4 = read2.MediaBrowserCompat$ItemReceiver;
                    float f5 = read2.MediaBrowserCompat$CustomActionResultReceiver;
                    r12.MediaBrowserCompat$ItemReceiver = f4;
                    r12.read = f5;
                    MediaBrowserCompat$ItemReceiver(canvas2, read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, subfloat3);
                    if (!subfloat3.setTitle() || Float.isNaN(read2.MediaBrowserCompat$ItemReceiver) || Float.isNaN(read2.MediaBrowserCompat$CustomActionResultReceiver)) {
                        f = AppCompatDelegateImpl$ListMenuDecorView;
                        i2++;
                        r2 = r20;
                        addi322 = addi32;
                        AppCompatDelegateImpl$ListMenuDecorView = f;
                    } else {
                        int icon = subfloat3.setIcon();
                        if (icon == 1122867) {
                            icon = subfloat3.MediaBrowserCompat$CustomActionResultReceiver(0);
                        }
                        if (subfloat3.setItemInvoker() < 255) {
                            icon = subMatrix2f.MediaBrowserCompat$CustomActionResultReceiver(icon, subfloat3.setItemInvoker());
                        }
                        float padding = subfloat3.setPadding();
                        float shortcut = subfloat3.setShortcut();
                        int popupCallback = subfloat3.setPopupCallback();
                        float forceShowIcon = subfloat3.setForceShowIcon();
                        canvas.save();
                        float read3 = subShort3.read(shortcut);
                        float read4 = subShort3.read(padding);
                        if (popupCallback != 1122867) {
                            Path path = this.MediaBrowserCompat$SearchResultReceiver;
                            path.reset();
                            f = AppCompatDelegateImpl$ListMenuDecorView;
                            path.addCircle(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, read3, Path.Direction.CW);
                            if (read4 > BitmapDescriptorFactory.HUE_RED) {
                                path.addCircle(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, read4, Path.Direction.CCW);
                            }
                            this.MediaDescriptionCompat.setColor(popupCallback);
                            this.MediaDescriptionCompat.setStyle(Paint.Style.FILL);
                            canvas2.drawPath(path, this.MediaDescriptionCompat);
                            i = 1122867;
                        } else {
                            f = AppCompatDelegateImpl$ListMenuDecorView;
                            i = 1122867;
                        }
                        if (icon != i) {
                            this.MediaDescriptionCompat.setColor(icon);
                            this.MediaDescriptionCompat.setStyle(Paint.Style.STROKE);
                            this.MediaDescriptionCompat.setStrokeWidth(subShort3.read(forceShowIcon));
                            canvas2.drawCircle(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, read3, this.MediaDescriptionCompat);
                        }
                        canvas.restore();
                        i2++;
                        r2 = r20;
                        addi322 = addi32;
                        AppCompatDelegateImpl$ListMenuDecorView = f;
                    }
                }
            }
            f = AppCompatDelegateImpl$ListMenuDecorView;
            addi32 = addi322;
            i2++;
            r2 = r20;
            addi322 = addi32;
            AppCompatDelegateImpl$ListMenuDecorView = f;
        }
        subShort4.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
        subShort4.IconCompatParcelizer(read2);
    }

    public final void read(Canvas canvas) {
        float AppCompatDelegateImpl$ListMenuDecorView = this.read.AppCompatDelegateImpl$ListMenuDecorView();
        float backgroundResource = this.read.setBackgroundResource();
        float f = this.read.setPopupCallback;
        subShort4 MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver();
        this.RatingCompat.setStrokeWidth(this.read.AppCompatActivity);
        this.RatingCompat.setColor(this.read.setContentView);
        this.RatingCompat.setAlpha(this.read.setHasDecor);
        int i = this.read.PlaybackStateCompat$CustomAction;
        int PlaybackStateCompat$CustomAction = ((subFloat3) ((addI32) this.read.MediaBrowserCompat$SearchResultReceiver()).MediaBrowserCompat$ItemReceiver()).PlaybackStateCompat$CustomAction();
        subShort4 read2 = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        for (int i2 = 0; i2 < PlaybackStateCompat$CustomAction; i2 += i + 1) {
            subShort3.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, this.read.AppCompatDelegateImpl$ListMenuDecorView.write * backgroundResource, (((float) i2) * AppCompatDelegateImpl$ListMenuDecorView) + f, read2);
            canvas.drawLine(MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, this.RatingCompat);
        }
        subShort4.IconCompatParcelizer(read2);
        this.RatingCompat.setStrokeWidth(this.read.AlertController$RecycleListView);
        this.RatingCompat.setColor(this.read.setBackgroundResource);
        this.RatingCompat.setAlpha(this.read.setHasDecor);
        int i3 = this.read.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$MediaItem;
        subShort4 read3 = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        subShort4 read4 = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            while (i5 < ((addI32) this.read.MediaBrowserCompat$SearchResultReceiver()).MediaBrowserCompat$CustomActionResultReceiver()) {
                float f2 = (this.read.AppCompatDelegateImpl$ListMenuDecorView.MediaMetadataCompat[i4] - this.read.AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer) * backgroundResource;
                subShort3.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, f2, (((float) i5) * AppCompatDelegateImpl$ListMenuDecorView) + f, read3);
                i5++;
                subShort3.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, f2, (((float) i5) * AppCompatDelegateImpl$ListMenuDecorView) + f, read4);
                canvas.drawLine(read3.MediaBrowserCompat$ItemReceiver, read3.MediaBrowserCompat$CustomActionResultReceiver, read4.MediaBrowserCompat$ItemReceiver, read4.MediaBrowserCompat$CustomActionResultReceiver, this.RatingCompat);
            }
        }
        subShort4.IconCompatParcelizer(read3);
        subShort4.IconCompatParcelizer(read4);
    }
}
