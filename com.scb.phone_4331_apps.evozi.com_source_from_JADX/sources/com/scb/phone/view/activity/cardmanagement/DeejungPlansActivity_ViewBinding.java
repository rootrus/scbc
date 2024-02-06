package com.scb.phone.view.activity.cardmanagement;

import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DeejungPlansActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private DeejungPlansActivity write;

    public DeejungPlansActivity_ViewBinding(final DeejungPlansActivity deejungPlansActivity, View view) {
        super(deejungPlansActivity, view);
        this.write = deejungPlansActivity;
        deejungPlansActivity.txvTotalAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_amount, "field 'txvTotalAmount'", TextView.class);
        deejungPlansActivity.txvCountOfPurchases = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_count_of_purchases, "field 'txvCountOfPurchases'", TextView.class);
        deejungPlansActivity.labelAbovePlans = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_above_plans, "field 'labelAbovePlans'", TextView.class);
        deejungPlansActivity.dividerCostOverview = onStart.IconCompatParcelizer(view, R.id.divider_cost_overview, "field 'dividerCostOverview'");
        deejungPlansActivity.nestedScrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nested_scrollview, "field 'nestedScrollView'", NestedScrollView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.ivm_edit_selected_purchases, "method 'onClickEditSelectedPurchases'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungPlansActivity.this.onClickEditSelectedPurchases();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.imv_deejung_about, "method 'onAboutClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungPlansActivity.this.onAboutClick();
            }
        });
    }

    public final void read() {
        DeejungPlansActivity deejungPlansActivity = this.write;
        if (deejungPlansActivity != null) {
            this.write = null;
            deejungPlansActivity.txvTotalAmount = null;
            deejungPlansActivity.txvCountOfPurchases = null;
            deejungPlansActivity.labelAbovePlans = null;
            deejungPlansActivity.dividerCostOverview = null;
            deejungPlansActivity.nestedScrollView = null;
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
