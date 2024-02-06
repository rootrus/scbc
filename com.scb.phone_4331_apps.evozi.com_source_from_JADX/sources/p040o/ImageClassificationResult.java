package p040o;

import android.text.TextUtils;
import p040o.BarCodeReader;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.Multisets;
import p040o.access$2300;

/* renamed from: o.ImageClassificationResult */
public class ImageClassificationResult extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.setTitle> {
    public final onStopJob IconCompatParcelizer;
    public final getFormat MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final Multisets.SetMultiset.EntrySet.C36891 MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final swap MediaMetadataCompat;
    public submitTask read;
    public final detect write;

    @HmlPinActivity
    public ImageClassificationResult(RegularImmutableBiMap regularImmutableBiMap, onStopJob onstopjob, detect detect, getFormat getformat, swap swap, Multisets.SetMultiset.EntrySet.C36891 r6) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = onstopjob;
        this.write = detect;
        this.MediaBrowserCompat$ItemReceiver = getformat;
        this.MediaMetadataCompat = swap;
        this.MediaBrowserCompat$MediaItem = r6;
    }

    /* renamed from: o.ImageClassificationResult$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<resetAnalyticsData> {
        private write() {
        }

        public /* synthetic */ write(ImageClassificationResult imageClassificationResult, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            ImageClassificationResult.IconCompatParcelizer(ImageClassificationResult.this);
            CrashlyticsBackgroundWorker.C32131 read = ImageClassificationResult.this.MediaMetadataCompat.read((resetAnalyticsData) obj, ImageClassificationResult.this.read.MediaBrowserCompat$ItemReceiver);
            boolean z = true;
            if (ImageClassificationResult.this.read.MediaBrowserCompat$ItemReceiver.read == 0) {
                ImageClassificationResult imageClassificationResult = ImageClassificationResult.this;
                BarCodeReader.BarcodeReadCompleteListener barcodeReadCompleteListener = new BarCodeReader.BarcodeReadCompleteListener(read);
                if (imageClassificationResult.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    barcodeReadCompleteListener.IconCompatParcelizer(imageClassificationResult.RatingCompat);
                    return;
                }
                return;
            }
            ImageClassificationResult imageClassificationResult2 = ImageClassificationResult.this;
            BarCodeReader.BarcodeReadCompleteEvent barcodeReadCompleteEvent = new BarCodeReader.BarcodeReadCompleteEvent(read);
            if (imageClassificationResult2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                barcodeReadCompleteEvent.IconCompatParcelizer(imageClassificationResult2.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            ImageClassificationResult.MediaBrowserCompat$CustomActionResultReceiver(ImageClassificationResult.this);
            ImageClassificationResult.this.MediaBrowserCompat$ItemReceiver(ImageClassificationResult.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(ImageClassificationResult imageClassificationResult) {
        if (imageClassificationResult.RatingCompat != null) {
            imageClassificationResult.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ImageClassificationResult imageClassificationResult) {
        if (imageClassificationResult.RatingCompat != null) {
            imageClassificationResult.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(ImageClassificationResult imageClassificationResult) {
        if (imageClassificationResult.RatingCompat != null) {
            imageClassificationResult.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(submitTask submittask, CheckExtractActivity_MembersInjector.setTitle settitle) {
        if (!TextUtils.isEmpty(submittask.MediaBrowserCompat$CustomActionResultReceiver)) {
            settitle.write(submittask.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (!TextUtils.isEmpty(submittask.IconCompatParcelizer)) {
            settitle.read(submittask.IconCompatParcelizer);
        }
        settitle.MediaBrowserCompat$ItemReceiver(false);
    }
}
