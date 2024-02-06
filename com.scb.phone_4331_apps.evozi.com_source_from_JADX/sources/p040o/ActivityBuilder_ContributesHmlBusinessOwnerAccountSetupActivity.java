package p040o;

import androidx.core.widget.NestedScrollView;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.transferandpay.TransferTabFragment;
import com.scb.phone.view.fragment.transferandpay.fixedtransfer.FixedTransferTargetTabFragment;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferHistoryFragment;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferTargetTabFragment;

/* renamed from: o.ActivityBuilder_ContributesHmlBusinessOwnerAccountSetupActivity */
public final /* synthetic */ class ActivityBuilder_ContributesHmlBusinessOwnerAccountSetupActivity implements NestedScrollView.IconCompatParcelizer {
    private final /* synthetic */ TransferTabFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributesHmlBusinessOwnerAccountSetupActivity(TransferTabFragment transferTabFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = transferTabFragment;
    }

    public final void write(NestedScrollView nestedScrollView, int i, int i2) {
        addRecipientsToGroup addrecipientstogroup;
        TransferHistoryFragment transferHistoryFragment;
        FragmentWrapContentViewPager fragmentWrapContentViewPager;
        getRequestInfoIncome getrequestinfoincome;
        TransferHistoryFragment transferHistoryFragment2;
        TransferTabFragment transferTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i >= i2 && i >= (nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) - 250) {
            TransferTargetTabFragment transferTargetTabFragment = transferTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
            if (!(transferTargetTabFragment == null || (fragmentWrapContentViewPager = transferTargetTabFragment.mTabPager) == null || fragmentWrapContentViewPager.getCurrentItem() != 2 || (getrequestinfoincome = transferTargetTabFragment.IconCompatParcelizer) == null || (transferHistoryFragment2 = getrequestinfoincome.write) == null || !transferHistoryFragment2.IconCompatParcelizer || transferHistoryFragment2.isDetached())) {
                transferHistoryFragment2.IconCompatParcelizer = false;
                transferHistoryFragment2.MediaDescriptionCompat().write();
            }
            FixedTransferTargetTabFragment fixedTransferTargetTabFragment = transferTabFragment.IconCompatParcelizer;
            if (fixedTransferTargetTabFragment != null && (addrecipientstogroup = fixedTransferTargetTabFragment.MediaBrowserCompat$CustomActionResultReceiver) != null && (transferHistoryFragment = addrecipientstogroup.MediaBrowserCompat$ItemReceiver) != null && transferHistoryFragment.IconCompatParcelizer && !transferHistoryFragment.isDetached()) {
                transferHistoryFragment.IconCompatParcelizer = false;
                transferHistoryFragment.MediaDescriptionCompat().write();
            }
        }
    }
}
