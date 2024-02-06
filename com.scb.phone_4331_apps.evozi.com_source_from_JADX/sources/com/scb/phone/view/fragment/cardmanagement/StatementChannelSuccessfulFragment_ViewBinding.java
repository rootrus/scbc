package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class StatementChannelSuccessfulFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private StatementChannelSuccessfulFragment MediaBrowserCompat$ItemReceiver;

    public StatementChannelSuccessfulFragment_ViewBinding(final StatementChannelSuccessfulFragment statementChannelSuccessfulFragment, View view) {
        super(statementChannelSuccessfulFragment, view);
        this.MediaBrowserCompat$ItemReceiver = statementChannelSuccessfulFragment;
        statementChannelSuccessfulFragment.tvDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_date_time, "field 'tvDateTime'", TextView.class);
        statementChannelSuccessfulFragment.tvAddressTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_address_title, "field 'tvAddressTitle'", TextView.class);
        statementChannelSuccessfulFragment.tvSuccessTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_success_title, "field 'tvSuccessTitle'", TextView.class);
        statementChannelSuccessfulFragment.tvAddressOrEmail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_address, "field 'tvAddressOrEmail'", TextView.class);
        statementChannelSuccessfulFragment.tvMaskCardNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mask_card_no, "field 'tvMaskCardNo'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_action_done, "field 'btnDone' and method 'onClickDoneButton'");
        statementChannelSuccessfulFragment.btnDone = (Button) onStart.write(IconCompatParcelizer, R.id.btn_action_done, "field 'btnDone'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                StatementChannelSuccessfulFragment.this.onClickDoneButton();
            }
        });
    }

    public final void read() {
        StatementChannelSuccessfulFragment statementChannelSuccessfulFragment = this.MediaBrowserCompat$ItemReceiver;
        if (statementChannelSuccessfulFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            statementChannelSuccessfulFragment.tvDateTime = null;
            statementChannelSuccessfulFragment.tvAddressTitle = null;
            statementChannelSuccessfulFragment.tvSuccessTitle = null;
            statementChannelSuccessfulFragment.tvAddressOrEmail = null;
            statementChannelSuccessfulFragment.tvMaskCardNo = null;
            statementChannelSuccessfulFragment.btnDone = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
