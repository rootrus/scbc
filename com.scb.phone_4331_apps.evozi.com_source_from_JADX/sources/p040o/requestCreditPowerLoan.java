package p040o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.IOException;
import java.util.List;

/* renamed from: o.requestCreditPowerLoan */
public final class requestCreditPowerLoan implements SurfaceHolder.Callback {
    public verifyCommercialReferral IconCompatParcelizer;
    public SurfaceHolder MediaBrowserCompat$CustomActionResultReceiver;
    public List<Camera.Size> MediaBrowserCompat$ItemReceiver;
    public Camera.ShutterCallback MediaBrowserCompat$MediaItem = uploadValidation.IconCompatParcelizer;
    public SurfaceView MediaBrowserCompat$SearchResultReceiver;
    public Camera.PictureCallback MediaDescriptionCompat = saveCustomerContactInformation.write;
    private Context MediaMetadataCompat;
    public Camera.Size RatingCompat;
    public Camera read;
    public Camera.PictureCallback write = new postOccupation(this);

    public requestCreditPowerLoan(Context context) {
        this.MediaMetadataCompat = context;
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            if (this.read != null) {
                this.read.setPreviewDisplay(surfaceHolder);
            }
        } catch (IOException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Camera camera = this.read;
        if (camera != null) {
            camera.stopPreview();
        }
    }

    public final Camera.Size write(List<Camera.Size> list) {
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        double d = Double.MAX_VALUE;
        Point point = new Point();
        ((Activity) this.MediaMetadataCompat).getWindowManager().getDefaultDisplay().getSize(point);
        if (point.x < point.y) {
            point.set(point.y, point.x);
        }
        double d2 = (double) (((float) point.x) / ((float) point.y));
        int min = Math.min(point.y, point.x);
        if (min <= 0) {
            min = point.y;
        }
        for (Camera.Size next : list) {
            if (Math.abs((((double) next.width) / ((double) next.height)) - d2) <= 0.05d && ((double) Math.abs(next.height - min)) < d) {
                d = (double) Math.abs(next.height - min);
                size = next;
            }
        }
        return size == null ? read(list, d2) : size;
    }

    private static Camera.Size read(List<Camera.Size> list, double d) {
        Camera.Size size = null;
        double d2 = Double.MAX_VALUE;
        for (Camera.Size next : list) {
            double d3 = (((double) next.width) / ((double) next.height)) - d;
            if (Math.abs(d3) < d2) {
                d2 = Math.abs(d3);
                size = next;
            }
        }
        return size;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.read != null && this.RatingCompat != null && this.MediaBrowserCompat$CustomActionResultReceiver.getSurface() != null) {
            try {
                this.read.stopPreview();
            } catch (Exception e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            }
            try {
                Camera.Parameters parameters = this.read.getParameters();
                parameters.setPreviewSize(this.RatingCompat.width, this.RatingCompat.height);
                this.read.setParameters(parameters);
                this.read.startPreview();
            } catch (Exception e2) {
                onCheckBoxClick.IconCompatParcelizer(e2);
            }
        }
    }
}
