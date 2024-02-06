package com.scb.phone.view.activity.ndid;

import android.view.View;
import android.widget.EditText;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;

/* renamed from: com.scb.phone.view.activity.ndid.NdidNationalIdInputActivity$MediaBrowserCompat$CustomActionResultReceiver */
class C5676xf6023c28 extends FragmentBuilder_BindCreditLimitDisplayFragment {
    private View IconCompatParcelizer;
    private /* synthetic */ NdidNationalIdInputActivity MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private EditText write;

    public C5676xf6023c28(NdidNationalIdInputActivity ndidNationalIdInputActivity, EditText editText, int i, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ndidNationalIdInputActivity;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.write = editText;
        this.IconCompatParcelizer = view;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        NdidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (charSequence.length() == this.MediaBrowserCompat$ItemReceiver) {
            if (this.IconCompatParcelizer == this.MediaBrowserCompat$CustomActionResultReceiver.laserIdSecond || this.IconCompatParcelizer == this.MediaBrowserCompat$CustomActionResultReceiver.laserIdThird) {
                ((EditText) this.IconCompatParcelizer).setText("");
            }
            this.IconCompatParcelizer.requestFocus();
        }
        if (charSequence.length() != 0) {
            this.write.setTextColor(-13290951);
        } else {
            this.write.setTextColor(-3553587);
        }
    }
}
