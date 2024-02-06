package p040o;

import com.scb.phone.view.fragment.transferandpay.transfer.TransferInputAmountFragment;

/* renamed from: o.FragmentBuilder_BindBankingAgentSelectedFragment */
public final class FragmentBuilder_BindBankingAgentSelectedFragment implements MileageQuantitySelectionActivity<TransferInputAmountFragment> {
    public static void MediaBrowserCompat$ItemReceiver(TransferInputAmountFragment transferInputAmountFragment, IBillExtractorListener iBillExtractorListener) {
        transferInputAmountFragment.presenter = iBillExtractorListener;
    }
}
