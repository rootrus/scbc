package p040o;

import android.graphics.Paint;
import com.google.android.gms.vision.face.Face;
import p104sg.nec.com.epid_sdk_master.camera.GraphicOverlay;

/* renamed from: o.setAvatar */
public final class setAvatar extends GraphicOverlay.write {
    private static final int[] MediaBrowserCompat$ItemReceiver = {-16776961, -16711681, -16711936, -65281, -65536, -1, -256};
    private static int write = 0;
    public volatile Face MediaBrowserCompat$CustomActionResultReceiver;
    private Paint MediaBrowserCompat$SearchResultReceiver;
    private Paint read;

    public setAvatar(GraphicOverlay graphicOverlay) {
        super(graphicOverlay);
        int i = write;
        int[] iArr = MediaBrowserCompat$ItemReceiver;
        int length = (i + 1) % iArr.length;
        write = length;
        int i2 = iArr[length];
        new Paint().setColor(i2);
        Paint paint = new Paint();
        this.MediaBrowserCompat$SearchResultReceiver = paint;
        paint.setColor(i2);
        this.MediaBrowserCompat$SearchResultReceiver.setTextSize(40.0f);
        Paint paint2 = new Paint();
        this.read = paint2;
        paint2.setColor(i2);
        this.read.setStyle(Paint.Style.STROKE);
        this.read.setStrokeWidth(5.0f);
    }

    public final void IconCompatParcelizer() {
        Face face = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (face != null) {
            float f = face.getPosition().x;
            face.getWidth();
            if (this.IconCompatParcelizer.read == 1) {
                this.IconCompatParcelizer.getWidth();
                float unused = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
            } else {
                float unused2 = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
            }
            float f2 = face.getPosition().y;
            face.getHeight();
            float unused3 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            face.getWidth();
            float unused4 = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
            face.getHeight();
            float unused5 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        }
    }
}
