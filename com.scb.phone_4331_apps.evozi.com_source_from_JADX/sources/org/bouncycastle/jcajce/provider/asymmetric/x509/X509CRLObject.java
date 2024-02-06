package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.X509Principal;

class X509CRLObject extends X509CRL {
    private JcaJceHelper bcHelper;

    /* renamed from: c */
    private CertificateList f3216c;
    private int hashCodeValue;
    private boolean isHashCodeSet = false;
    private boolean isIndirect;
    private String sigAlgName;
    private byte[] sigAlgParams;

    protected X509CRLObject(JcaJceHelper jcaJceHelper, CertificateList certificateList) throws CRLException {
        this.bcHelper = jcaJceHelper;
        this.f3216c = certificateList;
        try {
            this.sigAlgName = X509SignatureUtil.getSignatureName(certificateList.getSignatureAlgorithm());
            if (certificateList.getSignatureAlgorithm().getParameters() != null) {
                this.sigAlgParams = certificateList.getSignatureAlgorithm().getParameters().toASN1Primitive().getEncoded(ASN1Encoding.DER);
            } else {
                this.sigAlgParams = null;
            }
            this.isIndirect = isIndirectCRL(this);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("CRL contents invalid: ");
            sb.append(e);
            throw new CRLException(sb.toString());
        }
    }

