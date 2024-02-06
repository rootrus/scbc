package p040o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.nDeviceSetConfig;

/* renamed from: o.nDeviceCreate */
public final class nDeviceCreate {
    public static final int read;
    public final write IconCompatParcelizer;
    public Drawable MediaBrowserCompat$CustomActionResultReceiver;
    public final View MediaBrowserCompat$ItemReceiver;
    private final Path MediaBrowserCompat$MediaItem = new Path();
    private nDeviceSetConfig.read MediaBrowserCompat$SearchResultReceiver;
    private final Paint MediaDescriptionCompat = new Paint(7);
    private boolean MediaMetadataCompat;
    private boolean RatingCompat;
    public final Paint write;

    /* renamed from: o.nDeviceCreate$write */
    public interface write {
        void MediaBrowserCompat$ItemReceiver(Canvas canvas);

        boolean MediaBrowserCompat$ItemReceiver();
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            read = 2;
        } else if (Build.VERSION.SDK_INT >= 18) {
            read = 1;
        } else {
            read = 0;
        }
    }

    public nDeviceCreate(write write2) {
        this.IconCompatParcelizer = write2;
        View view = (View) write2;
        this.MediaBrowserCompat$ItemReceiver = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.write = paint;
        paint.setColor(0);
    }

    public final void read() {
        if (read == 0) {
            this.MediaMetadataCompat = true;
            this.RatingCompat = false;
            this.MediaBrowserCompat$ItemReceiver.buildDrawingCache();
            Bitmap drawingCache = this.MediaBrowserCompat$ItemReceiver.getDrawingCache();
            if (!(drawingCache != null || this.MediaBrowserCompat$ItemReceiver.getWidth() == 0 || this.MediaBrowserCompat$ItemReceiver.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.MediaBrowserCompat$ItemReceiver.getWidth(), this.MediaBrowserCompat$ItemReceiver.getHeight(), Bitmap.Config.ARGB_8888);
                this.MediaBrowserCompat$ItemReceiver.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.MediaDescriptionCompat;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.MediaMetadataCompat = false;
            this.RatingCompat = true;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (read == 0) {
            this.RatingCompat = false;
            this.MediaBrowserCompat$ItemReceiver.destroyDrawingCache();
            this.MediaDescriptionCompat.setShader((Shader) null);
            this.MediaBrowserCompat$ItemReceiver.invalidate();
        }
    }

    public final void read(nDeviceSetConfig.read read2) {
        if (read2 == null) {
            this.MediaBrowserCompat$SearchResultReceiver = null;
        } else {
            nDeviceSetConfig.read read3 = this.MediaBrowserCompat$SearchResultReceiver;
            if (read3 == null) {
                this.MediaBrowserCompat$SearchResultReceiver = new nDeviceSetConfig.read(read2);
            } else {
                float f = read2.MediaBrowserCompat$CustomActionResultReceiver;
                float f2 = read2.MediaBrowserCompat$ItemReceiver;
                float f3 = read2.read;
                read3.MediaBrowserCompat$CustomActionResultReceiver = f;
                read3.MediaBrowserCompat$ItemReceiver = f2;
                read3.read = f3;
            }
            if (read2.read + 1.0E-4f >= IconCompatParcelizer(read2)) {
                this.MediaBrowserCompat$SearchResultReceiver.read = Float.MAX_VALUE;
            }
        }
        write();
    }

    public final nDeviceSetConfig.read IconCompatParcelizer() {
        nDeviceSetConfig.read read2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (read2 == null) {
            return null;
        }
        nDeviceSetConfig.read read3 = new nDeviceSetConfig.read(read2);
        if (read3.read == Float.MAX_VALUE) {
            read3.read = IconCompatParcelizer(read3);
        }
        return read3;
    }

    private void write() {
        if (read == 1) {
            this.MediaBrowserCompat$MediaItem.rewind();
            nDeviceSetConfig.read read2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (read2 != null) {
                this.MediaBrowserCompat$MediaItem.addCircle(read2.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$SearchResultReceiver.read, Path.Direction.CW);
            }
        }
        this.MediaBrowserCompat$ItemReceiver.invalidate();
    }

    private float IconCompatParcelizer(nDeviceSetConfig.read read2) {
        return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(read2.MediaBrowserCompat$CustomActionResultReceiver, read2.MediaBrowserCompat$ItemReceiver, (float) this.MediaBrowserCompat$ItemReceiver.getWidth(), (float) this.MediaBrowserCompat$ItemReceiver.getHeight());
    }

    public final void IconCompatParcelizer(Canvas canvas) {
        boolean z = false;
        if (MediaBrowserCompat$ItemReceiver()) {
            int i = read;
            if (i == 0) {
                canvas.drawCircle(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$SearchResultReceiver.read, this.MediaDescriptionCompat);
                if (!this.MediaMetadataCompat && Color.alpha(this.write.getColor()) != 0) {
                    z = true;
                }
                if (z) {
                    canvas.drawCircle(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$SearchResultReceiver.read, this.write);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.MediaBrowserCompat$MediaItem);
                this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(canvas);
                if (!this.MediaMetadataCompat && Color.alpha(this.write.getColor()) != 0) {
                    z = true;
                }
                if (z) {
                    canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.MediaBrowserCompat$ItemReceiver.getWidth(), (float) this.MediaBrowserCompat$ItemReceiver.getHeight(), this.write);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(canvas);
                if (!this.MediaMetadataCompat && Color.alpha(this.write.getColor()) != 0) {
                    z = true;
                }
                if (z) {
                    canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.MediaBrowserCompat$ItemReceiver.getWidth(), (float) this.MediaBrowserCompat$ItemReceiver.getHeight(), this.write);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported strategy ");
                sb.append(read);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(canvas);
            if (!this.MediaMetadataCompat && Color.alpha(this.write.getColor()) != 0) {
                z = true;
            }
            if (z) {
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.MediaBrowserCompat$ItemReceiver.getWidth(), (float) this.MediaBrowserCompat$ItemReceiver.getHeight(), this.write);
            }
        }
        read(canvas);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$ItemReceiver() {
        /*
            r4 = this;
            o.nDeviceSetConfig$read r0 = r4.MediaBrowserCompat$SearchResultReceiver
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            float r0 = r0.read
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0016
            r0 = r1
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            int r3 = read
            if (r3 != 0) goto L_0x0023
            if (r0 != 0) goto L_0x0022
            boolean r0 = r4.RatingCompat
            if (r0 == 0) goto L_0x0022
            r1 = r2
        L_0x0022:
            return r1
        L_0x0023:
            r0 = r0 ^ r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nDeviceCreate.MediaBrowserCompat$ItemReceiver():boolean");
    }

    private void read(Canvas canvas) {
        if ((this.MediaMetadataCompat || this.MediaBrowserCompat$CustomActionResultReceiver == null || this.MediaBrowserCompat$SearchResultReceiver == null) ? false : true) {
            Rect bounds = this.MediaBrowserCompat$CustomActionResultReceiver.getBounds();
            float width = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver - (((float) bounds.width()) / 2.0f);
            float height = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.MediaBrowserCompat$CustomActionResultReceiver.draw(canvas);
            canvas.translate(-width, -height);
        }
    }
}
