package com.thunderhead.android.infrastructure.features.preview;

import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindTouchPointInputCidFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

/* renamed from: com.thunderhead.android.infrastructure.features.preview.StateConnectedPreviewPanelPresenter$MediaBrowserCompat$ItemReceiver */
final class C6237xaed44a50 extends CheckEligibilityActivity implements FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ StateConnectedPreviewPanelPresenter read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6237xaed44a50(StateConnectedPreviewPanelPresenter stateConnectedPreviewPanelPresenter) {
        super(1);
        this.read = stateConnectedPreviewPanelPresenter;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Integer num = (Integer) obj;
        FragmentBuilder_BindTouchPointInputCidFragment access$getView$p = StateConnectedPreviewPanelPresenter.access$getView$p(this.read);
        if (access$getView$p != null) {
            access$getView$p.MediaBrowserCompat$ItemReceiver(num != null ? num.intValue() : 0);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
