package org.jmrtd;

import com.kofax.mobile.sdk.p083w.C8515ao;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class JMRTDSecurityProvider extends Provider {
    private static final Provider BC_PROVIDER = new BouncyCastleProvider();
    private static final String BC_PROVIDER_CLASS_NAME = "org.bouncycastle.jce.provider.BouncyCastleProvider";
    private static final Provider JMRTD_PROVIDER = new JMRTDSecurityProvider();
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final Provider SC_PROVIDER = new BouncyCastleProvider();
    private static final String SC_PROVIDER_CLASS_NAME = "o.TileAdapter$StaticShortcutHolder";
    private static final String SUN_PROVIDER_CLASS_NAME = "sun.security.provider.Sun";
    private static final long serialVersionUID = -2881416441551680704L;

    static {
        Provider provider = BC_PROVIDER;
        if (provider != null) {
            Security.insertProviderAt(provider, 1);
        }
        Provider provider2 = SC_PROVIDER;
        if (provider2 != null) {
            Security.insertProviderAt(provider2, 2);
        }
        Provider provider3 = JMRTD_PROVIDER;
        if (provider3 != null) {
            Security.insertProviderAt(provider3, 3);
        }
    }

    private JMRTDSecurityProvider() {
        super("JMRTD", 0.1d, "JMRTD Security Provider");
        put("CertificateFactory.CVC", "org.jmrtd.cert.CVCertificateFactorySpi");
        if (BC_PROVIDER != null) {
            replicateFromProvider("CertificateFactory", "X.509", getBouncyCastleProvider());
            replicateFromProvider("CertStore", "Collection", getBouncyCastleProvider());
            replicateFromProvider("MessageDigest", "SHA1", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "SHA1withRSA/ISO9796-2", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "MD2withRSA", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "MD4withRSA", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "MD5withRSA", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "SHA1withRSA", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "SHA1withRSA/ISO9796-2", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "SHA256withRSA", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "SHA256withRSA/ISO9796-2", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "SHA384withRSA", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "SHA384withRSA/ISO9796-2", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "SHA512withRSA", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "SHA512withRSA/ISO9796-2", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "SHA224withRSA", getBouncyCastleProvider());
            replicateFromProvider(C8515ao.f5179Qz, "SHA224withRSA/ISO9796-2", getBouncyCastleProvider());
            put("Alg.Alias.Mac.ISO9797Alg3Mac", "ISO9797ALG3MAC");
            put("Alg.Alias.CertificateFactory.X509", "X.509");
        }
    }

    public static Provider getInstance() {
        return JMRTD_PROVIDER;
    }

    public static int beginPreferBouncyCastleProvider() {
        Provider bouncyCastleProvider = getBouncyCastleProvider();
        if (bouncyCastleProvider == null) {
            return -1;
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i < providers.length; i++) {
            Provider provider = providers[i];
            if (bouncyCastleProvider.getClass().getCanonicalName().equals(provider.getClass().getCanonicalName())) {
                Security.removeProvider(provider.getName());
                Security.insertProviderAt(bouncyCastleProvider, 1);
                return i + 1;
            }
        }
        return -1;
    }

    public static void endPreferBouncyCastleProvider(int i) {
        Provider bouncyCastleProvider = getBouncyCastleProvider();
        Security.removeProvider(bouncyCastleProvider.getName());
        if (i > 0) {
            Security.insertProviderAt(bouncyCastleProvider, i);
        }
    }

    public static Provider getBouncyCastleProvider() {
        Provider provider = BC_PROVIDER;
        if (provider != null) {
            return provider;
        }
        Provider provider2 = SC_PROVIDER;
        if (provider2 != null) {
            return provider2;
        }
        LOGGER.severe("No Bouncy or Spongy provider");
        return null;
    }

    public static Provider getSpongyCastleProvider() {
        Provider provider = SC_PROVIDER;
        if (provider != null) {
            return provider;
        }
        Provider provider2 = BC_PROVIDER;
        if (provider2 != null) {
            return provider2;
        }
        LOGGER.severe("No Bouncy or Spongy provider");
        return null;
    }

    private void replicateFromProvider(String str, String str2, Provider provider) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        String obj = sb.toString();
        Object obj2 = provider.get(obj);
        if (obj2 != null) {
            put(obj, obj2);
        }
    }

    private static Provider getProvider(String str, String str2) {
        List<Provider> providers = getProviders(str, str2);
        if (providers == null || providers.size() <= 0) {
            return null;
        }
        return providers.get(0);
    }

    private static List<Provider> getProviders(String str, String str2) {
        if (Security.getAlgorithms(str).contains(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            return new ArrayList(Arrays.asList(Security.getProviders(sb.toString())));
        }
        Provider provider = BC_PROVIDER;
        if (provider != null && provider.getService(str, str2) != null) {
            return new ArrayList(Collections.singletonList(BC_PROVIDER));
        }
        Provider provider2 = SC_PROVIDER;
        if (provider2 != null && provider2.getService(str, str2) != null) {
            return new ArrayList(Collections.singletonList(SC_PROVIDER));
        }
        Provider provider3 = JMRTD_PROVIDER;
        if (provider3 == null || provider3.getService(str, str2) == null) {
            return null;
        }
        return new ArrayList(Collections.singletonList(JMRTD_PROVIDER));
    }
}
