package com.scb.phone.view.camera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.List;
import p040o.submitLendingIssuer;
import p040o.verifyCommercialReferral;

public final class CameraApi2 {
    public int AlertController$RecycleListView;
    public Handler IconCompatParcelizer;
    public CameraCaptureSession MediaBrowserCompat$CustomActionResultReceiver;
    public CameraCharacteristics MediaBrowserCompat$ItemReceiver;
    public CameraDevice MediaBrowserCompat$MediaItem;
    public CaptureRequest.Builder MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Size f3067x50fd9e4a;
    public CameraManager MediaDescriptionCompat;
    public SparseArray<String> MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public ImageReader.OnImageAvailableListener MediaSessionCompat$ResultReceiverWrapper = new submitLendingIssuer(this);
    public Context MediaSessionCompat$Token;
    public ImageReader ParcelableVolumeInfo;
    public CaptureRequest.Builder RatingCompat;
    public verifyCommercialReferral read;
    public int setHasDecor;
    public HandlerThread write;

    public class CameraHardwareNotSupportException extends RuntimeException {
    }

    public CameraApi2(Context context) {
        this.MediaSessionCompat$Token = context;
        this.MediaDescriptionCompat = (CameraManager) context.getSystemService("camera");
    }

    public final SparseArray<String> IconCompatParcelizer() {
        if (this.MediaDescriptionCompat == null) {
            return null;
        }
        this.MediaMetadataCompat = new SparseArray<>();
        try {
            for (String str : this.MediaDescriptionCompat.getCameraIdList()) {
                Integer num = (Integer) this.MediaDescriptionCompat.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        this.MediaMetadataCompat.put(0, str);
                    } else if (intValue != 1) {
                        if (intValue == 2 && Build.VERSION.SDK_INT >= 23) {
                            this.MediaMetadataCompat.put(2, str);
                        }
                    } else if (this.MediaMetadataCompat.get(1) == null) {
                        this.MediaMetadataCompat.put(1, str);
                    }
                }
            }
            return this.MediaMetadataCompat;
        } catch (CameraAccessException e) {
            e.getMessage();
            return null;
        }
    }

    public Size read(List<Size> list) {
        Size size = null;
        if (list == null) {
            return null;
        }
        double d = Double.MAX_VALUE;
        Point point = new Point();
        ((Activity) this.MediaSessionCompat$Token).getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x < point.y) {
            point.set(point.y, point.x);
        }
        double d2 = (double) (((float) point.x) / ((float) point.y));
        int min = Math.min(point.y, point.x);
        if (min <= 0) {
            min = point.y;
        }
        for (Size next : list) {
            if (Math.abs((((double) next.getWidth()) / ((double) next.getHeight())) - d2) <= 0.05d && ((double) Math.abs(next.getHeight() - min)) < d) {
                d = (double) Math.abs(next.getHeight() - min);
                size = next;
            }
        }
        return size == null ? write(list, d2) : size;
    }

    private static Size write(List<Size> list, double d) {
        Size size = null;
        double d2 = Double.MAX_VALUE;
        for (Size next : list) {
            double width = (((double) next.getWidth()) / ((double) next.getHeight())) - d;
            if (Math.abs(width) < d2) {
                d2 = Math.abs(width);
                size = next;
            }
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    public final void read(TextureView textureView) {
        if (this.MediaBrowserCompat$MediaItem != null && this.ParcelableVolumeInfo != null) {
            Surface surface = new Surface(textureView.getSurfaceTexture());
            try {
                CaptureRequest.Builder createCaptureRequest = this.MediaBrowserCompat$MediaItem.createCaptureRequest(1);
                this.RatingCompat = createCaptureRequest;
                createCaptureRequest.addTarget(surface);
                CaptureRequest.Builder createCaptureRequest2 = this.MediaBrowserCompat$MediaItem.createCaptureRequest(2);
                this.MediaBrowserCompat$SearchResultReceiver = createCaptureRequest2;
                createCaptureRequest2.addTarget(this.ParcelableVolumeInfo.getSurface());
                this.MediaBrowserCompat$MediaItem.createCaptureSession(Arrays.asList(new Surface[]{surface, this.ParcelableVolumeInfo.getSurface()}), new CameraCaptureSession.StateCallback() {
                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    }

                    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        CameraApi2.this.MediaBrowserCompat$CustomActionResultReceiver = cameraCaptureSession;
                        if (CameraApi2.this.read != null) {
                            CameraApi2.this.read.mo34100x50fd9e4a();
                        }
                    }
                }, this.IconCompatParcelizer);
            } catch (CameraAccessException e) {
                e.getMessage();
            }
        }
    }

    static /* synthetic */ void write(CameraApi2 cameraApi2, TextureView textureView, int i, int i2) {
        if (cameraApi2.f3067x50fd9e4a != null) {
            int rotation = ((Activity) cameraApi2.MediaSessionCompat$Token).getWindowManager().getDefaultDisplay().getRotation();
            ((Activity) cameraApi2.MediaSessionCompat$Token).getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            Matrix matrix = new Matrix();
            float f = (float) i;
            float f2 = (float) i2;
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2);
            RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) cameraApi2.f3067x50fd9e4a.getHeight(), (float) cameraApi2.f3067x50fd9e4a.getWidth());
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            if (1 == rotation || 3 == rotation) {
                rectF2.offset(centerX - rectF2.centerX(), centerY - rectF2.centerY());
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                float max = Math.max(f2 / ((float) cameraApi2.f3067x50fd9e4a.getHeight()), f / ((float) cameraApi2.f3067x50fd9e4a.getWidth()));
                matrix.postScale(max, max, centerX, centerY);
                matrix.postRotate((((float) rotation) - 2.0f) * 90.0f, centerX, centerY);
            }
            textureView.getSurfaceTexture().setDefaultBufferSize(cameraApi2.f3067x50fd9e4a.getWidth(), cameraApi2.f3067x50fd9e4a.getHeight());
            textureView.setTransform(matrix);
        }
    }
}
