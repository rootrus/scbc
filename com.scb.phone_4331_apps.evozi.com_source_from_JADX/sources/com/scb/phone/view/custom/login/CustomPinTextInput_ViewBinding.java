package com.scb.phone.view.custom.login;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomPinTextInput_ViewBinding implements Unbinder {
    private CustomPinTextInput MediaBrowserCompat$CustomActionResultReceiver;

    public CustomPinTextInput_ViewBinding(CustomPinTextInput customPinTextInput, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customPinTextInput;
        customPinTextInput.textInput1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_input1, "field 'textInput1'", TextView.class);
        customPinTextInput.textInput2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_input2, "field 'textInput2'", TextView.class);
        customPinTextInput.textInput3 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_input3, "field 'textInput3'", TextView.class);
        customPinTextInput.textInput4 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_input4, "field 'textInput4'", TextView.class);
        customPinTextInput.textInput5 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_input5, "field 'textInput5'", TextView.class);
        customPinTextInput.textInput6 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_input6, "field 'textInput6'", TextView.class);
    }

    public final void read() {
        CustomPinTextInput customPinTextInput = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customPinTextInput != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customPinTextInput.textInput1 = null;
            customPinTextInput.textInput2 = null;
            customPinTextInput.textInput3 = null;
            customPinTextInput.textInput4 = null;
            customPinTextInput.textInput5 = null;
            customPinTextInput.textInput6 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
