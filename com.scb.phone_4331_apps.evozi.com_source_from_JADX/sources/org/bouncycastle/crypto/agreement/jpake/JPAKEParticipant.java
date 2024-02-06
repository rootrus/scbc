package org.bouncycastle.crypto.agreement.jpake;

import com.pingan.p031ai.C8677p;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.util.Arrays;

public class JPAKEParticipant {
    public static final int STATE_INITIALIZED = 0;
    public static final int STATE_KEY_CALCULATED = 50;
    public static final int STATE_ROUND_1_CREATED = 10;
    public static final int STATE_ROUND_1_VALIDATED = 20;
    public static final int STATE_ROUND_2_CREATED = 30;
    public static final int STATE_ROUND_2_VALIDATED = 40;
    public static final int STATE_ROUND_3_CREATED = 60;
    public static final int STATE_ROUND_3_VALIDATED = 70;

    /* renamed from: b */
    private BigInteger f5635b;
    private final Digest digest;

    /* renamed from: g */
    private final BigInteger f5636g;
    private BigInteger gx1;
    private BigInteger gx2;
    private BigInteger gx3;
    private BigInteger gx4;

    /* renamed from: p */
    private final BigInteger f5637p;
    private final String participantId;
    private String partnerParticipantId;
    private char[] password;

    /* renamed from: q */
    private final BigInteger f5638q;
    private final SecureRandom random;
    private int state;

    /* renamed from: x1 */
    private BigInteger f5639x1;

    /* renamed from: x2 */
    private BigInteger f5640x2;

    public JPAKEParticipant(String str, char[] cArr) {
        this(str, cArr, JPAKEPrimeOrderGroups.NIST_3072);
    }

    public JPAKEParticipant(String str, char[] cArr, JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup) {
        this(str, cArr, jPAKEPrimeOrderGroup, new SHA256Digest(), new SecureRandom());
    }

    public JPAKEParticipant(String str, char[] cArr, JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup, Digest digest2, SecureRandom secureRandom) {
        JPAKEUtil.validateNotNull(str, "participantId");
        JPAKEUtil.validateNotNull(cArr, "password");
        JPAKEUtil.validateNotNull(jPAKEPrimeOrderGroup, C8677p.f5438a);
        JPAKEUtil.validateNotNull(digest2, "digest");
        JPAKEUtil.validateNotNull(secureRandom, "random");
        if (cArr.length != 0) {
            this.participantId = str;
            this.password = Arrays.copyOf(cArr, cArr.length);
            this.f5637p = jPAKEPrimeOrderGroup.getP();
            this.f5638q = jPAKEPrimeOrderGroup.getQ();
            this.f5636g = jPAKEPrimeOrderGroup.getG();
            this.digest = digest2;
            this.random = secureRandom;
            this.state = 0;
            return;
        }
        throw new IllegalArgumentException("Password must not be empty.");
    }

