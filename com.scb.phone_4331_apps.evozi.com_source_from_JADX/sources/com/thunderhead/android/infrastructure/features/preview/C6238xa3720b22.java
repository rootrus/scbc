package com.thunderhead.android.infrastructure.features.preview;

import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindTouchPointInputCidFragment;
import p040o.FragmentBuilder_BindTransferHistoryFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

/* renamed from: com.thunderhead.android.infrastructure.features.preview.StateConnectedPreviewPanelPresenter$MediaBrowserCompat$SearchResultReceiver */
final class C6238xa3720b22 extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindTransferHistoryFragment, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ StateConnectedPreviewPanelPresenter read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6238xa3720b22(StateConnectedPreviewPanelPresenter stateConnectedPreviewPanelPresenter) {
        super(1);
        this.read = stateConnectedPreviewPanelPresenter;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        FragmentBuilder_BindTouchPointInputCidFragment access$getView$p;
        FragmentBuilder_BindTransferHistoryFragment fragmentBuilder_BindTransferHistoryFragment = (FragmentBuilder_BindTransferHistoryFragment) obj;
        if (!(fragmentBuilder_BindTransferHistoryFragment == null || (access$getView$p = StateConnectedPreviewPanelPresenter.access$getView$p(this.read)) == null)) {
            access$getView$p.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindTransferHistoryFragment);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
