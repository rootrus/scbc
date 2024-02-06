package p040o;

import android.graphics.Canvas;
import android.graphics.Path;
import p040o.rsnAllocationRead1D;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subInt4 */
public abstract class subInt4 extends subI16 {
    private Path read = new Path();

    public subInt4(rsnAllocationRead1D.write write, rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer) {
        super(write, iconCompatParcelizer);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(Canvas canvas, float f, float f2, subF32 subf32) {
        this.MediaBrowserCompat$ItemReceiver.setColor(subf32.AppCompatActivity());
        this.MediaBrowserCompat$ItemReceiver.setStrokeWidth(subf32.ActionMenuItemView());
        this.MediaBrowserCompat$ItemReceiver.setPathEffect(subf32.setExpandedFormat());
        if (subf32.AppCompatViewInflater()) {
            this.read.reset();
            this.read.moveTo(f, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.top);
            this.read.lineTo(f, this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.bottom);
            canvas.drawPath(this.read, this.MediaBrowserCompat$ItemReceiver);
        }
        if (subf32.setChecked()) {
            this.read.reset();
            this.read.moveTo(this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.left, f2);
            this.read.lineTo(this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.right, f2);
            canvas.drawPath(this.read, this.MediaBrowserCompat$ItemReceiver);
        }
    }
}
