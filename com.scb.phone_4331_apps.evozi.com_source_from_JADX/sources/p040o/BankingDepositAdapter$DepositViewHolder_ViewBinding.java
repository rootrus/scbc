package p040o;

import java.util.Collection;

@Deprecated
/* renamed from: o.BankingDepositAdapter$DepositViewHolder_ViewBinding */
public final class BankingDepositAdapter$DepositViewHolder_ViewBinding implements ThemesActivity, FacebookConsentDeepLinkActivity {
    private final ThirdPartyConsentActivity MediaBrowserCompat$ItemReceiver;

    private BankingDepositAdapter$DepositViewHolder_ViewBinding(byte b) {
        this.MediaBrowserCompat$ItemReceiver = new BankingAgentAdapter$ItemViewHolder_ViewBinding((String[]) null, false);
    }

    public BankingDepositAdapter$DepositViewHolder_ViewBinding() {
        this((byte) 0);
    }

    public final ThirdPartyConsentActivity MediaBrowserCompat$CustomActionResultReceiver(AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        if (amountDetailsSuccessAdapter$SuccessRow_ViewBinding == null) {
            return new BankingAgentAdapter$ItemViewHolder_ViewBinding();
        }
        String[] strArr = null;
        Collection collection = (Collection) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.protocol.cookie-datepatterns");
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new BankingAgentAdapter$ItemViewHolder_ViewBinding(strArr, amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.protocol.single-cookie-header", false));
    }

    public final ThirdPartyConsentActivity MediaBrowserCompat$CustomActionResultReceiver(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
