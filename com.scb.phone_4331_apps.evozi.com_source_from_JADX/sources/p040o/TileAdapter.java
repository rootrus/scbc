package p040o;

import com.google.android.gms.common.api.Api;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PushbackInputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.BasicPermission;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Permission;
import java.security.Principal;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p040o.Keep;
import p040o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder;

/* renamed from: o.TileAdapter */
public final class TileAdapter implements C10432xa04fa290 {
    private C10432xa04fa290 write = null;

    /* renamed from: o.TileAdapter$NtbScbCustomerHolder */
    public interface NtbScbCustomerHolder {
        KeyFactory MediaBrowserCompat$CustomActionResultReceiver(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

        Signature MediaBrowserCompat$ItemReceiver(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

        CertificateFactory write(String str) throws NoSuchProviderException, CertificateException;
    }

    /* renamed from: o.TileAdapter$GroupHolder */
    final class GroupHolder extends CRLException {
        private Throwable write;

        GroupHolder(String str, Throwable th) {
            super(str);
            this.write = th;
        }

        public final Throwable getCause() {
            return this.write;
        }
    }

    /* renamed from: o.TileAdapter$ShortcutHolder */
    final class ShortcutHolder implements loadInBackground {
        ShortcutHolder() {
        }

        static {
            new NtbScbCustomerHolder_ViewBinding("SC", ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA);
            new NtbScbCustomerHolder_ViewBinding("SC", ConfigurableProvider.EC_IMPLICITLY_CA);
            new NtbScbCustomerHolder_ViewBinding("SC", ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS);
            new NtbScbCustomerHolder_ViewBinding("SC", ConfigurableProvider.DH_DEFAULT_PARAMS);
        }
    }

    /* renamed from: o.TileAdapter$BaseHolder_ViewBinding */
    public class BaseHolder_ViewBinding implements CertPathParameters {
        public final int IconCompatParcelizer;
        public final Set<X509Certificate> MediaBrowserCompat$ItemReceiver;
        public final BaseHolder write;

        public Object clone() {
            return this;
        }

        public /* synthetic */ BaseHolder_ViewBinding(read read2, byte b) {
            this(read2);
        }

        /* renamed from: o.TileAdapter$BaseHolder_ViewBinding$read */
        public static class read {
            public Set<X509Certificate> MediaBrowserCompat$ItemReceiver = new HashSet();
            public int read = 5;
            final BaseHolder write;

            public read(PKIXBuilderParameters pKIXBuilderParameters) {
                this.write = new BaseHolder(new TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver((PKIXParameters) pKIXBuilderParameters), (byte) 0);
                this.read = pKIXBuilderParameters.getMaxPathLength();
            }

            public read(BaseHolder baseHolder) {
                this.write = baseHolder;
            }
        }

        private BaseHolder_ViewBinding(read read2) {
            this.write = read2.write;
            this.MediaBrowserCompat$ItemReceiver = Collections.unmodifiableSet(read2.MediaBrowserCompat$ItemReceiver);
            this.IconCompatParcelizer = read2.read;
        }
    }

    /* renamed from: o.TileAdapter$AddShortcutHolder_ViewBinding */
    public final class AddShortcutHolder_ViewBinding<T extends Certificate> implements BankAccountAdapter$BankAccountViewHolder<T> {
        public final CertSelector IconCompatParcelizer;

        public /* synthetic */ AddShortcutHolder_ViewBinding(CertSelector certSelector, byte b) {
            this(certSelector);
        }

        /* renamed from: o.TileAdapter$AddShortcutHolder_ViewBinding$read */
        public static class read {
            public final CertSelector IconCompatParcelizer;

            public read(CertSelector certSelector) {
                this.IconCompatParcelizer = (CertSelector) certSelector.clone();
            }
        }

        private AddShortcutHolder_ViewBinding(CertSelector certSelector) {
            this.IconCompatParcelizer = certSelector;
        }

        public final Object clone() {
            return new AddShortcutHolder_ViewBinding(this.IconCompatParcelizer);
        }
    }

    /* renamed from: o.TileAdapter$GroupHolder_ViewBinding */
    final class GroupHolder_ViewBinding {
        private final String IconCompatParcelizer;
        private final String MediaBrowserCompat$ItemReceiver;
        private final String read;
        private final String write;

        GroupHolder_ViewBinding(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("-----BEGIN ");
            sb.append(str);
            sb.append("-----");
            this.read = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("-----BEGIN X509 ");
            sb2.append(str);
            sb2.append("-----");
            this.write = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("-----END ");
            sb3.append(str);
            sb3.append("-----");
            this.IconCompatParcelizer = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("-----END X509 ");
            sb4.append(str);
            sb4.append("-----");
            this.MediaBrowserCompat$ItemReceiver = sb4.toString();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String read(java.io.InputStream r3) throws java.io.IOException {
            /*
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
            L_0x0005:
                int r1 = r3.read()
                r2 = 13
                if (r1 == r2) goto L_0x0018
                r2 = 10
                if (r1 == r2) goto L_0x0018
                if (r1 < 0) goto L_0x0018
                char r1 = (char) r1
                r0.append(r1)
                goto L_0x0005
            L_0x0018:
                if (r1 < 0) goto L_0x0020
                int r2 = r0.length()
                if (r2 == 0) goto L_0x0005
            L_0x0020:
                if (r1 >= 0) goto L_0x0024
                r3 = 0
                return r3
            L_0x0024:
                java.lang.String r3 = r0.toString()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.TileAdapter.GroupHolder_ViewBinding.read(java.io.InputStream):java.lang.String");
        }

        /* access modifiers changed from: package-private */
        public final HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream) throws IOException {
            String read2;
            StringBuffer stringBuffer = new StringBuffer();
            do {
                read2 = read(inputStream);
                if (read2 == null || read2.startsWith(this.read) || read2.startsWith(this.write)) {
                }
                read2 = read(inputStream);
                break;
            } while (read2.startsWith(this.write));
            while (true) {
                String read3 = read(inputStream);
                if (read3 != null && !read3.startsWith(this.IconCompatParcelizer) && !read3.startsWith(this.MediaBrowserCompat$ItemReceiver)) {
                    stringBuffer.append(read3);
                }
            }
            if (stringBuffer.length() == 0) {
                return null;
            }
            try {
                return HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MoreOptionsAdapter$MoreOptionsHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(stringBuffer.toString()));
            } catch (Exception unused) {
                throw new IOException("malformed PEM data encountered");
            }
        }
    }

    /* renamed from: o.TileAdapter$BaseHolder */
    public final class BaseHolder implements CertPathParameters {
        public final List<ShortcutAdapter$MyViewHolder> IconCompatParcelizer;
        public final List<ShortcutAdapter$MyViewHolder_ViewBinding> MediaBrowserCompat$CustomActionResultReceiver;
        public final PKIXParameters MediaBrowserCompat$ItemReceiver;
        public final Map<CreditCardDetailsAdapter$ItemViewHolder, ShortcutAdapter$MyViewHolder_ViewBinding> MediaBrowserCompat$MediaItem;
        public final Set<TrustAnchor> MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final int f5824x50fd9e4a;
        public final AddShortcutHolder_ViewBinding MediaDescriptionCompat;
        public final boolean MediaMetadataCompat;
        public final boolean RatingCompat;
        public final Date read;
        public final Map<CreditCardDetailsAdapter$ItemViewHolder, ShortcutAdapter$MyViewHolder> write;

        public final Object clone() {
            return this;
        }

        public /* synthetic */ BaseHolder(TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver, byte b) {
            this(tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver);
        }

        private BaseHolder(TileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.write;
            this.read = tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.read;
            this.MediaBrowserCompat$CustomActionResultReceiver = Collections.unmodifiableList(tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$MediaItem = Collections.unmodifiableMap(new HashMap(tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver));
            this.IconCompatParcelizer = Collections.unmodifiableList(tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
            this.write = Collections.unmodifiableMap(new HashMap(tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer));
            this.MediaDescriptionCompat = tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
            this.MediaMetadataCompat = tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.RatingCompat;
            this.RatingCompat = tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
            this.f5824x50fd9e4a = tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
            this.MediaBrowserCompat$SearchResultReceiver = Collections.unmodifiableSet(tileAdapter$BaseHolder$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat);
        }
    }

    /* renamed from: o.TileAdapter$BannerViewHolder_ViewBinding */
    public final class BannerViewHolder_ViewBinding implements loadInBackground {
        private BannerViewHolder_ViewBinding(byte b) {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public BannerViewHolder_ViewBinding() {
            this((byte) 0);
            new Hashtable();
            new Vector();
        }
    }

    /* renamed from: o.TileAdapter$LearnMoreHolder_ViewBinding */
    final class LearnMoreHolder_ViewBinding {
        private static final HmlBanksGridAdapter$HmlBankViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = InvestmentDetailsClientListAdapter$NoFundViewHolder.write;

        LearnMoreHolder_ViewBinding() {
        }

        static void IconCompatParcelizer(Signature signature, HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null && !MediaBrowserCompat$CustomActionResultReceiver.equals(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding)) {
                AlgorithmParameters instance = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
                try {
                    instance.init(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem().ParcelableVolumeInfo());
                    if (signature.getAlgorithm().endsWith("MGF1")) {
                        try {
                            signature.setParameter(instance.getParameterSpec(PSSParameterSpec.class));
                        } catch (GeneralSecurityException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Exception extracting parameters: ");
                            sb.append(e.getMessage());
                            throw new SignatureException(sb.toString());
                        }
                    }
                } catch (IOException e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("IOException decoding parameters: ");
                    sb2.append(e2.getMessage());
                    throw new SignatureException(sb2.toString());
                }
            }
        }

        private static String write(HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder) {
            if (RecommendRecyclerAdapter$RecommendViewHolder.MediaSessionCompat$Token.equals(hmlBusinessInfoAdapter$BankAccountViewHolder)) {
                return "MD5";
            }
            if (HighlightRecycleAdapter$MyViewHolder_ViewBinding.write.equals(hmlBusinessInfoAdapter$BankAccountViewHolder)) {
                return "SHA1";
            }
            if (DiscoverTopListRecyclerAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.equals(hmlBusinessInfoAdapter$BankAccountViewHolder)) {
                return "SHA224";
            }
            if (DiscoverTopListRecyclerAdapter$GroupItemViewHolder_ViewBinding.write.equals(hmlBusinessInfoAdapter$BankAccountViewHolder)) {
                return "SHA256";
            }
            if (DiscoverTopListRecyclerAdapter$GroupItemViewHolder_ViewBinding.RatingCompat.equals(hmlBusinessInfoAdapter$BankAccountViewHolder)) {
                return "SHA384";
            }
            if (DiscoverTopListRecyclerAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$MediaItem.equals(hmlBusinessInfoAdapter$BankAccountViewHolder)) {
                return "SHA512";
            }
            if (RecommendRecyclerAdapter$IpoRecommendViewHolder.IconCompatParcelizer.equals(hmlBusinessInfoAdapter$BankAccountViewHolder)) {
                return "RIPEMD128";
            }
            if (RecommendRecyclerAdapter$IpoRecommendViewHolder.read.equals(hmlBusinessInfoAdapter$BankAccountViewHolder)) {
                return "RIPEMD160";
            }
            if (RecommendRecyclerAdapter$IpoRecommendViewHolder.MediaBrowserCompat$ItemReceiver.equals(hmlBusinessInfoAdapter$BankAccountViewHolder)) {
                return "RIPEMD256";
            }
            return C10395x3b936e9d.write.equals(hmlBusinessInfoAdapter$BankAccountViewHolder) ? "GOST3411" : hmlBusinessInfoAdapter$BankAccountViewHolder.write;
        }

        static String write(LtfSummaryAdapter$SsfChildViewHolder ltfSummaryAdapter$SsfChildViewHolder) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = ltfSummaryAdapter$SsfChildViewHolder.write;
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null && !MediaBrowserCompat$CustomActionResultReceiver.equals(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding)) {
                if (ltfSummaryAdapter$SsfChildViewHolder.MediaBrowserCompat$CustomActionResultReceiver.equals(RecommendRecyclerAdapter$RecommendViewHolder.MediaBrowserCompat$MediaItem)) {
                    RecommendRecyclerAdapter$RecommendViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver2 = RecommendRecyclerAdapter$RecommendViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
                    StringBuilder sb = new StringBuilder();
                    sb.append(write(MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver));
                    sb.append("withRSAandMGF1");
                    return sb.toString();
                } else if (ltfSummaryAdapter$SsfChildViewHolder.MediaBrowserCompat$CustomActionResultReceiver.equals(LandingPageAdapter$MyViewHolder.write)) {
                    HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver3 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(write((HmlBusinessInfoAdapter$BankAccountViewHolder) MediaBrowserCompat$CustomActionResultReceiver3.read(0)));
                    sb2.append("withECDSA");
                    return sb2.toString();
                }
            }
            Provider provider = Security.getProvider("SC");
            if (provider != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Alg.Alias.Signature.");
                sb3.append(ltfSummaryAdapter$SsfChildViewHolder.MediaBrowserCompat$CustomActionResultReceiver.write);
                String property = provider.getProperty(sb3.toString());
                if (property != null) {
                    return property;
                }
            }
            Provider[] providers = Security.getProviders();
            for (int i = 0; i != providers.length; i++) {
                Provider provider2 = providers[i];
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Alg.Alias.Signature.");
                sb4.append(ltfSummaryAdapter$SsfChildViewHolder.MediaBrowserCompat$CustomActionResultReceiver.write);
                String property2 = provider2.getProperty(sb4.toString());
                if (property2 != null) {
                    return property2;
                }
            }
            return ltfSummaryAdapter$SsfChildViewHolder.MediaBrowserCompat$CustomActionResultReceiver.write;
        }
    }

    /* renamed from: o.TileAdapter$StaticShortcutHolder_ViewBinding */
    public class StaticShortcutHolder_ViewBinding implements NtbScbCustomerHolder {
        private Provider read;

        public StaticShortcutHolder_ViewBinding(Provider provider) {
            this.read = provider;
        }

        public final KeyFactory MediaBrowserCompat$CustomActionResultReceiver(String str) throws NoSuchAlgorithmException {
            return KeyFactory.getInstance(str, this.read);
        }

        public final Signature MediaBrowserCompat$ItemReceiver(String str) throws NoSuchAlgorithmException {
            return Signature.getInstance(str, this.read);
        }

        public final CertificateFactory write(String str) throws CertificateException {
            return CertificateFactory.getInstance(str, this.read);
        }
    }

    public TileAdapter(C10432xa04fa290 suitabilitySummaryAdapter$SuitabilitySummarySectionViewHolder_ViewBinding) {
        this.write = suitabilitySummaryAdapter$SuitabilitySummarySectionViewHolder_ViewBinding;
        suitabilitySummaryAdapter$SuitabilitySummarySectionViewHolder_ViewBinding.IconCompatParcelizer();
    }

    /* renamed from: o.TileAdapter$ShortcutHolder_ViewBinding */
    public final class ShortcutHolder_ViewBinding extends SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder implements Principal {
        private static HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write(CompanyItemViewHolder companyItemViewHolder) throws IOException {
            try {
                return HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(companyItemViewHolder.MediaBrowserCompat$ItemReceiver());
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("not an ASN.1 Sequence: ");
                sb.append(e);
                throw new IOException(sb.toString());
            }
        }

        public ShortcutHolder_ViewBinding(byte[] bArr) throws IOException {
            super(write(new CompanyItemViewHolder(bArr)));
        }

        public ShortcutHolder_ViewBinding(SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder suitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder) {
            super((HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) suitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder.MediaBrowserCompat$MediaItem());
        }

        public ShortcutHolder_ViewBinding(DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding) {
            super((HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) dividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$MediaItem());
        }

        public final String getName() {
            return toString();
        }

        public final byte[] ParcelableVolumeInfo() {
            try {
                return write(ASN1Encoding.DER);
            } catch (IOException e) {
                throw new RuntimeException(e.toString());
            }
        }
    }

    /* renamed from: o.TileAdapter$StaticShortcutHolder */
    public final class StaticShortcutHolder extends Provider implements loadInBackground {
        private static final String[] IconCompatParcelizer = {"X509", "IES"};
        private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b"};
        private static final String[] MediaBrowserCompat$ItemReceiver = {"AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF"};
        private static final Map MediaBrowserCompat$MediaItem = new HashMap();
        private static String MediaBrowserCompat$SearchResultReceiver = "BouncyCastle Security Provider v1.54";
        private static final String[] MediaDescriptionCompat = {"SipHash"};
        private static final String[] MediaMetadataCompat = {"PBEPBKDF2", "PBEPKCS12"};
        private static final String[] read = {BouncyCastleProvider.PROVIDER_NAME, "PKCS12"};
        private static final String[] write = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145"};

        static {
            new ShortcutHolder();
        }

        public StaticShortcutHolder() {
            super("SC", 1.54d, MediaBrowserCompat$SearchResultReceiver);
            AccessController.doPrivileged(new PrivilegedAction() {
                public final Object run() {
                    StaticShortcutHolder.MediaBrowserCompat$CustomActionResultReceiver(StaticShortcutHolder.this);
                    return null;
                }
            });
        }

        private void MediaBrowserCompat$CustomActionResultReceiver(String str, String[] strArr) {
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
                        cls.newInstance();
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

        public static PublicKey MediaBrowserCompat$ItemReceiver(LandingAccountsAdapter$AccountViewHolder_ViewBinding landingAccountsAdapter$AccountViewHolder_ViewBinding) throws IOException {
            Keep.read read2 = (Keep.read) MediaBrowserCompat$MediaItem.get(landingAccountsAdapter$AccountViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
            if (read2 == null) {
                return null;
            }
            return read2.MediaBrowserCompat$MediaItem();
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(StaticShortcutHolder staticShortcutHolder) {
            staticShortcutHolder.MediaBrowserCompat$CustomActionResultReceiver("org.spongycastle.jcajce.provider.digest.", MediaBrowserCompat$CustomActionResultReceiver);
            staticShortcutHolder.MediaBrowserCompat$CustomActionResultReceiver("org.spongycastle.jcajce.provider.symmetric.", MediaMetadataCompat);
            staticShortcutHolder.MediaBrowserCompat$CustomActionResultReceiver("org.spongycastle.jcajce.provider.symmetric.", MediaDescriptionCompat);
            staticShortcutHolder.MediaBrowserCompat$CustomActionResultReceiver("org.spongycastle.jcajce.provider.symmetric.", MediaBrowserCompat$ItemReceiver);
            staticShortcutHolder.MediaBrowserCompat$CustomActionResultReceiver("org.spongycastle.jcajce.provider.asymmetric.", IconCompatParcelizer);
            staticShortcutHolder.MediaBrowserCompat$CustomActionResultReceiver("org.spongycastle.jcajce.provider.asymmetric.", write);
            staticShortcutHolder.MediaBrowserCompat$CustomActionResultReceiver("org.spongycastle.jcajce.provider.keystore.", read);
            staticShortcutHolder.put("X509Store.CERTIFICATE/COLLECTION", "o.MerchantWalletOutgoingTransactionAdapter$ChildViewHolder");
            staticShortcutHolder.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "o.SmeLoanDetailPnItemAdapter$ChildViewHolder_ViewBinding");
            staticShortcutHolder.put("X509Store.CRL/COLLECTION", "o.MailingAddressGoodToKnowAdapter$GoodToKnowViewHolder");
            staticShortcutHolder.put("X509Store.CERTIFICATEPAIR/COLLECTION", "o.MerchantWalletIncomingTransactionAdapter$ChildViewHolder_ViewBinding");
            staticShortcutHolder.put("X509Store.CERTIFICATE/LDAP", "o.BankAccountAdapter$BankAccountViewHolder_ViewBinding");
            staticShortcutHolder.put("X509Store.CRL/LDAP", "o.MerchantWalletIncomingTransactionAdapter$IncomingGroupItemViewHolder");
            staticShortcutHolder.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "o.MerchantWalletIncomingTransactionAdapter$IncomingGroupItemViewHolder_ViewBinding");
            staticShortcutHolder.put("X509Store.CERTIFICATEPAIR/LDAP", "o.MerchantWalletIncomingTransactionAdapter$ChildViewHolder");
            staticShortcutHolder.put("X509StreamParser.CERTIFICATE", "o.MailingAddressGoodToKnowAdapter$GoodToKnowViewHolder_ViewBinding");
            staticShortcutHolder.put("X509StreamParser.ATTRIBUTECERTIFICATE", "o.SmeLoanDetailLgItemAdapter$GroupItemViewHolder_ViewBinding");
            staticShortcutHolder.put("X509StreamParser.CRL", "o.SmeLoanDetailPnItemAdapter$ChildViewHolder");
            staticShortcutHolder.put("X509StreamParser.CERTIFICATEPAIR", "o.SmeLoanDetailPnItemAdapter$GroupItemViewHolder");
            staticShortcutHolder.put("Cipher.BROKENPBEWITHMD5ANDDES", "o.PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver");
            staticShortcutHolder.put("Cipher.BROKENPBEWITHSHA1ANDDES", "o.PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding$write");
            staticShortcutHolder.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "o.PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding$IconCompatParcelizer");
            staticShortcutHolder.put("CertPathValidator.RFC3281", "o.LoanDetailAdapter$LoanSummaryDetailViewHolder");
            staticShortcutHolder.put("CertPathBuilder.RFC3281", "o.SmeLoanAccountSelectorAdapter$ItemViewHolder");
            staticShortcutHolder.put("CertPathValidator.RFC3280", "o.SmeLoanDetailCommercialItemAdapter$GroupItemViewHolder");
            staticShortcutHolder.put("CertPathBuilder.RFC3280", "o.SmeLoanAccountSelectorAdapter$ItemViewHolder_ViewBinding");
            staticShortcutHolder.put("CertPathValidator.PKIX", "o.SmeLoanDetailCommercialItemAdapter$GroupItemViewHolder");
            staticShortcutHolder.put("CertPathBuilder.PKIX", "o.SmeLoanAccountSelectorAdapter$ItemViewHolder_ViewBinding");
            staticShortcutHolder.put("CertStore.Collection", "o.UnselectedTileAdapter$Holder_ViewBinding");
            staticShortcutHolder.put("CertStore.LDAP", "o.SmeLoanDetailPnItemAdapter$GroupItemViewHolder_ViewBinding");
            staticShortcutHolder.put("CertStore.Multi", "o.SmeLoanDetailCommercialItemAdapter$ChildViewHolder");
            staticShortcutHolder.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
        }
    }

    /* renamed from: o.TileAdapter$LearnMoreHolder */
    public final class LearnMoreHolder extends CertPath {
        static final List IconCompatParcelizer;
        private final NtbScbCustomerHolder MediaBrowserCompat$ItemReceiver = new PredictiveHolder_ViewBinding();
        private List read;

        static {
            ArrayList arrayList = new ArrayList();
            arrayList.add("PkiPath");
            arrayList.add("PEM");
            arrayList.add("PKCS7");
            IconCompatParcelizer = Collections.unmodifiableList(arrayList);
        }

        private static List read(List list) {
            boolean z;
            boolean z2;
            if (list.size() < 2) {
                return list;
            }
            X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
            int i = 1;
            while (true) {
                if (i != list.size()) {
                    if (!issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                        z = false;
                        break;
                    }
                    issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            ArrayList arrayList2 = new ArrayList(list);
            for (int i2 = 0; i2 < list.size(); i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                int i3 = 0;
                while (true) {
                    if (i3 == list.size()) {
                        z2 = false;
                        break;
                    } else if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z2) {
                    arrayList.add(x509Certificate);
                    list.remove(i2);
                }
            }
            if (arrayList.size() > 1) {
                return arrayList2;
            }
            for (int i4 = 0; i4 != arrayList.size(); i4++) {
                X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
                int i5 = 0;
                while (true) {
                    if (i5 >= list.size()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                    if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                        arrayList.add(x509Certificate2);
                        list.remove(i5);
                        break;
                    }
                    i5++;
                }
            }
            return list.size() > 0 ? arrayList2 : arrayList;
        }

        LearnMoreHolder(List list) {
            super("X.509");
            this.read = read(new ArrayList(list));
        }

        LearnMoreHolder(InputStream inputStream, String str) throws CertificateException {
            super("X.509");
            try {
                if (!str.equalsIgnoreCase("PkiPath")) {
                    if (!str.equalsIgnoreCase("PKCS7")) {
                        if (!str.equalsIgnoreCase("PEM")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unsupported encoding: ");
                            sb.append(str);
                            throw new CertificateException(sb.toString());
                        }
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                    this.read = new ArrayList();
                    CertificateFactory write = this.MediaBrowserCompat$ItemReceiver.write("X.509");
                    while (true) {
                        Certificate generateCertificate = write.generateCertificate(bufferedInputStream);
                        if (generateCertificate == null) {
                            break;
                        }
                        this.read.add(generateCertificate);
                    }
                } else {
                    C10402xc503e64f MediaBrowserCompat$ItemReceiver2 = new CompanyItemViewHolder(inputStream).MediaBrowserCompat$ItemReceiver();
                    if (MediaBrowserCompat$ItemReceiver2 instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
                        Enumeration write2 = ((HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) MediaBrowserCompat$ItemReceiver2).write();
                        this.read = new ArrayList();
                        CertificateFactory write3 = this.MediaBrowserCompat$ItemReceiver.write("X.509");
                        while (write2.hasMoreElements()) {
                            this.read.add(0, write3.generateCertificate(new ByteArrayInputStream(((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write2.nextElement()).MediaBrowserCompat$MediaItem().write(ASN1Encoding.DER))));
                        }
                    } else {
                        throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                    }
                }
                this.read = read(this.read);
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("IOException throw while decoding CertPath:\n");
                sb2.append(e.toString());
                throw new CertificateException(sb2.toString());
            } catch (NoSuchProviderException e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("BouncyCastle provider not found while trying to get a CertificateFactory:\n");
                sb3.append(e2.toString());
                throw new CertificateException(sb3.toString());
            }
        }

        public final Iterator getEncodings() {
            return IconCompatParcelizer.iterator();
        }

        public final byte[] getEncoded() throws CertificateEncodingException {
            Iterator<String> encodings = getEncodings();
            if (!encodings.hasNext()) {
                return null;
            }
            String next = encodings.next();
            if (next instanceof String) {
                return getEncoded(next);
            }
            return null;
        }

        public final byte[] getEncoded(String str) throws CertificateEncodingException {
            if (str.equalsIgnoreCase("PkiPath")) {
                CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
                List list = this.read;
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    companyItemViewHolder_ViewBinding.write.addElement(write((X509Certificate) listIterator.previous()));
                }
                return IconCompatParcelizer(new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding));
            }
            int i = 0;
            if (str.equalsIgnoreCase("PKCS7")) {
                HighlightRecycleAdapter$MyViewHolder highlightRecycleAdapter$MyViewHolder = new HighlightRecycleAdapter$MyViewHolder(RecommendRecyclerAdapter$RecommendViewHolder.write, (HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) null);
                CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding2 = new CompanyItemViewHolder_ViewBinding();
                while (i != this.read.size()) {
                    companyItemViewHolder_ViewBinding2.write.addElement(write((X509Certificate) this.read.get(i)));
                    i++;
                }
                return IconCompatParcelizer(new HighlightRecycleAdapter$MyViewHolder(RecommendRecyclerAdapter$RecommendViewHolder.AppCompatDelegateImpl$ListMenuDecorView, new RecommendRecyclerAdapter$IpoRecommendViewHolder_ViewBinding(new HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(1), new BasicAssetAllocationAdapter$BaaHolder_ViewBinding(), highlightRecycleAdapter$MyViewHolder, new BasicAssetAllocationAdapter$BaaHolder_ViewBinding(companyItemViewHolder_ViewBinding2), new BasicAssetAllocationAdapter$BaaHolder_ViewBinding())));
            } else if (str.equalsIgnoreCase("PEM")) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                UserProfileImageSelectionAdapter$ItemViewHolder userProfileImageSelectionAdapter$ItemViewHolder = new UserProfileImageSelectionAdapter$ItemViewHolder(new OutputStreamWriter(byteArrayOutputStream));
                while (i != this.read.size()) {
                    try {
                        userProfileImageSelectionAdapter$ItemViewHolder.read((MwShopTypeAdapter$ShopTypeViewHolder) new MwPlaceAdapter$PredictionHolder_ViewBinding("CERTIFICATE", ((X509Certificate) this.read.get(i)).getEncoded()));
                        i++;
                    } catch (Exception unused) {
                        throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                    }
                }
                userProfileImageSelectionAdapter$ItemViewHolder.close();
                return byteArrayOutputStream.toByteArray();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("unsupported encoding: ");
                sb.append(str);
                throw new CertificateEncodingException(sb.toString());
            }
        }

        public final List getCertificates() {
            return Collections.unmodifiableList(new ArrayList(this.read));
        }

        private static C10402xc503e64f write(X509Certificate x509Certificate) throws CertificateEncodingException {
            try {
                return new CompanyItemViewHolder(x509Certificate.getEncoded()).MediaBrowserCompat$ItemReceiver();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception while encoding certificate: ");
                sb.append(e.toString());
                throw new CertificateEncodingException(sb.toString());
            }
        }

        private static byte[] IconCompatParcelizer(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) throws CertificateEncodingException {
            try {
                return hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem().write(ASN1Encoding.DER);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception thrown: ");
                sb.append(e);
                throw new CertificateEncodingException(sb.toString());
            }
        }
    }

    /* renamed from: o.TileAdapter$NtbScbCustomerHolder_ViewBinding */
    public final class NtbScbCustomerHolder_ViewBinding extends BasicPermission {
        private final String IconCompatParcelizer;
        private final int read;

        public NtbScbCustomerHolder_ViewBinding(String str, String str2) {
            super(str, str2);
            this.IconCompatParcelizer = str2;
            this.read = write(str2);
        }

        private static int write(String str) {
            StringTokenizer stringTokenizer = new StringTokenizer(MoneyActionAdapter$CustomViewHolder.write(str), " ,");
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.equals("threadlocalecimplicitlyca")) {
                    i |= 1;
                } else if (nextToken.equals("ecimplicitlyca")) {
                    i |= 2;
                } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                    i |= 4;
                } else if (nextToken.equals("dhdefaultparams")) {
                    i |= 8;
                } else if (nextToken.equals("all")) {
                    i |= 15;
                }
            }
            if (i != 0) {
                return i;
            }
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }

