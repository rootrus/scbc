package p040o;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.NotificationAdapter$NotificationHolder_ViewBinding */
public final class NotificationAdapter$NotificationHolder_ViewBinding extends MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding {
    public int IconCompatParcelizer = 5;
    public Set MediaBrowserCompat$CustomActionResultReceiver = Collections.EMPTY_SET;

    private NotificationAdapter$NotificationHolder_ViewBinding(Set set, BankAccountAdapter$BankAccountViewHolder bankAccountAdapter$BankAccountViewHolder) throws InvalidAlgorithmParameterException {
        super(set);
        MediaBrowserCompat$ItemReceiver(bankAccountAdapter$BankAccountViewHolder);
    }

    /* access modifiers changed from: protected */
    public final void write(PKIXParameters pKIXParameters) {
        super.write(pKIXParameters);
        if (pKIXParameters instanceof NotificationAdapter$NotificationHolder_ViewBinding) {
            NotificationAdapter$NotificationHolder_ViewBinding notificationAdapter$NotificationHolder_ViewBinding = (NotificationAdapter$NotificationHolder_ViewBinding) pKIXParameters;
            this.IconCompatParcelizer = notificationAdapter$NotificationHolder_ViewBinding.IconCompatParcelizer;
            this.MediaBrowserCompat$CustomActionResultReceiver = new HashSet(notificationAdapter$NotificationHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (pKIXParameters instanceof PKIXBuilderParameters) {
            this.IconCompatParcelizer = ((PKIXBuilderParameters) pKIXParameters).getMaxPathLength();
        }
    }

    public final Object clone() {
        try {
            NotificationAdapter$NotificationHolder_ViewBinding notificationAdapter$NotificationHolder_ViewBinding = new NotificationAdapter$NotificationHolder_ViewBinding(getTrustAnchors(), write());
            notificationAdapter$NotificationHolder_ViewBinding.write(this);
            return notificationAdapter$NotificationHolder_ViewBinding;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
