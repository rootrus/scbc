package org.jmrtd.lds;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import net.p088sf.scuba.tlv.TLVInputStream;
import net.p088sf.scuba.tlv.TLVOutputStream;
import p040o.AlertController$RecycleListView;

public class DisplayedImageInfo extends AbstractImageInfo {
    public static final int DISPLAYED_PORTRAIT_TAG = 24384;
    public static final int DISPLAYED_SIGNATURE_OR_MARK_TAG = 24387;
    private static final long serialVersionUID = 3801320585294302721L;
    private int displayedImageTag;

    public DisplayedImageInfo(int i, byte[] bArr) {
        super(i);
        this.displayedImageTag = getDisplayedImageTagFromType(i);
        setMimeType(getMimeTypeFromType(i));
        setImageBytes(bArr);
    }

    public DisplayedImageInfo(InputStream inputStream) throws IOException {
        readObject(inputStream);
    }

    /* access modifiers changed from: protected */
    public void readObject(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int write = tLVInputStream.write();
        this.displayedImageTag = write;
        if (write == 24384 || write == 24387) {
            int typeFromDisplayedImageTag = getTypeFromDisplayedImageTag(this.displayedImageTag);
            setType(typeFromDisplayedImageTag);
            setMimeType(getMimeTypeFromType(typeFromDisplayedImageTag));
            readImage(tLVInputStream, (long) tLVInputStream.IconCompatParcelizer());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected tag 0x5F40 or 0x5F43, found ");
        sb.append(Integer.toHexString(this.displayedImageTag));
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void writeObject(OutputStream outputStream) throws IOException {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.IconCompatParcelizer(getDisplayedImageTagFromType(getType()));
        writeImage(tLVOutputStream);
        tLVOutputStream.write();
    }

    /* access modifiers changed from: package-private */
    public int getDisplayedImageTag() {
        return this.displayedImageTag;
    }

    public long getRecordLength() {
        int imageLength = getImageLength();
        return ((long) AlertController$RecycleListView.read(getDisplayedImageTagFromType(getType())).length) + ((long) AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(imageLength).length) + ((long) imageLength);
    }

    private static String getMimeTypeFromType(int i) {
        if (i == 0 || i == 1) {
            return ImageInfo.JPEG_MIME_TYPE;
        }
        if (i == 2) {
            return ImageInfo.WSQ_MIME_TYPE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown type: ");
        sb.append(Integer.toHexString(i));
        throw new NumberFormatException(sb.toString());
    }

    private static int getDisplayedImageTagFromType(int i) {
        if (i == 0) {
            return 24384;
        }
        if (i == 1) {
            return 24387;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown type: ");
        sb.append(Integer.toHexString(i));
        throw new NumberFormatException(sb.toString());
    }

    private static int getTypeFromDisplayedImageTag(int i) {
        if (i == 24384) {
            return 0;
        }
        if (i == 24387) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown tag: ");
        sb.append(Integer.toHexString(i));
        throw new NumberFormatException(sb.toString());
    }
}
