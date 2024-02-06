package p040o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import p040o.rsnAllocationRead1D;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subLong2 */
public abstract class subLong2 extends subInt4 {
    public subLong2(rsnAllocationRead1D.write write, rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer) {
        super(write, iconCompatParcelizer);
    }

    /* access modifiers changed from: protected */
    public final void write(Canvas canvas, Path path, int i, int i2) {
        int i3 = (i & 16777215) | (i2 << 24);
        if (subShort3.read() >= 18) {
            int save = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i3);
            canvas.restoreToCount(save);
            return;
        }
        Paint.Style style = this.write.getStyle();
        int color = this.write.getColor();
        this.write.setStyle(Paint.Style.FILL);
        this.write.setColor(i3);
        canvas.drawPath(path, this.write);
        this.write.setColor(color);
        this.write.setStyle(style);
    }

    /* access modifiers changed from: protected */
    public final void read(Canvas canvas, Path path, Drawable drawable) {
        if (subShort3.read() >= 18) {
            int save = canvas.save();
            canvas.clipPath(path);
            drawable.setBounds((int) this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.left, (int) this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.top, (int) this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.right, (int) this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver.bottom);
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fill-drawables not (yet) supported below API level 18, this code was run on API level ");
        sb.append(subShort3.read());
        sb.append(".");
        throw new RuntimeException(sb.toString());
    }
}
