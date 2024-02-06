package com.scb.phone.view.fragment;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class DepositBottomSelectionEntryFragment_ViewBinding implements Unbinder {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private DepositBottomSelectionEntryFragment MediaBrowserCompat$ItemReceiver;

    public DepositBottomSelectionEntryFragment_ViewBinding(final DepositBottomSelectionEntryFragment depositBottomSelectionEntryFragment, View view) {
        this.MediaBrowserCompat$ItemReceiver = depositBottomSelectionEntryFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.ll_layout_select_export_statement, "field 'selectExportStatement' and method 'exportStatement'");
        depositBottomSelectionEntryFragment.selectExportStatement = (LinearLayout) onStart.write(IconCompatParcelizer2, R.id.ll_layout_select_export_statement, "field 'selectExportStatement'", LinearLayout.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DepositBottomSelectionEntryFragment.this.exportStatement(view);
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.ll_layout_select_close_account, "field 'closeAccount' and method 'closeAccount'");
        depositBottomSelectionEntryFragment.closeAccount = (LinearLayout) onStart.write(IconCompatParcelizer3, R.id.ll_layout_select_close_account, "field 'closeAccount'", LinearLayout.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DepositBottomSelectionEntryFragment.this.closeAccount(view);
            }
        });
    }

    public final void read() {
        DepositBottomSelectionEntryFragment depositBottomSelectionEntryFragment = this.MediaBrowserCompat$ItemReceiver;
        if (depositBottomSelectionEntryFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            depositBottomSelectionEntryFragment.selectExportStatement = null;
            depositBottomSelectionEntryFragment.closeAccount = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
