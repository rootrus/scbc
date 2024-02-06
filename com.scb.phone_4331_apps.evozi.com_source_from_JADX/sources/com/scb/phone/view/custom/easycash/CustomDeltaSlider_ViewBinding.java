package com.scb.phone.view.custom.easycash;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomDeltaSlider_ViewBinding implements Unbinder {
    private CustomDeltaSlider MediaBrowserCompat$CustomActionResultReceiver;

    public CustomDeltaSlider_ViewBinding(CustomDeltaSlider customDeltaSlider, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customDeltaSlider;
        customDeltaSlider.slider = (AppCompatSeekBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.slider, "field 'slider'", AppCompatSeekBar.class);
        customDeltaSlider.valueLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_slider_value, "field 'valueLabel'", TextView.class);
        customDeltaSlider.minValueLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_slider_min, "field 'minValueLabel'", TextView.class);
        customDeltaSlider.maxValueLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_slider_max, "field 'maxValueLabel'", TextView.class);
        customDeltaSlider.increaseButton = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_increase, "field 'increaseButton'", ImageButton.class);
        customDeltaSlider.decreaseButton = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_decrease, "field 'decreaseButton'", ImageButton.class);
    }

    public final void read() {
        CustomDeltaSlider customDeltaSlider = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customDeltaSlider != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customDeltaSlider.slider = null;
            customDeltaSlider.valueLabel = null;
            customDeltaSlider.minValueLabel = null;
            customDeltaSlider.maxValueLabel = null;
            customDeltaSlider.increaseButton = null;
            customDeltaSlider.decreaseButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
