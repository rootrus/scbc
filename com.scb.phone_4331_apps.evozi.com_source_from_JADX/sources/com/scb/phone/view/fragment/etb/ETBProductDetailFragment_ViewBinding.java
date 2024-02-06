package com.scb.phone.view.fragment.etb;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ETBProductDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ETBProductDetailFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public ETBProductDetailFragment_ViewBinding(final ETBProductDetailFragment eTBProductDetailFragment, View view) {
        super(eTBProductDetailFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = eTBProductDetailFragment;
        eTBProductDetailFragment.ivDetailImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_detailImage, "field 'ivDetailImage'", ImageView.class);
        eTBProductDetailFragment.tvProductName = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_name, "field 'tvProductName'", ThaiTextView.class);
        eTBProductDetailFragment.tvProductShortDesc = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_short_desc, "field 'tvProductShortDesc'", ThaiTextView.class);
        eTBProductDetailFragment.spinnerSelectPlan = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner_select_plan, "field 'spinnerSelectPlan'", Spinner.class);
        eTBProductDetailFragment.layoutSpinnerSelectPlan = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutSpinnerOptions, "field 'layoutSpinnerSelectPlan'", LinearLayout.class);
        eTBProductDetailFragment.recyclerViewLongDesc = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_longDesc, "field 'recyclerViewLongDesc'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.select_button, "field 'btnSelect' and method 'onClickSelectPlanButton'");
        eTBProductDetailFragment.btnSelect = (Button) onStart.write(IconCompatParcelizer, R.id.select_button, "field 'btnSelect'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ETBProductDetailFragment.this.onClickSelectPlanButton();
            }
        });
    }

    public final void read() {
        ETBProductDetailFragment eTBProductDetailFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (eTBProductDetailFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            eTBProductDetailFragment.ivDetailImage = null;
            eTBProductDetailFragment.tvProductName = null;
            eTBProductDetailFragment.tvProductShortDesc = null;
            eTBProductDetailFragment.spinnerSelectPlan = null;
            eTBProductDetailFragment.layoutSpinnerSelectPlan = null;
            eTBProductDetailFragment.recyclerViewLongDesc = null;
            eTBProductDetailFragment.btnSelect = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
