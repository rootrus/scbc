package p040o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ParsingException;

/* renamed from: o.HmlOutcomeCounterAdapter$CounterOfferViewHolder */
public final class HmlOutcomeCounterAdapter$CounterOfferViewHolder extends HelpAdapter$MoreOptionsHolder {
    public HmlOutcomeCounterAdapter$CounterOfferViewHolder(int i, CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        super(true, i, MediaBrowserCompat$ItemReceiver(companyItemViewHolder_ViewBinding));
    }

    private static byte[] MediaBrowserCompat$ItemReceiver(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i != companyItemViewHolder_ViewBinding.write.size()) {
            try {
                byteArrayOutputStream.write(((HmlBanksGridAdapter$HmlBankViewHolder) ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) companyItemViewHolder_ViewBinding.write.elementAt(i))).write(ASN1Encoding.BER));
                i++;
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("malformed object: ");
                sb.append(e);
                throw new ASN1ParsingException(sb.toString(), e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.write(this.read ? 96 : 64, this.MediaBrowserCompat$ItemReceiver);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(128);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(this.IconCompatParcelizer);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(0);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(0);
    }
}
