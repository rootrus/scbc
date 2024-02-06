package p040o;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: o.DiscoverFundFilterAdapter$SelectListHolder */
public final class DiscoverFundFilterAdapter$SelectListHolder extends HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder {
    private int read = -1;

    public DiscoverFundFilterAdapter$SelectListHolder() {
    }

    public DiscoverFundFilterAdapter$SelectListHolder(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        super(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
    }

    public DiscoverFundFilterAdapter$SelectListHolder(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        super(companyItemViewHolder_ViewBinding);
    }

    private int MediaMetadataCompat() throws IOException {
        if (this.read < 0) {
            int i = 0;
            Enumeration write = write();
            while (write.hasMoreElements()) {
                i += ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write.nextElement()).MediaBrowserCompat$MediaItem().MediaDescriptionCompat().MediaBrowserCompat$CustomActionResultReceiver();
            }
            this.read = i;
        }
        return this.read;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        int MediaMetadataCompat = MediaMetadataCompat();
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(MediaMetadataCompat) + 1 + MediaMetadataCompat;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        HmlDocumentListAdapter$DocumentViewHolder_ViewBinding write = hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.write();
        int MediaMetadataCompat = MediaMetadataCompat();
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(48);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(MediaMetadataCompat);
        Enumeration write2 = write();
        while (write2.hasMoreElements()) {
            write.MediaBrowserCompat$ItemReceiver((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write2.nextElement());
        }
    }
}
