package com.scb.phone.view.fragment.ccrredemption.product;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.ccrredemption.CustomEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class QuantityPointsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private QuantityPointsFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private TextWatcher MediaBrowserCompat$MediaItem;
    private View MediaDescriptionCompat;
    private View write;

    public QuantityPointsFragment_ViewBinding(final QuantityPointsFragment quantityPointsFragment, View view) {
        super(quantityPointsFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = quantityPointsFragment;
        quantityPointsFragment.txvPointsPerUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_points_per_unit, "field 'txvPointsPerUnit'", TextView.class);
        quantityPointsFragment.txvTotalPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_points, "field 'txvTotalPoints'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.edt_quantity, "field 'edtQuantity', method 'onQuantityDoneClick', and method 'onQuantityChanged'");
        quantityPointsFragment.edtQuantity = (CustomEditText) onStart.write(IconCompatParcelizer2, R.id.edt_quantity, "field 'edtQuantity'", CustomEditText.class);
        this.MediaDescriptionCompat = IconCompatParcelizer2;
        TextView textView = (TextView) IconCompatParcelizer2;
        textView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return QuantityPointsFragment.this.onQuantityDoneClick(i);
            }
        });
        C90615 r0 = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                QuantityPointsFragment.this.onQuantityChanged(charSequence, i, i2, i3);
            }
        };
        this.MediaBrowserCompat$MediaItem = r0;
        textView.addTextChangedListener(r0);
        quantityPointsFragment.txvPointsError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_points_error, "field 'txvPointsError'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_quantity_minus, "field 'btnQuantityMinus' and method 'onQuantityMinusClick'");
        quantityPointsFragment.btnQuantityMinus = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.btn_quantity_minus, "field 'btnQuantityMinus'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                QuantityPointsFragment.this.onQuantityMinusClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.btn_quantity_plus, "field 'btnQuantityPlus' and method 'onQuantityPlusClick'");
        quantityPointsFragment.btnQuantityPlus = (DefaultButton) onStart.write(IconCompatParcelizer4, R.id.btn_quantity_plus, "field 'btnQuantityPlus'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                QuantityPointsFragment.this.onQuantityPlusClick();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.btn_points_continue, "field 'btnContinue' and method 'onContinueClick'");
        quantityPointsFragment.btnContinue = (DefaultButton) onStart.write(IconCompatParcelizer5, R.id.btn_points_continue, "field 'btnContinue'", DefaultButton.class);
        this.write = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                QuantityPointsFragment.this.onContinueClick();
            }
        });
    }

    public final void read() {
        QuantityPointsFragment quantityPointsFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (quantityPointsFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            quantityPointsFragment.txvPointsPerUnit = null;
            quantityPointsFragment.txvTotalPoints = null;
            quantityPointsFragment.edtQuantity = null;
            quantityPointsFragment.txvPointsError = null;
            quantityPointsFragment.btnQuantityMinus = null;
            quantityPointsFragment.btnQuantityPlus = null;
            quantityPointsFragment.btnContinue = null;
            ((TextView) this.MediaDescriptionCompat).setOnEditorActionListener((TextView.OnEditorActionListener) null);
            ((TextView) this.MediaDescriptionCompat).removeTextChangedListener(this.MediaBrowserCompat$MediaItem);
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaDescriptionCompat = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
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
