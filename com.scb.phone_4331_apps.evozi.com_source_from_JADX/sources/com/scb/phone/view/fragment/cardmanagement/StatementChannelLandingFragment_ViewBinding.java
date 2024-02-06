package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class StatementChannelLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private StatementChannelLandingFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public StatementChannelLandingFragment_ViewBinding(final StatementChannelLandingFragment statementChannelLandingFragment, View view) {
        super(statementChannelLandingFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = statementChannelLandingFragment;
        statementChannelLandingFragment.tvRemarkSelectNewChannel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark_select_new_channel, "field 'tvRemarkSelectNewChannel'", TextView.class);
        statementChannelLandingFragment.viewChannel = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.channel, "field 'viewChannel'", CustomTransferAndPayItem.class);
        statementChannelLandingFragment.tvSendToTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_send_to_title, "field 'tvSendToTitle'", TextView.class);
        statementChannelLandingFragment.tvSendTo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_send_to, "field 'tvSendTo'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.iv_email_edit, "field 'ivEmailEdit' and method 'onClickEditEmail'");
        statementChannelLandingFragment.ivEmailEdit = (ImageView) onStart.write(IconCompatParcelizer, R.id.iv_email_edit, "field 'ivEmailEdit'", ImageView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                StatementChannelLandingFragment.this.onClickEditEmail();
            }
        });
        statementChannelLandingFragment.remarkSelectLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remark_new_select_layout, "field 'remarkSelectLayout'", LinearLayout.class);
        statementChannelLandingFragment.sendToLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.send_to_layout, "field 'sendToLayout'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_action_next, "field 'btnNext' and method 'onClickNext'");
        statementChannelLandingFragment.btnNext = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_action_next, "field 'btnNext'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                StatementChannelLandingFragment.this.onClickNext();
            }
        });
        statementChannelLandingFragment.rootLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_layout, "field 'rootLayout'", LinearLayout.class);
        statementChannelLandingFragment.itemChannelSelectLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_channel_select_layout, "field 'itemChannelSelectLayout'", LinearLayout.class);
    }

    public final void read() {
        StatementChannelLandingFragment statementChannelLandingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (statementChannelLandingFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            statementChannelLandingFragment.tvRemarkSelectNewChannel = null;
            statementChannelLandingFragment.viewChannel = null;
            statementChannelLandingFragment.tvSendToTitle = null;
            statementChannelLandingFragment.tvSendTo = null;
            statementChannelLandingFragment.ivEmailEdit = null;
            statementChannelLandingFragment.remarkSelectLayout = null;
            statementChannelLandingFragment.sendToLayout = null;
            statementChannelLandingFragment.btnNext = null;
            statementChannelLandingFragment.rootLayout = null;
            statementChannelLandingFragment.itemChannelSelectLayout = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
