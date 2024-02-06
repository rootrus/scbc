package p040o;

import com.scb.phone.R;
import com.scb.phone.view.adapter.debitatm.DebitWithdrawalLimitAdapter;
import com.scb.phone.view.custom.common.CustomDeltaInput;

/* renamed from: o.verification */
public final /* synthetic */ class verification implements CustomDeltaInput.read {
    private final /* synthetic */ DebitWithdrawalLimitAdapter.LimitCustomViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ verification(DebitWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = limitCustomViewHolder;
    }

    public final void write(double d, boolean z) {
        DebitWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        limitCustomViewHolder.limitDoneTextButton.setEnabled(z);
        if (limitCustomViewHolder.write.getContext() != null) {
            limitCustomViewHolder.limitDoneTextButton.setTextColor(setLastBaselineToBottomHeight.read(limitCustomViewHolder.write.getContext(), z ? R.color.f67252131099881 : R.color.f67262131099882));
        }
    }
}
