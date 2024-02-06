package p040o;

import kotlin.TypeCastException;

/* renamed from: o.onBoardingInAppClick */
public final class onBoardingInAppClick extends onReturnHomeButtonClick implements MwManageReceivingAccountActivity {
    public final boolean MediaBrowserCompat$ItemReceiver() {
        return true;
    }

    public final onBoardingInAppClick read() {
        return this;
    }

    public final String IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "state");
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$SearchResultReceiver();
        if (MediaBrowserCompat$SearchResultReceiver != null) {
            boolean z = true;
            for (NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) MediaBrowserCompat$SearchResultReceiver; !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ndidIdpShareSuccessActivity, (Object) this); ndidIdpShareSuccessActivity = ndidIdpShareSuccessActivity.MediaBrowserCompat$MediaItem()) {
                if (ndidIdpShareSuccessActivity instanceof MwManageWalletActivity_ViewBinding) {
                    MwManageWalletActivity_ViewBinding mwManageWalletActivity_ViewBinding = (MwManageWalletActivity_ViewBinding) ndidIdpShareSuccessActivity;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(mwManageWalletActivity_ViewBinding);
                }
            }
            sb.append("]");
            String obj = sb.toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "StringBuilder().apply(builderAction).toString()");
            return obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    public final String toString() {
        return MwChangeCasaSuccessActivity.MediaBrowserCompat$ItemReceiver() ? IconCompatParcelizer("Active") : super.toString();
    }
}
