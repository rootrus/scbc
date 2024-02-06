package p039io.beid.beidk.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.onSearchButtonClick;

/* renamed from: io.beid.beidk.view.b */
public class C9653b extends LinearLayout {
    protected float IconCompatParcelizer = 200.0f;
    private Bitmap MediaBrowserCompat$CustomActionResultReceiver;
    protected float MediaBrowserCompat$ItemReceiver = 200.0f;
    private int MediaBrowserCompat$MediaItem;
    protected float read = 200.0f;
    protected float write = 200.0f;

    public C9653b(Context context) {
        super(context);
    }

    public C9653b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, onSearchButtonClick.write.OverlayView, 0, 0);
        try {
            this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getColor(onSearchButtonClick.write.OverlayView_backgroundColor, Color.parseColor("#000000"));
            this.write = obtainStyledAttributes.getFloat(onSearchButtonClick.write.OverlayView_overlayWidth, 100.0f);
            this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getFloat(onSearchButtonClick.write.OverlayView_overlayHeight, 100.0f);
            this.read = obtainStyledAttributes.getFloat(onSearchButtonClick.write.OverlayView_centerX, -1000.0f);
            this.IconCompatParcelizer = obtainStyledAttributes.getFloat(onSearchButtonClick.write.OverlayView_centerY, -1000.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public C9653b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void IconCompatParcelizer(float f, float f2) {
        this.read = f;
        this.IconCompatParcelizer = f2;
        postInvalidate();
    }

    public final void MediaBrowserCompat$ItemReceiver(float f, float f2) {
        this.write = f;
        this.MediaBrowserCompat$ItemReceiver = f2;
        postInvalidate();
    }

    public boolean isInEditMode() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    /* access modifiers changed from: protected */
    public void write(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                Runtime.getRuntime().gc();
            } else {
                System.gc();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.MediaBrowserCompat$CustomActionResultReceiver);
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
            Paint paint = new Paint(1);
            paint.setColor(this.MediaBrowserCompat$MediaItem);
            canvas2.drawRect(rectF, paint);
            paint.setColor(0);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
            if (this.read == -1000.0f) {
                this.read = (float) (getWidth() / 2);
            }
            if (this.IconCompatParcelizer == -1000.0f) {
                this.IconCompatParcelizer = (float) (getHeight() / 2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("height : ");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            Log.i("createWindowFrame", sb.toString());
            canvas2.drawRect(new RectF(this.read - ((this.write / 2.0f) - ((float) getPaddingLeft())), this.IconCompatParcelizer - ((this.MediaBrowserCompat$ItemReceiver / 2.0f) - ((float) getPaddingTop())), this.read + ((this.write / 2.0f) - ((float) getPaddingRight())), this.IconCompatParcelizer + ((this.MediaBrowserCompat$ItemReceiver / 2.0f) - ((float) (getPaddingBottom() + 65)))), paint);
            write(canvas2);
        }
        canvas.drawBitmap(this.MediaBrowserCompat$CustomActionResultReceiver, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
    }
}
