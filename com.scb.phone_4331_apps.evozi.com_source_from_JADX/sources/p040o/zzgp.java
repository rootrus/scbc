package p040o;

import com.scb.phone.view.activity.hml.HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver;
import java.util.List;

/* renamed from: o.zzgp */
public final class zzgp implements OPRStatusRewardsLandingActivity_ViewBinding<zzgj> {
    private final HmlReviewDocumentActivity<Promotion> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zzac> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<setProductListSource> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zzl> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<setTransactionShipping> read;
    private final HmlReviewDocumentActivity<HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver> write;

    /* renamed from: o.zzgp$zza */
    public final class zza {
        public List<String> IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;
    }

    private zzgp(HmlReviewDocumentActivity<HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zzl> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setTransactionShipping> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<Promotion> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<zzac> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<setProductListSource> hmlReviewDocumentActivity6) {
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity6;
    }

    public static zzgp MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zzl> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setTransactionShipping> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<Promotion> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<zzac> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<setProductListSource> hmlReviewDocumentActivity6) {
        return new zzgp(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final /* synthetic */ Object get() {
        return new zzgj(this.write.get(), this.MediaBrowserCompat$MediaItem.get(), this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get());
    }
}
