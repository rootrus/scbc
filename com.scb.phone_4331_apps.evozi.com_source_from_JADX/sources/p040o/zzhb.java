package p040o;

import com.scb.phone.data.network.service.friends.FriendsService;

/* renamed from: o.zzhb */
public final class zzhb implements OPRStatusRewardsLandingActivity_ViewBinding<zzha> {
    private final HmlReviewDocumentActivity<FriendsService> write;

    private zzhb(HmlReviewDocumentActivity<FriendsService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static zzhb IconCompatParcelizer(HmlReviewDocumentActivity<FriendsService> hmlReviewDocumentActivity) {
        return new zzhb(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new zzha(this.write.get());
    }
}
