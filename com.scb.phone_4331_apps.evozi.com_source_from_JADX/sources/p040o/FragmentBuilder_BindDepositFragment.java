package p040o;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import com.scb.phone.view.activity.prelogin.FingerprintHelperInterface;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* renamed from: o.FragmentBuilder_BindDepositFragment */
public final class FragmentBuilder_BindDepositFragment implements RttiJsonCheck_MembersInjector {
    private final CancellationSignal IconCompatParcelizer = new CancellationSignal();
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    private FingerprintManager MediaBrowserCompat$ItemReceiver;
    private getSelectedDate read = new getSelectedDate(this.write, this.MediaBrowserCompat$ItemReceiver);
    private KeyguardManager write;

    @HmlPinActivity
    public FragmentBuilder_BindDepositFragment(Context context, KeyguardManager keyguardManager, FingerprintManager fingerprintManager) {
        onGetStartedClick.write((Object) context, "context");
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.write = keyguardManager;
        this.MediaBrowserCompat$ItemReceiver = fingerprintManager;
    }

    /* renamed from: o.FragmentBuilder_BindDepositFragment$read */
    public static final class read implements FingerprintHelperInterface.IconCompatParcelizer {
        private /* synthetic */ KtaJsonCheck_MembersInjector MediaBrowserCompat$CustomActionResultReceiver;

        read(KtaJsonCheck_MembersInjector ktaJsonCheck_MembersInjector) {
            this.MediaBrowserCompat$CustomActionResultReceiver = ktaJsonCheck_MembersInjector;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
        }

        public final void IconCompatParcelizer() {
            this.MediaBrowserCompat$CustomActionResultReceiver.read();
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
            if (str != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write();
            }
        }

        public final void IconCompatParcelizer(Throwable th) {
            onGetStartedClick.write((Object) th, "throwable");
            KtaJsonCheck_MembersInjector ktaJsonCheck_MembersInjector = this.MediaBrowserCompat$CustomActionResultReceiver;
            th.getMessage();
            ktaJsonCheck_MembersInjector.MediaBrowserCompat$ItemReceiver();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean write() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 23
            if (r0 < r2) goto L_0x0035
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 >= r2) goto L_0x0035
            android.content.Context r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = "fingerprint"
            java.lang.Object r0 = r0.getSystemService(r2)
            boolean r2 = r0 instanceof android.hardware.fingerprint.FingerprintManager
            if (r2 != 0) goto L_0x001a
            r0 = 0
        L_0x001a:
            android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
            if (r0 == 0) goto L_0x0055
            android.app.KeyguardManager r2 = r3.write
            if (r2 == 0) goto L_0x0055
            boolean r2 = r2.isKeyguardSecure()
            if (r2 != r1) goto L_0x0055
            boolean r2 = r0.isHardwareDetected()
            if (r2 == 0) goto L_0x0055
            boolean r0 = r0.hasEnrolledFingerprints()
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0035:
            o.getSelectedDate r0 = r3.read
            boolean r0 = r0.IconCompatParcelizer()
            if (r0 == 0) goto L_0x0055
            o.FragmentBuilder_BindDepositDetailTransactionFragment$read r0 = p040o.FragmentBuilder_BindDepositDetailTransactionFragment.read
            android.content.Context r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = "context"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            o.setDividerPadding r0 = p040o.setDividerPadding.MediaBrowserCompat$CustomActionResultReceiver(r0)
            java.lang.String r2 = "FingerprintManagerCompat.from(context)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r2)
            boolean r0 = r0.read()
            if (r0 != 0) goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindDepositFragment.write():boolean");
    }

