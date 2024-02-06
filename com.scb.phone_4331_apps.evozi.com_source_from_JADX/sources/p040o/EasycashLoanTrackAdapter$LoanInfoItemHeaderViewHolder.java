package p040o;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

/* renamed from: o.EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder */
public final class EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder extends MerchantWalletSelectorAdapter$ItemViewHolder_ViewBinding {
    String MediaBrowserCompat$ItemReceiver;

    EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder() {
        super(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID);
    }

    EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder(String str) {
        this();
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder(byte[] bArr) {
        this();
        this.MediaBrowserCompat$ItemReceiver = ASN1ObjectIdentifier.getInstance(new DERTaggedObject(true, 0, new DEROctetString(bArr)), false).getId();
    }

    /* access modifiers changed from: protected */
    public final byte[] MediaBrowserCompat$ItemReceiver() {
        try {
            byte[] encoded = new ASN1ObjectIdentifier(this.MediaBrowserCompat$ItemReceiver).getEncoded();
            int length = encoded.length - 2;
            byte[] bArr = new byte[length];
            System.arraycopy(encoded, 2, bArr, 0, length);
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder) {
            return this.MediaBrowserCompat$ItemReceiver.equals(((EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder) obj).MediaBrowserCompat$ItemReceiver);
        }
        return false;
    }

    public final String toString() {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
