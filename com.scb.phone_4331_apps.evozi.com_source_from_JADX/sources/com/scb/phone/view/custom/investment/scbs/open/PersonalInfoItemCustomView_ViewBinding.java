package com.scb.phone.view.custom.investment.scbs.open;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class PersonalInfoItemCustomView_ViewBinding implements Unbinder {
    private PersonalInfoItemCustomView IconCompatParcelizer;

    public PersonalInfoItemCustomView_ViewBinding(PersonalInfoItemCustomView personalInfoItemCustomView, View view) {
        this.IconCompatParcelizer = personalInfoItemCustomView;
        personalInfoItemCustomView.label = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label, "field 'label'", TextView.class);
        personalInfoItemCustomView.value = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.value, "field 'value'", TextView.class);
        personalInfoItemCustomView.separator = onStart.IconCompatParcelizer(view, R.id.separator, "field 'separator'");
    }

    public final void read() {
        PersonalInfoItemCustomView personalInfoItemCustomView = this.IconCompatParcelizer;
        if (personalInfoItemCustomView != null) {
            this.IconCompatParcelizer = null;
            personalInfoItemCustomView.label = null;
            personalInfoItemCustomView.value = null;
            personalInfoItemCustomView.separator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
