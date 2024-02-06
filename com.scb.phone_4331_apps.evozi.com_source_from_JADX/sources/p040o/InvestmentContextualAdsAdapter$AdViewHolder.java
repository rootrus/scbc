package p040o;

import java.io.IOException;

/* renamed from: o.InvestmentContextualAdsAdapter$AdViewHolder */
public final class InvestmentContextualAdsAdapter$AdViewHolder extends HelpAdapter$MoreOptionsHolder {
    InvestmentContextualAdsAdapter$AdViewHolder(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        int i = this.read ? 96 : 64;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        byte[] bArr = this.IconCompatParcelizer;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.write(i, i2);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }
}
