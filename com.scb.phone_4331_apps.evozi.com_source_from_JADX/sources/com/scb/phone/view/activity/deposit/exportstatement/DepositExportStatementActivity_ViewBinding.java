package com.scb.phone.view.activity.deposit.exportstatement;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DepositExportStatementActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private DepositExportStatementActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public DepositExportStatementActivity_ViewBinding(final DepositExportStatementActivity depositExportStatementActivity, View view) {
        super(depositExportStatementActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = depositExportStatementActivity;
        depositExportStatementActivity.tvEmail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_email, "field 'tvEmail'", TextView.class);
        depositExportStatementActivity.rowErrorInline = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_error_inline, "field 'rowErrorInline'", TextView.class);
        depositExportStatementActivity.tvAccountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_nickname, "field 'tvAccountName'", TextView.class);
        depositExportStatementActivity.tvAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_number, "field 'tvAccountNumber'", TextView.class);
        depositExportStatementActivity.rootView = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_activity, "field 'rootView'", ViewGroup.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.view_start_date, "field 'viewStartDate' and method 'onButtonStartCalendarClick'");
        depositExportStatementActivity.viewStartDate = IconCompatParcelizer2;
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DepositExportStatementActivity.this.onButtonStartCalendarClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.view_end_date, "field 'viewEndDate' and method 'onButtonEndCalendarClick'");
        depositExportStatementActivity.viewEndDate = IconCompatParcelizer3;
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DepositExportStatementActivity.this.onButtonEndCalendarClick();
            }
        });
        depositExportStatementActivity.tvSelectStartMonth = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_select_start_month, "field 'tvSelectStartMonth'", TextView.class);
        depositExportStatementActivity.tvSelectEndMonth = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_select_end_month, "field 'tvSelectEndMonth'", TextView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.button_done_export_statement, "field 'btDone' and method 'onButtonDoneClick'");
        depositExportStatementActivity.btDone = (Button) onStart.write(IconCompatParcelizer4, R.id.button_done_export_statement, "field 'btDone'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DepositExportStatementActivity.this.onButtonDoneClick();
            }
        });
        depositExportStatementActivity.ivLogo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_logo, "field 'ivLogo'", ImageView.class);
        depositExportStatementActivity.checkBoxNoteRequest = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cb_note_request, "field 'checkBoxNoteRequest'", CheckBox.class);
    }

    public final void read() {
        DepositExportStatementActivity depositExportStatementActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (depositExportStatementActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            depositExportStatementActivity.tvEmail = null;
            depositExportStatementActivity.rowErrorInline = null;
            depositExportStatementActivity.tvAccountName = null;
            depositExportStatementActivity.tvAccountNumber = null;
            depositExportStatementActivity.rootView = null;
            depositExportStatementActivity.viewStartDate = null;
            depositExportStatementActivity.viewEndDate = null;
            depositExportStatementActivity.tvSelectStartMonth = null;
            depositExportStatementActivity.tvSelectEndMonth = null;
            depositExportStatementActivity.btDone = null;
            depositExportStatementActivity.ivLogo = null;
            depositExportStatementActivity.checkBoxNoteRequest = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
