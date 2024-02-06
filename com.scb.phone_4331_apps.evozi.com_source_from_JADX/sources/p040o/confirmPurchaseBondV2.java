package p040o;

import android.view.View;
import com.scb.phone.view.adapter.etb.ETBSaleSheetAccountTypeAdapter;

/* renamed from: o.confirmPurchaseBondV2 */
public final /* synthetic */ class confirmPurchaseBondV2 implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ ETBSaleSheetAccountTypeAdapter MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ confirmPurchaseBondV2(ETBSaleSheetAccountTypeAdapter eTBSaleSheetAccountTypeAdapter, int i) {
        this.MediaBrowserCompat$ItemReceiver = eTBSaleSheetAccountTypeAdapter;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        ETBSaleSheetAccountTypeAdapter eTBSaleSheetAccountTypeAdapter = this.MediaBrowserCompat$ItemReceiver;
        int i = this.IconCompatParcelizer;
        FragmentBuilder_BindBondPurchaseSuccessFragment fragmentBuilder_BindBondPurchaseSuccessFragment = eTBSaleSheetAccountTypeAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindBondPurchaseSuccessFragment != null) {
            fragmentBuilder_BindBondPurchaseSuccessFragment.IconCompatParcelizer(eTBSaleSheetAccountTypeAdapter.write.get(i));
        }
    }
}