        public final String getActions() {
            return this.IconCompatParcelizer;
        }

        public final boolean implies(Permission permission) {
            if (!(permission instanceof NtbScbCustomerHolder_ViewBinding) || !getName().equals(permission.getName())) {
                return false;
            }
            int i = this.read;
            int i2 = ((NtbScbCustomerHolder_ViewBinding) permission).read;
            if ((i & i2) == i2) {
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NtbScbCustomerHolder_ViewBinding)) {
                return false;
            }
            NtbScbCustomerHolder_ViewBinding ntbScbCustomerHolder_ViewBinding = (NtbScbCustomerHolder_ViewBinding) obj;
            if (this.read != ntbScbCustomerHolder_ViewBinding.read || !getName().equals(ntbScbCustomerHolder_ViewBinding.getName())) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return getName().hashCode() + this.read;
        }
    }

    /* renamed from: o.TileAdapter$BannerViewHolder */
    public final class BannerViewHolder extends CertificateFactorySpi {
        private static final GroupHolder_ViewBinding IconCompatParcelizer = new GroupHolder_ViewBinding("CRL");
        private static final GroupHolder_ViewBinding write = new GroupHolder_ViewBinding("CERTIFICATE");
        private InputStream MediaBrowserCompat$CustomActionResultReceiver = null;
        private final NtbScbCustomerHolder MediaBrowserCompat$ItemReceiver = new PredictiveHolder_ViewBinding();
        private C10403xf0c8ae24 MediaBrowserCompat$MediaItem = null;
        private int MediaBrowserCompat$SearchResultReceiver = 0;
        private int MediaDescriptionCompat = 0;
        private C10403xf0c8ae24 MediaMetadataCompat = null;
        private InputStream read = null;

        private Certificate IconCompatParcelizer(CompanyItemViewHolder companyItemViewHolder) throws IOException, CertificateParsingException {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder = (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
            if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() <= 1 || !(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0) instanceof HmlBusinessInfoAdapter$BankAccountViewHolder) || !hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0).equals(RecommendRecyclerAdapter$RecommendViewHolder.AppCompatDelegateImpl$ListMenuDecorView)) {
                return new PredictiveHolder(this.MediaBrowserCompat$ItemReceiver, hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder != null ? new FundAccountPagerAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder)) : null);
            }
            this.MediaMetadataCompat = RecommendRecyclerAdapter$IpoRecommendViewHolder_ViewBinding.IconCompatParcelizer(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1), true)).AppCompatDialogFragment;
            return read();
        }

        private Certificate read() throws CertificateParsingException {
            FundAccountPagerAdapter$ItemViewHolder fundAccountPagerAdapter$ItemViewHolder = null;
            if (this.MediaMetadataCompat != null) {
                while (this.MediaDescriptionCompat < this.MediaMetadataCompat.IconCompatParcelizer.size()) {
                    C10403xf0c8ae24 hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding = this.MediaMetadataCompat;
                    int i = this.MediaDescriptionCompat;
                    this.MediaDescriptionCompat = i + 1;
                    HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = (HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding.IconCompatParcelizer.elementAt(i);
                    if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
                        NtbScbCustomerHolder ntbScbCustomerHolder = this.MediaBrowserCompat$ItemReceiver;
                        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding instanceof FundAccountPagerAdapter$ItemViewHolder) {
                            fundAccountPagerAdapter$ItemViewHolder = (FundAccountPagerAdapter$ItemViewHolder) hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
                        } else if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
                            fundAccountPagerAdapter$ItemViewHolder = new FundAccountPagerAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding));
                        }
                        return new PredictiveHolder(ntbScbCustomerHolder, fundAccountPagerAdapter$ItemViewHolder);
                    }
                }
            }
            return null;
        }

        private CRL IconCompatParcelizer() throws CRLException {
            C10403xf0c8ae24 hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding = this.MediaBrowserCompat$MediaItem;
            FundSourceListAdapter$FundSourceHolder fundSourceListAdapter$FundSourceHolder = null;
            if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding == null || this.MediaBrowserCompat$SearchResultReceiver >= hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding.IconCompatParcelizer.size()) {
                return null;
            }
            C10403xf0c8ae24 hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding2 = this.MediaBrowserCompat$MediaItem;
            int i = this.MediaBrowserCompat$SearchResultReceiver;
            this.MediaBrowserCompat$SearchResultReceiver = i + 1;
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = (HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding2.IconCompatParcelizer.elementAt(i);
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding instanceof FundSourceListAdapter$FundSourceHolder) {
                fundSourceListAdapter$FundSourceHolder = (FundSourceListAdapter$FundSourceHolder) hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
            } else if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
                fundSourceListAdapter$FundSourceHolder = new FundSourceListAdapter$FundSourceHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding));
            }
            return new DemoHolder(this.MediaBrowserCompat$ItemReceiver, fundSourceListAdapter$FundSourceHolder);
        }

        public final Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
            InputStream inputStream2 = this.read;
            FundAccountPagerAdapter$ItemViewHolder fundAccountPagerAdapter$ItemViewHolder = null;
            if (inputStream2 == null) {
                this.read = inputStream;
                this.MediaMetadataCompat = null;
                this.MediaDescriptionCompat = 0;
            } else if (inputStream2 != inputStream) {
                this.read = inputStream;
                this.MediaMetadataCompat = null;
                this.MediaDescriptionCompat = 0;
            }
            try {
                if (this.MediaMetadataCompat == null) {
                    PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
                    int read2 = pushbackInputStream.read();
                    if (read2 == -1) {
                        return null;
                    }
                    pushbackInputStream.unread(read2);
                    if (read2 == 48) {
                        return IconCompatParcelizer(new CompanyItemViewHolder((InputStream) pushbackInputStream));
                    }
                    HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = write.MediaBrowserCompat$CustomActionResultReceiver(pushbackInputStream);
                    if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                        return null;
                    }
                    NtbScbCustomerHolder ntbScbCustomerHolder = this.MediaBrowserCompat$ItemReceiver;
                    if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                        fundAccountPagerAdapter$ItemViewHolder = new FundAccountPagerAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2));
                    }
                    return new PredictiveHolder(ntbScbCustomerHolder, fundAccountPagerAdapter$ItemViewHolder);
                } else if (this.MediaDescriptionCompat != this.MediaMetadataCompat.IconCompatParcelizer.size()) {
                    return read();
                } else {
                    this.MediaMetadataCompat = null;
                    this.MediaDescriptionCompat = 0;
                    return null;
                }
            } catch (Exception e) {
                throw new C10435xbff5bb4d(e);
            }
        }

        public final Collection engineGenerateCertificates(InputStream inputStream) throws CertificateException {
            ArrayList arrayList = new ArrayList();
            while (true) {
                Certificate engineGenerateCertificate = engineGenerateCertificate(inputStream);
                if (engineGenerateCertificate == null) {
                    return arrayList;
                }
                arrayList.add(engineGenerateCertificate);
            }
        }

        public final CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
            InputStream inputStream2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            FundSourceListAdapter$FundSourceHolder fundSourceListAdapter$FundSourceHolder = null;
            if (inputStream2 == null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = inputStream;
                this.MediaBrowserCompat$MediaItem = null;
                this.MediaBrowserCompat$SearchResultReceiver = 0;
            } else if (inputStream2 != inputStream) {
                this.MediaBrowserCompat$CustomActionResultReceiver = inputStream;
                this.MediaBrowserCompat$MediaItem = null;
                this.MediaBrowserCompat$SearchResultReceiver = 0;
            }
            try {
                if (this.MediaBrowserCompat$MediaItem == null) {
                    PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
                    int read2 = pushbackInputStream.read();
                    if (read2 == -1) {
                        return null;
                    }
                    pushbackInputStream.unread(read2);
                    if (read2 != 48) {
                        HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(pushbackInputStream);
                        if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                            return null;
                        }
                        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                            fundSourceListAdapter$FundSourceHolder = new FundSourceListAdapter$FundSourceHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2));
                        }
                        return new DemoHolder(this.MediaBrowserCompat$ItemReceiver, fundSourceListAdapter$FundSourceHolder);
                    }
                    HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder = (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) new CompanyItemViewHolder((InputStream) pushbackInputStream, (byte) 0).MediaBrowserCompat$ItemReceiver();
                    if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() <= 1 || !(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0) instanceof HmlBusinessInfoAdapter$BankAccountViewHolder) || !hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0).equals(RecommendRecyclerAdapter$RecommendViewHolder.AppCompatDelegateImpl$ListMenuDecorView)) {
                        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder != null) {
                            fundSourceListAdapter$FundSourceHolder = new FundSourceListAdapter$FundSourceHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder));
                        }
                        return new DemoHolder(this.MediaBrowserCompat$ItemReceiver, fundSourceListAdapter$FundSourceHolder);
                    }
                    this.MediaBrowserCompat$MediaItem = RecommendRecyclerAdapter$IpoRecommendViewHolder_ViewBinding.IconCompatParcelizer(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1), true)).AppCompatActivity;
                    return IconCompatParcelizer();
                } else if (this.MediaBrowserCompat$SearchResultReceiver != this.MediaBrowserCompat$MediaItem.IconCompatParcelizer.size()) {
                    return IconCompatParcelizer();
                } else {
                    this.MediaBrowserCompat$MediaItem = null;
                    this.MediaBrowserCompat$SearchResultReceiver = 0;
                    return null;
                }
            } catch (CRLException e) {
                throw e;
            } catch (Exception e2) {
                throw new CRLException(e2.toString());
            }
        }

        public final Collection engineGenerateCRLs(InputStream inputStream) throws CRLException {
            ArrayList arrayList = new ArrayList();
            while (true) {
                CRL engineGenerateCRL = engineGenerateCRL(inputStream);
                if (engineGenerateCRL == null) {
                    return arrayList;
                }
                arrayList.add(engineGenerateCRL);
            }
        }

        public final Iterator engineGetCertPathEncodings() {
            return LearnMoreHolder.IconCompatParcelizer.iterator();
        }

        public final CertPath engineGenerateCertPath(InputStream inputStream) throws CertificateException {
            return engineGenerateCertPath(inputStream, "PkiPath");
        }

        public final CertPath engineGenerateCertPath(InputStream inputStream, String str) throws CertificateException {
            return new LearnMoreHolder(inputStream, str);
        }

        public final CertPath engineGenerateCertPath(List list) throws CertificateException {
            for (Object next : list) {
                if (next != null && !(next instanceof X509Certificate)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("list contains non X509Certificate object while creating CertPath\n");
                    sb.append(next.toString());
                    throw new CertificateException(sb.toString());
                }
            }
            return new LearnMoreHolder(list);
        }
    }

    /* renamed from: o.TileAdapter$DemoHolder_ViewBinding */
    final class DemoHolder_ViewBinding extends X509CRLEntry {
        private int IconCompatParcelizer;
        private DividendSummaryAdapter$ParentViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver;
        private SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer read;
        private boolean write;

        protected DemoHolder_ViewBinding(SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer iconCompatParcelizer, boolean z, DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding) {
            this.read = iconCompatParcelizer;
            this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(z, dividendSummaryAdapter$ParentViewHolder_ViewBinding);
        }

        public final boolean hasUnsupportedCriticalExtension() {
            Set criticalExtensionOIDs = getCriticalExtensionOIDs();
            return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
        }

        private DividendSummaryAdapter$ParentViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver(boolean z, DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding) {
            if (!z) {
                return null;
            }
            HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.write;
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding read2 = this.read.read();
            SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = read2 != null ? (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) read2.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder) : null;
            if (selectableChoiceAdapter$ChoiceHolder_ViewBinding == null) {
                return dividendSummaryAdapter$ParentViewHolder_ViewBinding;
            }
            try {
                C10402xc503e64f IconCompatParcelizer2 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.IconCompatParcelizer(selectableChoiceAdapter$ChoiceHolder_ViewBinding);
                CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = (IconCompatParcelizer2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) : null).MediaBrowserCompat$CustomActionResultReceiver;
                int length = creditCardDetailsAdapter$ItemViewHolderArr.length;
                CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[length];
                System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
                for (int i = 0; i < length; i++) {
                    if (creditCardDetailsAdapter$ItemViewHolderArr2[i].IconCompatParcelizer == 4) {
                        return DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(creditCardDetailsAdapter$ItemViewHolderArr2[i].MediaBrowserCompat$CustomActionResultReceiver);
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }

        public final X500Principal getCertificateIssuer() {
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                return null;
            }
            try {
                return new X500Principal(this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo());
            } catch (IOException unused) {
                return null;
            }
        }

        private Set MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding read2 = this.read.read();
            if (read2 == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            Enumeration elements = read2.read.elements();
            while (elements.hasMoreElements()) {
                HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
                if (z == ((SelectableChoiceAdapter$ChoiceHolder_ViewBinding) read2.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder)).Keep) {
                    hashSet.add(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                }
            }
            return hashSet;
        }

        public final Set getCriticalExtensionOIDs() {
            return MediaBrowserCompat$CustomActionResultReceiver(true);
        }

        public final Set getNonCriticalExtensionOIDs() {
            return MediaBrowserCompat$CustomActionResultReceiver(false);
        }

        public final byte[] getExtensionValue(String str) {
            HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = new HmlBusinessInfoAdapter$BankAccountViewHolder(str);
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding read2 = this.read.read();
            SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = read2 != null ? (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) read2.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder) : null;
            if (selectableChoiceAdapter$ChoiceHolder_ViewBinding == null) {
                return null;
            }
            try {
                return selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView.ParcelableVolumeInfo();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception encoding: ");
                sb.append(e.toString());
                throw new IllegalStateException(sb.toString());
            }
        }

        public final int hashCode() {
            if (!this.write) {
                this.IconCompatParcelizer = super.hashCode();
                this.write = true;
            }
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof DemoHolder_ViewBinding) {
                return this.read.equals(((DemoHolder_ViewBinding) obj).read);
            }
            return super.equals(this);
        }

        public final byte[] getEncoded() throws CRLException {
            try {
                return this.read.write(ASN1Encoding.DER);
            } catch (IOException e) {
                throw new CRLException(e.toString());
            }
        }

        public final BigInteger getSerialNumber() {
            return new BigInteger(HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) this.read.read.read(0)).read);
        }

        public final Date getRevocationDate() {
            return SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder.MediaBrowserCompat$ItemReceiver(this.read.read.read(1)).IconCompatParcelizer();
        }

        public final boolean hasExtensions() {
            return this.read.read() != null;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            String read2 = MoneyActionAdapter$CustomViewHolder.read();
            stringBuffer.append("      userCertificate: ");
            stringBuffer.append(getSerialNumber());
            stringBuffer.append(read2);
            stringBuffer.append("       revocationDate: ");
            stringBuffer.append(getRevocationDate());
            stringBuffer.append(read2);
            stringBuffer.append("       certificateIssuer: ");
            stringBuffer.append(getCertificateIssuer());
            stringBuffer.append(read2);
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding read3 = this.read.read();
            if (read3 != null) {
                Enumeration elements = read3.read.elements();
                if (elements.hasMoreElements()) {
                    stringBuffer.append("   crlEntryExtensions:");
                    stringBuffer.append(read2);
                    while (elements.hasMoreElements()) {
                        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
                        SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) read3.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder);
                        if (selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView != null) {
                            CompanyItemViewHolder companyItemViewHolder = new CompanyItemViewHolder(selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView.write());
                            stringBuffer.append("                       critical(");
                            stringBuffer.append(selectableChoiceAdapter$ChoiceHolder_ViewBinding.Keep);
                            stringBuffer.append(") ");
                            try {
                                if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.PlaybackStateCompat)) {
                                    stringBuffer.append(FundSwitchSearchListAdapter$FundHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(HmlAboutAdapter$HmlAboutViewHolder.IconCompatParcelizer((Object) companyItemViewHolder.MediaBrowserCompat$ItemReceiver())));
                                    stringBuffer.append(read2);
                                } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.write)) {
                                    stringBuffer.append("Certificate issuer: ");
                                    C10402xc503e64f MediaBrowserCompat$ItemReceiver2 = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
                                    stringBuffer.append(MediaBrowserCompat$ItemReceiver2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2)) : null);
                                    stringBuffer.append(read2);
                                } else {
                                    stringBuffer.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                                    stringBuffer.append(" value = ");
                                    stringBuffer.append(DividendSummaryAdapter$ChildViewHolder.read(companyItemViewHolder.MediaBrowserCompat$ItemReceiver()));
                                    stringBuffer.append(read2);
                                }
                            } catch (Exception unused) {
                                stringBuffer.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                                stringBuffer.append(" value = ");
                                stringBuffer.append("*****");
                                stringBuffer.append(read2);
                            }
                        } else {
                            stringBuffer.append(read2);
                        }
                    }
                }
            }
            return stringBuffer.toString();
        }
    }

    /* renamed from: o.TileAdapter$DemoHolder */
    final class DemoHolder extends X509CRL {
        private boolean IconCompatParcelizer;
        private FundSourceListAdapter$FundSourceHolder MediaBrowserCompat$CustomActionResultReceiver;
        private boolean MediaBrowserCompat$ItemReceiver = false;
        private String MediaMetadataCompat;
        private byte[] RatingCompat;
        private NtbScbCustomerHolder read;
        private int write;

        private static boolean write(X509CRL x509crl) throws CRLException {
            try {
                byte[] extensionValue = x509crl.getExtensionValue(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.ParcelableVolumeInfo.write);
                if (extensionValue != null) {
                    byte[] write2 = C10905onItemClick.MediaBrowserCompat$ItemReceiver(extensionValue).write();
                    if ((write2 != null ? new LandingAccountsAdapter$AccountViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write2)) : null).MediaBrowserCompat$ItemReceiver) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                throw new GroupHolder("Exception reading IssuingDistributionPoint", e);
            }
        }

        protected DemoHolder(NtbScbCustomerHolder ntbScbCustomerHolder, FundSourceListAdapter$FundSourceHolder fundSourceListAdapter$FundSourceHolder) throws CRLException {
            this.read = ntbScbCustomerHolder;
            this.MediaBrowserCompat$CustomActionResultReceiver = fundSourceListAdapter$FundSourceHolder;
            try {
                this.MediaMetadataCompat = LearnMoreHolder_ViewBinding.write(fundSourceListAdapter$FundSourceHolder.write);
                if (fundSourceListAdapter$FundSourceHolder.write.write != null) {
                    this.RatingCompat = fundSourceListAdapter$FundSourceHolder.write.write.MediaBrowserCompat$MediaItem().write(ASN1Encoding.DER);
                } else {
                    this.RatingCompat = null;
                }
                this.IconCompatParcelizer = write(this);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("CRL contents invalid: ");
                sb.append(e);
                throw new CRLException(sb.toString());
            }
        }

        public final boolean hasUnsupportedCriticalExtension() {
            Set criticalExtensionOIDs = getCriticalExtensionOIDs();
            if (criticalExtensionOIDs == null) {
                return false;
            }
            criticalExtensionOIDs.remove(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.ParcelableVolumeInfo.write);
            criticalExtensionOIDs.remove(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$MediaItem.write);
            return !criticalExtensionOIDs.isEmpty();
        }

        private Set MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding;
            if (getVersion() != 2 || (creditCardDetailsAdapter$ItemViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver.read.IconCompatParcelizer) == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            Enumeration elements = creditCardDetailsAdapter$ItemViewHolder_ViewBinding.read.elements();
            while (elements.hasMoreElements()) {
                HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
                if (z == ((SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder)).Keep) {
                    hashSet.add(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                }
            }
            return hashSet;
        }

        public final Set getCriticalExtensionOIDs() {
            return MediaBrowserCompat$CustomActionResultReceiver(true);
        }

        public final Set getNonCriticalExtensionOIDs() {
            return MediaBrowserCompat$CustomActionResultReceiver(false);
        }

        public final byte[] getExtensionValue(String str) {
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver.read.IconCompatParcelizer;
            if (creditCardDetailsAdapter$ItemViewHolder_ViewBinding == null) {
                return null;
            }
            SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(new HmlBusinessInfoAdapter$BankAccountViewHolder(str));
            if (selectableChoiceAdapter$ChoiceHolder_ViewBinding == null) {
                return null;
            }
            try {
                return selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView.ParcelableVolumeInfo();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("error parsing ");
                sb.append(e.toString());
                throw new IllegalStateException(sb.toString());
            }
        }

        public final byte[] getEncoded() throws CRLException {
            try {
                return this.MediaBrowserCompat$CustomActionResultReceiver.write(ASN1Encoding.DER);
            } catch (IOException e) {
                throw new CRLException(e.toString());
            }
        }

        public final void verify(PublicKey publicKey) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
            Signature signature;
            try {
                signature = this.read.MediaBrowserCompat$ItemReceiver(getSigAlgName());
            } catch (Exception unused) {
                signature = Signature.getInstance(getSigAlgName());
            }
            write(publicKey, signature);
        }

        public final void verify(PublicKey publicKey, String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
            Signature signature;
            if (str != null) {
                signature = Signature.getInstance(getSigAlgName(), str);
            } else {
                signature = Signature.getInstance(getSigAlgName());
            }
            write(publicKey, signature);
        }

        public final void verify(PublicKey publicKey, Provider provider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
            Signature signature;
            if (provider != null) {
                signature = Signature.getInstance(getSigAlgName(), provider);
            } else {
                signature = Signature.getInstance(getSigAlgName());
            }
            write(publicKey, signature);
        }

        private void write(PublicKey publicKey, Signature signature) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.write.equals(this.MediaBrowserCompat$CustomActionResultReceiver.read.write)) {
                signature.initVerify(publicKey);
                signature.update(getTBSCertList());
                if (!signature.verify(getSignature())) {
                    throw new SignatureException("CRL does not verify with supplied public key.");
                }
                return;
            }
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }

        public final int getVersion() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write();
        }

        public final Principal getIssuerDN() {
            return new ShortcutHolder_ViewBinding(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem()));
        }

        public final X500Principal getIssuerX500Principal() {
            try {
                return new X500Principal(this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo());
            } catch (IOException unused) {
                throw new IllegalStateException("can't encode issuer DN");
            }
        }

        public final Date getThisUpdate() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$MediaItem.IconCompatParcelizer();
        }

        public final Date getNextUpdate() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver != null) {
                return this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            }
            return null;
        }

        public final X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
            Enumeration MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
            DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding = null;
            while (MediaBrowserCompat$ItemReceiver2.hasMoreElements()) {
                SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer iconCompatParcelizer = (SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer) MediaBrowserCompat$ItemReceiver2.nextElement();
                if (bigInteger.equals(new BigInteger(HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) iconCompatParcelizer.read.read(0)).read))) {
                    return new DemoHolder_ViewBinding(iconCompatParcelizer, this.IconCompatParcelizer, dividendSummaryAdapter$ParentViewHolder_ViewBinding);
                }
                if (this.IconCompatParcelizer) {
                    if (iconCompatParcelizer.read.MediaBrowserCompat$ItemReceiver() == 3) {
                        SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) iconCompatParcelizer.read().MediaBrowserCompat$ItemReceiver.get(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.write);
                        if (selectableChoiceAdapter$ChoiceHolder_ViewBinding != null) {
                            C10402xc503e64f IconCompatParcelizer2 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.IconCompatParcelizer(selectableChoiceAdapter$ChoiceHolder_ViewBinding);
                            CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = (IconCompatParcelizer2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) : null).MediaBrowserCompat$CustomActionResultReceiver;
                            CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[creditCardDetailsAdapter$ItemViewHolderArr.length];
                            System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
                            dividendSummaryAdapter$ParentViewHolder_ViewBinding = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(creditCardDetailsAdapter$ItemViewHolderArr2[0].MediaBrowserCompat$CustomActionResultReceiver);
                        }
                    }
                }
            }
            return null;
        }

        public final byte[] getTBSCertList() throws CRLException {
            try {
                return this.MediaBrowserCompat$CustomActionResultReceiver.read.write(ASN1Encoding.DER);
            } catch (IOException e) {
                throw new CRLException(e.toString());
            }
        }

        public final byte[] getSignature() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        }

        public final String getSigAlgName() {
            return this.MediaMetadataCompat;
        }

        public final String getSigAlgOID() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$CustomActionResultReceiver.write;
        }

        public final byte[] getSigAlgParams() {
            byte[] bArr = this.RatingCompat;
            if (bArr == null) {
                return null;
            }
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            String read2 = MoneyActionAdapter$CustomViewHolder.read();
            stringBuffer.append("              Version: ");
            stringBuffer.append(getVersion());
            stringBuffer.append(read2);
            stringBuffer.append("             IssuerDN: ");
            stringBuffer.append(getIssuerDN());
            stringBuffer.append(read2);
            stringBuffer.append("          This update: ");
            stringBuffer.append(getThisUpdate());
            stringBuffer.append(read2);
            stringBuffer.append("          Next update: ");
            stringBuffer.append(getNextUpdate());
            stringBuffer.append(read2);
            stringBuffer.append("  Signature Algorithm: ");
            stringBuffer.append(getSigAlgName());
            stringBuffer.append(read2);
            byte[] signature = getSignature();
            stringBuffer.append("            Signature: ");
            stringBuffer.append(new String(onSelectType.MediaBrowserCompat$ItemReceiver(signature, 0, 20)));
            stringBuffer.append(read2);
            for (int i = 20; i < signature.length; i += 20) {
                if (i < signature.length - 20) {
                    stringBuffer.append("                       ");
                    stringBuffer.append(new String(onSelectType.MediaBrowserCompat$ItemReceiver(signature, i, 20)));
                    stringBuffer.append(read2);
                } else {
                    stringBuffer.append("                       ");
                    stringBuffer.append(new String(onSelectType.MediaBrowserCompat$ItemReceiver(signature, i, signature.length - i)));
                    stringBuffer.append(read2);
                }
            }
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver.read.IconCompatParcelizer;
            if (creditCardDetailsAdapter$ItemViewHolder_ViewBinding != null) {
                Enumeration elements = creditCardDetailsAdapter$ItemViewHolder_ViewBinding.read.elements();
                if (elements.hasMoreElements()) {
                    stringBuffer.append("           Extensions: ");
                    stringBuffer.append(read2);
                }
                while (elements.hasMoreElements()) {
                    HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
                    SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder);
                    if (selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView != null) {
                        CompanyItemViewHolder companyItemViewHolder = new CompanyItemViewHolder(selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView.write());
                        stringBuffer.append("                       critical(");
                        stringBuffer.append(selectableChoiceAdapter$ChoiceHolder_ViewBinding.Keep);
                        stringBuffer.append(") ");
                        try {
                            if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver)) {
                                stringBuffer.append(new LtfSummaryAdapter$SsfChildViewHolder_ViewBinding(new BigInteger(1, HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) companyItemViewHolder.MediaBrowserCompat$ItemReceiver()).read)));
                                stringBuffer.append(read2);
                            } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$MediaItem)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Base CRL: ");
                                sb.append(new LtfSummaryAdapter$SsfChildViewHolder_ViewBinding(new BigInteger(1, HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) companyItemViewHolder.MediaBrowserCompat$ItemReceiver()).read)));
                                stringBuffer.append(sb.toString());
                                stringBuffer.append(read2);
                            } else {
                                Object obj = null;
                                if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.ParcelableVolumeInfo)) {
                                    C10402xc503e64f MediaBrowserCompat$ItemReceiver2 = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
                                    if (MediaBrowserCompat$ItemReceiver2 != null) {
                                        obj = new LandingAccountsAdapter$AccountViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2));
                                    }
                                    stringBuffer.append(obj);
                                    stringBuffer.append(read2);
                                } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.IconCompatParcelizer)) {
                                    C10402xc503e64f MediaBrowserCompat$ItemReceiver3 = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
                                    if (MediaBrowserCompat$ItemReceiver3 != null) {
                                        obj = new FundSwitchSearchListAdapter$FundHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver3));
                                    }
                                    stringBuffer.append(obj);
                                    stringBuffer.append(read2);
                                } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaDescriptionCompat)) {
                                    C10402xc503e64f MediaBrowserCompat$ItemReceiver4 = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
                                    if (MediaBrowserCompat$ItemReceiver4 != null) {
                                        obj = new FundSwitchSearchListAdapter$FundHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver4));
                                    }
                                    stringBuffer.append(obj);
                                    stringBuffer.append(read2);
                                } else {
                                    stringBuffer.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                                    stringBuffer.append(" value = ");
                                    stringBuffer.append(DividendSummaryAdapter$ChildViewHolder.read(companyItemViewHolder.MediaBrowserCompat$ItemReceiver()));
                                    stringBuffer.append(read2);
                                }
                            }
                        } catch (Exception unused) {
                            stringBuffer.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                            stringBuffer.append(" value = ");
                            stringBuffer.append("*****");
                            stringBuffer.append(read2);
                        }
                    } else {
                        stringBuffer.append(read2);
                    }
                }
            }
            Set<? extends X509CRLEntry> revokedCertificates = getRevokedCertificates();
            if (revokedCertificates != null) {
                for (Object append : revokedCertificates) {
                    stringBuffer.append(append);
                    stringBuffer.append(read2);
                }
            }
            return stringBuffer.toString();
        }

        public final boolean isRevoked(Certificate certificate) {
            SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer iconCompatParcelizer;
            DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding;
            if (certificate.getType().equals("X.509")) {
                Enumeration MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
                DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding2 = this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver;
                if (MediaBrowserCompat$ItemReceiver2.hasMoreElements()) {
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    BigInteger serialNumber = x509Certificate.getSerialNumber();
                    while (MediaBrowserCompat$ItemReceiver2.hasMoreElements()) {
                        Object nextElement = MediaBrowserCompat$ItemReceiver2.nextElement();
                        FundAccountPagerAdapter$ItemViewHolder fundAccountPagerAdapter$ItemViewHolder = null;
                        if (nextElement instanceof SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer) {
                            iconCompatParcelizer = (SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer) nextElement;
                        } else {
                            iconCompatParcelizer = nextElement != null ? new SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(nextElement)) : null;
                        }
                        if (this.IconCompatParcelizer) {
                            if (iconCompatParcelizer.read.MediaBrowserCompat$ItemReceiver() == 3) {
                                SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) iconCompatParcelizer.read().MediaBrowserCompat$ItemReceiver.get(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.write);
                                if (selectableChoiceAdapter$ChoiceHolder_ViewBinding != null) {
                                    C10402xc503e64f IconCompatParcelizer2 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.IconCompatParcelizer(selectableChoiceAdapter$ChoiceHolder_ViewBinding);
                                    CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = (IconCompatParcelizer2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) : null).MediaBrowserCompat$CustomActionResultReceiver;
                                    CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[creditCardDetailsAdapter$ItemViewHolderArr.length];
                                    System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
                                    dividendSummaryAdapter$ParentViewHolder_ViewBinding2 = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(creditCardDetailsAdapter$ItemViewHolderArr2[0].MediaBrowserCompat$CustomActionResultReceiver);
                                }
                            }
                        }
                        if (new BigInteger(HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) iconCompatParcelizer.read.read(0)).read).equals(serialNumber)) {
                            if (certificate instanceof X509Certificate) {
                                dividendSummaryAdapter$ParentViewHolder_ViewBinding = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(x509Certificate.getIssuerX500Principal().getEncoded());
                            } else {
                                try {
                                    byte[] encoded = certificate.getEncoded();
                                    if (encoded != null) {
                                        fundAccountPagerAdapter$ItemViewHolder = new FundAccountPagerAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(encoded));
                                    }
                                    dividendSummaryAdapter$ParentViewHolder_ViewBinding = fundAccountPagerAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                                } catch (CertificateEncodingException e) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Cannot process certificate: ");
                                    sb.append(e.getMessage());
                                    throw new IllegalArgumentException(sb.toString());
                                }
                            }
                            if (!dividendSummaryAdapter$ParentViewHolder_ViewBinding2.equals(dividendSummaryAdapter$ParentViewHolder_ViewBinding)) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof X509CRL)) {
                return false;
            }
            if (!(obj instanceof DemoHolder)) {
                return super.equals(obj);
            }
            DemoHolder demoHolder = (DemoHolder) obj;
            if (!this.MediaBrowserCompat$ItemReceiver || !demoHolder.MediaBrowserCompat$ItemReceiver || demoHolder.write == this.write) {
                return this.MediaBrowserCompat$CustomActionResultReceiver.equals(demoHolder.MediaBrowserCompat$CustomActionResultReceiver);
            }
            return false;
        }

        public final int hashCode() {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = true;
                this.write = super.hashCode();
            }
            return this.write;
        }

        public final Set getRevokedCertificates() {
            HashSet hashSet = new HashSet();
            Enumeration MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
            DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding = null;
            while (MediaBrowserCompat$ItemReceiver2.hasMoreElements()) {
                SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer iconCompatParcelizer = (SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.IconCompatParcelizer) MediaBrowserCompat$ItemReceiver2.nextElement();
                hashSet.add(new DemoHolder_ViewBinding(iconCompatParcelizer, this.IconCompatParcelizer, dividendSummaryAdapter$ParentViewHolder_ViewBinding));
                if (this.IconCompatParcelizer) {
                    if (iconCompatParcelizer.read.MediaBrowserCompat$ItemReceiver() == 3) {
                        SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) iconCompatParcelizer.read().MediaBrowserCompat$ItemReceiver.get(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.write);
                        if (selectableChoiceAdapter$ChoiceHolder_ViewBinding != null) {
                            C10402xc503e64f IconCompatParcelizer2 = SelectableChoiceAdapter$ChoiceHolder_ViewBinding.IconCompatParcelizer(selectableChoiceAdapter$ChoiceHolder_ViewBinding);
                            CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr = (IconCompatParcelizer2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) : null).MediaBrowserCompat$CustomActionResultReceiver;
                            CreditCardDetailsAdapter$ItemViewHolder[] creditCardDetailsAdapter$ItemViewHolderArr2 = new CreditCardDetailsAdapter$ItemViewHolder[creditCardDetailsAdapter$ItemViewHolderArr.length];
                            System.arraycopy(creditCardDetailsAdapter$ItemViewHolderArr, 0, creditCardDetailsAdapter$ItemViewHolderArr2, 0, creditCardDetailsAdapter$ItemViewHolderArr.length);
                            dividendSummaryAdapter$ParentViewHolder_ViewBinding = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(creditCardDetailsAdapter$ItemViewHolderArr2[0].MediaBrowserCompat$CustomActionResultReceiver);
                        }
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                return Collections.unmodifiableSet(hashSet);
            }
            return null;
        }
    }

    /* renamed from: o.TileAdapter$PredictiveHolder */
    final class PredictiveHolder extends X509Certificate implements loadInBackground {
        private NtbScbCustomerHolder IconCompatParcelizer;
        private int MediaBrowserCompat$CustomActionResultReceiver;
        private FundAccountPagerAdapter$ItemViewHolder MediaBrowserCompat$ItemReceiver;
        private boolean[] MediaBrowserCompat$SearchResultReceiver;
        private CurrencyAdapter$CurrencyHolder_ViewBinding read;
        private boolean write;

        public PredictiveHolder(NtbScbCustomerHolder ntbScbCustomerHolder, FundAccountPagerAdapter$ItemViewHolder fundAccountPagerAdapter$ItemViewHolder) throws CertificateParsingException {
            new BannerViewHolder_ViewBinding();
            this.IconCompatParcelizer = ntbScbCustomerHolder;
            this.MediaBrowserCompat$ItemReceiver = fundAccountPagerAdapter$ItemViewHolder;
            try {
                byte[] write2 = write("2.5.29.19");
                if (write2 != null) {
                    C10402xc503e64f read2 = C10402xc503e64f.read(write2);
                    this.read = read2 != null ? new CurrencyAdapter$CurrencyHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read2)) : null;
                }
                try {
                    byte[] write3 = write("2.5.29.15");
                    if (write3 != null) {
                        InvestmentDetailsClientListAdapter$ExpandableChildViewHolder MediaBrowserCompat$ItemReceiver2 = InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver((Object) C10402xc503e64f.read(write3));
                        byte[] read3 = MediaBrowserCompat$ItemReceiver2.read();
                        int length = (read3.length << 3) - MediaBrowserCompat$ItemReceiver2.write();
                        this.MediaBrowserCompat$SearchResultReceiver = new boolean[(length >= 9 ? length : 9)];
                        for (int i = 0; i != length; i++) {
                            this.MediaBrowserCompat$SearchResultReceiver[i] = (read3[i / 8] & (128 >>> (i % 8))) != 0;
                        }
                        return;
                    }
                    this.MediaBrowserCompat$SearchResultReceiver = null;
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("cannot construct KeyUsage: ");
                    sb.append(e);
                    throw new CertificateParsingException(sb.toString());
                }
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cannot construct BasicConstraints: ");
                sb2.append(e2);
                throw new CertificateParsingException(sb2.toString());
            }
        }

        public final void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
            checkValidity(new Date());
        }

        public final void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
            String str;
            String str2;
            if (date.getTime() > getNotAfter().getTime()) {
                StringBuilder sb = new StringBuilder();
                sb.append("certificate expired on ");
                C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) {
                    str = ((HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read();
                } else {
                    str = ((HelpAdapter$MoreOptionsHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read();
                }
                sb.append(str);
                throw new CertificateExpiredException(sb.toString());
            } else if (date.getTime() < getNotBefore().getTime()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("certificate not valid till ");
                C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
                if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 instanceof HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) {
                    str2 = ((HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2).read();
                } else {
                    str2 = ((HelpAdapter$MoreOptionsHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2).read();
                }
                sb2.append(str2);
                throw new CertificateNotYetValidException(sb2.toString());
            }
        }

        public final int getVersion() {
            return new BigInteger(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.f5822x50fd9e4a.read).intValue() + 1;
        }

        public final BigInteger getSerialNumber() {
            return new BigInteger(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.read.read);
        }

        public final Principal getIssuerDN() {
            try {
                return new ShortcutHolder_ViewBinding(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.ParcelableVolumeInfo()));
            } catch (IOException unused) {
                return null;
            }
        }

        public final X500Principal getIssuerX500Principal() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new HmlDocumentListAdapter$DocumentViewHolder_ViewBinding(byteArrayOutputStream).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
                return new X500Principal(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
                throw new IllegalStateException("can't encode issuer DN");
            }
        }

        public final Principal getSubjectDN() {
            return new ShortcutHolder_ViewBinding(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$MediaItem()));
        }

        public final X500Principal getSubjectX500Principal() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new HmlDocumentListAdapter$DocumentViewHolder_ViewBinding(byteArrayOutputStream).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem);
                return new X500Principal(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
                throw new IllegalStateException("can't encode issuer DN");
            }
        }

        public final Date getNotBefore() {
            return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.IconCompatParcelizer();
        }

        public final Date getNotAfter() {
            return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        }

        public final byte[] getTBSCertificate() throws CertificateEncodingException {
            try {
                return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.write(ASN1Encoding.DER);
            } catch (IOException e) {
                throw new CertificateEncodingException(e.toString());
            }
        }

        public final byte[] getSignature() {
            return this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver();
        }

        public final String getSigAlgName() {
            return LearnMoreHolder_ViewBinding.write(this.MediaBrowserCompat$ItemReceiver.read);
        }

        public final String getSigAlgOID() {
            return this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.write;
        }

        public final byte[] getSigAlgParams() {
            if (this.MediaBrowserCompat$ItemReceiver.read.write == null) {
                return null;
            }
            try {
                return this.MediaBrowserCompat$ItemReceiver.read.write.MediaBrowserCompat$MediaItem().write(ASN1Encoding.DER);
            } catch (IOException unused) {
                return null;
            }
        }

        public final boolean[] getIssuerUniqueID() {
            InvestmentDetailsClientListAdapter$ExpandableChildViewHolder investmentDetailsClientListAdapter$ExpandableChildViewHolder = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (investmentDetailsClientListAdapter$ExpandableChildViewHolder == null) {
                return null;
            }
            byte[] read2 = investmentDetailsClientListAdapter$ExpandableChildViewHolder.read();
            int length = (read2.length << 3) - investmentDetailsClientListAdapter$ExpandableChildViewHolder.write();
            boolean[] zArr = new boolean[length];
            for (int i = 0; i != length; i++) {
                zArr[i] = (read2[i / 8] & (128 >>> (i % 8))) != 0;
            }
            return zArr;
        }

        public final boolean[] getSubjectUniqueID() {
            InvestmentDetailsClientListAdapter$ExpandableChildViewHolder investmentDetailsClientListAdapter$ExpandableChildViewHolder = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
            if (investmentDetailsClientListAdapter$ExpandableChildViewHolder == null) {
                return null;
            }
            byte[] read2 = investmentDetailsClientListAdapter$ExpandableChildViewHolder.read();
            int length = (read2.length << 3) - investmentDetailsClientListAdapter$ExpandableChildViewHolder.write();
            boolean[] zArr = new boolean[length];
            for (int i = 0; i != length; i++) {
                zArr[i] = (read2[i / 8] & (128 >>> (i % 8))) != 0;
            }
            return zArr;
        }

        public final boolean[] getKeyUsage() {
            return this.MediaBrowserCompat$SearchResultReceiver;
        }

        public final List getExtendedKeyUsage() throws CertificateParsingException {
            byte[] write2 = write("2.5.29.37");
            if (write2 == null) {
                return null;
            }
            try {
                HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder = (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) new CompanyItemViewHolder(write2).MediaBrowserCompat$ItemReceiver();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i != hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver(); i++) {
                    arrayList.add(((HmlBusinessInfoAdapter$BankAccountViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i)).write);
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception unused) {
                throw new CertificateParsingException("error processing extended key usage extension");
            }
        }

        public final int getBasicConstraints() {
            CurrencyAdapter$CurrencyHolder_ViewBinding currencyAdapter$CurrencyHolder_ViewBinding = this.read;
            if (currencyAdapter$CurrencyHolder_ViewBinding == null || !currencyAdapter$CurrencyHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver()) {
                return -1;
            }
            HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = this.read.MediaBrowserCompat$ItemReceiver;
            BigInteger bigInteger = null;
            if ((hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding != null ? new BigInteger(hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read) : null) == null) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding2 = this.read.MediaBrowserCompat$ItemReceiver;
            if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding2 != null) {
                bigInteger = new BigInteger(hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding2.read);
            }
            return bigInteger.intValue();
        }

        public final Collection getSubjectAlternativeNames() throws CertificateParsingException {
            return MediaBrowserCompat$ItemReceiver(write(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.setHasDecor.write));
        }

        public final Collection getIssuerAlternativeNames() throws CertificateParsingException {
            return MediaBrowserCompat$ItemReceiver(write(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.f5820x50fd9e4a.write));
        }

        public final Set getCriticalExtensionOIDs() {
            if (getVersion() != 3) {
                return null;
            }
            HashSet hashSet = new HashSet();
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.write;
            if (creditCardDetailsAdapter$ItemViewHolder_ViewBinding == null) {
                return null;
            }
            Enumeration elements = creditCardDetailsAdapter$ItemViewHolder_ViewBinding.read.elements();
            while (elements.hasMoreElements()) {
                HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
                if (((SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder)).Keep) {
                    hashSet.add(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                }
            }
            return hashSet;
        }

        private byte[] write(String str) {
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.write;
            if (creditCardDetailsAdapter$ItemViewHolder_ViewBinding == null) {
                return null;
            }
            SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(new HmlBusinessInfoAdapter$BankAccountViewHolder(str));
            if (selectableChoiceAdapter$ChoiceHolder_ViewBinding != null) {
                return selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView.write();
            }
            return null;
        }

        public final byte[] getExtensionValue(String str) {
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.write;
            if (creditCardDetailsAdapter$ItemViewHolder_ViewBinding == null) {
                return null;
            }
            SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(new HmlBusinessInfoAdapter$BankAccountViewHolder(str));
            if (selectableChoiceAdapter$ChoiceHolder_ViewBinding == null) {
                return null;
            }
            try {
                return selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView.ParcelableVolumeInfo();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("error parsing ");
                sb.append(e.toString());
                throw new IllegalStateException(sb.toString());
            }
        }

        public final Set getNonCriticalExtensionOIDs() {
            if (getVersion() != 3) {
                return null;
            }
            HashSet hashSet = new HashSet();
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.write;
            if (creditCardDetailsAdapter$ItemViewHolder_ViewBinding == null) {
                return null;
            }
            Enumeration elements = creditCardDetailsAdapter$ItemViewHolder_ViewBinding.read.elements();
            while (elements.hasMoreElements()) {
                HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
                if (!((SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder)).Keep) {
                    hashSet.add(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                }
            }
            return hashSet;
        }

        public final boolean hasUnsupportedCriticalExtension() {
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding;
            if (getVersion() != 3 || (creditCardDetailsAdapter$ItemViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.write) == null) {
                return false;
            }
            Enumeration elements = creditCardDetailsAdapter$ItemViewHolder_ViewBinding.read.elements();
            while (elements.hasMoreElements()) {
                HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
                if (!hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaSessionCompat$Token) && !hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$SearchResultReceiver) && !hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.PlaybackStateCompat$CustomAction) && !hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.RatingCompat) && !hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.IconCompatParcelizer) && !hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.ParcelableVolumeInfo) && !hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$MediaItem) && !hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper) && !hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$ItemReceiver) && !hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.setHasDecor) && !hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaSessionCompat$QueueItem) && ((SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder)).Keep) {
                    return true;
                }
            }
            return false;
        }

        public final PublicKey getPublicKey() {
            try {
                return StaticShortcutHolder.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat);
            } catch (IOException unused) {
                return null;
            }
        }

        public final byte[] getEncoded() throws CertificateEncodingException {
            try {
                return this.MediaBrowserCompat$ItemReceiver.write(ASN1Encoding.DER);
            } catch (IOException e) {
                throw new CertificateEncodingException(e.toString());
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PredictiveHolder)) {
                return super.equals(obj);
            }
            PredictiveHolder predictiveHolder = (PredictiveHolder) obj;
            if (!this.write || !predictiveHolder.write || this.MediaBrowserCompat$CustomActionResultReceiver == predictiveHolder.MediaBrowserCompat$CustomActionResultReceiver) {
                return this.MediaBrowserCompat$ItemReceiver.equals(predictiveHolder.MediaBrowserCompat$ItemReceiver);
            }
            return false;
        }

        public final int hashCode() {
            int i;
            synchronized (this) {
                if (!this.write) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = super.hashCode();
                    this.write = true;
                }
                i = this.MediaBrowserCompat$CustomActionResultReceiver;
            }
            return i;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            String read2 = MoneyActionAdapter$CustomViewHolder.read();
            stringBuffer.append("  [0]         Version: ");
            stringBuffer.append(getVersion());
            stringBuffer.append(read2);
            stringBuffer.append("         SerialNumber: ");
            stringBuffer.append(getSerialNumber());
            stringBuffer.append(read2);
            stringBuffer.append("             IssuerDN: ");
            stringBuffer.append(getIssuerDN());
            stringBuffer.append(read2);
            stringBuffer.append("           Start Date: ");
            stringBuffer.append(getNotBefore());
            stringBuffer.append(read2);
            stringBuffer.append("           Final Date: ");
            stringBuffer.append(getNotAfter());
            stringBuffer.append(read2);
            stringBuffer.append("            SubjectDN: ");
            stringBuffer.append(getSubjectDN());
            stringBuffer.append(read2);
            stringBuffer.append("           Public Key: ");
            stringBuffer.append(getPublicKey());
            stringBuffer.append(read2);
            stringBuffer.append("  Signature Algorithm: ");
            stringBuffer.append(getSigAlgName());
            stringBuffer.append(read2);
            byte[] signature = getSignature();
            stringBuffer.append("            Signature: ");
            stringBuffer.append(new String(onSelectType.MediaBrowserCompat$ItemReceiver(signature, 0, 20)));
            stringBuffer.append(read2);
            for (int i = 20; i < signature.length; i += 20) {
                if (i < signature.length - 20) {
                    stringBuffer.append("                       ");
                    stringBuffer.append(new String(onSelectType.MediaBrowserCompat$ItemReceiver(signature, i, 20)));
                    stringBuffer.append(read2);
                } else {
                    stringBuffer.append("                       ");
                    stringBuffer.append(new String(onSelectType.MediaBrowserCompat$ItemReceiver(signature, i, signature.length - i)));
                    stringBuffer.append(read2);
                }
            }
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.write;
            if (creditCardDetailsAdapter$ItemViewHolder_ViewBinding != null) {
                Enumeration elements = creditCardDetailsAdapter$ItemViewHolder_ViewBinding.read.elements();
                if (elements.hasMoreElements()) {
                    stringBuffer.append("       Extensions: \n");
                }
                while (elements.hasMoreElements()) {
                    HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
                    SelectableChoiceAdapter$ChoiceHolder_ViewBinding selectableChoiceAdapter$ChoiceHolder_ViewBinding = (SelectableChoiceAdapter$ChoiceHolder_ViewBinding) creditCardDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.get(hmlBusinessInfoAdapter$BankAccountViewHolder);
                    if (selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView != null) {
                        CompanyItemViewHolder companyItemViewHolder = new CompanyItemViewHolder(selectableChoiceAdapter$ChoiceHolder_ViewBinding.setContentView.write());
                        stringBuffer.append("                       critical(");
                        stringBuffer.append(selectableChoiceAdapter$ChoiceHolder_ViewBinding.Keep);
                        stringBuffer.append(") ");
                        try {
                            Object obj = null;
                            if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaBrowserCompat$ItemReceiver)) {
                                C10402xc503e64f MediaBrowserCompat$ItemReceiver2 = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
                                if (MediaBrowserCompat$ItemReceiver2 != null) {
                                    obj = new CurrencyAdapter$CurrencyHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2));
                                }
                                stringBuffer.append(obj);
                                stringBuffer.append(read2);
                            } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(SelectableChoiceAdapter$ChoiceHolder_ViewBinding.MediaSessionCompat$Token)) {
                                C10402xc503e64f MediaBrowserCompat$ItemReceiver3 = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
                                if (MediaBrowserCompat$ItemReceiver3 != null) {
                                    obj = new FundRedeemSearchListAdapter$FundHolder(InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$ItemReceiver3));
                                }
                                stringBuffer.append(obj);
                                stringBuffer.append(read2);
                            } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(DiscoverTopListItemRecyclerAdapter$ChildRemarkViewHolder.read)) {
                                stringBuffer.append(new DiscoverSearchResultAdapter$ItemViewHolder_ViewBinding((InvestmentDetailsClientListAdapter$ExpandableChildViewHolder) companyItemViewHolder.MediaBrowserCompat$ItemReceiver()));
                                stringBuffer.append(read2);
                            } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(DiscoverTopListItemRecyclerAdapter$ChildRemarkViewHolder.MediaBrowserCompat$SearchResultReceiver)) {
                                stringBuffer.append(new DiscoverTopListRecyclerAdapter$GroupItemViewHolder((InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder) companyItemViewHolder.MediaBrowserCompat$ItemReceiver()));
                                stringBuffer.append(read2);
                            } else if (hmlBusinessInfoAdapter$BankAccountViewHolder.equals(DiscoverTopListItemRecyclerAdapter$ChildRemarkViewHolder.MediaDescriptionCompat)) {
                                stringBuffer.append(new DiscoverTopListItemRecyclerAdapter$FundViewHolder_ViewBinding((InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder) companyItemViewHolder.MediaBrowserCompat$ItemReceiver()));
                                stringBuffer.append(read2);
                            } else {
                                stringBuffer.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                                stringBuffer.append(" value = ");
                                stringBuffer.append(DividendSummaryAdapter$ChildViewHolder.read(companyItemViewHolder.MediaBrowserCompat$ItemReceiver()));
                                stringBuffer.append(read2);
                            }
                        } catch (Exception unused) {
                            stringBuffer.append(hmlBusinessInfoAdapter$BankAccountViewHolder.write);
                            stringBuffer.append(" value = ");
                            stringBuffer.append("*****");
                            stringBuffer.append(read2);
                        }
                    } else {
                        stringBuffer.append(read2);
                    }
                }
            }
            return stringBuffer.toString();
        }

        public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
            Signature signature;
            String write2 = LearnMoreHolder_ViewBinding.write(this.MediaBrowserCompat$ItemReceiver.read);
            try {
                signature = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(write2);
            } catch (Exception unused) {
                signature = Signature.getInstance(write2);
            }
            read(publicKey, signature);
        }

        public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
            Signature signature;
            String write2 = LearnMoreHolder_ViewBinding.write(this.MediaBrowserCompat$ItemReceiver.read);
            if (str != null) {
                signature = Signature.getInstance(write2, str);
            } else {
                signature = Signature.getInstance(write2);
            }
            read(publicKey, signature);
        }

        public final void verify(PublicKey publicKey, Provider provider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
            Signature signature;
            String write2 = LearnMoreHolder_ViewBinding.write(this.MediaBrowserCompat$ItemReceiver.read);
            if (provider != null) {
                signature = Signature.getInstance(write2, provider);
            } else {
                signature = Signature.getInstance(write2);
            }
            read(publicKey, signature);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
            if (r0.write.equals(p040o.InvestmentDetailsClientListAdapter$NoFundViewHolder.write) == false) goto L_0x0016;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
            if (r1.write.equals(p040o.InvestmentDetailsClientListAdapter$NoFundViewHolder.write) == false) goto L_0x0016;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void read(java.security.PublicKey r6, java.security.Signature r7) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
            /*
                r5 = this;
                o.FundAccountPagerAdapter$ItemViewHolder r0 = r5.MediaBrowserCompat$ItemReceiver
                o.LtfSummaryAdapter$SsfChildViewHolder r0 = r0.read
                o.FundAccountPagerAdapter$ItemViewHolder r1 = r5.MediaBrowserCompat$ItemReceiver
                o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder_ViewBinding r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
                o.LtfSummaryAdapter$SsfChildViewHolder r1 = r1.MediaDescriptionCompat
                o.HmlBusinessInfoAdapter$BankAccountViewHolder r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
                o.HmlBusinessInfoAdapter$BankAccountViewHolder r3 = r1.MediaBrowserCompat$CustomActionResultReceiver
                boolean r2 = r2.equals(r3)
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L_0x0018
            L_0x0016:
                r3 = r4
                goto L_0x0046
            L_0x0018:
                o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r2 = r0.write
                if (r2 != 0) goto L_0x002b
                o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r0 = r1.write
                if (r0 == 0) goto L_0x0046
                o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r0 = r1.write
                o.InvestmentDetailsClientListAdapter$NoFundViewHolder r1 = p040o.InvestmentDetailsClientListAdapter$NoFundViewHolder.write
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0046
                goto L_0x0016
            L_0x002b:
                o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r2 = r1.write
                if (r2 != 0) goto L_0x003e
                o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r1 = r0.write
                if (r1 == 0) goto L_0x0046
                o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r0 = r0.write
                o.InvestmentDetailsClientListAdapter$NoFundViewHolder r1 = p040o.InvestmentDetailsClientListAdapter$NoFundViewHolder.write
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0046
                goto L_0x0016
            L_0x003e:
                o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r0 = r0.write
                o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r1 = r1.write
                boolean r3 = r0.equals(r1)
            L_0x0046:
                if (r3 == 0) goto L_0x006e
                o.FundAccountPagerAdapter$ItemViewHolder r0 = r5.MediaBrowserCompat$ItemReceiver
                o.LtfSummaryAdapter$SsfChildViewHolder r0 = r0.read
                o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r0 = r0.write
                p040o.TileAdapter.LearnMoreHolder_ViewBinding.IconCompatParcelizer(r7, r0)
                r7.initVerify(r6)
                byte[] r6 = r5.getTBSCertificate()
                r7.update(r6)
                byte[] r6 = r5.getSignature()
                boolean r6 = r7.verify(r6)
                if (r6 == 0) goto L_0x0066
                return
            L_0x0066:
                java.security.SignatureException r6 = new java.security.SignatureException
                java.lang.String r7 = "certificate does not verify with supplied key"
                r6.<init>(r7)
                throw r6
            L_0x006e:
                java.security.cert.CertificateException r6 = new java.security.cert.CertificateException
                java.lang.String r7 = "signature algorithm in TBS cert not same as outer cert"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.TileAdapter.PredictiveHolder.read(java.security.PublicKey, java.security.Signature):void");
        }

        private static Collection MediaBrowserCompat$ItemReceiver(byte[] bArr) throws CertificateParsingException {
            if (bArr == null) {
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                Enumeration write2 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(bArr).write();
                while (write2.hasMoreElements()) {
                    CreditCardDetailsAdapter$ItemViewHolder read2 = CreditCardDetailsAdapter$ItemViewHolder.read(write2.nextElement());
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Integer.valueOf(read2.IconCompatParcelizer));
                    switch (read2.IconCompatParcelizer) {
                        case 0:
                        case 3:
                        case 5:
                            arrayList2.add(read2.ParcelableVolumeInfo());
                            break;
                        case 1:
                        case 2:
                        case 6:
                            arrayList2.add(((HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding) read2.MediaBrowserCompat$CustomActionResultReceiver).MediaMetadataCompat());
                            break;
                        case 4:
                            arrayList2.add(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(LtfSummaryAdapter$ParentViewHolder_ViewBinding.write, read2.MediaBrowserCompat$CustomActionResultReceiver).toString());
                            break;
                        case 7:
                            try {
                                arrayList2.add(InetAddress.getByAddress(C10407x3ea8e030.MediaBrowserCompat$ItemReceiver(read2.MediaBrowserCompat$CustomActionResultReceiver).write()).getHostAddress());
                                break;
                            } catch (UnknownHostException unused) {
                                break;
                            }
                        case 8:
                            arrayList2.add(HmlBusinessInfoAdapter$BankAccountViewHolder.write((Object) read2.MediaBrowserCompat$CustomActionResultReceiver).write);
                            break;
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("Bad tag number: ");
                            sb.append(read2.IconCompatParcelizer);
                            throw new IOException(sb.toString());
                    }
                    arrayList.add(Collections.unmodifiableList(arrayList2));
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                return Collections.unmodifiableCollection(arrayList);
            } catch (Exception e) {
                throw new CertificateParsingException(e.getMessage());
            }
        }
    }

    public final int IconCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    /* renamed from: o.TileAdapter$AddShortcutHolder */
    public class AddShortcutHolder implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ FundSwitchLandingActivity IconCompatParcelizer;

        public AddShortcutHolder() {
        }

        public /* synthetic */ AddShortcutHolder(FundSwitchLandingActivity fundSwitchLandingActivity) {
            this.IconCompatParcelizer = fundSwitchLandingActivity;
        }

        public boolean write(Object obj) {
            return ((StreetViewPanoramaFragment) obj).MediaBrowserCompat$CustomActionResultReceiver.equals(this.IconCompatParcelizer.IconCompatParcelizer);
        }
    }

    /* renamed from: o.TileAdapter$PredictiveHolder_ViewBinding */
    public final class PredictiveHolder_ViewBinding extends StaticShortcutHolder_ViewBinding {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public PredictiveHolder_ViewBinding() {
            /*
                r2 = this;
                java.lang.String r0 = "SC"
                java.security.Provider r1 = java.security.Security.getProvider(r0)
                if (r1 == 0) goto L_0x000d
                java.security.Provider r0 = java.security.Security.getProvider(r0)
                goto L_0x0012
            L_0x000d:
                o.TileAdapter$StaticShortcutHolder r0 = new o.TileAdapter$StaticShortcutHolder
                r0.<init>()
            L_0x0012:
                r2.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.TileAdapter.PredictiveHolder_ViewBinding.<init>():void");
        }
    }
}
