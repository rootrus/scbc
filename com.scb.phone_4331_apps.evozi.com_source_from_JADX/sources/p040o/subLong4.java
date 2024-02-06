package p040o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.C10821Element;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subLong4 */
public class subLong4 extends subI8 {
    protected C10821Element.DataType MediaBrowserCompat$CustomActionResultReceiver;

    public subLong4(rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer, C10821Element.DataType dataType) {
        super(iconCompatParcelizer, (C1133x65c1ec57) null, dataType);
        new Path();
        new RectF();
        new RectF();
        new Path();
        this.MediaBrowserCompat$CustomActionResultReceiver = dataType;
        this.read.setColor(-16777216);
        this.read.setTextAlign(Paint.Align.CENTER);
        this.read.setTextSize(subShort3.read(10.0f));
    }

    public final void write(float f, float f2, boolean z) {
        if (this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.width() > 10.0f) {
            rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer = this.ParcelableVolumeInfo;
            float f3 = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
            float f4 = iconCompatParcelizer.read;
            if (!(f3 <= f4 && f4 <= 1.0f)) {
                Float3 read = this.MediaBrowserCompat$ItemReceiver.read(this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.left, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.top);
                Float3 read2 = this.MediaBrowserCompat$ItemReceiver.read(this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.right, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.top);
                float f5 = (float) read.MediaBrowserCompat$CustomActionResultReceiver;
                Float3.MediaBrowserCompat$CustomActionResultReceiver(read);
                Float3.MediaBrowserCompat$CustomActionResultReceiver(read2);
                f = f5;
                f2 = (float) read2.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
        super.MediaBrowserCompat$CustomActionResultReceiver(f, f2);
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(float f, float f2) {
        super.MediaBrowserCompat$CustomActionResultReceiver(f, f2);
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        String IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        this.read.setTypeface((Typeface) null);
        this.read.setTextSize(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver());
        Float2 IconCompatParcelizer2 = subShort3.IconCompatParcelizer(this.read, IconCompatParcelizer);
        Float2 read = subShort3.read(IconCompatParcelizer2.write, (float) subShort3.MediaBrowserCompat$ItemReceiver(this.read, "Q"), BitmapDescriptorFactory.HUE_RED);
        this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction = Math.round(read.write);
        this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor = Math.round(read.MediaBrowserCompat$CustomActionResultReceiver);
        Float2.MediaBrowserCompat$ItemReceiver(read);
        Float2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(Canvas canvas) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper && this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver) {
            float write = this.MediaBrowserCompat$CustomActionResultReceiver.write();
            this.read.setTypeface((Typeface) null);
            this.read.setTextSize(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver());
            this.read.setColor(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
            subShort4 read = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            if (this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat == Element$DataType$MediaBrowserCompat$ItemReceiver.TOP) {
                read.MediaBrowserCompat$ItemReceiver = 0.5f;
                read.MediaBrowserCompat$CustomActionResultReceiver = 1.0f;
                write(canvas, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.top - write, read);
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat == Element$DataType$MediaBrowserCompat$ItemReceiver.TOP_INSIDE) {
                read.MediaBrowserCompat$ItemReceiver = 0.5f;
                read.MediaBrowserCompat$CustomActionResultReceiver = 1.0f;
                write(canvas, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.top + write + ((float) this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor), read);
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat == Element$DataType$MediaBrowserCompat$ItemReceiver.BOTTOM) {
                read.MediaBrowserCompat$ItemReceiver = 0.5f;
                read.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
                write(canvas, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.bottom + write, read);
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat == Element$DataType$MediaBrowserCompat$ItemReceiver.BOTTOM_INSIDE) {
                read.MediaBrowserCompat$ItemReceiver = 0.5f;
                read.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
                write(canvas, (this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.bottom - write) - ((float) this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor), read);
            } else {
                read.MediaBrowserCompat$ItemReceiver = 0.5f;
                read.MediaBrowserCompat$CustomActionResultReceiver = 1.0f;
                write(canvas, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.top - write, read);
                read.MediaBrowserCompat$ItemReceiver = 0.5f;
                read.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
                write(canvas, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.bottom + write, read);
            }
            subShort4.IconCompatParcelizer(read);
        }
    }

    private void write(Canvas canvas, float f, subShort4 subshort4) {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem << 1;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            fArr[i2] = this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat[i2 / 2];
        }
        C1133x65c1ec57.MediaBrowserCompat$CustomActionResultReceiver(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3];
            rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer = this.ParcelableVolumeInfo;
            if (((iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.left > (1.0f + f2) ? 1 : (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.left == (1.0f + f2) ? 0 : -1)) <= 0) && iconCompatParcelizer.read(f2)) {
                subShort3.IconCompatParcelizer(canvas, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat[i3 / 2]), f2, f, this.read, subshort4, BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void write(Canvas canvas, String str, float f, float f2, subShort4 subshort4, float f3) {
        subShort3.IconCompatParcelizer(canvas, str, f, f2, this.read, subshort4, BitmapDescriptorFactory.HUE_RED);
    }
}
