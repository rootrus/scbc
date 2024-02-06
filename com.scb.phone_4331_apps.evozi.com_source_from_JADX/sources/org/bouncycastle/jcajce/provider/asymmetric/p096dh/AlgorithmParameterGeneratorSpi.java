package org.bouncycastle.jcajce.provider.asymmetric.p096dh;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.generators.DHParametersGenerator;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {

    /* renamed from: l */
    private int f6104l = 0;
    protected SecureRandom random;
    protected int strength = 1024;

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGenerateParameters() {
        DHParametersGenerator dHParametersGenerator = new DHParametersGenerator();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            dHParametersGenerator.init(this.strength, 20, secureRandom);
        } else {
            dHParametersGenerator.init(this.strength, 20, new SecureRandom());
        }
        DHParameters generateParameters = dHParametersGenerator.generateParameters();
        try {
            AlgorithmParameters createParametersInstance = createParametersInstance("DH");
            createParametersInstance.init(new DHParameterSpec(generateParameters.getP(), generateParameters.getG(), this.f6104l));
            return createParametersInstance;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHGenParameterSpec) {
            DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
            this.strength = dHGenParameterSpec.getPrimeSize();
            this.f6104l = dHGenParameterSpec.getExponentSize();
            this.random = secureRandom;
            return;
        }
        throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
    }
}
