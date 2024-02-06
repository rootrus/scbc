package com.scb.phone.view.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class PurchaseSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private PurchaseSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public PurchaseSuccessFragment_ViewBinding(final PurchaseSuccessFragment purchaseSuccessFragment, View view) {
        super(purchaseSuccessFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = purchaseSuccessFragment;
        purchaseSuccessFragment.container = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.purchase_container, "field 'container'", LinearLayout.class);
        purchaseSuccessFragment.extraContainer = (LinearLayout) onStart.IconCompatParcelizer(view, R.id.extra_container, "field 'extraContainer'", LinearLayout.class);
        purchaseSuccessFragment.footerContainer = (LinearLayout) onStart.IconCompatParcelizer(view, R.id.footer_container, "field 'footerContainer'", LinearLayout.class);
        View findViewById = view.findViewById(R.id.share_slip_button);
        purchaseSuccessFragment.shareSlip = (Button) onStart.write(findViewById, R.id.share_slip_button, "field 'shareSlip'", Button.class);
        if (findViewById != null) {
            this.write = findViewById;
            findViewById.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    PurchaseSuccessFragment.this.onShareSlipButtonClick();
                }
            });
        }
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.save_slip_button, "field 'saveSlip'");
        purchaseSuccessFragment.saveSlip = (Button) onStart.write(IconCompatParcelizer2, R.id.save_slip_button, "field 'saveSlip'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PurchaseSuccessFragment.this.onSaveSlipButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.return_button, "field 'buttonReturn' and method 'onReturnButton'");
        purchaseSuccessFragment.buttonReturn = (TextView) onStart.write(IconCompatParcelizer3, R.id.return_button, "field 'buttonReturn'", TextView.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PurchaseSuccessFragment.this.onReturnButton();
            }
        });
        purchaseSuccessFragment.remainingMsgTextView = (TextView) onStart.IconCompatParcelizer(view, R.id.remaining_msg, "field 'remainingMsgTextView'", TextView.class);
        purchaseSuccessFragment.purchaseNote = (TextView) onStart.IconCompatParcelizer(view, R.id.purchase_note, "field 'purchaseNote'", TextView.class);
        purchaseSuccessFragment.deepLinkButtonsContainer = (LinearLayout) onStart.IconCompatParcelizer(view, R.id.ll_deep_link_buttons_container, "field 'deepLinkButtonsContainer'", LinearLayout.class);
        purchaseSuccessFragment.curlImageView = (ImageView) onStart.IconCompatParcelizer(view, R.id.end_slip, "field 'curlImageView'", ImageView.class);
    }

    public void read() {
        PurchaseSuccessFragment purchaseSuccessFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (purchaseSuccessFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            purchaseSuccessFragment.container = null;
            purchaseSuccessFragment.extraContainer = null;
            purchaseSuccessFragment.footerContainer = null;
            purchaseSuccessFragment.shareSlip = null;
            purchaseSuccessFragment.saveSlip = null;
            purchaseSuccessFragment.buttonReturn = null;
            purchaseSuccessFragment.remainingMsgTextView = null;
            purchaseSuccessFragment.purchaseNote = null;
            purchaseSuccessFragment.deepLinkButtonsContainer = null;
            purchaseSuccessFragment.curlImageView = null;
            View view = this.write;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                this.write = null;
            }
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
