package p040o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: o.DiscoverFundFilterAdapter$CheckListHolder_ViewBinding */
public final class DiscoverFundFilterAdapter$CheckListHolder_ViewBinding extends C10402xc503e64f implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding {
    private static final char[] write = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final byte[] read;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public DiscoverFundFilterAdapter$CheckListHolder_ViewBinding(byte[] bArr) {
        this.read = bArr;
    }

    public final String MediaMetadataCompat() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new HmlDocumentListAdapter$DocumentViewHolder_ViewBinding(byteArrayOutputStream).MediaBrowserCompat$ItemReceiver(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(write[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(write[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new RuntimeException("internal error encoding BitString");
        }
    }

    public final String toString() {
        return MediaMetadataCompat();
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.read.length) + 1 + this.read.length;
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof DiscoverFundFilterAdapter$CheckListHolder_ViewBinding)) {
            return false;
        }
        return C6958xd50139e8.write(this.read, ((DiscoverFundFilterAdapter$CheckListHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read);
    }

    public final int hashCode() {
        return C6958xd50139e8.read(this.read);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.read;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(28);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }
}
