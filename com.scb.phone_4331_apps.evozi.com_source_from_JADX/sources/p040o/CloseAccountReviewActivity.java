package p040o;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* renamed from: o.CloseAccountReviewActivity */
public class CloseAccountReviewActivity {
    public BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver;

    public CloseAccountReviewActivity() {
    }

    public static byte[] MediaBrowserCompat$ItemReceiver(Bitmap bitmap, Bitmap.CompressFormat compressFormat, Integer num) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(compressFormat, num.intValue(), byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } finally {
            byteArrayOutputStream.close();
        }
    }

    public static File write(InputStream inputStream, byte[] bArr) throws IOException {
        File createTempFile = File.createTempFile(UUID.randomUUID().toString(), ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        byte[] bArr2 = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr2);
            if (read != -1) {
                fileOutputStream.write(bArr2, 0, read);
            } else {
                fileOutputStream.close();
                ExifInterface exifInterface = new ExifInterface(createTempFile.getAbsolutePath());
                exifInterface.setAttribute("Make", new String(bArr, StandardCharsets.UTF_8));
                exifInterface.saveAttributes();
                createTempFile.deleteOnExit();
                return createTempFile;
            }
        }
    }

    public CloseAccountReviewActivity(BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = bankingAgentDeepLinkActivity;
    }
}
