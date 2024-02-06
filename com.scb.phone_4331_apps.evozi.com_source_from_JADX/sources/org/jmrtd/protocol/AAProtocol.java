package org.jmrtd.protocol;

import java.security.PublicKey;
import java.util.logging.Logger;
import net.p088sf.scuba.smartcards.CardServiceException;
import org.jmrtd.PassportService;

public class AAProtocol {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private PassportService service;
    private SecureMessagingWrapper wrapper;

    public AAProtocol(PassportService passportService, SecureMessagingWrapper secureMessagingWrapper) {
        this.service = passportService;
        this.wrapper = secureMessagingWrapper;
    }

    public AAResult doAA(PublicKey publicKey, String str, String str2, byte[] bArr) throws CardServiceException {
        if (bArr != null) {
            try {
                if (bArr.length == 8) {
                    return new AAResult(publicKey, str, str2, bArr, this.service.sendInternalAuthenticate(this.wrapper, bArr));
                }
            } catch (IllegalArgumentException e) {
                Logger logger = LOGGER;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception: ");
                sb.append(e.getMessage());
                logger.severe(sb.toString());
                throw new CardServiceException(e.toString());
            }
        }
        throw new IllegalArgumentException("AA failed: bad challenge");
    }
}
