package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: o.FragmentBuilder_BindDeviceSettingsFragment */
public final class FragmentBuilder_BindDeviceSettingsFragment extends ImageSpan {
    public FragmentBuilder_BindDeviceSettingsFragment(Context context, Bitmap bitmap) {
        super(context, bitmap);
    }

    public FragmentBuilder_BindDeviceSettingsFragment(Drawable drawable) {
        super(drawable);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f, (float) ((i5 - drawable.getBounds().bottom) - (paint.getFontMetricsInt().descent / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }
}
