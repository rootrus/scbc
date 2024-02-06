package org.bouncycastle.pqc.jcajce.provider;

import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

public class BouncyCastlePQCProvider extends Provider implements ConfigurableProvider {
    private static final String[] ALGORITHMS = {"Rainbow", "McEliece", "SPHINCS", "NH"};
    private static final String ALGORITHM_PACKAGE = "org.bouncycastle.pqc.jcajce.provider.";
    public static final ProviderConfiguration CONFIGURATION = null;
    public static String PROVIDER_NAME = "BCPQC";
    private static String info = "BouncyCastle Post-Quantum Security Provider v1.55";
    private static final Map keyInfoConverters = new HashMap();

    public BouncyCastlePQCProvider() {
        super(PROVIDER_NAME, 1.55d, info);
        AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                BouncyCastlePQCProvider.this.setup();
                return null;
            }
        });
    }

    private static AsymmetricKeyInfoConverter getAsymmetricKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        synchronized (keyInfoConverters) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) keyInfoConverters.get(aSN1ObjectIdentifier);
        }
        return asymmetricKeyInfoConverter;
    }

    public static PrivateKey getPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePrivate(privateKeyInfo);
    }

    public static PublicKey getPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = getAsymmetricKeyInfoConverter(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePublic(subjectPublicKeyInfo);
    }

    private void loadAlgorithms(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class<?> cls = null;
            try {
                ClassLoader classLoader = getClass().getClassLoader();
                if (classLoader != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(strArr[i]);
                    sb.append("$Mappings");
                    cls = classLoader.loadClass(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(strArr[i]);
                    sb2.append("$Mappings");
                    cls = Class.forName(sb2.toString());
                }
            } catch (ClassNotFoundException unused) {
            }
            if (cls != null) {
                try {
                    ((AlgorithmProvider) cls.newInstance()).configure(this);
                } catch (Exception e) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("cannot create instance of ");
                    sb3.append(str);
                    sb3.append(strArr[i]);
                    sb3.append("$Mappings : ");
                    sb3.append(e);
                    throw new InternalError(sb3.toString());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void setup() {
        loadAlgorithms(ALGORITHM_PACKAGE, ALGORITHMS);
    }

    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("duplicate provider key (");
        sb.append(str);
        sb.append(") found");
        throw new IllegalStateException(sb.toString());
    }

    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        if (containsKey(sb.toString())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".");
            sb2.append(aSN1ObjectIdentifier);
            addAlgorithm(sb2.toString(), str2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(".OID.");
            sb3.append(aSN1ObjectIdentifier);
            addAlgorithm(sb3.toString(), str2);
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("primary key (");
        sb4.append(str);
        sb4.append(".");
        sb4.append(str2);
        sb4.append(") not found");
        throw new IllegalStateException(sb4.toString());
    }

    public void addKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        synchronized (keyInfoConverters) {
            keyInfoConverters.put(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    public boolean hasAlgorithm(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        if (!containsKey(sb.toString())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.");
            sb2.append(str);
            sb2.append(".");
            sb2.append(str2);
            if (!containsKey(sb2.toString())) {
                return false;
            }
        }
        return true;
    }

    public void setParameter(String str, Object obj) {
        synchronized (CONFIGURATION) {
        }
    }
}
