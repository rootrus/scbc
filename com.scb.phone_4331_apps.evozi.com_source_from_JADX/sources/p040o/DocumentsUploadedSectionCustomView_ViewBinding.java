package p040o;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import java.io.ByteArrayOutputStream;

/* renamed from: o.DocumentsUploadedSectionCustomView_ViewBinding */
public final class DocumentsUploadedSectionCustomView_ViewBinding extends Detector<Face> {
    private Detector<Face> MediaBrowserCompat$CustomActionResultReceiver;
    private Frame MediaBrowserCompat$ItemReceiver;

    public DocumentsUploadedSectionCustomView_ViewBinding(Detector<Face> detector) {
        this.MediaBrowserCompat$CustomActionResultReceiver = detector;
    }

    public final SparseArray<Face> detect(Frame frame) {
        StringBuilder sb = new StringBuilder();
        sb.append("framge=");
        sb.append(frame);
        Log.e("MyFaceDetector", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("framgeGreyImage=");
        sb2.append(frame.getGrayscaleImageData());
        Log.e("MyFaceDetector", sb2.toString());
        this.MediaBrowserCompat$ItemReceiver = frame;
        return this.MediaBrowserCompat$CustomActionResultReceiver.detect(frame);
    }

    public final byte[] MediaBrowserCompat$ItemReceiver() {
        int width = this.MediaBrowserCompat$ItemReceiver.getMetadata().getWidth();
        int height = this.MediaBrowserCompat$ItemReceiver.getMetadata().getHeight();
        YuvImage yuvImage = new YuvImage(this.MediaBrowserCompat$ItemReceiver.getGrayscaleImageData().array(), 17, width, height, (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, width, height), 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        StringBuilder sb = new StringBuilder();
        sb.append("store ActionImage=");
        sb.append(byteArray);
        Log.e("MyFaceDetector", sb.toString());
        return byteArray;
    }

    public final boolean isOperational() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.isOperational();
    }

    public final boolean setFocus(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.setFocus(i);
    }
}
