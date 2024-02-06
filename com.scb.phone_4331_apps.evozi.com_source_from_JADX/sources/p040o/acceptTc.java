package p040o;

import android.view.View;
import com.scb.phone.view.adapter.demontb.OccupationAdapter;

/* renamed from: o.acceptTc */
public final /* synthetic */ class acceptTc implements View.OnClickListener {
    private final /* synthetic */ OccupationAdapter IconCompatParcelizer;
    private final /* synthetic */ int read;

    public /* synthetic */ acceptTc(OccupationAdapter occupationAdapter, int i) {
        this.IconCompatParcelizer = occupationAdapter;
        this.read = i;
    }

    public final void onClick(View view) {
        OccupationAdapter occupationAdapter = this.IconCompatParcelizer;
        int i = this.read;
        FragmentBuilder_BindCardlessWithdrawAmountFragment fragmentBuilder_BindCardlessWithdrawAmountFragment = occupationAdapter.read;
        if (fragmentBuilder_BindCardlessWithdrawAmountFragment != null) {
            fragmentBuilder_BindCardlessWithdrawAmountFragment.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }
}
