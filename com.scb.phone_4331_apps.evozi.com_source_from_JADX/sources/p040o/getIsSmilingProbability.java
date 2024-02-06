package p040o;

import p040o.zzl;

/* renamed from: o.getIsSmilingProbability */
public final class getIsSmilingProbability extends frequency<zzl.zzb, IconCompatParcelizer> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getIsSmilingProbability(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final ServerProjectProvider serverProjectProvider) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<IconCompatParcelizer, BScanCNotificationDeepLinkActivity<zzl.zzb>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                onGetStartedClick.write((Object) iconCompatParcelizer, "it");
                BScanCNotificationDeepLinkActivity<zzl.zzb> IconCompatParcelizer = serverProjectProvider.IconCompatParcelizer(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
                onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "repository.getStaticTiles(it.request)");
                return IconCompatParcelizer;
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) serverProjectProvider, "repository");
    }

    /* renamed from: o.getIsSmilingProbability$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements C4602xca7af99c {
        final preWriteCleanup MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(preWriteCleanup prewritecleanup) {
            onGetStartedClick.write((Object) prewritecleanup, "request");
            this.MediaBrowserCompat$ItemReceiver = prewritecleanup;
        }
    }
}
