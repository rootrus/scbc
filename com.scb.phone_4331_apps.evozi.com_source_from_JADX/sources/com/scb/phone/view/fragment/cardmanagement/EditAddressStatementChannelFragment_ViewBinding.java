package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class EditAddressStatementChannelFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EditAddressStatementChannelFragment IconCompatParcelizer;

    public EditAddressStatementChannelFragment_ViewBinding(EditAddressStatementChannelFragment editAddressStatementChannelFragment, View view) {
        super(editAddressStatementChannelFragment, view);
        this.IconCompatParcelizer = editAddressStatementChannelFragment;
        editAddressStatementChannelFragment.tvErrorMsg = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_error_page_msg, "field 'tvErrorMsg'", TextView.class);
    }

    public final void read() {
        EditAddressStatementChannelFragment editAddressStatementChannelFragment = this.IconCompatParcelizer;
        if (editAddressStatementChannelFragment != null) {
            this.IconCompatParcelizer = null;
            editAddressStatementChannelFragment.tvErrorMsg = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
