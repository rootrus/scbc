package com.scb.phone.view.fragment.juristic;

import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomEditText;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.juristic.JuristicRequestFormFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6072x4ce98f13 implements CustomEditText.write {
    private /* synthetic */ JuristicRequestFormFragment MediaBrowserCompat$ItemReceiver;

    C6072x4ce98f13(JuristicRequestFormFragment juristicRequestFormFragment) {
        this.MediaBrowserCompat$ItemReceiver = juristicRequestFormFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CommonInputViewGroup commonInputViewGroup = this.MediaBrowserCompat$ItemReceiver.ivgEmail;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        commonInputViewGroup.clearFocus();
    }
}
