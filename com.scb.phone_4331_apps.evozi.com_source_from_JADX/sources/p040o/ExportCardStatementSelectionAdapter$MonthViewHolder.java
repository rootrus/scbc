package p040o;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import p040o.OPRRewardAdapter;

@Deprecated
/* renamed from: o.ExportCardStatementSelectionAdapter$MonthViewHolder */
public abstract class ExportCardStatementSelectionAdapter$MonthViewHolder implements OPRRewardTiersAdapter$TierViewHolder, OPRRewardAdapter.RewardViewHolder {
    private static final byte[] MediaBrowserCompat$CustomActionResultReceiver = {13, 10};
    private boolean IconCompatParcelizer;
    private ByteBuffer MediaBrowserCompat$ItemReceiver;
    private CodingErrorAction MediaBrowserCompat$MediaItem;
    private CharsetEncoder MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private OutputStream f5507x50fd9e4a;
    private CodingErrorAction MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private MyECouponViewHolder RatingCompat;
    private Charset read;
    private DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding write;

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(OutputStream outputStream, int i, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(outputStream, "Input stream");
        DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(i, "Buffer size");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        this.f5507x50fd9e4a = outputStream;
        this.write = new DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding(i);
        String str = (String) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.protocol.element-charset");
        Charset forName = str != null ? Charset.forName(str) : PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver;
        this.read = forName;
        this.IconCompatParcelizer = forName.equals(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.MediaMetadataCompat = amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.connection.min-chunk-limit", 512);
        this.RatingCompat = new MyECouponViewHolder();
        CodingErrorAction codingErrorAction = (CodingErrorAction) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.malformed.input.action");
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.MediaDescriptionCompat = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.unmappable.input.action");
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.MediaBrowserCompat$MediaItem = codingErrorAction2;
    }

    public final int MediaDescriptionCompat() {
        return this.write.MediaBrowserCompat$ItemReceiver;
    }

    private void MediaBrowserCompat$ItemReceiver() throws IOException {
        int i = this.write.MediaBrowserCompat$ItemReceiver;
        if (i > 0) {
            this.f5507x50fd9e4a.write(this.write.read, 0, i);
            this.write.MediaBrowserCompat$ItemReceiver = 0;
            this.RatingCompat.write += (long) i;
        }
    }

    public final void write() throws IOException {
        MediaBrowserCompat$ItemReceiver();
        this.f5507x50fd9e4a.flush();
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            if (i2 > this.MediaMetadataCompat || i2 > this.write.read.length) {
                MediaBrowserCompat$ItemReceiver();
                this.f5507x50fd9e4a.write(bArr, i, i2);
                this.RatingCompat.write += (long) i2;
                return;
            }
            if (i2 > this.write.read.length - this.write.MediaBrowserCompat$ItemReceiver) {
                MediaBrowserCompat$ItemReceiver();
            }
            this.write.read(bArr, i, i2);
        }
    }

    public final void write(int i) throws IOException {
        DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding = this.write;
        if (depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver == depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding.read.length) {
            MediaBrowserCompat$ItemReceiver();
        }
        this.write.read(i);
    }

    public final void write(String str) throws IOException {
        if (str != null) {
            if (str.length() > 0) {
                if (this.IconCompatParcelizer) {
                    for (int i = 0; i < str.length(); i++) {
                        write((int) str.charAt(i));
                    }
                } else {
                    MediaBrowserCompat$ItemReceiver(CharBuffer.wrap(str));
                }
            }
            byte[] bArr = MediaBrowserCompat$CustomActionResultReceiver;
            if (bArr != null) {
                write(bArr, 0, bArr.length);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding) throws IOException {
        char[] cArr;
        int i;
        if (depositTransactionAdapter$ChildViewHolder_ViewBinding != null) {
            if (this.IconCompatParcelizer) {
                int length = depositTransactionAdapter$ChildViewHolder_ViewBinding.length();
                int i2 = 0;
                while (length > 0) {
                    int min = Math.min(this.write.read.length - this.write.MediaBrowserCompat$ItemReceiver, length);
                    if (min > 0) {
                        DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding = this.write;
                        if (!(depositTransactionAdapter$ChildViewHolder_ViewBinding == null || (cArr = depositTransactionAdapter$ChildViewHolder_ViewBinding.write) == null)) {
                            if (i2 < 0 || i2 > cArr.length || min < 0 || (i = i2 + min) < 0 || i > cArr.length) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("off: ");
                                sb.append(i2);
                                sb.append(" len: ");
                                sb.append(min);
                                sb.append(" b.length: ");
                                sb.append(cArr.length);
                                throw new IndexOutOfBoundsException(sb.toString());
                            } else if (min != 0) {
                                int i3 = depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
                                int i4 = min + i3;
                                if (i4 > depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding.read.length) {
                                    depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(i4);
                                }
                                int i5 = i2;
                                while (i3 < i4) {
                                    if ((cArr[i5] < ' ' || cArr[i5] > '~') && (cArr[i5] < 160 || cArr[i5] > 255)) {
                                        depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding.read[i3] = 63;
                                    } else {
                                        depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding.read[i3] = (byte) cArr[i5];
                                    }
                                    i5++;
                                    i3++;
                                }
                                depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver = i4;
                            }
                        }
                    }
                    DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding2 = this.write;
                    if (depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding2.MediaBrowserCompat$ItemReceiver == depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding2.read.length) {
                        MediaBrowserCompat$ItemReceiver();
                    }
                    i2 += min;
                    length -= min;
                }
            } else {
                MediaBrowserCompat$ItemReceiver(CharBuffer.wrap(depositTransactionAdapter$ChildViewHolder_ViewBinding.write, 0, depositTransactionAdapter$ChildViewHolder_ViewBinding.length()));
            }
            byte[] bArr = MediaBrowserCompat$CustomActionResultReceiver;
            if (bArr != null) {
                write(bArr, 0, bArr.length);
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(CharBuffer charBuffer) throws IOException {
        if (charBuffer.hasRemaining()) {
            if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                CharsetEncoder newEncoder = this.read.newEncoder();
                this.MediaBrowserCompat$SearchResultReceiver = newEncoder;
                newEncoder.onMalformedInput(this.MediaDescriptionCompat);
                this.MediaBrowserCompat$SearchResultReceiver.onUnmappableCharacter(this.MediaBrowserCompat$MediaItem);
            }
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                this.MediaBrowserCompat$ItemReceiver = ByteBuffer.allocate(1024);
            }
            this.MediaBrowserCompat$SearchResultReceiver.reset();
            while (charBuffer.hasRemaining()) {
                read(this.MediaBrowserCompat$SearchResultReceiver.encode(charBuffer, this.MediaBrowserCompat$ItemReceiver, true));
            }
            read(this.MediaBrowserCompat$SearchResultReceiver.flush(this.MediaBrowserCompat$ItemReceiver));
            this.MediaBrowserCompat$ItemReceiver.clear();
        }
    }

    private void read(CoderResult coderResult) throws IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.MediaBrowserCompat$ItemReceiver.flip();
        while (this.MediaBrowserCompat$ItemReceiver.hasRemaining()) {
            byte b = this.MediaBrowserCompat$ItemReceiver.get();
            DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding = this.write;
            if (depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver == depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding.read.length) {
                MediaBrowserCompat$ItemReceiver();
            }
            this.write.read(b);
        }
        this.MediaBrowserCompat$ItemReceiver.compact();
    }

    public final loadInBackground MediaBrowserCompat$CustomActionResultReceiver() {
        return this.RatingCompat;
    }
}
