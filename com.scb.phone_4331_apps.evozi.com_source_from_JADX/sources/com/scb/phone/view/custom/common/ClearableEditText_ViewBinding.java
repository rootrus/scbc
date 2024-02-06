package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ClearableEditText_ViewBinding implements Unbinder {
    private ClearableEditText MediaBrowserCompat$CustomActionResultReceiver;

    public ClearableEditText_ViewBinding(ClearableEditText clearableEditText, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = clearableEditText;
        clearableEditText.inputEditText = (CustomNoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_text, "field 'inputEditText'", CustomNoteEditText.class);
        clearableEditText.inputTextLayout = onStart.IconCompatParcelizer(view, R.id.input, "field 'inputTextLayout'");
        clearableEditText.errorText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'errorText'", TextView.class);
        clearableEditText.clearButton = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_clear, "field 'clearButton'", ImageButton.class);
        clearableEditText.editTextIcon = (ImageView) onStart.IconCompatParcelizer(view, R.id.edit_text_icon, "field 'editTextIcon'", ImageView.class);
    }

    public final void read() {
        ClearableEditText clearableEditText = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (clearableEditText != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            clearableEditText.inputEditText = null;
            clearableEditText.inputTextLayout = null;
            clearableEditText.errorText = null;
            clearableEditText.clearButton = null;
            clearableEditText.editTextIcon = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
