package p040o;

import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessSuccessfulRequestFragment;

/* renamed from: o.ActivityBuilder_ScbsOnboardingProductCatalog */
public final class ActivityBuilder_ScbsOnboardingProductCatalog implements MileageQuantitySelectionActivity<CardlessSuccessfulRequestFragment> {
    public static void MediaBrowserCompat$CustomActionResultReceiver(CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment, setExtract setextract) {
        cardlessSuccessfulRequestFragment.cardlessATMSuccesfulRequestPresenter = setextract;
    }

    public static void MediaBrowserCompat$ItemReceiver(CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment, setTabTitleTextAppearance settabtitletextappearance) {
        cardlessSuccessfulRequestFragment.cardlessScreenshotHelper = settabtitletextappearance;
    }
}
