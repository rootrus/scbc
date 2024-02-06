package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.Splitter;

/* renamed from: o.zzqa */
public final class zzqa implements OPRStatusRewardsLandingActivity_ViewBinding<Splitter.AbstractIterator> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getDocument$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$ItemReceiver;
    private final UseCaseModule write;

    private zzqa(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getDocument$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity3) {
        this.write = useCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static zzqa write(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getDocument$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity3) {
        return new zzqa(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Splitter.AbstractIterator MediaBrowserCompat$ItemReceiver2 = this.write.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
