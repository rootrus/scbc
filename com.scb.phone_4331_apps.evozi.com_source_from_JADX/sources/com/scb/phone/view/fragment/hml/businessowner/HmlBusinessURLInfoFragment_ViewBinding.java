package com.scb.phone.view.fragment.hml.businessowner;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomURLEditTextWithButtonView;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlBusinessURLInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlBusinessURLInfoFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlBusinessURLInfoFragment_ViewBinding(final HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment, View view) {
        super(hmlBusinessURLInfoFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessURLInfoFragment;
        hmlBusinessURLInfoFragment.rootLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_url_base, "field 'rootLinearLayout'", LinearLayout.class);
        hmlBusinessURLInfoFragment.breadcrumbs = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.psb_breadcrumbs, "field 'breadcrumbs'", ProgressStateBar.class);
        hmlBusinessURLInfoFragment.urlListTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_tablayout, "field 'urlListTabLayout'", TabLayout.class);
        hmlBusinessURLInfoFragment.businessRegNumEt = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_url_info_business_reg_num_value, "field 'businessRegNumEt'", CommonInputViewGroup.class);
        hmlBusinessURLInfoFragment.urlInfoStoreHeader = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_url_info_marketplace_header, "field 'urlInfoStoreHeader'", LinearLayout.class);
        hmlBusinessURLInfoFragment.businessUrlTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_url_info_store_url_header, "field 'businessUrlTitle'", TextView.class);
        hmlBusinessURLInfoFragment.businessUrlEt = (CustomURLEditTextWithButtonView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_url_info_store_url, "field 'businessUrlEt'", CustomURLEditTextWithButtonView.class);
        hmlBusinessURLInfoFragment.premiseOnLeaseLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_premise_on_lease, "field 'premiseOnLeaseLayout'", LinearLayout.class);
        hmlBusinessURLInfoFragment.premiseOnLeaseYesBtn = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_premise_on_lease_yes, "field 'premiseOnLeaseYesBtn'", Button.class);
        hmlBusinessURLInfoFragment.premiseOnLeaseNoBtn = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_premise_on_lease_no, "field 'premiseOnLeaseNoBtn'", Button.class);
        hmlBusinessURLInfoFragment.premiseOnLeaseErrorTv = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_premise_on_lease_error, "field 'premiseOnLeaseErrorTv'", TextView.class);
        hmlBusinessURLInfoFragment.productUrlLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_product_url, "field 'productUrlLayout'", LinearLayout.class);
        hmlBusinessURLInfoFragment.productUrlListLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_product_urls_list, "field 'productUrlListLayout'", LinearLayout.class);
        hmlBusinessURLInfoFragment.storeUrlLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_store_url, "field 'storeUrlLayout'", LinearLayout.class);
        hmlBusinessURLInfoFragment.storeUrlListLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_store_urls_list, "field 'storeUrlListLayout'", LinearLayout.class);
        hmlBusinessURLInfoFragment.addMoreStoreBtn = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_store_url_add_more, "field 'addMoreStoreBtn'", TextView.class);
        hmlBusinessURLInfoFragment.addMoreProductBtn = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_product_url_add_more, "field 'addMoreProductBtn'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_url_info_next, "method 'onNextButtonClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessURLInfoFragment.this.onNextButtonClick();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_url_info_marketplace_help, "method 'onUrlStoreHelpClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessURLInfoFragment.this.onUrlStoreHelpClicked();
            }
        });
    }

    public final void read() {
        HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlBusinessURLInfoFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            hmlBusinessURLInfoFragment.rootLinearLayout = null;
            hmlBusinessURLInfoFragment.breadcrumbs = null;
            hmlBusinessURLInfoFragment.urlListTabLayout = null;
            hmlBusinessURLInfoFragment.businessRegNumEt = null;
            hmlBusinessURLInfoFragment.urlInfoStoreHeader = null;
            hmlBusinessURLInfoFragment.businessUrlTitle = null;
            hmlBusinessURLInfoFragment.businessUrlEt = null;
            hmlBusinessURLInfoFragment.premiseOnLeaseLayout = null;
            hmlBusinessURLInfoFragment.premiseOnLeaseYesBtn = null;
            hmlBusinessURLInfoFragment.premiseOnLeaseNoBtn = null;
            hmlBusinessURLInfoFragment.premiseOnLeaseErrorTv = null;
            hmlBusinessURLInfoFragment.productUrlLayout = null;
            hmlBusinessURLInfoFragment.productUrlListLayout = null;
            hmlBusinessURLInfoFragment.storeUrlLayout = null;
            hmlBusinessURLInfoFragment.storeUrlListLayout = null;
            hmlBusinessURLInfoFragment.addMoreStoreBtn = null;
            hmlBusinessURLInfoFragment.addMoreProductBtn = null;
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
