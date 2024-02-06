package org.jmrtd.cert;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.util.Collection;
import net.p088sf.scuba.tlv.TLVInputStream;
import net.p088sf.scuba.tlv.TLVOutputStream;
import org.ejbca.cvc.CVCertificate;
import org.ejbca.cvc.exception.ConstructionException;
import org.ejbca.cvc.exception.ParseException;
import p040o.AlertController$RecycleListView;
import p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder;

public class CVCertificateFactorySpi extends CertificateFactorySpi {
    private static final int CV_CERTIFICATE_TAG = 32545;

    public CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        return null;
    }

    public Collection<? extends CRL> engineGenerateCRLs(InputStream inputStream) throws CRLException {
        return null;
    }

    public Collection<? extends Certificate> engineGenerateCertificates(InputStream inputStream) throws CertificateException {
        return null;
    }

    public Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
        try {
            TLVInputStream tLVInputStream = new TLVInputStream(inputStream);
            int write = tLVInputStream.write();
            if (write == 32545) {
                tLVInputStream.IconCompatParcelizer();
                byte[] MediaBrowserCompat$ItemReceiver = tLVInputStream.MediaBrowserCompat$ItemReceiver();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                TLVOutputStream tLVOutputStream = new TLVOutputStream(byteArrayOutputStream);
                tLVOutputStream.IconCompatParcelizer(32545);
                tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver);
                tLVOutputStream.close();
                return new CardVerifiableCertificate((CVCertificate) AlertController$RecycleListView.write(byteArrayOutputStream.toByteArray(), EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CV_CERTIFICATE));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected CV_CERTIFICATE_TAG, found ");
            sb.append(Integer.toHexString(write));
            throw new CertificateException(sb.toString());
        } catch (IOException e) {
            throw new CertificateException(e.getMessage());
        } catch (ConstructionException e2) {
            throw new CertificateException(e2.getMessage());
        } catch (ParseException e3) {
            throw new CertificateException(e3.getMessage());
        }
    }
}
