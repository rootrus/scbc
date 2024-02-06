package p040o;

import java.io.IOException;

/* renamed from: o.HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding */
public abstract class HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding extends C10402xc503e64f implements GiftMoneySelectThemeAdapter$GiftMoneySelectThemeViewHolder {
    public int IconCompatParcelizer;
    public HmlAboutAdapter$HmlAboutViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver = null;
    public boolean read = true;

    /* access modifiers changed from: package-private */
    public abstract void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException;

    public static HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding write(Object obj) {
        if (obj == null || (obj instanceof HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding)) {
            return (HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return write((Object) read((byte[]) obj));
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to construct tagged object from byte[]: ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unknown object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding(boolean z, int i, HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding instanceof FixedTransferSubDepositAdapter$SubDepositViewHolder) {
            this.read = true;
        } else {
            this.read = z;
        }
        this.IconCompatParcelizer = i;
        if (this.read) {
            this.MediaBrowserCompat$ItemReceiver = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
            return;
        }
        hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
        this.MediaBrowserCompat$ItemReceiver = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding)) {
            return false;
        }
        HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding = (HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        if (this.IconCompatParcelizer != hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer || this.read != hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.read) {
            return false;
        }
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding == null) {
            if (hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver != null) {
                return false;
            }
            return true;
        } else if (!hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem().equals(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem())) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        int i = this.IconCompatParcelizer;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
        return hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null ? i ^ hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.hashCode() : i;
    }

    public final C10402xc503e64f read() {
        return MediaBrowserCompat$MediaItem();
    }

    /* access modifiers changed from: package-private */
    public final C10402xc503e64f RatingCompat() {
        return new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(this.read, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
    }

    /* access modifiers changed from: package-private */
    public final C10402xc503e64f MediaDescriptionCompat() {
        return new DiscoverFundFilterListAdapter$CheckListHolder(this.read, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.IconCompatParcelizer);
        sb.append("]");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        return sb.toString();
    }
}
