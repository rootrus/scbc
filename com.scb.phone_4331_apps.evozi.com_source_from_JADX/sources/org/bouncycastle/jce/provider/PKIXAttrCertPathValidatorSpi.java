package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.PKIXParameters;
import java.util.HashSet;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;

public class PKIXAttrCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper = new BCJcaJceHelper();

    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters pKIXExtendedParameters;
        boolean z = certPathParameters instanceof ExtendedPKIXParameters;
        if (z || (certPathParameters instanceof PKIXExtendedParameters)) {
            new HashSet();
            new HashSet();
            new HashSet();
            new HashSet();
            if (certPathParameters instanceof PKIXParameters) {
                PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
                if (z) {
                    ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                    builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                    builder.setValidityModel(extendedPKIXParameters.getValidityModel());
                    extendedPKIXParameters.getAttrCertCheckers();
                    extendedPKIXParameters.getProhibitedACAttributes();
                    extendedPKIXParameters.getNecessaryACAttributes();
                }
                pKIXExtendedParameters = builder.build();
            } else {
                pKIXExtendedParameters = (PKIXExtendedParameters) certPathParameters;
            }
            pKIXExtendedParameters.getTargetConstraints();
            StringBuilder sb = new StringBuilder();
            sb.append("TargetConstraints must be an instance of ");
            sb.append(X509AttributeCertStoreSelector.class.getName());
            sb.append(" for ");
            sb.append(getClass().getName());
            sb.append(" class.");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Parameters must be a ");
        sb2.append(ExtendedPKIXParameters.class.getName());
        sb2.append(" instance.");
        throw new InvalidAlgorithmParameterException(sb2.toString());
    }
}
