package com.scb.phone.view.fragment.investment.schedule;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseSetupScheduleFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseSetupScheduleFragment IconCompatParcelizer;

    public BaseSetupScheduleFragment_ViewBinding(BaseSetupScheduleFragment baseSetupScheduleFragment, View view) {
        super(baseSetupScheduleFragment, view);
        this.IconCompatParcelizer = baseSetupScheduleFragment;
        baseSetupScheduleFragment.disclaimerTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.disclaimer_text, "field 'disclaimerTextView'", TextView.class);
    }

    public void read() {
        BaseSetupScheduleFragment baseSetupScheduleFragment = this.IconCompatParcelizer;
        if (baseSetupScheduleFragment != null) {
            this.IconCompatParcelizer = null;
            baseSetupScheduleFragment.disclaimerTextView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
