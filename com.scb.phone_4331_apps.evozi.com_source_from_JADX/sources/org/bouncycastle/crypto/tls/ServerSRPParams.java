package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

public class ServerSRPParams {

    /* renamed from: B */
    protected BigInteger f6099B;

    /* renamed from: N */
    protected BigInteger f6100N;

    /* renamed from: g */
    protected BigInteger f6101g;

    /* renamed from: s */
    protected byte[] f6102s;

    public ServerSRPParams(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3) {
        this.f6100N = bigInteger;
        this.f6101g = bigInteger2;
        this.f6102s = Arrays.clone(bArr);
        this.f6099B = bigInteger3;
    }

    public static ServerSRPParams parse(InputStream inputStream) throws IOException {
        return new ServerSRPParams(TlsSRPUtils.readSRPParameter(inputStream), TlsSRPUtils.readSRPParameter(inputStream), TlsUtils.readOpaque8(inputStream), TlsSRPUtils.readSRPParameter(inputStream));
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsSRPUtils.writeSRPParameter(this.f6100N, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f6101g, outputStream);
        TlsUtils.writeOpaque8(this.f6102s, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f6099B, outputStream);
    }

    public BigInteger getB() {
        return this.f6099B;
    }

    public BigInteger getG() {
        return this.f6101g;
    }

    public BigInteger getN() {
        return this.f6100N;
    }

    public byte[] getS() {
        return this.f6102s;
    }
}
