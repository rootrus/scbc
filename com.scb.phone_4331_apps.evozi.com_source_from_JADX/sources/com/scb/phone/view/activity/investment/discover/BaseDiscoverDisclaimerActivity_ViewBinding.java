package com.scb.phone.view.activity.investment.discover;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseDiscoverDisclaimerActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BaseDiscoverDisclaimerActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public BaseDiscoverDisclaimerActivity_ViewBinding(final BaseDiscoverDisclaimerActivity baseDiscoverDisclaimerActivity, View view) {
        super(baseDiscoverDisclaimerActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = baseDiscoverDisclaimerActivity;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_accept, "field 'btnAccept' and method 'onAcceptButtonClicked'");
        baseDiscoverDisclaimerActivity.btnAccept = (Button) onStart.write(IconCompatParcelizer, R.id.btn_accept, "field 'btnAccept'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseDiscoverDisclaimerActivity.this.onAcceptButtonClicked();
            }
        });
    }

    public final void read() {
        BaseDiscoverDisclaimerActivity baseDiscoverDisclaimerActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (baseDiscoverDisclaimerActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            baseDiscoverDisclaimerActivity.btnAccept = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
