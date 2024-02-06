package com.scb.phone.view.fragment.ntb.selectaccount;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ProductTermConditionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ProductTermConditionFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public ProductTermConditionFragment_ViewBinding(final ProductTermConditionFragment productTermConditionFragment, View view) {
        super(productTermConditionFragment, view);
        this.IconCompatParcelizer = productTermConditionFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_accept, "field 'buttonAccept' and method 'onAcceptButtonClick'");
        productTermConditionFragment.buttonAccept = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_accept, "field 'buttonAccept'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ProductTermConditionFragment.this.onAcceptButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_decline, "field 'buttonDecline' and method 'onDeclineButtonClick'");
        productTermConditionFragment.buttonDecline = (Button) onStart.write(IconCompatParcelizer3, R.id.btn_decline, "field 'buttonDecline'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ProductTermConditionFragment.this.onDeclineButtonClick();
            }
        });
        productTermConditionFragment.textHtml = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_html, "field 'textHtml'", TextView.class);
    }

    public final void read() {
        ProductTermConditionFragment productTermConditionFragment = this.IconCompatParcelizer;
        if (productTermConditionFragment != null) {
            this.IconCompatParcelizer = null;
            productTermConditionFragment.buttonAccept = null;
            productTermConditionFragment.buttonDecline = null;
            productTermConditionFragment.textHtml = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
