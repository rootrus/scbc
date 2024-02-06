package p040o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.HmlDocumentListAdapter$DocumentViewHolder_ViewBinding */
public class HmlDocumentListAdapter$DocumentViewHolder_ViewBinding {
    OutputStream read;

    public HmlDocumentListAdapter$DocumentViewHolder_ViewBinding(OutputStream outputStream) {
        this.read = outputStream;
    }

    /* access modifiers changed from: package-private */
    public final void read(int i) throws IOException {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            IconCompatParcelizer((byte) (i3 | 128));
            for (int i4 = (i3 - 1) << 3; i4 >= 0; i4 -= 8) {
                IconCompatParcelizer((byte) (i >> i4));
            }
            return;
        }
        IconCompatParcelizer((byte) i);
    }

    /* access modifiers changed from: package-private */
    public void IconCompatParcelizer(int i) throws IOException {
        this.read.write(i);
    }

    /* access modifiers changed from: package-private */
    public final void write(int i, int i2) throws IOException {
        if (i2 < 31) {
            IconCompatParcelizer(i | i2);
            return;
        }
        IconCompatParcelizer(i | 31);
        if (i2 < 128) {
            IconCompatParcelizer(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        this.read.write(bArr, i3, 5 - i3);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(int i, int i2, byte[] bArr) throws IOException {
        write(32, 8);
        read(bArr.length);
        this.read.write(bArr);
    }

    public void MediaBrowserCompat$ItemReceiver(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) throws IOException {
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
            hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem().IconCompatParcelizer(this);
            return;
        }
        throw new IOException("null object detected");
    }

    /* access modifiers changed from: package-private */
    public HmlDocumentListAdapter$DocumentViewHolder_ViewBinding IconCompatParcelizer() {
        return new InvestmentDetailsClientListAdapter$SingleViewHolder_ViewBinding(this.read);
    }

    /* access modifiers changed from: package-private */
    public HmlDocumentListAdapter$DocumentViewHolder_ViewBinding write() {
        return new RiskLevelsAdapter$RiskLevelHolder_ViewBinding(this.read);
    }
}
