package org.jmrtd.protocol;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import net.p088sf.scuba.smartcards.CardServiceException;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jmrtd.BACKeySpec;
import org.jmrtd.PassportService;
import org.jmrtd.Util;

public class BACProtocol {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private Random random = new SecureRandom();
    private PassportService service;

    public BACProtocol(PassportService passportService) {
        this.service = passportService;
    }

    public BACResult doBAC(BACKeySpec bACKeySpec) throws CardServiceException {
        try {
            byte[] computeKeySeedForBAC = computeKeySeedForBAC(bACKeySpec);
            return new BACResult(bACKeySpec, doBACStep(Util.deriveKey(computeKeySeedForBAC, 1), Util.deriveKey(computeKeySeedForBAC, 2)));
        } catch (CardServiceException e) {
            LOGGER.log(Level.WARNING, "BAC failed", e);
            throw e;
        } catch (GeneralSecurityException e2) {
            LOGGER.log(Level.WARNING, "Error during BAC", e2);
            throw new CardServiceException(e2.toString());
        }
    }

    public BACResult doBAC(SecretKey secretKey, SecretKey secretKey2) throws CardServiceException, GeneralSecurityException {
        return new BACResult(doBACStep(secretKey, secretKey2));
    }

    private SecureMessagingWrapper doBACStep(SecretKey secretKey, SecretKey secretKey2) throws CardServiceException, GeneralSecurityException {
        byte[] sendGetChallenge = this.service.sendGetChallenge();
        byte[] bArr = new byte[8];
        this.random.nextBytes(bArr);
        byte[] bArr2 = new byte[16];
        this.random.nextBytes(bArr2);
        byte[] sendMutualAuth = this.service.sendMutualAuth(bArr, sendGetChallenge, bArr2, secretKey, secretKey2);
        byte[] bArr3 = new byte[16];
        System.arraycopy(sendMutualAuth, 16, bArr3, 0, 16);
        byte[] bArr4 = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr4[i] = (byte) ((bArr2[i] & 255) ^ (bArr3[i] & 255));
        }
        return new DESedeSecureMessagingWrapper(Util.deriveKey(bArr4, 1), Util.deriveKey(bArr4, 2), computeSendSequenceCounter(sendGetChallenge, bArr));
    }

    public static byte[] computeKeySeedForBAC(BACKeySpec bACKeySpec) throws GeneralSecurityException {
        String documentNumber = bACKeySpec.getDocumentNumber();
        String dateOfBirth = bACKeySpec.getDateOfBirth();
        String dateOfExpiry = bACKeySpec.getDateOfExpiry();
        if (dateOfBirth == null || dateOfBirth.length() != 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("Wrong date format used for date of birth. Expected yyMMdd, found ");
            sb.append(dateOfBirth);
            throw new IllegalArgumentException(sb.toString());
        } else if (dateOfExpiry == null || dateOfExpiry.length() != 6) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Wrong date format used for date of expiry. Expected yyMMdd, found ");
            sb2.append(dateOfExpiry);
            throw new IllegalArgumentException(sb2.toString());
        } else if (documentNumber != null) {
            return computeKeySeedForBAC(fixDocumentNumber(documentNumber), dateOfBirth, dateOfExpiry);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Wrong document number. Found ");
            sb3.append(documentNumber);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public static long computeSendSequenceCounter(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 8 || bArr2 == null || bArr2.length != 8) {
            throw new IllegalStateException("Wrong length input");
        }
        long j = 0;
        for (int i = 4; i < 8; i++) {
            j = (j << 8) + ((long) (bArr[i] & 255));
        }
        for (int i2 = 4; i2 < 8; i2++) {
            j = (j << 8) + ((long) (bArr2[i2] & 255));
        }
        return j;
    }

    private static byte[] computeKeySeedForBAC(String str, String str2, String str3) throws GeneralSecurityException {
        return Util.computeKeySeed(str, str2, str3, McElieceCCA2KeyGenParameterSpec.SHA1, true);
    }

    private static String fixDocumentNumber(String str) {
        String replace = str.replace('<', ' ').trim().replace(' ', '<');
        while (replace.length() < 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(replace);
            sb.append("<");
            replace = sb.toString();
        }
        return replace;
    }
}
