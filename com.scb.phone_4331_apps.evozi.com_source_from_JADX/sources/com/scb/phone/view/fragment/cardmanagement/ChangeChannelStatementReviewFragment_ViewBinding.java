package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ChangeChannelStatementReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ChangeChannelStatementReviewFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public ChangeChannelStatementReviewFragment_ViewBinding(final ChangeChannelStatementReviewFragment changeChannelStatementReviewFragment, View view) {
        super(changeChannelStatementReviewFragment, view);
        this.MediaBrowserCompat$ItemReceiver = changeChannelStatementReviewFragment;
        changeChannelStatementReviewFragment.tvAddressTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_address_title, "field 'tvAddressTitle'", TextView.class);
        changeChannelStatementReviewFragment.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_review_remark, "field 'tvRemark'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.change_address_button, "field 'changeAddressButton' and method 'onClickChangeAddress'");
        changeChannelStatementReviewFragment.changeAddressButton = (TextView) onStart.write(IconCompatParcelizer, R.id.change_address_button, "field 'changeAddressButton'", TextView.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChangeChannelStatementReviewFragment.this.onClickChangeAddress();
            }
        });
        changeChannelStatementReviewFragment.tvMaskCardNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mask_card_no, "field 'tvMaskCardNo'", TextView.class);
        changeChannelStatementReviewFragment.tvAddress = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_address, "field 'tvAddress'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_ok, "method 'onClickOk'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChangeChannelStatementReviewFragment.this.onClickOk();
            }
        });
    }

    public final void read() {
        ChangeChannelStatementReviewFragment changeChannelStatementReviewFragment = this.MediaBrowserCompat$ItemReceiver;
        if (changeChannelStatementReviewFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            changeChannelStatementReviewFragment.tvAddressTitle = null;
            changeChannelStatementReviewFragment.tvRemark = null;
            changeChannelStatementReviewFragment.changeAddressButton = null;
            changeChannelStatementReviewFragment.tvMaskCardNo = null;
            changeChannelStatementReviewFragment.tvAddress = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
