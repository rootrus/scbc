package p040o;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: o.InvestmentDetailsTransactionAdapter$TransactionHolder */
public final class InvestmentDetailsTransactionAdapter$TransactionHolder extends HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder {
    private int MediaBrowserCompat$CustomActionResultReceiver = -1;

    public InvestmentDetailsTransactionAdapter$TransactionHolder() {
    }

    public InvestmentDetailsTransactionAdapter$TransactionHolder(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        super(companyItemViewHolder_ViewBinding);
    }

    public InvestmentDetailsTransactionAdapter$TransactionHolder(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[] hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr) {
        super(hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr);
    }

    private int MediaMetadataCompat() throws IOException {
        if (this.MediaBrowserCompat$CustomActionResultReceiver < 0) {
            int i = 0;
            Enumeration write = write();
            while (write.hasMoreElements()) {
                i += ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write.nextElement()).MediaBrowserCompat$MediaItem().RatingCompat().MediaBrowserCompat$CustomActionResultReceiver();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        int MediaMetadataCompat = MediaMetadataCompat();
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(MediaMetadataCompat) + 1 + MediaMetadataCompat;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        HmlDocumentListAdapter$DocumentViewHolder_ViewBinding IconCompatParcelizer = hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer();
        int MediaMetadataCompat = MediaMetadataCompat();
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(48);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(MediaMetadataCompat);
        Enumeration write = write();
        while (write.hasMoreElements()) {
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write.nextElement());
        }
    }
}
