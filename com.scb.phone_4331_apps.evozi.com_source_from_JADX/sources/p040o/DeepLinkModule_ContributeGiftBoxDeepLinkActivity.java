package p040o;

import com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionDetailFragment;
import p040o.ImagePerfectionProfile;

/* renamed from: o.DeepLinkModule_ContributeGiftBoxDeepLinkActivity */
public final class DeepLinkModule_ContributeGiftBoxDeepLinkActivity implements MileageQuantitySelectionActivity<EBillSubscriptionDetailFragment> {
    public static void IconCompatParcelizer(EBillSubscriptionDetailFragment eBillSubscriptionDetailFragment, ImagePerfectionProfile.UseTargetFrameCrop useTargetFrameCrop) {
        eBillSubscriptionDetailFragment.EBillSubscriptionDetailPresenter = useTargetFrameCrop;
    }
}
