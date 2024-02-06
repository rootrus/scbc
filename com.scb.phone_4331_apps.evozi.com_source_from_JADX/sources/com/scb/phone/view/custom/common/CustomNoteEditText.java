package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p040o.FragmentBuilder_BindBaseMapTabFragment;

public class CustomNoteEditText extends EditText {
    private FragmentBuilder_BindBaseMapTabFragment MediaBrowserCompat$ItemReceiver;

    public CustomNoteEditText(Context context) {
        super(context);
    }

    public CustomNoteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomNoteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= -1073741825;
        return onCreateInputConnection;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        FragmentBuilder_BindBaseMapTabFragment fragmentBuilder_BindBaseMapTabFragment;
        if (i == 4 && keyEvent.getAction() == 1 && (fragmentBuilder_BindBaseMapTabFragment = this.MediaBrowserCompat$ItemReceiver) != null) {
            fragmentBuilder_BindBaseMapTabFragment.read();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void onEditorAction(int i) {
        FragmentBuilder_BindBaseMapTabFragment fragmentBuilder_BindBaseMapTabFragment;
        if (i == 6 && (fragmentBuilder_BindBaseMapTabFragment = this.MediaBrowserCompat$ItemReceiver) != null) {
            fragmentBuilder_BindBaseMapTabFragment.MediaBrowserCompat$CustomActionResultReceiver();
        }
        super.onEditorAction(i);
    }

    public void setEditTextKeyboardActionListener(FragmentBuilder_BindBaseMapTabFragment fragmentBuilder_BindBaseMapTabFragment) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindBaseMapTabFragment;
    }
}
