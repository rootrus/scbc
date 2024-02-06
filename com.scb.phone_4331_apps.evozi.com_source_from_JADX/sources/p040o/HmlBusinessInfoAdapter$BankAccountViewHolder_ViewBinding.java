package p040o;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: o.HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding */
public final class HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding extends C10402xc503e64f {
    public final byte[] read;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public static HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding write(Object obj) {
        if (obj == null || (obj instanceof HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding)) {
            return (HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding) read((byte[]) obj);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("encoding error in getInstance: ");
                sb.append(e.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(long j) {
        this.read = BigInteger.valueOf(j).toByteArray();
    }

    public HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(BigInteger bigInteger) {
        this.read = bigInteger.toByteArray();
    }

    private HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(byte[] bArr) {
        this(bArr, true);
    }

    HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(byte[] bArr, boolean z) {
        if (z) {
            if (bArr == null) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                bArr = bArr2;
            }
        }
        this.read = bArr;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.read.length) + 1 + this.read.length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.read;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(2);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.read;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding)) {
            return false;
        }
        return C6958xd50139e8.write(this.read, ((HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read);
    }

    public static HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding read(HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding, boolean z) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = null;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
        } else {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
        }
        if (z || (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding)) {
            return write((Object) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding);
        }
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 != null) {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2.MediaBrowserCompat$MediaItem();
        }
        return new HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(C10905onItemClick.MediaBrowserCompat$ItemReceiver(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2).write());
    }

    public final String toString() {
        return new BigInteger(this.read).toString();
    }
}
