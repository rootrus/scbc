package com.scb.phone.view.activity.cardmanagement;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ExportCardStatementActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ExportCardStatementActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public ExportCardStatementActivity_ViewBinding(final ExportCardStatementActivity exportCardStatementActivity, View view) {
        super(exportCardStatementActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = exportCardStatementActivity;
        exportCardStatementActivity.rvCycleSelection = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_cycle_selection, "field 'rvCycleSelection'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_action_next, "field 'btnActionNext' and method 'onClickActionNext'");
        exportCardStatementActivity.btnActionNext = (Button) onStart.write(IconCompatParcelizer, R.id.btn_action_next, "field 'btnActionNext'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ExportCardStatementActivity.this.onClickActionNext();
            }
        });
    }

    public final void read() {
        ExportCardStatementActivity exportCardStatementActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (exportCardStatementActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            exportCardStatementActivity.rvCycleSelection = null;
            exportCardStatementActivity.btnActionNext = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
