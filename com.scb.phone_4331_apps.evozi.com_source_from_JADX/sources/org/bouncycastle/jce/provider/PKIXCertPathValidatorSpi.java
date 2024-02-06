package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;

public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper = new BCJcaJceHelper();

    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters pKIXExtendedParameters;
        PublicKey publicKey;
        X500Name x500Name;
        HashSet hashSet;
        int i;
        ArrayList[] arrayListArr;
        int i2;
        HashSet hashSet2;
        PKIXCertPathValidatorSpi pKIXCertPathValidatorSpi = this;
        CertPath certPath2 = certPath;
        CertPathParameters certPathParameters2 = certPathParameters;
        if (certPathParameters2 instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters2);
            if (certPathParameters2 instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters2;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            pKIXExtendedParameters = builder.build();
        } else if (certPathParameters2 instanceof PKIXExtendedBuilderParameters) {
            pKIXExtendedParameters = ((PKIXExtendedBuilderParameters) certPathParameters2).getBaseParameters();
        } else if (certPathParameters2 instanceof PKIXExtendedParameters) {
            pKIXExtendedParameters = (PKIXExtendedParameters) certPathParameters2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Parameters must be a ");
            sb.append(PKIXParameters.class.getName());
            sb.append(" instance.");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
        if (pKIXExtendedParameters.getTrustAnchors() != null) {
            List<? extends Certificate> certificates = certPath.getCertificates();
            int size = certificates.size();
            if (!certificates.isEmpty()) {
                Set initialPolicies = pKIXExtendedParameters.getInitialPolicies();
                try {
                    TrustAnchor findTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), pKIXExtendedParameters.getTrustAnchors(), pKIXExtendedParameters.getSigProvider());
                    if (findTrustAnchor != null) {
                        PKIXExtendedParameters build = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTrustAnchor(findTrustAnchor).build();
                        int i3 = size + 1;
                        ArrayList[] arrayListArr2 = new ArrayList[i3];
                        boolean z = false;
                        for (int i4 = 0; i4 < i3; i4++) {
                            arrayListArr2[i4] = new ArrayList();
                        }
                        HashSet hashSet3 = new HashSet();
                        hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
                        PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, (PolicyNode) null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
                        arrayListArr2[0].add(pKIXPolicyNode);
                        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                        HashSet hashSet4 = new HashSet();
                        int i5 = build.isExplicitPolicyRequired() ? 0 : i3;
                        int i6 = build.isAnyPolicyInhibited() ? 0 : i3;
                        if (build.isPolicyMappingInhibited()) {
                            i3 = 0;
                        }
                        X509Certificate trustedCert = findTrustAnchor.getTrustedCert();
                        if (trustedCert != null) {
                            try {
                                x500Name = PrincipalUtils.getSubjectPrincipal(trustedCert);
                                publicKey = trustedCert.getPublicKey();
                            } catch (IllegalArgumentException e) {
                                throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e, certPath2, -1);
                            }
                        } else {
                            x500Name = PrincipalUtils.getCA(findTrustAnchor);
                            publicKey = findTrustAnchor.getCAPublicKey();
                        }
                        try {
                            AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey);
                            algorithmIdentifier.getAlgorithm();
                            algorithmIdentifier.getParameters();
                            if (build.getTargetConstraints() == null || build.getTargetConstraints().match((Certificate) (X509Certificate) certificates.get(0))) {
                                List<PKIXCertPathChecker> certPathCheckers = build.getCertPathCheckers();
                                for (PKIXCertPathChecker init : certPathCheckers) {
                                    init.init(false);
                                }
                                int i7 = i3;
                                Set set = initialPolicies;
                                X509Certificate x509Certificate = null;
                                int i8 = size;
                                int size2 = certificates.size() - 1;
                                int i9 = i6;
                                PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                                while (size2 >= 0) {
                                    X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                                    boolean z2 = size2 == certificates.size() + -1 ? true : z;
                                    JcaJceHelper jcaJceHelper = pKIXCertPathValidatorSpi.helper;
                                    CertPath certPath3 = certPath;
                                    int i10 = i9;
                                    List<? extends Certificate> list = certificates;
                                    int i11 = i5;
                                    int i12 = size2;
                                    PKIXExtendedParameters pKIXExtendedParameters2 = build;
                                    PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                                    boolean z3 = z2;
                                    boolean z4 = z;
                                    ArrayList[] arrayListArr3 = arrayListArr2;
                                    TrustAnchor trustAnchor = findTrustAnchor;
                                    RFC3280CertPathUtilities.processCertA(certPath3, build, size2, publicKey, z3, x500Name, trustedCert, jcaJceHelper);
                                    RFC3280CertPathUtilities.processCertBC(certPath2, i12, pKIXNameConstraintValidator2);
                                    PKIXPolicyNode processCertE = RFC3280CertPathUtilities.processCertE(certPath2, i12, RFC3280CertPathUtilities.processCertD(certPath3, i12, hashSet4, pKIXPolicyNode2, arrayListArr3, i10));
                                    RFC3280CertPathUtilities.processCertF(certPath2, i12, processCertE, i11);
                                    if (size - i12 == size) {
                                        i = i12;
                                        arrayListArr = arrayListArr3;
                                        pKIXCertPathValidatorSpi = this;
                                        pKIXPolicyNode2 = processCertE;
                                        i9 = i10;
                                        i2 = i11;
                                    } else if (x509Certificate2 == null || x509Certificate2.getVersion() != 1) {
                                        RFC3280CertPathUtilities.prepareNextCertA(certPath2, i12);
                                        arrayListArr = arrayListArr3;
                                        PKIXPolicyNode prepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath2, i12, arrayListArr, processCertE, i7);
                                        RFC3280CertPathUtilities.prepareNextCertG(certPath2, i12, pKIXNameConstraintValidator2);
                                        int prepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath2, i12, i11);
                                        int prepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath2, i12, i7);
                                        int prepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath2, i12, i10);
                                        int prepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath2, i12, prepareNextCertH1);
                                        int prepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath2, i12, prepareNextCertH2);
                                        int prepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath2, i12, prepareNextCertH3);
                                        RFC3280CertPathUtilities.prepareNextCertK(certPath2, i12);
                                        i8 = RFC3280CertPathUtilities.prepareNextCertM(certPath2, i12, RFC3280CertPathUtilities.prepareNextCertL(certPath2, i12, i8));
                                        RFC3280CertPathUtilities.prepareNextCertN(certPath2, i12);
                                        Set criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                        if (criticalExtensionOIDs != null) {
                                            hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                            hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                            hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                            hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                            hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                            hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                            hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                            hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                            hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                            hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                        } else {
                                            hashSet2 = new HashSet();
                                        }
                                        RFC3280CertPathUtilities.prepareNextCertO(certPath2, i12, hashSet2, certPathCheckers);
                                        X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                        try {
                                            i = i12;
                                            pKIXCertPathValidatorSpi = this;
                                            try {
                                                PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i, pKIXCertPathValidatorSpi.helper);
                                                AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                                algorithmIdentifier2.getAlgorithm();
                                                algorithmIdentifier2.getParameters();
                                                pKIXPolicyNode2 = prepareCertB;
                                                i7 = prepareNextCertI2;
                                                x500Name = subjectPrincipal;
                                                publicKey = nextWorkingKey;
                                                trustedCert = x509Certificate2;
                                                i2 = prepareNextCertI1;
                                                i9 = prepareNextCertJ;
                                            } catch (CertPathValidatorException e2) {
                                                e = e2;
                                                throw new CertPathValidatorException("Next working key could not be retrieved.", e, certPath2, i);
                                            }
                                        } catch (CertPathValidatorException e3) {
                                            e = e3;
                                            i = i12;
                                            throw new CertPathValidatorException("Next working key could not be retrieved.", e, certPath2, i);
                                        }
                                    } else {
                                        throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", (Throwable) null, certPath2, i12);
                                    }
                                    size2 = i - 1;
                                    arrayListArr2 = arrayListArr;
                                    x509Certificate = x509Certificate2;
                                    z = z4;
                                    certificates = list;
                                    findTrustAnchor = trustAnchor;
                                    pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                    build = pKIXExtendedParameters2;
                                }
                                PKIXExtendedParameters pKIXExtendedParameters3 = build;
                                ArrayList[] arrayListArr4 = arrayListArr2;
                                TrustAnchor trustAnchor2 = findTrustAnchor;
                                int i13 = size2;
                                int i14 = i13 + 1;
                                int wrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath2, i14, RFC3280CertPathUtilities.wrapupCertA(i5, x509Certificate));
                                Set criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                                if (criticalExtensionOIDs2 != null) {
                                    hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                    hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                    hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                    hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                    hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                    hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                    hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                    hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                    hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                    hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                                    hashSet.remove(Extension.extendedKeyUsage.getId());
                                } else {
                                    hashSet = new HashSet();
                                }
                                RFC3280CertPathUtilities.wrapupCertF(certPath2, i14, certPathCheckers, hashSet);
                                X509Certificate x509Certificate3 = x509Certificate;
                                PKIXPolicyNode wrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParameters3, set, i14, arrayListArr4, pKIXPolicyNode2, hashSet4);
                                if (wrapupCertB > 0 || wrapupCertG != null) {
                                    return new PKIXCertPathValidatorResult(trustAnchor2, wrapupCertG, x509Certificate3.getPublicKey());
                                }
                                throw new CertPathValidatorException("Path processing failed on policy.", (Throwable) null, certPath2, i13);
                            }
                            throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", (Throwable) null, certPath2, 0);
                        } catch (CertPathValidatorException e4) {
                            throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e4, certPath2, -1);
                        }
                    } else {
                        throw new CertPathValidatorException("Trust anchor for certification path not found.", (Throwable) null, certPath2, -1);
                    }
                } catch (AnnotatedException e5) {
                    throw new CertPathValidatorException(e5.getMessage(), e5, certPath2, certificates.size() - 1);
                }
            } else {
                throw new CertPathValidatorException("Certification path is empty.", (Throwable) null, certPath2, -1);
            }
        } else {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
    }
}
