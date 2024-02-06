package com.scb.phone.view.fragment.ntb.selectaccount;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DepositProductDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private DepositProductDetailFragment write;

    public DepositProductDetailFragment_ViewBinding(final DepositProductDetailFragment depositProductDetailFragment, View view) {
        super(depositProductDetailFragment, view);
        this.write = depositProductDetailFragment;
        depositProductDetailFragment.imageDetail = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_detail, "field 'imageDetail'", ImageView.class);
        depositProductDetailFragment.webView = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.webview, "field 'webView'", WebView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_proceed, "field 'buttonProceed' and method 'onProceedButtonClick'");
        depositProductDetailFragment.buttonProceed = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_proceed, "field 'buttonProceed'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DepositProductDetailFragment.this.onProceedButtonClick();
            }
        });
    }

    public final void read() {
        DepositProductDetailFragment depositProductDetailFragment = this.write;
        if (depositProductDetailFragment != null) {
            this.write = null;
            depositProductDetailFragment.imageDetail = null;
            depositProductDetailFragment.webView = null;
            depositProductDetailFragment.buttonProceed = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
