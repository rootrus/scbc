package p040o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.lyft.android.scissors.CropView;
import com.scb.phone.view.activity.mwpartner.MwPartnerCropPhotoActivity;
import java.io.File;
import java.util.concurrent.Callable;
import p040o.CTRSV;

/* renamed from: o.isBefore */
public final /* synthetic */ class isBefore implements Callable {
    private final /* synthetic */ MwPartnerCropPhotoActivity IconCompatParcelizer;
    private final /* synthetic */ File write;

    public /* synthetic */ isBefore(MwPartnerCropPhotoActivity mwPartnerCropPhotoActivity, File file) {
        this.IconCompatParcelizer = mwPartnerCropPhotoActivity;
        this.write = file;
    }

    public final Object call() {
        Bitmap bitmap;
        MwPartnerCropPhotoActivity mwPartnerCropPhotoActivity = this.IconCompatParcelizer;
        File file = this.write;
        CropView cropView = mwPartnerCropPhotoActivity.cropView;
        if (cropView.IconCompatParcelizer == null) {
            cropView.IconCompatParcelizer = new CropView.IconCompatParcelizer(cropView);
        }
        CTRSV.write write2 = new CTRSV.write(cropView.IconCompatParcelizer.IconCompatParcelizer);
        DGBMV.read(true, "quality must be 0..100");
        write2.write = 80;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        DGBMV.IconCompatParcelizer(compressFormat, "format == null");
        write2.MediaBrowserCompat$CustomActionResultReceiver = compressFormat;
        CropView cropView2 = write2.MediaBrowserCompat$ItemReceiver;
        Bitmap bitmap2 = cropView2.write;
        if (bitmap2 == null) {
            bitmap = null;
        } else {
            Bitmap.Config config = bitmap2.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            int i = cropView2.read.MediaBrowserCompat$SearchResultReceiver;
            int i2 = cropView2.read.MediaDescriptionCompat;
            Bitmap createBitmap = Bitmap.createBitmap(i2, i, config);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate((float) (-((cropView2.getRight() - i2) / 2)), (float) (-((cropView2.getBottom() - i) / 2)));
            cropView2.IconCompatParcelizer(canvas);
            bitmap = createBitmap;
        }
        DGBMV.read(bitmap, write2.MediaBrowserCompat$CustomActionResultReceiver, write2.write, file);
        return file.getPath();
    }
}
