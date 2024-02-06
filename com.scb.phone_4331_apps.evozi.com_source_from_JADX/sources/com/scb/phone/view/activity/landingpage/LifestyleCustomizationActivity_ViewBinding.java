package com.scb.phone.view.activity.landingpage;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class LifestyleCustomizationActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private LifestyleCustomizationActivity MediaBrowserCompat$ItemReceiver;

    public LifestyleCustomizationActivity_ViewBinding(final LifestyleCustomizationActivity lifestyleCustomizationActivity, View view) {
        super(lifestyleCustomizationActivity, view);
        this.MediaBrowserCompat$ItemReceiver = lifestyleCustomizationActivity;
        lifestyleCustomizationActivity.normalStateContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_state_normal, "field 'normalStateContainer'", LinearLayout.class);
        lifestyleCustomizationActivity.emptyStateContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_state_empty, "field 'emptyStateContainer'", LinearLayout.class);
        lifestyleCustomizationActivity.errorStateContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_state_error, "field 'errorStateContainer'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_add, "field 'addButton' and method 'onAddClick'");
        lifestyleCustomizationActivity.addButton = (Button) onStart.write(IconCompatParcelizer2, R.id.button_add, "field 'addButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                LifestyleCustomizationActivity.this.onAddClick();
            }
        });
        lifestyleCustomizationActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_reset, "method 'onResetClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                LifestyleCustomizationActivity.this.onResetClick();
            }
        });
    }

    public final void read() {
        LifestyleCustomizationActivity lifestyleCustomizationActivity = this.MediaBrowserCompat$ItemReceiver;
        if (lifestyleCustomizationActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            lifestyleCustomizationActivity.normalStateContainer = null;
            lifestyleCustomizationActivity.emptyStateContainer = null;
            lifestyleCustomizationActivity.errorStateContainer = null;
            lifestyleCustomizationActivity.addButton = null;
            lifestyleCustomizationActivity.recyclerView = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
