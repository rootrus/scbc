package p040o;

import java.io.IOException;

/* renamed from: o.ScbsProductAdapter$ScbsProductViewHolder_ViewBinding */
public final class ScbsProductAdapter$ScbsProductViewHolder_ViewBinding extends HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding {
    public ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(boolean z, int i, HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        super(z, i, hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
    }

    public ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(int i, HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        super(true, i, hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
    }

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        if (this.read) {
            return true;
        }
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem().RatingCompat().IconCompatParcelizer();
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        int i;
        int MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem().RatingCompat().MediaBrowserCompat$CustomActionResultReceiver();
        if (this.read) {
            i = DiscoverTopListItemRecyclerAdapter$FundViewHolder.read(this.IconCompatParcelizer) + DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            MediaBrowserCompat$CustomActionResultReceiver--;
            i = DiscoverTopListItemRecyclerAdapter$FundViewHolder.read(this.IconCompatParcelizer);
        }
        return i + MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        C10402xc503e64f RatingCompat = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem().RatingCompat();
        int i = 160;
        if (this.read) {
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.write(160, this.IconCompatParcelizer);
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(RatingCompat.MediaBrowserCompat$CustomActionResultReceiver());
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(RatingCompat);
            return;
        }
        if (!RatingCompat.IconCompatParcelizer()) {
            i = 128;
        }
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.write(i, this.IconCompatParcelizer);
        if (RatingCompat != null) {
            RatingCompat.IconCompatParcelizer(new C10401x9b36249e(hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read));
            return;
        }
        throw new IOException("null object detected");
    }
}
