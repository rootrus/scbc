package com.scb.phone.view.fragment.prelogin.quickbalance;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HowToAddAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HowToAddAccountFragment IconCompatParcelizer;
    private View write;

    public HowToAddAccountFragment_ViewBinding(final HowToAddAccountFragment howToAddAccountFragment, View view) {
        super(howToAddAccountFragment, view);
        this.IconCompatParcelizer = howToAddAccountFragment;
        howToAddAccountFragment.mTextView1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qb_empty_title_text_view_1, "field 'mTextView1'", TextView.class);
        howToAddAccountFragment.mTextView2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qb_empty_title_text_view_2, "field 'mTextView2'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.add_new_account, "method 'onButtonClicked'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HowToAddAccountFragment.this.onButtonClicked();
            }
        });
    }

    public final void read() {
        HowToAddAccountFragment howToAddAccountFragment = this.IconCompatParcelizer;
        if (howToAddAccountFragment != null) {
            this.IconCompatParcelizer = null;
            howToAddAccountFragment.mTextView1 = null;
            howToAddAccountFragment.mTextView2 = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
