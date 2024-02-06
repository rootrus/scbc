package p040o;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.util.ArrayList;
import java.util.Collections;
import p040o.TileAdapter;

/* renamed from: o.SmeLoanAccountSelectorAdapter$ItemViewHolder */
public class SmeLoanAccountSelectorAdapter$ItemViewHolder extends CertPathBuilderSpi {
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        boolean z = certPathParameters instanceof PKIXBuilderParameters;
        if (z || (certPathParameters instanceof NotificationAdapter$NotificationHolder_ViewBinding) || (certPathParameters instanceof TileAdapter.BaseHolder_ViewBinding)) {
            new ArrayList();
            if (z) {
                TileAdapter.BaseHolder_ViewBinding.read read = new TileAdapter.BaseHolder_ViewBinding.read((PKIXBuilderParameters) certPathParameters);
                if (certPathParameters instanceof MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding) {
                    NotificationAdapter$NotificationHolder_ViewBinding notificationAdapter$NotificationHolder_ViewBinding = (NotificationAdapter$NotificationHolder_ViewBinding) certPathParameters;
                    read.MediaBrowserCompat$ItemReceiver.addAll(Collections.unmodifiableSet(notificationAdapter$NotificationHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver));
                    int i = notificationAdapter$NotificationHolder_ViewBinding.IconCompatParcelizer;
                    if (i >= -1) {
                        read.read = i;
                        Collections.unmodifiableList(new ArrayList(notificationAdapter$NotificationHolder_ViewBinding.MediaBrowserCompat$SearchResultReceiver));
                    } else {
                        throw new InvalidParameterException("The maximum path length parameter can not be less than -1.");
                    }
                }
                new TileAdapter.BaseHolder_ViewBinding(read, (byte) 0);
            }
            new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append("TargetConstraints must be an instance of ");
            sb.append(onMobileCheckBoxClick.class.getName());
            sb.append(" for ");
            sb.append(getClass().getName());
            sb.append(" class.");
            throw new CertPathBuilderException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Parameters must be an instance of ");
        sb2.append(PKIXBuilderParameters.class.getName());
        sb2.append(" or ");
        sb2.append(TileAdapter.BaseHolder_ViewBinding.class.getName());
        sb2.append(".");
        throw new InvalidAlgorithmParameterException(sb2.toString());
    }
}
