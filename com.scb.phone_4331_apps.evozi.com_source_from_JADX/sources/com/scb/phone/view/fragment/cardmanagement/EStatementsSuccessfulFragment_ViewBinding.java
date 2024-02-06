package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class EStatementsSuccessfulFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private EStatementsSuccessfulFragment write;

    public EStatementsSuccessfulFragment_ViewBinding(final EStatementsSuccessfulFragment eStatementsSuccessfulFragment, View view) {
        super(eStatementsSuccessfulFragment, view);
        this.write = eStatementsSuccessfulFragment;
        eStatementsSuccessfulFragment.viewAccount = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account, "field 'viewAccount'", CustomTransferAndPaySource.class);
        eStatementsSuccessfulFragment.viewBillCycle = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cycle, "field 'viewBillCycle'", CustomNoteItem.class);
        eStatementsSuccessfulFragment.viewSendTo = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sent_to, "field 'viewSendTo'", CustomTransferAndPayItem.class);
        eStatementsSuccessfulFragment.textDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_description, "field 'textDescription'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onClickReturnButton'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EStatementsSuccessfulFragment.this.onClickReturnButton();
            }
        });
    }

    public final void read() {
        EStatementsSuccessfulFragment eStatementsSuccessfulFragment = this.write;
        if (eStatementsSuccessfulFragment != null) {
            this.write = null;
            eStatementsSuccessfulFragment.viewAccount = null;
            eStatementsSuccessfulFragment.viewBillCycle = null;
            eStatementsSuccessfulFragment.viewSendTo = null;
            eStatementsSuccessfulFragment.textDescription = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
