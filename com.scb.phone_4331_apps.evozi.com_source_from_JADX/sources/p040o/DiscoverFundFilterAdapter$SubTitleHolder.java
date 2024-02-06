package p040o;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: o.DiscoverFundFilterAdapter$SubTitleHolder */
public final class DiscoverFundFilterAdapter$SubTitleHolder extends C10403xf0c8ae24 {
    private int MediaBrowserCompat$CustomActionResultReceiver = -1;

    public DiscoverFundFilterAdapter$SubTitleHolder() {
    }

    public DiscoverFundFilterAdapter$SubTitleHolder(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        super(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
    }

    public DiscoverFundFilterAdapter$SubTitleHolder(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        super(companyItemViewHolder_ViewBinding, false);
    }

    public DiscoverFundFilterAdapter$SubTitleHolder(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[] hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr) {
        super(hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr, false);
    }

    private int MediaBrowserCompat$ItemReceiver() throws IOException {
        if (this.MediaBrowserCompat$CustomActionResultReceiver < 0) {
            int i = 0;
            Enumeration elements = this.IconCompatParcelizer.elements();
            while (elements.hasMoreElements()) {
                i += ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) elements.nextElement()).MediaBrowserCompat$MediaItem().MediaDescriptionCompat().MediaBrowserCompat$CustomActionResultReceiver();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        int MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(MediaBrowserCompat$ItemReceiver) + 1 + MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        HmlDocumentListAdapter$DocumentViewHolder_ViewBinding write = hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.write();
        int MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(49);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(MediaBrowserCompat$ItemReceiver);
        Enumeration elements = this.IconCompatParcelizer.elements();
        while (elements.hasMoreElements()) {
            write.MediaBrowserCompat$ItemReceiver((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) elements.nextElement());
        }
    }
}
