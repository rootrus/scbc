package com.scb.phone.view.fragment.requesttopay;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class PromptPayTargetSelectFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PromptPayTargetSelectFragment IconCompatParcelizer;

    public PromptPayTargetSelectFragment_ViewBinding(PromptPayTargetSelectFragment promptPayTargetSelectFragment, View view) {
        super(promptPayTargetSelectFragment, view);
        this.IconCompatParcelizer = promptPayTargetSelectFragment;
        promptPayTargetSelectFragment.mViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_select_view_pager, "field 'mViewPager'", NoSwipeViewPager.class);
        promptPayTargetSelectFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_select_indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        promptPayTargetSelectFragment.mAccountSourceLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_account_source, "field 'mAccountSourceLayout'", LinearLayout.class);
        promptPayTargetSelectFragment.mEmptyCard = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mEmptyCard'", LinearLayout.class);
        promptPayTargetSelectFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        promptPayTargetSelectFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
    }

    public final void read() {
        PromptPayTargetSelectFragment promptPayTargetSelectFragment = this.IconCompatParcelizer;
        if (promptPayTargetSelectFragment != null) {
            this.IconCompatParcelizer = null;
            promptPayTargetSelectFragment.mViewPager = null;
            promptPayTargetSelectFragment.mCircleIndicator = null;
            promptPayTargetSelectFragment.mAccountSourceLayout = null;
            promptPayTargetSelectFragment.mEmptyCard = null;
            promptPayTargetSelectFragment.mEmptyTitle = null;
            promptPayTargetSelectFragment.mEmptyDescription = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
