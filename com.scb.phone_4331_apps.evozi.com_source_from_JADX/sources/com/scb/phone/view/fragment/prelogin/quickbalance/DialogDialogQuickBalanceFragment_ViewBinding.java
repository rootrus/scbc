package com.scb.phone.view.fragment.prelogin.quickbalance;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DialogDialogQuickBalanceFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private DialogDialogQuickBalanceFragment write;

    public DialogDialogQuickBalanceFragment_ViewBinding(final DialogDialogQuickBalanceFragment dialogDialogQuickBalanceFragment, View view) {
        super(dialogDialogQuickBalanceFragment, view);
        this.write = dialogDialogQuickBalanceFragment;
        dialogDialogQuickBalanceFragment.name = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_name_text_view, "field 'name'", TextView.class);
        dialogDialogQuickBalanceFragment.totalAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_total_amount_text_view, "field 'totalAmount'", TextView.class);
        dialogDialogQuickBalanceFragment.lastTransactionsText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.last_transactions_text_view, "field 'lastTransactionsText'", TextView.class);
        dialogDialogQuickBalanceFragment.lastTransactions = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_last_transactions_linear_layout, "field 'lastTransactions'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.dialog_footer, "field 'mFooterDialog' and method 'onModifyClicked'");
        dialogDialogQuickBalanceFragment.mFooterDialog = (LinearLayout) onStart.write(IconCompatParcelizer, R.id.dialog_footer, "field 'mFooterDialog'", LinearLayout.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DialogDialogQuickBalanceFragment.this.onModifyClicked();
            }
        });
        dialogDialogQuickBalanceFragment.mContentDialog = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_content, "field 'mContentDialog'", LinearLayout.class);
        dialogDialogQuickBalanceFragment.mHeaderDialog = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_header, "field 'mHeaderDialog'", RelativeLayout.class);
        dialogDialogQuickBalanceFragment.mTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_dialog_text_view, "field 'mTitle'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.item_back_icon_relative_layout, "field 'mCloseIcon' and method 'onCloseClicked'");
        dialogDialogQuickBalanceFragment.mCloseIcon = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.item_back_icon_relative_layout, "field 'mCloseIcon'", RelativeLayout.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DialogDialogQuickBalanceFragment.this.onCloseClicked();
            }
        });
    }

    public final void read() {
        DialogDialogQuickBalanceFragment dialogDialogQuickBalanceFragment = this.write;
        if (dialogDialogQuickBalanceFragment != null) {
            this.write = null;
            dialogDialogQuickBalanceFragment.name = null;
            dialogDialogQuickBalanceFragment.totalAmount = null;
            dialogDialogQuickBalanceFragment.lastTransactionsText = null;
            dialogDialogQuickBalanceFragment.lastTransactions = null;
            dialogDialogQuickBalanceFragment.mFooterDialog = null;
            dialogDialogQuickBalanceFragment.mContentDialog = null;
            dialogDialogQuickBalanceFragment.mHeaderDialog = null;
            dialogDialogQuickBalanceFragment.mTitle = null;
            dialogDialogQuickBalanceFragment.mCloseIcon = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
