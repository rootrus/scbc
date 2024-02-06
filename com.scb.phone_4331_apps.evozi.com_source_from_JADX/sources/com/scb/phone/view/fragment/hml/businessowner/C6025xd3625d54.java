package com.scb.phone.view.fragment.hml.businessowner;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessURLInfoFragment$MediaBrowserCompat$SearchResultReceiver */
final class C6025xd3625d54 implements View.OnClickListener {
    private /* synthetic */ HmlBusinessURLInfoFragment write;

    C6025xd3625d54(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment) {
        this.write = hmlBusinessURLInfoFragment;
    }

    public final void onClick(View view) {
        this.write.read(true);
        onGetStartedClick.IconCompatParcelizer((Object) view, "it");
        onGetStartedClick.write((Object) view, "$this$clearInputFocus");
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
