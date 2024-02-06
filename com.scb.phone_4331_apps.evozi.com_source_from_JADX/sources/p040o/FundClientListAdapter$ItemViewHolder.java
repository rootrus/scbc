package p040o;

import java.io.IOException;

/* renamed from: o.FundClientListAdapter$ItemViewHolder */
public final class FundClientListAdapter$ItemViewHolder extends C10402xc503e64f implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding {
    private final char[] write;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    FundClientListAdapter$ItemViewHolder(char[] cArr) {
        this.write = cArr;
    }

    public final String MediaMetadataCompat() {
        return new String(this.write);
    }

    public final String toString() {
        return MediaMetadataCompat();
    }

    public final int hashCode() {
        char[] cArr = this.write;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    /* access modifiers changed from: protected */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof FundClientListAdapter$ItemViewHolder)) {
            return false;
        }
        char[] cArr = this.write;
        char[] cArr2 = ((FundClientListAdapter$ItemViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).write;
        if (cArr == cArr2) {
            return true;
        }
        if (!(cArr == null || cArr2 == null || cArr.length != cArr2.length)) {
            int i = 0;
            while (i != cArr.length) {
                if (cArr[i] == cArr2[i]) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.write.length << 1) + 1 + (this.write.length << 1);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(30);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(this.write.length << 1);
        int i = 0;
        while (true) {
            char[] cArr = this.write;
            if (i != cArr.length) {
                char c = cArr[i];
                hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer((byte) (c >> 8));
                hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer((byte) c);
                i++;
            } else {
                return;
            }
        }
    }
}
