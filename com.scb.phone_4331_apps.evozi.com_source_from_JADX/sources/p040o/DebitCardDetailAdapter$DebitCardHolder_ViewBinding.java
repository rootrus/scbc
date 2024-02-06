package p040o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: o.DebitCardDetailAdapter$DebitCardHolder_ViewBinding */
public abstract class DebitCardDetailAdapter$DebitCardHolder_ViewBinding {
    private static final DepositOpenAccountSelectionAdapter$ListViewHolder IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver(TenureViewHolder.read, "--");
    private static final DepositOpenAccountSelectionAdapter$ListViewHolder MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(TenureViewHolder.read, ": ");
    private static final DepositOpenAccountSelectionAdapter$ListViewHolder read = MediaBrowserCompat$CustomActionResultReceiver(TenureViewHolder.read, "\r\n");
    final Charset MediaBrowserCompat$ItemReceiver;
    private String write;

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver(C9699x9b8f7d27 creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding, OutputStream outputStream) throws IOException;

    public abstract List<C9699x9b8f7d27> read();

    private static DepositOpenAccountSelectionAdapter$ListViewHolder MediaBrowserCompat$CustomActionResultReceiver(Charset charset, String str) {
        ByteBuffer encode = charset.encode(CharBuffer.wrap(str));
        DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder = new DepositOpenAccountSelectionAdapter$ListViewHolder(encode.remaining());
        depositOpenAccountSelectionAdapter$ListViewHolder.IconCompatParcelizer(encode.array(), encode.position(), encode.remaining());
        return depositOpenAccountSelectionAdapter$ListViewHolder;
    }

    public DebitCardDetailAdapter$DebitCardHolder_ViewBinding(Charset charset, String str) {
        C6431x12296157.write(str, "Multipart boundary");
        this.MediaBrowserCompat$ItemReceiver = charset == null ? TenureViewHolder.read : charset;
        this.write = str;
    }

    public final void IconCompatParcelizer(OutputStream outputStream, boolean z) throws IOException {
        DepositOpenAccountSelectionAdapter$ListViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, this.write);
        for (C9699x9b8f7d27 next : read()) {
            DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder = IconCompatParcelizer;
            outputStream.write(depositOpenAccountSelectionAdapter$ListViewHolder.IconCompatParcelizer, 0, depositOpenAccountSelectionAdapter$ListViewHolder.MediaBrowserCompat$ItemReceiver);
            outputStream.write(MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer, 0, MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver);
            DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder2 = read;
            outputStream.write(depositOpenAccountSelectionAdapter$ListViewHolder2.IconCompatParcelizer, 0, depositOpenAccountSelectionAdapter$ListViewHolder2.MediaBrowserCompat$ItemReceiver);
            MediaBrowserCompat$ItemReceiver(next, outputStream);
            DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder3 = read;
            outputStream.write(depositOpenAccountSelectionAdapter$ListViewHolder3.IconCompatParcelizer, 0, depositOpenAccountSelectionAdapter$ListViewHolder3.MediaBrowserCompat$ItemReceiver);
            if (z) {
                next.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(outputStream);
            }
            DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder4 = read;
            outputStream.write(depositOpenAccountSelectionAdapter$ListViewHolder4.IconCompatParcelizer, 0, depositOpenAccountSelectionAdapter$ListViewHolder4.MediaBrowserCompat$ItemReceiver);
        }
        DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder5 = IconCompatParcelizer;
        outputStream.write(depositOpenAccountSelectionAdapter$ListViewHolder5.IconCompatParcelizer, 0, depositOpenAccountSelectionAdapter$ListViewHolder5.MediaBrowserCompat$ItemReceiver);
        outputStream.write(MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer, 0, MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver);
        DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder6 = IconCompatParcelizer;
        outputStream.write(depositOpenAccountSelectionAdapter$ListViewHolder6.IconCompatParcelizer, 0, depositOpenAccountSelectionAdapter$ListViewHolder6.MediaBrowserCompat$ItemReceiver);
        DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder7 = read;
        outputStream.write(depositOpenAccountSelectionAdapter$ListViewHolder7.IconCompatParcelizer, 0, depositOpenAccountSelectionAdapter$ListViewHolder7.MediaBrowserCompat$ItemReceiver);
    }

    public final long IconCompatParcelizer() {
        long j = 0;
        for (C9699x9b8f7d27 creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding : read()) {
            long read2 = creditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.read();
            if (read2 < 0) {
                return -1;
            }
            j += read2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            IconCompatParcelizer((OutputStream) byteArrayOutputStream, false);
            return j + ((long) byteArrayOutputStream.toByteArray().length);
        } catch (IOException unused) {
            return -1;
        }
    }

    protected static void IconCompatParcelizer(DebitCardDetailAdapter$DebitCardHolder debitCardDetailAdapter$DebitCardHolder, OutputStream outputStream) throws IOException {
        DepositOpenAccountSelectionAdapter$ListViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(TenureViewHolder.read, debitCardDetailAdapter$DebitCardHolder.MediaBrowserCompat$ItemReceiver);
        outputStream.write(MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer, 0, MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver);
        DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder = MediaBrowserCompat$CustomActionResultReceiver;
        outputStream.write(depositOpenAccountSelectionAdapter$ListViewHolder.IconCompatParcelizer, 0, depositOpenAccountSelectionAdapter$ListViewHolder.MediaBrowserCompat$ItemReceiver);
        DepositOpenAccountSelectionAdapter$ListViewHolder MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(TenureViewHolder.read, debitCardDetailAdapter$DebitCardHolder.IconCompatParcelizer);
        outputStream.write(MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer, 0, MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver);
        DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder2 = read;
        outputStream.write(depositOpenAccountSelectionAdapter$ListViewHolder2.IconCompatParcelizer, 0, depositOpenAccountSelectionAdapter$ListViewHolder2.MediaBrowserCompat$ItemReceiver);
    }

    protected static void write(DebitCardDetailAdapter$DebitCardHolder debitCardDetailAdapter$DebitCardHolder, Charset charset, OutputStream outputStream) throws IOException {
        DepositOpenAccountSelectionAdapter$ListViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(charset, debitCardDetailAdapter$DebitCardHolder.MediaBrowserCompat$ItemReceiver);
        outputStream.write(MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer, 0, MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver);
        DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder = MediaBrowserCompat$CustomActionResultReceiver;
        outputStream.write(depositOpenAccountSelectionAdapter$ListViewHolder.IconCompatParcelizer, 0, depositOpenAccountSelectionAdapter$ListViewHolder.MediaBrowserCompat$ItemReceiver);
        DepositOpenAccountSelectionAdapter$ListViewHolder MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(charset, debitCardDetailAdapter$DebitCardHolder.IconCompatParcelizer);
        outputStream.write(MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer, 0, MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver);
        DepositOpenAccountSelectionAdapter$ListViewHolder depositOpenAccountSelectionAdapter$ListViewHolder2 = read;
        outputStream.write(depositOpenAccountSelectionAdapter$ListViewHolder2.IconCompatParcelizer, 0, depositOpenAccountSelectionAdapter$ListViewHolder2.MediaBrowserCompat$ItemReceiver);
    }
}
