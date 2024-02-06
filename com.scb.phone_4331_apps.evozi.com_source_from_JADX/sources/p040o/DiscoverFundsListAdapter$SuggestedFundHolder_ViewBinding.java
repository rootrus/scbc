package p040o;

import java.io.IOException;
import java.util.Enumeration;

/* renamed from: o.DiscoverFundsListAdapter$SuggestedFundHolder_ViewBinding */
final class DiscoverFundsListAdapter$SuggestedFundHolder_ViewBinding extends HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder {
    private byte[] IconCompatParcelizer;

    DiscoverFundsListAdapter$SuggestedFundHolder_ViewBinding(byte[] bArr) throws IOException {
        this.IconCompatParcelizer = bArr;
    }

    private void MediaMetadataCompat() {
        DiscoverFundFilterListAdapter$CheckListHolder_ViewBinding discoverFundFilterListAdapter$CheckListHolder_ViewBinding = new DiscoverFundFilterListAdapter$CheckListHolder_ViewBinding(this.IconCompatParcelizer);
        while (discoverFundFilterListAdapter$CheckListHolder_ViewBinding.hasMoreElements()) {
            this.write.addElement(discoverFundFilterListAdapter$CheckListHolder_ViewBinding.nextElement());
        }
        this.IconCompatParcelizer = null;
    }

    public final HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read(int i) {
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read;
        synchronized (this) {
            if (this.IconCompatParcelizer != null) {
                MediaMetadataCompat();
            }
            read = super.read(i);
        }
        return read;
    }

    public final Enumeration write() {
        synchronized (this) {
            if (this.IconCompatParcelizer == null) {
                Enumeration write = super.write();
                return write;
            }
            DiscoverFundFilterListAdapter$CheckListHolder_ViewBinding discoverFundFilterListAdapter$CheckListHolder_ViewBinding = new DiscoverFundFilterListAdapter$CheckListHolder_ViewBinding(this.IconCompatParcelizer);
            return discoverFundFilterListAdapter$CheckListHolder_ViewBinding;
        }
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        int MediaBrowserCompat$ItemReceiver;
        synchronized (this) {
            if (this.IconCompatParcelizer != null) {
                MediaMetadataCompat();
            }
            MediaBrowserCompat$ItemReceiver = super.MediaBrowserCompat$ItemReceiver();
        }
        return MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: package-private */
    public final C10402xc503e64f RatingCompat() {
        if (this.IconCompatParcelizer != null) {
            MediaMetadataCompat();
        }
        return super.RatingCompat();
    }

    /* access modifiers changed from: package-private */
    public final C10402xc503e64f MediaDescriptionCompat() {
        if (this.IconCompatParcelizer != null) {
            MediaMetadataCompat();
        }
        return super.MediaDescriptionCompat();
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        byte[] bArr = this.IconCompatParcelizer;
        if (bArr != null) {
            return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(bArr.length) + 1 + this.IconCompatParcelizer.length;
        }
        return super.MediaDescriptionCompat().MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.IconCompatParcelizer;
        if (bArr != null) {
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(48);
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
            return;
        }
        super.MediaDescriptionCompat().IconCompatParcelizer(hmlDocumentListAdapter$DocumentViewHolder_ViewBinding);
    }
}