    public final boolean read() {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT >= 28) {
            return this.read.IconCompatParcelizer();
        }
        KeyguardManager keyguardManager = this.write;
        if (keyguardManager != null && keyguardManager.isKeyguardSecure()) {
            Object systemService = this.MediaBrowserCompat$CustomActionResultReceiver.getSystemService("fingerprint");
            if (!(systemService instanceof FingerprintManager)) {
                systemService = null;
            }
            FingerprintManager fingerprintManager = (FingerprintManager) systemService;
            if (fingerprintManager == null || !fingerprintManager.isHardwareDetected()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void IconCompatParcelizer() {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2 = this.read.write;
        if ((cancellationSignal2 != null && !cancellationSignal2.isCanceled()) && (cancellationSignal = this.read.write) != null) {
            cancellationSignal.cancel();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.IconCompatParcelizer.cancel();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        getSelectedDate getselecteddate = this.read;
        try {
            if (getselecteddate.read == null) {
                getselecteddate.read = KeyStore.getInstance("AndroidKeyStore");
            }
            getselecteddate.read.load((KeyStore.LoadStoreParameter) null);
            getselecteddate.read.deleteEntry("default_key");
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0176, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0178, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018d, code lost:
        r2.IconCompatParcelizer(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0190, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0191, code lost:
        r2.IconCompatParcelizer(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0194, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0176 A[Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176, KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }, ExcHandler: Exception (r12v10 'e' java.lang.Exception A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:33:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0178 A[Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176, KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }, ExcHandler: FingerprintException (r12v9 'e' com.scb.phone.view.activity.prelogin.FingerprintHelperInterface$FingerprintException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:33:0x0115] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(p040o.KtaJsonCheck_MembersInjector r12) {
        /*
            r11 = this;
            java.lang.String r0 = "default_key"
            java.lang.String r1 = "biometricCallback"
            p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r1)
            o.FragmentBuilder_BindDepositDetailTransactionFragment$read r2 = p040o.FragmentBuilder_BindDepositDetailTransactionFragment.read
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r4 = 1
            r5 = 23
            if (r2 < r5) goto L_0x0013
            r2 = r4
            goto L_0x0014
        L_0x0013:
            r2 = r3
        L_0x0014:
            if (r2 != 0) goto L_0x001a
            r12.MediaBrowserCompat$ItemReceiver()
            return
        L_0x001a:
            o.FragmentBuilder_BindDepositDetailTransactionFragment$read r2 = p040o.FragmentBuilder_BindDepositDetailTransactionFragment.read
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r2 < r5) goto L_0x0024
            r2 = r4
            goto L_0x0025
        L_0x0024:
            r2 = r3
        L_0x0025:
            if (r2 == 0) goto L_0x00b0
            p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r1)
            o.FragmentBuilder_BindDepositDetailTransactionFragment$read r0 = p040o.FragmentBuilder_BindDepositDetailTransactionFragment.read
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto L_0x0031
            r3 = r4
        L_0x0031:
            if (r3 == 0) goto L_0x00af
            android.os.CancellationSignal r0 = new android.os.CancellationSignal
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = r11.MediaBrowserCompat$CustomActionResultReceiver
            r3 = 2131757569(0x7f100a01, float:1.9146077E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.String r2 = " \""
            r1.append(r2)
            android.content.Context r2 = r11.MediaBrowserCompat$CustomActionResultReceiver
            r3 = 2131755732(0x7f1002d4, float:1.9142352E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.String r2 = "\""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.hardware.biometrics.BiometricPrompt$Builder r2 = new android.hardware.biometrics.BiometricPrompt$Builder
            android.content.Context r3 = r11.MediaBrowserCompat$CustomActionResultReceiver
            r2.<init>(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            android.hardware.biometrics.BiometricPrompt$Builder r1 = r2.setTitle(r1)
            android.content.Context r2 = r11.MediaBrowserCompat$CustomActionResultReceiver
            r3 = 2131757568(0x7f100a00, float:1.9146075E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            android.hardware.biometrics.BiometricPrompt$Builder r1 = r1.setDescription(r2)
            android.content.Context r2 = r11.MediaBrowserCompat$CustomActionResultReceiver
            r3 = 2131756397(0x7f10056d, float:1.91437E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            android.content.Context r3 = r11.MediaBrowserCompat$CustomActionResultReceiver
            java.util.concurrent.Executor r3 = r3.getMainExecutor()
            o.FragmentBuilder_BindDepositFragment$MediaBrowserCompat$CustomActionResultReceiver r4 = new o.FragmentBuilder_BindDepositFragment$MediaBrowserCompat$CustomActionResultReceiver
            r4.<init>(r12)
            android.content.DialogInterface$OnClickListener r4 = (android.content.DialogInterface.OnClickListener) r4
            android.hardware.biometrics.BiometricPrompt$Builder r1 = r1.setNegativeButton(r2, r3, r4)
            android.hardware.biometrics.BiometricPrompt r1 = r1.build()
            android.content.Context r2 = r11.MediaBrowserCompat$CustomActionResultReceiver
            java.util.concurrent.Executor r2 = r2.getMainExecutor()
            o.FragmentBuilder_BindDeejungTransferConfirmationHeaderFragment r3 = new o.FragmentBuilder_BindDeejungTransferConfirmationHeaderFragment
            r3.<init>(r12)
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r3 = (android.hardware.biometrics.BiometricPrompt.AuthenticationCallback) r3
            r1.authenticate(r0, r2, r3)
        L_0x00af:
            return
        L_0x00b0:
            r12.MediaBrowserCompat$CustomActionResultReceiver()
            o.getSelectedDate r1 = r11.read
            boolean r1 = r1.IconCompatParcelizer()
            if (r1 == 0) goto L_0x0198
            o.getSelectedDate r1 = r11.read
            o.FragmentBuilder_BindDepositFragment$read r2 = new o.FragmentBuilder_BindDepositFragment$read
            r2.<init>(r12)
            com.scb.phone.view.activity.prelogin.FingerprintHelperInterface$IconCompatParcelizer r2 = (com.scb.phone.view.activity.prelogin.FingerprintHelperInterface.IconCompatParcelizer) r2
            android.hardware.fingerprint.FingerprintManager r12 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r12 == 0) goto L_0x0198
            r1.IconCompatParcelizer = r2
            java.security.KeyStore r12 = r1.read     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            java.lang.String r3 = "AndroidKeyStore"
            if (r12 != 0) goto L_0x00d6
            java.security.KeyStore r12 = java.security.KeyStore.getInstance(r3)     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            r1.read = r12     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
        L_0x00d6:
            java.lang.String r12 = "AES"
            javax.crypto.KeyGenerator r12 = javax.crypto.KeyGenerator.getInstance(r12, r3)     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            java.security.KeyStore r3 = r1.read     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            r5 = 0
            r3.load(r5)     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            r6 = 3
            r3.<init>(r0, r6)     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            java.lang.String r6 = "CBC"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setBlockModes(r6)     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setUserAuthenticationRequired(r4)     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            java.lang.String r6 = "PKCS7Padding"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setEncryptionPaddings(r6)     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            r7 = 24
            if (r6 < r7) goto L_0x0109
            r3.setInvalidatedByBiometricEnrollment(r4)     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
        L_0x0109:
            android.security.keystore.KeyGenParameterSpec r3 = r3.build()     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            r12.init(r3)     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            r12.generateKey()     // Catch:{ KeyStoreException -> 0x0184, NoSuchProviderException -> 0x0182, NoSuchAlgorithmException -> 0x0180, InvalidAlgorithmParameterException -> 0x017e, CertificateException -> 0x017c, IOException -> 0x017a }
            java.lang.String r12 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r12 = javax.crypto.Cipher.getInstance(r12)     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176 }
            r1.MediaBrowserCompat$ItemReceiver = r12     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176 }
            java.security.KeyStore r12 = r1.read     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176 }
            r12.load(r5)     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176 }
            java.security.KeyStore r12 = r1.read     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176 }
            java.security.KeyStore$Entry r12 = r12.getEntry(r0, r5)     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176 }
            java.security.KeyStore$SecretKeyEntry r12 = (java.security.KeyStore.SecretKeyEntry) r12     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176 }
            javax.crypto.SecretKey r12 = r12.getSecretKey()     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176 }
            javax.crypto.Cipher r0 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176 }
            r0.init(r4, r12)     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0174, KeyStoreException -> 0x0168, CertificateException -> 0x0166, UnrecoverableEntryException -> 0x0164, IOException -> 0x0162, NoSuchAlgorithmException -> 0x0160, InvalidKeyException -> 0x015e, NoSuchPaddingException -> 0x0155, FingerprintException -> 0x0178, Exception -> 0x0176 }
            android.os.CancellationSignal r12 = new android.os.CancellationSignal     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            r12.<init>()     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            r1.write = r12     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            android.hardware.fingerprint.FingerprintManager$CryptoObject r6 = new android.hardware.fingerprint.FingerprintManager$CryptoObject     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            javax.crypto.Cipher r12 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            r6.<init>(r12)     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            android.hardware.fingerprint.FingerprintManager r5 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            android.os.CancellationSignal r7 = r1.write     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            r8 = 0
            r10 = 0
            r9 = r1
            r5.authenticate(r6, r7, r8, r9, r10)     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            android.hardware.fingerprint.FingerprintManager r12 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            boolean r12 = r12.hasEnrolledFingerprints()     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            if (r12 != 0) goto L_0x0198
            r2.IconCompatParcelizer()     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            return
        L_0x0155:
            r12 = move-exception
            com.scb.phone.view.activity.prelogin.FingerprintHelperInterface$FingerprintException r0 = new com.scb.phone.view.activity.prelogin.FingerprintHelperInterface$FingerprintException     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            java.lang.String r1 = "Failed to get Cipher"
            r0.<init>(r1, r12)     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            throw r0     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
        L_0x015e:
            r12 = move-exception
            goto L_0x0169
        L_0x0160:
            r12 = move-exception
            goto L_0x0169
        L_0x0162:
            r12 = move-exception
            goto L_0x0169
        L_0x0164:
            r12 = move-exception
            goto L_0x0169
        L_0x0166:
            r12 = move-exception
            goto L_0x0169
        L_0x0168:
            r12 = move-exception
        L_0x0169:
            p040o.onCheckBoxClick.IconCompatParcelizer(r12)     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            com.scb.phone.view.activity.prelogin.FingerprintHelperInterface$FingerprintException r0 = new com.scb.phone.view.activity.prelogin.FingerprintHelperInterface$FingerprintException     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            java.lang.String r1 = "Failed to init Cipher"
            r0.<init>(r1, r12)     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            throw r0     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
        L_0x0174:
            r12 = move-exception
            throw r12     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
        L_0x0176:
            r12 = move-exception
            goto L_0x018d
        L_0x0178:
            r12 = move-exception
            goto L_0x0191
        L_0x017a:
            r12 = move-exception
            goto L_0x0185
        L_0x017c:
            r12 = move-exception
            goto L_0x0185
        L_0x017e:
            r12 = move-exception
            goto L_0x0185
        L_0x0180:
            r12 = move-exception
            goto L_0x0185
        L_0x0182:
            r12 = move-exception
            goto L_0x0185
        L_0x0184:
            r12 = move-exception
        L_0x0185:
            com.scb.phone.view.activity.prelogin.FingerprintHelperInterface$FingerprintException r0 = new com.scb.phone.view.activity.prelogin.FingerprintHelperInterface$FingerprintException     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            java.lang.String r1 = "Failed to generate Key"
            r0.<init>(r1, r12)     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
            throw r0     // Catch:{ KeyPermanentlyInvalidatedException -> 0x0195, FingerprintException -> 0x0178, Exception -> 0x0176 }
        L_0x018d:
            r2.IconCompatParcelizer(r12)
            return
        L_0x0191:
            r2.IconCompatParcelizer(r12)
            return
        L_0x0195:
            r2.IconCompatParcelizer()
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindDepositFragment.MediaBrowserCompat$ItemReceiver(o.KtaJsonCheck_MembersInjector):void");
    }
}
