package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.setIndent */
public final class setIndent implements OPRStatusRewardsLandingActivity_ViewBinding<AppMeasurementContentProvider> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getFrontException> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.EntrySet> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<classificationConfidence> write;

    private setIndent(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.EntrySet> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<classificationConfidence> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaMetadataCompat = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity5;
    }

    public static setIndent read(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.EntrySet> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<classificationConfidence> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity5) {
        return new setIndent(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        AppMeasurementContentProvider read2 = this.MediaBrowserCompat$CustomActionResultReceiver.read(this.read.get(), this.IconCompatParcelizer.get(), this.MediaMetadataCompat.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
