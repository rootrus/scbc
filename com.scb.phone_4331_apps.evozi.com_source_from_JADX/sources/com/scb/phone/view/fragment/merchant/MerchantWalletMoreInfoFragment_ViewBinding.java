package com.scb.phone.view.fragment.merchant;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MerchantWalletMoreInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private MerchantWalletMoreInfoFragment MediaBrowserCompat$ItemReceiver;

    public MerchantWalletMoreInfoFragment_ViewBinding(final MerchantWalletMoreInfoFragment merchantWalletMoreInfoFragment, View view) {
        super(merchantWalletMoreInfoFragment, view);
        this.MediaBrowserCompat$ItemReceiver = merchantWalletMoreInfoFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.layout_collapsed, "field 'mLayoutCollapsed' and method 'onLayoutCollapsedClick'");
        merchantWalletMoreInfoFragment.mLayoutCollapsed = (ViewGroup) onStart.write(IconCompatParcelizer, R.id.layout_collapsed, "field 'mLayoutCollapsed'", ViewGroup.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MerchantWalletMoreInfoFragment.this.onLayoutCollapsedClick();
            }
        });
        merchantWalletMoreInfoFragment.mImageIconExpandMore = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'mImageIconExpandMore'", ImageView.class);
        merchantWalletMoreInfoFragment.mTextProductTypeValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_product_type_value, "field 'mTextProductTypeValue'", TextView.class);
        merchantWalletMoreInfoFragment.mLayoutExpanded = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_expanded, "field 'mLayoutExpanded'", ViewGroup.class);
        merchantWalletMoreInfoFragment.mTextShopNameValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_shop_name_value, "field 'mTextShopNameValue'", TextView.class);
        merchantWalletMoreInfoFragment.mTextOwnerNameValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_owner_name_value, "field 'mTextOwnerNameValue'", TextView.class);
        merchantWalletMoreInfoFragment.mTextLinkedAccountValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_linked_account_value, "field 'mTextLinkedAccountValue'", TextView.class);
    }

    public final void read() {
        MerchantWalletMoreInfoFragment merchantWalletMoreInfoFragment = this.MediaBrowserCompat$ItemReceiver;
        if (merchantWalletMoreInfoFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            merchantWalletMoreInfoFragment.mLayoutCollapsed = null;
            merchantWalletMoreInfoFragment.mImageIconExpandMore = null;
            merchantWalletMoreInfoFragment.mTextProductTypeValue = null;
            merchantWalletMoreInfoFragment.mLayoutExpanded = null;
            merchantWalletMoreInfoFragment.mTextShopNameValue = null;
            merchantWalletMoreInfoFragment.mTextOwnerNameValue = null;
            merchantWalletMoreInfoFragment.mTextLinkedAccountValue = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
