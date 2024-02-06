package p040o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.FragmentBuilder_BindETBProductDetailFragment */
public final class FragmentBuilder_BindETBProductDetailFragment implements FragmentBuilder_BindFundSelectAccountFragment {
    private float IconCompatParcelizer;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "circle";
    }

    public FragmentBuilder_BindETBProductDetailFragment() {
        this((byte) 0);
    }

    private FragmentBuilder_BindETBProductDetailFragment(byte b) {
        this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    public final Bitmap write(Bitmap bitmap) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - min) / 2, (bitmap.getHeight() - min) / 2, min, min);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(min, min, createBitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f = ((float) min) / 2.0f;
        canvas.drawRoundRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) createBitmap.getWidth(), (float) createBitmap.getHeight()), f, f, paint);
        if (createBitmap2 != createBitmap) {
            createBitmap.recycle();
        }
        return createBitmap2;
    }
}
