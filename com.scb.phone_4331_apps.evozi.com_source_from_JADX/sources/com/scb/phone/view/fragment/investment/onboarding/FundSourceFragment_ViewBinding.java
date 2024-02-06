package com.scb.phone.view.fragment.investment.onboarding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundSourceFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FundSourceFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public FundSourceFragment_ViewBinding(final FundSourceFragment fundSourceFragment, View view) {
        super(fundSourceFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = fundSourceFragment;
        fundSourceFragment.textSource = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_source, "field 'textSource'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextButtonClick'");
        fundSourceFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer, R.id.button_next, "field 'buttonNext'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundSourceFragment.this.onNextButtonClick();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.layout_source, "method 'onLayoutSourceClick'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundSourceFragment.this.onLayoutSourceClick();
            }
        });
    }

    public final void read() {
        FundSourceFragment fundSourceFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fundSourceFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            fundSourceFragment.textSource = null;
            fundSourceFragment.buttonNext = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
