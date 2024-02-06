package org.jmrtd;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import net.p088sf.scuba.smartcards.APDUWrapper;
import net.p088sf.scuba.smartcards.CardFileInputStream;
import net.p088sf.scuba.smartcards.CardService;
import net.p088sf.scuba.smartcards.CardServiceException;
import org.jmrtd.cert.CVCPrincipal;
import org.jmrtd.cert.CardVerifiableCertificate;
import org.jmrtd.protocol.AAProtocol;
import org.jmrtd.protocol.AAResult;
import org.jmrtd.protocol.BACProtocol;
import org.jmrtd.protocol.BACResult;
import org.jmrtd.protocol.CAProtocol;
import org.jmrtd.protocol.CAResult;
import org.jmrtd.protocol.PACEProtocol;
import org.jmrtd.protocol.PACEResult;
import org.jmrtd.protocol.SecureMessagingWrapper;
import org.jmrtd.protocol.TAProtocol;
import org.jmrtd.protocol.TAResult;

public class PassportService extends PassportApduService implements Serializable {
    public static final int DEFAULT_MAX_BLOCKSIZE = 224;
    public static final short EF_CARD_ACCESS = 284;
    public static final short EF_CARD_SECURITY = 285;
    public static final short EF_COM = 286;
    public static final short EF_CVCA = 284;
    public static final short EF_DG1 = 257;
    public static final short EF_DG10 = 266;
    public static final short EF_DG11 = 267;
    public static final short EF_DG12 = 268;
    public static final short EF_DG13 = 269;
    public static final short EF_DG14 = 270;
    public static final short EF_DG15 = 271;
    public static final short EF_DG16 = 272;
    public static final short EF_DG2 = 258;
    public static final short EF_DG3 = 259;
    public static final short EF_DG4 = 260;
    public static final short EF_DG5 = 261;
    public static final short EF_DG6 = 262;
    public static final short EF_DG7 = 263;
    public static final short EF_DG8 = 264;
    public static final short EF_DG9 = 265;
    public static final short EF_SOD = 285;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final SimpleDateFormat SDF = new SimpleDateFormat("yyMMdd");
    public static final byte SF_COM = 30;
    public static final byte SF_CVCA = 28;
    public static final byte SF_DG1 = 1;
    public static final byte SF_DG10 = 10;
    public static final byte SF_DG11 = 11;
    public static final byte SF_DG12 = 12;
    public static final byte SF_DG13 = 13;
    public static final byte SF_DG14 = 14;
    public static final byte SF_DG15 = 15;
    public static final byte SF_DG16 = 16;
    public static final byte SF_DG2 = 2;
    public static final byte SF_DG3 = 3;
    public static final byte SF_DG4 = 4;
    public static final byte SF_DG5 = 5;
    public static final byte SF_DG6 = 6;
    public static final byte SF_DG7 = 7;
    public static final byte SF_DG8 = 8;
    public static final byte SF_DG9 = 9;
    public static final byte SF_SOD = 29;
    private static final long serialVersionUID = 1751933705552226972L;

    /* renamed from: fs */
    private MRTDFileSystem f6383fs;
    public int maxBlockSize;
    private State state;
    protected SecureMessagingWrapper wrapper;

    enum State {
        SESSION_STOPPED_STATE,
        SESSION_STARTED_STATE,
        BAC_AUTHENTICATED_STATE,
        PACE_AUTHENTICATED_STATE,
        AA_EXECUTED_STATE,
        CA_EXECUTED_STATE,
        TA_AUTHENTICATED_STATE
    }

    public PassportService(CardService cardService) throws CardServiceException {
        this(cardService, DEFAULT_MAX_BLOCKSIZE);
    }

    public PassportService(CardService cardService, int i) throws CardServiceException {
        super(cardService);
        this.maxBlockSize = i;
        this.f6383fs = new MRTDFileSystem(this);
        this.state = State.SESSION_STOPPED_STATE;
        Logger logger = LOGGER;
        StringBuilder sb = new StringBuilder();
        sb.append("DEBUG: isExtendedAPDULengthSupported: ");
        sb.append(isExtendedAPDULengthSupported());
        logger.info(sb.toString());
    }

