package p040o;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import p040o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder;

/* renamed from: o.SmeLoanDetailLgItemAdapter$GroupItemViewHolder */
public final class SmeLoanDetailLgItemAdapter$GroupItemViewHolder extends X509CRLEntry {
    private SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private DividendSummaryAdapter$ParentViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver = read(false, (DividendSummaryAdapter$ParentViewHolder_ViewBinding) null);
    private boolean write;

    public SmeLoanDetailLgItemAdapter$GroupItemViewHolder(SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer iconCompatParcelizer, boolean z, DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
    }

    private DividendSummaryAdapter$ParentViewHolder_ViewBinding read(boolean z, DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding) {
        if (!z) {
            return null;
        }
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.write;
        CreditCardDetailsAdapter$ItemViewHolder_ViewBinding read = this.IconCompatParcelizer.read();
        SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = read != null ? (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) read.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder) : null;
        if (selectableChoiceAdapter$ChoiceHolder_ViewBinding == null) {
            return dividendSummaryAdapter$ParentViewHolder_ViewBinding;
        }
        try {
            C10402xc503e64f IconCompatParcelizer2 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.IconCompatParcelizer(selectableChoiceAdapter$ChoiceHolder_ViewBinding);
            CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = (IconCompatParcelizer2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) : null).MediaBrowserCompat$CustomActionResultReceiver;
            int length = creditCardDetailsAdapter$ItemViewHolderArr.length;
            CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[length];
            System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
            for (int i = 0; i < length; i++) {
                if (creditCardDetailsAdapter$ItemViewHolderArr2[i].IconCompatParcelizer == 4) {
                    return DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(creditCardDetailsAdapter$ItemViewHolderArr2[i].MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final X500Principal getCertificateIssuer() {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            return null;
        }
        try {
            return new X500Principal(this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo());
        } catch (IOException unused) {
            return null;
        }
    }

    private Set read(boolean z) {
        CreditCardDetailsAdapter$ItemViewHolder_ViewBinding read = this.IconCompatParcelizer.read();
        if (read == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration elements = read.read.elements();
        while (elements.hasMoreElements()) {
            HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
            if (z == ((SelectableChoiceAdapter$ChoiceHolder_ViewBinding) read.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder)).Keep) {
                hashSet.add(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
            }
        }
        return hashSet;
    }

    public final Set getCriticalExtensionOIDs() {
        return read(true);
    }

    public final Set getNonCriticalExtensionOIDs() {
        return read(false);
    }

    public final byte[] getExtensionValue(String str) {
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = new HmlBusinessInfoAdapter$BankAccountViewHolder(str);
        CreditCardDetailsAdapter$ItemViewHolder_ViewBinding read = this.IconCompatParcelizer.read();
        SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = read != null ? (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) read.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder) : null;
        if (selectableChoiceAdapter$ChoiceHolder_ViewBinding == null) {
            return null;
        }
        try {
            return selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView.ParcelableVolumeInfo();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("error encoding ");
            sb.append(e.toString());
            throw new RuntimeException(sb.toString());
        }
    }

    public final int hashCode() {
        if (!this.write) {
            this.MediaBrowserCompat$CustomActionResultReceiver = super.hashCode();
            this.write = true;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SmeLoanDetailLgItemAdapter$GroupItemViewHolder) {
            return this.IconCompatParcelizer.equals(((SmeLoanDetailLgItemAdapter$GroupItemViewHolder) obj).IconCompatParcelizer);
        }
        return super.equals(this);
    }

    public final byte[] getEncoded() throws CRLException {
        try {
            return this.IconCompatParcelizer.write(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public final BigInteger getSerialNumber() {
        return new BigInteger(HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) this.IconCompatParcelizer.read.read(0)).read);
    }

    public final Date getRevocationDate() {
        return SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.read.read(1)).IconCompatParcelizer();
    }

    public final boolean hasExtensions() {
        return this.IconCompatParcelizer.read() != null;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String read = MoneyActionAdapter$CustomViewHolder.read();
        stringBuffer.append("      userCertificate: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(read);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(read);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(read);
        CreditCardDetailsAdapter$ItemViewHolder_ViewBinding read2 = this.IconCompatParcelizer.read();
        if (read2 != null) {
            Enumeration elements = read2.read.elements();
            if (elements.hasMoreElements()) {
                stringBuffer.append("   crlEntryExtensions:");
                stringBuffer.append(read);
                while (elements.hasMoreElements()) {
                    HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
                    SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) read2.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder);
                    if (selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView != null) {
                        CompanyItemViewHolder companyItemViewHolder = new CompanyItemViewHolder(selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView.write());
                        stringBuffer.append("                       critical(");
                        stringBuffer.append(selectableChoiceAdapter$ChoiceHolder_ViewBinding.Keep);
                        stringBuffer.append(") ");
                        try {
                            if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(C10429xc6dd6bd7.read)) {
                                stringBuffer.append(FundSwitchSearchListAdapter$FundHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(HmlAboutAdapter$HmlAboutViewHolder.IconCompatParcelizer((Object) companyItemViewHolder.MediaBrowserCompat$ItemReceiver())));
                                stringBuffer.append(read);
                            } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(C10429xc6dd6bd7.write)) {
                                stringBuffer.append("Certificate issuer: ");
                                C10402xc503e64f MediaBrowserCompat$ItemReceiver2 = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
                                stringBuffer.append(MediaBrowserCompat$ItemReceiver2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2)) : null);
                                stringBuffer.append(read);
                            } else {
                                stringBuffer.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                                stringBuffer.append(" value = ");
                                stringBuffer.append(DividendSummaryAdapter$ChildViewHolder.read(companyItemViewHolder.MediaBrowserCompat$ItemReceiver()));
                                stringBuffer.append(read);
                            }
                        } catch (Exception unused) {
                            stringBuffer.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                            stringBuffer.append(" value = ");
                            stringBuffer.append("*****");
                            stringBuffer.append(read);
                        }
                    } else {
                        stringBuffer.append(read);
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
