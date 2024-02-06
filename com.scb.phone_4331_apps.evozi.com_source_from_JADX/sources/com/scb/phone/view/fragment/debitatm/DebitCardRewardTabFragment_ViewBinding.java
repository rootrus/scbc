package com.scb.phone.view.fragment.debitatm;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DebitCardRewardTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DebitCardRewardTabFragment MediaBrowserCompat$CustomActionResultReceiver;

    public DebitCardRewardTabFragment_ViewBinding(DebitCardRewardTabFragment debitCardRewardTabFragment, View view) {
        super(debitCardRewardTabFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardRewardTabFragment;
        debitCardRewardTabFragment.tvYouHave = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_you_have, "field 'tvYouHave'", TextView.class);
        debitCardRewardTabFragment.tvPointValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_point_value, "field 'tvPointValue'", TextView.class);
        debitCardRewardTabFragment.tvUnable = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_unable, "field 'tvUnable'", TextView.class);
        debitCardRewardTabFragment.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark, "field 'tvRemark'", TextView.class);
    }

    public final void read() {
        DebitCardRewardTabFragment debitCardRewardTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (debitCardRewardTabFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            debitCardRewardTabFragment.tvYouHave = null;
            debitCardRewardTabFragment.tvPointValue = null;
            debitCardRewardTabFragment.tvUnable = null;
            debitCardRewardTabFragment.tvRemark = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
