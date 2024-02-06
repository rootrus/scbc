package p040o;

import com.scb.phone.view.adapter.cardmanagement.DeejungInstallmentsReviewAdapter;

/* renamed from: o.confirmPayment */
public final /* synthetic */ class confirmPayment implements getObjectives {
    private final /* synthetic */ DeejungInstallmentsReviewAdapter.ReviewBottomViewHolder write;

    public /* synthetic */ confirmPayment(DeejungInstallmentsReviewAdapter.ReviewBottomViewHolder reviewBottomViewHolder) {
        this.write = reviewBottomViewHolder;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.write.confirmButton.setEnabled(this.write.txvTermAndConditions.termsCheckBox.isChecked());
    }
}
