package p040o;

import com.thunderhead.android.api.responsetypes.OneAPIError;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;

/* renamed from: o.FragmentBuilder_BindGiftingPresentTransferInputFragment */
public final /* synthetic */ class FragmentBuilder_BindGiftingPresentTransferInputFragment implements BulkTransferReviewActivity {
    private final /* synthetic */ FragmentBuilder_BindHmlNdidInstructionFragment read;

    public /* synthetic */ FragmentBuilder_BindGiftingPresentTransferInputFragment(FragmentBuilder_BindHmlNdidInstructionFragment fragmentBuilder_BindHmlNdidInstructionFragment) {
        this.read = fragmentBuilder_BindHmlNdidInstructionFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj, MileageAirlineMembershipDetailsActivity mileageAirlineMembershipDetailsActivity) {
        FragmentBuilder_BindHmlNdidInstructionFragment fragmentBuilder_BindHmlNdidInstructionFragment = this.read;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (mileageAirlineMembershipDetailsActivity != null) {
            if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                fragmentBuilder_BindHmlNdidInstructionFragment.read(new OneAPIError(mileageAirlineMembershipDetailsActivity.write));
            }
        } else if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
            fragmentBuilder_BindHmlNdidInstructionFragment.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView.write(baseResponse));
        }
    }
}
