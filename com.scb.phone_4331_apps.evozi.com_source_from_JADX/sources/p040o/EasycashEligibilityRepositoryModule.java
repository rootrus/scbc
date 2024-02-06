package p040o;

import android.view.View;
import com.scb.phone.view.adapter.accountsummary.LoanViewPagerAdapter;

/* renamed from: o.EasycashEligibilityRepositoryModule */
public final /* synthetic */ class EasycashEligibilityRepositoryModule implements View.OnClickListener {
    private final /* synthetic */ LoanViewPagerAdapter MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ EasycashEligibilityRepositoryModule(LoanViewPagerAdapter loanViewPagerAdapter, int i) {
        this.MediaBrowserCompat$ItemReceiver = loanViewPagerAdapter;
        this.write = i;
    }

    public final void onClick(View view) {
        LoanViewPagerAdapter loanViewPagerAdapter = this.MediaBrowserCompat$ItemReceiver;
        int i = this.write;
        FragmentBuilder_BindBaseReplaceableFragment fragmentBuilder_BindBaseReplaceableFragment = loanViewPagerAdapter.write;
        if (fragmentBuilder_BindBaseReplaceableFragment != null) {
            fragmentBuilder_BindBaseReplaceableFragment.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }
}
