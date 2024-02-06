package org.jmrtd.lds;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import net.p088sf.scuba.tlv.TLVOutputStream;
import org.jmrtd.cbeff.BiometricDataBlock;

public abstract class CBEFFDataGroup<R extends BiometricDataBlock> extends DataGroup {
    protected static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 2702959939408371946L;
    private Random random = new Random();
    private List<R> subRecords;

    public CBEFFDataGroup(int i, List<R> list) {
        super(i);
        addAll(list);
    }

    public CBEFFDataGroup(int i, InputStream inputStream) throws IOException {
        super(i, inputStream);
    }

    public void add(R r) {
        if (this.subRecords == null) {
            this.subRecords = new ArrayList();
        }
        this.subRecords.add(r);
    }

    public void addAll(List<R> list) {
        if (this.subRecords == null) {
            this.subRecords = new ArrayList();
        }
        this.subRecords.addAll(list);
    }

    public void remove(int i) {
        if (this.subRecords == null) {
            this.subRecords = new ArrayList();
        }
        this.subRecords.remove(i);
    }

    public List<R> getSubRecords() {
        if (this.subRecords == null) {
            this.subRecords = new ArrayList();
        }
        return new ArrayList(this.subRecords);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CBEFFDataGroup)) {
            return false;
        }
        try {
            List subRecords2 = getSubRecords();
            List subRecords3 = ((CBEFFDataGroup) obj).getSubRecords();
            int size = subRecords2.size();
            if (size != subRecords3.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                BiometricDataBlock biometricDataBlock = (BiometricDataBlock) subRecords2.get(i);
                BiometricDataBlock biometricDataBlock2 = (BiometricDataBlock) subRecords3.get(i);
                if (biometricDataBlock == null) {
                    if (biometricDataBlock2 != null) {
                        return false;
                    }
                } else if (!biometricDataBlock.equals(biometricDataBlock2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int i = 1234567891;
        for (BiometricDataBlock biometricDataBlock : getSubRecords()) {
            if (biometricDataBlock == null) {
                i = (i * 3) + 5;
            } else {
                i = ((i + biometricDataBlock.hashCode()) * 5) + 7;
            }
        }
        return (i * 7) + 11;
    }

    /* access modifiers changed from: protected */
    public void writeOptionalRandomData(OutputStream outputStream) throws IOException {
        if (this.subRecords.size() == 0) {
            TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
            tLVOutputStream.IconCompatParcelizer(83);
            byte[] bArr = new byte[8];
            this.random.nextBytes(bArr);
            tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(bArr);
        }
    }
}