    public BigInteger calculateKeyingMaterial() {
        int i = this.state;
        if (i >= 50) {
            StringBuilder sb = new StringBuilder();
            sb.append("Key already calculated for ");
            sb.append(this.participantId);
            throw new IllegalStateException(sb.toString());
        } else if (i >= 40) {
            BigInteger calculateS = JPAKEUtil.calculateS(this.password);
            Arrays.fill(this.password, 0);
            this.password = null;
            BigInteger calculateKeyingMaterial = JPAKEUtil.calculateKeyingMaterial(this.f5637p, this.f5638q, this.gx4, this.f5640x2, calculateS, this.f5635b);
            this.f5639x1 = null;
            this.f5640x2 = null;
            this.f5635b = null;
            this.state = 50;
            return calculateKeyingMaterial;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Round2 payload must be validated prior to creating key for ");
            sb2.append(this.participantId);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public JPAKERound1Payload createRound1PayloadToSend() {
        if (this.state < 10) {
            this.f5639x1 = JPAKEUtil.generateX1(this.f5638q, this.random);
            this.f5640x2 = JPAKEUtil.generateX2(this.f5638q, this.random);
            this.gx1 = JPAKEUtil.calculateGx(this.f5637p, this.f5636g, this.f5639x1);
            this.gx2 = JPAKEUtil.calculateGx(this.f5637p, this.f5636g, this.f5640x2);
            BigInteger[] calculateZeroKnowledgeProof = JPAKEUtil.calculateZeroKnowledgeProof(this.f5637p, this.f5638q, this.f5636g, this.gx1, this.f5639x1, this.participantId, this.digest, this.random);
            BigInteger[] calculateZeroKnowledgeProof2 = JPAKEUtil.calculateZeroKnowledgeProof(this.f5637p, this.f5638q, this.f5636g, this.gx2, this.f5640x2, this.participantId, this.digest, this.random);
            this.state = 10;
            return new JPAKERound1Payload(this.participantId, this.gx1, this.gx2, calculateZeroKnowledgeProof, calculateZeroKnowledgeProof2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Round1 payload already created for ");
        sb.append(this.participantId);
        throw new IllegalStateException(sb.toString());
    }

    public JPAKERound2Payload createRound2PayloadToSend() {
        int i = this.state;
        if (i >= 30) {
            StringBuilder sb = new StringBuilder();
            sb.append("Round2 payload already created for ");
            sb.append(this.participantId);
            throw new IllegalStateException(sb.toString());
        } else if (i >= 20) {
            BigInteger calculateGA = JPAKEUtil.calculateGA(this.f5637p, this.gx1, this.gx3, this.gx4);
            BigInteger calculateX2s = JPAKEUtil.calculateX2s(this.f5638q, this.f5640x2, JPAKEUtil.calculateS(this.password));
            BigInteger calculateA = JPAKEUtil.calculateA(this.f5637p, this.f5638q, calculateGA, calculateX2s);
            BigInteger[] calculateZeroKnowledgeProof = JPAKEUtil.calculateZeroKnowledgeProof(this.f5637p, this.f5638q, calculateGA, calculateA, calculateX2s, this.participantId, this.digest, this.random);
            this.state = 30;
            return new JPAKERound2Payload(this.participantId, calculateA, calculateZeroKnowledgeProof);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Round1 payload must be validated prior to creating Round2 payload for ");
            sb2.append(this.participantId);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public JPAKERound3Payload createRound3PayloadToSend(BigInteger bigInteger) {
        int i = this.state;
        if (i >= 60) {
            StringBuilder sb = new StringBuilder();
            sb.append("Round3 payload already created for ");
            sb.append(this.participantId);
            throw new IllegalStateException(sb.toString());
        } else if (i >= 50) {
            BigInteger calculateMacTag = JPAKEUtil.calculateMacTag(this.participantId, this.partnerParticipantId, this.gx1, this.gx2, this.gx3, this.gx4, bigInteger, this.digest);
            this.state = 60;
            return new JPAKERound3Payload(this.participantId, calculateMacTag);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keying material must be calculated prior to creating Round3 payload for ");
            sb2.append(this.participantId);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public int getState() {
        return this.state;
    }

    public void validateRound1PayloadReceived(JPAKERound1Payload jPAKERound1Payload) throws CryptoException {
        if (this.state < 20) {
            this.partnerParticipantId = jPAKERound1Payload.getParticipantId();
            this.gx3 = jPAKERound1Payload.getGx1();
            this.gx4 = jPAKERound1Payload.getGx2();
            BigInteger[] knowledgeProofForX1 = jPAKERound1Payload.getKnowledgeProofForX1();
            BigInteger[] knowledgeProofForX2 = jPAKERound1Payload.getKnowledgeProofForX2();
            JPAKEUtil.validateParticipantIdsDiffer(this.participantId, jPAKERound1Payload.getParticipantId());
            JPAKEUtil.validateGx4(this.gx4);
            JPAKEUtil.validateZeroKnowledgeProof(this.f5637p, this.f5638q, this.f5636g, this.gx3, knowledgeProofForX1, jPAKERound1Payload.getParticipantId(), this.digest);
            JPAKEUtil.validateZeroKnowledgeProof(this.f5637p, this.f5638q, this.f5636g, this.gx4, knowledgeProofForX2, jPAKERound1Payload.getParticipantId(), this.digest);
            this.state = 20;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Validation already attempted for round1 payload for");
        sb.append(this.participantId);
        throw new IllegalStateException(sb.toString());
    }

    public void validateRound2PayloadReceived(JPAKERound2Payload jPAKERound2Payload) throws CryptoException {
        int i = this.state;
        if (i >= 40) {
            StringBuilder sb = new StringBuilder();
            sb.append("Validation already attempted for round2 payload for");
            sb.append(this.participantId);
            throw new IllegalStateException(sb.toString());
        } else if (i >= 20) {
            BigInteger calculateGA = JPAKEUtil.calculateGA(this.f5637p, this.gx3, this.gx1, this.gx2);
            this.f5635b = jPAKERound2Payload.getA();
            BigInteger[] knowledgeProofForX2s = jPAKERound2Payload.getKnowledgeProofForX2s();
            JPAKEUtil.validateParticipantIdsDiffer(this.participantId, jPAKERound2Payload.getParticipantId());
            JPAKEUtil.validateParticipantIdsEqual(this.partnerParticipantId, jPAKERound2Payload.getParticipantId());
            JPAKEUtil.validateGa(calculateGA);
            JPAKEUtil.validateZeroKnowledgeProof(this.f5637p, this.f5638q, calculateGA, this.f5635b, knowledgeProofForX2s, jPAKERound2Payload.getParticipantId(), this.digest);
            this.state = 40;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Round1 payload must be validated prior to validating Round2 payload for ");
            sb2.append(this.participantId);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void validateRound3PayloadReceived(JPAKERound3Payload jPAKERound3Payload, BigInteger bigInteger) throws CryptoException {
        int i = this.state;
        if (i >= 70) {
            StringBuilder sb = new StringBuilder();
            sb.append("Validation already attempted for round3 payload for");
            sb.append(this.participantId);
            throw new IllegalStateException(sb.toString());
        } else if (i >= 50) {
            JPAKEUtil.validateParticipantIdsDiffer(this.participantId, jPAKERound3Payload.getParticipantId());
            JPAKEUtil.validateParticipantIdsEqual(this.partnerParticipantId, jPAKERound3Payload.getParticipantId());
            JPAKEUtil.validateMacTag(this.participantId, this.partnerParticipantId, this.gx1, this.gx2, this.gx3, this.gx4, bigInteger, this.digest, jPAKERound3Payload.getMacTag());
            this.gx1 = null;
            this.gx2 = null;
            this.gx3 = null;
            this.gx4 = null;
            this.state = 70;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keying material must be calculated validated prior to validating Round3 payload for ");
            sb2.append(this.participantId);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
