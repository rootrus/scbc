package com.scb.phone.view.fragment.deposit;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class DepositSelectionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DepositSelectionFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public DepositSelectionFragment_ViewBinding(final DepositSelectionFragment depositSelectionFragment, View view) {
        super(depositSelectionFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = depositSelectionFragment;
        depositSelectionFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        depositSelectionFragment.saleSheetButtonContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_sale_sheet_button_container, "field 'saleSheetButtonContainer'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_view_product_catalog, "method 'onClickRead'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DepositSelectionFragment.this.onClickRead();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.view_sale_sheet_button, "method 'onClickViewSalesList'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DepositSelectionFragment.this.onClickViewSalesList();
            }
        });
    }

    public final void read() {
        DepositSelectionFragment depositSelectionFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (depositSelectionFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            depositSelectionFragment.recyclerView = null;
            depositSelectionFragment.saleSheetButtonContainer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}