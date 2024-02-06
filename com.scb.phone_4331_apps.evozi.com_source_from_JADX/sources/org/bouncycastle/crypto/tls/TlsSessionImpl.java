package org.bouncycastle.crypto.tls;

import org.bouncycastle.util.Arrays;

class TlsSessionImpl implements TlsSession {
    final byte[] sessionID;
    SessionParameters sessionParameters;

    TlsSessionImpl(byte[] bArr, SessionParameters sessionParameters2) {
        if (bArr == null) {
            throw new IllegalArgumentException("'sessionID' cannot be null");
        } else if (bArr.length <= 0 || bArr.length > 32) {
            throw new IllegalArgumentException("'sessionID' must have length between 1 and 32 bytes, inclusive");
        } else {
            this.sessionID = Arrays.clone(bArr);
            this.sessionParameters = sessionParameters2;
        }
    }

    public SessionParameters exportSessionParameters() {
        SessionParameters copy;
        synchronized (this) {
            copy = this.sessionParameters == null ? null : this.sessionParameters.copy();
        }
        return copy;
    }

    public byte[] getSessionID() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.sessionID;
        }
        return bArr;
    }

    public void invalidate() {
        synchronized (this) {
            if (this.sessionParameters != null) {
                this.sessionParameters.clear();
                this.sessionParameters = null;
            }
        }
    }

    public boolean isResumable() {
        boolean z;
        synchronized (this) {
            z = this.sessionParameters != null;
        }
        return z;
    }
}
