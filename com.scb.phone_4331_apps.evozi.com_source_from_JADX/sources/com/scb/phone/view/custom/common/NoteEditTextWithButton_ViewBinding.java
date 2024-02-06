package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class NoteEditTextWithButton_ViewBinding extends NoteEditText_ViewBinding {
    private NoteEditTextWithButton IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public NoteEditTextWithButton_ViewBinding(final NoteEditTextWithButton noteEditTextWithButton, View view) {
        super(noteEditTextWithButton, view);
        this.IconCompatParcelizer = noteEditTextWithButton;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_done, "field 'buttonDone' and method 'onDoneButtonClick'");
        noteEditTextWithButton.buttonDone = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_done, "field 'buttonDone'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NoteEditTextWithButton.this.onDoneButtonClick(view);
            }
        });
    }

    public final void read() {
        NoteEditTextWithButton noteEditTextWithButton = this.IconCompatParcelizer;
        if (noteEditTextWithButton != null) {
            this.IconCompatParcelizer = null;
            noteEditTextWithButton.buttonDone = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
