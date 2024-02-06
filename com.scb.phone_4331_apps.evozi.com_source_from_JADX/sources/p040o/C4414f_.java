package p040o;

import java.util.List;
import p040o.zzxc;

/* renamed from: o.f_ */
public final class C4414f_ extends frequency<List<? extends zzxc.zzb>, write> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4414f_(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final IIdExtractor iIdExtractor) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<write, BScanCNotificationDeepLinkActivity<List<? extends zzxc.zzb>>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                write write2 = (write) obj;
                onGetStartedClick.write((Object) write2, "param");
                return iIdExtractor.write(write2.IconCompatParcelizer);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) iIdExtractor, "bankingAgentRepositoryContractor");
    }

    /* renamed from: o.f_$write */
    public static final class write implements C4602xca7af99c {
        final String IconCompatParcelizer;

        public write(String str) {
            onGetStartedClick.write((Object) str, "postingType");
            this.IconCompatParcelizer = str;
        }
    }
}
