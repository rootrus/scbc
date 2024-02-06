package p040o;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: o.InsurersAdapter$InsurersViewHolder_ViewBinding */
public final class InsurersAdapter$InsurersViewHolder_ViewBinding extends HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder {
    public InsurersAdapter$InsurersViewHolder_ViewBinding() {
    }

    public InsurersAdapter$InsurersViewHolder_ViewBinding(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        super(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
    }

    public InsurersAdapter$InsurersViewHolder_ViewBinding(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        super(companyItemViewHolder_ViewBinding);
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        Enumeration write = write();
        int i = 0;
        while (write.hasMoreElements()) {
            i += ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write.nextElement()).MediaBrowserCompat$MediaItem().MediaBrowserCompat$CustomActionResultReceiver();
        }
        return i + 2 + 2;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(48);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(128);
        Enumeration write = write();
        while (write.hasMoreElements()) {
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write.nextElement());
        }
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(0);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(0);
    }
}
