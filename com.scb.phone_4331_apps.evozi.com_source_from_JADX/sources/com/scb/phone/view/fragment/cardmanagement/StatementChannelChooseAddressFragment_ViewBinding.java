package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.custom.cardmanagement.CustomStatementChannelViewComponent;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class StatementChannelChooseAddressFragment_ViewBinding extends BaseFragment_ViewBinding {
    private StatementChannelChooseAddressFragment IconCompatParcelizer;
    private View write;

    public StatementChannelChooseAddressFragment_ViewBinding(final StatementChannelChooseAddressFragment statementChannelChooseAddressFragment, View view) {
        super(statementChannelChooseAddressFragment, view);
        this.IconCompatParcelizer = statementChannelChooseAddressFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_action_next, "field 'btnNext' and method 'onClickNext'");
        statementChannelChooseAddressFragment.btnNext = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_action_next, "field 'btnNext'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                StatementChannelChooseAddressFragment.this.onClickNext();
            }
        });
        statementChannelChooseAddressFragment.viewAddress = (CustomStatementChannelViewComponent) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_email, "field 'viewAddress'", CustomStatementChannelViewComponent.class);
        statementChannelChooseAddressFragment.viewAddNewAddress = (CustomStatementChannelViewComponent) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_add_email, "field 'viewAddNewAddress'", CustomStatementChannelViewComponent.class);
    }

    public final void read() {
        StatementChannelChooseAddressFragment statementChannelChooseAddressFragment = this.IconCompatParcelizer;
        if (statementChannelChooseAddressFragment != null) {
            this.IconCompatParcelizer = null;
            statementChannelChooseAddressFragment.btnNext = null;
            statementChannelChooseAddressFragment.viewAddress = null;
            statementChannelChooseAddressFragment.viewAddNewAddress = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
