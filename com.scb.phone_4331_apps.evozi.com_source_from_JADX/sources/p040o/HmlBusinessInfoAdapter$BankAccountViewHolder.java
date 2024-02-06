package p040o;

import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import net.p088sf.scuba.smartcards.ISOFileInfo;

/* renamed from: o.HmlBusinessInfoAdapter$BankAccountViewHolder */
public final class HmlBusinessInfoAdapter$BankAccountViewHolder extends C10402xc503e64f {
    private static final Map MediaBrowserCompat$ItemReceiver = new HashMap();
    private byte[] MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public static HmlBusinessInfoAdapter$BankAccountViewHolder write(Object obj) {
        if (obj == null || (obj instanceof HmlBusinessInfoAdapter$BankAccountViewHolder)) {
            return (HmlBusinessInfoAdapter$BankAccountViewHolder) obj;
        }
        if (obj instanceof HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = (HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) obj;
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem() instanceof HmlBusinessInfoAdapter$BankAccountViewHolder) {
                return (HmlBusinessInfoAdapter$BankAccountViewHolder) hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    private HmlBusinessInfoAdapter$BankAccountViewHolder(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr3.length; i++) {
            byte b = bArr3[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & Ascii.DEL));
                if ((b & ISOFileInfo.DATA_BYTES1) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (b & Ascii.DEL)));
                if ((b & ISOFileInfo.DATA_BYTES1) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.write = stringBuffer.toString();
        if (bArr3 == null) {
            bArr2 = null;
        } else {
            bArr2 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = bArr2;
    }

    public HmlBusinessInfoAdapter$BankAccountViewHolder(String str) {
        char charAt;
        if (str != null) {
            boolean z = false;
            if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
                z = IconCompatParcelizer(str, 2);
            }
            if (z) {
                this.write = str;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("string ");
            sb.append(str);
            sb.append(" not an OID");
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("'identifier' cannot be null");
    }

    public HmlBusinessInfoAdapter$BankAccountViewHolder(HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder, String str) {
        if (IconCompatParcelizer(str, 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
            sb.append(".");
            sb.append(str);
            this.write = sb.toString();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("string ");
        sb2.append(str);
        sb2.append(" not a valid OID branch");
        throw new IllegalArgumentException(sb2.toString());
    }

    private static void MediaBrowserCompat$ItemReceiver(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    private static void MediaBrowserCompat$ItemReceiver(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Ascii.DEL);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    private void MediaBrowserCompat$ItemReceiver(ByteArrayOutputStream byteArrayOutputStream) {
        DiscoverFundFilterListAdapter$SubTitleHolder discoverFundFilterListAdapter$SubTitleHolder = new DiscoverFundFilterListAdapter$SubTitleHolder(this.write);
        int parseInt = Integer.parseInt(discoverFundFilterListAdapter$SubTitleHolder.MediaBrowserCompat$ItemReceiver()) * 40;
        String MediaBrowserCompat$ItemReceiver2 = discoverFundFilterListAdapter$SubTitleHolder.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver2.length() <= 18) {
            MediaBrowserCompat$ItemReceiver(byteArrayOutputStream, ((long) parseInt) + Long.parseLong(MediaBrowserCompat$ItemReceiver2));
        } else {
            MediaBrowserCompat$ItemReceiver(byteArrayOutputStream, new BigInteger(MediaBrowserCompat$ItemReceiver2).add(BigInteger.valueOf((long) parseInt)));
        }
        while (true) {
            if (discoverFundFilterListAdapter$SubTitleHolder.MediaBrowserCompat$CustomActionResultReceiver != -1) {
                String MediaBrowserCompat$ItemReceiver3 = discoverFundFilterListAdapter$SubTitleHolder.MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver3.length() <= 18) {
                    MediaBrowserCompat$ItemReceiver(byteArrayOutputStream, Long.parseLong(MediaBrowserCompat$ItemReceiver3));
                } else {
                    MediaBrowserCompat$ItemReceiver(byteArrayOutputStream, new BigInteger(MediaBrowserCompat$ItemReceiver3));
                }
            } else {
                return;
            }
        }
    }

    private byte[] read() {
        byte[] bArr;
        synchronized (this) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                MediaBrowserCompat$ItemReceiver(byteArrayOutputStream);
                this.MediaBrowserCompat$CustomActionResultReceiver = byteArrayOutputStream.toByteArray();
            }
            bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        int length = read().length;
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(length) + 1 + length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] read = read();
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(6);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(read.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(read);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding == this) {
            return true;
        }
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlBusinessInfoAdapter$BankAccountViewHolder)) {
            return false;
        }
        return this.write.equals(((HmlBusinessInfoAdapter$BankAccountViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).write);
    }

    private static boolean IconCompatParcelizer(String str, int i) {
        boolean z;
        char charAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                charAt = str.charAt(length);
                if ('0' <= charAt && charAt <= '9') {
                    z = true;
                }
            }
            if (charAt != '.') {
                break;
            }
        } while (z);
        return false;
    }

    public final HmlBusinessInfoAdapter$BankAccountViewHolder MediaBrowserCompat$ItemReceiver() {
        synchronized (MediaBrowserCompat$ItemReceiver) {
            C10400xfa72b0a5 hmlBusinessInfoAdapter$BankAccountViewHolder$MediaBrowserCompat$CustomActionResultReceiver = new C10400xfa72b0a5(read());
            HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder$MediaBrowserCompat$CustomActionResultReceiver);
            if (hmlBusinessInfoAdapter$BankAccountViewHolder != null) {
                return hmlBusinessInfoAdapter$BankAccountViewHolder;
            }
            MediaBrowserCompat$ItemReceiver.put(hmlBusinessInfoAdapter$BankAccountViewHolder$MediaBrowserCompat$CustomActionResultReceiver, this);
            return this;
        }
    }

    static HmlBusinessInfoAdapter$BankAccountViewHolder write(byte[] bArr) {
        C10400xfa72b0a5 hmlBusinessInfoAdapter$BankAccountViewHolder$MediaBrowserCompat$CustomActionResultReceiver = new C10400xfa72b0a5(bArr);
        synchronized (MediaBrowserCompat$ItemReceiver) {
            HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder$MediaBrowserCompat$CustomActionResultReceiver);
            if (hmlBusinessInfoAdapter$BankAccountViewHolder != null) {
                return hmlBusinessInfoAdapter$BankAccountViewHolder;
            }
            return new HmlBusinessInfoAdapter$BankAccountViewHolder(bArr);
        }
    }

    public static HmlBusinessInfoAdapter$BankAccountViewHolder MediaBrowserCompat$ItemReceiver(HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = null;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
        } else {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
        }
        if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlBusinessInfoAdapter$BankAccountViewHolder) {
            return write((Object) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding);
        }
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 != null) {
            hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2.MediaBrowserCompat$MediaItem();
        }
        return write(C10905onItemClick.MediaBrowserCompat$ItemReceiver(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2).write());
    }

    public final String toString() {
        return this.write;
    }
}
