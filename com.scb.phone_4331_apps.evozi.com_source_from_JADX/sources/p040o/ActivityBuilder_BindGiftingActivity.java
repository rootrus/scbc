package p040o;

import com.scb.phone.view.fragment.hml.p050di.HmlNTBSummaryModule;

/* renamed from: o.ActivityBuilder_BindGiftingActivity */
public final class ActivityBuilder_BindGiftingActivity implements OPRStatusRewardsLandingActivity_ViewBinding<getScanSettings> {
    public static getScanSettings read(HmlNTBSummaryModule hmlNTBSummaryModule, setContentScrimColor setcontentscrimcolor, BottomSheetBehavior bottomSheetBehavior, getStartFinalizer getstartfinalizer, newImageLabeler newimagelabeler, TextRecognizer textRecognizer, complementOf complementof, RegularImmutableBiMap regularImmutableBiMap) {
        getScanSettings IconCompatParcelizer = hmlNTBSummaryModule.IconCompatParcelizer(setcontentscrimcolor, bottomSheetBehavior, getstartfinalizer, newimagelabeler, textRecognizer, complementof, regularImmutableBiMap);
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        return read((HmlNTBSummaryModule) null, (setContentScrimColor) hmlReviewDocumentActivity.get(), (BottomSheetBehavior) hmlReviewDocumentActivity.get(), (getStartFinalizer) hmlReviewDocumentActivity.get(), (newImageLabeler) hmlReviewDocumentActivity.get(), (TextRecognizer) hmlReviewDocumentActivity.get(), (complementOf) hmlReviewDocumentActivity.get(), (RegularImmutableBiMap) hmlReviewDocumentActivity.get());
    }
}
