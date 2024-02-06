package com.scb.phone.view.fragment.ebillsubscription;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.ScbEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayBiller;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EbillSubscriptionInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EbillSubscriptionInputFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaMetadataCompat;
    private View write;

    public EbillSubscriptionInputFragment_ViewBinding(final EbillSubscriptionInputFragment ebillSubscriptionInputFragment, View view) {
        super(ebillSubscriptionInputFragment, view);
        this.IconCompatParcelizer = ebillSubscriptionInputFragment;
        ebillSubscriptionInputFragment.customSpinner = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner, "field 'customSpinner'", Spinner.class);
        ebillSubscriptionInputFragment.customBillerDetail = (CustomTransferAndPayBiller) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_biller, "field 'customBillerDetail'", CustomTransferAndPayBiller.class);
        ebillSubscriptionInputFragment.ref1Label = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_text_input_layout1, "field 'ref1Label'", TextView.class);
        ebillSubscriptionInputFragment.ref2Label = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_text_input_layout2, "field 'ref2Label'", TextView.class);
        ebillSubscriptionInputFragment.ref3Label = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_text_input_layout3, "field 'ref3Label'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.reference_edit_text1, "field 'ref1EditText' and method 'onRefEnter'");
        ebillSubscriptionInputFragment.ref1EditText = (ScbEditText) onStart.write(IconCompatParcelizer2, R.id.reference_edit_text1, "field 'ref1EditText'", ScbEditText.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        ((TextView) IconCompatParcelizer2).setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return EbillSubscriptionInputFragment.this.onRefEnter((EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) textView, "onEditorAction", "onRefEnter", EditText.class), i, keyEvent);
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.reference_edit_text2, "field 'ref2EditText' and method 'onRefEnter'");
        ebillSubscriptionInputFragment.ref2EditText = (ScbEditText) onStart.write(IconCompatParcelizer3, R.id.reference_edit_text2, "field 'ref2EditText'", ScbEditText.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        ((TextView) IconCompatParcelizer3).setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return EbillSubscriptionInputFragment.this.onRefEnter((EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) textView, "onEditorAction", "onRefEnter", EditText.class), i, keyEvent);
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.reference_edit_text3, "field 'ref3EditText' and method 'onRefEnter'");
        ebillSubscriptionInputFragment.ref3EditText = (ScbEditText) onStart.write(IconCompatParcelizer4, R.id.reference_edit_text3, "field 'ref3EditText'", ScbEditText.class);
        this.MediaMetadataCompat = IconCompatParcelizer4;
        ((TextView) IconCompatParcelizer4).setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return EbillSubscriptionInputFragment.this.onRefEnter((EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) textView, "onEditorAction", "onRefEnter", EditText.class), i, keyEvent);
            }
        });
        ebillSubscriptionInputFragment.tvErrorRef1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvErrorRef1, "field 'tvErrorRef1'", TextView.class);
        ebillSubscriptionInputFragment.tvErrorRef2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvErrorRef2, "field 'tvErrorRef2'", TextView.class);
        ebillSubscriptionInputFragment.tvErrorRef3 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvErrorRef3, "field 'tvErrorRef3'", TextView.class);
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'mButton' and method 'onReviewButtonClick'");
        ebillSubscriptionInputFragment.mButton = (DefaultButton) onStart.write(IconCompatParcelizer5, R.id.button_review, "field 'mButton'", DefaultButton.class);
        this.write = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EbillSubscriptionInputFragment.this.onReviewButtonClick();
            }
        });
    }

    public final void read() {
        EbillSubscriptionInputFragment ebillSubscriptionInputFragment = this.IconCompatParcelizer;
        if (ebillSubscriptionInputFragment != null) {
            this.IconCompatParcelizer = null;
            ebillSubscriptionInputFragment.customSpinner = null;
            ebillSubscriptionInputFragment.customBillerDetail = null;
            ebillSubscriptionInputFragment.ref1Label = null;
            ebillSubscriptionInputFragment.ref2Label = null;
            ebillSubscriptionInputFragment.ref3Label = null;
            ebillSubscriptionInputFragment.ref1EditText = null;
            ebillSubscriptionInputFragment.ref2EditText = null;
            ebillSubscriptionInputFragment.ref3EditText = null;
            ebillSubscriptionInputFragment.tvErrorRef1 = null;
            ebillSubscriptionInputFragment.tvErrorRef2 = null;
            ebillSubscriptionInputFragment.tvErrorRef3 = null;
            ebillSubscriptionInputFragment.mButton = null;
            ((TextView) this.MediaBrowserCompat$CustomActionResultReceiver).setOnEditorActionListener((TextView.OnEditorActionListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            ((TextView) this.MediaBrowserCompat$ItemReceiver).setOnEditorActionListener((TextView.OnEditorActionListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            ((TextView) this.MediaMetadataCompat).setOnEditorActionListener((TextView.OnEditorActionListener) null);
            this.MediaMetadataCompat = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
