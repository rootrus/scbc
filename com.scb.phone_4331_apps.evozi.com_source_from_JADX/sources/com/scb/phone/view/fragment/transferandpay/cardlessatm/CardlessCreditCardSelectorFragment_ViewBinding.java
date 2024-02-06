package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public final class CardlessCreditCardSelectorFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CardlessCreditCardSelectorFragment IconCompatParcelizer;

    public CardlessCreditCardSelectorFragment_ViewBinding(CardlessCreditCardSelectorFragment cardlessCreditCardSelectorFragment, View view) {
        super(cardlessCreditCardSelectorFragment, view);
        this.IconCompatParcelizer = cardlessCreditCardSelectorFragment;
        cardlessCreditCardSelectorFragment.layoutCards = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_cards, "field 'layoutCards'", LinearLayout.class);
        cardlessCreditCardSelectorFragment.layoutNoCard = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_no_card, "field 'layoutNoCard'", LinearLayout.class);
        cardlessCreditCardSelectorFragment.layoutError = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_error, "field 'layoutError'", LinearLayout.class);
        cardlessCreditCardSelectorFragment.errorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_title, "field 'errorTitle'", TextView.class);
        cardlessCreditCardSelectorFragment.errorDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_description, "field 'errorDescription'", TextView.class);
        cardlessCreditCardSelectorFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'mViewPager'", ViewPager.class);
        cardlessCreditCardSelectorFragment.mIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mIndicator'", CircleIndicator.class);
    }

    public final void read() {
        CardlessCreditCardSelectorFragment cardlessCreditCardSelectorFragment = this.IconCompatParcelizer;
        if (cardlessCreditCardSelectorFragment != null) {
            this.IconCompatParcelizer = null;
            cardlessCreditCardSelectorFragment.layoutCards = null;
            cardlessCreditCardSelectorFragment.layoutNoCard = null;
            cardlessCreditCardSelectorFragment.layoutError = null;
            cardlessCreditCardSelectorFragment.errorTitle = null;
            cardlessCreditCardSelectorFragment.errorDescription = null;
            cardlessCreditCardSelectorFragment.mViewPager = null;
            cardlessCreditCardSelectorFragment.mIndicator = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
