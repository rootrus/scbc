package com.scb.phone.view.fragment.ccrredemption.oprredemption;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class CurrentCycleInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CurrentCycleInfoFragment IconCompatParcelizer;

    public CurrentCycleInfoFragment_ViewBinding(CurrentCycleInfoFragment currentCycleInfoFragment, View view) {
        super(currentCycleInfoFragment, view);
        this.IconCompatParcelizer = currentCycleInfoFragment;
        currentCycleInfoFragment.leftTierLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.lower_tier_label, "field 'leftTierLabel'", TextView.class);
        currentCycleInfoFragment.leftTierImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.lower_tier_image, "field 'leftTierImage'", ImageView.class);
        currentCycleInfoFragment.leftTierValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.lower_tier_value, "field 'leftTierValue'", TextView.class);
        currentCycleInfoFragment.rightTierImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.higher_tier_image, "field 'rightTierImage'", ImageView.class);
        currentCycleInfoFragment.rightTierLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.higher_tier_label, "field 'rightTierLabel'", TextView.class);
        currentCycleInfoFragment.rightTierValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.higher_tier_value, "field 'rightTierValue'", TextView.class);
        currentCycleInfoFragment.currentSpendingValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.current_spending_value, "field 'currentSpendingValue'", TextView.class);
        currentCycleInfoFragment.spendingProgressBar = (ProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spending_progress_bar, "field 'spendingProgressBar'", ProgressBar.class);
    }

    public final void read() {
        CurrentCycleInfoFragment currentCycleInfoFragment = this.IconCompatParcelizer;
        if (currentCycleInfoFragment != null) {
            this.IconCompatParcelizer = null;
            currentCycleInfoFragment.leftTierLabel = null;
            currentCycleInfoFragment.leftTierImage = null;
            currentCycleInfoFragment.leftTierValue = null;
            currentCycleInfoFragment.rightTierImage = null;
            currentCycleInfoFragment.rightTierLabel = null;
            currentCycleInfoFragment.rightTierValue = null;
            currentCycleInfoFragment.currentSpendingValue = null;
            currentCycleInfoFragment.spendingProgressBar = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
