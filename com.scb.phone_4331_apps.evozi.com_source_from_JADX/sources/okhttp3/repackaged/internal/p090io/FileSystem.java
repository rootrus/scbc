package okhttp3.repackaged.internal.p090io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickBalanceActivity;
import p040o.QuickPromptPayActivity;

/* renamed from: okhttp3.repackaged.internal.io.FileSystem */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() {
        public final HowToAddAccountActivity source(File file) throws FileNotFoundException {
            return ModifyQuickBalanceActivity.write(file);
        }

        public final QuickPromptPayActivity sink(File file) throws FileNotFoundException {
            try {
                return ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver(file);
            }
        }

        public final QuickPromptPayActivity appendingSink(File file) throws FileNotFoundException {
            try {
                return ModifyQuickBalanceActivity.read(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return ModifyQuickBalanceActivity.read(file);
            }
        }

        public final void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to delete ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }

        public final boolean exists(File file) {
            return file.exists();
        }

        public final long size(File file) {
            return file.length();
        }

        public final void rename(File file, File file2) throws IOException {
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
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
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
    };

    QuickPromptPayActivity appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    QuickPromptPayActivity sink(File file) throws FileNotFoundException;

    long size(File file);

    HowToAddAccountActivity source(File file) throws FileNotFoundException;
}
