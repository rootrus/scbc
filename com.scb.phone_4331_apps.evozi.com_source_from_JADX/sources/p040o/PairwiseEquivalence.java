package p040o;

import p040o.GoogleMap;

/* renamed from: o.PairwiseEquivalence */
public final class PairwiseEquivalence extends frequency<GoogleMap.InfoWindowAdapter, read> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public PairwiseEquivalence(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final getListDelegate getlistdelegate) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<read, BScanCNotificationDeepLinkActivity<GoogleMap.InfoWindowAdapter>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                read read = (read) obj;
                onGetStartedClick.write((Object) read, "param");
                return getlistdelegate.MediaBrowserCompat$ItemReceiver(read.IconCompatParcelizer);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getlistdelegate, "prepaidActivationRepositoryContractor");
    }

    /* renamed from: o.PairwiseEquivalence$read */
    public static final class read implements C4602xca7af99c {
        final ImmutableClassToInstanceMap IconCompatParcelizer;

        public read(ImmutableClassToInstanceMap immutableClassToInstanceMap) {
            onGetStartedClick.write((Object) immutableClassToInstanceMap, "request");
            this.IconCompatParcelizer = immutableClassToInstanceMap;
        }
    }
}
