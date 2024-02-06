package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CounterEditText_ViewBinding implements Unbinder {
    private View IconCompatParcelizer;
    private CounterEditText write;

    public CounterEditText_ViewBinding(final CounterEditText counterEditText, View view) {
        this.write = counterEditText;
        counterEditText.editText = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_text, "field 'editText'", EditText.class);
        counterEditText.textCounter = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.counter, "field 'textCounter'", TextView.class);
        counterEditText.errorText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'errorText'", TextView.class);
        counterEditText.titleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text, "field 'titleText'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.edit_clear, "method 'onClickClear'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CounterEditText.this.onClickClear();
            }
        });
    }

    public final void read() {
        CounterEditText counterEditText = this.write;
        if (counterEditText != null) {
            this.write = null;
            counterEditText.editText = null;
            counterEditText.textCounter = null;
            counterEditText.errorText = null;
            counterEditText.titleText = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
