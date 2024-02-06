package p040o;

import java.io.IOException;
import java.math.BigInteger;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;

/* renamed from: o.NotificationAdapter$NotificationHolder */
public final class NotificationAdapter$NotificationHolder implements CertSelector, BankAccountAdapter$BankAccountViewHolder {
    private HmlAboutAdapter$HmlAboutViewHolder_ViewBinding IconCompatParcelizer;

    private NotificationAdapter$NotificationHolder(LtfSummaryAdapter$LtfChildViewHolder_ViewBinding ltfSummaryAdapter$LtfChildViewHolder_ViewBinding) {
        this.IconCompatParcelizer = ltfSummaryAdapter$LtfChildViewHolder_ViewBinding.read;
    }

    private Object[] MediaBrowserCompat$CustomActionResultReceiver() {
        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = this.IconCompatParcelizer;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding instanceof C10427x422b304e) {
            accountDetailsAdapter$ItemViewHolder = ((C10427x422b304e) hmlAboutAdapter$HmlAboutViewHolder_ViewBinding).write;
        } else {
            accountDetailsAdapter$ItemViewHolder = (AccountDetailsAdapter$ItemViewHolder) hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
        }
        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = accountDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
        int length = creditCardDetailsAdapter$ItemViewHolderArr.length;
        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[length];
        System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i != length; i++) {
            if (creditCardDetailsAdapter$ItemViewHolderArr2[i].IconCompatParcelizer == 4) {
                try {
                    arrayList.add(new X500Principal(creditCardDetailsAdapter$ItemViewHolderArr2[i].MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem().ParcelableVolumeInfo()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    public final Principal[] read() {
        Object[] MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != MediaBrowserCompat$CustomActionResultReceiver.length; i++) {
            if (MediaBrowserCompat$CustomActionResultReceiver[i] instanceof Principal) {
                arrayList.add(MediaBrowserCompat$CustomActionResultReceiver[i]);
            }
        }
        return (Principal[]) arrayList.toArray(new Principal[arrayList.size()]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: o.AccountDetailsAdapter$ItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: o.SuitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: o.SuitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object clone() {
        /*
            r5 = this;
            o.NotificationAdapter$NotificationHolder r0 = new o.NotificationAdapter$NotificationHolder
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r1 = r5.IconCompatParcelizer
            if (r1 == 0) goto L_0x0088
            boolean r2 = r1 instanceof p040o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding
            if (r2 != 0) goto L_0x0088
            boolean r2 = r1 instanceof p040o.C10427x422b304e
            r3 = 0
            if (r2 == 0) goto L_0x0026
            o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding r4 = new o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding
            if (r2 == 0) goto L_0x0017
            r3 = r1
            o.SuitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding r3 = (p040o.C10427x422b304e) r3
            goto L_0x0022
        L_0x0017:
            if (r1 == 0) goto L_0x0022
            o.SuitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding r3 = new o.SuitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r1 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r1)
            r3.<init>(r1)
        L_0x0022:
            r4.<init>((p040o.C10427x422b304e) r3)
            goto L_0x008b
        L_0x0026:
            boolean r2 = r1 instanceof p040o.AccountDetailsAdapter$ItemViewHolder
            if (r2 == 0) goto L_0x0032
            o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding r4 = new o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding
            o.AccountDetailsAdapter$ItemViewHolder r1 = (p040o.AccountDetailsAdapter$ItemViewHolder) r1
            r4.<init>((p040o.AccountDetailsAdapter$ItemViewHolder) r1)
            goto L_0x008b
        L_0x0032:
            boolean r4 = r1 instanceof p040o.HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding
            if (r4 == 0) goto L_0x004e
            o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding r4 = new o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding
            o.HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding r1 = (p040o.HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) r1
            r2 = 0
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r1 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(r1, r2)
            if (r1 == 0) goto L_0x004a
            o.SuitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding r3 = new o.SuitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r1 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r1)
            r3.<init>(r1)
        L_0x004a:
            r4.<init>((p040o.C10427x422b304e) r3)
            goto L_0x008b
        L_0x004e:
            boolean r4 = r1 instanceof p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder
            if (r4 == 0) goto L_0x0069
            o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding r4 = new o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding
            if (r2 == 0) goto L_0x005a
            r3 = r1
            o.AccountDetailsAdapter$ItemViewHolder r3 = (p040o.AccountDetailsAdapter$ItemViewHolder) r3
            goto L_0x0065
        L_0x005a:
            if (r1 == 0) goto L_0x0065
            o.AccountDetailsAdapter$ItemViewHolder r3 = new o.AccountDetailsAdapter$ItemViewHolder
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r1 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r1)
            r3.<init>((p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) r1)
        L_0x0065:
            r4.<init>((p040o.AccountDetailsAdapter$ItemViewHolder) r3)
            goto L_0x008b
        L_0x0069:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "unknown object in factory: "
            r0.append(r2)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0088:
            r4 = r1
            o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding r4 = (p040o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding) r4
        L_0x008b:
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.NotificationAdapter$NotificationHolder.clone():java.lang.Object");
    }

    public final boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = this.IconCompatParcelizer;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding instanceof C10427x422b304e) {
            C10427x422b304e suitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding = (C10427x422b304e) hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
            if (suitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding.IconCompatParcelizer == null) {
                if (read(x509Certificate.getSubjectX500Principal(), suitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding.write)) {
                    return true;
                }
            } else if (!new BigInteger(suitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding.IconCompatParcelizer.write.read).equals(x509Certificate.getSerialNumber()) || !read(x509Certificate.getIssuerX500Principal(), suitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver)) {
                return false;
            } else {
                return true;
            }
        } else {
            if (read(x509Certificate.getSubjectX500Principal(), (AccountDetailsAdapter$ItemViewHolder) hmlAboutAdapter$HmlAboutViewHolder_ViewBinding)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationAdapter$NotificationHolder)) {
            return false;
        }
        return this.IconCompatParcelizer.equals(((NotificationAdapter$NotificationHolder) obj).IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    private static boolean read(X500Principal x500Principal, AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder) {
        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = accountDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
        int length = creditCardDetailsAdapter$ItemViewHolderArr.length;
        CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[length];
        System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
        for (int i = 0; i != length; i++) {
            CreditCardDetailsAdapter$ItemViewHolder creditCardDetailsAdapter$ItemViewHolder = creditCardDetailsAdapter$ItemViewHolderArr2[i];
            if (creditCardDetailsAdapter$ItemViewHolder.IconCompatParcelizer == 4) {
                try {
                    if (new X500Principal(creditCardDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem().ParcelableVolumeInfo()).equals(x500Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }
}
