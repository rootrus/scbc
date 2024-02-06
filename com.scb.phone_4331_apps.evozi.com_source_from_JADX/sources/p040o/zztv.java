package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashMCMCDetailCaseModule;
import p040o.Barcode;

/* renamed from: o.zztv */
public final class zztv implements OPRStatusRewardsLandingActivity_ViewBinding<Barcode.CalendarEvent> {
    private final HmlReviewDocumentActivity<sortedMap> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final EasycashMCMCDetailCaseModule write;

    private zztv(EasycashMCMCDetailCaseModule easycashMCMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<sortedMap> hmlReviewDocumentActivity3) {
        this.write = easycashMCMCDetailCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zztv write(EasycashMCMCDetailCaseModule easycashMCMCDetailCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<sortedMap> hmlReviewDocumentActivity3) {
        return new zztv(easycashMCMCDetailCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        Barcode.CalendarEvent IconCompatParcelizer = this.write.IconCompatParcelizer(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
