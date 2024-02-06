package com.scb.phone.view.activity.investment.roboadvisor;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RoboAdvisorLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private RoboAdvisorLandingActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public RoboAdvisorLandingActivity_ViewBinding(final RoboAdvisorLandingActivity roboAdvisorLandingActivity, View view) {
        super(roboAdvisorLandingActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = roboAdvisorLandingActivity;
        roboAdvisorLandingActivity.clMainLayout = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cl_main_layout, "field 'clMainLayout'", ConstraintLayout.class);
        roboAdvisorLandingActivity.roboEasyText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_robo_easy_text, "field 'roboEasyText'", TextView.class);
        roboAdvisorLandingActivity.roboReliableText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_robo_reliable_text, "field 'roboReliableText'", TextView.class);
        roboAdvisorLandingActivity.roboManageText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_robo_managae_text, "field 'roboManageText'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_get_started_button, "method 'onGetStartClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RoboAdvisorLandingActivity.this.onGetStartClicked();
            }
        });
    }

    public final void read() {
        RoboAdvisorLandingActivity roboAdvisorLandingActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (roboAdvisorLandingActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            roboAdvisorLandingActivity.clMainLayout = null;
            roboAdvisorLandingActivity.roboEasyText = null;
            roboAdvisorLandingActivity.roboReliableText = null;
            roboAdvisorLandingActivity.roboManageText = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
