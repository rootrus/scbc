package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;

public class RSA {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.rsa.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        private void addDigestSignature(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("WITHRSA");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("withRSA");
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("WithRSA");
            String obj3 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("/");
            sb4.append("RSA");
            String obj4 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("WITHRSAENCRYPTION");
            String obj5 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append("withRSAEncryption");
            String obj6 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append("WithRSAEncryption");
            String obj7 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Signature.");
            sb8.append(obj);
            configurableProvider.addAlgorithm(sb8.toString(), str2);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Alg.Alias.Signature.");
            sb9.append(obj2);
            configurableProvider.addAlgorithm(sb9.toString(), obj);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Alg.Alias.Signature.");
            sb10.append(obj3);
            configurableProvider.addAlgorithm(sb10.toString(), obj);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("Alg.Alias.Signature.");
            sb11.append(obj5);
            configurableProvider.addAlgorithm(sb11.toString(), obj);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("Alg.Alias.Signature.");
            sb12.append(obj6);
            configurableProvider.addAlgorithm(sb12.toString(), obj);
            StringBuilder sb13 = new StringBuilder();
            sb13.append("Alg.Alias.Signature.");
            sb13.append(obj7);
            configurableProvider.addAlgorithm(sb13.toString(), obj);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("Alg.Alias.Signature.");
            sb14.append(obj4);
            configurableProvider.addAlgorithm(sb14.toString(), obj);
            if (aSN1ObjectIdentifier != null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append("Alg.Alias.Signature.");
                sb15.append(aSN1ObjectIdentifier);
                configurableProvider.addAlgorithm(sb15.toString(), obj);
                StringBuilder sb16 = new StringBuilder();
                sb16.append("Alg.Alias.Signature.OID.");
                sb16.append(aSN1ObjectIdentifier);
                configurableProvider.addAlgorithm(sb16.toString(), obj);
            }
        }

