package p040o;

import android.view.View;
import com.scb.phone.view.adapter.debitatm.DebitWithdrawalLimitAdapter;

/* renamed from: o.validation */
public final /* synthetic */ class C7544validation implements View.OnFocusChangeListener {
    private final /* synthetic */ DebitWithdrawalLimitAdapter.LimitCustomViewHolder IconCompatParcelizer;

    public /* synthetic */ C7544validation(DebitWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder) {
        this.IconCompatParcelizer = limitCustomViewHolder;
    }

    public final void onFocusChange(View view, boolean z) {
        DebitWithdrawalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.IconCompatParcelizer;
        if (!z) {
            limitCustomViewHolder.limitAccountValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(limitCustomViewHolder.limitInput.IconCompatParcelizer));
        }
    }
}
