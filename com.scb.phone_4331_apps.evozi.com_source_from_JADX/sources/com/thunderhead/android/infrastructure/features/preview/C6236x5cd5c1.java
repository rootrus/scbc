package com.thunderhead.android.infrastructure.features.preview;

import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindTouchPointInputCidFragment;
import p040o.FragmentBuilder_BindTransferTabFragment;
import p040o.FragmentBuilder_BindTransferToMeStep1Fragment;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

/* renamed from: com.thunderhead.android.infrastructure.features.preview.StateConnectedPreviewPanelPresenter$MediaBrowserCompat$CustomActionResultReceiver */
final class C6236x5cd5c1 extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindTransferToMeStep1Fragment, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ StateConnectedPreviewPanelPresenter IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6236x5cd5c1(StateConnectedPreviewPanelPresenter stateConnectedPreviewPanelPresenter) {
        super(1);
        this.IconCompatParcelizer = stateConnectedPreviewPanelPresenter;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        FragmentBuilder_BindTouchPointInputCidFragment access$getView$p;
        FragmentBuilder_BindTransferToMeStep1Fragment fragmentBuilder_BindTransferToMeStep1Fragment = (FragmentBuilder_BindTransferToMeStep1Fragment) obj;
        if (!(fragmentBuilder_BindTransferToMeStep1Fragment == null || (access$getView$p = StateConnectedPreviewPanelPresenter.access$getView$p(this.IconCompatParcelizer)) == null)) {
            String str = fragmentBuilder_BindTransferToMeStep1Fragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) str, "it.name");
            access$getView$p.MediaBrowserCompat$ItemReceiver(str, FragmentBuilder_BindTransferTabFragment.read(fragmentBuilder_BindTransferToMeStep1Fragment.MediaBrowserCompat$ItemReceiver));
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
