package p040o;

import java.io.IOException;
import org.apache.http.HttpException;

/* renamed from: o.CreditCardDetailBilledAdapter$BilledHolder_ViewBinding */
public final class CreditCardDetailBilledAdapter$BilledHolder_ViewBinding implements PrivacyManagementLandingViewHolder_ViewBinding {
    private final ScbPrivacyPolicyActivity_ViewBinding[] IconCompatParcelizer;
    private final PrivacyManagementLandingViewHolder_ViewBinding[] MediaBrowserCompat$CustomActionResultReceiver;

    public CreditCardDetailBilledAdapter$BilledHolder_ViewBinding(PrivacyManagementLandingViewHolder_ViewBinding[] privacyManagementLandingViewHolder_ViewBindingArr, ScbPrivacyPolicyActivity_ViewBinding[] scbPrivacyPolicyActivity_ViewBindingArr) {
        int length = privacyManagementLandingViewHolder_ViewBindingArr.length;
        PrivacyManagementLandingViewHolder_ViewBinding[] privacyManagementLandingViewHolder_ViewBindingArr2 = new PrivacyManagementLandingViewHolder_ViewBinding[length];
        this.MediaBrowserCompat$CustomActionResultReceiver = privacyManagementLandingViewHolder_ViewBindingArr2;
        System.arraycopy(privacyManagementLandingViewHolder_ViewBindingArr, 0, privacyManagementLandingViewHolder_ViewBindingArr2, 0, length);
        int length2 = scbPrivacyPolicyActivity_ViewBindingArr.length;
        ScbPrivacyPolicyActivity_ViewBinding[] scbPrivacyPolicyActivity_ViewBindingArr2 = new ScbPrivacyPolicyActivity_ViewBinding[length2];
        this.IconCompatParcelizer = scbPrivacyPolicyActivity_ViewBindingArr2;
        System.arraycopy(scbPrivacyPolicyActivity_ViewBindingArr, 0, scbPrivacyPolicyActivity_ViewBindingArr2, 0, length2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws IOException, HttpException {
        for (PrivacyManagementLandingViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver2 : this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(privacyConsentActivity, creditCardBilledDetailAdapter$ParentViewHolder);
        }
    }

    public final void IconCompatParcelizer(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws IOException, HttpException {
        for (ScbPrivacyPolicyActivity_ViewBinding IconCompatParcelizer2 : this.IconCompatParcelizer) {
            IconCompatParcelizer2.IconCompatParcelizer(scbPrivacyPolicyActivity, creditCardBilledDetailAdapter$ParentViewHolder);
        }
    }
}
