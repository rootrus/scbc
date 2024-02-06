package p040o;

import java.io.IOException;

/* renamed from: o.InvestmentDetailsClientListAdapter$FooterViewHolder_ViewBinding */
public final class InvestmentDetailsClientListAdapter$FooterViewHolder_ViewBinding extends C10402xc503e64f implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding {
    private final byte[] MediaBrowserCompat$CustomActionResultReceiver;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public InvestmentDetailsClientListAdapter$FooterViewHolder_ViewBinding(byte[] bArr) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            byte[] bArr3 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            bArr2 = bArr3;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = bArr2;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.MediaBrowserCompat$CustomActionResultReceiver.length) + 1 + this.MediaBrowserCompat$CustomActionResultReceiver.length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(25);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    public final int hashCode() {
        return C6958xd50139e8.read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentDetailsClientListAdapter$FooterViewHolder_ViewBinding)) {
            return false;
        }
        return C6958xd50139e8.write(this.MediaBrowserCompat$CustomActionResultReceiver, ((InvestmentDetailsClientListAdapter$FooterViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final String MediaMetadataCompat() {
        return MoneyActionAdapter$CustomViewHolder.read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
