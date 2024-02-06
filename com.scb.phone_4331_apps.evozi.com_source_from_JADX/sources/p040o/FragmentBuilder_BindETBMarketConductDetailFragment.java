package p040o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.FragmentBuilder_BindETBMarketConductDetailFragment */
public final class FragmentBuilder_BindETBMarketConductDetailFragment implements FragmentBuilder_BindFundSelectAccountFragment {
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final int MediaBrowserCompat$ItemReceiver;
    private int write = 0;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "rounded";
    }

    public FragmentBuilder_BindETBMarketConductDetailFragment(int i, int i2, int i3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.write = i2;
        this.IconCompatParcelizer = i3;
    }

    public final Bitmap write(Bitmap bitmap) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        int i = this.MediaBrowserCompat$CustomActionResultReceiver << 1;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = (float) i;
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f);
        float f2 = (float) this.MediaBrowserCompat$CustomActionResultReceiver;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        Paint paint2 = new Paint();
        paint2.setColor(this.write);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth((float) this.IconCompatParcelizer);
        float f3 = (float) this.MediaBrowserCompat$CustomActionResultReceiver;
        canvas.drawCircle(f3, f3, f3 - (((float) this.IconCompatParcelizer) / 2.0f), paint2);
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
