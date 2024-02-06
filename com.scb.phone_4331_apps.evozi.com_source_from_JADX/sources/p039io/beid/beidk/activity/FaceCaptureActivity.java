package p039io.beid.beidk.activity;

import android.app.FragmentTransaction;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Random;
import p039io.beid.beidk.BEIDConfigurationFactory;
import p039io.beid.beidk.definitions.BeIDParams;
import p039io.beid.beidk.definitions.LivenessStatus;
import p039io.beid.beidk.definitions.TransactionUploadFileType;
import p039io.beid.beidk.messages.transaction.MatchingForm;
import p039io.beid.beidk.messages.transaction.MatchingResult;
import p039io.beid.beidk.p086c.C9628a;
import p039io.beid.beidk.p086c.C9632b;
import p039io.beid.beidk.processor.FaceProcessor;
import p039io.beid.beidk.services.TransactionService;
import p040o.ActivateChequeLandingActivity;
import p040o.AlertController$RecycleListView;
import p040o.AppCompatRatingBar;
import p040o.CcSofReviewTermsAndConditionsActivity;
import p040o.ChequeAnnouncementActivity_ViewBinding;
import p040o.ChequeReviewActivity;
import p040o.ChequeStatusActivity_ViewBinding;
import p040o.ChubbPaySuccessActivity;
import p040o.CloseAccountConfirmationOtpActivity;
import p040o.CloseAccountReviewActivity;
import p040o.CloseAccountSelectMainAccountActivity;
import p040o.CloseAccountSuccessActivity;
import p040o.ManageChequeActivity;
import p040o.ManageChequeActivity_ViewBinding;
import p040o.OrderChequeHelpActivity;
import p040o.OrderChequeLandingActivity;
import p040o.OrderChequeReviewActivity;
import p040o.QuickTopUpReviewActivity;
import p040o.StopChequeLandingActivity;
import p040o.StopChequeReviewActivity;
import p040o.TileAdapter;
import p040o.onEmailUsClick$MediaBrowserCompat$MediaItem;
import p040o.onSearchButtonClick;
import p040o.onSearchButtonClick$MediaBrowserCompat$ItemReceiver;
import p040o.setLastBaselineToBottomHeight;

