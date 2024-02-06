package okhttp3.internal.p060io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p040o.HowToAddAccountStep2Activity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeActivity;

/* renamed from: okhttp3.internal.io.FileSystem */
public interface FileSystem {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final FileSystem SYSTEM = new FileSystem$Companion$SYSTEM$1();

    PinChangeActivity appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    PinChangeActivity sink(File file) throws FileNotFoundException;

    long size(File file);

    HowToAddAccountStep2Activity source(File file) throws FileNotFoundException;

    /* renamed from: okhttp3.internal.io.FileSystem$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }
}
