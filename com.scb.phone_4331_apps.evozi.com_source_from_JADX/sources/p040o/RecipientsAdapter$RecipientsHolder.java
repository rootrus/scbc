package p040o;

import java.util.Collection;

@Deprecated
/* renamed from: o.RecipientsAdapter$RecipientsHolder */
public final class RecipientsAdapter$RecipientsHolder implements ThemesActivity, FacebookConsentDeepLinkActivity {
    private final ThirdPartyConsentActivity MediaBrowserCompat$ItemReceiver;

    private RecipientsAdapter$RecipientsHolder(byte b) {
        this.MediaBrowserCompat$ItemReceiver = new BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding((String[]) null, false);
    }

    public RecipientsAdapter$RecipientsHolder() {
        this((byte) 0);
    }

    public final ThirdPartyConsentActivity MediaBrowserCompat$CustomActionResultReceiver(AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        if (amountDetailsSuccessAdapter$SuccessRow_ViewBinding == null) {
            return new BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding();
        }
        String[] strArr = null;
        Collection collection = (Collection) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.protocol.cookie-datepatterns");
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new BulkTransferSuccessAdapter$SuccessViewHolder_ViewBinding(strArr, amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.protocol.single-cookie-header", false));
    }

    public final ThirdPartyConsentActivity MediaBrowserCompat$CustomActionResultReceiver(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
