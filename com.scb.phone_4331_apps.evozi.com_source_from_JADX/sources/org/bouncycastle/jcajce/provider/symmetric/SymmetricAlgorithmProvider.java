package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

abstract class SymmetricAlgorithmProvider extends AlgorithmProvider {
    SymmetricAlgorithmProvider() {
    }

    /* access modifiers changed from: protected */
    public void addCMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("Mac.");
        sb.append(str);
        sb.append("-CMAC");
        configurableProvider.addAlgorithm(sb.toString(), str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alg.Alias.Mac.");
        sb2.append(str);
        sb2.append("CMAC");
        String obj = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("-CMAC");
        configurableProvider.addAlgorithm(obj, sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("KeyGenerator.");
        sb4.append(str);
        sb4.append("-CMAC");
        configurableProvider.addAlgorithm(sb4.toString(), str3);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Alg.Alias.KeyGenerator.");
        sb5.append(str);
        sb5.append("CMAC");
        String obj2 = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append("-CMAC");
        configurableProvider.addAlgorithm(obj2, sb6.toString());
    }

    /* access modifiers changed from: protected */
    public void addGMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("Mac.");
        sb.append(str);
        sb.append("-GMAC");
        configurableProvider.addAlgorithm(sb.toString(), str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alg.Alias.Mac.");
        sb2.append(str);
        sb2.append("GMAC");
        String obj = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("-GMAC");
        configurableProvider.addAlgorithm(obj, sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("KeyGenerator.");
        sb4.append(str);
        sb4.append("-GMAC");
        configurableProvider.addAlgorithm(sb4.toString(), str3);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Alg.Alias.KeyGenerator.");
        sb5.append(str);
        sb5.append("GMAC");
        String obj2 = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append("-GMAC");
        configurableProvider.addAlgorithm(obj2, sb6.toString());
    }

    /* access modifiers changed from: protected */
    public void addPoly1305Algorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("Mac.POLY1305-");
        sb.append(str);
        configurableProvider.addAlgorithm(sb.toString(), str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alg.Alias.Mac.POLY1305");
        sb2.append(str);
        String obj = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("POLY1305-");
        sb3.append(str);
        configurableProvider.addAlgorithm(obj, sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("KeyGenerator.POLY1305-");
        sb4.append(str);
        configurableProvider.addAlgorithm(sb4.toString(), str3);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Alg.Alias.KeyGenerator.POLY1305");
        sb5.append(str);
        String obj2 = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("POLY1305-");
        sb6.append(str);
        configurableProvider.addAlgorithm(obj2, sb6.toString());
    }
}
