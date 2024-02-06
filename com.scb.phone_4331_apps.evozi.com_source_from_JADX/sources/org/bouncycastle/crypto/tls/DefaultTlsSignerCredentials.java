package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

public class DefaultTlsSignerCredentials extends AbstractTlsSignerCredentials {
    protected Certificate certificate;
    protected TlsContext context;
    protected AsymmetricKeyParameter privateKey;
    protected SignatureAndHashAlgorithm signatureAndHashAlgorithm;
    protected TlsSigner signer;

    public DefaultTlsSignerCredentials(TlsContext tlsContext, Certificate certificate2, AsymmetricKeyParameter asymmetricKeyParameter) {
        this(tlsContext, certificate2, asymmetricKeyParameter, (SignatureAndHashAlgorithm) null);
    }

    public DefaultTlsSignerCredentials(TlsContext tlsContext, Certificate certificate2, AsymmetricKeyParameter asymmetricKeyParameter, SignatureAndHashAlgorithm signatureAndHashAlgorithm2) {
        TlsSigner tlsSigner;
        if (certificate2 == null) {
            throw new IllegalArgumentException("'certificate' cannot be null");
        } else if (certificate2.isEmpty()) {
            throw new IllegalArgumentException("'certificate' cannot be empty");
        } else if (asymmetricKeyParameter == null) {
            throw new IllegalArgumentException("'privateKey' cannot be null");
        } else if (!asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("'privateKey' must be private");
        } else if (!TlsUtils.isTLSv12(tlsContext) || signatureAndHashAlgorithm2 != null) {
            if (asymmetricKeyParameter instanceof RSAKeyParameters) {
                tlsSigner = new TlsRSASigner();
            } else if (asymmetricKeyParameter instanceof DSAPrivateKeyParameters) {
                tlsSigner = new TlsDSSSigner();
            } else if (asymmetricKeyParameter instanceof ECPrivateKeyParameters) {
                tlsSigner = new TlsECDSASigner();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("'privateKey' type not supported: ");
                sb.append(asymmetricKeyParameter.getClass().getName());
                throw new IllegalArgumentException(sb.toString());
            }
            this.signer = tlsSigner;
            tlsSigner.init(tlsContext);
            this.context = tlsContext;
            this.certificate = certificate2;
            this.privateKey = asymmetricKeyParameter;
            this.signatureAndHashAlgorithm = signatureAndHashAlgorithm2;
        } else {
            throw new IllegalArgumentException("'signatureAndHashAlgorithm' cannot be null for (D)TLS 1.2+");
        }
    }

    public byte[] generateCertificateSignature(byte[] bArr) throws IOException {
        try {
            return TlsUtils.isTLSv12(this.context) ? this.signer.generateRawSignature(this.signatureAndHashAlgorithm, this.privateKey, bArr) : this.signer.generateRawSignature(this.privateKey, bArr);
        } catch (CryptoException e) {
            throw new TlsFatalAlert(80, e);
        }
    }

    public Certificate getCertificate() {
        return this.certificate;
    }

    public SignatureAndHashAlgorithm getSignatureAndHashAlgorithm() {
        return this.signatureAndHashAlgorithm;
    }
}