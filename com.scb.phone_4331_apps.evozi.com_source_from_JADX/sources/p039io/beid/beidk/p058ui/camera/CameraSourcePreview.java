package p039io.beid.beidk.p058ui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.ViewGroup;
import java.io.IOException;
import p040o.ChubbReviewActivity;
import p040o.onEmailUsClick;

/* renamed from: io.beid.beidk.ui.camera.CameraSourcePreview */
public class CameraSourcePreview extends ViewGroup {
    private Context IconCompatParcelizer;
    public onEmailUsClick MediaBrowserCompat$CustomActionResultReceiver;
    private SurfaceView MediaBrowserCompat$ItemReceiver;
    private GraphicOverlay MediaBrowserCompat$SearchResultReceiver;
    private boolean read = false;
    /* access modifiers changed from: private */
    public boolean write = false;

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = context;
        SurfaceView surfaceView = new SurfaceView(context);
        this.MediaBrowserCompat$ItemReceiver = surfaceView;
        surfaceView.getHolder().addCallback(new C9651x1f6a2275(this, (byte) 0));
        addView(this.MediaBrowserCompat$ItemReceiver);
        Log.e(getClass().getName(), "log");
    }

    private boolean write() {
        int i = this.IconCompatParcelizer.getResources().getConfiguration().orientation;
        if (i == 2) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        Log.d("CameraSourcePreview", "isPortraitMode returning false by default");
        return false;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(onEmailUsClick onemailusclick, GraphicOverlay graphicOverlay) throws IOException, SecurityException {
        this.MediaBrowserCompat$SearchResultReceiver = graphicOverlay;
        read(onemailusclick);
    }

    /* access modifiers changed from: private */
    public void read() throws IOException, SecurityException {
        if (this.read && this.write) {
            this.MediaBrowserCompat$ItemReceiver.getHolder().setFixedSize(getWidth(), getHeight());
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.getHolder());
            if (this.MediaBrowserCompat$SearchResultReceiver != null) {
                ChubbReviewActivity chubbReviewActivity = this.MediaBrowserCompat$CustomActionResultReceiver.write;
                int min = Math.min(chubbReviewActivity.MediaBrowserCompat$ItemReceiver, chubbReviewActivity.write);
                int max = Math.max(chubbReviewActivity.MediaBrowserCompat$ItemReceiver, chubbReviewActivity.write);
                if (write()) {
                    GraphicOverlay graphicOverlay = this.MediaBrowserCompat$SearchResultReceiver;
                    synchronized (graphicOverlay.read) {
                        graphicOverlay.MediaBrowserCompat$ItemReceiver = min;
                        graphicOverlay.IconCompatParcelizer = max;
                    }
                    graphicOverlay.postInvalidate();
                } else {
                    GraphicOverlay graphicOverlay2 = this.MediaBrowserCompat$SearchResultReceiver;
                    synchronized (graphicOverlay2.read) {
                        graphicOverlay2.MediaBrowserCompat$ItemReceiver = max;
                        graphicOverlay2.IconCompatParcelizer = min;
                    }
                    graphicOverlay2.postInvalidate();
                }
                GraphicOverlay graphicOverlay3 = this.MediaBrowserCompat$SearchResultReceiver;
                synchronized (graphicOverlay3.read) {
                    graphicOverlay3.write.clear();
                }
                graphicOverlay3.postInvalidate();
            }
            this.read = false;
        }
    }

    public final void read(onEmailUsClick onemailusclick) throws IOException, SecurityException {
        onEmailUsClick onemailusclick2;
        if (onemailusclick == null && (onemailusclick2 = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            onemailusclick2.read();
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = onemailusclick;
        if (onemailusclick != null) {
            this.read = true;
            read();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        String str;
        ChubbReviewActivity chubbReviewActivity;
        onEmailUsClick onemailusclick = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (onemailusclick == null || (chubbReviewActivity = onemailusclick.write) == null) {
            i6 = i3;
            i5 = i4;
        } else {
            i6 = chubbReviewActivity.MediaBrowserCompat$ItemReceiver;
            i5 = chubbReviewActivity.write;
        }
        if (!write()) {
            int i9 = i6;
            i6 = i5;
            i5 = i9;
        }
        int i10 = i3 - i;
        int i11 = i4 - i2;
        float f = (float) i5;
        float f2 = ((float) i10) / f;
        float f3 = (float) i6;
        float f4 = ((float) i11) / f3;
        if (f2 > f4) {
            int i12 = (int) (f3 * f2);
            i11 = i12;
            i8 = (i12 - i11) / 2;
            i7 = 0;
        } else {
            int i13 = (int) (f * f4);
            i7 = (i13 - i10) / 2;
            i10 = i13;
            i8 = 0;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            getChildAt(i14).layout(-i7, -i8, i10 - i7, i11 - i8);
        }
        try {
            read();
        } catch (SecurityException e) {
            e = e;
            str = "Do not have permission to start the camera";
            Log.e("CameraSourcePreview", str, e);
        } catch (IOException e2) {
            e = e2;
            str = "Could not start camera source.";
            Log.e("CameraSourcePreview", str, e);
        }
    }
}
