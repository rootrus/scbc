package p040o;

import p040o.AbstractMultimap;
import p040o.zzfb;

/* renamed from: o.setActive */
public final class setActive extends frequency<zzfb.zza, IconCompatParcelizer> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setActive(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final AbstractMultimap.SortedKeySet sortedKeySet) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<IconCompatParcelizer, BScanCNotificationDeepLinkActivity<zzfb.zza>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                onGetStartedClick.write((Object) iconCompatParcelizer, "param");
                return sortedKeySet.MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.IconCompatParcelizer);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) sortedKeySet, "easycashFeatureAccountRepositoryContractor");
    }

    /* renamed from: o.setActive$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements C4602xca7af99c {
        final String IconCompatParcelizer = null;
        final String MediaBrowserCompat$CustomActionResultReceiver;

        public IconCompatParcelizer(String str, String str2) {
            onGetStartedClick.write((Object) str, "productType");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
    }
}
