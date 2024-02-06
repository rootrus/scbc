package org.jmrtd.lds;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.p061x9.X962NamedCurves;
import org.bouncycastle.asn1.p061x9.X962Parameters;
import org.bouncycastle.asn1.p061x9.X9ECParameters;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.jmrtd.Util;

public class PACEDomainParameterInfo extends SecurityInfo {
    public static final String ID_DH_PUBLIC_NUMBER = "1.2.840.10046.2.1";
    public static final String ID_EC_PUBLIC_KEY = "1.2.840.10045.2.1";
    private static final String ID_PRIME_FIELD = "1.2.840.10045.1.1";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -5851251908152594728L;
    private AlgorithmIdentifier domainParameter;
    private String oid;
    private BigInteger parameterId;

    public PACEDomainParameterInfo(String str, AlgorithmIdentifier algorithmIdentifier) {
        this(str, algorithmIdentifier, (BigInteger) null);
    }

    public PACEDomainParameterInfo(String str, AlgorithmIdentifier algorithmIdentifier, BigInteger bigInteger) {
        if (checkRequiredIdentifier(str)) {
            this.oid = str;
            this.domainParameter = algorithmIdentifier;
            this.parameterId = bigInteger;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid protocol id: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public String getObjectIdentifier() {
        return this.oid;
    }

    public String getProtocolOIDString() {
        return toProtocolOIDString(this.oid);
    }

    public BigInteger getParameterId() {
        return this.parameterId;
    }

    public AlgorithmParameterSpec getParameters() {
        if (ID_DH_PUBLIC_NUMBER.equals(this.oid)) {
            throw new IllegalStateException("DH PACEDomainParameterInfo not yet implemented");
        } else if (ID_EC_PUBLIC_KEY.equals(this.oid)) {
            return toECParameterSpec(this.domainParameter);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported PACEDomainParameterInfo type ");
            sb.append(this.oid);
            throw new IllegalStateException(sb.toString());
        }
    }

    @Deprecated
    public ASN1Primitive getDERObject() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.oid));
        aSN1EncodableVector.add(this.domainParameter);
        BigInteger bigInteger = this.parameterId;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PACEDomainParameterInfo");
        sb.append("[");
        sb.append("protocol: ");
        sb.append(toProtocolOIDString(this.oid));
        sb.append(", ");
        sb.append("domainParameter: [");
        sb.append("algorithm: ");
        sb.append(this.domainParameter.getAlgorithm().getId());
        sb.append(", ");
        ASN1Encodable parameters = this.domainParameter.getParameters();
        sb.append("parameters: ");
        sb.append(parameters);
        sb.append("]");
        if (this.parameterId != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", parameterId: ");
            sb2.append(this.parameterId);
            sb.append(sb2.toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        int i;
        int hashCode = this.oid.hashCode();
        int hashCode2 = this.domainParameter.hashCode();
        BigInteger bigInteger = this.parameterId;
        if (bigInteger == null) {
            i = 333;
        } else {
            i = bigInteger.hashCode();
        }
        return (hashCode * 7) + 111111111 + (hashCode2 * 5) + (i * 3);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!PACEDomainParameterInfo.class.equals(obj.getClass())) {
            return false;
        }
        return getDERObject().equals(((PACEDomainParameterInfo) obj).getDERObject());
    }

    public static boolean checkRequiredIdentifier(String str) {
        return SecurityInfo.ID_PACE_DH_GM.equals(str) || SecurityInfo.ID_PACE_ECDH_GM.equals(str) || SecurityInfo.ID_PACE_DH_IM.equals(str) || SecurityInfo.ID_PACE_ECDH_IM.equals(str) || SecurityInfo.ID_PACE_ECDH_CAM.equals(str);
    }

    @Deprecated
    public static AlgorithmIdentifier toAlgorithmIdentifier(ECParameterSpec eCParameterSpec) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ASN1Integer(BigInteger.ONE));
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(ID_PRIME_FIELD);
        EllipticCurve curve = eCParameterSpec.getCurve();
        arrayList.add(new DLSequence(new ASN1Encodable[]{aSN1ObjectIdentifier, new ASN1Integer(((ECFieldFp) curve.getField()).getP())}));
        arrayList.add(new DLSequence(new ASN1Encodable[]{new DEROctetString(Util.i2os(curve.getA())), new DEROctetString(Util.i2os(curve.getB()))}));
        arrayList.add(new DEROctetString(Util.ecPoint2OS(eCParameterSpec.getGenerator())));
        arrayList.add(new ASN1Integer(eCParameterSpec.getOrder()));
        arrayList.add(new ASN1Integer((long) eCParameterSpec.getCofactor()));
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[arrayList.size()];
        arrayList.toArray(aSN1EncodableArr);
        return new AlgorithmIdentifier(new ASN1ObjectIdentifier(ID_EC_PUBLIC_KEY), new DLSequence(aSN1EncodableArr));
    }

    @Deprecated
    public static ECParameterSpec toECParameterSpec(AlgorithmIdentifier algorithmIdentifier) {
        String id = algorithmIdentifier.getAlgorithm().getId();
        Logger logger = LOGGER;
        StringBuilder sb = new StringBuilder();
        sb.append("DEBUG: algorithmOID = ");
        sb.append(id);
        logger.info(sb.toString());
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters instanceof ASN1Sequence) {
            try {
                X962Parameters instance = X962Parameters.getInstance(parameters);
                if (instance.isNamedCurve()) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) instance.getParameters();
                    X9ECParameters byOID = X962NamedCurves.getByOID(aSN1ObjectIdentifier);
                    return Util.toECNamedCurveSpec(new ECNamedCurveParameterSpec(X962NamedCurves.getName(aSN1ObjectIdentifier), byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed()));
                }
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "Exception", e);
            }
            ASN1Sequence aSN1Sequence = (ASN1Sequence) parameters;
            if (aSN1Sequence.size() >= 5) {
                try {
                    ((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue();
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
                    ((ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(0)).getId();
                    BigInteger positiveValue = ((ASN1Integer) aSN1Sequence2.getObjectAt(1)).getPositiveValue();
                    Logger logger2 = LOGGER;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DEBUG: p = ");
                    sb2.append(positiveValue);
                    logger2.info(sb2.toString());
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
                    BigInteger os2i = Util.os2i(((ASN1OctetString) aSN1Sequence3.getObjectAt(0)).getOctets());
                    BigInteger os2i2 = Util.os2i(((ASN1OctetString) aSN1Sequence3.getObjectAt(1)).getOctets());
                    Logger logger3 = LOGGER;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("DEBUG: a = ");
                    sb3.append(os2i);
                    logger3.info(sb3.toString());
                    Logger logger4 = LOGGER;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("DEBUG: b = ");
                    sb4.append(os2i2);
                    logger4.info(sb4.toString());
                    ECPoint os2ECPoint = Util.os2ECPoint(((ASN1OctetString) aSN1Sequence.getObjectAt(3)).getOctets());
                    BigInteger affineX = os2ECPoint.getAffineX();
                    BigInteger affineY = os2ECPoint.getAffineY();
                    Logger logger5 = LOGGER;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("DEBUG: G = (");
                    sb5.append(affineX);
                    sb5.append(", ");
                    sb5.append(affineY);
                    sb5.append(")");
                    logger5.info(sb5.toString());
                    BigInteger mod = affineY.pow(2).mod(positiveValue);
                    BigInteger mod2 = affineX.pow(3).add(os2i.multiply(affineX)).add(os2i2).mod(positiveValue);
                    Logger logger6 = LOGGER;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("DEBUG: G on curve = ");
                    sb6.append(mod.equals(mod2));
                    logger6.info(sb6.toString());
                    EllipticCurve ellipticCurve = new EllipticCurve(new ECFieldFp(positiveValue), os2i, os2i2);
                    BigInteger positiveValue2 = ((ASN1Integer) aSN1Sequence.getObjectAt(4)).getPositiveValue();
                    Logger logger7 = LOGGER;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("DEBUG: n = ");
                    sb7.append(positiveValue2);
                    logger7.info(sb7.toString());
                    if (aSN1Sequence.size() <= 5) {
                        return new ECParameterSpec(ellipticCurve, os2ECPoint, positiveValue2, 1);
                    }
                    BigInteger value = ((ASN1Integer) aSN1Sequence.getObjectAt(5)).getValue();
                    Logger logger8 = LOGGER;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("DEBUG: coFactor = ");
                    sb8.append(value);
                    logger8.info(sb8.toString());
                    return new ECParameterSpec(ellipticCurve, os2ECPoint, positiveValue2, value.intValue());
                } catch (Exception e2) {
                    LOGGER.log(Level.WARNING, "Exception", e2);
                    throw new IllegalArgumentException("Could not get EC parameters from explicit parameters");
                }
            } else {
                throw new IllegalArgumentException("Was expecting an ASN.1 sequence of length 5 or longer");
            }
        } else {
            throw new IllegalArgumentException("Was expecting an ASN.1 sequence");
        }
    }

    private static AlgorithmIdentifier toAlgorithmIdentifier(String str, ASN1Encodable aSN1Encodable) {
        if (SecurityInfo.ID_PACE_DH_GM.equals(str) || SecurityInfo.ID_PACE_DH_IM.equals(str)) {
            return new AlgorithmIdentifier(new ASN1ObjectIdentifier(ID_DH_PUBLIC_NUMBER), aSN1Encodable);
        }
        if (SecurityInfo.ID_PACE_ECDH_GM.equals(str) || SecurityInfo.ID_PACE_ECDH_IM.equals(str) || SecurityInfo.ID_PACE_ECDH_CAM.equals(str)) {
            return new AlgorithmIdentifier(new ASN1ObjectIdentifier(ID_EC_PUBLIC_KEY), aSN1Encodable);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot infer algorithm OID from protocol OID: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String toProtocolOIDString(String str) {
        if (SecurityInfo.ID_PACE_DH_GM.equals(str)) {
            return "id-PACE-DH-GM";
        }
        if (SecurityInfo.ID_PACE_ECDH_GM.equals(str)) {
            return "id-PACE-ECDH-GM";
        }
        if (SecurityInfo.ID_PACE_DH_IM.equals(str)) {
            return "id-PACE-DH-IM";
        }
        if (SecurityInfo.ID_PACE_ECDH_IM.equals(str)) {
            return "id-PACE-ECDH-IM";
        }
        return SecurityInfo.ID_PACE_ECDH_CAM.equals(str) ? "id-PACE-ECDH-CAM" : str;
    }
}
