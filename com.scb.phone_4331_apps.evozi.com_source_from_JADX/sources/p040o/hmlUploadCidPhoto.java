package p040o;

import com.scb.phone.view.custom.common.InputText$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.easycash.EasycashReferralSendDfwFragment;

/* renamed from: o.hmlUploadCidPhoto */
public final /* synthetic */ class hmlUploadCidPhoto implements InputText$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ EasycashReferralSendDfwFragment IconCompatParcelizer;

    public /* synthetic */ hmlUploadCidPhoto(EasycashReferralSendDfwFragment easycashReferralSendDfwFragment) {
        this.IconCompatParcelizer = easycashReferralSendDfwFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.IconCompatParcelizer.easycashReferralSendDfwPresenter.write(str);
    }
}