/* renamed from: io.beid.beidk.activity.FaceCaptureActivity */
public class FaceCaptureActivity extends AppCompatActivity implements LocationListener, Handler.Callback, ManageChequeActivity, ChequeReviewActivity {
    public static String IconCompatParcelizer = FaceCaptureActivity.class.getSimpleName();
    public static IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer.ORIENTATION_0;
    private static BEIDConfigurationFactory MediaDescriptionCompat;
    private String ActionMenuItemView;
    /* access modifiers changed from: private */
    public CloseAccountSelectMainAccountActivity AlertController$RecycleListView;
    private ArrayList<Integer> AppCompatActivity = new ArrayList<>();
    private ServiceConnection AppCompatDelegateImpl$ListMenuDecorView = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            CloseAccountSelectMainAccountActivity unused = FaceCaptureActivity.this.AlertController$RecycleListView = CloseAccountSelectMainAccountActivity.read.write(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            CloseAccountSelectMainAccountActivity unused = FaceCaptureActivity.this.AlertController$RecycleListView = null;
        }
    };
    private int AppCompatDialogFragment = 1;
    private byte[] AppCompatViewInflater;
    private final String[] Keep = {"android.permission.CAMERA", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public C9628a MediaBrowserCompat$ItemReceiver;
    private Handler MediaBrowserCompat$MediaItem = new Handler(this);
    private Intent MediaBrowserCompat$SearchResultReceiver = new Intent();

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private Integer f5445x50fd9e4a;
    private int MediaMetadataCompat;
    private Bundle MediaSessionCompat$QueueItem;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token;
    private HashMap<String, String> ParcelableVolumeInfo;
    private Integer PlaybackStateCompat;
    private Rect PlaybackStateCompat$CustomAction;
    private int RatingCompat;
    public write read;
    private String setBackgroundResource = null;
    private int setCheckable = 90;
    private boolean setChecked;
    private String setContentView = "";
    private boolean setExpandedFormat;
    private LocationManager setHasDecor;
    private boolean setIcon;
    private byte[] setItemInvoker;
    private boolean setPopupCallback;
    private boolean setShortcut;
    public C9632b write;

    /* renamed from: io.beid.beidk.activity.FaceCaptureActivity$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        ORIENTATION_0,
        ORIENTATION_90,
        ORIENTATION_270
    }

    /* renamed from: io.beid.beidk.activity.FaceCaptureActivity$write */
    public enum write {
        CAPTURE,
        CONFIRM,
        ID,
        RESULT,
        UPDATE
    }

    /* access modifiers changed from: private */
    public void IconCompatParcelizer(int i) throws IOException {
        if (i == 0) {
            this.MediaBrowserCompat$SearchResultReceiver.putExtra("responseStatus", "error");
            this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorCode", LivenessStatus.ERROR_UNKNOW);
            this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorText", "Liveness failed");
            setResult(-1, this.MediaBrowserCompat$SearchResultReceiver);
            finish();
        } else if (this.AppCompatActivity.size() < this.f5445x50fd9e4a.intValue()) {
            this.MediaBrowserCompat$SearchResultReceiver.putExtra("responseStatus", "error");
            this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorCode", "1004");
            this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorText", "Liveness failed");
            setResult(-1, this.MediaBrowserCompat$SearchResultReceiver);
            finish();
        } else {
            LinkedList linkedList = new LinkedList(this.AppCompatActivity);
            this.MediaBrowserCompat$SearchResultReceiver.putExtra("livenessImageSize", this.AppCompatActivity.size());
            IconCompatParcelizer((Queue<Integer>) linkedList, (Runnable) new Runnable() {
                public final void run() {
                    try {
                        FaceCaptureActivity.read(FaceCaptureActivity.this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private TransactionService m5763x50fd9e4a() {
        String str;
        BEIDConfigurationFactory bEIDConfigurationFactory = MediaDescriptionCompat;
        if (bEIDConfigurationFactory == null || (str = this.ActionMenuItemView) == null) {
            BEIDConfigurationFactory bEIDConfigurationFactory2 = MediaDescriptionCompat;
            if (bEIDConfigurationFactory2 != null) {
                return new TransactionService(bEIDConfigurationFactory2);
            }
            String str2 = this.ActionMenuItemView;
            return str2 != null ? new TransactionService(str2) : new TransactionService("http://api.beid.io");
        }
        bEIDConfigurationFactory.setBaseUrl(str);
        return new TransactionService(bEIDConfigurationFactory);
    }

    public static void MediaDescriptionCompat() {
        CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private void RatingCompat() {
        for (String MediaBrowserCompat$ItemReceiver2 : this.Keep) {
            if (setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(this, MediaBrowserCompat$ItemReceiver2) != 0) {
                AppCompatRatingBar.write(this, this.Keep, 2);
                return;
            }
        }
        IconCompatParcelizer(this.MediaSessionCompat$QueueItem);
    }

    public final void IconCompatParcelizer(int i, Rect rect) {
        this.PlaybackStateCompat = Integer.valueOf(i);
        this.PlaybackStateCompat$CustomAction = rect;
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.MediaBrowserCompat$SearchResultReceiver.putExtra("responseStatus", "error");
        this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorCode", "1001");
        this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorText", "Unable to detect face");
        setResult(-1, this.MediaBrowserCompat$SearchResultReceiver);
        finish();
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver.putExtra("responseStatus", "error");
        this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorCode", "1003");
        this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorText", "Eye detect failed");
        setResult(-1, this.MediaBrowserCompat$SearchResultReceiver);
        finish();
    }

    public final void MediaMetadataCompat() {
        this.MediaBrowserCompat$SearchResultReceiver.putExtra("responseStatus", "error");
        this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorCode", "1002");
        this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorText", "Multiple face detected");
        setResult(-1, this.MediaBrowserCompat$SearchResultReceiver);
        finish();
    }

    public Intent getIntent() {
        return super.getIntent();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int rotation = ((WindowManager) getSystemService("window")).getDefaultDisplay().getRotation();
        MediaBrowserCompat$CustomActionResultReceiver = rotation != 1 ? rotation != 3 ? IconCompatParcelizer.ORIENTATION_0 : IconCompatParcelizer.ORIENTATION_270 : IconCompatParcelizer.ORIENTATION_90;
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            unbindService(this.AppCompatDelegateImpl$ListMenuDecorView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IconCompatParcelizer(this.MediaSessionCompat$QueueItem);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        write write2 = this.read;
        if (write2 != null) {
            bundle.putInt("currentScreen", write2.ordinal());
        }
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" status -> ");
        sb.append(i);
        Log.i("provider status changed", sb.toString());
    }

    public final void write(int i) {
        this.AppCompatActivity.add(Integer.valueOf(i));
    }

    static /* synthetic */ void read(FaceCaptureActivity faceCaptureActivity) throws IOException {
        try {
            if (faceCaptureActivity.ParcelableVolumeInfo.containsKey("latitude")) {
                faceCaptureActivity.ParcelableVolumeInfo.remove("latitude");
            }
            if (faceCaptureActivity.ParcelableVolumeInfo.containsKey("longitude")) {
                faceCaptureActivity.ParcelableVolumeInfo.remove("longitude");
            }
            faceCaptureActivity.ParcelableVolumeInfo.put("latitude", CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().PlaybackStateCompat.toString());
            faceCaptureActivity.ParcelableVolumeInfo.put("longitude", CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$ItemReceiver.toString());
            ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding = new ChequeAnnouncementActivity_ViewBinding();
            chequeAnnouncementActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = 900;
            int i = ChequeAnnouncementActivity_ViewBinding.IconCompatParcelizer;
            chequeAnnouncementActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = 0;
            chequeAnnouncementActivity_ViewBinding.read = faceCaptureActivity.PlaybackStateCompat$CustomAction;
            byte[] write2 = faceCaptureActivity.AlertController$RecycleListView.write(faceCaptureActivity.PlaybackStateCompat.intValue(), chequeAnnouncementActivity_ViewBinding);
            String read2 = AlertController$RecycleListView.read(write2);
            faceCaptureActivity.MediaBrowserCompat$SearchResultReceiver.putExtra("imageCapture", write2);
            MatchingResult matchSync = faceCaptureActivity.m5763x50fd9e4a().matchSync(new MatchingForm().setTransactionId(faceCaptureActivity.MediaSessionCompat$Token).setFaceSelfie(read2), faceCaptureActivity.ParcelableVolumeInfo);
            if (LivenessStatus.ERROR_MATCHING_FAIL.equals(matchSync.error)) {
                faceCaptureActivity.MediaBrowserCompat$SearchResultReceiver.putExtra("responseStatus", "error");
                faceCaptureActivity.MediaBrowserCompat$SearchResultReceiver.putExtra("errorCode", LivenessStatus.ERROR_MATCHING_FAIL);
                faceCaptureActivity.MediaBrowserCompat$SearchResultReceiver.putExtra("errorText", matchSync.error);
                faceCaptureActivity.setResult(-1, faceCaptureActivity.MediaBrowserCompat$SearchResultReceiver);
                faceCaptureActivity.finish();
                return;
            }
            if (matchSync.error != null) {
                if (!"".equals(matchSync.error)) {
                    throw new Exception(matchSync.error);
                }
            }
            faceCaptureActivity.MediaBrowserCompat$SearchResultReceiver.putExtra("responseStatus", "ok");
            faceCaptureActivity.setResult(-1, faceCaptureActivity.MediaBrowserCompat$SearchResultReceiver);
            faceCaptureActivity.finish();
        } catch (Exception e) {
            faceCaptureActivity.MediaBrowserCompat$SearchResultReceiver.putExtra("responseStatus", "error");
            faceCaptureActivity.MediaBrowserCompat$SearchResultReceiver.putExtra("errorCode", LivenessStatus.ERROR_UNKNOW);
            faceCaptureActivity.MediaBrowserCompat$SearchResultReceiver.putExtra("errorText", e.getMessage());
            faceCaptureActivity.setResult(-1, faceCaptureActivity.MediaBrowserCompat$SearchResultReceiver);
            faceCaptureActivity.finish();
        }
    }

    private void IconCompatParcelizer(Queue<Integer> queue, Runnable runnable) throws IOException {
        InputStream inputStream;
        try {
            if (queue.size() == 0) {
                runnable.run();
                return;
            }
            int intValue = queue.poll().intValue();
            if (this.ParcelableVolumeInfo.containsKey("latitude")) {
                this.ParcelableVolumeInfo.remove("latitude");
            }
            if (this.ParcelableVolumeInfo.containsKey("longitude")) {
                this.ParcelableVolumeInfo.remove("longitude");
            }
            this.ParcelableVolumeInfo.put("latitude", CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().PlaybackStateCompat.toString());
            this.ParcelableVolumeInfo.put("longitude", CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$ItemReceiver.toString());
            Integer IconCompatParcelizer2 = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo.get(this.AppCompatDialogFragment - 1).IconCompatParcelizer();
            ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding = new ChequeAnnouncementActivity_ViewBinding();
            chequeAnnouncementActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = 640;
            int i = ChequeAnnouncementActivity_ViewBinding.IconCompatParcelizer;
            chequeAnnouncementActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = 0;
            byte[] write2 = this.AlertController$RecycleListView.write(intValue, chequeAnnouncementActivity_ViewBinding);
            if (IconCompatParcelizer2 == FaceProcessor.LivenessActivity.STRAIGHT) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(write2);
                if (CcSofReviewTermsAndConditionsActivity.MediaBrowserCompat$ItemReceiver == null) {
                    CcSofReviewTermsAndConditionsActivity.MediaBrowserCompat$ItemReceiver = new CcSofReviewTermsAndConditionsActivity();
                }
                inputStream = new FileInputStream(CloseAccountReviewActivity.write(byteArrayInputStream, QuickTopUpReviewActivity.read(this.MediaSessionCompat$Token, QuickTopUpReviewActivity.read(new Random().nextInt(5) + 8, new SecureRandom())).getBytes()));
            } else {
                inputStream = new ByteArrayInputStream(write2);
            }
            InputStream inputStream2 = inputStream;
            Intent intent = this.MediaBrowserCompat$SearchResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("livenessImage_");
            sb.append(this.AppCompatDialogFragment - 1);
            intent.putExtra(sb.toString(), write2);
            TransactionService MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = m5763x50fd9e4a();
            String str = this.MediaSessionCompat$Token;
            TransactionUploadFileType selfieType = TransactionUploadFileType.getSelfieType(this.AppCompatDialogFragment);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ACTIVITY=");
            sb2.append(IconCompatParcelizer2);
            if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.uploadDocumentSync(str, selfieType, inputStream2, sb2.toString(), this.ParcelableVolumeInfo)) {
                this.AppCompatDialogFragment++;
                IconCompatParcelizer(queue, runnable);
                return;
            }
            throw new Exception("Unable to upload evidence");
        } catch (Exception e) {
            e.printStackTrace();
            this.MediaBrowserCompat$SearchResultReceiver.putExtra("responseStatus", "error");
            this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorCode", LivenessStatus.ERROR_UNKNOW);
            this.MediaBrowserCompat$SearchResultReceiver.putExtra("errorText", e.getMessage());
            setResult(-1, this.MediaBrowserCompat$SearchResultReceiver);
            finish();
        }
    }

    private void IconCompatParcelizer(Bundle bundle) {
        Context context;
        int i;
        Object obj;
        ArrayList<onEmailUsClick$MediaBrowserCompat$MediaItem> arrayList;
        CloseAccountConfirmationOtpActivity.IconCompatParcelizer iconCompatParcelizer;
        CloseAccountConfirmationOtpActivity closeAccountConfirmationOtpActivity;
        if (AppCompatRatingBar.MediaBrowserCompat$ItemReceiver(this, "android.permission.CAMERA") != 0) {
            context = getApplicationContext();
            i = onSearchButtonClick$MediaBrowserCompat$ItemReceiver.permission_camera_rationale;
        } else if (AppCompatRatingBar.MediaBrowserCompat$ItemReceiver(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || AppCompatRatingBar.MediaBrowserCompat$ItemReceiver(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().IconCompatParcelizer = this;
            Bundle extras = getIntent().getExtras();
            Log.i("No Bundle data found", "");
            CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().read = true;
            CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat = CloseAccountConfirmationOtpActivity.IconCompatParcelizer.face_first;
            CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$MediaItem = 90;
            CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$Token = false;
            CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
            if (extras != null) {
                Log.d("start main activity", "");
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
                extras.getString("SubjectID");
                extras.getString("BiometricOperation");
                this.ActionMenuItemView = extras.getString("URLServer");
                extras.getString("firstName");
                extras.getString("lastName");
                extras.getString("middleName");
                extras.getString("dob");
                extras.getString("suffixOrComplement");
                this.setChecked = extras.getBoolean("isFace_Spoof_Detection");
                this.setExpandedFormat = extras.getBoolean("isIncludeImage");
                this.setShortcut = extras.getBoolean("isIncludeVoice");
                this.RatingCompat = extras.getInt("Timer");
                this.setCheckable = extras.getInt("JPEGQuality");
                extras.getBoolean("isKonyMobileFabric");
                extras.getBoolean("isFaceFirst");
                this.setIcon = extras.getBoolean("isCaptureAutomatic");
                this.setPopupCallback = extras.getBoolean("isCaptureOnly");
                this.MediaMetadataCompat = extras.getInt("ContinuousSuccess");
                extras.getString("institution");
                extras.getBoolean("getActionImage");
                extras.getBoolean("getActionVideo");
                this.MediaSessionCompat$Token = extras.getString(BeIDParams.BEID_TRANSACTION_ID);
                this.ParcelableVolumeInfo = (HashMap) extras.getSerializable("params");
                this.f5445x50fd9e4a = Integer.valueOf(extras.getInt("livenessAcceptance"));
                extras.getInt("livenessActivityLength");
                this.setItemInvoker = extras.getByteArray("livenessActivity");
                String str = IconCompatParcelizer;
                StringBuilder sb = new StringBuilder();
                sb.append("FaceSpoofDetection Default Value ");
                sb.append(extras.getBoolean("isFace_Spoof_Detection"));
                Log.i(str, sb.toString());
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().read = this.setChecked;
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().write = this.setExpandedFormat;
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$SearchResultReceiver = this.setShortcut;
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$Token = this.setIcon;
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().RatingCompat = this.setPopupCallback;
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$CustomActionResultReceiver = null;
                if (getIntent().hasExtra("isFaceFirst")) {
                    if (extras.getBoolean("isFaceFirst")) {
                        closeAccountConfirmationOtpActivity = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
                        iconCompatParcelizer = CloseAccountConfirmationOtpActivity.IconCompatParcelizer.face_first;
                    } else {
                        closeAccountConfirmationOtpActivity = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
                        iconCompatParcelizer = CloseAccountConfirmationOtpActivity.IconCompatParcelizer.challenge_first;
                    }
                    closeAccountConfirmationOtpActivity.MediaDescriptionCompat = iconCompatParcelizer;
                }
                for (byte b : this.setItemInvoker) {
                    if (b == FaceProcessor.LivenessActivity.SMILE.intValue()) {
                        arrayList = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo;
                        obj = new ChequeStatusActivity_ViewBinding(Integer.valueOf(this.MediaMetadataCompat), Integer.valueOf(this.RatingCompat * 1000));
                    } else if (b == FaceProcessor.LivenessActivity.BLINK.intValue()) {
                        arrayList = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo;
                        obj = new ManageChequeActivity_ViewBinding(Integer.valueOf(this.MediaMetadataCompat), Integer.valueOf(this.RatingCompat * 1000));
                    } else if (b == FaceProcessor.LivenessActivity.TILT_HEAD_LEFT.intValue()) {
                        arrayList = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo;
                        obj = new StopChequeLandingActivity(Integer.valueOf(this.MediaMetadataCompat), Integer.valueOf(this.RatingCompat * 1000));
                    } else if (b == FaceProcessor.LivenessActivity.TILT_HEAD_RIGHT.intValue()) {
                        arrayList = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo;
                        obj = new StopChequeReviewActivity(Integer.valueOf(this.MediaMetadataCompat), Integer.valueOf(this.RatingCompat * 1000));
                    } else if (b == FaceProcessor.LivenessActivity.CLOSE_LEFT_EYE.intValue()) {
                        arrayList = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo;
                        obj = new OrderChequeHelpActivity(Integer.valueOf(this.MediaMetadataCompat), Integer.valueOf(this.RatingCompat * 1000));
                    } else if (b == FaceProcessor.LivenessActivity.CLOSE_RIGHT_EYE.intValue()) {
                        arrayList = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo;
                        obj = new ActivateChequeLandingActivity(Integer.valueOf(this.MediaMetadataCompat), Integer.valueOf(this.RatingCompat * 1000));
                    } else if (b == FaceProcessor.LivenessActivity.TURN_FACE_LEFT.intValue()) {
                        arrayList = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo;
                        obj = new ChubbPaySuccessActivity(Integer.valueOf(this.MediaMetadataCompat), Integer.valueOf(this.RatingCompat * 1000));
                    } else if (b == FaceProcessor.LivenessActivity.TURN_FACE_RIGHT.intValue()) {
                        arrayList = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo;
                        obj = new OrderChequeReviewActivity(Integer.valueOf(this.MediaMetadataCompat), Integer.valueOf(this.RatingCompat * 1000));
                    } else if (b == FaceProcessor.LivenessActivity.STRAIGHT.intValue()) {
                        arrayList = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo;
                        obj = new OrderChequeLandingActivity(Integer.valueOf(this.MediaMetadataCompat), Integer.valueOf(this.RatingCompat * 1000));
                    }
                    arrayList.add(obj);
                }
                if (this.RatingCompat == 0) {
                    this.RatingCompat = 3;
                }
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaMetadataCompat = this.RatingCompat;
                if (this.setCheckable == 0) {
                    this.setCheckable = 90;
                } else {
                    String str2 = IconCompatParcelizer;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("JPEG Quality ");
                    sb2.append(String.valueOf(this.setCheckable));
                    Log.e(str2, sb2.toString());
                }
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$MediaItem = this.setCheckable;
                if (this.MediaMetadataCompat == 0) {
                    this.MediaMetadataCompat = 1;
                }
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$ResultReceiverWrapper = this.MediaMetadataCompat;
                String str3 = IconCompatParcelizer;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Timer ");
                sb3.append(String.valueOf(CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaMetadataCompat));
                Log.e(str3, sb3.toString());
                String str4 = IconCompatParcelizer;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("JPEGQuality ");
                sb4.append(String.valueOf(CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$MediaItem));
                Log.e(str4, sb4.toString());
                String str5 = IconCompatParcelizer;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("ContinuousSuccess ");
                sb5.append(String.valueOf(CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$ResultReceiverWrapper));
                Log.e(str5, sb5.toString());
                if (getIntent().hasExtra("imageOnly")) {
                    this.AppCompatViewInflater = extras.getByteArray("imageOnly");
                    CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
            Log.i("Actions array sizes", String.valueOf(CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$QueueItem.size()));
            for (int i2 = 0; i2 < CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$QueueItem.size(); i2++) {
                Log.i("Actions array", CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$QueueItem.get(i2).toString());
            }
            if (this.AppCompatViewInflater != null) {
                this.read = write.UPDATE;
            } else if (bundle == null) {
                Log.e(IconCompatParcelizer, " call show capture");
                Log.e(IconCompatParcelizer, " show capture fragment");
                C9632b bVar = new C9632b();
                this.write = bVar;
                bVar.MediaBrowserCompat$ItemReceiver = this;
                this.write.IconCompatParcelizer = this;
                String str6 = IconCompatParcelizer;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(" capture fragment");
                sb6.append(this.write);
                Log.e(str6, sb6.toString());
                FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                beginTransaction.add(onSearchButtonClick.IconCompatParcelizer.container, this.write, "captureFragment");
                beginTransaction.show(this.write);
                beginTransaction.commit();
                this.read = write.CAPTURE;
            } else {
                Log.e(IconCompatParcelizer, " reviveFragments");
                int i3 = bundle.getInt("currentScreen");
                this.write = (C9632b) getFragmentManager().findFragmentByTag("captureFragment");
                this.read = write.values()[i3];
                String str7 = IconCompatParcelizer;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("receiveFragments captureFragment ");
                sb7.append(this.write);
                Log.e(str7, sb7.toString());
            }
            LocationManager locationManager = (LocationManager) getSystemService("location");
            this.setHasDecor = locationManager;
            if (locationManager != null) {
                Criteria criteria = new Criteria();
                criteria.setAccuracy(1);
                String bestProvider = this.setHasDecor.getBestProvider(criteria, true);
                Location lastKnownLocation = this.setHasDecor.getLastKnownLocation(bestProvider);
                if (lastKnownLocation != null) {
                    CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().PlaybackStateCompat = Double.valueOf(lastKnownLocation.getLatitude());
                    CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$ItemReceiver = Double.valueOf(lastKnownLocation.getLongitude());
                }
                this.setHasDecor.requestLocationUpdates(bestProvider, 100, 1.0f, this);
                return;
            }
            return;
        } else {
            context = getApplicationContext();
            i = onSearchButtonClick$MediaBrowserCompat$ItemReceiver.permission_location_rationale;
        }
        Toast.makeText(context, i, 0).show();
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver(SparseArray<ParcelFileDescriptor> sparseArray) {
        try {
            String str = IconCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append("GetActionImagesSuccessFailListener=");
            sb.append(sparseArray.size());
            Log.e(str, sb.toString());
            if (sparseArray.size() > 0) {
                String str2 = IconCompatParcelizer;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("actionImagesize=");
                sb2.append(CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().f5485x50fd9e4a.size());
                Log.e(str2, sb2.toString());
            }
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        FaceCaptureActivity.this.IconCompatParcelizer(-1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (Exception e) {
            this.setBackgroundResource = e.toString();
            this.MediaBrowserCompat$MediaItem.sendEmptyMessage(1);
            e.printStackTrace();
        }
    }

    public boolean handleMessage(Message message) {
        try {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat != CloseAccountConfirmationOtpActivity.IconCompatParcelizer.face_first || !CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().read) {
                        this.MediaBrowserCompat$SearchResultReceiver.putExtra("error", this.setBackgroundResource);
                    } else {
                        Log.e(IconCompatParcelizer, "face detection fails");
                    }
                }
                return false;
            } else if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat != CloseAccountConfirmationOtpActivity.IconCompatParcelizer.face_first || !CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().read) {
                if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().RatingCompat) {
                    Intent intent = this.MediaBrowserCompat$SearchResultReceiver;
                    CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
                    intent.putExtra("captureOnlyImage", (byte[]) null);
                } else {
                    Log.d("onSuccess DataResult", this.setContentView);
                    this.MediaBrowserCompat$SearchResultReceiver.putExtra("result", this.setContentView);
                }
                IconCompatParcelizer(-1);
                return false;
            } else {
                Log.e(IconCompatParcelizer, "face detection fails");
                this.MediaBrowserCompat$SearchResultReceiver.putExtra("error", this.setBackgroundResource);
            }
            IconCompatParcelizer(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void onBackPressed() {
        Log.i("Call ", " OnBackPressed");
        CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
        String str = IconCompatParcelizer;
        StringBuilder sb = new StringBuilder();
        sb.append(" isFinishCaptureAutomaticFaceFirst OBP");
        CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
        sb.append("false");
        Log.e(str, sb.toString());
        if (this.read == write.CONFIRM || this.read != write.ID) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        Security.insertProviderAt(new TileAdapter.StaticShortcutHolder(), 1);
        Intent intent = getIntent();
        MediaDescriptionCompat = (BEIDConfigurationFactory) intent.getParcelableExtra("_config");
        String stringExtra = intent.getStringExtra("language");
        this.MediaSessionCompat$ResultReceiverWrapper = stringExtra;
        if (!"en".equals(stringExtra)) {
            this.MediaSessionCompat$ResultReceiverWrapper = "th";
        }
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = new Locale(this.MediaSessionCompat$ResultReceiverWrapper);
        resources.updateConfiguration(configuration, displayMetrics);
        Intent intent2 = new Intent(this, CloseAccountSuccessActivity.class);
        intent2.setAction(CloseAccountSelectMainAccountActivity.class.getName());
        startService(intent2);
        bindService(intent2, this.AppCompatDelegateImpl$ListMenuDecorView, 1);
        super.onCreate(bundle);
        setContentView(onSearchButtonClick.read.activity_face_capture);
        this.MediaSessionCompat$QueueItem = bundle;
        RatingCompat();
    }

    public void onLocationChanged(Location location) {
        CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().PlaybackStateCompat = Double.valueOf(location.getLatitude());
        CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$ItemReceiver = Double.valueOf(location.getLongitude());
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (Build.VERSION.SDK_INT >= 23) {
            Runtime.getRuntime().gc();
        } else {
            System.gc();
        }
    }

    public void onStop() {
        CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$QueueItem.clear();
        CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo.clear();
        CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().f5485x50fd9e4a.clear();
        super.onStop();
    }
}
