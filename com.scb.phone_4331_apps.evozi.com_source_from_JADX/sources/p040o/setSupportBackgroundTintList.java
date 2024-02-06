package p040o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p040o.AppCompatButton;
import p040o.MapConstraints;

/* renamed from: o.setSupportBackgroundTintList */
public class setSupportBackgroundTintList extends MapConstraints.ConstrainedSetMultimap.write {
    public void write() {
        AppCompatButton.MediaBrowserCompat$CustomActionResultReceiver = new AppCompatButton.read() {
            public void read(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
