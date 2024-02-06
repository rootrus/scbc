package com.google.android.material.textfield;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import p040o.nAllocationSetSurface;

public class TextInputEditText extends AppCompatEditText {
    public TextInputEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nAllocationSetSurface.read.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CharSequence getHint() {
        TextInputLayout write = write();
        if (write == null || !write.MediaMetadataCompat) {
            return super.getHint();
        }
        if (write.MediaDescriptionCompat) {
            return write.MediaBrowserCompat$SearchResultReceiver;
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout write = write();
            CharSequence charSequence = null;
            if (write != null && write.MediaDescriptionCompat) {
                charSequence = write.MediaBrowserCompat$SearchResultReceiver;
            }
            editorInfo.hintText = charSequence;
        }
        return onCreateInputConnection;
    }

    private TextInputLayout write() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }
}
