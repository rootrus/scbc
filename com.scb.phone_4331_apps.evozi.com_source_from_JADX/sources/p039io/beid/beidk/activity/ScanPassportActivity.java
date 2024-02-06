package p039io.beid.beidk.activity;

import android.animation.ObjectAnimator;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.Camera;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.places.PlacesStatusCodes;
import com.google.android.material.snackbar.Snackbar;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jmrtd.BACKey;
import p039io.beid.beidk.BEIDConfigurationFactory;
import p039io.beid.beidk.C9627c;
import p039io.beid.beidk.PassportManager;
import p039io.beid.beidk.definitions.BeIDParams;
import p039io.beid.beidk.definitions.PassportErrorCode;
import p039io.beid.beidk.definitions.SCBHeader;
import p039io.beid.beidk.definitions.TransactionUploadFileType;
import p039io.beid.beidk.messages.transaction.PassportVerifyForm;
import p039io.beid.beidk.messages.transaction.PassportVerifyResult;
import p039io.beid.beidk.p058ui.camera.CameraSourcePreview;
import p039io.beid.beidk.p058ui.camera.GraphicOverlay;
import p039io.beid.beidk.parcelable.PassportDataParcelable;
import p039io.beid.beidk.services.TransactionService;
import p039io.beid.beidk.view.JHSquareMaskView;
import p040o.AppCompatRatingBar;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.BankingAgentDeepLinkActivity;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BaseHmlPersonalInfoActivity;
import p040o.ChequeAnnouncementActivity_ViewBinding;
import p040o.ChequeSuccessActivity;
import p040o.CloseAccountEligibilityActivity;
import p040o.CloseAccountEligibilityActivity$MediaBrowserCompat$ItemReceiver;
import p040o.CloseAccountEligibilityModule;
import p040o.CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver;
import p040o.CloseAccountSelectMainAccountActivity;
import p040o.CloseAccountSuccessActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment;
import p040o.HelpActivity;
import p040o.HmlETBLandingActivity;
import p040o.HmlLatestPersonalInformationDeepLinkActivity;
import p040o.ThirdPartySlipActivity;
import p040o.TileAdapter;
import p040o.onEmailUsClick;
import p040o.onEmailUsClick$MediaBrowserCompat$ItemReceiver;
import p040o.onSearchButtonClick;
import p040o.onSearchButtonClick$MediaBrowserCompat$ItemReceiver;

