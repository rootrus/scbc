package p040o;

import java.util.List;
import p040o.CrashlyticsBackgroundWorker;
import p040o.Multisets;
import p040o.access$2300;

/* renamed from: o.ImageClassificationResult$MediaBrowserCompat$ItemReceiver */
public class ImageClassificationResult$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<BillerAdapter$ItemViewHolder>> {
    private /* synthetic */ ImageClassificationResult MediaBrowserCompat$CustomActionResultReceiver;

    private ImageClassificationResult$MediaBrowserCompat$ItemReceiver(ImageClassificationResult imageClassificationResult) {
        this.MediaBrowserCompat$CustomActionResultReceiver = imageClassificationResult;
    }

    public /* synthetic */ ImageClassificationResult$MediaBrowserCompat$ItemReceiver(ImageClassificationResult imageClassificationResult, byte b) {
        this(imageClassificationResult);
    }

    public final /* synthetic */ void onNext(Object obj) {
        ImageClassificationResult.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        Multisets.SetMultiset.EntrySet.C36891 unused = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
        CrashlyticsBackgroundWorker.C32142 read = Multisets.SetMultiset.EntrySet.C36891.read((List) obj);
        boolean z = true;
        if (read == null) {
            ImageClassificationResult imageClassificationResult = this.MediaBrowserCompat$CustomActionResultReceiver;
            DocumentDetector documentDetector = DocumentDetector.IconCompatParcelizer;
            if (imageClassificationResult.RatingCompat == null) {
                z = false;
            }
            if (z) {
                documentDetector.IconCompatParcelizer(imageClassificationResult.RatingCompat);
                return;
            }
            return;
        }
        ImageClassificationResult imageClassificationResult2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        barcodeReadComplete barcodereadcomplete = new barcodeReadComplete(read);
        if (imageClassificationResult2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            barcodereadcomplete.IconCompatParcelizer(imageClassificationResult2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