        private void addISO9796Signature(ConfigurableProvider configurableProvider, String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Alg.Alias.Signature.");
            sb.append(str);
            sb.append("withRSA/ISO9796-2");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("WITHRSA/ISO9796-2");
            configurableProvider.addAlgorithm(obj, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.Signature.");
            sb3.append(str);
            sb3.append("WithRSA/ISO9796-2");
            String obj2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("WITHRSA/ISO9796-2");
            configurableProvider.addAlgorithm(obj2, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Signature.");
            sb5.append(str);
            sb5.append("WITHRSA/ISO9796-2");
            configurableProvider.addAlgorithm(sb5.toString(), str2);
        }

        private void addPSSSignature(ConfigurableProvider configurableProvider, String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Alg.Alias.Signature.");
            sb.append(str);
            sb.append("withRSA/PSS");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("WITHRSAANDMGF1");
            configurableProvider.addAlgorithm(obj, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.Signature.");
            sb3.append(str);
            sb3.append("WithRSA/PSS");
            String obj2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("WITHRSAANDMGF1");
            configurableProvider.addAlgorithm(obj2, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Alg.Alias.Signature.");
            sb5.append(str);
            sb5.append("withRSAandMGF1");
            String obj3 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append("WITHRSAANDMGF1");
            configurableProvider.addAlgorithm(obj3, sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Alg.Alias.Signature.");
            sb7.append(str);
            sb7.append("WithRSAAndMGF1");
            String obj4 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str);
            sb8.append("WITHRSAANDMGF1");
            configurableProvider.addAlgorithm(obj4, sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Signature.");
            sb9.append(str);
            sb9.append("WITHRSAANDMGF1");
            configurableProvider.addAlgorithm(sb9.toString(), str2);
        }

        private void addX931Signature(ConfigurableProvider configurableProvider, String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Alg.Alias.Signature.");
            sb.append(str);
            sb.append("withRSA/X9.31");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("WITHRSA/X9.31");
            configurableProvider.addAlgorithm(obj, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.Signature.");
            sb3.append(str);
            sb3.append("WithRSA/X9.31");
            String obj2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("WITHRSA/X9.31");
            configurableProvider.addAlgorithm(obj2, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Signature.");
            sb5.append(str);
            sb5.append("WITHRSA/X9.31");
            configurableProvider.addAlgorithm(sb5.toString(), str2);
        }

        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("AlgorithmParameters.OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP");
            configurableProvider.addAlgorithm("AlgorithmParameters.PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Cipher.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            configurableProvider.addAlgorithm("Cipher.RSA/RAW", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            configurableProvider.addAlgorithm("Cipher.RSA/PKCS1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            configurableProvider.addAlgorithm("Cipher", PKCSObjectIdentifiers.rsaEncryption, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            configurableProvider.addAlgorithm("Cipher", X509ObjectIdentifiers.id_ea_rsa, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            configurableProvider.addAlgorithm("Cipher.RSA/1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly");
            configurableProvider.addAlgorithm("Cipher.RSA/2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly");
            configurableProvider.addAlgorithm("Cipher.RSA/OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
            configurableProvider.addAlgorithm("Cipher", PKCSObjectIdentifiers.id_RSAES_OAEP, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
            configurableProvider.addAlgorithm("Cipher.RSA/ISO9796-1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//RAW", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
            configurableProvider.addAlgorithm("KeyFactory.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi");
            KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
            registerOid(configurableProvider, PKCSObjectIdentifiers.rsaEncryption, "RSA", keyFactorySpi);
            registerOid(configurableProvider, X509ObjectIdentifiers.id_ea_rsa, "RSA", keyFactorySpi);
            registerOid(configurableProvider, PKCSObjectIdentifiers.id_RSAES_OAEP, "RSA", keyFactorySpi);
            registerOid(configurableProvider, PKCSObjectIdentifiers.id_RSASSA_PSS, "RSA", keyFactorySpi);
            registerOidAlgorithmParameters(configurableProvider, PKCSObjectIdentifiers.rsaEncryption, "RSA");
            registerOidAlgorithmParameters(configurableProvider, X509ObjectIdentifiers.id_ea_rsa, "RSA");
            registerOidAlgorithmParameters(configurableProvider, PKCSObjectIdentifiers.id_RSAES_OAEP, "OAEP");
            registerOidAlgorithmParameters(configurableProvider, PKCSObjectIdentifiers.id_RSASSA_PSS, "PSS");
            configurableProvider.addAlgorithm("Signature.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            StringBuilder sb = new StringBuilder();
            sb.append("Signature.");
            sb.append(PKCSObjectIdentifiers.id_RSASSA_PSS);
            configurableProvider.addAlgorithm(sb.toString(), "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Signature.OID.");
            sb2.append(PKCSObjectIdentifiers.id_RSASSA_PSS);
            configurableProvider.addAlgorithm(sb2.toString(), "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            configurableProvider.addAlgorithm("Signature.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA");
            configurableProvider.addAlgorithm("Signature.RAWRSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.RAWRSA", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSA", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSAANDMGF1", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
            addPSSSignature(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA");
            addPSSSignature(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA");
            addPSSSignature(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA");
            addPSSSignature(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA");
            addPSSSignature(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSA");
            addPSSSignature(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSA");
            addPSSSignature(configurableProvider, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSA");
            addPSSSignature(configurableProvider, SPHINCS256KeyGenParameterSpec.SHA3_256, "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSA");
            addPSSSignature(configurableProvider, "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSA");
            addPSSSignature(configurableProvider, "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSA");
            if (configurableProvider.hasAlgorithm("MessageDigest", "MD2")) {
                addDigestSignature(configurableProvider, "MD2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2", PKCSObjectIdentifiers.md2WithRSAEncryption);
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "MD4")) {
                addDigestSignature(configurableProvider, "MD4", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4", PKCSObjectIdentifiers.md4WithRSAEncryption);
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "MD5")) {
                addDigestSignature(configurableProvider, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", PKCSObjectIdentifiers.md5WithRSAEncryption);
                addISO9796Signature(configurableProvider, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption");
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "SHA1")) {
                configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
                configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
                addPSSSignature(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA");
                addDigestSignature(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", PKCSObjectIdentifiers.sha1WithRSAEncryption);
                addISO9796Signature(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Alg.Alias.Signature.");
                sb3.append(OIWObjectIdentifiers.sha1WithRSA);
                configurableProvider.addAlgorithm(sb3.toString(), "SHA1WITHRSA");
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Alg.Alias.Signature.OID.");
                sb4.append(OIWObjectIdentifiers.sha1WithRSA);
                configurableProvider.addAlgorithm(sb4.toString(), "SHA1WITHRSA");
                addX931Signature(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA1WithRSAEncryption");
            }
            addDigestSignature(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", PKCSObjectIdentifiers.sha224WithRSAEncryption);
            addDigestSignature(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", PKCSObjectIdentifiers.sha256WithRSAEncryption);
            addDigestSignature(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", PKCSObjectIdentifiers.sha384WithRSAEncryption);
            addDigestSignature(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", PKCSObjectIdentifiers.sha512WithRSAEncryption);
            addDigestSignature(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_224", (ASN1ObjectIdentifier) null);
            addDigestSignature(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_256", (ASN1ObjectIdentifier) null);
            addDigestSignature(configurableProvider, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_224", NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224);
            addDigestSignature(configurableProvider, SPHINCS256KeyGenParameterSpec.SHA3_256, "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_256", NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256);
            addDigestSignature(configurableProvider, "SHA3-384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_384", NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384);
            addDigestSignature(configurableProvider, "SHA3-512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_512", NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512);
            addISO9796Signature(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA224WithRSAEncryption");
            addISO9796Signature(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA256WithRSAEncryption");
            addISO9796Signature(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA384WithRSAEncryption");
            addISO9796Signature(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512WithRSAEncryption");
            addISO9796Signature(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_224WithRSAEncryption");
            addISO9796Signature(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_256WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA224WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA256WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA384WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_224WithRSAEncryption");
            addX931Signature(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_256WithRSAEncryption");
            if (configurableProvider.hasAlgorithm("MessageDigest", "RIPEMD128")) {
                addDigestSignature(configurableProvider, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
                addDigestSignature(configurableProvider, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", (ASN1ObjectIdentifier) null);
                addX931Signature(configurableProvider, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
                addX931Signature(configurableProvider, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "RIPEMD160")) {
                addDigestSignature(configurableProvider, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
                addDigestSignature(configurableProvider, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", (ASN1ObjectIdentifier) null);
                configurableProvider.addAlgorithm("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
                configurableProvider.addAlgorithm("Signature.RIPEMD160withRSA/ISO9796-2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption");
                addX931Signature(configurableProvider, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
                addX931Signature(configurableProvider, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "RIPEMD256")) {
                addDigestSignature(configurableProvider, "RIPEMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
                addDigestSignature(configurableProvider, "RMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", (ASN1ObjectIdentifier) null);
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "WHIRLPOOL")) {
                addISO9796Signature(configurableProvider, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                addISO9796Signature(configurableProvider, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                addX931Signature(configurableProvider, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
                addX931Signature(configurableProvider, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
            }
        }
    }
}
