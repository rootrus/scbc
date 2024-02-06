package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    DigestAlgorithmProvider() {
    }

    /* access modifiers changed from: protected */
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("HMAC");
        sb.append(str);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Mac.");
        sb2.append(obj);
        configurableProvider.addAlgorithm(sb2.toString(), str2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Alg.Alias.Mac.HMAC-");
        sb3.append(str);
        configurableProvider.addAlgorithm(sb3.toString(), obj);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Alg.Alias.Mac.HMAC/");
        sb4.append(str);
        configurableProvider.addAlgorithm(sb4.toString(), obj);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("KeyGenerator.");
        sb5.append(obj);
        configurableProvider.addAlgorithm(sb5.toString(), str3);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Alg.Alias.KeyGenerator.HMAC-");
        sb6.append(str);
        configurableProvider.addAlgorithm(sb6.toString(), obj);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Alg.Alias.KeyGenerator.HMAC/");
        sb7.append(str);
        configurableProvider.addAlgorithm(sb7.toString(), obj);
    }

    /* access modifiers changed from: protected */
    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        StringBuilder sb = new StringBuilder();
        sb.append("HMAC");
        sb.append(str);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alg.Alias.Mac.");
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), obj);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Alg.Alias.KeyGenerator.");
        sb3.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb3.toString(), obj);
    }
}
