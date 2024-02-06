package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.util.Integers;

public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final String AUTH_INFO_ACCESS = X509Extensions.AuthorityInfoAccess.getId();
    private static final String CRL_DIST_POINTS = X509Extensions.CRLDistributionPoints.getId();
    private static final String QC_STATEMENT = X509Extensions.QCStatements.getId();
    private static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected List[] errors;
    private boolean initialized;

    /* renamed from: n */
    protected int f6380n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;

    public PKIXCertPathReviewer() {
    }

    public PKIXCertPathReviewer(CertPath certPath2, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        init(certPath2, pKIXParameters);
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i != bArr.length; i++) {
                stringBuffer.append(Integer.toHexString(bArr[i] & 255));
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
    }

    private void checkCriticalExtensions() {
        int size;
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        for (PKIXCertPathChecker init : certPathCheckers) {
            try {
                init.init(false);
            } catch (CertPathValidatorException e) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathCheckerError", new Object[]{e.getMessage(), e, e.getClass().getName()}), e);
            } catch (CertPathValidatorException e2) {
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.criticalExtensionError", new Object[]{e2.getMessage(), e2, e2.getClass().getName()}), e2.getCause(), this.certPath, size);
            } catch (CertPathReviewerException e3) {
                addError(e3.getErrorMessage(), e3.getIndex());
                return;
            }
        }
        size = this.certs.size() - 1;
        while (size >= 0) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                if (!criticalExtensionOIDs.isEmpty()) {
                    criticalExtensionOIDs.remove(KEY_USAGE);
                    criticalExtensionOIDs.remove(CERTIFICATE_POLICIES);
                    criticalExtensionOIDs.remove(POLICY_MAPPINGS);
                    criticalExtensionOIDs.remove(INHIBIT_ANY_POLICY);
                    criticalExtensionOIDs.remove(ISSUING_DISTRIBUTION_POINT);
                    criticalExtensionOIDs.remove(DELTA_CRL_INDICATOR);
                    criticalExtensionOIDs.remove(POLICY_CONSTRAINTS);
                    criticalExtensionOIDs.remove(BASIC_CONSTRAINTS);
                    criticalExtensionOIDs.remove(SUBJECT_ALTERNATIVE_NAME);
                    criticalExtensionOIDs.remove(NAME_CONSTRAINTS);
                    if (criticalExtensionOIDs.contains(QC_STATEMENT) && processQcStatements(x509Certificate, size)) {
                        criticalExtensionOIDs.remove(QC_STATEMENT);
                    }
                    for (PKIXCertPathChecker check : certPathCheckers) {
                        check.check(x509Certificate, criticalExtensionOIDs);
                    }
                    if (!criticalExtensionOIDs.isEmpty()) {
                        for (String aSN1ObjectIdentifier : criticalExtensionOIDs) {
                            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(aSN1ObjectIdentifier)}), size);
                        }
                    }
                }
            }
            size--;
        }
    }

    private void checkNameConstraints() {
        GeneralName instance;
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!isSelfIssued(x509Certificate)) {
                X500Principal subjectPrincipal = getSubjectPrincipal(x509Certificate);
                try {
                    ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream((InputStream) new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                    pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                    pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME);
                    if (aSN1Sequence2 != null) {
                        for (int i = 0; i < aSN1Sequence2.size(); i++) {
                            instance = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i));
                            pKIXNameConstraintValidator.checkPermitted(instance);
                            pKIXNameConstraintValidator.checkExcluded(instance);
                        }
                    }
                } catch (AnnotatedException e) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncExtError"), e, this.certPath, size);
                } catch (IOException e2) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e2, this.certPath, size);
                } catch (PKIXNameConstraintValidatorException e3) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e3, this.certPath, size);
                } catch (PKIXNameConstraintValidatorException e4) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e4, this.certPath, size);
                } catch (AnnotatedException e5) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), e5, this.certPath, size);
                } catch (PKIXNameConstraintValidatorException e6) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(instance)}), e6, this.certPath, size);
                } catch (CertPathReviewerException e7) {
                    addError(e7.getErrorMessage(), e7.getIndex());
                    return;
                }
            }
            ASN1Sequence aSN1Sequence3 = (ASN1Sequence) getExtensionValue(x509Certificate, NAME_CONSTRAINTS);
            if (aSN1Sequence3 != null) {
                NameConstraints instance2 = NameConstraints.getInstance(aSN1Sequence3);
                GeneralSubtree[] permittedSubtrees = instance2.getPermittedSubtrees();
                if (permittedSubtrees != null) {
                    pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                }
                GeneralSubtree[] excludedSubtrees = instance2.getExcludedSubtrees();
                if (excludedSubtrees != null) {
                    for (int i2 = 0; i2 != excludedSubtrees.length; i2++) {
                        pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i2]);
                    }
                }
            }
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        BigInteger pathLenConstraint;
        int intValue;
        int i = this.f6380n;
        int i2 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!isSelfIssued(x509Certificate)) {
                if (i <= 0) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pathLengthExtended"));
                }
                i--;
                i2++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(getExtensionValue(x509Certificate, BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (!(basicConstraints == null || (pathLenConstraint = basicConstraints.getPathLenConstraint()) == null || (intValue = pathLenConstraint.intValue()) >= i)) {
                i = intValue;
            }
        }
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i2)}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0408, code lost:
        throw new org.bouncycastle.x509.CertPathReviewerException(new org.bouncycastle.i18n.ErrorBundle(RESOURCE_NAME, "CertPathReviewer.policyInhibitExtError"), r1.certPath, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r0 = getQualifierSet(r2.getPolicyQualifiers());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r2 = r5[r4 - 1];
        r30 = r13;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0166, code lost:
        if (r15 >= r2.size()) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0168, code lost:
        r13 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r2.get(r15);
        r31 = r13.getExpectedPolicies().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017a, code lost:
        if (r31.hasNext() == false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017c, code lost:
        r32 = r2;
        r2 = r31.next();
        r33 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0186, code lost:
        if ((r2 instanceof java.lang.String) == false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0188, code lost:
        r2 = (java.lang.String) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018d, code lost:
        if ((r2 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) == false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018f, code lost:
        r2 = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) r2).getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0195, code lost:
        r10 = r13.getChildren();
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019f, code lost:
        if (r10.hasNext() == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a1, code lost:
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b1, code lost:
        if (r2.equals(((org.bouncycastle.jce.provider.PKIXPolicyNode) r10.next()).getValidPolicy()) == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b3, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b5, code lost:
        r10 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b8, code lost:
        if (r17 != false) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ba, code lost:
        r10 = new java.util.HashSet();
        r10.add(r2);
        r34 = r11;
        r17 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r4, r10, r13, r0, r2, false);
        r13.addChild(r17);
        r5[r4].add(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e5, code lost:
        r34 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e7, code lost:
        r2 = r32;
        r10 = r33;
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ee, code lost:
        r2 = r32;
        r10 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f3, code lost:
        r32 = r2;
        r33 = r10;
        r34 = r11;
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fd, code lost:
        r33 = r10;
        r34 = r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:212:0x03fa */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0216 A[Catch:{ AnnotatedException -> 0x05fa, AnnotatedException -> 0x043e, AnnotatedException -> 0x0418, AnnotatedException -> 0x0409, AnnotatedException -> 0x0362, CertPathValidatorException -> 0x0353, CertPathValidatorException -> 0x0202, CertPathValidatorException -> 0x00e0, CertPathReviewerException -> 0x0607 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x023f A[Catch:{ AnnotatedException -> 0x05fa, AnnotatedException -> 0x043e, AnnotatedException -> 0x0418, AnnotatedException -> 0x0409, AnnotatedException -> 0x0362, CertPathValidatorException -> 0x0353, CertPathValidatorException -> 0x0202, CertPathValidatorException -> 0x00e0, CertPathReviewerException -> 0x0607 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x012b A[EDGE_INSN: B:349:0x012b->B:62:0x012b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0120 A[Catch:{ AnnotatedException -> 0x05fa, AnnotatedException -> 0x043e, AnnotatedException -> 0x0418, AnnotatedException -> 0x0409, AnnotatedException -> 0x0362, CertPathValidatorException -> 0x0353, CertPathValidatorException -> 0x0202, CertPathValidatorException -> 0x00e0, CertPathReviewerException -> 0x0607 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013d A[Catch:{ AnnotatedException -> 0x05fa, AnnotatedException -> 0x043e, AnnotatedException -> 0x0418, AnnotatedException -> 0x0409, AnnotatedException -> 0x0362, CertPathValidatorException -> 0x0353, CertPathValidatorException -> 0x0202, CertPathValidatorException -> 0x00e0, CertPathReviewerException -> 0x0607 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void checkPolicy() {
        /*
            r35 = this;
            r1 = r35
            java.lang.String r2 = "CertPathReviewer.policyExtError"
            java.security.cert.PKIXParameters r0 = r1.pkixParams
            java.util.Set r0 = r0.getInitialPolicies()
            int r3 = r1.f6380n
            r4 = 1
            int r3 = r3 + r4
            java.util.ArrayList[] r5 = new java.util.ArrayList[r3]
            r6 = 0
            r7 = r6
        L_0x0012:
            if (r7 >= r3) goto L_0x001e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x0012
        L_0x001e:
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.lang.String r7 = "2.5.29.32.0"
            r11.add(r7)
            org.bouncycastle.jce.provider.PKIXPolicyNode r15 = new org.bouncycastle.jce.provider.PKIXPolicyNode
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 0
            r12 = 0
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            r16 = 0
            java.lang.String r14 = "2.5.29.32.0"
            r8 = r15
            r4 = r15
            r15 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r8 = r5[r6]
            r8.add(r4)
            java.security.cert.PKIXParameters r8 = r1.pkixParams
            boolean r8 = r8.isExplicitPolicyRequired()
            if (r8 == 0) goto L_0x0051
            r8 = r6
            r9 = 1
            goto L_0x0055
        L_0x0051:
            int r8 = r1.f6380n
            r9 = 1
            int r8 = r8 + r9
        L_0x0055:
            java.security.cert.PKIXParameters r10 = r1.pkixParams
            boolean r10 = r10.isAnyPolicyInhibited()
            if (r10 == 0) goto L_0x005f
            r10 = r6
            goto L_0x0062
        L_0x005f:
            int r10 = r1.f6380n
            int r10 = r10 + r9
        L_0x0062:
            java.security.cert.PKIXParameters r11 = r1.pkixParams
            boolean r11 = r11.isPolicyMappingInhibited()
            if (r11 == 0) goto L_0x006c
            r11 = r6
            goto L_0x006f
        L_0x006c:
            int r11 = r1.f6380n
            int r11 = r11 + r9
        L_0x006f:
            java.util.List r12 = r1.certs     // Catch:{ CertPathReviewerException -> 0x0607 }
            int r12 = r12.size()     // Catch:{ CertPathReviewerException -> 0x0607 }
            int r12 = r12 - r9
            r15 = r4
            r4 = 0
            r13 = 0
        L_0x0079:
            java.lang.String r14 = "CertPathReviewer.policyConstExtError"
            java.lang.String r9 = "org.bouncycastle.x509.CertPathReviewerMessages"
            if (r12 < 0) goto L_0x044d
            int r4 = r1.f6380n     // Catch:{ CertPathReviewerException -> 0x0607 }
            int r4 = r4 - r12
            java.util.List r6 = r1.certs     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.Object r6 = r6.get(r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch:{ CertPathReviewerException -> 0x0607 }
            r25 = r3
            java.lang.String r3 = CERTIFICATE_POLICIES     // Catch:{ AnnotatedException -> 0x043e }
            org.bouncycastle.asn1.ASN1Primitive r3 = getExtensionValue(r6, r3)     // Catch:{ AnnotatedException -> 0x043e }
            org.bouncycastle.asn1.ASN1Sequence r3 = (org.bouncycastle.asn1.ASN1Sequence) r3     // Catch:{ AnnotatedException -> 0x043e }
            r26 = r14
            java.lang.String r14 = "CertPathReviewer.policyQualifierError"
            if (r3 == 0) goto L_0x025d
            if (r15 == 0) goto L_0x025d
            java.util.Enumeration r17 = r3.getObjects()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r27 = r0
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.<init>()     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x00a7:
            boolean r18 = r17.hasMoreElements()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r18 == 0) goto L_0x00f3
            java.lang.Object r18 = r17.nextElement()     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.asn1.x509.PolicyInformation r18 = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(r18)     // Catch:{ CertPathReviewerException -> 0x0607 }
            r28 = r15
            org.bouncycastle.asn1.ASN1ObjectIdentifier r15 = r18.getPolicyIdentifier()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r29 = r2
            java.lang.String r2 = r15.getId()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.add(r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r2 = r15.getId()     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r2 = r7.equals(r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r2 != 0) goto L_0x00ee
            org.bouncycastle.asn1.ASN1Sequence r2 = r18.getPolicyQualifiers()     // Catch:{ CertPathValidatorException -> 0x00e0 }
            java.util.Set r2 = getQualifierSet(r2)     // Catch:{ CertPathValidatorException -> 0x00e0 }
            boolean r18 = processCertD1i(r4, r5, r15, r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r18 != 0) goto L_0x00ee
            processCertD1ii(r4, r5, r15, r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            goto L_0x00ee
        L_0x00e0:
            r0 = move-exception
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r9, r14)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r3 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r4 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r3.<init>(r2, r0, r4, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r3     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x00ee:
            r15 = r28
            r2 = r29
            goto L_0x00a7
        L_0x00f3:
            r29 = r2
            r28 = r15
            if (r13 == 0) goto L_0x011d
            boolean r2 = r13.contains(r7)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r2 == 0) goto L_0x0100
            goto L_0x011d
        L_0x0100:
            java.util.Iterator r2 = r13.iterator()     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ CertPathReviewerException -> 0x0607 }
            r13.<init>()     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0109:
            boolean r15 = r2.hasNext()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r15 == 0) goto L_0x011e
            java.lang.Object r15 = r2.next()     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r17 = r0.contains(r15)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r17 == 0) goto L_0x0109
            r13.add(r15)     // Catch:{ CertPathReviewerException -> 0x0607 }
            goto L_0x0109
        L_0x011d:
            r13 = r0
        L_0x011e:
            if (r10 > 0) goto L_0x0133
            int r0 = r1.f6380n     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r4 >= r0) goto L_0x012b
            boolean r0 = isSelfIssued(r6)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r0 == 0) goto L_0x012b
            goto L_0x0133
        L_0x012b:
            r33 = r10
            r34 = r11
            r30 = r13
            goto L_0x0210
        L_0x0133:
            java.util.Enumeration r0 = r3.getObjects()     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0137:
            boolean r2 = r0.hasMoreElements()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r2 == 0) goto L_0x012b
            java.lang.Object r2 = r0.nextElement()     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.asn1.x509.PolicyInformation r2 = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.asn1.ASN1ObjectIdentifier r15 = r2.getPolicyIdentifier()     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r15 = r15.getId()     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r15 = r7.equals(r15)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r15 == 0) goto L_0x0137
            org.bouncycastle.asn1.ASN1Sequence r0 = r2.getPolicyQualifiers()     // Catch:{ CertPathValidatorException -> 0x0202 }
            java.util.Set r0 = getQualifierSet(r0)     // Catch:{ CertPathValidatorException -> 0x0202 }
            int r2 = r4 + -1
            r2 = r5[r2]     // Catch:{ CertPathReviewerException -> 0x0607 }
            r30 = r13
            r15 = 0
        L_0x0162:
            int r13 = r2.size()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r15 >= r13) goto L_0x01fd
            java.lang.Object r13 = r2.get(r15)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.jce.provider.PKIXPolicyNode r13 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r13     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.util.Set r17 = r13.getExpectedPolicies()     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.util.Iterator r31 = r17.iterator()     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0176:
            boolean r17 = r31.hasNext()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r17 == 0) goto L_0x01f3
            r32 = r2
            java.lang.Object r2 = r31.next()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r33 = r10
            boolean r10 = r2 instanceof java.lang.String     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r10 == 0) goto L_0x018b
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ CertPathReviewerException -> 0x0607 }
            goto L_0x0195
        L_0x018b:
            boolean r10 = r2 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r10 == 0) goto L_0x01ee
            org.bouncycastle.asn1.ASN1ObjectIdentifier r2 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r2     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r2 = r2.getId()     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0195:
            java.util.Iterator r10 = r13.getChildren()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r17 = 0
        L_0x019b:
            boolean r18 = r10.hasNext()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r18 == 0) goto L_0x01b8
            java.lang.Object r18 = r10.next()     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.jce.provider.PKIXPolicyNode r18 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r18     // Catch:{ CertPathReviewerException -> 0x0607 }
            r19 = r10
            java.lang.String r10 = r18.getValidPolicy()     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r10 = r2.equals(r10)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r10 == 0) goto L_0x01b5
            r17 = 1
        L_0x01b5:
            r10 = r19
            goto L_0x019b
        L_0x01b8:
            if (r17 != 0) goto L_0x01e5
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ CertPathReviewerException -> 0x0607 }
            r10.<init>()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r10.add(r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            r34 = r11
            org.bouncycastle.jce.provider.PKIXPolicyNode r11 = new org.bouncycastle.jce.provider.PKIXPolicyNode     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.util.ArrayList r18 = new java.util.ArrayList     // Catch:{ CertPathReviewerException -> 0x0607 }
            r18.<init>()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r24 = 0
            r17 = r11
            r19 = r4
            r20 = r10
            r21 = r13
            r22 = r0
            r23 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ CertPathReviewerException -> 0x0607 }
            r13.addChild(r11)     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2 = r5[r4]     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.add(r11)     // Catch:{ CertPathReviewerException -> 0x0607 }
            goto L_0x01e7
        L_0x01e5:
            r34 = r11
        L_0x01e7:
            r2 = r32
            r10 = r33
            r11 = r34
            goto L_0x0176
        L_0x01ee:
            r2 = r32
            r10 = r33
            goto L_0x0176
        L_0x01f3:
            r32 = r2
            r33 = r10
            r34 = r11
            int r15 = r15 + 1
            goto L_0x0162
        L_0x01fd:
            r33 = r10
            r34 = r11
            goto L_0x0210
        L_0x0202:
            r0 = move-exception
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r9, r14)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r3 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r4 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r3.<init>(r2, r0, r4, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r3     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0210:
            int r0 = r4 + -1
            r15 = r28
        L_0x0214:
            if (r0 < 0) goto L_0x0239
            r2 = r5[r0]     // Catch:{ CertPathReviewerException -> 0x0607 }
            r10 = 0
        L_0x0219:
            int r11 = r2.size()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r10 >= r11) goto L_0x0236
            java.lang.Object r11 = r2.get(r10)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.jce.provider.PKIXPolicyNode r11 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r11     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r13 = r11.hasChildren()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r13 != 0) goto L_0x0233
            org.bouncycastle.jce.provider.PKIXPolicyNode r11 = removePolicyNode(r15, r5, r11)     // Catch:{ CertPathReviewerException -> 0x0607 }
            r15 = r11
            if (r11 != 0) goto L_0x0233
            goto L_0x0236
        L_0x0233:
            int r10 = r10 + 1
            goto L_0x0219
        L_0x0236:
            int r0 = r0 + -1
            goto L_0x0214
        L_0x0239:
            java.util.Set r0 = r6.getCriticalExtensionOIDs()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r0 == 0) goto L_0x025a
            java.lang.String r2 = CERTIFICATE_POLICIES     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r0 = r0.contains(r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2 = r5[r4]     // Catch:{ CertPathReviewerException -> 0x0607 }
            r10 = 0
        L_0x0248:
            int r11 = r2.size()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r10 >= r11) goto L_0x025a
            java.lang.Object r11 = r2.get(r10)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.jce.provider.PKIXPolicyNode r11 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r11     // Catch:{ CertPathReviewerException -> 0x0607 }
            r11.setCritical(r0)     // Catch:{ CertPathReviewerException -> 0x0607 }
            int r10 = r10 + 1
            goto L_0x0248
        L_0x025a:
            r13 = r30
            goto L_0x0269
        L_0x025d:
            r27 = r0
            r29 = r2
            r33 = r10
            r34 = r11
            r28 = r15
            r15 = r28
        L_0x0269:
            if (r3 != 0) goto L_0x026c
            r15 = 0
        L_0x026c:
            if (r8 > 0) goto L_0x027e
            if (r15 == 0) goto L_0x0271
            goto L_0x027e
        L_0x0271:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r2 = "CertPathReviewer.noValidPolicyTree"
            r0.<init>(r9, r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r0)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r2     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x027e:
            int r0 = r1.f6380n     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r4 == r0) goto L_0x0428
            java.lang.String r0 = POLICY_MAPPINGS     // Catch:{ AnnotatedException -> 0x0418 }
            org.bouncycastle.asn1.ASN1Primitive r0 = getExtensionValue(r6, r0)     // Catch:{ AnnotatedException -> 0x0418 }
            if (r0 == 0) goto L_0x02df
            r2 = r0
            org.bouncycastle.asn1.ASN1Sequence r2 = (org.bouncycastle.asn1.ASN1Sequence) r2     // Catch:{ CertPathReviewerException -> 0x0607 }
            r3 = 0
        L_0x028e:
            int r10 = r2.size()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r3 >= r10) goto L_0x02df
            org.bouncycastle.asn1.ASN1Encodable r10 = r2.getObjectAt(r3)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.asn1.ASN1Sequence r10 = (org.bouncycastle.asn1.ASN1Sequence) r10     // Catch:{ CertPathReviewerException -> 0x0607 }
            r11 = 0
            org.bouncycastle.asn1.ASN1Encodable r17 = r10.getObjectAt(r11)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.asn1.ASN1ObjectIdentifier r17 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r17     // Catch:{ CertPathReviewerException -> 0x0607 }
            r11 = 1
            org.bouncycastle.asn1.ASN1Encodable r10 = r10.getObjectAt(r11)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.asn1.ASN1ObjectIdentifier r10 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r10     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r11 = r17.getId()     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r11 = r7.equals(r11)     // Catch:{ CertPathReviewerException -> 0x0607 }
            r17 = r2
            java.lang.String r2 = "CertPathReviewer.invalidPolicyMapping"
            if (r11 != 0) goto L_0x02d2
            java.lang.String r10 = r10.getId()     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r10 = r7.equals(r10)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r10 != 0) goto L_0x02c5
            int r3 = r3 + 1
            r2 = r17
            goto L_0x028e
        L_0x02c5:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.<init>(r9, r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r3 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r0, r3, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r2     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x02d2:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.<init>(r9, r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r3 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r0, r3, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r2     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x02df:
            if (r0 == 0) goto L_0x037e
            org.bouncycastle.asn1.ASN1Sequence r0 = (org.bouncycastle.asn1.ASN1Sequence) r0     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>()     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ CertPathReviewerException -> 0x0607 }
            r3.<init>()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r10 = 0
        L_0x02ee:
            int r11 = r0.size()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r10 >= r11) goto L_0x0339
            org.bouncycastle.asn1.ASN1Encodable r11 = r0.getObjectAt(r10)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.asn1.ASN1Sequence r11 = (org.bouncycastle.asn1.ASN1Sequence) r11     // Catch:{ CertPathReviewerException -> 0x0607 }
            r17 = r0
            r0 = 0
            org.bouncycastle.asn1.ASN1Encodable r18 = r11.getObjectAt(r0)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.asn1.ASN1ObjectIdentifier r18 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r18     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r0 = r18.getId()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r18 = r13
            r13 = 1
            org.bouncycastle.asn1.ASN1Encodable r11 = r11.getObjectAt(r13)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.asn1.ASN1ObjectIdentifier r11 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r11     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r11 = r11.getId()     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r13 = r2.containsKey(r0)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r13 != 0) goto L_0x0329
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ CertPathReviewerException -> 0x0607 }
            r13.<init>()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r13.add(r11)     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.put(r0, r13)     // Catch:{ CertPathReviewerException -> 0x0607 }
            r3.add(r0)     // Catch:{ CertPathReviewerException -> 0x0607 }
            goto L_0x0332
        L_0x0329:
            java.lang.Object r0 = r2.get(r0)     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.add(r11)     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0332:
            int r10 = r10 + 1
            r0 = r17
            r13 = r18
            goto L_0x02ee
        L_0x0339:
            r18 = r13
            java.util.Iterator r0 = r3.iterator()     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x033f:
            boolean r3 = r0.hasNext()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r3 == 0) goto L_0x0380
            java.lang.Object r3 = r0.next()     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r34 <= 0) goto L_0x0373
            prepareNextCertB1(r4, r5, r3, r2, r6)     // Catch:{ AnnotatedException -> 0x0362, CertPathValidatorException -> 0x0353 }
            r10 = r29
            goto L_0x037b
        L_0x0353:
            r0 = move-exception
            r2 = r0
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.<init>(r9, r14)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r3 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r4 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r3.<init>(r0, r2, r4, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r3     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0362:
            r0 = move-exception
            r2 = r0
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            r10 = r29
            r0.<init>(r9, r10)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r3 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r4 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r3.<init>(r0, r2, r4, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r3     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0373:
            r10 = r29
            if (r34 > 0) goto L_0x037b
            org.bouncycastle.jce.provider.PKIXPolicyNode r15 = prepareNextCertB2(r4, r5, r3, r15)     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x037b:
            r29 = r10
            goto L_0x033f
        L_0x037e:
            r18 = r13
        L_0x0380:
            r10 = r29
            boolean r0 = isSelfIssued(r6)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r0 != 0) goto L_0x039b
            if (r8 == 0) goto L_0x038c
            int r8 = r8 + -1
        L_0x038c:
            if (r34 == 0) goto L_0x0391
            int r11 = r34 + -1
            goto L_0x0393
        L_0x0391:
            r11 = r34
        L_0x0393:
            if (r33 == 0) goto L_0x0398
            int r0 = r33 + -1
            goto L_0x039f
        L_0x0398:
            r0 = r33
            goto L_0x039f
        L_0x039b:
            r0 = r33
            r11 = r34
        L_0x039f:
            java.lang.String r2 = POLICY_CONSTRAINTS     // Catch:{ AnnotatedException -> 0x0409 }
            org.bouncycastle.asn1.ASN1Primitive r2 = getExtensionValue(r6, r2)     // Catch:{ AnnotatedException -> 0x0409 }
            org.bouncycastle.asn1.ASN1Sequence r2 = (org.bouncycastle.asn1.ASN1Sequence) r2     // Catch:{ AnnotatedException -> 0x0409 }
            if (r2 == 0) goto L_0x03e4
            java.util.Enumeration r2 = r2.getObjects()     // Catch:{ AnnotatedException -> 0x0409 }
        L_0x03ad:
            boolean r3 = r2.hasMoreElements()     // Catch:{ AnnotatedException -> 0x0409 }
            if (r3 == 0) goto L_0x03e4
            java.lang.Object r3 = r2.nextElement()     // Catch:{ AnnotatedException -> 0x0409 }
            org.bouncycastle.asn1.ASN1TaggedObject r3 = (org.bouncycastle.asn1.ASN1TaggedObject) r3     // Catch:{ AnnotatedException -> 0x0409 }
            int r4 = r3.getTagNo()     // Catch:{ AnnotatedException -> 0x0409 }
            if (r4 == 0) goto L_0x03d3
            r13 = 1
            if (r4 != r13) goto L_0x03ad
            r4 = 0
            org.bouncycastle.asn1.ASN1Integer r3 = org.bouncycastle.asn1.ASN1Integer.getInstance(r3, r4)     // Catch:{ AnnotatedException -> 0x0409 }
            java.math.BigInteger r3 = r3.getValue()     // Catch:{ AnnotatedException -> 0x0409 }
            int r3 = r3.intValue()     // Catch:{ AnnotatedException -> 0x0409 }
            if (r3 >= r11) goto L_0x03ad
            r11 = r3
            goto L_0x03ad
        L_0x03d3:
            r4 = 0
            org.bouncycastle.asn1.ASN1Integer r3 = org.bouncycastle.asn1.ASN1Integer.getInstance(r3, r4)     // Catch:{ AnnotatedException -> 0x0409 }
            java.math.BigInteger r3 = r3.getValue()     // Catch:{ AnnotatedException -> 0x0409 }
            int r3 = r3.intValue()     // Catch:{ AnnotatedException -> 0x0409 }
            if (r3 >= r8) goto L_0x03ad
            r8 = r3
            goto L_0x03ad
        L_0x03e4:
            java.lang.String r2 = INHIBIT_ANY_POLICY     // Catch:{ AnnotatedException -> 0x03fa }
            org.bouncycastle.asn1.ASN1Primitive r2 = getExtensionValue(r6, r2)     // Catch:{ AnnotatedException -> 0x03fa }
            org.bouncycastle.asn1.ASN1Integer r2 = (org.bouncycastle.asn1.ASN1Integer) r2     // Catch:{ AnnotatedException -> 0x03fa }
            if (r2 == 0) goto L_0x0430
            java.math.BigInteger r2 = r2.getValue()     // Catch:{ AnnotatedException -> 0x03fa }
            int r2 = r2.intValue()     // Catch:{ AnnotatedException -> 0x03fa }
            if (r2 >= r0) goto L_0x0430
            r0 = r2
            goto L_0x0430
        L_0x03fa:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r2 = "CertPathReviewer.policyInhibitExtError"
            r0.<init>(r9, r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r3 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r0, r3, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r2     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0409:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2 = r26
            r0.<init>(r9, r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r3 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r0, r3, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r2     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0418:
            r0 = move-exception
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r3 = "CertPathReviewer.policyMapExtError"
            r2.<init>(r9, r3)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r3 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r4 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r3.<init>(r2, r0, r4, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r3     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0428:
            r18 = r13
            r10 = r29
            r0 = r33
            r11 = r34
        L_0x0430:
            int r12 = r12 + -1
            r4 = r6
            r2 = r10
            r13 = r18
            r3 = r25
            r6 = 0
            r10 = r0
            r0 = r27
            goto L_0x0079
        L_0x043e:
            r0 = move-exception
            r10 = r2
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r9, r10)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r3 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r4 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r3.<init>(r2, r0, r4, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r3     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x044d:
            r27 = r0
            r25 = r3
            r2 = r14
            r28 = r15
            boolean r0 = isSelfIssued(r4)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r0 != 0) goto L_0x045e
            if (r8 <= 0) goto L_0x045e
            int r8 = r8 + -1
        L_0x045e:
            java.lang.String r0 = POLICY_CONSTRAINTS     // Catch:{ AnnotatedException -> 0x05fa }
            org.bouncycastle.asn1.ASN1Primitive r0 = getExtensionValue(r4, r0)     // Catch:{ AnnotatedException -> 0x05fa }
            org.bouncycastle.asn1.ASN1Sequence r0 = (org.bouncycastle.asn1.ASN1Sequence) r0     // Catch:{ AnnotatedException -> 0x05fa }
            if (r0 == 0) goto L_0x0495
            java.util.Enumeration r0 = r0.getObjects()     // Catch:{ AnnotatedException -> 0x05fa }
            r11 = r8
        L_0x046d:
            boolean r3 = r0.hasMoreElements()     // Catch:{ AnnotatedException -> 0x05fa }
            if (r3 == 0) goto L_0x0492
            java.lang.Object r3 = r0.nextElement()     // Catch:{ AnnotatedException -> 0x05fa }
            org.bouncycastle.asn1.ASN1TaggedObject r3 = (org.bouncycastle.asn1.ASN1TaggedObject) r3     // Catch:{ AnnotatedException -> 0x05fa }
            int r4 = r3.getTagNo()     // Catch:{ AnnotatedException -> 0x05fa }
            if (r4 == 0) goto L_0x0481
            r4 = 0
            goto L_0x046d
        L_0x0481:
            r4 = 0
            org.bouncycastle.asn1.ASN1Integer r3 = org.bouncycastle.asn1.ASN1Integer.getInstance(r3, r4)     // Catch:{ AnnotatedException -> 0x05fa }
            java.math.BigInteger r3 = r3.getValue()     // Catch:{ AnnotatedException -> 0x05fa }
            int r3 = r3.intValue()     // Catch:{ AnnotatedException -> 0x05fa }
            if (r3 != 0) goto L_0x046d
            r11 = r4
            goto L_0x046d
        L_0x0492:
            r4 = 0
            r8 = r11
            goto L_0x0496
        L_0x0495:
            r4 = 0
        L_0x0496:
            java.lang.String r0 = "CertPathReviewer.explicitPolicy"
            if (r28 != 0) goto L_0x04b2
            java.security.cert.PKIXParameters r2 = r1.pkixParams     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r2 = r2.isExplicitPolicyRequired()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r2 != 0) goto L_0x04a5
            r2 = 0
            goto L_0x05e8
        L_0x04a5:
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r9, r0)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r3 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.<init>(r2, r3, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r0     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x04b2:
            boolean r2 = isAnyPolicy(r27)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r2 == 0) goto L_0x0555
            java.security.cert.PKIXParameters r2 = r1.pkixParams     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r2 = r2.isExplicitPolicyRequired()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r2 == 0) goto L_0x0551
            boolean r2 = r13.isEmpty()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r2 != 0) goto L_0x0544
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.<init>()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r11 = r4
            r3 = r25
        L_0x04ce:
            if (r11 >= r3) goto L_0x0501
            r2 = r5[r11]     // Catch:{ CertPathReviewerException -> 0x0607 }
            r6 = r4
        L_0x04d3:
            int r10 = r2.size()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r6 >= r10) goto L_0x04fe
            java.lang.Object r10 = r2.get(r6)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.jce.provider.PKIXPolicyNode r10 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r10     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r12 = r10.getValidPolicy()     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r12 = r7.equals(r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r12 == 0) goto L_0x04fb
            java.util.Iterator r10 = r10.getChildren()     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x04ed:
            boolean r12 = r10.hasNext()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r12 == 0) goto L_0x04fb
            java.lang.Object r12 = r10.next()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.add(r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            goto L_0x04ed
        L_0x04fb:
            int r6 = r6 + 1
            goto L_0x04d3
        L_0x04fe:
            int r11 = r11 + 1
            goto L_0x04ce
        L_0x0501:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0505:
            boolean r2 = r0.hasNext()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r2 == 0) goto L_0x0519
            java.lang.Object r2 = r0.next()     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.jce.provider.PKIXPolicyNode r2 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r2     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r2 = r2.getValidPolicy()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r13.contains(r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            goto L_0x0505
        L_0x0519:
            if (r28 == 0) goto L_0x0551
            int r0 = r1.f6380n     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2 = 1
            int r0 = r0 - r2
        L_0x051f:
            if (r0 < 0) goto L_0x0551
            r2 = r5[r0]     // Catch:{ CertPathReviewerException -> 0x0607 }
            r11 = r4
            r3 = r28
        L_0x0526:
            int r6 = r2.size()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r11 >= r6) goto L_0x053f
            java.lang.Object r6 = r2.get(r11)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.jce.provider.PKIXPolicyNode r6 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r6     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r7 = r6.hasChildren()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r7 != 0) goto L_0x053c
            org.bouncycastle.jce.provider.PKIXPolicyNode r3 = removePolicyNode(r3, r5, r6)     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x053c:
            int r11 = r11 + 1
            goto L_0x0526
        L_0x053f:
            int r0 = r0 + -1
            r28 = r3
            goto L_0x051f
        L_0x0544:
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r9, r0)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r3 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.<init>(r2, r3, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r0     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0551:
            r2 = r28
            goto L_0x05e8
        L_0x0555:
            r3 = r25
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.<init>()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r11 = r4
        L_0x055d:
            if (r11 >= r3) goto L_0x059c
            r2 = r5[r11]     // Catch:{ CertPathReviewerException -> 0x0607 }
            r6 = r4
        L_0x0562:
            int r10 = r2.size()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r6 >= r10) goto L_0x0599
            java.lang.Object r10 = r2.get(r6)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.jce.provider.PKIXPolicyNode r10 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r10     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r12 = r10.getValidPolicy()     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r12 = r7.equals(r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r12 == 0) goto L_0x0596
            java.util.Iterator r10 = r10.getChildren()     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x057c:
            boolean r12 = r10.hasNext()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r12 == 0) goto L_0x0596
            java.lang.Object r12 = r10.next()     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.jce.provider.PKIXPolicyNode r12 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r12     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r13 = r12.getValidPolicy()     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r13 = r7.equals(r13)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r13 != 0) goto L_0x057c
            r0.add(r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            goto L_0x057c
        L_0x0596:
            int r6 = r6 + 1
            goto L_0x0562
        L_0x0599:
            int r11 = r11 + 1
            goto L_0x055d
        L_0x059c:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2 = r28
        L_0x05a2:
            boolean r3 = r0.hasNext()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r3 == 0) goto L_0x05c1
            java.lang.Object r3 = r0.next()     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.jce.provider.PKIXPolicyNode r3 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r3     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r6 = r3.getValidPolicy()     // Catch:{ CertPathReviewerException -> 0x0607 }
            r7 = r27
            boolean r6 = r7.contains(r6)     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r6 != 0) goto L_0x05be
            org.bouncycastle.jce.provider.PKIXPolicyNode r2 = removePolicyNode(r2, r5, r3)     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x05be:
            r27 = r7
            goto L_0x05a2
        L_0x05c1:
            if (r2 == 0) goto L_0x05e8
            int r0 = r1.f6380n     // Catch:{ CertPathReviewerException -> 0x0607 }
            r3 = 1
            int r0 = r0 - r3
        L_0x05c7:
            if (r0 < 0) goto L_0x05e8
            r3 = r5[r0]     // Catch:{ CertPathReviewerException -> 0x0607 }
            r11 = r4
        L_0x05cc:
            int r6 = r3.size()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r11 >= r6) goto L_0x05e5
            java.lang.Object r6 = r3.get(r11)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.jce.provider.PKIXPolicyNode r6 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r6     // Catch:{ CertPathReviewerException -> 0x0607 }
            boolean r7 = r6.hasChildren()     // Catch:{ CertPathReviewerException -> 0x0607 }
            if (r7 != 0) goto L_0x05e2
            org.bouncycastle.jce.provider.PKIXPolicyNode r2 = removePolicyNode(r2, r5, r6)     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x05e2:
            int r11 = r11 + 1
            goto L_0x05cc
        L_0x05e5:
            int r0 = r0 + -1
            goto L_0x05c7
        L_0x05e8:
            if (r8 > 0) goto L_0x0613
            if (r2 == 0) goto L_0x05ed
            goto L_0x0613
        L_0x05ed:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.lang.String r2 = "CertPathReviewer.invalidPolicy"
            r0.<init>(r9, r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r0)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r2     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x05fa:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0607 }
            r0.<init>(r9, r2)     // Catch:{ CertPathReviewerException -> 0x0607 }
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException     // Catch:{ CertPathReviewerException -> 0x0607 }
            java.security.cert.CertPath r3 = r1.certPath     // Catch:{ CertPathReviewerException -> 0x0607 }
            r2.<init>(r0, r3, r12)     // Catch:{ CertPathReviewerException -> 0x0607 }
            throw r2     // Catch:{ CertPathReviewerException -> 0x0607 }
        L_0x0607:
            r0 = move-exception
            org.bouncycastle.i18n.ErrorBundle r2 = r0.getErrorMessage()
            int r0 = r0.getIndex()
            r1.addError(r2, r0)
        L_0x0613:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkPolicy():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.security.cert.X509Certificate} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00bf */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02c4 A[LOOP:1: B:104:0x02be->B:106:0x02c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02e7 A[LOOP:2: B:108:0x02e1->B:110:0x02e7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0282 A[SYNTHETIC, Splitter:B:89:0x0282] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02a2 A[Catch:{ AnnotatedException -> 0x02a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void checkSignatures() {
        /*
            r20 = this;
            r10 = r20
            r11 = 2
            java.lang.Object[] r0 = new java.lang.Object[r11]
            org.bouncycastle.i18n.filter.TrustedInput r1 = new org.bouncycastle.i18n.filter.TrustedInput
            java.util.Date r2 = r10.validDate
            r1.<init>(r2)
            r12 = 0
            r0[r12] = r1
            org.bouncycastle.i18n.filter.TrustedInput r1 = new org.bouncycastle.i18n.filter.TrustedInput
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            r1.<init>(r2)
            r13 = 1
            r0[r13] = r1
            org.bouncycastle.i18n.ErrorBundle r1 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r14 = "org.bouncycastle.x509.CertPathReviewerMessages"
            java.lang.String r2 = "CertPathReviewer.certPathValidDate"
            r1.<init>((java.lang.String) r14, (java.lang.String) r2, (java.lang.Object[]) r0)
            r10.addNotification(r1)
            java.util.List r0 = r10.certs     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.util.List r1 = r10.certs     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            int r1 = r1.size()     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            int r1 = r1 - r13
            java.lang.Object r0 = r0.get(r1)     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.security.cert.PKIXParameters r1 = r10.pkixParams     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.util.Set r1 = r1.getTrustAnchors()     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.util.Collection r1 = r10.getTrustAnchors(r0, r1)     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            int r2 = r1.size()     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            if (r2 <= r13) goto L_0x0069
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            int r1 = r1.size()     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.lang.Integer r1 = org.bouncycastle.util.Integers.valueOf(r1)     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            r3[r12] = r1     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            org.bouncycastle.i18n.filter.UntrustedInput r1 = new org.bouncycastle.i18n.filter.UntrustedInput     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            javax.security.auth.x500.X500Principal r0 = r0.getIssuerX500Principal()     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            r1.<init>(r0)     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            r3[r13] = r1     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.lang.String r0 = "CertPathReviewer.conflictingTrustAnchors"
            r2.<init>((java.lang.String) r14, (java.lang.String) r0, (java.lang.Object[]) r3)     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            r10.addError(r2)     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            goto L_0x0096
        L_0x0069:
            boolean r2 = r1.isEmpty()     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            if (r2 == 0) goto L_0x0098
            org.bouncycastle.i18n.ErrorBundle r1 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            org.bouncycastle.i18n.filter.UntrustedInput r3 = new org.bouncycastle.i18n.filter.UntrustedInput     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            javax.security.auth.x500.X500Principal r0 = r0.getIssuerX500Principal()     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            r3.<init>(r0)     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            r2[r12] = r3     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.security.cert.PKIXParameters r0 = r10.pkixParams     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.util.Set r0 = r0.getTrustAnchors()     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            int r0 = r0.size()     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.lang.Integer r0 = org.bouncycastle.util.Integers.valueOf(r0)     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            r2[r13] = r0     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.lang.String r0 = "CertPathReviewer.noTrustAnchorFound"
            r1.<init>((java.lang.String) r14, (java.lang.String) r0, (java.lang.Object[]) r2)     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            r10.addError(r1)     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
        L_0x0096:
            r9 = 0
            goto L_0x00f6
        L_0x0098:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.lang.Object r1 = r1.next()     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.security.cert.TrustAnchor r1 = (java.security.cert.TrustAnchor) r1     // Catch:{ CertPathReviewerException -> 0x00ec, all -> 0x00ce }
            java.security.cert.X509Certificate r2 = r1.getTrustedCert()     // Catch:{ CertPathReviewerException -> 0x00cc, all -> 0x00ca }
            if (r2 == 0) goto L_0x00b1
            java.security.cert.X509Certificate r2 = r1.getTrustedCert()     // Catch:{ CertPathReviewerException -> 0x00cc, all -> 0x00ca }
            java.security.PublicKey r2 = r2.getPublicKey()     // Catch:{ CertPathReviewerException -> 0x00cc, all -> 0x00ca }
            goto L_0x00b5
        L_0x00b1:
            java.security.PublicKey r2 = r1.getCAPublicKey()     // Catch:{ CertPathReviewerException -> 0x00cc, all -> 0x00ca }
        L_0x00b5:
            java.security.cert.PKIXParameters r3 = r10.pkixParams     // Catch:{ SignatureException -> 0x00bf, Exception -> 0x00f5 }
            java.lang.String r3 = r3.getSigProvider()     // Catch:{ SignatureException -> 0x00bf, Exception -> 0x00f5 }
            org.bouncycastle.x509.CertPathValidatorUtilities.verifyX509Certificate(r0, r2, r3)     // Catch:{ SignatureException -> 0x00bf, Exception -> 0x00f5 }
            goto L_0x00f5
        L_0x00bf:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x00cc, all -> 0x00ca }
            java.lang.String r2 = "CertPathReviewer.trustButInvalidCert"
            r0.<init>(r14, r2)     // Catch:{ CertPathReviewerException -> 0x00cc, all -> 0x00ca }
            r10.addError(r0)     // Catch:{ CertPathReviewerException -> 0x00cc, all -> 0x00ca }
            goto L_0x00f5
        L_0x00ca:
            r0 = move-exception
            goto L_0x00d0
        L_0x00cc:
            r0 = move-exception
            goto L_0x00ee
        L_0x00ce:
            r0 = move-exception
            r1 = 0
        L_0x00d0:
            java.lang.Object[] r2 = new java.lang.Object[r11]
            org.bouncycastle.i18n.filter.UntrustedInput r3 = new org.bouncycastle.i18n.filter.UntrustedInput
            java.lang.String r4 = r0.getMessage()
            r3.<init>(r4)
            r2[r12] = r3
            org.bouncycastle.i18n.filter.UntrustedInput r3 = new org.bouncycastle.i18n.filter.UntrustedInput
            r3.<init>(r0)
            r2[r13] = r3
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r3 = "CertPathReviewer.unknown"
            r0.<init>((java.lang.String) r14, (java.lang.String) r3, (java.lang.Object[]) r2)
            goto L_0x00f2
        L_0x00ec:
            r0 = move-exception
            r1 = 0
        L_0x00ee:
            org.bouncycastle.i18n.ErrorBundle r0 = r0.getErrorMessage()
        L_0x00f2:
            r10.addError(r0)
        L_0x00f5:
            r9 = r1
        L_0x00f6:
            r16 = 5
            if (r9 == 0) goto L_0x013e
            java.security.cert.X509Certificate r0 = r9.getTrustedCert()
            if (r0 == 0) goto L_0x0105
            javax.security.auth.x500.X500Principal r1 = getSubjectPrincipal(r0)     // Catch:{ IllegalArgumentException -> 0x010f }
            goto L_0x0127
        L_0x0105:
            javax.security.auth.x500.X500Principal r1 = new javax.security.auth.x500.X500Principal     // Catch:{ IllegalArgumentException -> 0x010f }
            java.lang.String r2 = r9.getCAName()     // Catch:{ IllegalArgumentException -> 0x010f }
            r1.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x010f }
            goto L_0x0127
        L_0x010f:
            java.lang.Object[] r1 = new java.lang.Object[r13]
            org.bouncycastle.i18n.filter.UntrustedInput r2 = new org.bouncycastle.i18n.filter.UntrustedInput
            java.lang.String r3 = r9.getCAName()
            r2.<init>(r3)
            r1[r12] = r2
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r3 = "CertPathReviewer.trustDNInvalid"
            r2.<init>((java.lang.String) r14, (java.lang.String) r3, (java.lang.Object[]) r1)
            r10.addError(r2)
            r1 = 0
        L_0x0127:
            if (r0 == 0) goto L_0x013f
            boolean[] r0 = r0.getKeyUsage()
            if (r0 == 0) goto L_0x013f
            boolean r0 = r0[r16]
            if (r0 != 0) goto L_0x013f
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r2 = "CertPathReviewer.trustKeyUsage"
            r0.<init>(r14, r2)
            r10.addNotification(r0)
            goto L_0x013f
        L_0x013e:
            r1 = 0
        L_0x013f:
            if (r9 == 0) goto L_0x0166
            java.security.cert.X509Certificate r0 = r9.getTrustedCert()
            if (r0 == 0) goto L_0x014c
            java.security.PublicKey r2 = r0.getPublicKey()
            goto L_0x0150
        L_0x014c:
            java.security.PublicKey r2 = r9.getCAPublicKey()
        L_0x0150:
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r3 = getAlgorithmIdentifier(r2)     // Catch:{ CertPathValidatorException -> 0x015b }
            r3.getAlgorithm()     // Catch:{ CertPathValidatorException -> 0x015b }
            r3.getParameters()     // Catch:{ CertPathValidatorException -> 0x015b }
            goto L_0x0168
        L_0x015b:
            org.bouncycastle.i18n.ErrorBundle r3 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r4 = "CertPathReviewer.trustPubKeyError"
            r3.<init>(r14, r4)
            r10.addError(r3)
            goto L_0x0168
        L_0x0166:
            r0 = 0
            r2 = 0
        L_0x0168:
            java.util.List r3 = r10.certs
            int r3 = r3.size()
            int r3 = r3 + -1
            r5 = r0
            r8 = r1
            r7 = r2
            r6 = r3
        L_0x0174:
            if (r6 < 0) goto L_0x03eb
            int r0 = r10.f6380n
            int r4 = r0 - r6
            java.util.List r0 = r10.certs
            java.lang.Object r0 = r0.get(r6)
            r3 = r0
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.lang.String r1 = "CertPathReviewer.signatureNotVerified"
            r2 = 3
            if (r7 == 0) goto L_0x01af
            java.security.cert.PKIXParameters r0 = r10.pkixParams     // Catch:{ GeneralSecurityException -> 0x0193 }
            java.lang.String r0 = r0.getSigProvider()     // Catch:{ GeneralSecurityException -> 0x0193 }
            org.bouncycastle.x509.CertPathValidatorUtilities.verifyX509Certificate(r3, r7, r0)     // Catch:{ GeneralSecurityException -> 0x0193 }
            goto L_0x0246
        L_0x0193:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r17 = r0.getMessage()
            r2[r12] = r17
            r2[r13] = r0
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2[r11] = r0
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            r0.<init>((java.lang.String) r14, (java.lang.String) r1, (java.lang.Object[]) r2)
            goto L_0x0243
        L_0x01af:
            boolean r0 = isSelfIssued(r3)
            if (r0 == 0) goto L_0x01e9
            java.security.PublicKey r0 = r3.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x01ce }
            java.security.cert.PKIXParameters r15 = r10.pkixParams     // Catch:{ GeneralSecurityException -> 0x01ce }
            java.lang.String r15 = r15.getSigProvider()     // Catch:{ GeneralSecurityException -> 0x01ce }
            org.bouncycastle.x509.CertPathValidatorUtilities.verifyX509Certificate(r3, r0, r15)     // Catch:{ GeneralSecurityException -> 0x01ce }
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ GeneralSecurityException -> 0x01ce }
            java.lang.String r15 = "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"
            r0.<init>(r14, r15)     // Catch:{ GeneralSecurityException -> 0x01ce }
            r10.addError(r0, r6)     // Catch:{ GeneralSecurityException -> 0x01ce }
            goto L_0x0246
        L_0x01ce:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r15 = r0.getMessage()
            r2[r12] = r15
            r2[r13] = r0
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2[r11] = r0
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            r0.<init>((java.lang.String) r14, (java.lang.String) r1, (java.lang.Object[]) r2)
            goto L_0x0243
        L_0x01e9:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r1 = "CertPathReviewer.NoIssuerPublicKey"
            r0.<init>(r14, r1)
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = org.bouncycastle.asn1.x509.X509Extensions.AuthorityKeyIdentifier
            java.lang.String r1 = r1.getId()
            byte[] r1 = r3.getExtensionValue(r1)
            if (r1 == 0) goto L_0x0243
            org.bouncycastle.asn1.ASN1Primitive r1 = org.bouncycastle.x509.extension.X509ExtensionUtil.fromExtensionValue(r1)     // Catch:{ IOException -> 0x0243 }
            org.bouncycastle.asn1.x509.AuthorityKeyIdentifier r1 = org.bouncycastle.asn1.x509.AuthorityKeyIdentifier.getInstance(r1)     // Catch:{ IOException -> 0x0243 }
            org.bouncycastle.asn1.x509.GeneralNames r15 = r1.getAuthorityCertIssuer()     // Catch:{ IOException -> 0x0243 }
            if (r15 == 0) goto L_0x0243
            org.bouncycastle.asn1.x509.GeneralName[] r15 = r15.getNames()     // Catch:{ IOException -> 0x0243 }
            r15 = r15[r12]     // Catch:{ IOException -> 0x0243 }
            java.math.BigInteger r1 = r1.getAuthorityCertSerialNumber()     // Catch:{ IOException -> 0x0243 }
            if (r1 == 0) goto L_0x0243
            r2 = 7
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0243 }
            org.bouncycastle.i18n.LocaleString r11 = new org.bouncycastle.i18n.LocaleString     // Catch:{ IOException -> 0x0243 }
            java.lang.String r13 = "missingIssuer"
            r11.<init>(r14, r13)     // Catch:{ IOException -> 0x0243 }
            r2[r12] = r11     // Catch:{ IOException -> 0x0243 }
            java.lang.String r11 = " \""
            r13 = 1
            r2[r13] = r11     // Catch:{ IOException -> 0x0243 }
            r11 = 2
            r2[r11] = r15     // Catch:{ IOException -> 0x0243 }
            java.lang.String r11 = "\" "
            r13 = 3
            r2[r13] = r11     // Catch:{ IOException -> 0x0243 }
            org.bouncycastle.i18n.LocaleString r11 = new org.bouncycastle.i18n.LocaleString     // Catch:{ IOException -> 0x0243 }
            java.lang.String r13 = "missingSerial"
            r11.<init>(r14, r13)     // Catch:{ IOException -> 0x0243 }
            r13 = 4
            r2[r13] = r11     // Catch:{ IOException -> 0x0243 }
            java.lang.String r11 = " "
            r2[r16] = r11     // Catch:{ IOException -> 0x0243 }
            r11 = 6
            r2[r11] = r1     // Catch:{ IOException -> 0x0243 }
            r0.setExtraArguments(r2)     // Catch:{ IOException -> 0x0243 }
        L_0x0243:
            r10.addError(r0, r6)
        L_0x0246:
            java.util.Date r0 = r10.validDate     // Catch:{ CertificateNotYetValidException -> 0x0262, CertificateExpiredException -> 0x024c }
            r3.checkValidity(r0)     // Catch:{ CertificateNotYetValidException -> 0x0262, CertificateExpiredException -> 0x024c }
            goto L_0x027a
        L_0x024c:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            org.bouncycastle.i18n.filter.TrustedInput r2 = new org.bouncycastle.i18n.filter.TrustedInput
            java.util.Date r11 = r3.getNotAfter()
            r2.<init>(r11)
            r0[r12] = r2
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r11 = "CertPathReviewer.certificateExpired"
            r2.<init>((java.lang.String) r14, (java.lang.String) r11, (java.lang.Object[]) r0)
            goto L_0x0277
        L_0x0262:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            org.bouncycastle.i18n.filter.TrustedInput r1 = new org.bouncycastle.i18n.filter.TrustedInput
            java.util.Date r2 = r3.getNotBefore()
            r1.<init>(r2)
            r0[r12] = r1
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r1 = "CertPathReviewer.certificateNotYetValid"
            r2.<init>((java.lang.String) r14, (java.lang.String) r1, (java.lang.Object[]) r0)
        L_0x0277:
            r10.addError(r2, r6)
        L_0x027a:
            java.security.cert.PKIXParameters r0 = r10.pkixParams
            boolean r0 = r0.isRevocationEnabled()
            if (r0 == 0) goto L_0x032a
            java.lang.String r0 = CRL_DIST_POINTS     // Catch:{ AnnotatedException -> 0x028f }
            org.bouncycastle.asn1.ASN1Primitive r0 = getExtensionValue(r3, r0)     // Catch:{ AnnotatedException -> 0x028f }
            if (r0 == 0) goto L_0x0299
            org.bouncycastle.asn1.x509.CRLDistPoint r0 = org.bouncycastle.asn1.x509.CRLDistPoint.getInstance(r0)     // Catch:{ AnnotatedException -> 0x028f }
            goto L_0x029a
        L_0x028f:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r1 = "CertPathReviewer.crlDistPtExtError"
            r0.<init>(r14, r1)
            r10.addError(r0, r6)
        L_0x0299:
            r0 = 0
        L_0x029a:
            java.lang.String r1 = AUTH_INFO_ACCESS     // Catch:{ AnnotatedException -> 0x02a7 }
            org.bouncycastle.asn1.ASN1Primitive r1 = getExtensionValue(r3, r1)     // Catch:{ AnnotatedException -> 0x02a7 }
            if (r1 == 0) goto L_0x02b1
            org.bouncycastle.asn1.x509.AuthorityInformationAccess r1 = org.bouncycastle.asn1.x509.AuthorityInformationAccess.getInstance(r1)     // Catch:{ AnnotatedException -> 0x02a7 }
            goto L_0x02b2
        L_0x02a7:
            org.bouncycastle.i18n.ErrorBundle r1 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r2 = "CertPathReviewer.crlAuthInfoAccError"
            r1.<init>(r14, r2)
            r10.addError(r1, r6)
        L_0x02b1:
            r1 = 0
        L_0x02b2:
            java.util.Vector r0 = r10.getCRLDistUrls(r0)
            java.util.Vector r11 = r10.getOCSPUrls(r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x02be:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02dd
            r2 = 1
            java.lang.Object[] r13 = new java.lang.Object[r2]
            org.bouncycastle.i18n.filter.UntrustedUrlInput r2 = new org.bouncycastle.i18n.filter.UntrustedUrlInput
            java.lang.Object r15 = r1.next()
            r2.<init>(r15)
            r13[r12] = r2
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r15 = "CertPathReviewer.crlDistPoint"
            r2.<init>((java.lang.String) r14, (java.lang.String) r15, (java.lang.Object[]) r13)
            r10.addNotification(r2, r6)
            goto L_0x02be
        L_0x02dd:
            java.util.Iterator r1 = r11.iterator()
        L_0x02e1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0300
            r2 = 1
            java.lang.Object[] r13 = new java.lang.Object[r2]
            org.bouncycastle.i18n.filter.UntrustedUrlInput r2 = new org.bouncycastle.i18n.filter.UntrustedUrlInput
            java.lang.Object r15 = r1.next()
            r2.<init>(r15)
            r13[r12] = r2
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r15 = "CertPathReviewer.ocspLocation"
            r2.<init>((java.lang.String) r14, (java.lang.String) r15, (java.lang.Object[]) r13)
            r10.addNotification(r2, r6)
            goto L_0x02e1
        L_0x0300:
            java.security.cert.PKIXParameters r2 = r10.pkixParams     // Catch:{ CertPathReviewerException -> 0x0319 }
            java.util.Date r13 = r10.validDate     // Catch:{ CertPathReviewerException -> 0x0319 }
            r1 = r20
            r15 = r3
            r18 = r4
            r4 = r13
            r13 = r6
            r6 = r7
            r19 = r7
            r7 = r0
            r12 = r8
            r8 = r11
            r11 = r9
            r9 = r13
            r1.checkRevocation(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ CertPathReviewerException -> 0x0317 }
            goto L_0x0332
        L_0x0317:
            r0 = move-exception
            goto L_0x0322
        L_0x0319:
            r0 = move-exception
            r15 = r3
            r18 = r4
            r13 = r6
            r19 = r7
            r12 = r8
            r11 = r9
        L_0x0322:
            org.bouncycastle.i18n.ErrorBundle r0 = r0.getErrorMessage()
            r10.addError(r0, r13)
            goto L_0x0332
        L_0x032a:
            r15 = r3
            r18 = r4
            r13 = r6
            r19 = r7
            r12 = r8
            r11 = r9
        L_0x0332:
            if (r12 == 0) goto L_0x035e
            javax.security.auth.x500.X500Principal r0 = r15.getIssuerX500Principal()
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x035e
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = r12.getName()
            r3 = 0
            r0[r3] = r2
            javax.security.auth.x500.X500Principal r2 = r15.getIssuerX500Principal()
            java.lang.String r2 = r2.getName()
            r4 = 1
            r0[r4] = r2
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r4 = "CertPathReviewer.certWrongIssuer"
            r2.<init>((java.lang.String) r14, (java.lang.String) r4, (java.lang.Object[]) r0)
            r10.addError(r2, r13)
            goto L_0x0360
        L_0x035e:
            r1 = 2
            r3 = 0
        L_0x0360:
            int r0 = r10.f6380n
            r2 = r18
            if (r2 == r0) goto L_0x03c0
            java.lang.String r0 = "CertPathReviewer.noCACert"
            if (r15 == 0) goto L_0x037a
            int r2 = r15.getVersion()
            r4 = 1
            if (r2 != r4) goto L_0x037b
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            r2.<init>(r14, r0)
            r10.addError(r2, r13)
            goto L_0x037b
        L_0x037a:
            r4 = 1
        L_0x037b:
            java.lang.String r2 = BASIC_CONSTRAINTS     // Catch:{ AnnotatedException -> 0x03a1 }
            org.bouncycastle.asn1.ASN1Primitive r2 = getExtensionValue(r15, r2)     // Catch:{ AnnotatedException -> 0x03a1 }
            org.bouncycastle.asn1.x509.BasicConstraints r2 = org.bouncycastle.asn1.x509.BasicConstraints.getInstance(r2)     // Catch:{ AnnotatedException -> 0x03a1 }
            if (r2 == 0) goto L_0x0396
            boolean r2 = r2.isCA()     // Catch:{ AnnotatedException -> 0x03a1 }
            if (r2 != 0) goto L_0x03ab
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ AnnotatedException -> 0x03a1 }
            r2.<init>(r14, r0)     // Catch:{ AnnotatedException -> 0x03a1 }
            r10.addError(r2, r13)     // Catch:{ AnnotatedException -> 0x03a1 }
            goto L_0x03ab
        L_0x0396:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ AnnotatedException -> 0x03a1 }
            java.lang.String r2 = "CertPathReviewer.noBasicConstraints"
            r0.<init>(r14, r2)     // Catch:{ AnnotatedException -> 0x03a1 }
            r10.addError(r0, r13)     // Catch:{ AnnotatedException -> 0x03a1 }
            goto L_0x03ab
        L_0x03a1:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r2 = "CertPathReviewer.errorProcesingBC"
            r0.<init>(r14, r2)
            r10.addError(r0, r13)
        L_0x03ab:
            boolean[] r0 = r15.getKeyUsage()
            if (r0 == 0) goto L_0x03c1
            boolean r0 = r0[r16]
            if (r0 != 0) goto L_0x03c1
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r2 = "CertPathReviewer.noCertSign"
            r0.<init>(r14, r2)
            r10.addError(r0, r13)
            goto L_0x03c1
        L_0x03c0:
            r4 = 1
        L_0x03c1:
            javax.security.auth.x500.X500Principal r8 = r15.getSubjectX500Principal()
            java.util.List r0 = r10.certs     // Catch:{ CertPathValidatorException -> 0x03d6 }
            java.security.PublicKey r7 = getNextWorkingKey(r0, r13)     // Catch:{ CertPathValidatorException -> 0x03d6 }
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = getAlgorithmIdentifier(r7)     // Catch:{ CertPathValidatorException -> 0x03d8 }
            r0.getAlgorithm()     // Catch:{ CertPathValidatorException -> 0x03d8 }
            r0.getParameters()     // Catch:{ CertPathValidatorException -> 0x03d8 }
            goto L_0x03e2
        L_0x03d6:
            r7 = r19
        L_0x03d8:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r2 = "CertPathReviewer.pubKeyError"
            r0.<init>(r14, r2)
            r10.addError(r0, r13)
        L_0x03e2:
            int r6 = r13 + -1
            r12 = r3
            r13 = r4
            r9 = r11
            r5 = r15
            r11 = r1
            goto L_0x0174
        L_0x03eb:
            r19 = r7
            r11 = r9
            r10.trustAnchor = r11
            r2 = r19
            r10.subjectPublicKey = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkSignatures():void");
    }

    private X509CRL getCRL(String str) throws CertPathReviewerException {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http")) {
                if (!url.getProtocol().equals("https")) {
                    return null;
                }
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e.getMessage(), e, e.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i) {
        ErrorBundle errorBundle;
        ErrorBundle errorBundle2;
        int i2 = i;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z = false;
            for (int i3 = 0; i3 < aSN1Sequence.size(); i3++) {
                QCStatement instance = QCStatement.getInstance(aSN1Sequence.getObjectAt(i3));
                if (QCStatement.id_etsi_qcs_QcCompliance.equals(instance.getStatementId())) {
                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!QCStatement.id_qcs_pkixQCSyntax_v1.equals(instance.getStatementId())) {
                        if (QCStatement.id_etsi_qcs_QcSSCD.equals(instance.getStatementId())) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcSSCD");
                        } else if (QCStatement.id_etsi_qcs_LimiteValue.equals(instance.getStatementId())) {
                            MonetaryValue instance2 = MonetaryValue.getInstance(instance.getStatementInfo());
                            instance2.getCurrency();
                            double doubleValue = instance2.getAmount().doubleValue() * Math.pow(10.0d, instance2.getExponent().doubleValue());
                            if (instance2.getCurrency().isAlphabetic()) {
                                errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueAlpha", new Object[]{instance2.getCurrency().getAlphabetic(), new TrustedInput(new Double(doubleValue)), instance2});
                            } else {
                                errorBundle2 = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(instance2.getCurrency().getNumeric()), new TrustedInput(new Double(doubleValue)), instance2});
                            }
                            addNotification(errorBundle2, i2);
                        } else {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcUnknownStatement", new Object[]{instance.getStatementId(), new UntrustedInput(instance)}), i2);
                            z = true;
                        }
                    }
                }
                addNotification(errorBundle, i2);
            }
            return !z;
        } catch (AnnotatedException unused) {
            addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcStatementExtError"), i2);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    /* access modifiers changed from: protected */
    public void addError(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.f6380n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i + 1].add(errorBundle);
    }

    /* access modifiers changed from: protected */
    public void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    /* access modifiers changed from: protected */
    public void addNotification(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.f6380n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i + 1].add(errorBundle);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x047d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0132 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void checkCRLs(java.security.cert.PKIXParameters r19, java.security.cert.X509Certificate r20, java.util.Date r21, java.security.cert.X509Certificate r22, java.security.PublicKey r23, java.util.Vector r24, int r25) throws org.bouncycastle.x509.CertPathReviewerException {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r23
            r5 = r25
            java.lang.String r6 = "CertPathReviewer.distrPtExtError"
            java.lang.String r7 = "CertPathReviewer.crlExtractionError"
            java.lang.String r8 = "CertPathReviewer.crlIssuerException"
            java.lang.String r9 = "org.bouncycastle.x509.CertPathReviewerMessages"
            org.bouncycastle.x509.X509CRLStoreSelector r0 = new org.bouncycastle.x509.X509CRLStoreSelector
            r0.<init>()
            javax.security.auth.x500.X500Principal r10 = getEncodedIssuerPrincipal(r20)     // Catch:{ IOException -> 0x048b }
            byte[] r10 = r10.getEncoded()     // Catch:{ IOException -> 0x048b }
            r0.addIssuerName(r10)     // Catch:{ IOException -> 0x048b }
            r0.setCertificateChecking(r3)
            r10 = 3
            org.bouncycastle.x509.PKIXCRLUtil r14 = CRL_UTIL     // Catch:{ AnnotatedException -> 0x008e }
            java.util.Set r14 = r14.findCRLs((org.bouncycastle.x509.X509CRLStoreSelector) r0, (java.security.cert.PKIXParameters) r2)     // Catch:{ AnnotatedException -> 0x008e }
            java.util.Iterator r15 = r14.iterator()     // Catch:{ AnnotatedException -> 0x008e }
            boolean r14 = r14.isEmpty()     // Catch:{ AnnotatedException -> 0x008e }
            if (r14 == 0) goto L_0x00c3
            org.bouncycastle.x509.PKIXCRLUtil r14 = CRL_UTIL     // Catch:{ AnnotatedException -> 0x008e }
            org.bouncycastle.x509.X509CRLStoreSelector r11 = new org.bouncycastle.x509.X509CRLStoreSelector     // Catch:{ AnnotatedException -> 0x008e }
            r11.<init>()     // Catch:{ AnnotatedException -> 0x008e }
            java.util.Set r11 = r14.findCRLs((org.bouncycastle.x509.X509CRLStoreSelector) r11, (java.security.cert.PKIXParameters) r2)     // Catch:{ AnnotatedException -> 0x008e }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ AnnotatedException -> 0x008e }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ AnnotatedException -> 0x008e }
            r14.<init>()     // Catch:{ AnnotatedException -> 0x008e }
        L_0x004a:
            boolean r16 = r11.hasNext()     // Catch:{ AnnotatedException -> 0x008e }
            if (r16 == 0) goto L_0x005e
            java.lang.Object r16 = r11.next()     // Catch:{ AnnotatedException -> 0x008e }
            java.security.cert.X509CRL r16 = (java.security.cert.X509CRL) r16     // Catch:{ AnnotatedException -> 0x008e }
            javax.security.auth.x500.X500Principal r13 = r16.getIssuerX500Principal()     // Catch:{ AnnotatedException -> 0x008e }
            r14.add(r13)     // Catch:{ AnnotatedException -> 0x008e }
            goto L_0x004a
        L_0x005e:
            int r11 = r14.size()     // Catch:{ AnnotatedException -> 0x008e }
            org.bouncycastle.i18n.ErrorBundle r13 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ AnnotatedException -> 0x008e }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ AnnotatedException -> 0x008e }
            org.bouncycastle.i18n.filter.UntrustedInput r10 = new org.bouncycastle.i18n.filter.UntrustedInput     // Catch:{ AnnotatedException -> 0x008b }
            java.util.Collection r0 = r0.getIssuerNames()     // Catch:{ AnnotatedException -> 0x008b }
            r10.<init>(r0)     // Catch:{ AnnotatedException -> 0x008b }
            r16 = 0
            r12[r16] = r10     // Catch:{ AnnotatedException -> 0x008b }
            org.bouncycastle.i18n.filter.UntrustedInput r0 = new org.bouncycastle.i18n.filter.UntrustedInput     // Catch:{ AnnotatedException -> 0x008b }
            r0.<init>(r14)     // Catch:{ AnnotatedException -> 0x008b }
            r10 = 1
            r12[r10] = r0     // Catch:{ AnnotatedException -> 0x008b }
            java.lang.Integer r0 = org.bouncycastle.util.Integers.valueOf(r11)     // Catch:{ AnnotatedException -> 0x008b }
            r10 = 2
            r12[r10] = r0     // Catch:{ AnnotatedException -> 0x008b }
            java.lang.String r0 = "CertPathReviewer.noCrlInCertstore"
            r13.<init>((java.lang.String) r9, (java.lang.String) r0, (java.lang.Object[]) r12)     // Catch:{ AnnotatedException -> 0x008b }
            r1.addNotification(r13, r5)     // Catch:{ AnnotatedException -> 0x008b }
            goto L_0x00c3
        L_0x008b:
            r0 = move-exception
            r10 = 3
            goto L_0x008f
        L_0x008e:
            r0 = move-exception
        L_0x008f:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.Throwable r10 = r0.getCause()
            java.lang.String r10 = r10.getMessage()
            r12 = 0
            r11[r12] = r10
            java.lang.Throwable r10 = r0.getCause()
            r12 = 1
            r11[r12] = r10
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r10 = 2
            r11[r10] = r0
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            r0.<init>((java.lang.String) r9, (java.lang.String) r7, (java.lang.Object[]) r11)
            r1.addError(r0, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r15 = r0.iterator()
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            boolean r11 = r15.hasNext()
            if (r11 == 0) goto L_0x0132
            java.lang.Object r0 = r15.next()
            java.security.cert.X509CRL r0 = (java.security.cert.X509CRL) r0
            java.util.Date r11 = r0.getNextUpdate()
            if (r11 == 0) goto L_0x010a
            java.util.Date r11 = r19.getDate()
            java.util.Date r12 = r0.getNextUpdate()
            boolean r11 = r11.before(r12)
            if (r11 != 0) goto L_0x010a
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            org.bouncycastle.i18n.filter.TrustedInput r11 = new org.bouncycastle.i18n.filter.TrustedInput
            java.util.Date r13 = r0.getThisUpdate()
            r11.<init>(r13)
            r13 = 0
            r12[r13] = r11
            org.bouncycastle.i18n.filter.TrustedInput r11 = new org.bouncycastle.i18n.filter.TrustedInput
            java.util.Date r13 = r0.getNextUpdate()
            r11.<init>(r13)
            r13 = 1
            r12[r13] = r11
            org.bouncycastle.i18n.ErrorBundle r11 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r13 = "CertPathReviewer.localInvalidCRL"
            r11.<init>((java.lang.String) r9, (java.lang.String) r13, (java.lang.Object[]) r12)
            r1.addNotification(r11, r5)
            goto L_0x00c4
        L_0x010a:
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            org.bouncycastle.i18n.filter.TrustedInput r11 = new org.bouncycastle.i18n.filter.TrustedInput
            java.util.Date r13 = r0.getThisUpdate()
            r11.<init>(r13)
            r13 = 0
            r12[r13] = r11
            org.bouncycastle.i18n.filter.TrustedInput r11 = new org.bouncycastle.i18n.filter.TrustedInput
            java.util.Date r13 = r0.getNextUpdate()
            r11.<init>(r13)
            r13 = 1
            r12[r13] = r11
            org.bouncycastle.i18n.ErrorBundle r11 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r13 = "CertPathReviewer.localValidCRL"
            r11.<init>((java.lang.String) r9, (java.lang.String) r13, (java.lang.Object[]) r12)
            r1.addNotification(r11, r5)
            r11 = r0
            r0 = 1
            goto L_0x0134
        L_0x0132:
            r11 = r0
            r0 = 0
        L_0x0134:
            if (r0 != 0) goto L_0x023f
            java.util.Iterator r12 = r24.iterator()
            r13 = r0
        L_0x013b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x023b
            java.lang.Object r0 = r12.next()     // Catch:{ CertPathReviewerException -> 0x0229 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ CertPathReviewerException -> 0x0229 }
            java.security.cert.X509CRL r14 = r1.getCRL(r0)     // Catch:{ CertPathReviewerException -> 0x0229 }
            if (r14 == 0) goto L_0x0223
            javax.security.auth.x500.X500Principal r15 = r20.getIssuerX500Principal()     // Catch:{ CertPathReviewerException -> 0x0229 }
            javax.security.auth.x500.X500Principal r10 = r14.getIssuerX500Principal()     // Catch:{ CertPathReviewerException -> 0x0229 }
            boolean r10 = r15.equals(r10)     // Catch:{ CertPathReviewerException -> 0x0229 }
            if (r10 != 0) goto L_0x0199
            org.bouncycastle.i18n.ErrorBundle r10 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0229 }
            r17 = r11
            r15 = 3
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ CertPathReviewerException -> 0x0220 }
            org.bouncycastle.i18n.filter.UntrustedInput r15 = new org.bouncycastle.i18n.filter.UntrustedInput     // Catch:{ CertPathReviewerException -> 0x0220 }
            javax.security.auth.x500.X500Principal r14 = r14.getIssuerX500Principal()     // Catch:{ CertPathReviewerException -> 0x0220 }
            java.lang.String r14 = r14.getName()     // Catch:{ CertPathReviewerException -> 0x0220 }
            r15.<init>(r14)     // Catch:{ CertPathReviewerException -> 0x0220 }
            r14 = 0
            r11[r14] = r15     // Catch:{ CertPathReviewerException -> 0x0220 }
            org.bouncycastle.i18n.filter.UntrustedInput r14 = new org.bouncycastle.i18n.filter.UntrustedInput     // Catch:{ CertPathReviewerException -> 0x0220 }
            javax.security.auth.x500.X500Principal r15 = r20.getIssuerX500Principal()     // Catch:{ CertPathReviewerException -> 0x0220 }
            java.lang.String r15 = r15.getName()     // Catch:{ CertPathReviewerException -> 0x0220 }
            r14.<init>(r15)     // Catch:{ CertPathReviewerException -> 0x0220 }
            r15 = 1
            r11[r15] = r14     // Catch:{ CertPathReviewerException -> 0x0220 }
            org.bouncycastle.i18n.filter.UntrustedUrlInput r14 = new org.bouncycastle.i18n.filter.UntrustedUrlInput     // Catch:{ CertPathReviewerException -> 0x0220 }
            r14.<init>(r0)     // Catch:{ CertPathReviewerException -> 0x0220 }
            r15 = 2
            r11[r15] = r14     // Catch:{ CertPathReviewerException -> 0x0220 }
            java.lang.String r0 = "CertPathReviewer.onlineCRLWrongCA"
            r10.<init>((java.lang.String) r9, (java.lang.String) r0, (java.lang.Object[]) r11)     // Catch:{ CertPathReviewerException -> 0x0220 }
            r1.addNotification(r10, r5)     // Catch:{ CertPathReviewerException -> 0x0220 }
            goto L_0x0225
        L_0x0194:
            r24 = r12
        L_0x0196:
            r11 = 3
            goto L_0x022e
        L_0x0199:
            r17 = r11
            java.util.Date r10 = r14.getNextUpdate()     // Catch:{ CertPathReviewerException -> 0x0220 }
            if (r10 == 0) goto L_0x01e8
            java.security.cert.PKIXParameters r10 = r1.pkixParams     // Catch:{ CertPathReviewerException -> 0x0220 }
            java.util.Date r10 = r10.getDate()     // Catch:{ CertPathReviewerException -> 0x0220 }
            java.util.Date r11 = r14.getNextUpdate()     // Catch:{ CertPathReviewerException -> 0x0220 }
            boolean r10 = r10.before(r11)     // Catch:{ CertPathReviewerException -> 0x0220 }
            if (r10 == 0) goto L_0x01b2
            goto L_0x01e8
        L_0x01b2:
            org.bouncycastle.i18n.ErrorBundle r10 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x0220 }
            r11 = 3
            java.lang.Object[] r15 = new java.lang.Object[r11]     // Catch:{ CertPathReviewerException -> 0x01e4 }
            org.bouncycastle.i18n.filter.TrustedInput r11 = new org.bouncycastle.i18n.filter.TrustedInput     // Catch:{ CertPathReviewerException -> 0x0220 }
            r24 = r12
            java.util.Date r12 = r14.getThisUpdate()     // Catch:{ CertPathReviewerException -> 0x01e2 }
            r11.<init>(r12)     // Catch:{ CertPathReviewerException -> 0x01e2 }
            r12 = 0
            r15[r12] = r11     // Catch:{ CertPathReviewerException -> 0x01e2 }
            org.bouncycastle.i18n.filter.TrustedInput r11 = new org.bouncycastle.i18n.filter.TrustedInput     // Catch:{ CertPathReviewerException -> 0x01e2 }
            java.util.Date r12 = r14.getNextUpdate()     // Catch:{ CertPathReviewerException -> 0x01e2 }
            r11.<init>(r12)     // Catch:{ CertPathReviewerException -> 0x01e2 }
            r12 = 1
            r15[r12] = r11     // Catch:{ CertPathReviewerException -> 0x01e2 }
            org.bouncycastle.i18n.filter.UntrustedUrlInput r11 = new org.bouncycastle.i18n.filter.UntrustedUrlInput     // Catch:{ CertPathReviewerException -> 0x01e2 }
            r11.<init>(r0)     // Catch:{ CertPathReviewerException -> 0x01e2 }
            r12 = 2
            r15[r12] = r11     // Catch:{ CertPathReviewerException -> 0x01e2 }
            java.lang.String r0 = "CertPathReviewer.onlineInvalidCRL"
            r10.<init>((java.lang.String) r9, (java.lang.String) r0, (java.lang.Object[]) r15)     // Catch:{ CertPathReviewerException -> 0x01e2 }
            r1.addNotification(r10, r5)     // Catch:{ CertPathReviewerException -> 0x01e2 }
            goto L_0x0227
        L_0x01e2:
            r0 = move-exception
            goto L_0x0196
        L_0x01e4:
            r0 = move-exception
            r24 = r12
            goto L_0x022e
        L_0x01e8:
            r24 = r12
            org.bouncycastle.i18n.ErrorBundle r10 = new org.bouncycastle.i18n.ErrorBundle     // Catch:{ CertPathReviewerException -> 0x021c }
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ CertPathReviewerException -> 0x021a }
            org.bouncycastle.i18n.filter.TrustedInput r13 = new org.bouncycastle.i18n.filter.TrustedInput     // Catch:{ CertPathReviewerException -> 0x021a }
            java.util.Date r15 = r14.getThisUpdate()     // Catch:{ CertPathReviewerException -> 0x021a }
            r13.<init>(r15)     // Catch:{ CertPathReviewerException -> 0x021a }
            r15 = 0
            r12[r15] = r13     // Catch:{ CertPathReviewerException -> 0x021a }
            org.bouncycastle.i18n.filter.TrustedInput r13 = new org.bouncycastle.i18n.filter.TrustedInput     // Catch:{ CertPathReviewerException -> 0x021a }
            java.util.Date r15 = r14.getNextUpdate()     // Catch:{ CertPathReviewerException -> 0x021a }
            r13.<init>(r15)     // Catch:{ CertPathReviewerException -> 0x021a }
            r15 = 1
            r12[r15] = r13     // Catch:{ CertPathReviewerException -> 0x021a }
            org.bouncycastle.i18n.filter.UntrustedUrlInput r13 = new org.bouncycastle.i18n.filter.UntrustedUrlInput     // Catch:{ CertPathReviewerException -> 0x021a }
            r13.<init>(r0)     // Catch:{ CertPathReviewerException -> 0x021a }
            r15 = 2
            r12[r15] = r13     // Catch:{ CertPathReviewerException -> 0x021a }
            java.lang.String r0 = "CertPathReviewer.onlineValidCRL"
            r10.<init>((java.lang.String) r9, (java.lang.String) r0, (java.lang.Object[]) r12)     // Catch:{ CertPathReviewerException -> 0x021a }
            r1.addNotification(r10, r5)     // Catch:{ CertPathReviewerException -> 0x021a }
            r11 = r14
            r10 = 1
            goto L_0x0242
        L_0x021a:
            r0 = move-exception
            goto L_0x021e
        L_0x021c:
            r0 = move-exception
            r11 = 3
        L_0x021e:
            r13 = 1
            goto L_0x022e
        L_0x0220:
            r0 = move-exception
            goto L_0x0194
        L_0x0223:
            r17 = r11
        L_0x0225:
            r24 = r12
        L_0x0227:
            r11 = 3
            goto L_0x0235
        L_0x0229:
            r0 = move-exception
            r17 = r11
            goto L_0x0194
        L_0x022e:
            org.bouncycastle.i18n.ErrorBundle r0 = r0.getErrorMessage()
            r1.addNotification(r0, r5)
        L_0x0235:
            r12 = r24
            r11 = r17
            goto L_0x013b
        L_0x023b:
            r17 = r11
            r10 = r13
            goto L_0x0242
        L_0x023f:
            r17 = r11
            r10 = r0
        L_0x0242:
            if (r11 == 0) goto L_0x047b
            r0 = 7
            if (r22 == 0) goto L_0x0263
            boolean[] r12 = r22.getKeyUsage()
            if (r12 == 0) goto L_0x0263
            int r13 = r12.length
            if (r13 < r0) goto L_0x0256
            r13 = 6
            boolean r12 = r12[r13]
            if (r12 == 0) goto L_0x0256
            goto L_0x0263
        L_0x0256:
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r3 = "CertPathReviewer.noCrlSigningPermited"
            r2.<init>(r9, r3)
            r0.<init>(r2)
            throw r0
        L_0x0263:
            if (r4 == 0) goto L_0x046e
            java.lang.String r12 = "BC"
            r11.verify(r4, r12)     // Catch:{ Exception -> 0x0460 }
            java.math.BigInteger r4 = r20.getSerialNumber()
            java.security.cert.X509CRLEntry r4 = r11.getRevokedCertificate(r4)
            if (r4 == 0) goto L_0x02f6
            boolean r12 = r4.hasExtensions()
            if (r12 == 0) goto L_0x02a5
            org.bouncycastle.asn1.ASN1ObjectIdentifier r12 = org.bouncycastle.asn1.x509.X509Extensions.ReasonCode     // Catch:{ AnnotatedException -> 0x0297 }
            java.lang.String r12 = r12.getId()     // Catch:{ AnnotatedException -> 0x0297 }
            org.bouncycastle.asn1.ASN1Primitive r12 = getExtensionValue(r4, r12)     // Catch:{ AnnotatedException -> 0x0297 }
            org.bouncycastle.asn1.ASN1Enumerated r12 = org.bouncycastle.asn1.ASN1Enumerated.getInstance(r12)     // Catch:{ AnnotatedException -> 0x0297 }
            if (r12 == 0) goto L_0x02a5
            java.lang.String[] r13 = crlReasons
            java.math.BigInteger r12 = r12.getValue()
            int r12 = r12.intValue()
            r12 = r13[r12]
            goto L_0x02a6
        L_0x0297:
            r0 = move-exception
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r3 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r4 = "CertPathReviewer.crlReasonExtError"
            r3.<init>(r9, r4)
            r2.<init>(r3, r0)
            throw r2
        L_0x02a5:
            r12 = 0
        L_0x02a6:
            if (r12 != 0) goto L_0x02ac
            java.lang.String[] r12 = crlReasons
            r12 = r12[r0]
        L_0x02ac:
            org.bouncycastle.i18n.LocaleString r0 = new org.bouncycastle.i18n.LocaleString
            r0.<init>(r9, r12)
            java.util.Date r12 = r4.getRevocationDate()
            r13 = r21
            boolean r12 = r13.before(r12)
            if (r12 == 0) goto L_0x02d7
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            org.bouncycastle.i18n.filter.TrustedInput r13 = new org.bouncycastle.i18n.filter.TrustedInput
            java.util.Date r4 = r4.getRevocationDate()
            r13.<init>(r4)
            r14 = 0
            r12[r14] = r13
            r13 = 1
            r12[r13] = r0
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r4 = "CertPathReviewer.revokedAfterValidation"
            r0.<init>((java.lang.String) r9, (java.lang.String) r4, (java.lang.Object[]) r12)
            goto L_0x02fd
        L_0x02d7:
            r12 = 2
            r13 = 1
            r14 = 0
            java.lang.Object[] r2 = new java.lang.Object[r12]
            org.bouncycastle.i18n.filter.TrustedInput r3 = new org.bouncycastle.i18n.filter.TrustedInput
            java.util.Date r4 = r4.getRevocationDate()
            r3.<init>(r4)
            r2[r14] = r3
            r2[r13] = r0
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r3 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r4 = "CertPathReviewer.certRevoked"
            r3.<init>((java.lang.String) r9, (java.lang.String) r4, (java.lang.Object[]) r2)
            r0.<init>(r3)
            throw r0
        L_0x02f6:
            org.bouncycastle.i18n.ErrorBundle r0 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r4 = "CertPathReviewer.notRevoked"
            r0.<init>(r9, r4)
        L_0x02fd:
            r1.addNotification(r0, r5)
            java.util.Date r0 = r11.getNextUpdate()
            if (r0 == 0) goto L_0x0330
            java.util.Date r0 = r11.getNextUpdate()
            java.security.cert.PKIXParameters r4 = r1.pkixParams
            java.util.Date r4 = r4.getDate()
            boolean r0 = r0.before(r4)
            if (r0 == 0) goto L_0x0330
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            org.bouncycastle.i18n.filter.TrustedInput r12 = new org.bouncycastle.i18n.filter.TrustedInput
            java.util.Date r13 = r11.getNextUpdate()
            r12.<init>(r13)
            r13 = 0
            r0[r13] = r12
            org.bouncycastle.i18n.ErrorBundle r12 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r14 = "CertPathReviewer.crlUpdateAvailable"
            r12.<init>((java.lang.String) r9, (java.lang.String) r14, (java.lang.Object[]) r0)
            r1.addNotification(r12, r5)
            goto L_0x0332
        L_0x0330:
            r4 = 1
            r13 = 0
        L_0x0332:
            java.lang.String r0 = ISSUING_DISTRIBUTION_POINT     // Catch:{ AnnotatedException -> 0x0455 }
            org.bouncycastle.asn1.ASN1Primitive r0 = getExtensionValue(r11, r0)     // Catch:{ AnnotatedException -> 0x0455 }
            java.lang.String r5 = DELTA_CRL_INDICATOR     // Catch:{ AnnotatedException -> 0x0448 }
            org.bouncycastle.asn1.ASN1Primitive r5 = getExtensionValue(r11, r5)     // Catch:{ AnnotatedException -> 0x0448 }
            if (r5 == 0) goto L_0x03de
            org.bouncycastle.x509.X509CRLStoreSelector r12 = new org.bouncycastle.x509.X509CRLStoreSelector
            r12.<init>()
            javax.security.auth.x500.X500Principal r14 = getIssuerPrincipal(r11)     // Catch:{ IOException -> 0x03d2 }
            byte[] r14 = r14.getEncoded()     // Catch:{ IOException -> 0x03d2 }
            r12.addIssuerName(r14)     // Catch:{ IOException -> 0x03d2 }
            org.bouncycastle.asn1.ASN1Integer r5 = (org.bouncycastle.asn1.ASN1Integer) r5
            java.math.BigInteger r5 = r5.getPositiveValue()
            r12.setMinCRLNumber(r5)
            java.lang.String r5 = CRL_NUMBER     // Catch:{ AnnotatedException -> 0x03c4 }
            org.bouncycastle.asn1.ASN1Primitive r5 = getExtensionValue(r11, r5)     // Catch:{ AnnotatedException -> 0x03c4 }
            org.bouncycastle.asn1.ASN1Integer r5 = (org.bouncycastle.asn1.ASN1Integer) r5     // Catch:{ AnnotatedException -> 0x03c4 }
            java.math.BigInteger r5 = r5.getPositiveValue()     // Catch:{ AnnotatedException -> 0x03c4 }
            r14 = 1
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r14)     // Catch:{ AnnotatedException -> 0x03c4 }
            java.math.BigInteger r5 = r5.subtract(r8)     // Catch:{ AnnotatedException -> 0x03c4 }
            r12.setMaxCRLNumber(r5)     // Catch:{ AnnotatedException -> 0x03c4 }
            org.bouncycastle.x509.PKIXCRLUtil r5 = CRL_UTIL     // Catch:{ AnnotatedException -> 0x03b8 }
            java.util.Set r2 = r5.findCRLs((org.bouncycastle.x509.X509CRLStoreSelector) r12, (java.security.cert.PKIXParameters) r2)     // Catch:{ AnnotatedException -> 0x03b8 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ AnnotatedException -> 0x03b8 }
        L_0x037c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x03a7
            java.lang.Object r5 = r2.next()
            java.security.cert.X509CRL r5 = (java.security.cert.X509CRL) r5
            java.lang.String r7 = ISSUING_DISTRIBUTION_POINT     // Catch:{ AnnotatedException -> 0x039b }
            org.bouncycastle.asn1.ASN1Primitive r5 = getExtensionValue(r5, r7)     // Catch:{ AnnotatedException -> 0x039b }
            if (r0 != 0) goto L_0x0393
            if (r5 != 0) goto L_0x037c
            goto L_0x0399
        L_0x0393:
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x037c
        L_0x0399:
            r12 = r4
            goto L_0x03a8
        L_0x039b:
            r0 = move-exception
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r3 = new org.bouncycastle.i18n.ErrorBundle
            r3.<init>(r9, r6)
            r2.<init>(r3, r0)
            throw r2
        L_0x03a7:
            r12 = r13
        L_0x03a8:
            if (r12 == 0) goto L_0x03ab
            goto L_0x03de
        L_0x03ab:
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r3 = "CertPathReviewer.noBaseCRL"
            r2.<init>(r9, r3)
            r0.<init>(r2)
            throw r0
        L_0x03b8:
            r0 = move-exception
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r3 = new org.bouncycastle.i18n.ErrorBundle
            r3.<init>(r9, r7)
            r2.<init>(r3, r0)
            throw r2
        L_0x03c4:
            r0 = move-exception
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r3 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r4 = "CertPathReviewer.crlNbrExtError"
            r3.<init>(r9, r4)
            r2.<init>(r3, r0)
            throw r2
        L_0x03d2:
            r0 = move-exception
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r3 = new org.bouncycastle.i18n.ErrorBundle
            r3.<init>(r9, r8)
            r2.<init>(r3, r0)
            throw r2
        L_0x03de:
            if (r0 == 0) goto L_0x047b
            org.bouncycastle.asn1.x509.IssuingDistributionPoint r0 = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(r0)
            java.lang.String r2 = BASIC_CONSTRAINTS     // Catch:{ AnnotatedException -> 0x043a }
            org.bouncycastle.asn1.ASN1Primitive r2 = getExtensionValue(r3, r2)     // Catch:{ AnnotatedException -> 0x043a }
            org.bouncycastle.asn1.x509.BasicConstraints r2 = org.bouncycastle.asn1.x509.BasicConstraints.getInstance(r2)     // Catch:{ AnnotatedException -> 0x043a }
            boolean r3 = r0.onlyContainsUserCerts()
            if (r3 == 0) goto L_0x040a
            if (r2 == 0) goto L_0x040a
            boolean r3 = r2.isCA()
            if (r3 != 0) goto L_0x03fd
            goto L_0x040a
        L_0x03fd:
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r3 = "CertPathReviewer.crlOnlyUserCert"
            r2.<init>(r9, r3)
            r0.<init>(r2)
            throw r0
        L_0x040a:
            boolean r3 = r0.onlyContainsCACerts()
            if (r3 == 0) goto L_0x0426
            if (r2 == 0) goto L_0x0419
            boolean r2 = r2.isCA()
            if (r2 == 0) goto L_0x0419
            goto L_0x0426
        L_0x0419:
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r3 = "CertPathReviewer.crlOnlyCaCert"
            r2.<init>(r9, r3)
            r0.<init>(r2)
            throw r0
        L_0x0426:
            boolean r0 = r0.onlyContainsAttributeCerts()
            if (r0 != 0) goto L_0x042d
            goto L_0x047b
        L_0x042d:
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r3 = "CertPathReviewer.crlOnlyAttrCert"
            r2.<init>(r9, r3)
            r0.<init>(r2)
            throw r0
        L_0x043a:
            r0 = move-exception
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r3 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r4 = "CertPathReviewer.crlBCExtError"
            r3.<init>(r9, r4)
            r2.<init>(r3, r0)
            throw r2
        L_0x0448:
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r3 = "CertPathReviewer.deltaCrlExtError"
            r2.<init>(r9, r3)
            r0.<init>(r2)
            throw r0
        L_0x0455:
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            r2.<init>(r9, r6)
            r0.<init>(r2)
            throw r0
        L_0x0460:
            r0 = move-exception
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r3 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r4 = "CertPathReviewer.crlVerifyFailed"
            r3.<init>(r9, r4)
            r2.<init>(r3, r0)
            throw r2
        L_0x046e:
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r3 = "CertPathReviewer.crlNoIssuerPublicKey"
            r2.<init>(r9, r3)
            r0.<init>(r2)
            throw r0
        L_0x047b:
            if (r10 == 0) goto L_0x047e
            return
        L_0x047e:
            org.bouncycastle.x509.CertPathReviewerException r0 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r2 = new org.bouncycastle.i18n.ErrorBundle
            java.lang.String r3 = "CertPathReviewer.noValidCrlFound"
            r2.<init>(r9, r3)
            r0.<init>(r2)
            throw r0
        L_0x048b:
            r0 = move-exception
            org.bouncycastle.x509.CertPathReviewerException r2 = new org.bouncycastle.x509.CertPathReviewerException
            org.bouncycastle.i18n.ErrorBundle r3 = new org.bouncycastle.i18n.ErrorBundle
            r3.<init>(r9, r8)
            r2.<init>(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkCRLs(java.security.cert.PKIXParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.Vector, int):void");
    }

    /* access modifiers changed from: protected */
    public void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i) throws CertPathReviewerException {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i);
    }

    /* access modifiers changed from: protected */
    public void doChecks() {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        } else if (this.notifications == null) {
            int i = this.f6380n + 1;
            this.notifications = new List[i];
            this.errors = new List[i];
            int i2 = 0;
            while (true) {
                List[] listArr = this.notifications;
                if (i2 < listArr.length) {
                    listArr[i2] = new ArrayList();
                    this.errors[i2] = new ArrayList();
                    i2++;
                } else {
                    checkSignatures();
                    checkNameConstraints();
                    checkPathLength();
                    checkPolicy();
                    checkCriticalExtensions();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
            for (DistributionPoint distributionPoint : distributionPoints) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].getTagNo() == 6) {
                            vector.add(((DERIA5String) names[i].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.f6380n;
    }

    public List getErrors(int i) {
        doChecks();
        return this.errors[i + 1];
    }

    public List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public List getNotifications(int i) {
        doChecks();
        return this.notifications[i + 1];
    }

    public List[] getNotifications() {
        doChecks();
        return this.notifications;
    }

    /* access modifiers changed from: protected */
    public Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i = 0; i < accessDescriptions.length; i++) {
                if (accessDescriptions[i].getAccessMethod().equals(AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((DERIA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    /* access modifiers changed from: protected */
    public Collection getTrustAnchors(X509Certificate x509Certificate, Set set) throws CertPathReviewerException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(X509Extensions.AuthorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier instance = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                x509CertSelector.setSerialNumber(instance.getAuthorityCertSerialNumber());
                byte[] keyIdentifier = instance.getKeyIdentifier();
                if (keyIdentifier != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor2 = (TrustAnchor) it.next();
                if (trustAnchor2.getTrustedCert() != null) {
                    if (!x509CertSelector.match(trustAnchor2.getTrustedCert())) {
                    }
                } else if (trustAnchor2.getCAName() != null) {
                    if (trustAnchor2.getCAPublicKey() != null) {
                        if (!getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor2.getCAName()))) {
                        }
                    }
                }
                arrayList.add(trustAnchor2);
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath2, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (!this.initialized) {
            this.initialized = true;
            if (certPath2 != null) {
                this.certPath = certPath2;
                List<? extends Certificate> certificates = certPath2.getCertificates();
                this.certs = certificates;
                this.f6380n = certificates.size();
                if (!this.certs.isEmpty()) {
                    PKIXParameters pKIXParameters2 = (PKIXParameters) pKIXParameters.clone();
                    this.pkixParams = pKIXParameters2;
                    this.validDate = getValidDate(pKIXParameters2);
                    this.notifications = null;
                    this.errors = null;
                    this.trustAnchor = null;
                    this.subjectPublicKey = null;
                    this.policyTree = null;
                    return;
                }
                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.emptyCertPath"));
            }
            throw new NullPointerException("certPath was null");
        }
        throw new IllegalStateException("object is already initialized!");
    }

    public boolean isValidCertPath() {
        doChecks();
        int i = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i >= listArr.length) {
                return true;
            }
            if (!listArr[i].isEmpty()) {
                return false;
            }
            i++;
        }
    }
}