    public void open() throws CardServiceException {
        if (!isOpen()) {
            synchronized (this) {
                super.open();
                this.state = State.SESSION_STARTED_STATE;
            }
        }
    }

    public void sendSelectApplet(boolean z) throws CardServiceException {
        if (z) {
            sendSelectApplet(this.wrapper, APPLET_AID);
        } else {
            sendSelectApplet((APDUWrapper) null, APPLET_AID);
        }
    }

    public boolean isOpen() {
        return this.state != State.SESSION_STOPPED_STATE;
    }

    public void sendSelectFile(short s) throws CardServiceException {
        synchronized (this) {
            sendSelectFile(this.wrapper, s);
        }
    }

    public byte[] sendReadBinary(int i, int i2, boolean z) throws CardServiceException {
        byte[] sendReadBinary;
        synchronized (this) {
            sendReadBinary = sendReadBinary(this.wrapper, i, i2, z);
        }
        return sendReadBinary;
    }

    public BACResult doBAC(BACKeySpec bACKeySpec) throws CardServiceException {
        BACResult doBAC;
        synchronized (this) {
            doBAC = new BACProtocol(this).doBAC(bACKeySpec);
            this.wrapper = doBAC.getWrapper();
            this.state = State.BAC_AUTHENTICATED_STATE;
        }
        return doBAC;
    }

    public BACResult doBAC(SecretKey secretKey, SecretKey secretKey2) throws CardServiceException, GeneralSecurityException {
        BACResult doBAC;
        synchronized (this) {
            doBAC = new BACProtocol(this).doBAC(secretKey, secretKey2);
            this.wrapper = doBAC.getWrapper();
            this.state = State.BAC_AUTHENTICATED_STATE;
        }
        return doBAC;
    }

    public PACEResult doPACE(KeySpec keySpec, String str, AlgorithmParameterSpec algorithmParameterSpec) throws PACEException {
        PACEResult doPACE;
        synchronized (this) {
            doPACE = new PACEProtocol(this, this.wrapper).doPACE(keySpec, str, algorithmParameterSpec);
            LOGGER.info("DEBUG: Starting secure messaging based on PACE");
            this.wrapper = doPACE.getWrapper();
            this.state = State.PACE_AUTHENTICATED_STATE;
        }
        return doPACE;
    }

    public CAResult doCA(BigInteger bigInteger, String str, String str2, PublicKey publicKey) throws CardServiceException {
        CAResult doCA;
        synchronized (this) {
            doCA = new CAProtocol(this, this.wrapper).doCA(bigInteger, str, str2, publicKey);
            LOGGER.info("DEBUG: Starting secure messaging based on Chip Authentication");
            this.wrapper = doCA.getWrapper();
            this.state = State.CA_EXECUTED_STATE;
        }
        return doCA;
    }

    public TAResult doTA(CVCPrincipal cVCPrincipal, List<CardVerifiableCertificate> list, PrivateKey privateKey, String str, CAResult cAResult, String str2) throws CardServiceException {
        TAResult doTA;
        synchronized (this) {
            doTA = new TAProtocol(this, this.wrapper).doTA(cVCPrincipal, list, privateKey, str, cAResult, str2);
            this.state = State.TA_AUTHENTICATED_STATE;
        }
        return doTA;
    }

    public AAResult doAA(PublicKey publicKey, String str, String str2, byte[] bArr) throws CardServiceException {
        AAResult doAA = new AAProtocol(this, this.wrapper).doAA(publicKey, str, str2, bArr);
        this.state = State.AA_EXECUTED_STATE;
        return doAA;
    }

    public void close() {
        try {
            this.wrapper = null;
            super.close();
        } finally {
            this.state = State.SESSION_STOPPED_STATE;
        }
    }

    public APDUWrapper getWrapper() {
        return this.wrapper;
    }

    public void setWrapper(SecureMessagingWrapper secureMessagingWrapper) {
        this.wrapper = secureMessagingWrapper;
    }

    public CardFileInputStream getInputStream(short s) throws CardServiceException {
        CardFileInputStream cardFileInputStream;
        synchronized (this) {
            synchronized (this.f6383fs) {
                this.f6383fs.selectFile(s);
                cardFileInputStream = new CardFileInputStream(this.maxBlockSize, this.f6383fs);
            }
        }
        return cardFileInputStream;
    }
}
