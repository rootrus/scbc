package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import p040o.OPRRewardAdapter;

@Deprecated
/* renamed from: o.ExportCardStatementSelectionAdapter$ItemSelectionViewHolder_ViewBinding */
public abstract class C9731xd43d39d5 implements OPRRewardTiersAdapter$TierViewHolder_ViewBinding, OPRRewardAdapter.RewardViewHolder {
    private CharBuffer IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private byte[] MediaBrowserCompat$ItemReceiver;
    private DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int f5506x50fd9e4a;
    private Charset MediaDescriptionCompat;
    private CharsetDecoder MediaMetadataCompat;
    private CodingErrorAction MediaSessionCompat$QueueItem;
    private MyECouponViewHolder MediaSessionCompat$Token;
    private CodingErrorAction ParcelableVolumeInfo;
    private InputStream RatingCompat;
    private boolean read;
    private int write;

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(InputStream inputStream, int i, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(inputStream, "Input stream");
        DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(i, "Buffer size");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        this.RatingCompat = inputStream;
        this.MediaBrowserCompat$ItemReceiver = new byte[i];
        this.write = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        this.MediaBrowserCompat$MediaItem = new DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding(i);
        String str = (String) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.protocol.element-charset");
        Charset forName = str != null ? Charset.forName(str) : PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaDescriptionCompat = forName;
        this.read = forName.equals(PrepaidRequestProductCatalogActivity.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompat$SearchResultReceiver = amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.connection.max-line-length", -1);
        this.f5506x50fd9e4a = amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.connection.min-chunk-limit", 512);
        this.MediaSessionCompat$Token = new MyECouponViewHolder();
        CodingErrorAction codingErrorAction = (CodingErrorAction) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.malformed.input.action");
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.ParcelableVolumeInfo = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.unmappable.input.action");
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.MediaSessionCompat$QueueItem = codingErrorAction2;
    }

    public final int MediaDescriptionCompat() {
        return this.MediaBrowserCompat$CustomActionResultReceiver - this.write;
    }

    /* access modifiers changed from: protected */
    public int write() throws IOException {
        int i = this.write;
        if (i > 0) {
            int i2 = this.MediaBrowserCompat$CustomActionResultReceiver - i;
            if (i2 > 0) {
                byte[] bArr = this.MediaBrowserCompat$ItemReceiver;
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            this.write = 0;
            this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        }
        int i3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        byte[] bArr2 = this.MediaBrowserCompat$ItemReceiver;
        int read2 = this.RatingCompat.read(bArr2, i3, bArr2.length - i3);
        if (read2 == -1) {
            return -1;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = i3 + read2;
        this.MediaSessionCompat$Token.write += (long) read2;
        return read2;
    }

    /* access modifiers changed from: protected */
    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.write < this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r3 != -1) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(p040o.DepositTransactionAdapter$ChildViewHolder_ViewBinding r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "Char array buffer"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r9, (java.lang.String) r0)
            r0 = 0
            r1 = 1
            r3 = r0
            r2 = r1
        L_0x0009:
            r4 = -1
            if (r2 == 0) goto L_0x009e
            int r5 = r8.write
        L_0x000e:
            int r6 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r5 >= r6) goto L_0x001e
            byte[] r6 = r8.MediaBrowserCompat$ItemReceiver
            byte r6 = r6[r5]
            r7 = 10
            if (r6 != r7) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            int r5 = r5 + 1
            goto L_0x000e
        L_0x001e:
            r5 = r4
        L_0x001f:
            if (r5 == r4) goto L_0x0065
            o.DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding r2 = r8.MediaBrowserCompat$MediaItem
            int r2 = r2.MediaBrowserCompat$ItemReceiver
            if (r2 != 0) goto L_0x0029
            r2 = r1
            goto L_0x002a
        L_0x0029:
            r2 = r0
        L_0x002a:
            if (r2 == 0) goto L_0x0055
            int r0 = r8.write
            int r1 = r5 + 1
            r8.write = r1
            if (r5 <= r0) goto L_0x003f
            byte[] r1 = r8.MediaBrowserCompat$ItemReceiver
            int r2 = r5 + -1
            byte r1 = r1[r2]
            r3 = 13
            if (r1 != r3) goto L_0x003f
            r5 = r2
        L_0x003f:
            int r5 = r5 - r0
            boolean r1 = r8.read
            if (r1 == 0) goto L_0x004a
            byte[] r1 = r8.MediaBrowserCompat$ItemReceiver
            r9.write((byte[]) r1, (int) r0, (int) r5)
            goto L_0x0054
        L_0x004a:
            byte[] r1 = r8.MediaBrowserCompat$ItemReceiver
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1, r0, r5)
            int r5 = r8.MediaBrowserCompat$ItemReceiver(r9, r0)
        L_0x0054:
            return r5
        L_0x0055:
            int r5 = r5 + 1
            int r2 = r8.write
            o.DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding r4 = r8.MediaBrowserCompat$MediaItem
            byte[] r6 = r8.MediaBrowserCompat$ItemReceiver
            int r7 = r5 - r2
            r4.read(r6, r2, r7)
            r8.write = r5
            goto L_0x0087
        L_0x0065:
            int r3 = r8.write
            int r5 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r3 >= r5) goto L_0x006d
            r3 = r1
            goto L_0x006e
        L_0x006d:
            r3 = r0
        L_0x006e:
            if (r3 == 0) goto L_0x0080
            int r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r8.write
            o.DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding r6 = r8.MediaBrowserCompat$MediaItem
            byte[] r7 = r8.MediaBrowserCompat$ItemReceiver
            int r3 = r3 - r5
            r6.read(r7, r5, r3)
            int r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            r8.write = r3
        L_0x0080:
            int r3 = r8.write()
            if (r3 == r4) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r2 = r0
        L_0x0088:
            int r4 = r8.MediaBrowserCompat$SearchResultReceiver
            if (r4 <= 0) goto L_0x0009
            o.DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding r4 = r8.MediaBrowserCompat$MediaItem
            int r4 = r4.MediaBrowserCompat$ItemReceiver
            int r5 = r8.MediaBrowserCompat$SearchResultReceiver
            if (r4 >= r5) goto L_0x0096
            goto L_0x0009
        L_0x0096:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Maximum line length limit exceeded"
            r9.<init>(r0)
            throw r9
        L_0x009e:
            if (r3 != r4) goto L_0x00aa
            o.DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding r2 = r8.MediaBrowserCompat$MediaItem
            int r2 = r2.MediaBrowserCompat$ItemReceiver
            if (r2 != 0) goto L_0x00a7
            r0 = r1
        L_0x00a7:
            if (r0 == 0) goto L_0x00aa
            return r4
        L_0x00aa:
            int r9 = r8.MediaBrowserCompat$ItemReceiver(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C9731xd43d39d5.read(o.DepositTransactionAdapter$ChildViewHolder_ViewBinding):int");
    }

    private int MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding) throws IOException {
        int i = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
        if (i > 0) {
            int i2 = i - 1;
            if (this.MediaBrowserCompat$MediaItem.read[i2] == 10) {
                i = i2;
            }
            if (i > 0) {
                int i3 = i - 1;
                if (this.MediaBrowserCompat$MediaItem.read[i3] == 13) {
                    i = i3;
                }
            }
        }
        if (this.read) {
            DepositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding = this.MediaBrowserCompat$MediaItem;
            if (depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding != null) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.write(depositOpenAccountSelectionAdapter$ListViewHolder_ViewBinding.read, 0, i);
            }
        } else {
            i = MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, ByteBuffer.wrap(this.MediaBrowserCompat$MediaItem.read, 0, i));
        }
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver = 0;
        return i;
    }

    private int MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, ByteBuffer byteBuffer) throws IOException {
        int i = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.MediaMetadataCompat == null) {
            CharsetDecoder newDecoder = this.MediaDescriptionCompat.newDecoder();
            this.MediaMetadataCompat = newDecoder;
            newDecoder.onMalformedInput(this.ParcelableVolumeInfo);
            this.MediaMetadataCompat.onUnmappableCharacter(this.MediaSessionCompat$QueueItem);
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = CharBuffer.allocate(1024);
        }
        this.MediaMetadataCompat.reset();
        while (byteBuffer.hasRemaining()) {
            i += IconCompatParcelizer(this.MediaMetadataCompat.decode(byteBuffer, this.IconCompatParcelizer, true), depositTransactionAdapter$ChildViewHolder_ViewBinding);
        }
        int IconCompatParcelizer2 = IconCompatParcelizer(this.MediaMetadataCompat.flush(this.IconCompatParcelizer), depositTransactionAdapter$ChildViewHolder_ViewBinding);
        this.IconCompatParcelizer.clear();
        return i + IconCompatParcelizer2;
    }

    private int IconCompatParcelizer(CoderResult coderResult, DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding) throws IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.IconCompatParcelizer.flip();
        int remaining = this.IconCompatParcelizer.remaining();
        while (this.IconCompatParcelizer.hasRemaining()) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read(this.IconCompatParcelizer.get());
        }
        this.IconCompatParcelizer.compact();
        return remaining;
    }

    public final loadInBackground MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaSessionCompat$Token;
    }

    public final int read() throws IOException {
        do {
            if (this.write < this.MediaBrowserCompat$CustomActionResultReceiver) {
                byte[] bArr = this.MediaBrowserCompat$ItemReceiver;
                int i = this.write;
                this.write = i + 1;
                return bArr[i] & 255;
            }
        } while (write() != -1);
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return 0;
        }
        if (this.write < this.MediaBrowserCompat$CustomActionResultReceiver) {
            int min = Math.min(i2, this.MediaBrowserCompat$CustomActionResultReceiver - this.write);
            System.arraycopy(this.MediaBrowserCompat$ItemReceiver, this.write, bArr, i, min);
            this.write += min;
            return min;
        } else if (i2 > this.f5506x50fd9e4a) {
            int read2 = this.RatingCompat.read(bArr, i, i2);
            if (read2 > 0) {
                this.MediaSessionCompat$Token.write += (long) read2;
            }
            return read2;
        } else {
            do {
                if (this.write < this.MediaBrowserCompat$CustomActionResultReceiver) {
                    int min2 = Math.min(i2, this.MediaBrowserCompat$CustomActionResultReceiver - this.write);
                    System.arraycopy(this.MediaBrowserCompat$ItemReceiver, this.write, bArr, i, min2);
                    this.write += min2;
                    return min2;
                }
            } while (write() != -1);
            return -1;
        }
    }
}
