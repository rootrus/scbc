package p040o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;

/* renamed from: o.HmlBanksGridAdapter$HmlBankViewHolder */
public abstract class HmlBanksGridAdapter$HmlBankViewHolder implements HmlAboutAdapter$HmlAboutViewHolder_ViewBinding {
    public abstract C10402xc503e64f MediaBrowserCompat$MediaItem();

    public byte[] ParcelableVolumeInfo() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new HmlDocumentListAdapter$DocumentViewHolder_ViewBinding(byteArrayOutputStream).MediaBrowserCompat$ItemReceiver(this);
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] write(String str) throws IOException {
        if (str.equals(ASN1Encoding.DER)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MediaBrowserCompat$MediaItem().RatingCompat().IconCompatParcelizer(new InvestmentDetailsClientListAdapter$SingleViewHolder_ViewBinding(byteArrayOutputStream));
            return byteArrayOutputStream.toByteArray();
        } else if (!str.equals(ASN1Encoding.f5569DL)) {
            return ParcelableVolumeInfo();
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            MediaBrowserCompat$MediaItem().MediaDescriptionCompat().IconCompatParcelizer(new RiskLevelsAdapter$RiskLevelHolder_ViewBinding(byteArrayOutputStream2));
            return byteArrayOutputStream2.toByteArray();
        }
    }

    public int hashCode() {
        return MediaBrowserCompat$MediaItem().hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HmlAboutAdapter$HmlAboutViewHolder_ViewBinding)) {
            return false;
        }
        return MediaBrowserCompat$MediaItem().equals(((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) obj).MediaBrowserCompat$MediaItem());
    }
}
