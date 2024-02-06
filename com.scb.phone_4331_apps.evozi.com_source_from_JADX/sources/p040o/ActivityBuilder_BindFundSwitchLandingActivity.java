package p040o;

import com.scb.phone.view.fragment.hml.p050di.HmlETBSummaryModule;

/* renamed from: o.ActivityBuilder_BindFundSwitchLandingActivity */
public final class ActivityBuilder_BindFundSwitchLandingActivity implements OPRStatusRewardsLandingActivity_ViewBinding<getScanSettings> {
    public static getScanSettings write(HmlETBSummaryModule hmlETBSummaryModule, SwipeDismissBehavior swipeDismissBehavior, setItemIconTintList setitemicontintlist, setContentScrimColor setcontentscrimcolor, BottomSheetBehavior bottomSheetBehavior, TextRecognizer textRecognizer, complementOf complementof, RegularImmutableBiMap regularImmutableBiMap, setStatusBarScrimResource setstatusbarscrimresource, setTimestampMillis settimestampmillis) {
        getScanSettings IconCompatParcelizer = hmlETBSummaryModule.IconCompatParcelizer(swipeDismissBehavior, setitemicontintlist, setcontentscrimcolor, bottomSheetBehavior, textRecognizer, complementof, regularImmutableBiMap, setstatusbarscrimresource, settimestampmillis);
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        return write((HmlETBSummaryModule) null, (SwipeDismissBehavior) hmlReviewDocumentActivity.get(), (setItemIconTintList) hmlReviewDocumentActivity.get(), (setContentScrimColor) hmlReviewDocumentActivity.get(), (BottomSheetBehavior) hmlReviewDocumentActivity.get(), (TextRecognizer) hmlReviewDocumentActivity.get(), (complementOf) hmlReviewDocumentActivity.get(), (RegularImmutableBiMap) hmlReviewDocumentActivity.get(), (setStatusBarScrimResource) hmlReviewDocumentActivity.get(), (setTimestampMillis) hmlReviewDocumentActivity.get());
    }
}
