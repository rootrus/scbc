package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashNcbCaseModule;
import p040o.LocalProjectProvider;

/* renamed from: o.zztz */
public final class zztz implements OPRStatusRewardsLandingActivity_ViewBinding<setRequestedFps> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<subSet> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashNcbCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69375> read;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> write;

    private zztz(EasycashNcbCaseModule easycashNcbCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<subSet> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$ItemReceiver = easycashNcbCaseModule;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
    }

    public static zztz IconCompatParcelizer(EasycashNcbCaseModule easycashNcbCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<LocalProjectProvider.C69375> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<subSet> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5) {
        return new zztz(easycashNcbCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        setRequestedFps read2 = this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$SearchResultReceiver.get(), this.IconCompatParcelizer.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
