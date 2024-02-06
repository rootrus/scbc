package p040o;

import com.scb.phone.view.activity.easycash.EasycashCollateralInformationActivity;
import com.scb.phone.view.activity.hml.HmlApplicationOutcomeActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import p040o.C10827Iterators;

/* renamed from: o.r */
public final class C5186r extends IsgDetectionModule_GetDocumentDetectorFactory<Check> {
    public final C10827Iterators.C35467 MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5186r(RegularImmutableBiMap regularImmutableBiMap, C10827Iterators.C35467 r3) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) r3, "easycashEligibilityController");
        this.MediaBrowserCompat$ItemReceiver = r3;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
    }

    /* renamed from: o.r$1 */
    public final class C51871 implements MileageQuantitySelectionActivity<HmlApplicationOutcomeActivity> {
        public static void MediaBrowserCompat$ItemReceiver(HmlApplicationOutcomeActivity hmlApplicationOutcomeActivity, getCurrentImageIndex getcurrentimageindex) {
            hmlApplicationOutcomeActivity.presenter = getcurrentimageindex;
        }
    }

    /* renamed from: o.r$a */
    public final /* synthetic */ class C5188a implements AmountEditText.IconCompatParcelizer {
        private final /* synthetic */ EasycashCollateralInformationActivity IconCompatParcelizer;

        public /* synthetic */ C5188a(EasycashCollateralInformationActivity easycashCollateralInformationActivity) {
            this.IconCompatParcelizer = easycashCollateralInformationActivity;
        }

        public final void IconCompatParcelizer() {
            EasycashCollateralInformationActivity easycashCollateralInformationActivity = this.IconCompatParcelizer;
            easycashCollateralInformationActivity.presenter.IconCompatParcelizer(easycashCollateralInformationActivity.etPrice.getText().toString());
        }
    }
}
