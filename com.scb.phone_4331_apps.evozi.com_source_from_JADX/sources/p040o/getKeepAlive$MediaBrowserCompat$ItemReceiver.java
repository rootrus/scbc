package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.pdfview.PDFView;
import java.io.File;
import java.util.Iterator;
import p040o.IdWorkflowActivity;

/* renamed from: o.getKeepAlive$MediaBrowserCompat$ItemReceiver */
public final class getKeepAlive$MediaBrowserCompat$ItemReceiver implements IdWorkflowActivity.C69161 {
    private final int IconCompatParcelizer;
    private final File MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private PdfRenderer MediaBrowserCompat$MediaItem;
    private final float MediaDescriptionCompat;
    private final PDFView RatingCompat;
    private int read;
    private ParcelFileDescriptor write;

    private getKeepAlive$MediaBrowserCompat$ItemReceiver() {
    }

    private getKeepAlive$MediaBrowserCompat$ItemReceiver(PDFView pDFView, File file, float f, int i) {
        onGetStartedClick.write((Object) pDFView, Promotion.ACTION_VIEW);
        onGetStartedClick.write((Object) file, "file");
        this.RatingCompat = pDFView;
        this.MediaBrowserCompat$CustomActionResultReceiver = file;
        this.MediaDescriptionCompat = f;
        this.IconCompatParcelizer = -1;
    }

    public /* synthetic */ getKeepAlive$MediaBrowserCompat$ItemReceiver(PDFView pDFView, File file, float f) {
        this(pDFView, file, f, -1);
    }

    public final Bitmap MediaBrowserCompat$CustomActionResultReceiver(Rect rect, int i) {
        onGetStartedClick.write((Object) rect, "rect");
        int floor = (int) Math.floor(((double) rect.top) / ((double) this.MediaBrowserCompat$ItemReceiver));
        Bitmap createBitmap = Bitmap.createBitmap(rect.width() / i, rect.height() / i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(this.IconCompatParcelizer);
        canvas.drawBitmap(createBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        Iterator it = new AddAccountConsentActivity(floor, ((int) Math.ceil(((double) rect.bottom) / ((double) this.MediaBrowserCompat$ItemReceiver))) - 1).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int write2 = ((HmlNationalIdHelpActivity) it).write();
            PdfRenderer pdfRenderer = this.MediaBrowserCompat$MediaItem;
            if (pdfRenderer == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("renderer");
            }
            synchronized (pdfRenderer) {
                PdfRenderer pdfRenderer2 = this.MediaBrowserCompat$MediaItem;
                if (pdfRenderer2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("renderer");
                }
                PdfRenderer.Page openPage = pdfRenderer2.openPage(write2);
                Matrix matrix = new Matrix();
                float f = (float) i;
                matrix.setScale(this.MediaDescriptionCompat / f, this.MediaDescriptionCompat / f);
                matrix.postTranslate((float) ((-rect.left) / i), (-((float) ((rect.top - (this.MediaBrowserCompat$ItemReceiver * floor)) / i))) + ((((float) this.MediaBrowserCompat$ItemReceiver) / f) * ((float) i2)));
                openPage.render(createBitmap, (Rect) null, matrix, 1);
                openPage.close();
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            i2++;
        }
        onGetStartedClick.IconCompatParcelizer((Object) createBitmap, "bitmap");
        return createBitmap;
    }

    public final Point MediaBrowserCompat$ItemReceiver(Context context, Uri uri) throws Exception {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) uri, "uri");
        ParcelFileDescriptor open = ParcelFileDescriptor.open(this.MediaBrowserCompat$CustomActionResultReceiver, 268435456);
        onGetStartedClick.IconCompatParcelizer((Object) open, "ParcelFileDescriptor.ope…escriptor.MODE_READ_ONLY)");
        this.write = open;
        if (open == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("descriptor");
        }
        PdfRenderer pdfRenderer = new PdfRenderer(open);
        this.MediaBrowserCompat$MediaItem = pdfRenderer;
        PdfRenderer.Page openPage = pdfRenderer.openPage(0);
        onGetStartedClick.IconCompatParcelizer((Object) openPage, "page");
        this.read = (int) (((float) openPage.getWidth()) * this.MediaDescriptionCompat);
        this.MediaBrowserCompat$ItemReceiver = (int) (((float) openPage.getHeight()) * this.MediaDescriptionCompat);
        PdfRenderer pdfRenderer2 = this.MediaBrowserCompat$MediaItem;
        if (pdfRenderer2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("renderer");
        }
        if (pdfRenderer2.getPageCount() > 15) {
            this.RatingCompat.setHasBaseLayerTiles(false);
        } else {
            PdfRenderer pdfRenderer3 = this.MediaBrowserCompat$MediaItem;
            if (pdfRenderer3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("renderer");
            }
            if (pdfRenderer3.getPageCount() == 1) {
                this.RatingCompat.setMinimumScaleType(1);
            }
        }
        openPage.close();
        int i = this.read;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        PdfRenderer pdfRenderer4 = this.MediaBrowserCompat$MediaItem;
        if (pdfRenderer4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("renderer");
        }
        return new Point(i, i2 * pdfRenderer4.getPageCount());
    }

    public final boolean IconCompatParcelizer() {
        return this.read > 0 && this.MediaBrowserCompat$ItemReceiver > 0;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        PdfRenderer pdfRenderer = this.MediaBrowserCompat$MediaItem;
        if (pdfRenderer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("renderer");
        }
        pdfRenderer.close();
        ParcelFileDescriptor parcelFileDescriptor = this.write;
        if (parcelFileDescriptor == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("descriptor");
        }
        parcelFileDescriptor.close();
        this.read = 0;
        this.MediaBrowserCompat$ItemReceiver = 0;
    }
}
