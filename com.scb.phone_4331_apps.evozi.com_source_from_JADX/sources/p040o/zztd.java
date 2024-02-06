package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.Splitter;

/* renamed from: o.zztd */
public final class zztd implements OPRStatusRewardsLandingActivity_ViewBinding<Splitter.C38051.C38061> {
    private final UseCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<C7514tY> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<C6548x820c5aab> write;

    private zztd(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C6548x820c5aab> hmlReviewDocumentActivity4) {
        this.IconCompatParcelizer = useCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
    }

    public static zztd MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C6548x820c5aab> hmlReviewDocumentActivity4) {
        return new zztd(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        Splitter.C38051.C38061 read2 = this.IconCompatParcelizer.read(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
