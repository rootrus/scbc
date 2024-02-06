package p040o;

import com.scb.phone.view.fragment.profilemanagement.manageaccounts.AccountManagementSuccessFragment;
import p040o.VideoPlayerCameraPlayer;

/* renamed from: o.ActivityBuilder_ContributeMailingAddressReviewActivity */
public final class ActivityBuilder_ContributeMailingAddressReviewActivity implements MileageQuantitySelectionActivity<AccountManagementSuccessFragment> {
    public static void IconCompatParcelizer(AccountManagementSuccessFragment accountManagementSuccessFragment, VideoPlayerCameraPlayer.OnCompleteListener onCompleteListener) {
        accountManagementSuccessFragment.presenter = onCompleteListener;
    }
}
