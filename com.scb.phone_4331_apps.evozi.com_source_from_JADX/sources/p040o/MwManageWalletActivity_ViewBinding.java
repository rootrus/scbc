package p040o;

import kotlin.TypeCastException;
import p040o.clickManagePin;

/* renamed from: o.MwManageWalletActivity_ViewBinding */
public abstract class MwManageWalletActivity_ViewBinding<J extends clickManagePin> extends MerchantWalletDetailActivity implements MwCurrentUserEwalletActivity, MwManageReceivingAccountActivity {
    public final J IconCompatParcelizer;

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return true;
    }

    public final onBoardingInAppClick read() {
        return null;
    }

    public MwManageWalletActivity_ViewBinding(J j) {
        onGetStartedClick.write((Object) j, "job");
        this.IconCompatParcelizer = j;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        J j = this.IconCompatParcelizer;
        if (j != null) {
            onDoneNicknameClick ondonenicknameclick = (onDoneNicknameClick) j;
            onGetStartedClick.write((Object) this, "node");
            while (true) {
                Object obj = ondonenicknameclick._state;
                if (obj instanceof BaseNtbInstructionActivity) {
                    ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) ondonenicknameclick);
                } else if (obj instanceof MwManageWalletActivity_ViewBinding) {
                    if (obj != this || onDoneNicknameClick.read.compareAndSet(ondonenicknameclick, obj, MwOnBoardSuccessActivity.MediaBrowserCompat$ItemReceiver)) {
                        return;
                    }
                } else if ((obj instanceof MwManageReceivingAccountActivity) && ((MwManageReceivingAccountActivity) obj).read() != null) {
                    aU_();
                    return;
                } else {
                    return;
                }
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
        }
    }
}
