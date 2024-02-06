package com.scb.phone.view.fragment.investment.purchase;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class CreditCardTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CreditCardTabFragment write;

    public CreditCardTabFragment_ViewBinding(CreditCardTabFragment creditCardTabFragment, View view) {
        super(creditCardTabFragment, view);
        this.write = creditCardTabFragment;
        creditCardTabFragment.mViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'mViewPager'", NoSwipeViewPager.class);
        creditCardTabFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        creditCardTabFragment.mEmptyContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mEmptyContainer'", RelativeLayout.class);
        creditCardTabFragment.mErrorContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_card_error, "field 'mErrorContainer'", LinearLayout.class);
        creditCardTabFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        creditCardTabFragment.mEmptyCenterTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_center_text_view, "field 'mEmptyCenterTitle'", TextView.class);
        creditCardTabFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        creditCardTabFragment.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
    }

    public final void read() {
        CreditCardTabFragment creditCardTabFragment = this.write;
        if (creditCardTabFragment != null) {
            this.write = null;
            creditCardTabFragment.mViewPager = null;
            creditCardTabFragment.mCircleIndicator = null;
            creditCardTabFragment.mEmptyContainer = null;
            creditCardTabFragment.mErrorContainer = null;
            creditCardTabFragment.mEmptyTitle = null;
            creditCardTabFragment.mEmptyCenterTitle = null;
            creditCardTabFragment.mEmptyDescription = null;
            creditCardTabFragment.mEmptyImage = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