/* renamed from: io.beid.beidk.activity.ScanPassportActivity */
public class ScanPassportActivity extends AppCompatActivity implements ChequeSuccessActivity {
    private static ServiceConnection IconCompatParcelizer = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            CloseAccountSelectMainAccountActivity unused = ScanPassportActivity.read = CloseAccountSelectMainAccountActivity.read.write(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            CloseAccountSelectMainAccountActivity unused = ScanPassportActivity.read = null;
        }
    };
    private static BEIDConfigurationFactory MediaBrowserCompat$CustomActionResultReceiver = new BEIDConfigurationFactory("http://api.beid.io", "", "", Boolean.FALSE, 30, (InputStream) null, "");
    private static final String MediaBrowserCompat$ItemReceiver = ScanPassportActivity.class.getName();
    /* access modifiers changed from: private */
    public static CloseAccountSelectMainAccountActivity read = null;
    /* access modifiers changed from: private */
    public static final AtomicBoolean write = new AtomicBoolean(false);
    private onEmailUsClick ActionMenuItemView;
    /* access modifiers changed from: private */
    public View AlertController$RecycleListView;
    /* access modifiers changed from: private */
    public View AppCompatActivity;
    /* access modifiers changed from: private */
    public Handler AppCompatDelegateImpl$ListMenuDecorView;
    private int AppCompatDialogFragment;
    private Boolean AppCompatViewInflater = Boolean.FALSE;
    /* access modifiers changed from: private */
    public Integer Keep = 0;
    private String MediaBrowserCompat$MediaItem;
    private read MediaBrowserCompat$SearchResultReceiver = read.GET_BAC;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final Handler f5456x50fd9e4a;
    private ChequeSuccessActivity MediaDescriptionCompat;
    private String MediaMetadataCompat;
    /* access modifiers changed from: private */
    public String MediaSessionCompat$QueueItem;
    private final Runnable MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public LinearLayout MediaSessionCompat$Token;
    private String ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public ProgressBar PlaybackStateCompat;
    /* access modifiers changed from: private */
    public View PlaybackStateCompat$CustomAction;
    private String RatingCompat;
    /* access modifiers changed from: private */
    public Runnable setBackgroundResource;
    /* access modifiers changed from: private */
    public int setCheckable;
    private CameraSourcePreview setChecked;
    private final Object setContentView = new Object();
    /* access modifiers changed from: private */
    public RelativeLayout setExpandedFormat;
    /* access modifiers changed from: private */
    public ObjectAnimator setHasDecor;
    private String setIcon;
    private JHSquareMaskView setItemInvoker;
    private String setPadding;
    private String setPopupCallback;
    private GraphicOverlay<Object> setShortcut;

    /* renamed from: io.beid.beidk.activity.ScanPassportActivity$13 */
    static /* synthetic */ class C961313 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.beid.beidk.activity.ScanPassportActivity$read[] r0 = p039io.beid.beidk.activity.ScanPassportActivity.read.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                io.beid.beidk.activity.ScanPassportActivity$read r1 = p039io.beid.beidk.activity.ScanPassportActivity.read.GET_BAC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                io.beid.beidk.activity.ScanPassportActivity$read r1 = p039io.beid.beidk.activity.ScanPassportActivity.read.GET_CHIP_DATA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p039io.beid.beidk.activity.ScanPassportActivity.C961313.<clinit>():void");
        }
    }

    /* renamed from: io.beid.beidk.activity.ScanPassportActivity$read */
    enum read {
        GET_BAC,
        GET_CHIP_DATA
    }

    public ScanPassportActivity() {
        new ArrayList();
        this.f5456x50fd9e4a = new Handler(Looper.getMainLooper());
        this.MediaSessionCompat$ResultReceiverWrapper = new Runnable() {
            public final void run() {
                if (!ScanPassportActivity.write.get()) {
                    ScanPassportActivity.this.MediaBrowserCompat$ItemReceiver("error", PassportErrorCode.CANNOT_DETECT_CHIP, "Unable to detect chip");
                }
            }
        };
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        PassportDataParcelable passportDataParcelable = new PassportDataParcelable();
        passportDataParcelable.result = str;
        passportDataParcelable.errorCode = str2;
        passportDataParcelable.error = str3;
        Intent intent = new Intent();
        intent.putExtra(PassportManager.KEY_PASSPORT_DATA, passportDataParcelable);
        intent.putExtra(PassportManager.KEY_PASSPORT_EXIT_CODE, 2);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: private */
    public TransactionService MediaMetadataCompat() {
        String str;
        BEIDConfigurationFactory bEIDConfigurationFactory = MediaBrowserCompat$CustomActionResultReceiver;
        if (bEIDConfigurationFactory == null || (str = this.ParcelableVolumeInfo) == null) {
            BEIDConfigurationFactory bEIDConfigurationFactory2 = MediaBrowserCompat$CustomActionResultReceiver;
            if (bEIDConfigurationFactory2 != null) {
                return new TransactionService(bEIDConfigurationFactory2);
            }
            String str2 = this.ParcelableVolumeInfo;
            return str2 != null ? new TransactionService(str2) : new TransactionService("http://api.beid.io");
        }
        bEIDConfigurationFactory.setBaseUrl(str);
        return new TransactionService(bEIDConfigurationFactory);
    }

    /* access modifiers changed from: private */
    public void MediaSessionCompat$ResultReceiverWrapper() throws SecurityException {
        try {
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getApplicationContext());
            if (isGooglePlayServicesAvailable != 0) {
                GoogleApiAvailability.getInstance().getErrorDialog(this, isGooglePlayServicesAvailable, PlacesStatusCodes.USAGE_LIMIT_EXCEEDED).show();
            }
            if (this.ActionMenuItemView != null) {
                try {
                    this.setChecked.MediaBrowserCompat$CustomActionResultReceiver(this.ActionMenuItemView, this.setShortcut);
                } catch (IOException e) {
                    Log.e(MediaBrowserCompat$ItemReceiver, "Unable to start camera source.", e);
                    this.ActionMenuItemView.write();
                    this.ActionMenuItemView = null;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (OutOfMemoryError e3) {
            Intent intent = new Intent();
            intent.putExtra(PassportManager.KEY_PASSPORT_DATA, new PassportDataParcelable());
            intent.putExtra(PassportManager.KEY_PASSPORT_EXIT_CODE, 1);
            intent.putExtra(PassportManager.KEY_PASSPORT_EXCEPTION_MESSAGE, e3.getMessage());
            setResult(-1, intent);
            finish();
        }
    }

    private void ParcelableVolumeInfo() {
        int i = C961313.MediaBrowserCompat$CustomActionResultReceiver[this.MediaBrowserCompat$SearchResultReceiver.ordinal()];
        if (i == 1) {
            this.MediaSessionCompat$Token.setVisibility(4);
            this.setExpandedFormat.setVisibility(0);
        } else if (i == 2) {
            MediaSessionCompat$QueueItem();
            this.MediaSessionCompat$Token.setVisibility(0);
            this.setExpandedFormat.setVisibility(4);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 2) {
            RatingCompat();
            MediaSessionCompat$ResultReceiverWrapper();
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.MediaBrowserCompat$SearchResultReceiver = read.values()[bundle.getInt("activityState")];
        this.setPadding = bundle.getString("passportNumber");
        this.setPopupCallback = bundle.getString("dateOfBirth");
        this.setIcon = bundle.getString("dateOfExpiry");
        this.AppCompatViewInflater = Boolean.valueOf(bundle.getBoolean("foundBacState"));
        this.AppCompatDialogFragment = bundle.getInt("passportSnapshotOrientation");
        this.setCheckable = bundle.getInt("passportSnapshotStreamId");
        ParcelableVolumeInfo();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("activityState", this.MediaBrowserCompat$SearchResultReceiver.ordinal());
        bundle.putString("passportNumber", this.setPadding);
        bundle.putString("dateOfBirth", this.setPopupCallback);
        bundle.putString("dateOfExpiry", this.setIcon);
        bundle.putBoolean("foundBacState", this.AppCompatViewInflater.booleanValue());
        bundle.putString(SCBHeader.SCB_REQ_HEADER_API_AUTH, this.RatingCompat);
        bundle.putString(SCBHeader.SCB_REQ_HEADER_ACCEPT_LANGUAGE, this.MediaMetadataCompat);
        bundle.putString(SCBHeader.SCB_REQ_HEADER_SESSION_ID, this.MediaBrowserCompat$MediaItem);
        bundle.putString(BeIDParams.BEID_TRANSACTION_ID, this.MediaSessionCompat$QueueItem);
        bundle.putString(BeIDParams.BEID_BASE_URL, this.ParcelableVolumeInfo);
        bundle.putInt("passportSnapshotOrientation", this.AppCompatDialogFragment);
        bundle.putInt("passportSnapshotStreamId", this.setCheckable);
        ParcelableVolumeInfo();
    }

    public final void read(Exception exc, final PassportDataParcelable passportDataParcelable) throws IOException {
        String str;
        String str2;
        if (exc != null || passportDataParcelable != null) {
            if (exc != null) {
                if (exc instanceof C9627c) {
                    str2 = PassportErrorCode.INVALID_BAC;
                    str = "Invalid BAC";
                } else {
                    str2 = PassportErrorCode.READ_UNCOMPLETED;
                    str = "Read Uncompleted";
                }
                MediaBrowserCompat$ItemReceiver("error", str2, str);
            } else if (passportDataParcelable != null) {
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            ScanPassportActivity.MediaBrowserCompat$ItemReceiver(ScanPassportActivity.this, passportDataParcelable);
                        } catch (Exception e) {
                            ScanPassportActivity.this.MediaBrowserCompat$ItemReceiver("error", PassportErrorCode.READ_UNCOMPLETED, e.getMessage());
                        }
                    }
                }).start();
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(ScanPassportActivity scanPassportActivity, final PassportDataParcelable passportDataParcelable) throws IOException, RemoteException, CertificateException, BEIDConfigurationFactory.MissingParameterException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        final HashMap hashMap = new HashMap();
        hashMap.put(SCBHeader.SCB_REQ_HEADER_API_AUTH, scanPassportActivity.RatingCompat);
        hashMap.put(SCBHeader.SCB_REQ_HEADER_ACCEPT_LANGUAGE, scanPassportActivity.MediaMetadataCompat);
        hashMap.put(SCBHeader.SCB_REQ_HEADER_REQUEST_ID, UUID.randomUUID().toString());
        hashMap.put(SCBHeader.SCB_REQ_HEADER_SESSION_ID, scanPassportActivity.MediaBrowserCompat$MediaItem);
        final ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding = new ChequeAnnouncementActivity_ViewBinding();
        chequeAnnouncementActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = 900;
        chequeAnnouncementActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = scanPassportActivity.AppCompatDialogFragment;
        new Thread(new Runnable() {
            public final void run() {
                try {
                    Log.d(getClass().getName(), "reading snapshot data");
                    byte[] write = ScanPassportActivity.read.write(ScanPassportActivity.this.setCheckable, chequeAnnouncementActivity_ViewBinding);
                    Log.d(getClass().getName(), "uploading snapshot data");
                    if (ScanPassportActivity.this.MediaMetadataCompat().uploadDocumentSync(ScanPassportActivity.this.MediaSessionCompat$QueueItem, TransactionUploadFileType.EPASSPORT, new ByteArrayInputStream(write), "", hashMap)) {
                        ScanPassportActivity.this.runOnUiThread(new Runnable() {
                            public final void run() {
                                ScanPassportActivity.read(ScanPassportActivity.this, (Integer) 90);
                            }
                        });
                        Log.d(getClass().getName(), "upload success, going to next step");
                        ScanPassportActivity.MediaBrowserCompat$CustomActionResultReceiver(ScanPassportActivity.this, passportDataParcelable, hashMap);
                        return;
                    }
                    throw new Exception("Unable to upload evidence");
                } catch (Exception e) {
                    Intent intent = new Intent();
                    intent.putExtra(PassportManager.KEY_PASSPORT_DATA, passportDataParcelable);
                    intent.putExtra(PassportManager.KEY_PASSPORT_EXIT_CODE, 1);
                    intent.putExtra(PassportManager.KEY_PASSPORT_EXCEPTION_MESSAGE, e.getMessage());
                    ScanPassportActivity.this.setResult(-1, intent);
                    ScanPassportActivity.this.finish();
                }
            }
        }).start();
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ScanPassportActivity scanPassportActivity, final PassportDataParcelable passportDataParcelable, Map map) {
        final Intent intent = new Intent();
        PassportVerifyForm sod = new PassportVerifyForm().setTransactionId(scanPassportActivity.MediaSessionCompat$QueueItem).setDg1(passportDataParcelable.dg1).setDg2(passportDataParcelable.dg2).setDg13(passportDataParcelable.dg13).setSod(passportDataParcelable.sod);
        Log.d(scanPassportActivity.getClass().getName(), "Verifying data");
        BScanCNotificationDeepLinkActivity<PassportVerifyResult> verifyPassport = scanPassportActivity.MediaMetadataCompat().verifyPassport(sod, map);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        HelpActivity helpActivity = new HelpActivity(verifyPassport, MediaBrowserCompat$ItemReceiver2);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver3 = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver3, "scheduler is null");
        new BaseHmlPersonalInfoActivity(helpActivity, MediaBrowserCompat$ItemReceiver3).write(new DebitCardMarketConductDeepLinkActivity<PassportVerifyResult>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) throws Exception {
                PassportVerifyResult passportVerifyResult = (PassportVerifyResult) obj;
                passportDataParcelable.result = passportVerifyResult.result;
                passportDataParcelable.errorCode = passportVerifyResult.errorCode;
                passportDataParcelable.error = passportVerifyResult.error;
                intent.putExtra(PassportManager.KEY_PASSPORT_DATA, passportDataParcelable);
                intent.putExtra(PassportManager.KEY_PASSPORT_EXIT_CODE, 0);
                ScanPassportActivity.this.setResult(-1, intent);
                ScanPassportActivity.this.finish();
            }
        }, new DebitCardMarketConductDeepLinkActivity<Throwable>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) throws Exception {
                intent.putExtra(PassportManager.KEY_PASSPORT_DATA, passportDataParcelable);
                intent.putExtra(PassportManager.KEY_PASSPORT_EXIT_CODE, 1);
                intent.putExtra(PassportManager.KEY_PASSPORT_EXCEPTION_MESSAGE, ((Throwable) obj).getMessage());
                ScanPassportActivity.this.setResult(-1, intent);
                ScanPassportActivity.this.finish();
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0086 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void read(p039io.beid.beidk.activity.ScanPassportActivity r7, final java.io.InputStream r8) throws java.io.IOException {
        /*
            r0 = 1
            if (r8 == 0) goto L_0x007e
            android.view.WindowManager r1 = r7.getWindowManager()     // Catch:{ Exception -> 0x0086 }
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch:{ Exception -> 0x0086 }
            int r1 = r1.getRotation()     // Catch:{ Exception -> 0x0086 }
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x0086 }
            r2.<init>()     // Catch:{ Exception -> 0x0086 }
            android.view.WindowManager r3 = r7.getWindowManager()     // Catch:{ Exception -> 0x0086 }
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch:{ Exception -> 0x0086 }
            r3.getMetrics(r2)     // Catch:{ Exception -> 0x0086 }
            int r3 = r2.widthPixels     // Catch:{ Exception -> 0x0086 }
            int r2 = r2.heightPixels     // Catch:{ Exception -> 0x0086 }
            r4 = 8
            r5 = 3
            r6 = 2
            if (r1 == 0) goto L_0x002b
            if (r1 != r6) goto L_0x002d
        L_0x002b:
            if (r2 > r3) goto L_0x0045
        L_0x002d:
            if (r1 == r0) goto L_0x0031
            if (r1 != r5) goto L_0x0033
        L_0x0031:
            if (r3 > r2) goto L_0x0045
        L_0x0033:
            if (r1 == 0) goto L_0x005a
            if (r1 == r0) goto L_0x005c
            if (r1 == r6) goto L_0x005d
            if (r1 == r5) goto L_0x0057
            java.lang.String r1 = r7.getLocalClassName()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = "Unknown screen orientation. Defaulting to landscape."
            android.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x0086 }
            goto L_0x005a
        L_0x0045:
            if (r1 == 0) goto L_0x005c
            if (r1 == r0) goto L_0x005a
            if (r1 == r6) goto L_0x0057
            if (r1 == r5) goto L_0x005d
            java.lang.String r1 = r7.getLocalClassName()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = "Unknown screen orientation. Defaulting to portrait."
            android.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x0086 }
            goto L_0x005c
        L_0x0057:
            r4 = 9
            goto L_0x005d
        L_0x005a:
            r4 = 0
            goto L_0x005d
        L_0x005c:
            r4 = r0
        L_0x005d:
            if (r4 != 0) goto L_0x0062
        L_0x005f:
            int r1 = p040o.ChequeAnnouncementActivity_ViewBinding.write     // Catch:{ Exception -> 0x0086 }
            goto L_0x0066
        L_0x0062:
            if (r4 != r0) goto L_0x005f
            int r1 = p040o.ChequeAnnouncementActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0086 }
        L_0x0066:
            r7.AppCompatDialogFragment = r1     // Catch:{ Exception -> 0x0086 }
            java.lang.Thread r1 = new java.lang.Thread     // Catch:{ Exception -> 0x0086 }
            io.beid.beidk.activity.ScanPassportActivity$4 r2 = new io.beid.beidk.activity.ScanPassportActivity$4     // Catch:{ Exception -> 0x0086 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x0086 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0086 }
            r1.start()     // Catch:{ Exception -> 0x0086 }
            io.beid.beidk.activity.ScanPassportActivity$5 r8 = new io.beid.beidk.activity.ScanPassportActivity$5     // Catch:{ Exception -> 0x0086 }
            r8.<init>()     // Catch:{ Exception -> 0x0086 }
            r7.runOnUiThread(r8)     // Catch:{ Exception -> 0x0086 }
            return
        L_0x007e:
            java.lang.Exception r8 = new java.lang.Exception     // Catch:{ Exception -> 0x0086 }
            java.lang.String r1 = "Picture taken failure. This might caused by OutOfMemory."
            r8.<init>(r1)     // Catch:{ Exception -> 0x0086 }
            throw r8     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            r8 = move-exception
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            io.beid.beidk.parcelable.PassportDataParcelable r2 = new io.beid.beidk.parcelable.PassportDataParcelable
            r2.<init>()
            java.lang.String r3 = "passportData"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "scanPassportStatusCode"
            r1.putExtra(r2, r0)
            java.lang.String r8 = r8.getMessage()
            java.lang.String r0 = "scanPassportErrorMessage"
            r1.putExtra(r0, r8)
            r8 = -1
            r7.setResult(r8, r1)
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p039io.beid.beidk.activity.ScanPassportActivity.read(io.beid.beidk.activity.ScanPassportActivity, java.io.InputStream):void");
    }

    static /* synthetic */ void read(ScanPassportActivity scanPassportActivity, final Integer num) {
        synchronized (scanPassportActivity) {
            scanPassportActivity.runOnUiThread(new Runnable() {
                public final void run() {
                    ScanPassportActivity.this.PlaybackStateCompat$CustomAction.setVisibility(0);
                    ScanPassportActivity.this.AlertController$RecycleListView.setVisibility(8);
                    if (r5.intValue() > ScanPassportActivity.this.Keep.intValue()) {
                        ScanPassportActivity scanPassportActivity = ScanPassportActivity.this;
                        ObjectAnimator unused = scanPassportActivity.setHasDecor = ObjectAnimator.ofInt(scanPassportActivity.PlaybackStateCompat, "progress", new int[]{ScanPassportActivity.this.Keep.intValue(), r5.intValue()});
                        ScanPassportActivity.this.setHasDecor.setDuration(500);
                        ScanPassportActivity.this.setHasDecor.start();
                        Integer unused2 = ScanPassportActivity.this.Keep = r5;
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void RatingCompat() {
        Context applicationContext = getApplicationContext();
        ThirdPartySlipActivity thirdPartySlipActivity = new ThirdPartySlipActivity(this.setShortcut);
        thirdPartySlipActivity.IconCompatParcelizer = this.MediaDescriptionCompat;
        CloseAccountEligibilityActivity closeAccountEligibilityActivity = new CloseAccountEligibilityActivity$MediaBrowserCompat$ItemReceiver(applicationContext).read;
        closeAccountEligibilityActivity.IconCompatParcelizer = thirdPartySlipActivity;
        onEmailUsClick.write read2 = new onEmailUsClick.write(getApplicationContext(), closeAccountEligibilityActivity).MediaBrowserCompat$ItemReceiver(0).MediaBrowserCompat$ItemReceiver(1280, 1024).read(2.0f);
        String unused = read2.IconCompatParcelizer.RatingCompat = "continuous-picture";
        onEmailUsClick.IconCompatParcelizer unused2 = read2.IconCompatParcelizer.MediaSessionCompat$QueueItem = new onEmailUsClick.IconCompatParcelizer(read2.write);
        this.ActionMenuItemView = read2.IconCompatParcelizer;
    }

    static /* synthetic */ void write(ScanPassportActivity scanPassportActivity) {
        onEmailUsClick onemailusclick;
        onEmailUsClick onemailusclick2 = scanPassportActivity.ActionMenuItemView;
        if (onemailusclick2 != null) {
            onemailusclick2.read();
        }
        CameraSourcePreview cameraSourcePreview = scanPassportActivity.setChecked;
        if (cameraSourcePreview != null && (onemailusclick = cameraSourcePreview.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            onemailusclick.read();
        }
    }

    private void MediaSessionCompat$QueueItem() {
        onEmailUsClick onemailusclick;
        onEmailUsClick onemailusclick2 = this.ActionMenuItemView;
        if (onemailusclick2 != null) {
            onemailusclick2.read();
        }
        CameraSourcePreview cameraSourcePreview = this.setChecked;
        if (cameraSourcePreview != null && (onemailusclick = cameraSourcePreview.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            onemailusclick.read();
        }
    }

    public final void IconCompatParcelizer(CloseAccountEligibilityModule$MediaBrowserCompat$ItemReceiver closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver) {
        synchronized (this) {
            this.f5456x50fd9e4a.removeCallbacks(this.MediaSessionCompat$ResultReceiverWrapper);
            write.set(true);
        }
        if (closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem != null) {
            synchronized (this) {
                runOnUiThread(new Runnable() {
                    public final void run() {
                        ScanPassportActivity.this.PlaybackStateCompat$CustomAction.setVisibility(8);
                        ScanPassportActivity.this.AlertController$RecycleListView.setVisibility(0);
                    }
                });
            }
        } else if (closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.intValue() > 1) {
            final Integer valueOf = Integer.valueOf((int) Math.round((((double) closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.intValue()) / ((double) closeAccountEligibilityModule$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.intValue())) * 100.0d));
            synchronized (this) {
                runOnUiThread(new Runnable() {
                    public final void run() {
                        ScanPassportActivity.this.PlaybackStateCompat$CustomAction.setVisibility(0);
                        ScanPassportActivity.this.AlertController$RecycleListView.setVisibility(8);
                        if (valueOf.intValue() > ScanPassportActivity.this.Keep.intValue()) {
                            ScanPassportActivity scanPassportActivity = ScanPassportActivity.this;
                            ObjectAnimator unused = scanPassportActivity.setHasDecor = ObjectAnimator.ofInt(scanPassportActivity.PlaybackStateCompat, "progress", new int[]{ScanPassportActivity.this.Keep.intValue(), valueOf.intValue()});
                            ScanPassportActivity.this.setHasDecor.setDuration(500);
                            ScanPassportActivity.this.setHasDecor.start();
                            Integer unused2 = ScanPassportActivity.this.Keep = valueOf;
                        }
                    }
                });
            }
        }
    }

    public final void read(String str, String str2, String str3) {
        Log.d(MediaBrowserCompat$ItemReceiver, "Found BAC DATA! enable NFC!");
        synchronized (this.setContentView) {
            if (!this.AppCompatViewInflater.booleanValue()) {
                Log.d(MediaBrowserCompat$ItemReceiver, "Found BAC DATA! enable NFC!");
                this.AppCompatViewInflater = Boolean.TRUE;
                Log.d(MediaBrowserCompat$ItemReceiver, "assign variable values!");
                this.setPadding = str;
                this.setPopupCallback = str2;
                this.setIcon = str3;
                this.MediaBrowserCompat$SearchResultReceiver = read.GET_CHIP_DATA;
                onEmailUsClick onemailusclick = this.ActionMenuItemView;
                C96091 r6 = new onEmailUsClick$MediaBrowserCompat$ItemReceiver() {
                    public final void IconCompatParcelizer(InputStream inputStream) {
                        try {
                            ScanPassportActivity.read(ScanPassportActivity.this, inputStream);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
                synchronized (onemailusclick.IconCompatParcelizer) {
                    if (onemailusclick.MediaBrowserCompat$CustomActionResultReceiver != null) {
                        onEmailUsClick.RatingCompat ratingCompat = new onEmailUsClick.RatingCompat(onemailusclick);
                        onEmailUsClick.read read2 = new onEmailUsClick.read(onemailusclick, (byte) 0);
                        read2.MediaBrowserCompat$CustomActionResultReceiver = r6;
                        onemailusclick.MediaBrowserCompat$CustomActionResultReceiver.takePicture(ratingCompat, (Camera.PictureCallback) null, (Camera.PictureCallback) null, read2);
                    }
                }
                this.f5456x50fd9e4a.postDelayed(this.MediaSessionCompat$ResultReceiverWrapper, 30000);
            }
        }
    }

    public final void MediaDescriptionCompat() {
        synchronized (this) {
            this.f5456x50fd9e4a.removeCallbacks(this.MediaSessionCompat$ResultReceiverWrapper);
            write.set(true);
        }
    }

    public void onCreate(Bundle bundle) {
        Security.insertProviderAt(new TileAdapter.StaticShortcutHolder(), 1);
        if (bundle == null) {
            Intent intent = getIntent();
            this.RatingCompat = intent.getStringExtra(SCBHeader.SCB_REQ_HEADER_API_AUTH);
            this.MediaMetadataCompat = intent.getStringExtra(SCBHeader.SCB_REQ_HEADER_ACCEPT_LANGUAGE);
            this.MediaBrowserCompat$MediaItem = intent.getStringExtra(SCBHeader.SCB_REQ_HEADER_SESSION_ID);
            this.MediaSessionCompat$QueueItem = intent.getStringExtra(BeIDParams.BEID_TRANSACTION_ID);
            this.ParcelableVolumeInfo = intent.getStringExtra(BeIDParams.BEID_BASE_URL);
            MediaBrowserCompat$CustomActionResultReceiver = (BEIDConfigurationFactory) intent.getParcelableExtra("_config");
            write.set(false);
            CloseAccountEligibilityModule.MediaBrowserCompat$ItemReceiver = 0;
            CloseAccountEligibilityModule.MediaBrowserCompat$CustomActionResultReceiver = 0;
            if (!"en".equals(this.MediaMetadataCompat)) {
                this.MediaMetadataCompat = "th";
            }
        } else {
            this.RatingCompat = bundle.getString(SCBHeader.SCB_REQ_HEADER_API_AUTH);
            this.MediaMetadataCompat = bundle.getString(SCBHeader.SCB_REQ_HEADER_ACCEPT_LANGUAGE);
            this.MediaBrowserCompat$MediaItem = bundle.getString(SCBHeader.SCB_REQ_HEADER_SESSION_ID);
            this.MediaSessionCompat$QueueItem = bundle.getString(BeIDParams.BEID_TRANSACTION_ID);
            this.ParcelableVolumeInfo = bundle.getString(BeIDParams.BEID_BASE_URL);
            this.AppCompatViewInflater = Boolean.valueOf(bundle.getBoolean("foundBacState"));
        }
        MediaMetadataCompat();
        this.MediaDescriptionCompat = this;
        new Handler();
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = new Locale(this.MediaMetadataCompat);
        resources.updateConfiguration(configuration, displayMetrics);
        if (this.setBackgroundResource == null) {
            this.setBackgroundResource = new Runnable() {
                public final void run() {
                    long j;
                    Runnable runnable;
                    Handler handler;
                    if (ScanPassportActivity.this.AppCompatActivity.getVisibility() == 0) {
                        ScanPassportActivity.this.runOnUiThread(new Runnable() {
                            public final void run() {
                                ScanPassportActivity.this.AppCompatActivity.setVisibility(4);
                            }
                        });
                        handler = ScanPassportActivity.this.AppCompatDelegateImpl$ListMenuDecorView;
                        runnable = ScanPassportActivity.this.setBackgroundResource;
                        j = 500;
                    } else {
                        ScanPassportActivity.this.runOnUiThread(new Runnable() {
                            public final void run() {
                                ScanPassportActivity.this.AppCompatActivity.setVisibility(0);
                            }
                        });
                        handler = ScanPassportActivity.this.AppCompatDelegateImpl$ListMenuDecorView;
                        runnable = ScanPassportActivity.this.setBackgroundResource;
                        j = 1000;
                    }
                    handler.postDelayed(runnable, j);
                }
            };
            Handler handler = new Handler(Looper.getMainLooper());
            this.AppCompatDelegateImpl$ListMenuDecorView = handler;
            handler.postDelayed(this.setBackgroundResource, 1000);
        }
        if (!this.AppCompatViewInflater.booleanValue()) {
            setRequestedOrientation(0);
        }
        Intent intent2 = new Intent(this, CloseAccountSuccessActivity.class);
        intent2.setAction(CloseAccountSelectMainAccountActivity.class.getName());
        startService(intent2);
        bindService(intent2, IconCompatParcelizer, 1);
        super.onCreate(bundle);
        setContentView(onSearchButtonClick.read.activity_scan_passport);
        this.setChecked = (CameraSourcePreview) findViewById(onSearchButtonClick.IconCompatParcelizer.previewOCR);
        this.setExpandedFormat = (RelativeLayout) findViewById(onSearchButtonClick.IconCompatParcelizer.previewOCR_container);
        this.setShortcut = (GraphicOverlay) findViewById(onSearchButtonClick.IconCompatParcelizer.graphicOverlay);
        this.setItemInvoker = (JHSquareMaskView) findViewById(onSearchButtonClick.IconCompatParcelizer.squareOverlayView);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
        int i = displayMetrics2.widthPixels;
        int i2 = displayMetrics2.heightPixels;
        this.setItemInvoker.IconCompatParcelizer((float) (i / 2), (float) (i2 / 2));
        if (getResources().getConfiguration().orientation == 2) {
            float f = (float) i2;
            this.setItemInvoker.MediaBrowserCompat$ItemReceiver(1.5f * f, f);
        } else {
            float f2 = (float) i;
            this.setItemInvoker.MediaBrowserCompat$ItemReceiver(f2, 0.7f * f2);
        }
        findViewById(onSearchButtonClick.IconCompatParcelizer.tvNFCInfo);
        this.MediaSessionCompat$Token = (LinearLayout) findViewById(onSearchButtonClick.IconCompatParcelizer.epassport_container);
        this.PlaybackStateCompat = (ProgressBar) findViewById(onSearchButtonClick.IconCompatParcelizer.progressBar);
        this.PlaybackStateCompat$CustomAction = findViewById(onSearchButtonClick.IconCompatParcelizer.view_progress);
        this.AlertController$RecycleListView = findViewById(onSearchButtonClick.IconCompatParcelizer.view_suggest);
        this.AppCompatActivity = findViewById(onSearchButtonClick.IconCompatParcelizer.text_blink);
        int MediaBrowserCompat$ItemReceiver2 = AppCompatRatingBar.MediaBrowserCompat$ItemReceiver(this, "android.permission.CAMERA");
        if (this.AppCompatViewInflater.booleanValue()) {
            return;
        }
        if (MediaBrowserCompat$ItemReceiver2 == 0) {
            this.setChecked.post(new Runnable() {
                public final void run() {
                    ScanPassportActivity.this.RatingCompat();
                    ScanPassportActivity.this.MediaSessionCompat$ResultReceiverWrapper();
                }
            });
            return;
        }
        Log.w(MediaBrowserCompat$ItemReceiver, "Camera permission is not granted. Requesting permission");
        final String[] strArr = {"android.permission.CAMERA"};
        if (!AppCompatRatingBar.write(this, "android.permission.CAMERA")) {
            AppCompatRatingBar.write(this, strArr, 2);
            return;
        }
        Snackbar.MediaBrowserCompat$CustomActionResultReceiver(this.setShortcut, onSearchButtonClick$MediaBrowserCompat$ItemReceiver.permission_camera_rationale).IconCompatParcelizer(onSearchButtonClick$MediaBrowserCompat$ItemReceiver.f3171ok, new View.OnClickListener() {
            public final void onClick(View view) {
                AppCompatRatingBar.write(ScanPassportActivity.this, strArr, 2);
            }
        }).RatingCompat();
    }

    public void onDestroy() {
        super.onDestroy();
        onEmailUsClick onemailusclick = this.ActionMenuItemView;
        if (onemailusclick != null) {
            onemailusclick.write();
            this.ActionMenuItemView = null;
        }
        CameraSourcePreview cameraSourcePreview = this.setChecked;
        if (cameraSourcePreview != null) {
            onEmailUsClick onemailusclick2 = cameraSourcePreview.MediaBrowserCompat$CustomActionResultReceiver;
            if (onemailusclick2 != null) {
                onemailusclick2.write();
                cameraSourcePreview.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
            this.setChecked = null;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Runtime.getRuntime().gc();
        } else {
            System.gc();
        }
        try {
            unbindService(IconCompatParcelizer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onNewIntent(Intent intent) {
        String str = MediaBrowserCompat$ItemReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("On New Intent!!!");
        sb.append(intent.toString());
        Log.d(str, sb.toString());
        if (this.MediaBrowserCompat$SearchResultReceiver != read.GET_CHIP_DATA || !"android.nfc.action.TECH_DISCOVERED".equals(intent.getAction())) {
            Log.d(MediaBrowserCompat$ItemReceiver, FragmentBuilder_BindEasycashReferralSendDfwFragment.DEFAULT_IDENTIFIER);
            super.onNewIntent(intent);
            return;
        }
        Log.d(MediaBrowserCompat$ItemReceiver, "Process passport!");
        Tag tag = (Tag) intent.getExtras().getParcelable("android.nfc.extra.TAG");
        if (Arrays.asList(tag.getTechList()).contains("android.nfc.tech.IsoDep")) {
            Log.d(MediaBrowserCompat$ItemReceiver, "Yes!!! Reading!");
            getApplicationContext();
            new CloseAccountEligibilityModule(IsoDep.get(tag), new BACKey(this.setPadding, this.setPopupCallback, this.setIcon), this.MediaDescriptionCompat).execute(new Void[0]);
            return;
        }
        Log.d(MediaBrowserCompat$ItemReceiver, "Fail to read!");
        Snackbar.IconCompatParcelizer(this.setShortcut, "Cannot read passport data properly. Please try again.", 0).RatingCompat();
    }

    public void onPause() {
        Log.d(MediaBrowserCompat$ItemReceiver, "On Pause");
        super.onPause();
        MediaSessionCompat$QueueItem();
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
        if (defaultAdapter != null) {
            defaultAdapter.disableForegroundDispatch(this);
        }
    }

    public void onResume() {
        Log.d(MediaBrowserCompat$ItemReceiver, "On Resume");
        super.onResume();
        if (!this.AppCompatViewInflater.booleanValue()) {
            MediaSessionCompat$ResultReceiverWrapper();
        }
        try {
            Log.d(MediaBrowserCompat$ItemReceiver, "start NFC!");
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
            if (defaultAdapter != null) {
                Intent intent = new Intent(getApplicationContext(), getClass());
                intent.setFlags(PKIFailureInfo.duplicateCertReq);
                defaultAdapter.enableForegroundDispatch(this, PendingIntent.getActivity(this, 0, intent, 134217728), (IntentFilter[]) null, new String[][]{new String[]{"android.nfc.tech.IsoDep"}});
                return;
            }
            throw new ScanPassportActivity$MediaBrowserCompat$ItemReceiver();
        } catch (ScanPassportActivity$MediaBrowserCompat$ItemReceiver e) {
            e.printStackTrace();
        }
    }
}
