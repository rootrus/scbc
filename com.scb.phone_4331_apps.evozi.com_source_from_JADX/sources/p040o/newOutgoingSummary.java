package p040o;

import com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferInstallmentReviewBottomFragment;

/* renamed from: o.newOutgoingSummary */
public final /* synthetic */ class newOutgoingSummary implements getObjectives {
    private final /* synthetic */ DeejungTransferInstallmentReviewBottomFragment write;

    public /* synthetic */ newOutgoingSummary(DeejungTransferInstallmentReviewBottomFragment deejungTransferInstallmentReviewBottomFragment) {
        this.write = deejungTransferInstallmentReviewBottomFragment;
    }

    public final void IconCompatParcelizer(boolean z) {
        DeejungTransferInstallmentReviewBottomFragment deejungTransferInstallmentReviewBottomFragment = this.write;
        deejungTransferInstallmentReviewBottomFragment.confirmButton.setEnabled(deejungTransferInstallmentReviewBottomFragment.txvTermAndConditions.termsCheckBox.isChecked());
    }
}
