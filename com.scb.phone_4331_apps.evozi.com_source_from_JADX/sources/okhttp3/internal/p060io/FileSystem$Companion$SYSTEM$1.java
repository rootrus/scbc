package okhttp3.internal.p060io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p040o.HowToAddAccountStep2Activity;
import p040o.PinChangeActivity;
import p040o.onGetStartedClick;
import p040o.onSubmit;

/* renamed from: okhttp3.internal.io.FileSystem$Companion$SYSTEM$1 */
public final class FileSystem$Companion$SYSTEM$1 implements FileSystem {
    FileSystem$Companion$SYSTEM$1() {
    }

    public final HowToAddAccountStep2Activity source(File file) throws FileNotFoundException {
        onGetStartedClick.write((Object) file, "file");
        return onSubmit.IconCompatParcelizer(file);
    }

    public final PinChangeActivity sink(File file) throws FileNotFoundException {
        onGetStartedClick.write((Object) file, "file");
        try {
            return onSubmit.write(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return onSubmit.write(file);
        }
    }

    public final PinChangeActivity appendingSink(File file) throws FileNotFoundException {
        onGetStartedClick.write((Object) file, "file");
        try {
            return onSubmit.MediaBrowserCompat$CustomActionResultReceiver(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return onSubmit.MediaBrowserCompat$CustomActionResultReceiver(file);
        }
    }

    public final void delete(File file) throws IOException {
        onGetStartedClick.write((Object) file, "file");
        if (!file.delete() && file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to delete ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    public final boolean exists(File file) {
        onGetStartedClick.write((Object) file, "file");
        return file.exists();
    }

    public final long size(File file) {
        onGetStartedClick.write((Object) file, "file");
        return file.length();
    }

    public final void rename(File file, File file2) throws IOException {
        onGetStartedClick.write((Object) file, "from");
        onGetStartedClick.write((Object) file2, "to");
        delete(file2);
        if (!file.renameTo(file2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to rename ");
            sb.append(file);
            sb.append(" to ");
            sb.append(file2);
            throw new IOException(sb.toString());
        }
    }

    public final void deleteContents(File file) throws IOException {
        onGetStartedClick.write((Object) file, "directory");
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                onGetStartedClick.IconCompatParcelizer((Object) file2, "file");
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to delete ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("not a readable directory: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }
}
