package com.scb.phone.view.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.google.android.gms.common.images.Size;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import java.io.IOException;

public class CameraSourcePreview extends ViewGroup {
    private int IconCompatParcelizer = 1;
    private SurfaceView MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver = false;
    public CameraSource read;
    /* access modifiers changed from: private */
    public boolean write = false;

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SurfaceView surfaceView = new SurfaceView(context);
        this.MediaBrowserCompat$CustomActionResultReceiver = surfaceView;
        surfaceView.getHolder().addCallback(new read(this, (byte) 0));
        addView(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void write() throws IOException, SecurityException {
        if (this.MediaBrowserCompat$ItemReceiver && this.write) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.getHolder());
            this.MediaBrowserCompat$ItemReceiver = false;
        }
    }

    class read implements SurfaceHolder.Callback {
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        private read() {
        }

        /* synthetic */ read(CameraSourcePreview cameraSourcePreview, byte b) {
            this();
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            boolean unused = CameraSourcePreview.this.write = true;
            try {
                CameraSourcePreview.this.write();
            } catch (SecurityException e) {
                Log.e("CameraSourcePreview", "Do not have permission to startIncomingTransaction the camera", e);
            } catch (IOException e2) {
                Log.e("CameraSourcePreview", "Could not startIncomingTransaction camera source.", e2);
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            boolean unused = CameraSourcePreview.this.write = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        Size size;
        CameraSource cameraSource = this.read;
        if (cameraSource == null || (size = cameraSource.MediaBrowserCompat$MediaItem) == null) {
            i5 = 1024;
            i6 = C0608h.f1446Ay;
        } else {
            i5 = size.getWidth();
            i6 = size.getHeight();
        }
        boolean z2 = true;
        if (this.IconCompatParcelizer != 1) {
            z2 = false;
        }
        if (!z2) {
            int i9 = i5;
            i5 = i6;
            i6 = i9;
        }
        int i10 = i3 - i;
        int i11 = i4 - i2;
        float f = (float) i6;
        float f2 = ((float) i10) / f;
        float f3 = (float) i5;
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
            write();
        } catch (SecurityException e) {
            Log.e("CameraSourcePreview", "Do not have permission to startIncomingTransaction the camera", e);
        } catch (IOException e2) {
            Log.e("CameraSourcePreview", "Could not startIncomingTransaction camera source.", e2);
        }
    }
}
