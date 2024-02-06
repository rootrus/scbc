package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MwChangeCasaSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private MwChangeCasaSuccessActivity write;

    public MwChangeCasaSuccessActivity_ViewBinding(final MwChangeCasaSuccessActivity mwChangeCasaSuccessActivity, View view) {
        super(mwChangeCasaSuccessActivity, view);
        this.write = mwChangeCasaSuccessActivity;
        mwChangeCasaSuccessActivity.tvWalletId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_wallet_id, "field 'tvWalletId'", TextView.class);
        mwChangeCasaSuccessActivity.tvAccountNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_no, "field 'tvAccountNo'", TextView.class);
        mwChangeCasaSuccessActivity.tvAccountType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_type, "field 'tvAccountType'", TextView.class);
        mwChangeCasaSuccessActivity.tvNickName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_nickname, "field 'tvNickName'", TextView.class);
        mwChangeCasaSuccessActivity.tvDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'tvDateTime'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_done, "method 'onClickDone'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwChangeCasaSuccessActivity.this.onClickDone();
            }
        });
    }

    public final void read() {
        MwChangeCasaSuccessActivity mwChangeCasaSuccessActivity = this.write;
        if (mwChangeCasaSuccessActivity != null) {
            this.write = null;
            mwChangeCasaSuccessActivity.tvWalletId = null;
            mwChangeCasaSuccessActivity.tvAccountNo = null;
            mwChangeCasaSuccessActivity.tvAccountType = null;
            mwChangeCasaSuccessActivity.tvNickName = null;
            mwChangeCasaSuccessActivity.tvDateTime = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
