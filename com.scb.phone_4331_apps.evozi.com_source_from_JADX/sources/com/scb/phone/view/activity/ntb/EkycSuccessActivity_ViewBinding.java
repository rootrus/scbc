package com.scb.phone.view.activity.ntb;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EkycSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private EkycSuccessActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public EkycSuccessActivity_ViewBinding(final EkycSuccessActivity ekycSuccessActivity, View view) {
        super(ekycSuccessActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = ekycSuccessActivity;
        ekycSuccessActivity.successTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_success_title, "field 'successTitle'", TextView.class);
        ekycSuccessActivity.textDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'textDateTime'", TextView.class);
        ekycSuccessActivity.textFullName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_full_name, "field 'textFullName'", TextView.class);
        ekycSuccessActivity.textAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_number, "field 'textAccountNumber'", TextView.class);
        ekycSuccessActivity.textHomeBranch = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_home_branch, "field 'textHomeBranch'", TextView.class);
        ekycSuccessActivity.accountTypeLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_account_type, "field 'accountTypeLayout'", LinearLayout.class);
        ekycSuccessActivity.tvAccountType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_type, "field 'tvAccountType'", TextView.class);
        ekycSuccessActivity.remarkLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_remark, "field 'remarkLayout'", LinearLayout.class);
        ekycSuccessActivity.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark, "field 'tvRemark'", TextView.class);
        ekycSuccessActivity.tvFixedRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_redirect_description, "field 'tvFixedRemark'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "method 'onClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EkycSuccessActivity.this.onClick();
            }
        });
    }

    public void read() {
        EkycSuccessActivity ekycSuccessActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (ekycSuccessActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            ekycSuccessActivity.successTitle = null;
            ekycSuccessActivity.textDateTime = null;
            ekycSuccessActivity.textFullName = null;
            ekycSuccessActivity.textAccountNumber = null;
            ekycSuccessActivity.textHomeBranch = null;
            ekycSuccessActivity.accountTypeLayout = null;
            ekycSuccessActivity.tvAccountType = null;
            ekycSuccessActivity.remarkLayout = null;
            ekycSuccessActivity.tvRemark = null;
            ekycSuccessActivity.tvFixedRemark = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
