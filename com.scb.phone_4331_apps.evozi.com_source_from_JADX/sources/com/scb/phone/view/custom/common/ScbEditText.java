package com.scb.phone.view.custom.common;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Field;
import p040o.getICheckDeserializerRtti;
import p040o.onCheckBoxClick;

public class ScbEditText extends AppCompatEditText {
    private boolean MediaBrowserCompat$ItemReceiver = false;
    private write read;

    public interface write {
        boolean MediaBrowserCompat$ItemReceiver(EditText editText, String str);
    }

    public ScbEditText(Context context) {
        super(context);
    }

    public ScbEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        write write2;
        if (i != 16908322 || (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) == null || (write2 = this.read) == null) {
            return super.onTextContextMenuItem(i);
        }
        return write2.MediaBrowserCompat$ItemReceiver(this, primaryClip.getItemAt(0).coerceToText(getContext()).toString());
    }

    public void setOnPasteListener(write write2) {
        this.read = write2;
    }

    public void setBlockInsertion(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.MediaBrowserCompat$ItemReceiver && motionEvent.getAction() == 0) {
            try {
                Field declaredField = TextView.class.getDeclaredField("mEditor");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Field declaredField2 = Class.forName("android.widget.Editor").getDeclaredField("mInsertionControllerEnabled");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, Boolean.FALSE);
            } catch (Exception e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public static class IconCompatParcelizer implements write {
        public final boolean MediaBrowserCompat$ItemReceiver(EditText editText, String str) {
            editText.setText(getICheckDeserializerRtti.MediaBrowserCompat$SearchResultReceiver(str));
            return true;
        }
    }
}
