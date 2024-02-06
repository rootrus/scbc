package p040o;

import java.io.IOException;

/* renamed from: o.InvestmentDetailsClientListAdapter$ExpandableChildViewHolder */
public class InvestmentDetailsClientListAdapter$ExpandableChildViewHolder extends C10399x149eb6a1 {
    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public static InvestmentDetailsClientListAdapter$ExpandableChildViewHolder MediaBrowserCompat$ItemReceiver(Object obj) {
        if (obj == null || (obj instanceof InvestmentDetailsClientListAdapter$ExpandableChildViewHolder)) {
            return (InvestmentDetailsClientListAdapter$ExpandableChildViewHolder) obj;
        }
        if (obj instanceof DiscoverFundFilterAdapter$CheckListHolder) {
            DiscoverFundFilterAdapter$CheckListHolder discoverFundFilterAdapter$CheckListHolder = (DiscoverFundFilterAdapter$CheckListHolder) obj;
            return new InvestmentDetailsClientListAdapter$ExpandableChildViewHolder(discoverFundFilterAdapter$CheckListHolder.read, discoverFundFilterAdapter$CheckListHolder.MediaBrowserCompat$CustomActionResultReceiver);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public InvestmentDetailsClientListAdapter$ExpandableChildViewHolder(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.read.length + 1) + 1 + this.read.length + 1;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] write = write(this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
        int length = write.length + 1;
        byte[] bArr = new byte[length];
        bArr[0] = (byte) write();
        System.arraycopy(write, 0, bArr, 1, length - 1);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(3);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    public static InvestmentDetailsClientListAdapter$ExpandableChildViewHolder MediaBrowserCompat$ItemReceiver(HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
        } else {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
        }
        if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentDetailsClientListAdapter$ExpandableChildViewHolder) {
            return MediaBrowserCompat$ItemReceiver((Object) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding);
        }
        byte[] write = ((C10905onItemClick) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).write();
        if (write.length > 0) {
            byte b = write[0];
            int length = write.length - 1;
            byte[] bArr = new byte[length];
            if (length != 0) {
                System.arraycopy(write, 1, bArr, 0, write.length - 1);
            }
            return new InvestmentDetailsClientListAdapter$ExpandableChildViewHolder(bArr, b);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }
}
