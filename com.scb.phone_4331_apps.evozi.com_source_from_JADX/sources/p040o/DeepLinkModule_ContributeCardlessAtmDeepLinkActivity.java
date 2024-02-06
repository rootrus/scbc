package p040o;

import com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesCardInformationFragment;
import p040o.Image;

/* renamed from: o.DeepLinkModule_ContributeCardlessAtmDeepLinkActivity */
public final class DeepLinkModule_ContributeCardlessAtmDeepLinkActivity implements MileageQuantitySelectionActivity<EasycashFeaturesCardInformationFragment> {
    public static void MediaBrowserCompat$CustomActionResultReceiver(EasycashFeaturesCardInformationFragment easycashFeaturesCardInformationFragment, Image.FriendI friendI) {
        easycashFeaturesCardInformationFragment.presenter = friendI;
    }

    public static void write(EasycashFeaturesCardInformationFragment easycashFeaturesCardInformationFragment, forEachClear foreachclear) {
        easycashFeaturesCardInformationFragment.tracker = foreachclear;
    }
}
