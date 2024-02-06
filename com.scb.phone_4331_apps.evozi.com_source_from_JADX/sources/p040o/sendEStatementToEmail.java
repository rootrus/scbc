package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.fundswitch.FundSwitchSearchListAdapter;
import java.util.List;

/* renamed from: o.sendEStatementToEmail */
public final /* synthetic */ class sendEStatementToEmail implements View.OnClickListener {
    private final /* synthetic */ FundSwitchSearchListAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ sendEStatementToEmail(FundSwitchSearchListAdapter fundSwitchSearchListAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fundSwitchSearchListAdapter;
        this.write = i;
    }

    public final void onClick(View view) {
        FundSwitchSearchListAdapter fundSwitchSearchListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.write;
        FragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment fragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment = fundSwitchSearchListAdapter.read;
        if (fragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment != null) {
            List<DataTransportState> list = fundSwitchSearchListAdapter.write;
            if (list != null) {
                fragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment.write(list.get(i));
            } else {
                fragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment.MediaBrowserCompat$ItemReceiver(fundSwitchSearchListAdapter.MediaBrowserCompat$ItemReceiver.get(i));
            }
        }
    }
}
