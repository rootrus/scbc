package com.scb.phone.view.fragment.prelogin;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class HowToAddAccountFragmentStep2_ViewBinding extends BaseFragment_ViewBinding {
    private HowToAddAccountFragmentStep2 write;

    public HowToAddAccountFragmentStep2_ViewBinding(HowToAddAccountFragmentStep2 howToAddAccountFragmentStep2, View view) {
        super(howToAddAccountFragmentStep2, view);
        this.write = howToAddAccountFragmentStep2;
        howToAddAccountFragmentStep2.mTextView1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qb_empty_title_text_view_1, "field 'mTextView1'", TextView.class);
    }

    public final void read() {
        HowToAddAccountFragmentStep2 howToAddAccountFragmentStep2 = this.write;
        if (howToAddAccountFragmentStep2 != null) {
            this.write = null;
            howToAddAccountFragmentStep2.mTextView1 = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
