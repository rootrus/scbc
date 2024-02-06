package org.jmrtd.protocol;

import java.io.Serializable;
import javax.crypto.SecretKey;
import net.p088sf.scuba.smartcards.APDUWrapper;

public abstract class SecureMessagingWrapper implements Serializable, APDUWrapper {
    private static final long serialVersionUID = 4709645514566992414L;

    public abstract SecretKey getEncryptionKey();

    public abstract SecretKey getMACKey();

    public abstract long getSendSequenceCounter();
}
