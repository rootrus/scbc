package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.scb.phone.view.custom.common.CustomURLEditTextWithButtonView;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessURLInfoFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6023x903f3a73 implements View.OnClickListener {
    private /* synthetic */ CustomURLEditTextWithButtonView MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ HmlBusinessURLInfoFragment write;

    C6023x903f3a73(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment, CustomURLEditTextWithButtonView customURLEditTextWithButtonView) {
        this.write = hmlBusinessURLInfoFragment;
        this.MediaBrowserCompat$ItemReceiver = customURLEditTextWithButtonView;
    }

    public final void onClick(View view) {
        onGetStartedClick.IconCompatParcelizer((Object) view, "it");
        onGetStartedClick.write((Object) view, "$this$clearInputFocus");
        boolean z = true;
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        EditText editText = this.MediaBrowserCompat$ItemReceiver.urlEt;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
        }
        if (editText.getText().toString().length() <= 0) {
            z = false;
        }
        if (z) {
            HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment = this.write;
            Context requireContext = hmlBusinessURLInfoFragment.requireContext();
            onGetStartedClick.IconCompatParcelizer((Object) requireContext, "this.requireContext()");
            EditText editText2 = this.MediaBrowserCompat$ItemReceiver.urlEt;
            if (editText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
            }
            HmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(hmlBusinessURLInfoFragment, requireContext, editText2.getText().toString());
        }
    }
}
