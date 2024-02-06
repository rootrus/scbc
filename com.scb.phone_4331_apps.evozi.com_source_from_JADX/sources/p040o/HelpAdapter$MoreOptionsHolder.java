package p040o;

import com.google.common.base.Ascii;
import java.io.IOException;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.spongycastle.asn1.ASN1ParsingException;

/* renamed from: o.HelpAdapter$MoreOptionsHolder */
public abstract class HelpAdapter$MoreOptionsHolder extends C10402xc503e64f {
    protected final byte[] IconCompatParcelizer;
    protected final int MediaBrowserCompat$ItemReceiver;
    protected final boolean read;

    HelpAdapter$MoreOptionsHolder(boolean z, int i, byte[] bArr) {
        this.read = z;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.IconCompatParcelizer = bArr;
    }

    public final boolean IconCompatParcelizer() {
        return this.read;
    }

    public final byte[] write() {
        return this.IconCompatParcelizer;
    }

    public final int read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final C10402xc503e64f MediaBrowserCompat$ItemReceiver() throws IOException {
        int i;
        byte[] ParcelableVolumeInfo = ParcelableVolumeInfo();
        if ((ParcelableVolumeInfo[0] & Ascii.f3259US) == 31) {
            i = 2;
            byte b = ParcelableVolumeInfo[1] & 255;
            if ((b & Ascii.DEL) != 0) {
                while (b >= 0 && (b & ISOFileInfo.DATA_BYTES1) != 0) {
                    b = ParcelableVolumeInfo[i] & 255;
                    i++;
                }
            } else {
                throw new ASN1ParsingException("corrupted stream - invalid high tag number found");
            }
        } else {
            i = 1;
        }
        int length = (ParcelableVolumeInfo.length - i) + 1;
        byte[] bArr = new byte[length];
        System.arraycopy(ParcelableVolumeInfo, i, bArr, 1, length - 1);
        bArr[0] = 16;
        if ((ParcelableVolumeInfo[0] & 32) != 0) {
            bArr[0] = (byte) (bArr[0] | 32);
        }
        return new CompanyItemViewHolder(bArr).MediaBrowserCompat$ItemReceiver();
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.read(this.MediaBrowserCompat$ItemReceiver) + DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.IconCompatParcelizer.length) + this.IconCompatParcelizer.length;
    }

    /* access modifiers changed from: package-private */
    public void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        int i = this.read ? 96 : 64;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        byte[] bArr = this.IconCompatParcelizer;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.write(i, i2);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HelpAdapter$MoreOptionsHolder)) {
            return false;
        }
        HelpAdapter$MoreOptionsHolder helpAdapter$MoreOptionsHolder = (HelpAdapter$MoreOptionsHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        if (this.read == helpAdapter$MoreOptionsHolder.read && this.MediaBrowserCompat$ItemReceiver == helpAdapter$MoreOptionsHolder.MediaBrowserCompat$ItemReceiver && C6958xd50139e8.write(this.IconCompatParcelizer, helpAdapter$MoreOptionsHolder.IconCompatParcelizer)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.read ^ this.MediaBrowserCompat$ItemReceiver) ^ C6958xd50139e8.read(this.IconCompatParcelizer) ? 1 : 0;
    }
}
