package com.scb.phone.view.custom.login;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomPinInput_ViewBinding implements Unbinder {
    private CustomPinInput write;

    public CustomPinInput_ViewBinding(CustomPinInput customPinInput, View view) {
        this.write = customPinInput;
        customPinInput.imageInput1 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input1, "field 'imageInput1'", ImageView.class);
        customPinInput.imageInput2 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input2, "field 'imageInput2'", ImageView.class);
        customPinInput.imageInput3 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input3, "field 'imageInput3'", ImageView.class);
        customPinInput.imageInput4 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input4, "field 'imageInput4'", ImageView.class);
        customPinInput.imageInput5 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input5, "field 'imageInput5'", ImageView.class);
        customPinInput.imageInput6 = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_input6, "field 'imageInput6'", ImageView.class);
    }

    public final void read() {
        CustomPinInput customPinInput = this.write;
        if (customPinInput != null) {
            this.write = null;
            customPinInput.imageInput1 = null;
            customPinInput.imageInput2 = null;
            customPinInput.imageInput3 = null;
            customPinInput.imageInput4 = null;
            customPinInput.imageInput5 = null;
            customPinInput.imageInput6 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
