package com.scb.phone.view.fragment.hml.businessowner;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import p040o.onGetStartedClick;

final class HmlBusinessURLInfoFragment$MediaSessionCompat$Token implements View.OnClickListener {
    public static final HmlBusinessURLInfoFragment$MediaSessionCompat$Token read = new HmlBusinessURLInfoFragment$MediaSessionCompat$Token();

    HmlBusinessURLInfoFragment$MediaSessionCompat$Token() {
    }

    public final void onClick(View view) {
        onGetStartedClick.write((Object) view, "v");
        onGetStartedClick.write((Object) view, "$this$clearInputFocus");
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
