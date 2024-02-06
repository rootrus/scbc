package org.bouncycastle.jcajce.provider.asymmetric.p097ec;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.p061x9.ECNamedCurveTable;
import org.bouncycastle.asn1.p061x9.X962Parameters;
import org.bouncycastle.asn1.p061x9.X9ECParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.p099ec.ECCurve;

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.AlgorithmParametersSpi */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private String curveName;
    private ECParameterSpec ecParameterSpec;

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded() throws IOException {
        return engineGetEncoded("ASN.1");
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetEncoded(String str) throws IOException {
        X962Parameters x962Parameters;
        if (isASN1FormatString(str)) {
            ECParameterSpec eCParameterSpec = this.ecParameterSpec;
            if (eCParameterSpec == null) {
                x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
            } else {
                String str2 = this.curveName;
                if (str2 != null) {
                    x962Parameters = new X962Parameters(ECUtil.getNamedCurveOid(str2));
                } else {
                    org.bouncycastle.jce.spec.ECParameterSpec convertSpec = EC5Util.convertSpec(eCParameterSpec, false);
                    x962Parameters = new X962Parameters(new X9ECParameters(convertSpec.getCurve(), convertSpec.getG(), convertSpec.getN(), convertSpec.getH(), convertSpec.getSeed()));
                }
            }
            return x962Parameters.getEncoded();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown parameters format in AlgorithmParameters object: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
            return this.ecParameterSpec;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
            String str = this.curveName;
            if (str != null) {
                ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(str);
                return namedCurveOid != null ? new ECGenParameterSpec(namedCurveOid.getId()) : new ECGenParameterSpec(this.curveName);
            }
            ASN1ObjectIdentifier namedCurveOid2 = ECUtil.getNamedCurveOid(EC5Util.convertSpec(this.ecParameterSpec, false));
            if (namedCurveOid2 != null) {
                return new ECGenParameterSpec(namedCurveOid2.getId());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("EC AlgorithmParameters cannot convert to ");
        sb.append(cls.getName());
        throw new InvalidParameterSpecException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        ECParameterSpec eCParameterSpec;
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
            X9ECParameters domainParametersFromGenSpec = ECUtils.getDomainParametersFromGenSpec(eCGenParameterSpec);
            if (domainParametersFromGenSpec != null) {
                this.curveName = eCGenParameterSpec.getName();
                eCParameterSpec = EC5Util.convertToSpec(domainParametersFromGenSpec);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("EC curve name not recognized: ");
                sb.append(eCGenParameterSpec.getName());
                throw new InvalidParameterSpecException(sb.toString());
            }
        } else if (algorithmParameterSpec instanceof ECParameterSpec) {
            this.curveName = algorithmParameterSpec instanceof ECNamedCurveSpec ? ((ECNamedCurveSpec) algorithmParameterSpec).getName() : null;
            eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AlgorithmParameterSpec class not recognized: ");
            sb2.append(algorithmParameterSpec.getClass().getName());
            throw new InvalidParameterSpecException(sb2.toString());
        }
        this.ecParameterSpec = eCParameterSpec;
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, "ASN.1");
    }

    /* access modifiers changed from: protected */
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str)) {
            X962Parameters instance = X962Parameters.getInstance(bArr);
            ECCurve curve = EC5Util.getCurve(BouncyCastleProvider.CONFIGURATION, instance);
            if (instance.isNamedCurve()) {
                this.curveName = ECNamedCurveTable.getName(ASN1ObjectIdentifier.getInstance(instance.getParameters()));
            }
            this.ecParameterSpec = EC5Util.convertToSpec(instance, curve);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown encoded parameters format in AlgorithmParameters object: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public String engineToString() {
        return "EC AlgorithmParameters ";
    }

    /* access modifiers changed from: protected */
    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }
}
