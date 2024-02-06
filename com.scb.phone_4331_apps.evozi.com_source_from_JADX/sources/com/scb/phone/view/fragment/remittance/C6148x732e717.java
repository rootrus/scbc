package com.scb.phone.view.fragment.remittance;

import android.text.Editable;
import com.scb.phone.view.custom.common.TintNoteEditText;
import p040o.C4997nB;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.remittance.RemittanceAmountFormFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6148x732e717 extends FragmentBuilder_BindCreditLimitDisplayFragment {
    private /* synthetic */ RemittanceAmountFormFragment IconCompatParcelizer;

    C6148x732e717(RemittanceAmountFormFragment remittanceAmountFormFragment) {
        this.IconCompatParcelizer = remittanceAmountFormFragment;
    }

    public final void afterTextChanged(Editable editable) {
        onGetStartedClick.write((Object) editable, "editable");
        TintNoteEditText tintNoteEditText = this.IconCompatParcelizer.etNote;
        if (tintNoteEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etNote");
        }
        if (tintNoteEditText.hasFocus()) {
            C4997nB nBVar = this.IconCompatParcelizer.presenter;
            if (nBVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String obj = editable.toString();
            onGetStartedClick.write((Object) obj, "note");
            nBVar.MediaBrowserCompat$ItemReceiver = obj;
        }
    }
}
