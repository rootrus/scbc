package p040o;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: o.HmlAboutAdapter$HmlAboutViewHolder */
public final class HmlAboutAdapter$HmlAboutViewHolder extends C10402xc503e64f {
    private static HmlAboutAdapter$HmlAboutViewHolder[] write = new HmlAboutAdapter$HmlAboutViewHolder[12];
    public final byte[] read;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public static HmlAboutAdapter$HmlAboutViewHolder IconCompatParcelizer(Object obj) {
        if (obj == null || (obj instanceof HmlAboutAdapter$HmlAboutViewHolder)) {
            return (HmlAboutAdapter$HmlAboutViewHolder) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (HmlAboutAdapter$HmlAboutViewHolder) read((byte[]) obj);
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

    public HmlAboutAdapter$HmlAboutViewHolder(int i) {
        this.read = BigInteger.valueOf((long) i).toByteArray();
    }

    private HmlAboutAdapter$HmlAboutViewHolder(byte[] bArr) {
        this.read = bArr;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.read.length) + 1 + this.read.length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.read;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(10);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlAboutAdapter$HmlAboutViewHolder)) {
            return false;
        }
        return C6958xd50139e8.write(this.read, ((HmlAboutAdapter$HmlAboutViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read);
    }

    public final int hashCode() {
        return C6958xd50139e8.read(this.read);
    }

    static HmlAboutAdapter$HmlAboutViewHolder write(byte[] bArr) {
        byte[] bArr2 = null;
        if (bArr.length > 1) {
            if (bArr != null) {
                bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
            return new HmlAboutAdapter$HmlAboutViewHolder(bArr2);
        } else if (bArr.length != 0) {
            byte b = bArr[0] & 255;
            HmlAboutAdapter$HmlAboutViewHolder[] hmlAboutAdapter$HmlAboutViewHolderArr = write;
            if (b >= hmlAboutAdapter$HmlAboutViewHolderArr.length) {
                if (bArr != null) {
                    bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                }
                return new HmlAboutAdapter$HmlAboutViewHolder(bArr2);
            }
            HmlAboutAdapter$HmlAboutViewHolder hmlAboutAdapter$HmlAboutViewHolder = hmlAboutAdapter$HmlAboutViewHolderArr[b];
            if (hmlAboutAdapter$HmlAboutViewHolder == null) {
                if (bArr != null) {
                    bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                }
                hmlAboutAdapter$HmlAboutViewHolder = new HmlAboutAdapter$HmlAboutViewHolder(bArr2);
                hmlAboutAdapter$HmlAboutViewHolderArr[b] = hmlAboutAdapter$HmlAboutViewHolder;
            }
            return hmlAboutAdapter$HmlAboutViewHolder;
        } else {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
    }
}
