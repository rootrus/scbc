package p040o;

import com.scb.phone.R;
import com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getSetupEmail */
public final /* synthetic */ class getSetupEmail implements findFragmentByWho {
    private final /* synthetic */ OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ DepositDetailTransactionFragment read;

    public /* synthetic */ getSetupEmail(DepositDetailTransactionFragment depositDetailTransactionFragment, OffsetDateTime offsetDateTime) {
        this.read = depositDetailTransactionFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime;
    }

    public final Object IconCompatParcelizer(Object obj) {
        DepositDetailTransactionFragment depositDetailTransactionFragment = this.read;
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.getMonth() == offsetDateTime.getMonth()) {
            return depositDetailTransactionFragment.getString(R.string.deposit_detail_filter_this_month);
        }
        return CheckCaptureActivity.read(depositDetailTransactionFragment.getResources(), "MMM yyyy", offsetDateTime);
    }
}
