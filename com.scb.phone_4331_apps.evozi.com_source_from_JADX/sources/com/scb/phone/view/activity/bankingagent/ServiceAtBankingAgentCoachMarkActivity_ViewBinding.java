package com.scb.phone.view.activity.bankingagent;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class ServiceAtBankingAgentCoachMarkActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ServiceAtBankingAgentCoachMarkActivity MediaBrowserCompat$ItemReceiver;

    public ServiceAtBankingAgentCoachMarkActivity_ViewBinding(ServiceAtBankingAgentCoachMarkActivity serviceAtBankingAgentCoachMarkActivity, View view) {
        super(serviceAtBankingAgentCoachMarkActivity, view);
        this.MediaBrowserCompat$ItemReceiver = serviceAtBankingAgentCoachMarkActivity;
        serviceAtBankingAgentCoachMarkActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_coach_mark, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        ServiceAtBankingAgentCoachMarkActivity serviceAtBankingAgentCoachMarkActivity = this.MediaBrowserCompat$ItemReceiver;
        if (serviceAtBankingAgentCoachMarkActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            serviceAtBankingAgentCoachMarkActivity.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
