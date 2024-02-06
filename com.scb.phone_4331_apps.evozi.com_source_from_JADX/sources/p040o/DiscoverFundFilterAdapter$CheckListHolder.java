package p040o;

import java.io.IOException;

/* renamed from: o.DiscoverFundFilterAdapter$CheckListHolder */
public final class DiscoverFundFilterAdapter$CheckListHolder extends C10399x149eb6a1 {
    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public DiscoverFundFilterAdapter$CheckListHolder(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.read.length + 1) + 1 + this.read.length + 1;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.read;
        int length = bArr.length + 1;
        byte[] bArr2 = new byte[length];
        bArr2[0] = (byte) write();
        System.arraycopy(bArr, 0, bArr2, 1, length - 1);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(3);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr2);
    }
}
