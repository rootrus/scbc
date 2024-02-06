package p040o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.PolicyCardAdapter$PolicyCardViewHolder_ViewBinding */
final class PolicyCardAdapter$PolicyCardViewHolder_ViewBinding extends InputStream {
    private InputStream IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = true;
    private final HmlDocumentsUploadedAdapter$DocumentViewHolder write;

    PolicyCardAdapter$PolicyCardViewHolder_ViewBinding(HmlDocumentsUploadedAdapter$DocumentViewHolder hmlDocumentsUploadedAdapter$DocumentViewHolder) {
        this.write = hmlDocumentsUploadedAdapter$DocumentViewHolder;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        HmlDocumentListAdapter$DocumentViewHolder hmlDocumentListAdapter$DocumentViewHolder;
        int i3 = 0;
        if (this.IconCompatParcelizer == null) {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver || (hmlDocumentListAdapter$DocumentViewHolder = (HmlDocumentListAdapter$DocumentViewHolder) this.write.IconCompatParcelizer()) == null) {
                return -1;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
            this.IconCompatParcelizer = hmlDocumentListAdapter$DocumentViewHolder.MediaBrowserCompat$ItemReceiver();
        }
        while (true) {
            int read = this.IconCompatParcelizer.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                HmlDocumentListAdapter$DocumentViewHolder hmlDocumentListAdapter$DocumentViewHolder2 = (HmlDocumentListAdapter$DocumentViewHolder) this.write.IconCompatParcelizer();
                if (hmlDocumentListAdapter$DocumentViewHolder2 == null) {
                    this.IconCompatParcelizer = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.IconCompatParcelizer = hmlDocumentListAdapter$DocumentViewHolder2.MediaBrowserCompat$ItemReceiver();
            }
        }
    }

    public final int read() throws IOException {
        HmlDocumentListAdapter$DocumentViewHolder hmlDocumentListAdapter$DocumentViewHolder;
        if (this.IconCompatParcelizer == null) {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver || (hmlDocumentListAdapter$DocumentViewHolder = (HmlDocumentListAdapter$DocumentViewHolder) this.write.IconCompatParcelizer()) == null) {
                return -1;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
            this.IconCompatParcelizer = hmlDocumentListAdapter$DocumentViewHolder.MediaBrowserCompat$ItemReceiver();
        }
        while (true) {
            int read = this.IconCompatParcelizer.read();
            if (read >= 0) {
                return read;
            }
            HmlDocumentListAdapter$DocumentViewHolder hmlDocumentListAdapter$DocumentViewHolder2 = (HmlDocumentListAdapter$DocumentViewHolder) this.write.IconCompatParcelizer();
            if (hmlDocumentListAdapter$DocumentViewHolder2 == null) {
                this.IconCompatParcelizer = null;
                return -1;
            }
            this.IconCompatParcelizer = hmlDocumentListAdapter$DocumentViewHolder2.MediaBrowserCompat$ItemReceiver();
        }
    }
}
