package p040o;

import android.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;
import p040o.ECouponRedemptionDetailActivity_ViewBinding;

/* renamed from: o.ECouponRedemptionDetailActivity_ViewBinding$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver */
public class C6438xb0d03eeb extends SecureRandomSpi {
    private static final File MediaBrowserCompat$CustomActionResultReceiver = new File("/dev/urandom");
    private static final Object MediaBrowserCompat$ItemReceiver = new Object();
    private static OutputStream read;
    private static DataInputStream write;
    private boolean IconCompatParcelizer;

    /* access modifiers changed from: protected */
    public void engineSetSeed(byte[] bArr) {
        OutputStream IconCompatParcelizer2;
        try {
            synchronized (MediaBrowserCompat$ItemReceiver) {
                IconCompatParcelizer2 = IconCompatParcelizer();
            }
            IconCompatParcelizer2.write(bArr);
            IconCompatParcelizer2.flush();
        } catch (IOException unused) {
            try {
                String simpleName = ECouponRedemptionDetailActivity_ViewBinding.IconCompatParcelizer.class.getSimpleName();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to mix seed into ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                Log.w(simpleName, sb.toString());
            } catch (Throwable th) {
                this.IconCompatParcelizer = true;
                throw th;
            }
        }
        this.IconCompatParcelizer = true;
    }

    /* access modifiers changed from: protected */
    public void engineNextBytes(byte[] bArr) {
        DataInputStream read2;
        if (!this.IconCompatParcelizer) {
            engineSetSeed(ECouponRedemptionDetailActivity_ViewBinding.IconCompatParcelizer.IconCompatParcelizer());
        }
        try {
            synchronized (MediaBrowserCompat$ItemReceiver) {
                read2 = read();
            }
            synchronized (read2) {
                read2.readFully(bArr);
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read from ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver);
            throw new SecurityException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        engineNextBytes(bArr);
        return bArr;
    }

    private static DataInputStream read() {
        DataInputStream dataInputStream;
        synchronized (MediaBrowserCompat$ItemReceiver) {
            if (write == null) {
                try {
                    write = new DataInputStream(new FileInputStream(MediaBrowserCompat$CustomActionResultReceiver));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to open ");
                    sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                    sb.append(" for reading");
                    throw new SecurityException(sb.toString(), e);
                }
            }
            dataInputStream = write;
        }
        return dataInputStream;
    }

    private static OutputStream IconCompatParcelizer() throws IOException {
        OutputStream outputStream;
        synchronized (MediaBrowserCompat$ItemReceiver) {
            if (read == null) {
                read = new FileOutputStream(MediaBrowserCompat$CustomActionResultReceiver);
            }
            outputStream = read;
        }
        return outputStream;
    }
}
