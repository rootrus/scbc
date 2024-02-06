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

public class QuantityPointsPlusMoneyFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private QuantityPointsPlusMoneyFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private TextWatcher MediaDescriptionCompat;
    private View write;

    public QuantityPointsPlusMoneyFragment_ViewBinding(final QuantityPointsPlusMoneyFragment quantityPointsPlusMoneyFragment, View view) {
        super(quantityPointsPlusMoneyFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = quantityPointsPlusMoneyFragment;
        quantityPointsPlusMoneyFragment.txvPointsPerUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_points_per_unit, "field 'txvPointsPerUnit'", TextView.class);
        quantityPointsPlusMoneyFragment.txvTotalPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_points, "field 'txvTotalPoints'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.edt_quantity, "field 'edtQuantity', method 'onQuantityDoneClick', and method 'onQuantityChanged'");
        quantityPointsPlusMoneyFragment.edtQuantity = (CustomEditText) onStart.write(IconCompatParcelizer2, R.id.edt_quantity, "field 'edtQuantity'", CustomEditText.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer2;
        TextView textView = (TextView) IconCompatParcelizer2;
        textView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return QuantityPointsPlusMoneyFragment.this.onQuantityDoneClick(i);
            }
        });
        C90632 r0 = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                QuantityPointsPlusMoneyFragment.this.onQuantityChanged(charSequence, i, i2, i3);
            }
        };
        this.MediaDescriptionCompat = r0;
        textView.addTextChangedListener(r0);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_quantity_minus, "field 'btnQuantityMinus' and method 'onQuantityMinusClick'");
        quantityPointsPlusMoneyFragment.btnQuantityMinus = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.btn_quantity_minus, "field 'btnQuantityMinus'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                QuantityPointsPlusMoneyFragment.this.onQuantityMinusClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.btn_quantity_plus, "field 'btnQuantityPlus' and method 'onQuantityPlusClick'");
        quantityPointsPlusMoneyFragment.btnQuantityPlus = (DefaultButton) onStart.write(IconCompatParcelizer4, R.id.btn_quantity_plus, "field 'btnQuantityPlus'", DefaultButton.class);
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                QuantityPointsPlusMoneyFragment.this.onQuantityPlusClick();
            }
        });
        quantityPointsPlusMoneyFragment.txvMoneyPerUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_money_per_unit, "field 'txvMoneyPerUnit'", TextView.class);
        quantityPointsPlusMoneyFragment.txvTotalPayable = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_payable, "field 'txvTotalPayable'", TextView.class);
        quantityPointsPlusMoneyFragment.txvCurrency = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_currency, "field 'txvCurrency'", TextView.class);
        quantityPointsPlusMoneyFragment.txvPointsError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_points_error, "field 'txvPointsError'", TextView.class);
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.btn_continue_with_money, "field 'btnContinue' and method 'onContinueClick'");
        quantityPointsPlusMoneyFragment.btnContinue = (DefaultButton) onStart.write(IconCompatParcelizer5, R.id.btn_continue_with_money, "field 'btnContinue'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                QuantityPointsPlusMoneyFragment.this.onContinueClick();
            }
        });
    }

    public final void read() {
        QuantityPointsPlusMoneyFragment quantityPointsPlusMoneyFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (quantityPointsPlusMoneyFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            quantityPointsPlusMoneyFragment.txvPointsPerUnit = null;
            quantityPointsPlusMoneyFragment.txvTotalPoints = null;
            quantityPointsPlusMoneyFragment.edtQuantity = null;
            quantityPointsPlusMoneyFragment.btnQuantityMinus = null;
            quantityPointsPlusMoneyFragment.btnQuantityPlus = null;
            quantityPointsPlusMoneyFragment.txvMoneyPerUnit = null;
            quantityPointsPlusMoneyFragment.txvTotalPayable = null;
            quantityPointsPlusMoneyFragment.txvCurrency = null;
            quantityPointsPlusMoneyFragment.txvPointsError = null;
            quantityPointsPlusMoneyFragment.btnContinue = null;
            ((TextView) this.MediaBrowserCompat$MediaItem).setOnEditorActionListener((TextView.OnEditorActionListener) null);
            ((TextView) this.MediaBrowserCompat$MediaItem).removeTextChangedListener(this.MediaDescriptionCompat);
            this.MediaDescriptionCompat = null;
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
