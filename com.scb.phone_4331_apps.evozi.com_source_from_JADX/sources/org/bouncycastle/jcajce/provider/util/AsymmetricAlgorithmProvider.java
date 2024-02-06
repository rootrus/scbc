package org.bouncycastle.jcajce.provider.util;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    /* access modifiers changed from: protected */
    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("WITH");
        sb.append(str2);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("with");
        sb2.append(str2);
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("With");
        sb3.append(str2);
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append("/");
        sb4.append(str2);
        String obj4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Signature.");
        sb5.append(obj);
        configurableProvider.addAlgorithm(sb5.toString(), str3);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Alg.Alias.Signature.");
        sb6.append(obj2);
        configurableProvider.addAlgorithm(sb6.toString(), obj);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Alg.Alias.Signature.");
        sb7.append(obj3);
        configurableProvider.addAlgorithm(sb7.toString(), obj);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("Alg.Alias.Signature.");
        sb8.append(obj4);
        configurableProvider.addAlgorithm(sb8.toString(), obj);
        StringBuilder sb9 = new StringBuilder();
        sb9.append("Alg.Alias.Signature.");
        sb9.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb9.toString(), obj);
        StringBuilder sb10 = new StringBuilder();
        sb10.append("Alg.Alias.Signature.OID.");
        sb10.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb10.toString(), obj);
    }

    /* access modifiers changed from: protected */
    public void registerOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        StringBuilder sb = new StringBuilder();
        sb.append("Alg.Alias.KeyFactory.");
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alg.Alias.KeyPairGenerator.");
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    /* access modifiers changed from: protected */
    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Alg.Alias.AlgorithmParameterGenerator.");
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alg.Alias.AlgorithmParameters.");
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
    }
}