    private void doVerify(PublicKey publicKey, Signature signature) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        if (this.f3216c.getSignatureAlgorithm().equals(this.f3216c.getTBSCertList().getSignature())) {
            signature.initVerify(publicKey);
            signature.update(getTBSCertList());
            if (!signature.verify(getSignature())) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
            return;
        }
        throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
    }

    private Set getExtensionOIDs(boolean z) {
        Extensions extensions;
        if (getVersion() != 2 || (extensions = this.f3216c.getTBSCertList().getExtensions()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) oids.nextElement();
            if (z == extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    static boolean isIndirectCRL(X509CRL x509crl) throws CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(Extension.issuingDistributionPoint.getId());
            return extensionValue != null && IssuingDistributionPoint.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).isIndirectCRL();
        } catch (Exception e) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    private Set loadCRLEntries() {
        Extension extension;
        HashSet hashSet = new HashSet();
        Enumeration revokedCertificateEnumeration = this.f3216c.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            hashSet.add(new X509CRLEntryObject(cRLEntry, this.isIndirect, x500Name));
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof X509CRLObject)) {
            return super.equals(obj);
        }
        X509CRLObject x509CRLObject = (X509CRLObject) obj;
        if (!this.isHashCodeSet || !x509CRLObject.isHashCodeSet || x509CRLObject.hashCodeValue == this.hashCodeValue) {
            return this.f3216c.equals(x509CRLObject.f3216c);
        }
        return false;
    }

    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    public byte[] getEncoded() throws CRLException {
        try {
            return this.f3216c.getEncoded(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public byte[] getExtensionValue(String str) {
        Extension extension;
        Extensions extensions = this.f3216c.getTBSCertList().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("error parsing ");
            sb.append(e.toString());
            throw new IllegalStateException(sb.toString());
        }
    }

    public Principal getIssuerDN() {
        return new X509Principal(X500Name.getInstance(this.f3216c.getIssuer().toASN1Primitive()));
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f3216c.getIssuer().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public Date getNextUpdate() {
        if (this.f3216c.getNextUpdate() != null) {
            return this.f3216c.getNextUpdate().getDate();
        }
        return null;
    }

    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Extension extension;
        Enumeration revokedCertificateEnumeration = this.f3216c.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            if (bigInteger.equals(cRLEntry.getUserCertificate().getValue())) {
                return new X509CRLEntryObject(cRLEntry, this.isIndirect, x500Name);
            }
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return null;
    }

    public Set getRevokedCertificates() {
        Set loadCRLEntries = loadCRLEntries();
        if (!loadCRLEntries.isEmpty()) {
            return Collections.unmodifiableSet(loadCRLEntries);
        }
        return null;
    }

    public String getSigAlgName() {
        return this.sigAlgName;
    }

    public String getSigAlgOID() {
        return this.f3216c.getSignatureAlgorithm().getAlgorithm().getId();
    }

    public byte[] getSigAlgParams() {
        byte[] bArr = this.sigAlgParams;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public byte[] getSignature() {
        return this.f3216c.getSignature().getOctets();
    }

    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.f3216c.getTBSCertList().getEncoded(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Date getThisUpdate() {
        return this.f3216c.getThisUpdate().getDate();
    }

    public int getVersion() {
        return this.f3216c.getVersionNumber();
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(Extension.issuingDistributionPoint.getId());
        criticalExtensionOIDs.remove(Extension.deltaCRLIndicator.getId());
        return !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        if (!this.isHashCodeSet) {
            this.isHashCodeSet = true;
            this.hashCodeValue = super.hashCode();
        }
        return this.hashCodeValue;
    }

    public boolean isRevoked(Certificate certificate) {
        X500Name x500Name;
        Extension extension;
        if (certificate.getType().equals("X.509")) {
            Enumeration revokedCertificateEnumeration = this.f3216c.getRevokedCertificateEnumeration();
            X500Name issuer = this.f3216c.getIssuer();
            if (revokedCertificateEnumeration.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (revokedCertificateEnumeration.hasMoreElements()) {
                    TBSCertList.CRLEntry instance = TBSCertList.CRLEntry.getInstance(revokedCertificateEnumeration.nextElement());
                    if (this.isIndirect && instance.hasExtensions() && (extension = instance.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                        issuer = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
                    }
                    if (instance.getUserCertificate().getValue().equals(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            x500Name = X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                x500Name = org.bouncycastle.asn1.x509.Certificate.getInstance(certificate.getEncoded()).getIssuer();
                            } catch (CertificateEncodingException e) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Cannot process certificate: ");
                                sb.append(e.getMessage());
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                        return issuer.equals(x500Name);
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.lang.String r0 = " value = "
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = org.bouncycastle.util.Strings.lineSeparator()
            java.lang.String r3 = "              Version: "
            r1.append(r3)
            int r3 = r11.getVersion()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "             IssuerDN: "
            r1.append(r3)
            java.security.Principal r3 = r11.getIssuerDN()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "          This update: "
            r1.append(r3)
            java.util.Date r3 = r11.getThisUpdate()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "          Next update: "
            r1.append(r3)
            java.util.Date r3 = r11.getNextUpdate()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = "  Signature Algorithm: "
            r1.append(r3)
            java.lang.String r3 = r11.getSigAlgName()
            r1.append(r3)
            r1.append(r2)
            byte[] r3 = r11.getSignature()
            java.lang.String r4 = "            Signature: "
            r1.append(r4)
            java.lang.String r4 = new java.lang.String
            r5 = 20
            r6 = 0
            byte[] r6 = org.bouncycastle.util.encoders.Hex.encode(r3, r6, r5)
            r4.<init>(r6)
            r1.append(r4)
            r1.append(r2)
            r4 = r5
        L_0x0072:
            int r6 = r3.length
            if (r4 >= r6) goto L_0x009c
            int r6 = r3.length
            java.lang.String r7 = "                       "
            r1.append(r7)
            int r6 = r6 - r5
            if (r4 >= r6) goto L_0x0088
            java.lang.String r6 = new java.lang.String
            byte[] r7 = org.bouncycastle.util.encoders.Hex.encode(r3, r4, r5)
            r6.<init>(r7)
            goto L_0x0093
        L_0x0088:
            java.lang.String r6 = new java.lang.String
            int r7 = r3.length
            int r7 = r7 - r4
            byte[] r7 = org.bouncycastle.util.encoders.Hex.encode(r3, r4, r7)
            r6.<init>(r7)
        L_0x0093:
            r1.append(r6)
            r1.append(r2)
            int r4 = r4 + 20
            goto L_0x0072
        L_0x009c:
            org.bouncycastle.asn1.x509.CertificateList r3 = r11.f3216c
            org.bouncycastle.asn1.x509.TBSCertList r3 = r3.getTBSCertList()
            org.bouncycastle.asn1.x509.Extensions r3 = r3.getExtensions()
            if (r3 == 0) goto L_0x0192
            java.util.Enumeration r4 = r3.oids()
            boolean r5 = r4.hasMoreElements()
            if (r5 == 0) goto L_0x00b7
            java.lang.String r5 = "           Extensions: "
            r6 = r11
            goto L_0x0189
        L_0x00b7:
            r5 = r11
        L_0x00b8:
            boolean r6 = r4.hasMoreElements()
            if (r6 == 0) goto L_0x0193
            java.lang.Object r6 = r4.nextElement()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r6 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r6
            org.bouncycastle.asn1.x509.Extension r7 = r3.getExtension(r6)
            org.bouncycastle.asn1.ASN1OctetString r8 = r7.getExtnValue()
            if (r8 == 0) goto L_0x018d
            org.bouncycastle.asn1.ASN1InputStream r8 = new org.bouncycastle.asn1.ASN1InputStream
            org.bouncycastle.asn1.ASN1OctetString r9 = r7.getExtnValue()
            byte[] r9 = r9.getOctets()
            r8.<init>((byte[]) r9)
            java.lang.String r9 = "                       critical("
            r1.append(r9)
            boolean r7 = r7.isCritical()
            r1.append(r7)
            java.lang.String r7 = ") "
            r1.append(r7)
            org.bouncycastle.asn1.ASN1ObjectIdentifier r7 = org.bouncycastle.asn1.x509.Extension.cRLNumber     // Catch:{ Exception -> 0x017a }
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x017a }
            if (r7 == 0) goto L_0x0106
            org.bouncycastle.asn1.x509.CRLNumber r7 = new org.bouncycastle.asn1.x509.CRLNumber     // Catch:{ Exception -> 0x017a }
            org.bouncycastle.asn1.ASN1Primitive r8 = r8.readObject()     // Catch:{ Exception -> 0x017a }
            org.bouncycastle.asn1.ASN1Integer r8 = org.bouncycastle.asn1.ASN1Integer.getInstance(r8)     // Catch:{ Exception -> 0x017a }
            java.math.BigInteger r8 = r8.getPositiveValue()     // Catch:{ Exception -> 0x017a }
            r7.<init>(r8)     // Catch:{ Exception -> 0x017a }
            goto L_0x015c
        L_0x0106:
            org.bouncycastle.asn1.ASN1ObjectIdentifier r7 = org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator     // Catch:{ Exception -> 0x017a }
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x017a }
            if (r7 == 0) goto L_0x0131
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017a }
            r7.<init>()     // Catch:{ Exception -> 0x017a }
            java.lang.String r9 = "Base CRL: "
            r7.append(r9)     // Catch:{ Exception -> 0x017a }
            org.bouncycastle.asn1.x509.CRLNumber r9 = new org.bouncycastle.asn1.x509.CRLNumber     // Catch:{ Exception -> 0x017a }
            org.bouncycastle.asn1.ASN1Primitive r8 = r8.readObject()     // Catch:{ Exception -> 0x017a }
            org.bouncycastle.asn1.ASN1Integer r8 = org.bouncycastle.asn1.ASN1Integer.getInstance(r8)     // Catch:{ Exception -> 0x017a }
            java.math.BigInteger r8 = r8.getPositiveValue()     // Catch:{ Exception -> 0x017a }
            r9.<init>(r8)     // Catch:{ Exception -> 0x017a }
            r7.append(r9)     // Catch:{ Exception -> 0x017a }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x017a }
            goto L_0x0172
        L_0x0131:
            org.bouncycastle.asn1.ASN1ObjectIdentifier r7 = org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint     // Catch:{ Exception -> 0x017a }
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x017a }
            if (r7 == 0) goto L_0x0142
            org.bouncycastle.asn1.ASN1Primitive r7 = r8.readObject()     // Catch:{ Exception -> 0x017a }
            org.bouncycastle.asn1.x509.IssuingDistributionPoint r7 = org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(r7)     // Catch:{ Exception -> 0x017a }
            goto L_0x015c
        L_0x0142:
            org.bouncycastle.asn1.ASN1ObjectIdentifier r7 = org.bouncycastle.asn1.x509.Extension.cRLDistributionPoints     // Catch:{ Exception -> 0x017a }
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x017a }
            if (r7 == 0) goto L_0x0153
        L_0x014a:
            org.bouncycastle.asn1.ASN1Primitive r7 = r8.readObject()     // Catch:{ Exception -> 0x017a }
            org.bouncycastle.asn1.x509.CRLDistPoint r7 = org.bouncycastle.asn1.x509.CRLDistPoint.getInstance(r7)     // Catch:{ Exception -> 0x017a }
            goto L_0x015c
        L_0x0153:
            org.bouncycastle.asn1.ASN1ObjectIdentifier r7 = org.bouncycastle.asn1.x509.Extension.freshestCRL     // Catch:{ Exception -> 0x017a }
            boolean r7 = r6.equals(r7)     // Catch:{ Exception -> 0x017a }
            if (r7 == 0) goto L_0x0160
            goto L_0x014a
        L_0x015c:
            r1.append(r7)     // Catch:{ Exception -> 0x017a }
            goto L_0x0175
        L_0x0160:
            java.lang.String r7 = r6.getId()     // Catch:{ Exception -> 0x017a }
            r1.append(r7)     // Catch:{ Exception -> 0x017a }
            r1.append(r0)     // Catch:{ Exception -> 0x017a }
            org.bouncycastle.asn1.ASN1Primitive r7 = r8.readObject()     // Catch:{ Exception -> 0x017a }
            java.lang.String r7 = org.bouncycastle.asn1.util.ASN1Dump.dumpAsString(r7)     // Catch:{ Exception -> 0x017a }
        L_0x0172:
            r1.append(r7)     // Catch:{ Exception -> 0x017a }
        L_0x0175:
            r1.append(r2)     // Catch:{ Exception -> 0x017a }
            goto L_0x00b8
        L_0x017a:
            java.lang.String r6 = r6.getId()
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = "*****"
            r10 = r6
            r6 = r5
            r5 = r10
        L_0x0189:
            r1.append(r5)
            r5 = r6
        L_0x018d:
            r1.append(r2)
            goto L_0x00b8
        L_0x0192:
            r5 = r11
        L_0x0193:
            java.util.Set r0 = r5.getRevokedCertificates()
            if (r0 == 0) goto L_0x01ae
            java.util.Iterator r0 = r0.iterator()
        L_0x019d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01ae
            java.lang.Object r3 = r0.next()
            r1.append(r3)
            r1.append(r2)
            goto L_0x019d
        L_0x01ae:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLObject.toString():java.lang.String");
    }

    public void verify(PublicKey publicKey) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        try {
            signature = this.bcHelper.createSignature(getSigAlgName());
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        doVerify(publicKey, signature);
    }

    public void verify(PublicKey publicKey, String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        doVerify(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    public void verify(PublicKey publicKey, Provider provider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        doVerify(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }
}
