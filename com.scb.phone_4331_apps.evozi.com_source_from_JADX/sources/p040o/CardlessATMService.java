package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.purchase.FundRedeemSearchListAdapter;

/* renamed from: o.CardlessATMService */
public final /* synthetic */ class CardlessATMService implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ FundRedeemSearchListAdapter MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ CardlessATMService(FundRedeemSearchListAdapter fundRedeemSearchListAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fundRedeemSearchListAdapter;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        FundRedeemSearchListAdapter fundRedeemSearchListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.IconCompatParcelizer;
        FragmentBuilder_BindCloseAccountReviewFragment fragmentBuilder_BindCloseAccountReviewFragment = fundRedeemSearchListAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindCloseAccountReviewFragment != null) {
            fragmentBuilder_BindCloseAccountReviewFragment.read(fundRedeemSearchListAdapter.write.get(i));
        }
    }
}
