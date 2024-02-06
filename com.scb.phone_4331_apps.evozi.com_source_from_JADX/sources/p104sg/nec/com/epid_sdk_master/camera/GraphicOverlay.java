package p104sg.nec.com.epid_sdk_master.camera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;
import java.util.Set;
import p040o.setTvRemark;

/* renamed from: sg.nec.com.epid_sdk_master.camera.GraphicOverlay */
public class GraphicOverlay extends View {
    static Paint write;
    public final Object IconCompatParcelizer = new Object();
    public Set<write> MediaBrowserCompat$CustomActionResultReceiver = new HashSet();
    /* access modifiers changed from: private */
    public float MediaBrowserCompat$ItemReceiver = 1.0f;
    /* access modifiers changed from: private */
    public float MediaBrowserCompat$MediaItem = 1.0f;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    /* access modifiers changed from: private */
    public int read = 0;

    /* renamed from: sg.nec.com.epid_sdk_master.camera.GraphicOverlay$write */
    public static abstract class write {
        public GraphicOverlay IconCompatParcelizer;

        public abstract void IconCompatParcelizer();

        public write(GraphicOverlay graphicOverlay) {
            this.IconCompatParcelizer = graphicOverlay;
            Paint paint = new Paint();
            GraphicOverlay.write = paint;
            paint.setColor(-65536);
            GraphicOverlay.write.setStyle(Paint.Style.STROKE);
            GraphicOverlay.write.setStrokeWidth(5.0f);
        }
    }

    public GraphicOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCameraInfo(int i, int i2, int i3) {
        synchronized (this.IconCompatParcelizer) {
            this.MediaDescriptionCompat = i;
            this.MediaMetadataCompat = i2;
            this.read = i3;
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.IconCompatParcelizer) {
            if (!(this.MediaDescriptionCompat == 0 || this.MediaMetadataCompat == 0)) {
                this.MediaBrowserCompat$MediaItem = ((float) canvas.getWidth()) / ((float) this.MediaDescriptionCompat);
                this.MediaBrowserCompat$ItemReceiver = ((float) canvas.getHeight()) / ((float) this.MediaMetadataCompat);
            }
            for (write IconCompatParcelizer2 : this.MediaBrowserCompat$CustomActionResultReceiver) {
                IconCompatParcelizer2.IconCompatParcelizer();
            }
        }
        float width = (float) ((Activity) getContext()).getWindowManager().getDefaultDisplay().getWidth();
        float height = (float) ((Activity) getContext()).getWindowManager().getDefaultDisplay().getHeight();
        float round = ((float) Math.round((width / height) * 100.0f)) / 100.0f;
        if (round <= BitmapDescriptorFactory.HUE_RED) {
            round = BitmapDescriptorFactory.HUE_RED - round;
        }
        Log.i("width default", String.valueOf(width));
        Log.i("height default", String.valueOf(height));
        Log.i("roundvalue default", String.valueOf(round));
        Paint paint = new Paint();
        paint.setAlpha(100);
        if (round >= 0.74f && round <= 0.76f) {
            Log.e("", "set image for round value 0.75");
            canvas.drawBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), setTvRemark.read.image_1024x1366), canvas.getWidth(), canvas.getHeight(), true), BitmapDescriptorFactory.HUE_RED, 330.0f, paint);
        } else if (round >= 0.55f && round <= 0.57f) {
            Log.e("", "set image for round value 0.56");
            Log.i("draw bitmap", String.valueOf(round));
            canvas.drawBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), setTvRemark.read.image_375x667), canvas.getWidth(), canvas.getHeight(), true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        } else if (round >= 0.63f && round <= 0.66f) {
            Log.e("", "set image for round value 0.64");
            canvas.drawBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), setTvRemark.read.image_600x960), canvas.getWidth(), canvas.getHeight(), true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        } else if (round >= 0.49f && ((double) round) <= 0.51d) {
            Log.e("", "set image for round value 0.50");
            canvas.drawBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), setTvRemark.read.image_480x800), canvas.getWidth(), canvas.getHeight(), true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        } else if (round < 0.46f || round > 0.48f) {
            Log.e("", "set image for default value 0.56");
            Log.i("draw bitmap", String.valueOf(round));
            canvas.drawBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), setTvRemark.read.image_375x667), canvas.getWidth(), canvas.getHeight(), true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        } else {
            Log.e("", "set image for round value 0.47");
            canvas.drawBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), setTvRemark.read.image_480x854), canvas.getWidth(), canvas.getHeight(), true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        }
    }
}
