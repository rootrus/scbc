package p040o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.FragmentBuilder_BindEStatementsSuccessfulFragment */
public final class FragmentBuilder_BindEStatementsSuccessfulFragment implements FragmentBuilder_BindFundSelectAccountFragment {
    private final int IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver = 0;
    private final int read;
    private final int write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "rounded";
    }

    public FragmentBuilder_BindEStatementsSuccessfulFragment(int i, int i2, int i3) {
        this.IconCompatParcelizer = i;
        this.write = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        this.read = i3;
    }

    public FragmentBuilder_BindEStatementsSuccessfulFragment(int i) {
        this.IconCompatParcelizer = i;
        this.write = 0;
        this.read = 0;
    }

    public final Bitmap write(Bitmap bitmap) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        float f = (float) this.IconCompatParcelizer;
        canvas.drawRoundRect(rectF, f, f, paint);
        Paint paint2 = new Paint();
        paint2.setColor(this.MediaBrowserCompat$CustomActionResultReceiver);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth((float) this.read);
        canvas.drawCircle(((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f, ((float) this.IconCompatParcelizer) - (((float) this.read) / 2.0f), paint2);
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
