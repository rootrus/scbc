package p040o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;

/* renamed from: o.InvestmentContextualAdsAdapter$AdViewHolder_ViewBinding */
public final class InvestmentContextualAdsAdapter$AdViewHolder_ViewBinding extends C10402xc503e64f {
    public int IconCompatParcelizer;
    public C10402xc503e64f MediaBrowserCompat$CustomActionResultReceiver;
    public C10402xc503e64f MediaBrowserCompat$ItemReceiver;
    public HmlBusinessInfoAdapter$BankAccountViewHolder read;
    public HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding write;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return true;
    }

    public InvestmentContextualAdsAdapter$AdViewHolder_ViewBinding(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        if (companyItemViewHolder_ViewBinding.write.size() > 0) {
            int i = 0;
            C10402xc503e64f MediaBrowserCompat$MediaItem = ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) companyItemViewHolder_ViewBinding.write.elementAt(0)).MediaBrowserCompat$MediaItem();
            if (MediaBrowserCompat$MediaItem instanceof HmlBusinessInfoAdapter$BankAccountViewHolder) {
                this.read = (HmlBusinessInfoAdapter$BankAccountViewHolder) MediaBrowserCompat$MediaItem;
                if (companyItemViewHolder_ViewBinding.write.size() > 1) {
                    MediaBrowserCompat$MediaItem = ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) companyItemViewHolder_ViewBinding.write.elementAt(1)).MediaBrowserCompat$MediaItem();
                    i = 1;
                } else {
                    throw new IllegalArgumentException("too few objects in input vector");
                }
            }
            if (MediaBrowserCompat$MediaItem instanceof HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding) {
                this.write = (HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding) MediaBrowserCompat$MediaItem;
                i++;
                if (companyItemViewHolder_ViewBinding.write.size() > i) {
                    MediaBrowserCompat$MediaItem = ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) companyItemViewHolder_ViewBinding.write.elementAt(i)).MediaBrowserCompat$MediaItem();
                } else {
                    throw new IllegalArgumentException("too few objects in input vector");
                }
            }
            if (!(MediaBrowserCompat$MediaItem instanceof HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$MediaItem;
                i++;
                if (companyItemViewHolder_ViewBinding.write.size() > i) {
                    MediaBrowserCompat$MediaItem = ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) companyItemViewHolder_ViewBinding.write.elementAt(i)).MediaBrowserCompat$MediaItem();
                } else {
                    throw new IllegalArgumentException("too few objects in input vector");
                }
            }
            if (companyItemViewHolder_ViewBinding.write.size() != i + 1) {
                throw new IllegalArgumentException("input vector too large");
            } else if (MediaBrowserCompat$MediaItem instanceof HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
                HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding = (HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) MediaBrowserCompat$MediaItem;
                int i2 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer;
                if (i2 < 0 || i2 > 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("invalid encoding value: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.IconCompatParcelizer = i2;
                HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
                if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
                } else {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
                }
                this.MediaBrowserCompat$ItemReceiver = hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
            } else {
                throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
            }
        } else {
            throw new IllegalArgumentException("too few objects in input vector");
        }
    }

    public final int hashCode() {
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = this.read;
        int hashCode = hmlBusinessInfoAdapter$BankAccountViewHolder != null ? hmlBusinessInfoAdapter$BankAccountViewHolder.hashCode() : 0;
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = this.write;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding != null) {
            hashCode ^= hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.hashCode();
        }
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding != null) {
            hashCode ^= hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding.hashCode();
        }
        return hashCode ^ this.MediaBrowserCompat$ItemReceiver.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        return ParcelableVolumeInfo().length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = this.read;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder != null) {
            byteArrayOutputStream.write(hmlBusinessInfoAdapter$BankAccountViewHolder.write(ASN1Encoding.DER));
        }
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = this.write;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding != null) {
            byteArrayOutputStream.write(hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write(ASN1Encoding.DER));
        }
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding != null) {
            byteArrayOutputStream.write(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding.write(ASN1Encoding.DER));
        }
        byteArrayOutputStream.write(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(true, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver).write(ASN1Encoding.DER));
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(32, 8, byteArrayOutputStream.toByteArray());
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2;
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder;
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentContextualAdsAdapter$AdViewHolder_ViewBinding)) {
            return false;
        }
        if (this == hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
            return true;
        }
        InvestmentContextualAdsAdapter$AdViewHolder_ViewBinding investmentContextualAdsAdapter$AdViewHolder_ViewBinding = (InvestmentContextualAdsAdapter$AdViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder2 = this.read;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder2 != null && ((hmlBusinessInfoAdapter$BankAccountViewHolder = investmentContextualAdsAdapter$AdViewHolder_ViewBinding.read) == null || !hmlBusinessInfoAdapter$BankAccountViewHolder.equals(hmlBusinessInfoAdapter$BankAccountViewHolder2))) {
            return false;
        }
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding2 = this.write;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding2 != null && ((hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = investmentContextualAdsAdapter$AdViewHolder_ViewBinding.write) == null || !hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.equals(hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding2))) {
            return false;
        }
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3 == null || ((hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = investmentContextualAdsAdapter$AdViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver) != null && hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2.equals(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3))) {
            return this.MediaBrowserCompat$ItemReceiver.equals(investmentContextualAdsAdapter$AdViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver);
        }
        return false;
    }
}
