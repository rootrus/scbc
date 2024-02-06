package org.spongycastle.crypto.tls;

import java.io.IOException;

public class TlsFatalAlert extends IOException {
    public Throwable getCause() {
        return null;
    }
}
