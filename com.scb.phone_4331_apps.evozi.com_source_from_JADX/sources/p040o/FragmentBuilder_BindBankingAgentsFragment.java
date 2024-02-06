package p040o;

import com.scb.phone.view.fragment.transferandpay.transfer.TransferHistoryFragment;

/* renamed from: o.FragmentBuilder_BindBankingAgentsFragment */
public final class FragmentBuilder_BindBankingAgentsFragment implements MileageQuantitySelectionActivity<TransferHistoryFragment> {
    public static void read(TransferHistoryFragment transferHistoryFragment, KtaBillExtractor_Factory ktaBillExtractor_Factory) {
        transferHistoryFragment.presenter = ktaBillExtractor_Factory;
    }
}
