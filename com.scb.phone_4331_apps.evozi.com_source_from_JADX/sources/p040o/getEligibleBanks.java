package p040o;

import android.view.View;
import com.scb.phone.view.adapter.creditcard.CoachMarkViewPagerAdapter;
import com.scb.phone.view.fragment.creditcard.CreditCardDetailFragment;

/* renamed from: o.getEligibleBanks */
public final /* synthetic */ class getEligibleBanks implements CoachMarkViewPagerAdapter.read {
    private final /* synthetic */ CreditCardDetailFragment read;

    public /* synthetic */ getEligibleBanks(CreditCardDetailFragment creditCardDetailFragment) {
        this.read = creditCardDetailFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        CreditCardDetailFragment creditCardDetailFragment = this.read;
        int currentItem = creditCardDetailFragment.creditCardCoachMarkViewPager.getCurrentItem() + 1;
        if (creditCardDetailFragment.creditCardCoachMarkViewPager.getAdapter() == null || currentItem >= creditCardDetailFragment.creditCardCoachMarkViewPager.getAdapter().getCount()) {
            creditCardDetailFragment.creditCardTutorialContainer.setVisibility(8);
        } else {
            creditCardDetailFragment.creditCardCoachMarkViewPager.setCurrentItem(currentItem);
        }
    }
}
