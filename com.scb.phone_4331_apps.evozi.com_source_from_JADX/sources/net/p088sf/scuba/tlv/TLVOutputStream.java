package net.p088sf.scuba.tlv;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p040o.AlertController$RecycleListView;
import p040o.TouchPointPinActivity;

/* renamed from: net.sf.scuba.tlv.TLVOutputStream */
public class TLVOutputStream extends OutputStream {
    private TouchPointPinActivity IconCompatParcelizer;
    private DataOutputStream MediaBrowserCompat$ItemReceiver;

    public TLVOutputStream(OutputStream outputStream) {
        this.MediaBrowserCompat$ItemReceiver = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        this.IconCompatParcelizer = new TouchPointPinActivity();
    }

    public final void IconCompatParcelizer(int i) throws IOException {
        byte[] read = AlertController$RecycleListView.read(i);
        if (this.IconCompatParcelizer.IconCompatParcelizer()) {
            this.MediaBrowserCompat$ItemReceiver.write(read);
        }
        TouchPointPinActivity touchPointPinActivity = this.IconCompatParcelizer;
        TouchPointPinActivity.IconCompatParcelizer iconCompatParcelizer = new TouchPointPinActivity.IconCompatParcelizer(i);
        if (!touchPointPinActivity.write.isEmpty()) {
            byte[] read2 = AlertController$RecycleListView.read(i);
            touchPointPinActivity.write.peek().MediaBrowserCompat$ItemReceiver.write(read2, 0, read2.length);
        }
        touchPointPinActivity.write.push(iconCompatParcelizer);
        touchPointPinActivity.MediaBrowserCompat$ItemReceiver = false;
        touchPointPinActivity.IconCompatParcelizer = true;
        touchPointPinActivity.read = false;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) throws IOException {
        byte[] MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(i);
        TouchPointPinActivity touchPointPinActivity = this.IconCompatParcelizer;
        if (i >= 0) {
            TouchPointPinActivity.IconCompatParcelizer pop = touchPointPinActivity.write.pop();
            if (!touchPointPinActivity.write.isEmpty()) {
                byte[] MediaBrowserCompat$ItemReceiver3 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(i);
                touchPointPinActivity.write.peek().MediaBrowserCompat$ItemReceiver.write(MediaBrowserCompat$ItemReceiver3, 0, MediaBrowserCompat$ItemReceiver3.length);
            }
            pop.MediaBrowserCompat$CustomActionResultReceiver = i;
            pop.write = true;
            touchPointPinActivity.write.push(pop);
            touchPointPinActivity.MediaBrowserCompat$ItemReceiver = false;
            touchPointPinActivity.IconCompatParcelizer = false;
            touchPointPinActivity.read = true;
            if (this.IconCompatParcelizer.IconCompatParcelizer()) {
                this.MediaBrowserCompat$ItemReceiver.write(MediaBrowserCompat$ItemReceiver2);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot set negative length (length = ");
        sb.append(i);
        sb.append(").");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot write null.");
        } else if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver) {
            throw new IllegalStateException("Cannot write value bytes yet. Need to write a tag first.");
        } else if (this.IconCompatParcelizer.IconCompatParcelizer) {
            MediaBrowserCompat$CustomActionResultReceiver(bArr.length);
            write(bArr);
        } else {
            write(bArr);
            this.IconCompatParcelizer.IconCompatParcelizer(bArr.length);
        }
    }

    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver) {
            if (this.IconCompatParcelizer.IconCompatParcelizer) {
                TouchPointPinActivity touchPointPinActivity = this.IconCompatParcelizer;
                touchPointPinActivity.MediaBrowserCompat$ItemReceiver = false;
                touchPointPinActivity.IconCompatParcelizer = false;
                touchPointPinActivity.read = true;
            }
            this.IconCompatParcelizer.write(bArr, i, i2);
            if (this.IconCompatParcelizer.IconCompatParcelizer()) {
                this.MediaBrowserCompat$ItemReceiver.write(bArr, i, i2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot write value bytes yet. Need to write a tag first.");
    }

    public final void write() throws IOException {
        boolean z;
        if (!this.IconCompatParcelizer.IconCompatParcelizer) {
            if (this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver) {
                TouchPointPinActivity touchPointPinActivity = this.IconCompatParcelizer;
                if (touchPointPinActivity.write.isEmpty()) {
                    z = false;
                } else {
                    z = !touchPointPinActivity.write.peek().write;
                }
                if (!z) {
                    return;
                }
            }
            TouchPointPinActivity touchPointPinActivity2 = this.IconCompatParcelizer;
            if (!touchPointPinActivity2.write.isEmpty()) {
                byte[] byteArray = touchPointPinActivity2.write.peek().MediaBrowserCompat$ItemReceiver.toByteArray();
                int length = byteArray.length;
                this.IconCompatParcelizer.IconCompatParcelizer(length);
                if (this.IconCompatParcelizer.IconCompatParcelizer()) {
                    this.MediaBrowserCompat$ItemReceiver.write(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(length));
                    this.MediaBrowserCompat$ItemReceiver.write(byteArray);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot get value yet.");
        }
        throw new IllegalStateException("Not processing value yet.");
    }

    public void flush() throws IOException {
        this.MediaBrowserCompat$ItemReceiver.flush();
    }

    public void close() throws IOException {
        if (this.IconCompatParcelizer.IconCompatParcelizer()) {
            this.MediaBrowserCompat$ItemReceiver.close();
            return;
        }
        throw new IllegalStateException("Cannot close stream yet, illegal TLV state.");
    }
}
