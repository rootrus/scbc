package p040o;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: o.BasicAssetAllocationAdapter$BaaHolder_ViewBinding */
public final class BasicAssetAllocationAdapter$BaaHolder_ViewBinding extends C10403xf0c8ae24 {
    private int MediaBrowserCompat$CustomActionResultReceiver = -1;

    public BasicAssetAllocationAdapter$BaaHolder_ViewBinding() {
    }

    public BasicAssetAllocationAdapter$BaaHolder_ViewBinding(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        super(companyItemViewHolder_ViewBinding, true);
    }

    BasicAssetAllocationAdapter$BaaHolder_ViewBinding(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding, byte b) {
        super(companyItemViewHolder_ViewBinding, false);
    }

    private int write() throws IOException {
        if (this.MediaBrowserCompat$CustomActionResultReceiver < 0) {
            int i = 0;
            Enumeration elements = this.IconCompatParcelizer.elements();
            while (elements.hasMoreElements()) {
                i += ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) elements.nextElement()).MediaBrowserCompat$MediaItem().RatingCompat().MediaBrowserCompat$CustomActionResultReceiver();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        int write = write();
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(write) + 1 + write;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        HmlDocumentListAdapter$DocumentViewHolder_ViewBinding IconCompatParcelizer = hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer();
        int write = write();
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(49);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(write);
        Enumeration elements = this.IconCompatParcelizer.elements();
        while (elements.hasMoreElements()) {
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) elements.nextElement());
        }
    }
}
