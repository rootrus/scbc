package com.scb.phone.view.fragment.ntb.touchpoint;

import android.text.TextUtils;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.C4241dE;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;
import p040o.onGetStartedClick;

public final class TouchPointInputCidFragment$MediaBrowserCompat$ItemReceiver implements FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write {
    private /* synthetic */ TouchPointInputCidFragment IconCompatParcelizer;
    private /* synthetic */ CommonInputViewGroup MediaBrowserCompat$ItemReceiver;

    TouchPointInputCidFragment$MediaBrowserCompat$ItemReceiver(CommonInputViewGroup commonInputViewGroup, TouchPointInputCidFragment touchPointInputCidFragment) {
        this.MediaBrowserCompat$ItemReceiver = commonInputViewGroup;
        this.IconCompatParcelizer = touchPointInputCidFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "text");
        C4241dE dEVar = this.IconCompatParcelizer.presenter;
        if (dEVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dEVar.IconCompatParcelizer(str, false);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "text");
        if (TextUtils.isEmpty(str)) {
            CommonInputViewGroup commonInputViewGroup = this.MediaBrowserCompat$ItemReceiver;
            commonInputViewGroup.write = false;
            commonInputViewGroup.mEditClearImageButton.setVisibility(8);
        } else {
            CommonInputViewGroup commonInputViewGroup2 = this.MediaBrowserCompat$ItemReceiver;
            commonInputViewGroup2.write = true;
            commonInputViewGroup2.mEditClearImageButton.setVisibility(0);
        }
        C4241dE dEVar = this.IconCompatParcelizer.presenter;
        if (dEVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dEVar.IconCompatParcelizer(str, true);
    }
}
