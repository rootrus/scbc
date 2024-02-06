package com.scb.phone.view.activity.hml;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlBaseEmailAboutActivity_ViewBinding extends BaseActivity_ViewBinding {
    private HmlBaseEmailAboutActivity IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public HmlBaseEmailAboutActivity_ViewBinding(final HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity, View view) {
        super(hmlBaseEmailAboutActivity, view);
        this.IconCompatParcelizer = hmlBaseEmailAboutActivity;
        hmlBaseEmailAboutActivity.header = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_header, "field 'header'", TextView.class);
        hmlBaseEmailAboutActivity.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_description, "field 'description'", TextView.class);
        hmlBaseEmailAboutActivity.instructionsHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_instructions_header, "field 'instructionsHeader'", TextView.class);
        hmlBaseEmailAboutActivity.editEmailHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_edit_email_header, "field 'editEmailHeader'", TextView.class);
        hmlBaseEmailAboutActivity.editEmailDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_edit_email_description, "field 'editEmailDescription'", TextView.class);
        hmlBaseEmailAboutActivity.verifyEmailHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_verify_email_header, "field 'verifyEmailHeader'", TextView.class);
        hmlBaseEmailAboutActivity.verifyEmailDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_verify_email_description, "field 'verifyEmailDescription'", TextView.class);
        hmlBaseEmailAboutActivity.returnHomeHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_return_home_header, "field 'returnHomeHeader'", TextView.class);
        hmlBaseEmailAboutActivity.returnHomeDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_return_home_description, "field 'returnHomeDescription'", TextView.class);
        hmlBaseEmailAboutActivity.selectBannerHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_select_banner_header, "field 'selectBannerHeader'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_settings, "field 'settingsButton' and method 'onButtonSettingsClick'");
        hmlBaseEmailAboutActivity.settingsButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_settings, "field 'settingsButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBaseEmailAboutActivity.this.onButtonSettingsClick();
            }
        });
    }

    public final void read() {
        HmlBaseEmailAboutActivity hmlBaseEmailAboutActivity = this.IconCompatParcelizer;
        if (hmlBaseEmailAboutActivity != null) {
            this.IconCompatParcelizer = null;
            hmlBaseEmailAboutActivity.header = null;
            hmlBaseEmailAboutActivity.description = null;
            hmlBaseEmailAboutActivity.instructionsHeader = null;
            hmlBaseEmailAboutActivity.editEmailHeader = null;
            hmlBaseEmailAboutActivity.editEmailDescription = null;
            hmlBaseEmailAboutActivity.verifyEmailHeader = null;
            hmlBaseEmailAboutActivity.verifyEmailDescription = null;
            hmlBaseEmailAboutActivity.returnHomeHeader = null;
            hmlBaseEmailAboutActivity.returnHomeDescription = null;
            hmlBaseEmailAboutActivity.selectBannerHeader = null;
            hmlBaseEmailAboutActivity.settingsButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
