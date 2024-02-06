package org.jmrtd.lds.icao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import net.p088sf.scuba.tlv.TLVInputStream;
import net.p088sf.scuba.tlv.TLVOutputStream;
import org.jmrtd.lds.DataGroup;
import p040o.AlertController$RecycleListView;

public class DG1File extends DataGroup {
    private static final short MRZ_INFO_TAG = 24351;
    private static final long serialVersionUID = 5091606125728809058L;
    private MRZInfo mrzInfo;

    public DG1File(MRZInfo mRZInfo) {
        super(97);
        this.mrzInfo = mRZInfo;
    }

    public DG1File(InputStream inputStream) throws IOException {
        super(97, inputStream);
    }

    public void readContent(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        while (true) {
            if (!tLVInputStream.IconCompatParcelizer.read) {
                if (tLVInputStream.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) {
                    tLVInputStream.IconCompatParcelizer();
                    if (AlertController$RecycleListView.IconCompatParcelizer(tLVInputStream.IconCompatParcelizer.write())) {
                        tLVInputStream.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                } else if (AlertController$RecycleListView.IconCompatParcelizer(tLVInputStream.IconCompatParcelizer.write())) {
                    tLVInputStream.MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
            int write = tLVInputStream.write();
            if (write == 24351 || (AlertController$RecycleListView.IconCompatParcelizer(write) && ((int) tLVInputStream.MediaBrowserCompat$CustomActionResultReceiver()) < tLVInputStream.IconCompatParcelizer())) {
                this.mrzInfo = new MRZInfo(tLVInputStream, tLVInputStream.IconCompatParcelizer());
            }
        }
        this.mrzInfo = new MRZInfo(tLVInputStream, tLVInputStream.IconCompatParcelizer());
    }

    public MRZInfo getMRZInfo() {
        return this.mrzInfo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DG1File ");
        sb.append(this.mrzInfo.toString().replaceAll("\n", "").trim());
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(getClass())) {
            return this.mrzInfo.equals(((DG1File) obj).mrzInfo);
        }
        return false;
    }

    public int hashCode() {
        return (this.mrzInfo.hashCode() * 3) + 57;
    }

    public void writeContent(OutputStream outputStream) throws IOException {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.IconCompatParcelizer(24351);
        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.mrzInfo.getEncoded());
    }
}
