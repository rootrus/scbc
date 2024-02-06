package p040o;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ParsingException;

/* renamed from: o.GiftMoneySelectThemeAdapter$GiftMoneySelectThemeViewHolder_ViewBinding */
public abstract class C10399x149eb6a1 extends C10402xc503e64f implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding {
    private static final char[] MediaBrowserCompat$ItemReceiver = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected final int MediaBrowserCompat$CustomActionResultReceiver;
    public final byte[] read;

    /* access modifiers changed from: package-private */
    public abstract void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException;

    public C10399x149eb6a1(byte[] bArr, int i) {
        byte[] bArr2;
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        } else if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            if (bArr == null) {
                bArr2 = null;
            } else {
                byte[] bArr3 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                bArr2 = bArr3;
            }
            this.read = bArr2;
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
        }
    }

    public final String MediaMetadataCompat() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new HmlDocumentListAdapter$DocumentViewHolder_ViewBinding(byteArrayOutputStream).MediaBrowserCompat$ItemReceiver(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(MediaBrowserCompat$ItemReceiver[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(MediaBrowserCompat$ItemReceiver[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Internal error encoding BitString: ");
            sb.append(e.getMessage());
            throw new ASN1ParsingException(sb.toString(), e);
        }
    }

    public final int MediaBrowserCompat$SearchResultReceiver() {
        byte[] bArr = this.read;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i > 0 && bArr.length <= 4) {
            bArr = write(bArr, i);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 != bArr.length && i2 != 4) {
            i3 |= (bArr[i2] & 255) << (i2 << 3);
            i2++;
        }
        return i3;
    }

    public final byte[] MediaBrowserCompat$ItemReceiver() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == 0) {
            byte[] bArr = this.read;
            if (bArr == null) {
                return null;
            }
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public final byte[] read() {
        return write(this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public String toString() {
        return MediaMetadataCompat();
    }

    public int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        return i ^ C6958xd50139e8.read(write(this.read, i));
    }

    /* access modifiers changed from: protected */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof C10399x149eb6a1)) {
            return false;
        }
        C10399x149eb6a1 giftMoneySelectThemeAdapter$GiftMoneySelectThemeViewHolder_ViewBinding = (C10399x149eb6a1) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i != giftMoneySelectThemeAdapter$GiftMoneySelectThemeViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver || !C6958xd50139e8.write(write(this.read, i), write(giftMoneySelectThemeAdapter$GiftMoneySelectThemeViewHolder_ViewBinding.read, giftMoneySelectThemeAdapter$GiftMoneySelectThemeViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver))) {
            return false;
        }
        return true;
    }

    static C10399x149eb6a1 write(int i, InputStream inputStream) throws IOException {
        if (i > 0) {
            int read2 = inputStream.read();
            int i2 = i - 1;
            byte[] bArr = new byte[i2];
            if (i2 != 0) {
                if (C6961xbba4702b.MediaBrowserCompat$ItemReceiver(inputStream, bArr, i2) != i2) {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                } else if (read2 > 0 && read2 < 8) {
                    int i3 = i2 - 1;
                    if (bArr[i3] != ((byte) (bArr[i3] & (255 << read2)))) {
                        return new DiscoverFundFilterAdapter$CheckListHolder(bArr, read2);
                    }
                }
            }
            return new InvestmentDetailsClientListAdapter$ExpandableChildViewHolder(bArr, read2);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    /* access modifiers changed from: package-private */
    public final C10402xc503e64f RatingCompat() {
        return new InvestmentDetailsClientListAdapter$ExpandableChildViewHolder(this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* access modifiers changed from: package-private */
    public final C10402xc503e64f MediaDescriptionCompat() {
        return new DiscoverFundFilterAdapter$CheckListHolder(this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    protected static byte[] write(byte[] bArr, int i) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        if (i > 0) {
            int length = bArr.length - 1;
            bArr2[length] = (byte) ((255 << i) & bArr2[length]);
        }
        return bArr2;
    }
}
