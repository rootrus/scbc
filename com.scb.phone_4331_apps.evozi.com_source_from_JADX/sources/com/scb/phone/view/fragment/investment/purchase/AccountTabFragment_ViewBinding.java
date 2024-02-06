package com.scb.phone.view.fragment.investment.purchase;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class AccountTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private AccountTabFragment IconCompatParcelizer;

    public AccountTabFragment_ViewBinding(AccountTabFragment accountTabFragment, View view) {
        super(accountTabFragment, view);
        this.IconCompatParcelizer = accountTabFragment;
        accountTabFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'mViewPager'", ViewPager.class);
        accountTabFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        accountTabFragment.mEmptyContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mEmptyContainer'", RelativeLayout.class);
        accountTabFragment.mErrorContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_card_error, "field 'mErrorContainer'", LinearLayout.class);
        accountTabFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        accountTabFragment.mEmptyCenterTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_center_text_view, "field 'mEmptyCenterTitle'", TextView.class);
        accountTabFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        accountTabFragment.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
    }

    public final void read() {
        AccountTabFragment accountTabFragment = this.IconCompatParcelizer;
        if (accountTabFragment != null) {
            this.IconCompatParcelizer = null;
            accountTabFragment.mViewPager = null;
            accountTabFragment.mCircleIndicator = null;
            accountTabFragment.mEmptyContainer = null;
            accountTabFragment.mErrorContainer = null;
            accountTabFragment.mEmptyTitle = null;
            accountTabFragment.mEmptyCenterTitle = null;
            accountTabFragment.mEmptyDescription = null;
            accountTabFragment.mEmptyImage = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
