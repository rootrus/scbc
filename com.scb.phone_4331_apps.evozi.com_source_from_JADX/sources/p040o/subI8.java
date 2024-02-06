package p040o;

import android.graphics.Paint;
import p040o.C10821Element;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subI8 */
public abstract class subI8 extends MyQRCoachMarkActivity {
    protected C10821Element.DataKind IconCompatParcelizer;
    private Paint MediaBrowserCompat$CustomActionResultReceiver;
    protected C1133x65c1ec57 MediaBrowserCompat$ItemReceiver = null;
    private Paint MediaMetadataCompat;
    protected Paint read;
    protected Paint write;

    public subI8(rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer, C1133x65c1ec57 alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver, C10821Element.DataKind dataKind) {
        super(iconCompatParcelizer);
        this.IconCompatParcelizer = dataKind;
        if (this.ParcelableVolumeInfo != null) {
            this.read = new Paint(1);
            Paint paint = new Paint();
            this.MediaMetadataCompat = paint;
            paint.setColor(-7829368);
            this.MediaMetadataCompat.setStrokeWidth(1.0f);
            this.MediaMetadataCompat.setStyle(Paint.Style.STROKE);
            this.MediaMetadataCompat.setAlpha(90);
            Paint paint2 = new Paint();
            this.MediaBrowserCompat$CustomActionResultReceiver = paint2;
            paint2.setColor(-16777216);
            this.MediaBrowserCompat$CustomActionResultReceiver.setStrokeWidth(1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.write = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    public void write(float f, float f2, boolean z) {
        if (this.ParcelableVolumeInfo != null && this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.width() > 10.0f) {
            rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer = this.ParcelableVolumeInfo;
            float f3 = iconCompatParcelizer.MediaMetadataCompat;
            float f4 = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
            if (!(f3 <= f4 && f4 <= 1.0f)) {
                Float3 read2 = this.MediaBrowserCompat$ItemReceiver.read(this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.left, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.top);
                Float3 read3 = this.MediaBrowserCompat$ItemReceiver.read(this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.left, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.bottom);
                float f5 = (float) read3.IconCompatParcelizer;
                Float3.MediaBrowserCompat$CustomActionResultReceiver(read2);
                Float3.MediaBrowserCompat$CustomActionResultReceiver(read3);
                f = f5;
                f2 = (float) read2.IconCompatParcelizer;
            }
        }
        MediaBrowserCompat$CustomActionResultReceiver(f, f2);
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$CustomActionResultReceiver(float f, float f2) {
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
        double read2 = (double) subShort3.read(abs / ((double) i2));
        double read3 = (double) subShort3.read(Math.pow(10.0d, (double) ((int) Math.log10(read2))));
        if (((int) (read2 / read3)) > 5) {
            read2 = Math.floor(read3 * 10.0d);
        }
        int i3 = (read2 > 0.0d ? 1 : (read2 == 0.0d ? 0 : -1));
        double ceil = i3 == 0 ? 0.0d : Math.ceil(((double) f) / read2) * read2;
        if (i3 == 0) {
            d = 0.0d;
        } else {
            d = subShort3.MediaBrowserCompat$CustomActionResultReceiver(Math.floor(((double) f2) / read2) * read2);
        }
        if (i3 != 0) {
            i = 0;
            for (double d2 = ceil; d2 <= d; d2 += read2) {
                i++;
            }
        } else {
            i = 0;
        }
        this.IconCompatParcelizer.MediaBrowserCompat$MediaItem = i;
        if (this.IconCompatParcelizer.MediaMetadataCompat.length < i) {
            this.IconCompatParcelizer.MediaMetadataCompat = new float[i];
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (ceil == 0.0d) {
                ceil = 0.0d;
            }
            this.IconCompatParcelizer.MediaMetadataCompat[i4] = (float) ceil;
            ceil += read2;
        }
        if (read2 < 1.0d) {
            this.IconCompatParcelizer.read = (int) Math.ceil(-Math.log10(read2));
        } else {
            this.IconCompatParcelizer.read = 0;
        }
    }
}
