package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ChangeChannelStatementApplyAllFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$SearchResultReceiver;
    private ChangeChannelStatementApplyAllFragment write;

    public ChangeChannelStatementApplyAllFragment_ViewBinding(final ChangeChannelStatementApplyAllFragment changeChannelStatementApplyAllFragment, View view) {
        super(changeChannelStatementApplyAllFragment, view);
        this.write = changeChannelStatementApplyAllFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_action_next, "field 'btnNext' and method 'onClickNext'");
        changeChannelStatementApplyAllFragment.btnNext = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_action_next, "field 'btnNext'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChangeChannelStatementApplyAllFragment.this.onClickNext();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.ckb_select_all, "field 'ckbSelectAll' and method 'onClickSelectAll'");
        changeChannelStatementApplyAllFragment.ckbSelectAll = (CheckBox) onStart.write(IconCompatParcelizer3, R.id.ckb_select_all, "field 'ckbSelectAll'", CheckBox.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChangeChannelStatementApplyAllFragment.this.onClickSelectAll();
            }
        });
        changeChannelStatementApplyAllFragment.viewCardLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_card_layout, "field 'viewCardLayout'", LinearLayout.class);
        changeChannelStatementApplyAllFragment.ckbSelectAllLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ckb_select_all_layout, "field 'ckbSelectAllLayout'", LinearLayout.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.ckb_no, "field 'ckbNo' and method 'onClickNo'");
        changeChannelStatementApplyAllFragment.ckbNo = (RadioButton) onStart.write(IconCompatParcelizer4, R.id.ckb_no, "field 'ckbNo'", RadioButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChangeChannelStatementApplyAllFragment.this.onClickNo();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.ckb_yes, "field 'ckbYes' and method 'onClickYes'");
        changeChannelStatementApplyAllFragment.ckbYes = (RadioButton) onStart.write(IconCompatParcelizer5, R.id.ckb_yes, "field 'ckbYes'", RadioButton.class);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChangeChannelStatementApplyAllFragment.this.onClickYes();
            }
        });
    }

    public final void read() {
        ChangeChannelStatementApplyAllFragment changeChannelStatementApplyAllFragment = this.write;
        if (changeChannelStatementApplyAllFragment != null) {
            this.write = null;
            changeChannelStatementApplyAllFragment.btnNext = null;
            changeChannelStatementApplyAllFragment.ckbSelectAll = null;
            changeChannelStatementApplyAllFragment.viewCardLayout = null;
            changeChannelStatementApplyAllFragment.ckbSelectAllLayout = null;
            changeChannelStatementApplyAllFragment.ckbNo = null;
            changeChannelStatementApplyAllFragment.ckbYes = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
