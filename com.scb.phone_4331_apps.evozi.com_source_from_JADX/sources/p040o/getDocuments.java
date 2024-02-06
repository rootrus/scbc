package p040o;

import android.content.Intent;
import com.scb.phone.view.activity.privacypolicy.ScbPrivacyPolicyActivity;
import com.scb.phone.view.fragment.easycash.BaseEasycashReferralSendFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.getDocuments */
public final /* synthetic */ class getDocuments implements C6992x633f693d {
    private final /* synthetic */ BaseEasycashReferralSendFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getDocuments(BaseEasycashReferralSendFragment baseEasycashReferralSendFragment) {
        this.MediaBrowserCompat$ItemReceiver = baseEasycashReferralSendFragment;
    }

    public final boolean read(String str) {
        BaseEasycashReferralSendFragment baseEasycashReferralSendFragment = this.MediaBrowserCompat$ItemReceiver;
        Intent read = ScbPrivacyPolicyActivity.read(baseEasycashReferralSendFragment.requireContext(), str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        BaseEasycashReferralSendFragment.read(baseEasycashReferralSendFragment, read);
        return true;
    }
}
