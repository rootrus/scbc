package com.scb.phone.view.activity.ccrredemption.search;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class RewardSearchResultActivity_ViewBinding extends BaseActivity_ViewBinding {
    private RewardSearchResultActivity MediaBrowserCompat$CustomActionResultReceiver;

    public RewardSearchResultActivity_ViewBinding(RewardSearchResultActivity rewardSearchResultActivity, View view) {
        super(rewardSearchResultActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = rewardSearchResultActivity;
        rewardSearchResultActivity.llSearchContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_search_container, "field 'llSearchContainer'", LinearLayout.class);
        rewardSearchResultActivity.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'tvTitle'", TextView.class);
        rewardSearchResultActivity.tvCardPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'tvCardPoints'", TextView.class);
        rewardSearchResultActivity.tvSearchBy = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_search_by, "field 'tvSearchBy'", TextView.class);
        rewardSearchResultActivity.llSearchItems = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_search_items, "field 'llSearchItems'", LinearLayout.class);
        rewardSearchResultActivity.tvSearchItemsFound = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_search_items, "field 'tvSearchItemsFound'", TextView.class);
    }

    public final void read() {
        RewardSearchResultActivity rewardSearchResultActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (rewardSearchResultActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            rewardSearchResultActivity.llSearchContainer = null;
            rewardSearchResultActivity.tvTitle = null;
            rewardSearchResultActivity.tvCardPoints = null;
            rewardSearchResultActivity.tvSearchBy = null;
            rewardSearchResultActivity.llSearchItems = null;
            rewardSearchResultActivity.tvSearchItemsFound = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
