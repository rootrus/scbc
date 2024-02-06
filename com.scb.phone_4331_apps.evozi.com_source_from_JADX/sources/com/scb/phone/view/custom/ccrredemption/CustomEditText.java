package com.scb.phone.view.custom.ccrredemption;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import p040o.getEkycRegistration;

public class CustomEditText extends AppCompatEditText {
    private getEkycRegistration MediaBrowserCompat$ItemReceiver;

    public void setKeyboardBackPressListener(getEkycRegistration getekycregistration) {
        this.MediaBrowserCompat$ItemReceiver = getekycregistration;
    }

    public CustomEditText(Context context) {
        super(context);
    }

    public CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        getEkycRegistration getekycregistration;
        if ((keyEvent.getKeyCode() != 4 && keyEvent.getKeyCode() != 1) || (getekycregistration = this.MediaBrowserCompat$ItemReceiver) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        getekycregistration.MediaBrowserCompat$ItemReceiver();
        return true;
    }
}
