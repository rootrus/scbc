package p040o;

import java.util.Collection;

@Deprecated
/* renamed from: o.DeejungInstallmentsReviewAdapter$InstallmentsHeaderViewHolder */
public final class DeejungInstallmentsReviewAdapter$InstallmentsHeaderViewHolder implements ThemesActivity, FacebookConsentDeepLinkActivity {
    private final ThirdPartyConsentActivity read;

    private DeejungInstallmentsReviewAdapter$InstallmentsHeaderViewHolder(byte b) {
        this.read = new C9821x9cfbcc54((String[]) null, false);
    }

    public DeejungInstallmentsReviewAdapter$InstallmentsHeaderViewHolder() {
        this((byte) 0);
    }

    public final ThirdPartyConsentActivity MediaBrowserCompat$CustomActionResultReceiver(AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        if (amountDetailsSuccessAdapter$SuccessRow_ViewBinding == null) {
            return new C9821x9cfbcc54();
        }
        String[] strArr = null;
        Collection collection = (Collection) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.protocol.cookie-datepatterns");
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new C9821x9cfbcc54(strArr, amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.protocol.single-cookie-header", false));
    }

    public final ThirdPartyConsentActivity MediaBrowserCompat$CustomActionResultReceiver(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        return this.read;
    }
}
