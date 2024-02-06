package com.scb.phone.view.activity.etb;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseEligibilityActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private BaseEligibilityActivity write;

    public BaseEligibilityActivity_ViewBinding(final BaseEligibilityActivity baseEligibilityActivity, View view) {
        super(baseEligibilityActivity, view);
        this.write = baseEligibilityActivity;
        baseEligibilityActivity.eligibilityHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etb_eligibility_header, "field 'eligibilityHeader'", TextView.class);
        baseEligibilityActivity.eligibilityRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etb_eligibility_recycler_view, "field 'eligibilityRecyclerView'", RecyclerView.class);
        baseEligibilityActivity.descriptionHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etb_description_header, "field 'descriptionHeader'", TextView.class);
        baseEligibilityActivity.etbDescriptionRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etb_description_recycler_view, "field 'etbDescriptionRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.get_started_button, "method 'onGetStartedButtonClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseEligibilityActivity.this.onGetStartedButtonClicked();
            }
        });
    }

    public final void read() {
        BaseEligibilityActivity baseEligibilityActivity = this.write;
        if (baseEligibilityActivity != null) {
            this.write = null;
            baseEligibilityActivity.eligibilityHeader = null;
            baseEligibilityActivity.eligibilityRecyclerView = null;
            baseEligibilityActivity.descriptionHeader = null;
            baseEligibilityActivity.etbDescriptionRecyclerView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
