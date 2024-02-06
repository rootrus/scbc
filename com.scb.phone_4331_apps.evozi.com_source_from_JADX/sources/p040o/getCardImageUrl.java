package p040o;

import com.scb.phone.view.adapter.investment.assessment.RiskLevelsAdapter;

/* renamed from: o.getCardImageUrl */
public final /* synthetic */ class getCardImageUrl implements FragmentBuilder_BindCategoriesListFragment {
    private final /* synthetic */ RiskLevelsAdapter IconCompatParcelizer;

    public /* synthetic */ getCardImageUrl(RiskLevelsAdapter riskLevelsAdapter) {
        this.IconCompatParcelizer = riskLevelsAdapter;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        RiskLevelsAdapter riskLevelsAdapter = this.IconCompatParcelizer;
        riskLevelsAdapter.MediaBrowserCompat$ItemReceiver = ((Integer) obj).intValue();
        riskLevelsAdapter.IconCompatParcelizer.write();
        riskLevelsAdapter.write.MediaBrowserCompat$ItemReceiver(riskLevelsAdapter.read.get(riskLevelsAdapter.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver);
    }
}
