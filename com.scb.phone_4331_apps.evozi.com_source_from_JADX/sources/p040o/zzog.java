package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.Barcode;
import p040o.LocalProjectProvider;

/* renamed from: o.zzog */
public final class zzog implements OPRStatusRewardsLandingActivity_ViewBinding<Barcode.Sms> {
    private final HmlReviewDocumentActivity<LocalProjectProvider.C69386> IconCompatParcelizer;
    private final UseCaseModule read;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> write;

    private zzog(UseCaseModule useCaseModule, HmlReviewDocumentActivity<LocalProjectProvider.C69386> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity2) {
        this.read = useCaseModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
    }

    public static zzog MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<LocalProjectProvider.C69386> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity2) {
        return new zzog(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        Barcode.Sms read2 = this.read.read(this.IconCompatParcelizer.get(), this.write.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
