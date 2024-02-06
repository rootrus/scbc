package p040o;

import android.text.TextUtils;
import p040o.CustomConcurrentHashMap;
import p040o.Multisets;

/* renamed from: o.ImageClassificationCompletedListener */
public class ImageClassificationCompletedListener extends writeUInt64NoTag<C6394xa3a265ac> {
    /* access modifiers changed from: private */
    public AnalyticsReceiver IconCompatParcelizer;
    public final takePicture MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public Multisets.ElementSetImpl.C36881 read;
    /* access modifiers changed from: private */
    public final quicksortLeastK write;

    @HmlPinActivity
    public ImageClassificationCompletedListener(RegularImmutableBiMap regularImmutableBiMap, takePicture takepicture, quicksortLeastK quicksortleastk, Multisets.ElementSetImpl.C36881 r4) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = takepicture;
        this.write = quicksortleastk;
        this.read = r4;
    }

    public final void write(AnalyticsReceiver analyticsReceiver) {
        this.IconCompatParcelizer = analyticsReceiver;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= analyticsReceiver.MediaDescriptionCompat.size()) {
                break;
            }
            CheckDetector checkDetector = new CheckDetector(analyticsReceiver, i);
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                checkDetector.IconCompatParcelizer(this.RatingCompat);
            }
            i++;
        }
        if (!TextUtils.isEmpty(analyticsReceiver.MediaMetadataCompat) && !TextUtils.isEmpty(analyticsReceiver.read)) {
            CheckDetector_Factory checkDetector_Factory = new CheckDetector_Factory(analyticsReceiver);
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                checkDetector_Factory.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public copyEvictableEntry MediaBrowserCompat$ItemReceiver() {
        copyEvictableEntry$MediaBrowserCompat$CustomActionResultReceiver copyevictableentry_mediabrowsercompat_customactionresultreceiver = new copyEvictableEntry$MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver, this.IconCompatParcelizer.IconCompatParcelizer);
        CustomConcurrentHashMap.EntryFactory.C32902.write write2 = new CustomConcurrentHashMap.EntryFactory.C32902.write();
        write2.IconCompatParcelizer = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.get("NCB_CONSENT");
        copyevictableentry_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = new CustomConcurrentHashMap.EntryFactory.C32902(write2, (byte) 0);
        return new copyEvictableEntry(copyevictableentry_mediabrowsercompat_customactionresultreceiver, (byte) 0);
    }

    public void onDestroy() {
        takePicture takepicture = this.MediaBrowserCompat$ItemReceiver;
        if (!takepicture.MediaBrowserCompat$MediaItem.isDisposed()) {
            takepicture.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void IconCompatParcelizer(ImageClassificationCompletedListener imageClassificationCompletedListener) {
        if (imageClassificationCompletedListener.RatingCompat != null) {
            imageClassificationCompletedListener.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(ImageClassificationCompletedListener imageClassificationCompletedListener) {
        if (imageClassificationCompletedListener.RatingCompat != null) {
            imageClassificationCompletedListener.RatingCompat.aj_();
        }
    }
}
