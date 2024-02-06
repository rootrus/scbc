package p040o;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreSpi;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: o.SmeLoanDetailPnItemAdapter$GroupItemViewHolder_ViewBinding */
public class SmeLoanDetailPnItemAdapter$GroupItemViewHolder_ViewBinding extends CertStoreSpi {
    private static String IconCompatParcelizer = "com.sun.jndi.ldap.LdapCtxFactory";
    private static String write = "ignore";

    private static String IconCompatParcelizer(String str, String str2) {
        int i;
        String substring = str.substring(str.toLowerCase().indexOf(str2.toLowerCase()) + str2.length());
        int indexOf = substring.indexOf(44);
        if (indexOf == -1) {
            indexOf = substring.length();
        }
        while (substring.charAt(i - 1) == '\\') {
            i = substring.indexOf(44, i + 1);
            if (i == -1) {
                i = substring.length();
            }
        }
        String substring2 = substring.substring(0, i);
        String substring3 = substring2.substring(substring2.indexOf(61) + 1);
        if (substring3.charAt(0) == ' ') {
            substring3 = substring3.substring(1);
        }
        if (substring3.startsWith("\"")) {
            substring3 = substring3.substring(1);
        }
        return substring3.endsWith("\"") ? substring3.substring(0, substring3.length() - 1) : substring3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:18|19|20|(2:22|(1:24)(3:52|25|26))(1:27)|28|(1:30)|31|(1:33)|34|35|(6:39|40|41|(2:43|58)(1:57)|56|36)|55) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00c2 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc A[Catch:{ Exception -> 0x00e6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection engineGetCertificates(java.security.cert.CertSelector r8) throws java.security.cert.CertStoreException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof java.security.cert.X509CertSelector
            if (r0 == 0) goto L_0x00fe
            java.security.cert.X509CertSelector r8 = (java.security.cert.X509CertSelector) r8
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[]{r1}
            java.util.Set r2 = r7.MediaBrowserCompat$ItemReceiver(r8, r2, r1, r1)
            java.lang.String[] r3 = new java.lang.String[]{r1}
            java.util.Set r4 = r7.MediaBrowserCompat$ItemReceiver(r8, r3, r1, r1)
            boolean r5 = r4.isEmpty()
            java.lang.String r6 = "*"
            if (r5 == 0) goto L_0x002b
            java.util.Set r3 = r7.write(r1, r6, r3)
            r4.addAll(r3)
        L_0x002b:
            r2.addAll(r4)
            java.lang.String[] r3 = new java.lang.String[]{r1}
            java.util.Set r4 = r7.MediaBrowserCompat$ItemReceiver(r8, r3, r1, r1)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0043
            java.util.Set r1 = r7.write(r1, r6, r3)
            r4.addAll(r1)
        L_0x0043:
            r2.addAll(r4)
            java.util.Iterator r1 = r2.iterator()
            java.lang.String r2 = "X.509"
            java.lang.String r3 = "SC"
            java.security.cert.CertificateFactory r2 = java.security.cert.CertificateFactory.getInstance(r2, r3)     // Catch:{ Exception -> 0x00e6 }
        L_0x0052:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x00e6 }
            if (r3 == 0) goto L_0x00e5
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x00e6 }
            byte[] r3 = (byte[]) r3     // Catch:{ Exception -> 0x00e6 }
            if (r3 == 0) goto L_0x0052
            int r4 = r3.length     // Catch:{ Exception -> 0x00e6 }
            if (r4 != 0) goto L_0x0064
            goto L_0x0052
        L_0x0064:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e6 }
            r4.<init>()     // Catch:{ Exception -> 0x00e6 }
            r4.add(r3)     // Catch:{ Exception -> 0x00e6 }
            o.CompanyItemViewHolder r5 = new o.CompanyItemViewHolder     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            r5.<init>((byte[]) r3)     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r3 = r5.MediaBrowserCompat$ItemReceiver()     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            if (r3 == 0) goto L_0x00a2
            boolean r5 = r3 instanceof p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            if (r5 == 0) goto L_0x0083
            o.FundSourceListAdapter$FundSourceHolder_ViewBinding r5 = new o.FundSourceListAdapter$FundSourceHolder_ViewBinding     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r3 = (p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) r3     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            r5.<init>(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            goto L_0x00a5
        L_0x0083:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            r5.<init>()     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            java.lang.String r6 = "illegal object in getInstance: "
            r5.append(r6)     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            java.lang.Class r3 = r3.getClass()     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            java.lang.String r3 = r3.getName()     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            r5.append(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            r3.<init>(r5)     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            throw r3     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
        L_0x00a2:
            r5 = r3
            o.FundSourceListAdapter$FundSourceHolder_ViewBinding r5 = (p040o.FundSourceListAdapter$FundSourceHolder_ViewBinding) r5     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
        L_0x00a5:
            r4.clear()     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            o.FundAccountPagerAdapter$ItemViewHolder r3 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            if (r3 == 0) goto L_0x00b5
            o.FundAccountPagerAdapter$ItemViewHolder r3 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            byte[] r3 = r3.ParcelableVolumeInfo()     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            r4.add(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
        L_0x00b5:
            o.FundAccountPagerAdapter$ItemViewHolder r3 = r5.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            if (r3 == 0) goto L_0x00c2
            o.FundAccountPagerAdapter$ItemViewHolder r3 = r5.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            byte[] r3 = r3.ParcelableVolumeInfo()     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
            r4.add(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x00c2 }
        L_0x00c2:
            java.util.Iterator r3 = r4.iterator()     // Catch:{ Exception -> 0x00e6 }
        L_0x00c6:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00e6 }
            if (r4 == 0) goto L_0x0052
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r5 = r3.next()     // Catch:{ Exception -> 0x00e6 }
            byte[] r5 = (byte[]) r5     // Catch:{ Exception -> 0x00e6 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00e6 }
            java.security.cert.Certificate r4 = r2.generateCertificate(r4)     // Catch:{ Exception -> 0x00c6 }
            boolean r5 = r8.match(r4)     // Catch:{ Exception -> 0x00c6 }
            if (r5 == 0) goto L_0x00c6
            r0.add(r4)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00c6
        L_0x00e5:
            return r0
        L_0x00e6:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "certificate cannot be constructed from LDAP result: "
            r0.append(r1)
            r0.append(r8)
            java.security.cert.CertStoreException r8 = new java.security.cert.CertStoreException
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x00fe:
            java.security.cert.CertStoreException r8 = new java.security.cert.CertStoreException
            java.lang.String r0 = "selector is not a X509CertSelector"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SmeLoanDetailPnItemAdapter$GroupItemViewHolder_ViewBinding.engineGetCertificates(java.security.cert.CertSelector):java.util.Collection");
    }

    private Set MediaBrowserCompat$ItemReceiver(X509CertSelector x509CertSelector, String[] strArr, String str, String str2) throws CertStoreException {
        String str3;
        String str4;
        HashSet hashSet = new HashSet();
        try {
            if (x509CertSelector.getSubjectAsBytes() == null) {
                if (x509CertSelector.getSubjectAsString() == null) {
                    if (x509CertSelector.getCertificate() == null) {
                        hashSet.addAll(write(str, "*", strArr));
                        return hashSet;
                    }
                }
            }
            if (x509CertSelector.getCertificate() != null) {
                str3 = x509CertSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
                x509CertSelector.getCertificate().getSerialNumber();
            } else {
                if (x509CertSelector.getSubjectAsBytes() != null) {
                    str4 = new X500Principal(x509CertSelector.getSubjectAsBytes()).getName("RFC1779");
                } else {
                    str4 = x509CertSelector.getSubjectAsString();
                }
                str3 = str4;
            }
            String IconCompatParcelizer2 = IconCompatParcelizer(str3, str2);
            StringBuilder sb = new StringBuilder();
            sb.append("*");
            sb.append(IconCompatParcelizer2);
            sb.append("*");
            hashSet.addAll(write(str, sb.toString(), strArr));
            return hashSet;
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("exception processing selector: ");
            sb2.append(e);
            throw new CertStoreException(sb2.toString());
        }
    }

    public Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        String str;
        String[] strArr = {null};
        if (cRLSelector instanceof X509CRLSelector) {
            X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
            HashSet hashSet = new HashSet();
            HashSet<byte[]> hashSet2 = new HashSet<>();
            if (x509CRLSelector.getIssuerNames() != null) {
                for (Object next : x509CRLSelector.getIssuerNames()) {
                    if (next instanceof String) {
                        str = IconCompatParcelizer((String) next, (String) null);
                    } else {
                        str = IconCompatParcelizer(new X500Principal((byte[]) next).getName("RFC1779"), (String) null);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("*");
                    sb.append(str);
                    sb.append("*");
                    hashSet2.addAll(write((String) null, sb.toString(), strArr));
                }
            } else {
                hashSet2.addAll(write((String) null, "*", strArr));
            }
            hashSet2.addAll(write((String) null, "*", strArr));
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509", "SC");
                for (byte[] byteArrayInputStream : hashSet2) {
                    CRL generateCRL = instance.generateCRL(new ByteArrayInputStream(byteArrayInputStream));
                    if (x509CRLSelector.match(generateCRL)) {
                        hashSet.add(generateCRL);
                    }
                }
                return hashSet;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CRL cannot be constructed from LDAP result ");
                sb2.append(e);
                throw new CertStoreException(sb2.toString());
            }
        } else {
            throw new CertStoreException("selector is not a X509CRLSelector");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ff A[SYNTHETIC, Splitter:B:35:0x00ff] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Set write(java.lang.String r9, java.lang.String r10, java.lang.String[] r11) throws java.security.cert.CertStoreException {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r1 = "="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r0 = 0
            if (r9 != 0) goto L_0x0018
            r10 = r0
        L_0x0018:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.Properties r1 = new java.util.Properties     // Catch:{ Exception -> 0x00e5 }
            r1.<init>()     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r2 = "java.naming.factory.initial"
            java.lang.String r3 = IconCompatParcelizer     // Catch:{ Exception -> 0x00e5 }
            r1.setProperty(r2, r3)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r2 = "java.naming.batchsize"
            java.lang.String r3 = "0"
            r1.setProperty(r2, r3)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r2 = "java.naming.provider.url"
            r1.setProperty(r2, r0)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r2 = "java.naming.factory.url.pkgs"
            java.lang.String r3 = "com.sun.jndi.url"
            r1.setProperty(r2, r3)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r2 = "java.naming.referral"
            java.lang.String r3 = write     // Catch:{ Exception -> 0x00e5 }
            r1.setProperty(r2, r3)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r2 = "java.naming.security.authentication"
            java.lang.String r3 = "none"
            r1.setProperty(r2, r3)     // Catch:{ Exception -> 0x00e5 }
            javax.naming.directory.InitialDirContext r2 = new javax.naming.directory.InitialDirContext     // Catch:{ Exception -> 0x00e5 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00e5 }
            javax.naming.directory.SearchControls r1 = new javax.naming.directory.SearchControls     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r1.<init>()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r3 = 2
            r1.setSearchScope(r3)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r3 = 0
            r1.setCountLimit(r3)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r3 = 0
            r4 = r3
        L_0x005f:
            int r5 = r11.length     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            if (r4 >= r5) goto L_0x00d9
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r6 = r11[r4]     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r5[r3] = r6     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r1.setReturningAttributes(r5)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r6.<init>()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.lang.String r7 = "(&("
            r6.append(r7)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r6.append(r10)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.lang.String r7 = ")("
            r6.append(r7)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r7 = r5[r3]     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r6.append(r7)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.lang.String r7 = "=*))"
            r6.append(r7)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            if (r10 != 0) goto L_0x00a6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r6.<init>()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.lang.String r7 = "("
            r6.append(r7)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r5 = r5[r3]     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r6.append(r5)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.lang.String r5 = "=*)"
            r6.append(r5)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
        L_0x00a6:
            javax.naming.NamingEnumeration r5 = r2.search(r0, r6, r1)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
        L_0x00aa:
            boolean r6 = r5.hasMoreElements()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            if (r6 == 0) goto L_0x00d6
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            javax.naming.directory.SearchResult r6 = (javax.naming.directory.SearchResult) r6     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            javax.naming.directory.Attributes r6 = r6.getAttributes()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            javax.naming.NamingEnumeration r6 = r6.getAll()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.lang.Object r6 = r6.next()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            javax.naming.directory.Attribute r6 = (javax.naming.directory.Attribute) r6     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            javax.naming.NamingEnumeration r6 = r6.getAll()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
        L_0x00c8:
            boolean r7 = r6.hasMore()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            if (r7 == 0) goto L_0x00aa
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r9.add(r7)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            goto L_0x00c8
        L_0x00d6:
            int r4 = r4 + 1
            goto L_0x005f
        L_0x00d9:
            r2.close()     // Catch:{ Exception -> 0x00dc }
        L_0x00dc:
            return r9
        L_0x00dd:
            r9 = move-exception
            r0 = r2
            goto L_0x00fd
        L_0x00e0:
            r9 = move-exception
            r0 = r2
            goto L_0x00e6
        L_0x00e3:
            r9 = move-exception
            goto L_0x00fd
        L_0x00e5:
            r9 = move-exception
        L_0x00e6:
            java.security.cert.CertStoreException r10 = new java.security.cert.CertStoreException     // Catch:{ all -> 0x00e3 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r11.<init>()     // Catch:{ all -> 0x00e3 }
            java.lang.String r1 = "Error getting results from LDAP directory "
            r11.append(r1)     // Catch:{ all -> 0x00e3 }
            r11.append(r9)     // Catch:{ all -> 0x00e3 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x00e3 }
            r10.<init>(r9)     // Catch:{ all -> 0x00e3 }
            throw r10     // Catch:{ all -> 0x00e3 }
        L_0x00fd:
            if (r0 == 0) goto L_0x0102
            r0.close()     // Catch:{ Exception -> 0x0102 }
        L_0x0102:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SmeLoanDetailPnItemAdapter$GroupItemViewHolder_ViewBinding.write(java.lang.String, java.lang.String, java.lang.String[]):java.util.Set");
    }
}
