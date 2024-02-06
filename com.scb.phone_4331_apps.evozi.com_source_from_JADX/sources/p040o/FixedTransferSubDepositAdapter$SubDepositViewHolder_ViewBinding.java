package p040o;

import java.io.IOException;

/* renamed from: o.FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding */
public final class FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding extends C10402xc503e64f {
    public static final FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding IconCompatParcelizer = new FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding(true);
    private static final byte[] MediaBrowserCompat$CustomActionResultReceiver = {0};
    private static FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver = new FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding(false);
    private static final byte[] write = {-1};
    public final byte[] read;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return 3;
    }

    public static FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding IconCompatParcelizer(Object obj) {
        if (obj == null || (obj instanceof FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding)) {
            return (FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding) obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public static FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver(boolean z) {
        return z ? IconCompatParcelizer : MediaBrowserCompat$ItemReceiver;
    }

    private FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding(byte[] bArr) {
        byte[] bArr2;
        if (bArr.length == 1) {
            if (bArr[0] == 0) {
                bArr2 = MediaBrowserCompat$CustomActionResultReceiver;
            } else if ((bArr[0] & 255) == 255) {
                bArr2 = write;
            } else if (bArr == null) {
                bArr2 = null;
            } else {
                byte[] bArr3 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                bArr2 = bArr3;
            }
            this.read = bArr2;
            return;
        }
        throw new IllegalArgumentException("byte value should have 1 byte in it");
    }

    private FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding(boolean z) {
        this.read = z ? write : MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.read;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(1);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    /* access modifiers changed from: protected */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding) || this.read[0] != ((FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read[0]) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.read[0];
    }

    public final String toString() {
        return this.read[0] != 0 ? "TRUE" : "FALSE";
    }

    static FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        } else if (bArr[0] == 0) {
            return MediaBrowserCompat$ItemReceiver;
        } else {
            if ((bArr[0] & 255) == 255) {
                return IconCompatParcelizer;
            }
            return new FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding(bArr);
        }
    }

    public static FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding IconCompatParcelizer(HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
        } else {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
        }
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding)) {
            return MediaBrowserCompat$ItemReceiver(((C10905onItemClick) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).write());
        }
        return IconCompatParcelizer((Object) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding);
    }
}
