package p040o;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* renamed from: o.onItemClick  reason: case insensitive filesystem */
public abstract class C10905onItemClick extends C10402xc503e64f implements HmlDocumentListAdapter$DocumentViewHolder {
    byte[] MediaBrowserCompat$ItemReceiver;

    /* access modifiers changed from: package-private */
    public abstract void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException;

    public static C10905onItemClick MediaBrowserCompat$ItemReceiver(Object obj) {
        if (obj == null || (obj instanceof C10905onItemClick)) {
            return (C10905onItemClick) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return MediaBrowserCompat$ItemReceiver(C10402xc503e64f.read((byte[]) obj));
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to construct OCTET STRING from byte[]: ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            if (obj instanceof HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
                C10402xc503e64f MediaBrowserCompat$MediaItem = ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) obj).MediaBrowserCompat$MediaItem();
                if (MediaBrowserCompat$MediaItem instanceof C10905onItemClick) {
                    return (C10905onItemClick) MediaBrowserCompat$MediaItem;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public C10905onItemClick(byte[] bArr) {
        if (bArr != null) {
            this.MediaBrowserCompat$ItemReceiver = bArr;
            return;
        }
        throw new NullPointerException("string cannot be null");
    }

    public final InputStream MediaBrowserCompat$ItemReceiver() {
        return new ByteArrayInputStream(this.MediaBrowserCompat$ItemReceiver);
    }

    public byte[] write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public int hashCode() {
        return C6958xd50139e8.read(write());
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof C10905onItemClick)) {
            return false;
        }
        return C6958xd50139e8.write(this.MediaBrowserCompat$ItemReceiver, ((C10905onItemClick) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).MediaBrowserCompat$ItemReceiver);
    }

    public final C10402xc503e64f read() {
        return MediaBrowserCompat$MediaItem();
    }

    /* access modifiers changed from: package-private */
    public final C10402xc503e64f RatingCompat() {
        return new C10407x3ea8e030(this.MediaBrowserCompat$ItemReceiver);
    }

    /* access modifiers changed from: package-private */
    public final C10402xc503e64f MediaDescriptionCompat() {
        return new C10407x3ea8e030(this.MediaBrowserCompat$ItemReceiver);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(new String(onSelectType.write(this.MediaBrowserCompat$ItemReceiver)));
        return sb.toString();
    }

    public static C10905onItemClick IconCompatParcelizer(HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
        } else {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
        }
        if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof C10905onItemClick) {
            return MediaBrowserCompat$ItemReceiver(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding);
        }
        HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding);
        C10905onItemClick[] onitemclickArr = new C10905onItemClick[MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver()];
        Enumeration write = MediaBrowserCompat$CustomActionResultReceiver.write();
        int i = 0;
        while (write.hasMoreElements()) {
            onitemclickArr[i] = (C10905onItemClick) write.nextElement();
            i++;
        }
        return new HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding(onitemclickArr);
    }
}
