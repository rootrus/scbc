package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CreditLimitFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private CreditLimitFragment write;

    public CreditLimitFragment_ViewBinding(final CreditLimitFragment creditLimitFragment, View view) {
        super(creditLimitFragment, view);
        this.write = creditLimitFragment;
        creditLimitFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_withholding_tax, "field 'recyclerView'", RecyclerView.class);
        creditLimitFragment.inputTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_input, "field 'inputTitle'", TextView.class);
        creditLimitFragment.limitInput = (CustomDeltaSlider) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.limit_input, "field 'limitInput'", CustomDeltaSlider.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "method 'onNextClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CreditLimitFragment.this.onNextClick();
            }
        });
    }

    public final void read() {
        CreditLimitFragment creditLimitFragment = this.write;
        if (creditLimitFragment != null) {
            this.write = null;
            creditLimitFragment.recyclerView = null;
            creditLimitFragment.inputTitle = null;
            creditLimitFragment.limitInput = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
