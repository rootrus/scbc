package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class NoteEditText_ViewBinding implements Unbinder {
    private NoteEditText MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public NoteEditText_ViewBinding(final NoteEditText noteEditText, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = noteEditText;
        noteEditText.mNoteEditText = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note, "field 'mNoteEditText'", EditText.class);
        noteEditText.mTextCounter = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.counter, "field 'mTextCounter'", TextView.class);
        noteEditText.mErrorText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'mErrorText'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.edit_clear, "field 'mClearButton' and method 'onClickClear'");
        noteEditText.mClearButton = (ImageButton) onStart.write(IconCompatParcelizer, R.id.edit_clear, "field 'mClearButton'", ImageButton.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NoteEditText.this.onClickClear();
            }
        });
        noteEditText.mTitleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text, "field 'mTitleText'", TextView.class);
    }

    public void read() {
        NoteEditText noteEditText = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (noteEditText != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            noteEditText.mNoteEditText = null;
            noteEditText.mTextCounter = null;
            noteEditText.mErrorText = null;
            noteEditText.mClearButton = null;
            noteEditText.mTitleText = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
