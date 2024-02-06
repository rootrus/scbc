package com.thunderhead.android.infrastructure.features.preview;

import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindTouchPointInputCidFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

final class StateConnectedPreviewPanelPresenter$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ StateConnectedPreviewPanelPresenter read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StateConnectedPreviewPanelPresenter$MediaBrowserCompat$MediaItem(StateConnectedPreviewPanelPresenter stateConnectedPreviewPanelPresenter) {
        super(1);
        this.read = stateConnectedPreviewPanelPresenter;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        FragmentBuilder_BindTouchPointInputCidFragment access$getView$p = StateConnectedPreviewPanelPresenter.access$getView$p(this.read);
        if (access$getView$p != null) {
            access$getView$p.IconCompatParcelizer(str);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
