package p040o;

import java.io.IOException;

/* renamed from: o.InvestmentDetailsAssetGroupListAdapter$AssetGroupView */
public final class InvestmentDetailsAssetGroupListAdapter$AssetGroupView extends C10402xc503e64f implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding {
    private final byte[] read;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    InvestmentDetailsAssetGroupListAdapter$AssetGroupView(byte[] bArr) {
        this.read = bArr;
    }

    public final String MediaMetadataCompat() {
        return MoneyActionAdapter$CustomViewHolder.read(this.read);
    }

    public final String toString() {
        return MediaMetadataCompat();
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.read.length) + 1 + this.read.length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.read;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(27);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    public final int hashCode() {
        return C6958xd50139e8.read(this.read);
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentDetailsAssetGroupListAdapter$AssetGroupView)) {
            return false;
        }
        return C6958xd50139e8.write(this.read, ((InvestmentDetailsAssetGroupListAdapter$AssetGroupView) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read);
    }
}
