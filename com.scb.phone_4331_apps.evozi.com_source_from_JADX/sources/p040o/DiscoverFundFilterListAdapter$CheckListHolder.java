package p040o;

import java.io.IOException;

/* renamed from: o.DiscoverFundFilterListAdapter$CheckListHolder */
public final class DiscoverFundFilterListAdapter$CheckListHolder extends HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding {
    public DiscoverFundFilterListAdapter$CheckListHolder(boolean z, int i, HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        super(z, i, hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
    }

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        if (this.read) {
            return true;
        }
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem().MediaDescriptionCompat().IconCompatParcelizer();
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        int i;
        int MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem().MediaDescriptionCompat().MediaBrowserCompat$CustomActionResultReceiver();
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
        C10402xc503e64f MediaDescriptionCompat = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem().MediaDescriptionCompat();
        int i = 160;
        if (this.read) {
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.write(160, this.IconCompatParcelizer);
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver());
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat);
            return;
        }
        if (!MediaDescriptionCompat.IconCompatParcelizer()) {
            i = 128;
        }
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.write(i, this.IconCompatParcelizer);
        if (MediaDescriptionCompat != null) {
            MediaDescriptionCompat.IconCompatParcelizer(new C10401x9b36249e(hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read));
            return;
        }
        throw new IOException("null object detected");
    }
}
