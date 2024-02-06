package org.jmrtd.lds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import net.p088sf.scuba.tlv.TLVInputStream;
import net.p088sf.scuba.tlv.TLVOutputStream;
import org.jmrtd.p100io.SplittableInputStream;

public abstract class AbstractTaggedLDSFile extends AbstractLDSFile {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -4761360877353069639L;
    private int length;
    private int tag;

    /* access modifiers changed from: protected */
    public abstract void readContent(InputStream inputStream) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void writeContent(OutputStream outputStream) throws IOException;

    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public AbstractTaggedLDSFile(int i) {
        this.tag = i;
    }

    public AbstractTaggedLDSFile(int i, InputStream inputStream) throws IOException {
        this.tag = i;
        readObject(inputStream);
    }

    /* access modifiers changed from: protected */
    public void readObject(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int write = tLVInputStream.write();
        if (write == this.tag) {
            this.length = tLVInputStream.IconCompatParcelizer();
            readContent(new SplittableInputStream(inputStream, this.length));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Was expecting tag ");
        sb.append(Integer.toHexString(this.tag));
        sb.append(", found ");
        sb.append(Integer.toHexString(write));
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void writeObject(OutputStream outputStream) throws IOException {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        int tag2 = getTag();
        if (this.tag != tag2) {
            this.tag = tag2;
        }
        tLVOutputStream.IconCompatParcelizer(tag2);
        byte[] content = getContent();
        int length2 = content.length;
        if (this.length != length2) {
            this.length = length2;
        }
        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(content);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TaggedLDSFile [");
        sb.append(Integer.toHexString(getTag()));
        sb.append(" (");
        sb.append(getLength());
        sb.append(")]");
        return sb.toString();
    }

    public int getTag() {
        return this.tag;
    }

    private byte[] getContent() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeContent(byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            return null;
        }
    }

    public int getLength() {
        if (this.length <= 0) {
            this.length = getContent().length;
        }
        return this.length;
    }
}
