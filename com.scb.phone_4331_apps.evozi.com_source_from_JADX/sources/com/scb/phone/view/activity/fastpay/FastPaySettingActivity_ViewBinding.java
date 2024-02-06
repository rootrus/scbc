package com.scb.phone.view.activity.fastpay;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomDeltaInput;
import p040o.onCreateDialog;
import p040o.onStart;

public class FastPaySettingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private FastPaySettingActivity write;

    public FastPaySettingActivity_ViewBinding(final FastPaySettingActivity fastPaySettingActivity, View view) {
        super(fastPaySettingActivity, view);
        this.write = fastPaySettingActivity;
        fastPaySettingActivity.textFastPaySettingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_fast_pay_setting_limit, "field 'textFastPaySettingLimit'", TextView.class);
        fastPaySettingActivity.cdiFastPaySettingLimitAmount = (CustomDeltaInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cdi_fast_pay_setting_limit_amount, "field 'cdiFastPaySettingLimitAmount'", CustomDeltaInput.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_action, "field 'btnAction' and method 'onSaveButtonClick'");
        fastPaySettingActivity.btnAction = (Button) onStart.write(IconCompatParcelizer, R.id.btn_action, "field 'btnAction'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FastPaySettingActivity.this.onSaveButtonClick(view);
            }
        });
    }

    public final void read() {
        FastPaySettingActivity fastPaySettingActivity = this.write;
        if (fastPaySettingActivity != null) {
            this.write = null;
            fastPaySettingActivity.textFastPaySettingLimit = null;
            fastPaySettingActivity.cdiFastPaySettingLimitAmount = null;
            fastPaySettingActivity.btnAction = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
