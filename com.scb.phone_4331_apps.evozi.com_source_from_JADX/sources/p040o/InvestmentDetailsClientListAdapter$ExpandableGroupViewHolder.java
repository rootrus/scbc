package p040o;

import java.io.IOException;

/* renamed from: o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder */
public class InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder extends C10402xc503e64f implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding {
    private final byte[] write;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public static InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder read(Object obj) {
        if (obj == null || (obj instanceof InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder)) {
            return (InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder) obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder(byte[] bArr) {
        this.write = bArr;
    }

    public InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder(String str) {
        this(str, (byte) 0);
    }

    private InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder(String str, byte b) {
        if (str != null) {
            this.write = MoneyActionAdapter$CustomViewHolder.IconCompatParcelizer(str);
            return;
        }
        throw new NullPointerException("string cannot be null");
    }

    public final String MediaMetadataCompat() {
        return MoneyActionAdapter$CustomViewHolder.read(this.write);
    }

    public String toString() {
        return MediaMetadataCompat();
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.write.length) + 1 + this.write.length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.write;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(22);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    public int hashCode() {
        return C6958xd50139e8.read(this.write);
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder)) {
            return false;
        }
        return C6958xd50139e8.write(this.write, ((InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).write);
    }

    public static InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder read(HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
        } else {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
        }
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder)) {
            return new InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder(((C10905onItemClick) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).write());
        }
        return read((Object) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding);
    }
}
