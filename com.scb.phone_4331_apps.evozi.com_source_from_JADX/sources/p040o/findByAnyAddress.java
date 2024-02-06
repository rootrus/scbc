package p040o;

import com.scb.phone.R;
import com.scb.phone.view.adapter.debitatm.PurchaseWithdrawalLimitAdapter;
import com.scb.phone.view.custom.common.CustomDeltaInput;

/* renamed from: o.findByAnyAddress */
public final /* synthetic */ class findByAnyAddress implements CustomDeltaInput.read {
    private final /* synthetic */ PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder read;

    public /* synthetic */ findByAnyAddress(PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder) {
        this.read = limitCustomViewHolder;
    }

    public final void write(double d, boolean z) {
        PurchaseWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.read;
        limitCustomViewHolder.limitDoneTextButton.setEnabled(z);
        if (limitCustomViewHolder.write.getContext() != null) {
            limitCustomViewHolder.limitDoneTextButton.setTextColor(setLastBaselineToBottomHeight.read(limitCustomViewHolder.write.getContext(), z ? R.color.f67252131099881 : R.color.f67262131099882));
        }
    }
}
