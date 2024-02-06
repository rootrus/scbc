package p040o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subShort2 */
public class subShort2 extends subI8 {
    protected addToPack MediaBrowserCompat$CustomActionResultReceiver;
    private RectF MediaBrowserCompat$MediaItem;
    private float[] MediaBrowserCompat$SearchResultReceiver = new float[2];
    private Path MediaDescriptionCompat;
    private Paint MediaMetadataCompat;
    private float[] RatingCompat;

    public subShort2(rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer, addToPack addtopack) {
        super(iconCompatParcelizer, (C1133x65c1ec57) null, addtopack);
        new Path();
        new RectF();
        new Path();
        new RectF();
        this.MediaDescriptionCompat = new Path();
        this.RatingCompat = new float[2];
        this.MediaBrowserCompat$MediaItem = new RectF();
        this.MediaBrowserCompat$CustomActionResultReceiver = addtopack;
        if (this.ParcelableVolumeInfo != null) {
            this.read.setColor(-16777216);
            this.read.setTextSize(subShort3.read(10.0f));
            Paint paint = new Paint(1);
            this.MediaMetadataCompat = paint;
            paint.setColor(-7829368);
            this.MediaMetadataCompat.setStrokeWidth(1.0f);
            this.MediaMetadataCompat.setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void MediaBrowserCompat$ItemReceiver(android.graphics.Canvas r9) {
        /*
            r8 = this;
            o.addToPack r0 = r8.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r0 == 0) goto L_0x00f9
            o.addToPack r0 = r8.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r0 == 0) goto L_0x00f9
            float[] r0 = r8.MediaBrowserCompat$SearchResultReceiver
            int r0 = r0.length
            o.addToPack r1 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r1.MediaBrowserCompat$MediaItem
            int r1 = r1 << 1
            if (r0 == r1) goto L_0x0021
            o.addToPack r0 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r0.MediaBrowserCompat$MediaItem
            int r0 = r0 << 1
            float[] r0 = new float[r0]
            r8.MediaBrowserCompat$SearchResultReceiver = r0
        L_0x0021:
            float[] r0 = r8.MediaBrowserCompat$SearchResultReceiver
            r1 = 0
        L_0x0024:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0036
            int r2 = r1 + 1
            o.addToPack r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            float[] r3 = r3.MediaMetadataCompat
            int r4 = r1 / 2
            r3 = r3[r4]
            r0[r2] = r3
            int r1 = r1 + 2
            goto L_0x0024
        L_0x0036:
            p040o.C1133x65c1ec57.MediaBrowserCompat$CustomActionResultReceiver((float[]) r0)
            android.graphics.Paint r1 = r8.read
            r2 = 0
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r8.read
            o.addToPack r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            float r2 = r2.MediaBrowserCompat$ItemReceiver()
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r8.read
            o.addToPack r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = r2.ParcelableVolumeInfo
            r1.setColor(r2)
            o.addToPack r1 = r8.MediaBrowserCompat$CustomActionResultReceiver
            float r1 = r1.read()
            android.graphics.Paint r2 = r8.read
            java.lang.String r3 = "A"
            int r2 = p040o.subShort3.MediaBrowserCompat$ItemReceiver((android.graphics.Paint) r2, (java.lang.String) r3)
            float r2 = (float) r2
            r3 = 1075838976(0x40200000, float:2.5)
            float r2 = r2 / r3
            o.addToPack r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            float r3 = r3.write()
            o.addToPack r4 = r8.MediaBrowserCompat$CustomActionResultReceiver
            o.addToPack$MediaBrowserCompat$ItemReceiver r4 = r4.PlaybackStateCompat
            o.addToPack r5 = r8.MediaBrowserCompat$CustomActionResultReceiver
            o.addToPack$read r5 = r5.AlertController$RecycleListView
            o.addToPack$MediaBrowserCompat$ItemReceiver r6 = p040o.addToPack$MediaBrowserCompat$ItemReceiver.LEFT
            if (r4 != r6) goto L_0x0097
            o.addToPack$read r4 = p040o.addToPack.read.OUTSIDE_CHART
            if (r5 != r4) goto L_0x0089
            android.graphics.Paint r4 = r8.read
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.RIGHT
            r4.setTextAlign(r5)
            o.rsnScriptInvokeV$IconCompatParcelizer r4 = r8.ParcelableVolumeInfo
            android.graphics.RectF r4 = r4.MediaBrowserCompat$ItemReceiver
            float r4 = r4.left
            goto L_0x00b7
        L_0x0089:
            android.graphics.Paint r4 = r8.read
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.LEFT
            r4.setTextAlign(r5)
            o.rsnScriptInvokeV$IconCompatParcelizer r4 = r8.ParcelableVolumeInfo
            android.graphics.RectF r4 = r4.MediaBrowserCompat$ItemReceiver
            float r4 = r4.left
            goto L_0x00a8
        L_0x0097:
            o.addToPack$read r4 = p040o.addToPack.read.OUTSIDE_CHART
            if (r5 != r4) goto L_0x00aa
            android.graphics.Paint r4 = r8.read
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.LEFT
            r4.setTextAlign(r5)
            o.rsnScriptInvokeV$IconCompatParcelizer r4 = r8.ParcelableVolumeInfo
            android.graphics.RectF r4 = r4.MediaBrowserCompat$ItemReceiver
            float r4 = r4.right
        L_0x00a8:
            float r4 = r4 + r1
            goto L_0x00b8
        L_0x00aa:
            android.graphics.Paint r4 = r8.read
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.RIGHT
            r4.setTextAlign(r5)
            o.rsnScriptInvokeV$IconCompatParcelizer r4 = r8.ParcelableVolumeInfo
            android.graphics.RectF r4 = r4.MediaBrowserCompat$ItemReceiver
            float r4 = r4.right
        L_0x00b7:
            float r4 = r4 - r1
        L_0x00b8:
            float r2 = r2 + r3
            o.addToPack r1 = r8.MediaBrowserCompat$CustomActionResultReceiver
            boolean r1 = r1.PlaybackStateCompat$CustomAction
            r1 = r1 ^ 1
            o.addToPack r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            boolean r3 = r3.setHasDecor
            if (r3 == 0) goto L_0x00ca
            o.addToPack r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r3.MediaBrowserCompat$MediaItem
            goto L_0x00d0
        L_0x00ca:
            o.addToPack r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r3.MediaBrowserCompat$MediaItem
            int r3 = r3 + -1
        L_0x00d0:
            if (r1 >= r3) goto L_0x00f9
            o.addToPack r5 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 < 0) goto L_0x00e8
            float[] r6 = r5.MediaMetadataCompat
            int r6 = r6.length
            if (r1 >= r6) goto L_0x00e8
            o.addU16 r6 = r5.MediaBrowserCompat$CustomActionResultReceiver()
            float[] r5 = r5.MediaMetadataCompat
            r5 = r5[r1]
            java.lang.String r5 = r6.MediaBrowserCompat$ItemReceiver(r5)
            goto L_0x00ea
        L_0x00e8:
            java.lang.String r5 = ""
        L_0x00ea:
            int r6 = r1 << 1
            int r6 = r6 + 1
            r6 = r0[r6]
            float r6 = r6 + r2
            android.graphics.Paint r7 = r8.read
            r9.drawText(r5, r4, r6, r7)
            int r1 = r1 + 1
            goto L_0x00d0
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.subShort2.MediaBrowserCompat$ItemReceiver(android.graphics.Canvas):void");
    }

    public void write(Canvas canvas) {
        List<createFieldPack> list = this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
        if (list != null && list.size() > 0) {
            float[] fArr = this.RatingCompat;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.MediaDescriptionCompat;
            path.reset();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).MediaSessionCompat$ResultReceiverWrapper) {
                    int save = canvas.save();
                    this.MediaBrowserCompat$MediaItem.set(this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver);
                    this.MediaBrowserCompat$MediaItem.inset(BitmapDescriptorFactory.HUE_RED, -0.0f);
                    canvas.clipRect(this.MediaBrowserCompat$MediaItem);
                    this.write.setStyle(Paint.Style.STROKE);
                    this.write.setColor(0);
                    this.write.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
                    this.write.setPathEffect((PathEffect) null);
                    fArr[1] = 0.0f;
                    C1133x65c1ec57.MediaBrowserCompat$CustomActionResultReceiver(fArr);
                    path.moveTo(this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.left, fArr[1]);
                    path.lineTo(this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.right, fArr[1]);
                    canvas.drawPath(path, this.write);
                    path.reset();
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
