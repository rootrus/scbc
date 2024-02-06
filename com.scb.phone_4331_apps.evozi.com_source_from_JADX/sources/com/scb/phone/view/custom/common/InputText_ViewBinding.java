package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class InputText_ViewBinding implements Unbinder {
    private InputText MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public InputText_ViewBinding(final InputText inputText, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = inputText;
        inputText.titleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text, "field 'titleText'", TextView.class);
        inputText.counterText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.counter, "field 'counterText'", TextView.class);
        inputText.inputEditText = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input, "field 'inputEditText'", EditText.class);
        inputText.errorText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'errorText'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.edit_clear, "field 'clearButton' and method 'onClearButtonClick'");
        inputText.clearButton = (ImageButton) onStart.write(IconCompatParcelizer, R.id.edit_clear, "field 'clearButton'", ImageButton.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                InputText.this.onClearButtonClick();
            }
        });
    }

    public final void read() {
        InputText inputText = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (inputText != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            inputText.titleText = null;
            inputText.counterText = null;
            inputText.inputEditText = null;
            inputText.errorText = null;
            inputText.clearButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
