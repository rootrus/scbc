package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.McEliecePrivateKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.util.Strings;

public class BCMcEliecePrivateKey implements CipherParameters, PrivateKey {
    private static final long serialVersionUID = 1;
    private McEliecePrivateKeyParameters params;

    public BCMcEliecePrivateKey(McEliecePrivateKeyParameters mcEliecePrivateKeyParameters) {
        this.params = mcEliecePrivateKeyParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePrivateKey)) {
            return false;
        }
        BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) obj;
        return getN() == bCMcEliecePrivateKey.getN() && getK() == bCMcEliecePrivateKey.getK() && getField().equals(bCMcEliecePrivateKey.getField()) && getGoppaPoly().equals(bCMcEliecePrivateKey.getGoppaPoly()) && getSInv().equals(bCMcEliecePrivateKey.getSInv()) && getP1().equals(bCMcEliecePrivateKey.getP1()) && getP2().equals(bCMcEliecePrivateKey.getP2());
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    public byte[] getEncoded() {
        try {
            try {
                return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.mcEliece), new McEliecePrivateKey(this.params.getN(), this.params.getK(), this.params.getField(), this.params.getGoppaPoly(), this.params.getP1(), this.params.getP2(), this.params.getSInv())).getEncoded();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public GF2mField getField() {
        return this.params.getField();
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.params.getGoppaPoly();
    }

    public GF2Matrix getH() {
        return this.params.getH();
    }

    public int getK() {
        return this.params.getK();
    }

    /* access modifiers changed from: package-private */
    public AsymmetricKeyParameter getKeyParams() {
        return this.params;
    }

    public int getN() {
        return this.params.getN();
    }

    public Permutation getP1() {
        return this.params.getP1();
    }

    public Permutation getP2() {
        return this.params.getP2();
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.params.getQInv();
    }

    public GF2Matrix getSInv() {
        return this.params.getSInv();
    }

    public int hashCode() {
        return (((((((((((this.params.getK() * 37) + this.params.getN()) * 37) + this.params.getField().hashCode()) * 37) + this.params.getGoppaPoly().hashCode()) * 37) + this.params.getP1().hashCode()) * 37) + this.params.getP2().hashCode()) * 37) + this.params.getSInv().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" length of the code          : ");
        sb.append(getN());
        sb.append(Strings.lineSeparator());
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(" dimension of the code       : ");
        sb2.append(getK());
        sb2.append(Strings.lineSeparator());
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append(" irreducible Goppa polynomial: ");
        sb3.append(getGoppaPoly());
        sb3.append(Strings.lineSeparator());
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj3);
        sb4.append(" permutation P1              : ");
        sb4.append(getP1());
        sb4.append(Strings.lineSeparator());
        String obj4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj4);
        sb5.append(" permutation P2              : ");
        sb5.append(getP2());
        sb5.append(Strings.lineSeparator());
        String obj5 = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(obj5);
        sb6.append(" (k x k)-matrix S^-1         : ");
        sb6.append(getSInv());
        return sb6.toString();
    }
}
