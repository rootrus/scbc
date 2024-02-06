package com.scb.phone.view.fragment.ccrredemption.product;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ProductDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private ProductDetailFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public ProductDetailFragment_ViewBinding(final ProductDetailFragment productDetailFragment, View view) {
        super(productDetailFragment, view);
        this.MediaBrowserCompat$ItemReceiver = productDetailFragment;
        productDetailFragment.imvProductDetail = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_product_detail, "field 'imvProductDetail'", ImageView.class);
        productDetailFragment.txvProductsName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_product_name, "field 'txvProductsName'", TextView.class);
        productDetailFragment.txvProductDetails = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_product_details, "field 'txvProductDetails'", TextView.class);
        productDetailFragment.txvProductItemCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_product_item_code, "field 'txvProductItemCode'", TextView.class);
        productDetailFragment.txvPointsPerUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_points_per_unit, "field 'txvPointsPerUnit'", TextView.class);
        productDetailFragment.txvPointsPlusMoneyPerUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_points_plus_money_per_unit, "field 'txvPointsPlusMoneyPerUnit'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_continue, "field 'button' and method 'onPointsClick'");
        productDetailFragment.button = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_continue, "field 'button'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ProductDetailFragment.this.onPointsClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.view_register_opr, "field 'viewRegisterOpr' and method 'onRegisterClick'");
        productDetailFragment.viewRegisterOpr = (LinearLayout) onStart.write(IconCompatParcelizer3, R.id.view_register_opr, "field 'viewRegisterOpr'", LinearLayout.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ProductDetailFragment.this.onRegisterClick();
            }
        });
        productDetailFragment.rewardTierText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_reward_tier, "field 'rewardTierText'", TextView.class);
        productDetailFragment.pointsPlusMoneySection = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.points_plus_money_section, "field 'pointsPlusMoneySection'", LinearLayout.class);
        productDetailFragment.rewardTierLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reward_tier_layout, "field 'rewardTierLayout'", LinearLayout.class);
        productDetailFragment.unavailablePrivilegeText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unavailable_privilege_text, "field 'unavailablePrivilegeText'", TextView.class);
    }

    public final void read() {
        ProductDetailFragment productDetailFragment = this.MediaBrowserCompat$ItemReceiver;
        if (productDetailFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            productDetailFragment.imvProductDetail = null;
            productDetailFragment.txvProductsName = null;
            productDetailFragment.txvProductDetails = null;
            productDetailFragment.txvProductItemCode = null;
            productDetailFragment.txvPointsPerUnit = null;
            productDetailFragment.txvPointsPlusMoneyPerUnit = null;
            productDetailFragment.button = null;
            productDetailFragment.viewRegisterOpr = null;
            productDetailFragment.rewardTierText = null;
            productDetailFragment.pointsPlusMoneySection = null;
            productDetailFragment.rewardTierLayout = null;
            productDetailFragment.unavailablePrivilegeText = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
