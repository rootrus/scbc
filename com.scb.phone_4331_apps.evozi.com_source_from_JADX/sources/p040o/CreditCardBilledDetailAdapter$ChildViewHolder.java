package p040o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpException;

@Deprecated
/* renamed from: o.CreditCardBilledDetailAdapter$ChildViewHolder */
public final class CreditCardBilledDetailAdapter$ChildViewHolder implements PrivacyManagementLandingViewHolder_ViewBinding, Cloneable {
    public List<PrivacyManagementLandingViewHolder_ViewBinding> IconCompatParcelizer = new ArrayList();
    public List<ScbPrivacyPolicyActivity_ViewBinding> MediaBrowserCompat$ItemReceiver = new ArrayList();

    public final void MediaBrowserCompat$CustomActionResultReceiver(PrivacyConsentActivity privacyConsentActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws IOException, HttpException {
        for (PrivacyManagementLandingViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver : this.IconCompatParcelizer) {
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(privacyConsentActivity, creditCardBilledDetailAdapter$ParentViewHolder);
        }
    }

    public final void IconCompatParcelizer(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) throws IOException, HttpException {
        for (ScbPrivacyPolicyActivity_ViewBinding IconCompatParcelizer2 : this.MediaBrowserCompat$ItemReceiver) {
            IconCompatParcelizer2.IconCompatParcelizer(scbPrivacyPolicyActivity, creditCardBilledDetailAdapter$ParentViewHolder);
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        CreditCardBilledDetailAdapter$ChildViewHolder creditCardBilledDetailAdapter$ChildViewHolder = (CreditCardBilledDetailAdapter$ChildViewHolder) super.clone();
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.clear();
        creditCardBilledDetailAdapter$ChildViewHolder.IconCompatParcelizer.addAll(this.IconCompatParcelizer);
        creditCardBilledDetailAdapter$ChildViewHolder.MediaBrowserCompat$ItemReceiver.clear();
        creditCardBilledDetailAdapter$ChildViewHolder.MediaBrowserCompat$ItemReceiver.addAll(this.MediaBrowserCompat$ItemReceiver);
        return creditCardBilledDetailAdapter$ChildViewHolder;
    }
}
