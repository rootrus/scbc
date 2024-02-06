package com.scb.phone.view.custom.debitcard;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomPinWithMaxInput_ViewBinding implements Unbinder {
    private CustomPinWithMaxInput MediaBrowserCompat$ItemReceiver;

    public CustomPinWithMaxInput_ViewBinding(CustomPinWithMaxInput customPinWithMaxInput, View view) {
        this.MediaBrowserCompat$ItemReceiver = customPinWithMaxInput;
        customPinWithMaxInput.imageInput1 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input1, "field 'imageInput1'", ImageView.class);
        customPinWithMaxInput.imageInput2 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input2, "field 'imageInput2'", ImageView.class);
        customPinWithMaxInput.imageInput3 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input3, "field 'imageInput3'", ImageView.class);
        customPinWithMaxInput.imageInput4 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input4, "field 'imageInput4'", ImageView.class);
        customPinWithMaxInput.imageInput5 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input5, "field 'imageInput5'", ImageView.class);
        customPinWithMaxInput.imageInput6 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input6, "field 'imageInput6'", ImageView.class);
    }

    public final void read() {
        CustomPinWithMaxInput customPinWithMaxInput = this.MediaBrowserCompat$ItemReceiver;
        if (customPinWithMaxInput != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customPinWithMaxInput.imageInput1 = null;
            customPinWithMaxInput.imageInput2 = null;
            customPinWithMaxInput.imageInput3 = null;
            customPinWithMaxInput.imageInput4 = null;
            customPinWithMaxInput.imageInput5 = null;
            customPinWithMaxInput.imageInput6 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
