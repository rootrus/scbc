package p040o;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.jce.exception.ExtCertPathBuilderException;
import org.spongycastle.jce.provider.AnnotatedException;
import p040o.TileAdapter;

/* renamed from: o.SmeLoanAccountSelectorAdapter$ItemViewHolder_ViewBinding */
public class SmeLoanAccountSelectorAdapter$ItemViewHolder_ViewBinding extends CertPathBuilderSpi {
    private Exception MediaBrowserCompat$CustomActionResultReceiver;

    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        TileAdapter.BaseHolder_ViewBinding baseHolder_ViewBinding;
        Exception exc;
        TileAdapter.BaseHolder_ViewBinding.read read;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver = new TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver((PKIXParameters) pKIXBuilderParameters);
            if (certPathParameters instanceof MwShopTypeAdapter$ShopTypeViewHolder_ViewBinding) {
                NotificationAdapter$NotificationHolder_ViewBinding notificationAdapter$NotificationHolder_ViewBinding = (NotificationAdapter$NotificationHolder_ViewBinding) certPathParameters;
                for (ShortcutAdapter$MyViewHolder_ViewBinding add : Collections.unmodifiableList(notificationAdapter$NotificationHolder_ViewBinding.write)) {
                    tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.add(add);
                }
                read = new TileAdapter.BaseHolder_ViewBinding.read(new TileAdapter.BaseHolder(tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver, (byte) 0));
                read.MediaBrowserCompat$ItemReceiver.addAll(Collections.unmodifiableSet(notificationAdapter$NotificationHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver));
                int i = notificationAdapter$NotificationHolder_ViewBinding.IconCompatParcelizer;
                if (i >= -1) {
                    read.read = i;
                } else {
                    throw new InvalidParameterException("The maximum path length parameter can not be less than -1.");
                }
            } else {
                read = new TileAdapter.BaseHolder_ViewBinding.read(pKIXBuilderParameters);
            }
            baseHolder_ViewBinding = new TileAdapter.BaseHolder_ViewBinding(read, (byte) 0);
        } else if (certPathParameters instanceof TileAdapter.BaseHolder_ViewBinding) {
            baseHolder_ViewBinding = (TileAdapter.BaseHolder_ViewBinding) certPathParameters;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Parameters must be an instance of ");
            sb.append(PKIXBuilderParameters.class.getName());
            sb.append(" or ");
            sb.append(TileAdapter.BaseHolder_ViewBinding.class.getName());
            sb.append(".");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        TileAdapter.AddShortcutHolder_ViewBinding addShortcutHolder_ViewBinding = baseHolder_ViewBinding.write.MediaDescriptionCompat;
        try {
            Collection MediaBrowserCompat$CustomActionResultReceiver2 = DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(addShortcutHolder_ViewBinding, (List) baseHolder_ViewBinding.write.MediaBrowserCompat$CustomActionResultReceiver);
            MediaBrowserCompat$CustomActionResultReceiver2.addAll(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(addShortcutHolder_ViewBinding, (List) baseHolder_ViewBinding.write.MediaBrowserCompat$ItemReceiver.getCertStores()));
            if (!MediaBrowserCompat$CustomActionResultReceiver2.isEmpty()) {
                CertPathBuilderResult certPathBuilderResult = null;
                Iterator it = MediaBrowserCompat$CustomActionResultReceiver2.iterator();
                while (it.hasNext() && certPathBuilderResult == null) {
                    certPathBuilderResult = MediaBrowserCompat$CustomActionResultReceiver((X509Certificate) it.next(), baseHolder_ViewBinding, arrayList);
                }
                if (certPathBuilderResult != null || (exc = this.MediaBrowserCompat$CustomActionResultReceiver) == null) {
                    if (certPathBuilderResult != null || this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                        return certPathBuilderResult;
                    }
                    throw new CertPathBuilderException("Unable to find certificate chain.");
                } else if (exc instanceof AnnotatedException) {
                    throw new CertPathBuilderException(this.MediaBrowserCompat$CustomActionResultReceiver.getMessage(), this.MediaBrowserCompat$CustomActionResultReceiver.getCause());
                } else {
                    throw new CertPathBuilderException("Possible certificate chain could not be validated.", this.MediaBrowserCompat$CustomActionResultReceiver);
                }
            } else {
                throw new CertPathBuilderException("No certificate found matching targetContraints.");
            }
        } catch (AnnotatedException e) {
            throw new ExtCertPathBuilderException("Error finding target certificate.", e);
        }
    }

    private CertPathBuilderResult MediaBrowserCompat$CustomActionResultReceiver(X509Certificate x509Certificate, TileAdapter.BaseHolder_ViewBinding baseHolder_ViewBinding, List list) {
        CertPathBuilderResult certPathBuilderResult = null;
        if (list.contains(x509Certificate) || baseHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.contains(x509Certificate)) {
            return null;
        }
        if (baseHolder_ViewBinding.IconCompatParcelizer != -1 && list.size() - 1 > baseHolder_ViewBinding.IconCompatParcelizer) {
            return null;
        }
        list.add(x509Certificate);
        try {
            TileAdapter.BannerViewHolder bannerViewHolder = new TileAdapter.BannerViewHolder();
            SmeLoanDetailCommercialItemAdapter$GroupItemViewHolder smeLoanDetailCommercialItemAdapter$GroupItemViewHolder = new SmeLoanDetailCommercialItemAdapter$GroupItemViewHolder();
            try {
                if (DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.IconCompatParcelizer(x509Certificate, baseHolder_ViewBinding.write.MediaBrowserCompat$SearchResultReceiver, baseHolder_ViewBinding.write.MediaBrowserCompat$ItemReceiver.getSigProvider()) != null) {
                    CertPath engineGenerateCertPath = bannerViewHolder.engineGenerateCertPath(list);
                    PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) smeLoanDetailCommercialItemAdapter$GroupItemViewHolder.engineValidate(engineGenerateCertPath, baseHolder_ViewBinding);
                    return new PKIXCertPathBuilderResult(engineGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(baseHolder_ViewBinding.write.MediaBrowserCompat$CustomActionResultReceiver);
                arrayList.addAll(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509Certificate.getExtensionValue(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.f5820x50fd9e4a.write), baseHolder_ViewBinding.write.MediaBrowserCompat$MediaItem));
                HashSet hashSet = new HashSet();
                hashSet.addAll(DebitsLimitAdapter$LimitCustomViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509Certificate, baseHolder_ViewBinding.write.MediaBrowserCompat$ItemReceiver.getCertStores(), arrayList));
                if (!hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext() && certPathBuilderResult == null) {
                        certPathBuilderResult = MediaBrowserCompat$CustomActionResultReceiver((X509Certificate) it.next(), baseHolder_ViewBinding, list);
                    }
                    if (certPathBuilderResult == null) {
                        list.remove(x509Certificate);
                    }
                    return certPathBuilderResult;
                }
                throw new AnnotatedException("No issuer certificate for certificate in certification path found.");
            } catch (CertificateParsingException e) {
                throw new AnnotatedException("No additional X.509 stores can be added from certificate locations.", e);
            } catch (AnnotatedException e2) {
                throw new AnnotatedException("Cannot find issuer certificate for certificate in certification path.", e2);
            } catch (Exception e3) {
                throw new AnnotatedException("Certification path could not be constructed from certificate list.", e3);
            } catch (Exception e4) {
                throw new AnnotatedException("Certification path could not be validated.", e4);
            } catch (AnnotatedException e5) {
                this.MediaBrowserCompat$CustomActionResultReceiver = e5;
            }
        } catch (Exception unused) {
            throw new RuntimeException("Exception creating support classes.");
        }
    }
}
