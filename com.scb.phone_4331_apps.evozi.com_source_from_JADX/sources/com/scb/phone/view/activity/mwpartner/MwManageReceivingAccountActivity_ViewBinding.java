package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MwManageReceivingAccountActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private MwManageReceivingAccountActivity MediaBrowserCompat$ItemReceiver;

    public MwManageReceivingAccountActivity_ViewBinding(final MwManageReceivingAccountActivity mwManageReceivingAccountActivity, View view) {
        super(mwManageReceivingAccountActivity, view);
        this.MediaBrowserCompat$ItemReceiver = mwManageReceivingAccountActivity;
        mwManageReceivingAccountActivity.tvWalletId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_wallet_id, "field 'tvWalletId'", TextView.class);
        mwManageReceivingAccountActivity.tvAccountNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_no, "field 'tvAccountNo'", TextView.class);
        mwManageReceivingAccountActivity.tvAccountType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_type, "field 'tvAccountType'", TextView.class);
        mwManageReceivingAccountActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        mwManageReceivingAccountActivity.tvRemake = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remake, "field 'tvRemake'", TextView.class);
        mwManageReceivingAccountActivity.emptyView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_empty, "field 'emptyView'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_change, "field 'btnChange' and method 'onClickChange'");
        mwManageReceivingAccountActivity.btnChange = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_change, "field 'btnChange'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwManageReceivingAccountActivity.this.onClickChange();
            }
        });
        mwManageReceivingAccountActivity.verticalLine = onStart.IconCompatParcelizer(view, R.id.view_vertical_line, "field 'verticalLine'");
    }

    public final void read() {
        MwManageReceivingAccountActivity mwManageReceivingAccountActivity = this.MediaBrowserCompat$ItemReceiver;
        if (mwManageReceivingAccountActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            mwManageReceivingAccountActivity.tvWalletId = null;
            mwManageReceivingAccountActivity.tvAccountNo = null;
            mwManageReceivingAccountActivity.tvAccountType = null;
            mwManageReceivingAccountActivity.recyclerView = null;
            mwManageReceivingAccountActivity.tvRemake = null;
            mwManageReceivingAccountActivity.emptyView = null;
            mwManageReceivingAccountActivity.btnChange = null;
            mwManageReceivingAccountActivity.verticalLine = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
