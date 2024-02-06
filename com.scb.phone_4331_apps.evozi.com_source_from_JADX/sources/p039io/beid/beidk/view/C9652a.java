package p039io.beid.beidk.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.onSearchButtonClick;

/* renamed from: io.beid.beidk.view.a */
public class C9652a extends LinearLayout {
    protected float IconCompatParcelizer = 200.0f;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    protected float MediaBrowserCompat$ItemReceiver = 200.0f;
    private Bitmap read;
    protected float write = 200.0f;

    public C9652a(Context context) {
        super(context);
    }

    public C9652a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, onSearchButtonClick.write.OverlayView, 0, 0);
        try {
            getWidth();
            getPaddingRight();
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getColor(onSearchButtonClick.write.OverlayView_backgroundColor, -1);
            this.IconCompatParcelizer = obtainStyledAttributes.getFloat(onSearchButtonClick.write.OverlayView_radius, -1.0f);
            this.write = obtainStyledAttributes.getFloat(onSearchButtonClick.write.OverlayView_centerX, -1000.0f);
            this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getFloat(onSearchButtonClick.write.OverlayView_centerY, -1000.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public C9652a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean isInEditMode() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.read = null;
    }

    /* access modifiers changed from: protected */
    public void read(Canvas canvas) {
    }

    public void setRadius(float f) {
        this.IconCompatParcelizer = f;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.read == null && getWidth() > 0 && getHeight() > 0) {
            this.read = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.read);
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
            Paint paint = new Paint(1);
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i != -1) {
                paint.setColor(i);
            }
            canvas2.drawRect(rectF, paint);
            paint.setColor(0);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
            if (this.write == -1000.0f) {
                this.write = (float) (getWidth() / 2);
            }
            if (this.MediaBrowserCompat$ItemReceiver == -1000.0f) {
                this.MediaBrowserCompat$ItemReceiver = (float) ((getHeight() / 2) + getPaddingTop());
            }
            if (this.IconCompatParcelizer == -1.0f) {
                int width = getWidth() < getHeight() ? getWidth() : getHeight();
                getPaddingStart();
                this.IconCompatParcelizer = (float) ((width / 2) - getPaddingStart());
            }
            canvas2.drawCircle(this.write, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, paint);
            read(canvas2);
        }
        canvas.drawBitmap(this.read, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
    }
}
