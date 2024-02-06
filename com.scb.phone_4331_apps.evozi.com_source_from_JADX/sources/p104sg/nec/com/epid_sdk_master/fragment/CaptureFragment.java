package p104sg.nec.com.epid_sdk_master.fragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.places.PlacesStatusCodes;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.android.gms.vision.face.Landmark;
import com.google.android.gms.vision.face.LargestFaceFocusingProcessor;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import p040o.AlertController$RecycleListView;
import p040o.AppCompatRatingBar;
import p040o.CustomRecipientsList_ViewBinding;
import p040o.DocumentUploadedCustomView_ViewBinding;
import p040o.DocumentsUploadedSectionCustomView_ViewBinding;
import p040o.setAvatar;
import p040o.setQuestionMark;
import p040o.setRecipients;
import p040o.setSelect;
import p040o.setTvRemark;
import p040o.setTvRemark$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.typeFromBitmap;
import p104sg.nec.com.epid_sdk_master.camera.CameraSourcePreview;
import p104sg.nec.com.epid_sdk_master.camera.GraphicOverlay;
import p104sg.nec.com.epid_sdk_master.ePIDMainActivity;

/* renamed from: sg.nec.com.epid_sdk_master.fragment.CaptureFragment */
public class CaptureFragment extends Fragment implements TextToSpeech.OnInitListener {
    /* access modifiers changed from: package-private */
    public static final String MediaBrowserCompat$ItemReceiver = CaptureFragment.class.getName();
    /* access modifiers changed from: private */
    public boolean AbsActionBarView;
    /* access modifiers changed from: private */
    public TextView ActionBarContainer;
    private double ActionBarContextView;
    private float ActionMenuItemView;
    /* access modifiers changed from: private */
    public int AlertController$RecycleListView;
    /* access modifiers changed from: private */
    public int AppCompatActivity;
    /* access modifiers changed from: private */
    public boolean AppCompatDelegateImpl$ListMenuDecorView;
    private double AppCompatDialogFragment;
    /* access modifiers changed from: private */
    public boolean AppCompatViewInflater;
    /* access modifiers changed from: private */
    public boolean ExpandedMenuView;
    byte[] IconCompatParcelizer;
    private int Keep;
    private int ListMenuItemView;
    public ImageView MediaBrowserCompat$CustomActionResultReceiver;
    AlertDialog MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: package-private */
    public CameraSource MediaBrowserCompat$SearchResultReceiver = null;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f6396x50fd9e4a;
    read MediaDescriptionCompat;
    public DocumentUploadedCustomView_ViewBinding MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem = setRecipients.MediaMetadataCompat().read;
    private double MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    /* access modifiers changed from: private */
    public boolean MenuItemImpl;
    private float MenuItemWrapperICS$CollapsibleActionViewWrapper;
    private int ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private int PlaybackStateCompat$CustomAction;
    DocumentsUploadedSectionCustomView_ViewBinding RatingCompat;
    public ArrayList<byte[]> read;
    /* access modifiers changed from: private */
    public int setBackgroundResource;
    private float setCheckable;
    /* access modifiers changed from: private */
    public Activity setChecked;
    private int setContentHeight = 0;
    private double setContentView;
    private View setCustomView;
    /* access modifiers changed from: private */
    public boolean setExpandedFormat;
    private Random setForceShowIcon;
    /* access modifiers changed from: private */
    public CaptureFragment$MediaBrowserCompat$ItemReceiver setGroupDividerEnabled;
    private int setHasDecor;
    /* access modifiers changed from: private */
    public Handler setIcon;
    /* access modifiers changed from: private */
    public CameraSourcePreview setItemInvoker;
    /* access modifiers changed from: private */
    public ImageView setPadding;
    private int setPopupCallback;
    /* access modifiers changed from: private */
    public boolean setPrimaryBackground;
    private GraphicOverlay setShortcut;
    private double setSplitBackground;
    private boolean setStackedBackground;
    private TextToSpeech setTabContainer;
    /* access modifiers changed from: private */
    public ImageView setTitle;
    private double setTitleOptional;
    private double setTransitioning;
    private float setVisibility;
    public setQuestionMark write;

    static /* synthetic */ void MediaBrowserCompat$MediaItem(CaptureFragment captureFragment) {
    }

    static /* synthetic */ void MediaMetadataCompat(CaptureFragment captureFragment) {
    }

    public CaptureFragment() {
        new ArrayList(Arrays.asList(new String[]{"Blink", "Close left eye", "Close right eye", "Smile with teeth showing", "Turn head to the left", " Turn head to the right"}));
        this.f6396x50fd9e4a = "";
        this.ExpandedMenuView = false;
        this.setExpandedFormat = false;
        this.AppCompatDelegateImpl$ListMenuDecorView = false;
        this.AppCompatActivity = -1;
        this.MenuItemImpl = false;
        this.setStackedBackground = false;
        this.setForceShowIcon = new Random();
        this.setIcon = new Handler(new Object() {
            public final boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 99) {
                    Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "hide timer");
                    if (CaptureFragment.this.ActionBarContainer == null) {
                        return false;
                    }
                    Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "hide txtCountDown");
                    CaptureFragment.this.ActionBarContainer.setVisibility(8);
                    return false;
                } else if (i != 100) {
                    return false;
                } else {
                    Log.i(CaptureFragment.MediaBrowserCompat$ItemReceiver, "start capture from handler");
                    if (CaptureFragment.this.MediaBrowserCompat$SearchResultReceiver == null) {
                        return false;
                    }
                    CaptureFragment.this.MediaBrowserCompat$SearchResultReceiver.takePicture((CameraSource.ShutterCallback) null, this);
                    return false;
                }
            }

            public final void onPictureTaken(byte[] bArr) {
                int i;
                try {
                    try {
                        i = ((typeFromBitmap) AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((InputStream) new ByteArrayInputStream(bArr), -1).write(typeFromBitmap.class)).write();
                    } catch (Exception e) {
                        Log.i("io error", e.toString());
                        e.printStackTrace();
                        i = 0;
                    }
                    Log.i(" Orientation", String.valueOf(i));
                    Matrix matrix = new Matrix();
                    switch (i) {
                        case 2:
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 3:
                            matrix.postRotate(-180.0f);
                            break;
                        case 4:
                            matrix.postScale(1.0f, -1.0f);
                            break;
                        case 5:
                            matrix.postRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 6:
                            matrix.postRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 7:
                            matrix.postRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 8:
                            matrix.postRotate(-90.0f);
                            break;
                    }
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                    String MediaBrowserCompat$CustomActionResultReceiver = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                    StringBuilder sb = new StringBuilder();
                    sb.append(" getConfig from Camera ");
                    sb.append(decodeByteArray.getConfig());
                    Log.e(MediaBrowserCompat$CustomActionResultReceiver, sb.toString());
                    ((ePIDMainActivity) CaptureFragment.this.setChecked).IconCompatParcelizer(createBitmap, ePIDMainActivity.write, (setQuestionMark) null);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
        this.AbsActionBarView = false;
        this.setPrimaryBackground = false;
        this.setPopupCallback = 10;
        new SurfaceHolder.Callback() {
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                CaptureFragment.MediaBrowserCompat$MediaItem(CaptureFragment.this);
                CaptureFragment.MediaMetadataCompat(CaptureFragment.this);
                Log.i("Surface change", "");
            }
        };
        this.AlertController$RecycleListView = 0;
        this.setBackgroundResource = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:152:0x06b3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(p104sg.nec.com.epid_sdk_master.fragment.CaptureFragment r11, com.google.android.gms.vision.face.Face r12, int r13) {
        /*
            monitor-enter(r11)
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = "startChallenge value "
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x06b4 }
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = "startChallenge with Action "
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            o.setRecipients r2 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r2 = r2.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x06b4 }
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x06b4 }
            o.setRecipients$write r0 = p040o.setRecipients.write.blink     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r1 = r1.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x06b4 }
            r2 = 4599976659396224614(0x3fd6666666666666, double:0.35)
            r4 = 4605831338911806259(0x3feb333333333333, double:0.85)
            r6 = 1
            r7 = 0
            if (r0 != r1) goto L_0x024d
            r11.ParcelableVolumeInfo = r7     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat = r7     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat$CustomAction = r7     // Catch:{ all -> 0x06b4 }
            r11.setHasDecor = r7     // Catch:{ all -> 0x06b4 }
            r11.Keep = r7     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = " left eye open posibility "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            float r8 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x06b4 }
            float r0 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x008d
            float r0 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x008d
            monitor-exit(r11)
            return
        L_0x008d:
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = " analyse blink "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            float r8 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = " "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            float r8 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = " state value "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            int r8 = r11.setContentHeight     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x06b4 }
            int r0 = r11.setContentHeight     // Catch:{ all -> 0x06b4 }
            r1 = 3
            if (r0 == 0) goto L_0x016b
            r8 = 2
            if (r0 == r6) goto L_0x0115
            if (r0 != r8) goto L_0x01a5
            float r0 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            double r8 = (double) r0     // Catch:{ all -> 0x06b4 }
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a5
            float r0 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            double r8 = (double) r0     // Catch:{ all -> 0x06b4 }
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a5
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r8.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r9 = " blink occured "
            r8.append(r9)     // Catch:{ all -> 0x06b4 }
            float r9 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r8.append(r9)     // Catch:{ all -> 0x06b4 }
            java.lang.String r9 = " "
            r8.append(r9)     // Catch:{ all -> 0x06b4 }
            float r9 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r8.append(r9)     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.e(r0, r8)     // Catch:{ all -> 0x06b4 }
            r11.setContentHeight = r1     // Catch:{ all -> 0x06b4 }
            goto L_0x01a5
        L_0x0115:
            float r0 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            double r9 = (double) r0     // Catch:{ all -> 0x06b4 }
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a5
            float r0 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            double r9 = (double) r0     // Catch:{ all -> 0x06b4 }
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a5
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r9.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r10 = " become close "
            r9.append(r10)     // Catch:{ all -> 0x06b4 }
            float r10 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r9.append(r10)     // Catch:{ all -> 0x06b4 }
            java.lang.String r10 = " "
            r9.append(r10)     // Catch:{ all -> 0x06b4 }
            float r10 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r9.append(r10)     // Catch:{ all -> 0x06b4 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.e(r0, r9)     // Catch:{ all -> 0x06b4 }
            r11.setContentHeight = r8     // Catch:{ all -> 0x06b4 }
            int r0 = r11.MediaSessionCompat$Token     // Catch:{ all -> 0x06b4 }
            o.setRecipients r8 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            int r8 = r8.f5825x50fd9e4a     // Catch:{ all -> 0x06b4 }
            int r8 = r8 - r6
            if (r0 != r8) goto L_0x01a5
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            boolean r0 = r0.AppCompatActivity     // Catch:{ all -> 0x06b4 }
            if (r0 == 0) goto L_0x01a5
            o.DocumentsUploadedSectionCustomView_ViewBinding r0 = r11.RatingCompat     // Catch:{ all -> 0x06b4 }
            byte[] r0 = r0.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x06b4 }
            r11.IconCompatParcelizer = r0     // Catch:{ all -> 0x06b4 }
            goto L_0x01a5
        L_0x016b:
            float r0 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            double r8 = (double) r0     // Catch:{ all -> 0x06b4 }
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a5
            float r0 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            double r8 = (double) r0     // Catch:{ all -> 0x06b4 }
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a5
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r8.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r9 = " initially open "
            r8.append(r9)     // Catch:{ all -> 0x06b4 }
            float r9 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r8.append(r9)     // Catch:{ all -> 0x06b4 }
            java.lang.String r9 = " "
            r8.append(r9)     // Catch:{ all -> 0x06b4 }
            float r9 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r8.append(r9)     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.e(r0, r8)     // Catch:{ all -> 0x06b4 }
            r11.setContentHeight = r6     // Catch:{ all -> 0x06b4 }
        L_0x01a5:
            int r0 = r11.setContentHeight     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x024d
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = " blink successed"
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x06b4 }
            r11.setContentHeight = r7     // Catch:{ all -> 0x06b4 }
            int r0 = r11.MediaSessionCompat$Token     // Catch:{ all -> 0x06b4 }
            int r0 = r0 + r6
            r11.MediaSessionCompat$Token = r0     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            int r1 = r1.f5825x50fd9e4a     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x024d
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = " success FACE_CLOSE_BOTH_EYES  "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            float r8 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = "  "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            float r8 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            android.widget.TextView r0 = r11.ActionBarContainer     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$22 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$22     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.post(r1)     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = "CountBlink "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            int r8 = r11.MediaSessionCompat$Token     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            r11.MediaSessionCompat$Token = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r0 = r0.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            int r0 = r0.size()     // Catch:{ all -> 0x06b4 }
            if (r0 != r6) goto L_0x023b
            r11.MenuItemImpl = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r0 = r0.RatingCompat     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r1 = p040o.setRecipients.IconCompatParcelizer.face_first     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x0230
            android.app.Activity r0 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$24 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$24     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x06b4 }
            goto L_0x024d
        L_0x0230:
            android.app.Activity r0 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$30 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$30     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x06b4 }
            goto L_0x024d
        L_0x023b:
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            boolean r0 = r0.AppCompatActivity     // Catch:{ all -> 0x06b4 }
            if (r0 == 0) goto L_0x024a
            java.util.ArrayList<byte[]> r0 = r11.read     // Catch:{ all -> 0x06b4 }
            byte[] r1 = r11.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            r0.add(r1)     // Catch:{ all -> 0x06b4 }
        L_0x024a:
            r11.read((int) r13)     // Catch:{ all -> 0x06b4 }
        L_0x024d:
            o.setRecipients$write r0 = p040o.setRecipients.write.close_left_eye     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r1 = r1.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x0338
            r11.MediaSessionCompat$Token = r7     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat = r7     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat$CustomAction = r7     // Catch:{ all -> 0x06b4 }
            r11.setHasDecor = r7     // Catch:{ all -> 0x06b4 }
            r11.Keep = r7     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = " left eye "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            float r8 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = " right eye "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            float r8 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x06b4 }
            float r0 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            double r0 = (double) r0     // Catch:{ all -> 0x06b4 }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0338
            float r0 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            double r0 = (double) r0     // Catch:{ all -> 0x06b4 }
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0338
            int r0 = r11.ParcelableVolumeInfo     // Catch:{ all -> 0x06b4 }
            int r0 = r0 + r6
            r11.ParcelableVolumeInfo = r0     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            int r1 = r1.f5825x50fd9e4a     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x0338
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = "success FACE_WINK_LEFT_EYE  "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            float r8 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            android.widget.TextView r0 = r11.ActionBarContainer     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$29 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$29     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.post(r1)     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = "CountCloseLeftEye "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            int r8 = r11.ParcelableVolumeInfo     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            r11.ParcelableVolumeInfo = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r0 = r0.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            int r0 = r0.size()     // Catch:{ all -> 0x06b4 }
            if (r0 != r6) goto L_0x0322
            r11.MenuItemImpl = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r0 = r0.RatingCompat     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r1 = p040o.setRecipients.IconCompatParcelizer.face_first     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x0317
            android.app.Activity r0 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$26 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$26     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x06b4 }
            goto L_0x0338
        L_0x0317:
            android.app.Activity r0 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$27 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$27     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x06b4 }
            goto L_0x0338
        L_0x0322:
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            boolean r0 = r0.AppCompatActivity     // Catch:{ all -> 0x06b4 }
            if (r0 == 0) goto L_0x0335
            java.util.ArrayList<byte[]> r0 = r11.read     // Catch:{ all -> 0x06b4 }
            o.DocumentsUploadedSectionCustomView_ViewBinding r1 = r11.RatingCompat     // Catch:{ all -> 0x06b4 }
            byte[] r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x06b4 }
            r0.add(r1)     // Catch:{ all -> 0x06b4 }
        L_0x0335:
            r11.read((int) r13)     // Catch:{ all -> 0x06b4 }
        L_0x0338:
            o.setRecipients$write r0 = p040o.setRecipients.write.close_right_eye     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r1 = r1.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x0423
            r11.MediaSessionCompat$Token = r7     // Catch:{ all -> 0x06b4 }
            r11.ParcelableVolumeInfo = r7     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat$CustomAction = r7     // Catch:{ all -> 0x06b4 }
            r11.setHasDecor = r7     // Catch:{ all -> 0x06b4 }
            r11.Keep = r7     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = " left eye "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            float r8 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = " right eye "
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            float r8 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x06b4 }
            r1.append(r8)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x06b4 }
            float r0 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            double r0 = (double) r0     // Catch:{ all -> 0x06b4 }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0423
            float r0 = r12.getIsLeftEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            double r0 = (double) r0     // Catch:{ all -> 0x06b4 }
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0423
            int r0 = r11.PlaybackStateCompat     // Catch:{ all -> 0x06b4 }
            int r0 = r0 + r6
            r11.PlaybackStateCompat = r0     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            int r1 = r1.f5825x50fd9e4a     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x0423
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = "success FACE_WINK_RIGHT_EYE  "
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            float r2 = r12.getIsRightEyeOpenProbability()     // Catch:{ all -> 0x06b4 }
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            android.widget.TextView r0 = r11.ActionBarContainer     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$5 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$5     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.post(r1)     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = "CountCloseRightEye "
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            int r2 = r11.PlaybackStateCompat     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x06b4 }
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r0 = r0.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            int r0 = r0.size()     // Catch:{ all -> 0x06b4 }
            if (r0 != r6) goto L_0x040d
            r11.MenuItemImpl = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r0 = r0.RatingCompat     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r1 = p040o.setRecipients.IconCompatParcelizer.face_first     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x0402
            android.app.Activity r0 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$3 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$3     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x06b4 }
            goto L_0x0423
        L_0x0402:
            android.app.Activity r0 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$1 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$1     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x06b4 }
            goto L_0x0423
        L_0x040d:
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            boolean r0 = r0.AppCompatActivity     // Catch:{ all -> 0x06b4 }
            if (r0 == 0) goto L_0x0420
            java.util.ArrayList<byte[]> r0 = r11.read     // Catch:{ all -> 0x06b4 }
            o.DocumentsUploadedSectionCustomView_ViewBinding r1 = r11.RatingCompat     // Catch:{ all -> 0x06b4 }
            byte[] r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x06b4 }
            r0.add(r1)     // Catch:{ all -> 0x06b4 }
        L_0x0420:
            r11.read((int) r13)     // Catch:{ all -> 0x06b4 }
        L_0x0423:
            o.setRecipients$write r0 = p040o.setRecipients.write.smile     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r1 = r1.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x04e9
            r11.MediaSessionCompat$Token = r7     // Catch:{ all -> 0x06b4 }
            r11.ParcelableVolumeInfo = r7     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat = r7     // Catch:{ all -> 0x06b4 }
            r11.setHasDecor = r7     // Catch:{ all -> 0x06b4 }
            r11.Keep = r7     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = " Start Smile Challenge "
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            o.setRecipients r2 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r2 = r2.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x06b4 }
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            float r0 = r12.getIsSmilingProbability()     // Catch:{ all -> 0x06b4 }
            double r0 = (double) r0     // Catch:{ all -> 0x06b4 }
            r2 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x04e9
            int r0 = r11.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x06b4 }
            int r0 = r0 + r6
            r11.PlaybackStateCompat$CustomAction = r0     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            int r1 = r1.f5825x50fd9e4a     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x04e9
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = "success FACE_SMILE  "
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            android.widget.TextView r0 = r11.ActionBarContainer     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$2 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$2     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.post(r1)     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = " CountSmile "
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            int r2 = r11.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x06b4 }
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat$CustomAction = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r0 = r0.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            int r0 = r0.size()     // Catch:{ all -> 0x06b4 }
            if (r0 != r6) goto L_0x04d3
            r11.MenuItemImpl = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r0 = r0.RatingCompat     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r1 = p040o.setRecipients.IconCompatParcelizer.face_first     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x04c8
            android.app.Activity r0 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$10 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$10     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x06b4 }
            goto L_0x04e9
        L_0x04c8:
            android.app.Activity r0 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$6 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$6     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x06b4 }
            goto L_0x04e9
        L_0x04d3:
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            boolean r0 = r0.AppCompatActivity     // Catch:{ all -> 0x06b4 }
            if (r0 == 0) goto L_0x04e6
            java.util.ArrayList<byte[]> r0 = r11.read     // Catch:{ all -> 0x06b4 }
            o.DocumentsUploadedSectionCustomView_ViewBinding r1 = r11.RatingCompat     // Catch:{ all -> 0x06b4 }
            byte[] r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x06b4 }
            r0.add(r1)     // Catch:{ all -> 0x06b4 }
        L_0x04e6:
            r11.read((int) r13)     // Catch:{ all -> 0x06b4 }
        L_0x04e9:
            o.setRecipients$write r0 = p040o.setRecipients.write.turn_head_left     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r1 = r1.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x05b5
            r11.MediaSessionCompat$Token = r7     // Catch:{ all -> 0x06b4 }
            r11.ParcelableVolumeInfo = r7     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat = r7     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat$CustomAction = r7     // Catch:{ all -> 0x06b4 }
            r11.Keep = r7     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = " Start Head Left Challenge "
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            o.setRecipients r2 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r2 = r2.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x06b4 }
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            float r0 = r12.getEulerY()     // Catch:{ all -> 0x06b4 }
            r1 = 1094713344(0x41400000, float:12.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x05b5
            float r0 = r12.getEulerY()     // Catch:{ all -> 0x06b4 }
            r1 = 1114636288(0x42700000, float:60.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x05b5
            int r0 = r11.setHasDecor     // Catch:{ all -> 0x06b4 }
            int r0 = r0 + r6
            r11.setHasDecor = r0     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            int r1 = r1.f5825x50fd9e4a     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x05b5
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = "success FACE_MOVE_HEAD_LEFT "
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            android.widget.TextView r0 = r11.ActionBarContainer     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$7 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$7     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.post(r1)     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = "CountMoveLeft "
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            int r2 = r11.setHasDecor     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x06b4 }
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x06b4 }
            r11.setHasDecor = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r0 = r0.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            int r0 = r0.size()     // Catch:{ all -> 0x06b4 }
            if (r0 != r6) goto L_0x059f
            r11.MenuItemImpl = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r0 = r0.RatingCompat     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r1 = p040o.setRecipients.IconCompatParcelizer.face_first     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x0594
            android.app.Activity r0 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$8 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$8     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x06b4 }
            goto L_0x05b5
        L_0x0594:
            android.app.Activity r0 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$9 r1 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$9     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            r0.runOnUiThread(r1)     // Catch:{ all -> 0x06b4 }
            goto L_0x05b5
        L_0x059f:
            o.setRecipients r0 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            boolean r0 = r0.AppCompatActivity     // Catch:{ all -> 0x06b4 }
            if (r0 == 0) goto L_0x05b2
            java.util.ArrayList<byte[]> r0 = r11.read     // Catch:{ all -> 0x06b4 }
            o.DocumentsUploadedSectionCustomView_ViewBinding r1 = r11.RatingCompat     // Catch:{ all -> 0x06b4 }
            byte[] r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x06b4 }
            r0.add(r1)     // Catch:{ all -> 0x06b4 }
        L_0x05b2:
            r11.read((int) r13)     // Catch:{ all -> 0x06b4 }
        L_0x05b5:
            o.setRecipients$write r0 = p040o.setRecipients.write.turn_head_right     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r1 = r1.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x0674
            r11.MediaSessionCompat$Token = r7     // Catch:{ all -> 0x06b4 }
            r11.ParcelableVolumeInfo = r7     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat = r7     // Catch:{ all -> 0x06b4 }
            r11.PlaybackStateCompat$CustomAction = r7     // Catch:{ all -> 0x06b4 }
            r11.setHasDecor = r7     // Catch:{ all -> 0x06b4 }
            float r0 = r12.getEulerY()     // Catch:{ all -> 0x06b4 }
            r1 = -1032847360(0xffffffffc2700000, float:-60.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0674
            float r0 = r12.getEulerY()     // Catch:{ all -> 0x06b4 }
            r1 = -1052770304(0xffffffffc1400000, float:-12.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0674
            int r0 = r11.Keep     // Catch:{ all -> 0x06b4 }
            int r0 = r0 + r6
            r11.Keep = r0     // Catch:{ all -> 0x06b4 }
            o.setRecipients r1 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            int r1 = r1.f5825x50fd9e4a     // Catch:{ all -> 0x06b4 }
            if (r0 != r1) goto L_0x0674
            java.lang.String r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r1.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r2 = "success FACE_MOVE_HEAD_RIGHT "
            r1.append(r2)     // Catch:{ all -> 0x06b4 }
            float r12 = r12.getEulerY()     // Catch:{ all -> 0x06b4 }
            r1.append(r12)     // Catch:{ all -> 0x06b4 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r0, r12)     // Catch:{ all -> 0x06b4 }
            android.widget.TextView r12 = r11.ActionBarContainer     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$12 r0 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$12     // Catch:{ all -> 0x06b4 }
            r0.<init>()     // Catch:{ all -> 0x06b4 }
            r12.post(r0)     // Catch:{ all -> 0x06b4 }
            java.lang.String r12 = MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x06b4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x06b4 }
            r0.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = "CountMoveRight "
            r0.append(r1)     // Catch:{ all -> 0x06b4 }
            int r1 = r11.Keep     // Catch:{ all -> 0x06b4 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x06b4 }
            r0.append(r1)     // Catch:{ all -> 0x06b4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x06b4 }
            android.util.Log.i(r12, r0)     // Catch:{ all -> 0x06b4 }
            r11.Keep = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r12 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            java.util.ArrayList<o.setRecipients$write> r12 = r12.IconCompatParcelizer     // Catch:{ all -> 0x06b4 }
            int r12 = r12.size()     // Catch:{ all -> 0x06b4 }
            if (r12 != r6) goto L_0x065e
            r11.MenuItemImpl = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r12 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r12 = r12.RatingCompat     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r13 = p040o.setRecipients.IconCompatParcelizer.face_first     // Catch:{ all -> 0x06b4 }
            if (r12 != r13) goto L_0x0653
            android.app.Activity r12 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$15 r13 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$15     // Catch:{ all -> 0x06b4 }
            r13.<init>()     // Catch:{ all -> 0x06b4 }
            r12.runOnUiThread(r13)     // Catch:{ all -> 0x06b4 }
            goto L_0x0674
        L_0x0653:
            android.app.Activity r12 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$13 r13 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$13     // Catch:{ all -> 0x06b4 }
            r13.<init>()     // Catch:{ all -> 0x06b4 }
            r12.runOnUiThread(r13)     // Catch:{ all -> 0x06b4 }
            goto L_0x0674
        L_0x065e:
            o.setRecipients r12 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            boolean r12 = r12.AppCompatActivity     // Catch:{ all -> 0x06b4 }
            if (r12 == 0) goto L_0x0671
            java.util.ArrayList<byte[]> r12 = r11.read     // Catch:{ all -> 0x06b4 }
            o.DocumentsUploadedSectionCustomView_ViewBinding r0 = r11.RatingCompat     // Catch:{ all -> 0x06b4 }
            byte[] r0 = r0.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x06b4 }
            r12.add(r0)     // Catch:{ all -> 0x06b4 }
        L_0x0671:
            r11.read((int) r13)     // Catch:{ all -> 0x06b4 }
        L_0x0674:
            boolean r12 = r11.AbsActionBarView     // Catch:{ all -> 0x06b4 }
            if (r12 == 0) goto L_0x068d
            boolean r12 = r11.setStackedBackground     // Catch:{ all -> 0x06b4 }
            if (r12 != 0) goto L_0x068d
            boolean r12 = r11.setPrimaryBackground     // Catch:{ all -> 0x06b4 }
            if (r12 != 0) goto L_0x068d
            r11.setStackedBackground = r6     // Catch:{ all -> 0x06b4 }
            android.app.Activity r12 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$14 r13 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$14     // Catch:{ all -> 0x06b4 }
            r13.<init>()     // Catch:{ all -> 0x06b4 }
            r12.runOnUiThread(r13)     // Catch:{ all -> 0x06b4 }
            goto L_0x06b2
        L_0x068d:
            boolean r12 = r11.setPrimaryBackground     // Catch:{ all -> 0x06b4 }
            if (r12 == 0) goto L_0x06b2
            r11.MenuItemImpl = r7     // Catch:{ all -> 0x06b4 }
            o.setRecipients r12 = p040o.setRecipients.MediaMetadataCompat()     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r12 = r12.RatingCompat     // Catch:{ all -> 0x06b4 }
            o.setRecipients$IconCompatParcelizer r13 = p040o.setRecipients.IconCompatParcelizer.face_first     // Catch:{ all -> 0x06b4 }
            if (r12 != r13) goto L_0x06a8
            android.app.Activity r12 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$18 r13 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$18     // Catch:{ all -> 0x06b4 }
            r13.<init>()     // Catch:{ all -> 0x06b4 }
            r12.runOnUiThread(r13)     // Catch:{ all -> 0x06b4 }
            goto L_0x06b2
        L_0x06a8:
            android.app.Activity r12 = r11.setChecked     // Catch:{ all -> 0x06b4 }
            sg.nec.com.epid_sdk_master.fragment.CaptureFragment$17 r13 = new sg.nec.com.epid_sdk_master.fragment.CaptureFragment$17     // Catch:{ all -> 0x06b4 }
            r13.<init>()     // Catch:{ all -> 0x06b4 }
            r12.runOnUiThread(r13)     // Catch:{ all -> 0x06b4 }
        L_0x06b2:
            monitor-exit(r11)
            return
        L_0x06b4:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p104sg.nec.com.epid_sdk_master.fragment.CaptureFragment.MediaBrowserCompat$ItemReceiver(sg.nec.com.epid_sdk_master.fragment.CaptureFragment, com.google.android.gms.vision.face.Face, int):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        getActivity().getWindow().setFormat(3);
        this.setChecked = getActivity();
        this.read = new ArrayList<>();
        this.setChecked.setRequestedOrientation(1);
        if (this.setCustomView == null) {
            View inflate = layoutInflater.inflate(setTvRemark$MediaBrowserCompat$CustomActionResultReceiver.capture_fragment, viewGroup, false);
            this.setCustomView = inflate;
            this.setItemInvoker = (CameraSourcePreview) inflate.findViewById(setTvRemark.write.preview);
            this.setShortcut = (GraphicOverlay) this.setCustomView.findViewById(setTvRemark.write.faceOverlay);
            this.setGroupDividerEnabled = new CaptureFragment$MediaBrowserCompat$ItemReceiver(this, (long) (this.MediaSessionCompat$QueueItem * 1000));
            Log.i("Timer", String.valueOf(this.MediaSessionCompat$QueueItem));
            PreferenceManager.getDefaultSharedPreferences(this.setChecked);
            this.ActionBarContainer = (TextView) this.setCustomView.findViewById(setTvRemark.write.capture_fragment_txt_countdown);
            BitmapFactory.decodeResource(getResources(), setTvRemark.read.flashon);
            BitmapFactory.decodeResource(getResources(), setTvRemark.read.flash);
            this.MediaBrowserCompat$CustomActionResultReceiver = (ImageView) this.setCustomView.findViewById(setTvRemark.write.captureBtn);
            this.setCustomView.findViewById(setTvRemark.write.switchCamBtn);
            this.setCustomView.findViewById(setTvRemark.write.settingsBtn);
            this.setPadding = (ImageView) this.setCustomView.findViewById(setTvRemark.write.mediaimage);
            getActivity().getApplicationContext();
            this.MediaBrowserCompat$MediaItem = new AlertDialog.Builder(this.setChecked).setTitle("Error!").setPositiveButton("OK", (DialogInterface.OnClickListener) null).setCancelable(true).create();
            this.setTabContainer = new TextToSpeech(getActivity(), this);
            if (setRecipients.MediaMetadataCompat().f5825x50fd9e4a > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(setRecipients.MediaMetadataCompat().f5825x50fd9e4a));
                sb.append(" times");
                this.f6396x50fd9e4a = sb.toString();
            }
            if (setRecipients.MediaMetadataCompat().MediaBrowserCompat$SearchResultReceiver) {
                this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(8);
            }
            if (setRecipients.MediaMetadataCompat().PlaybackStateCompat$CustomAction) {
                this.setPadding.setVisibility(0);
            }
            if (setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.face_first || (setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.challenge_first && !setRecipients.MediaMetadataCompat().AppCompatDialogFragment)) {
                this.ActionBarContainer.setText("Please look at the camera");
            }
            this.setTitle = (ImageView) this.setCustomView.findViewById(setTvRemark.write.noFaceFoundImageView);
            this.MediaDescriptionCompat = new read();
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener(new Object() {
                public final void onClick(View view) {
                    Log.i(CaptureFragment.MediaBrowserCompat$ItemReceiver, "ImageBtn Call On Click");
                    if (CaptureFragment.this.MediaBrowserCompat$CustomActionResultReceiver.getVisibility() == 0) {
                        CaptureFragment.this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(8);
                    }
                    boolean unused = CaptureFragment.this.MenuItemImpl = true;
                    if (setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.challenge_first) {
                        Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "captureImgBtn Challenge");
                        CaptureFragment.this.setChecked.runOnUiThread(this);
                    } else if (!setRecipients.MediaMetadataCompat().AppCompatDialogFragment) {
                        CaptureFragment captureFragment = CaptureFragment.this;
                        Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "facefirst captureImage");
                        captureFragment.MediaBrowserCompat$SearchResultReceiver.takePicture((CameraSource.ShutterCallback) null, new CameraSource.PictureCallback() {
                            public final void onPictureTaken(byte[] bArr) {
                                int i;
                                try {
                                    try {
                                        i = ((typeFromBitmap) AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((InputStream) new ByteArrayInputStream(bArr), -1).write(typeFromBitmap.class)).write();
                                    } catch (Exception e) {
                                        Log.i("io error", e.toString());
                                        e.printStackTrace();
                                        i = 0;
                                    }
                                    String MediaBrowserCompat$CustomActionResultReceiver2 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(" Orientation facefirst capture(captureImage) ");
                                    sb.append(String.valueOf(i));
                                    Log.i(MediaBrowserCompat$CustomActionResultReceiver2, sb.toString());
                                    Matrix matrix = new Matrix();
                                    switch (i) {
                                        case 2:
                                            matrix.postScale(-1.0f, 1.0f);
                                            break;
                                        case 3:
                                            matrix.postRotate(-180.0f);
                                            break;
                                        case 4:
                                            matrix.postScale(1.0f, -1.0f);
                                            break;
                                        case 5:
                                            matrix.postRotate(90.0f);
                                            matrix.postScale(-1.0f, 1.0f);
                                            break;
                                        case 6:
                                            matrix.postRotate(-90.0f);
                                            matrix.postScale(-1.0f, 1.0f);
                                            break;
                                        case 7:
                                            matrix.postRotate(-90.0f);
                                            matrix.postScale(-1.0f, 1.0f);
                                            break;
                                        case 8:
                                            matrix.postRotate(-90.0f);
                                            break;
                                    }
                                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                                    String MediaBrowserCompat$CustomActionResultReceiver3 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(" getConfig from Camera2222 ");
                                    sb2.append(createBitmap.getConfig());
                                    Log.e(MediaBrowserCompat$CustomActionResultReceiver3, sb2.toString());
                                    ((ePIDMainActivity) CaptureFragment.this.setChecked).IconCompatParcelizer(createBitmap, ePIDMainActivity.write, (setQuestionMark) null);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        });
                    } else if (CaptureFragment.this.ExpandedMenuView) {
                        boolean unused2 = CaptureFragment.this.ExpandedMenuView = false;
                        CaptureFragment.this.ActionBarContainer.setText("Please look at the camera");
                        new Thread() {
                            public final void run() {
                                super.run();
                                try {
                                    CaptureFragment.this.read();
                                    CaptureFragment.this.setTitle.post(new Runnable() {
                                        public final void run() {
                                            CaptureFragment.this.setTitle.setVisibility(8);
                                        }
                                    });
                                    sleep(1000);
                                    CaptureFragment captureFragment = CaptureFragment.this;
                                    Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "facefirst captureImage");
                                    captureFragment.MediaBrowserCompat$SearchResultReceiver.takePicture((CameraSource.ShutterCallback) null, new CameraSource.PictureCallback() {
                                        public final void onPictureTaken(byte[] bArr) {
                                            int i;
                                            try {
                                                try {
                                                    i = ((typeFromBitmap) AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((InputStream) new ByteArrayInputStream(bArr), -1).write(typeFromBitmap.class)).write();
                                                } catch (Exception e) {
                                                    Log.i("io error", e.toString());
                                                    e.printStackTrace();
                                                    i = 0;
                                                }
                                                String MediaBrowserCompat$CustomActionResultReceiver = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(" Orientation facefirst capture(captureImage) ");
                                                sb.append(String.valueOf(i));
                                                Log.i(MediaBrowserCompat$CustomActionResultReceiver, sb.toString());
                                                Matrix matrix = new Matrix();
                                                switch (i) {
                                                    case 2:
                                                        matrix.postScale(-1.0f, 1.0f);
                                                        break;
                                                    case 3:
                                                        matrix.postRotate(-180.0f);
                                                        break;
                                                    case 4:
                                                        matrix.postScale(1.0f, -1.0f);
                                                        break;
                                                    case 5:
                                                        matrix.postRotate(90.0f);
                                                        matrix.postScale(-1.0f, 1.0f);
                                                        break;
                                                    case 6:
                                                        matrix.postRotate(-90.0f);
                                                        matrix.postScale(-1.0f, 1.0f);
                                                        break;
                                                    case 7:
                                                        matrix.postRotate(-90.0f);
                                                        matrix.postScale(-1.0f, 1.0f);
                                                        break;
                                                    case 8:
                                                        matrix.postRotate(-90.0f);
                                                        break;
                                                }
                                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                                                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                                                String MediaBrowserCompat$CustomActionResultReceiver2 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(" getConfig from Camera2222 ");
                                                sb2.append(createBitmap.getConfig());
                                                Log.e(MediaBrowserCompat$CustomActionResultReceiver2, sb2.toString());
                                                SparseArray detect = new FaceDetector.Builder(setRecipients.MediaMetadataCompat().MediaDescriptionCompat).setLandmarkType(1).setClassificationType(1).setTrackingEnabled(true).setMode(1).build().detect(new Frame.Builder().setBitmap(createBitmap).build());
                                                String MediaBrowserCompat$CustomActionResultReceiver3 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append(">>>>++ facesize() = ");
                                                sb3.append(detect.size());
                                                Log.d(MediaBrowserCompat$CustomActionResultReceiver3, sb3.toString());
                                                if (detect.size() > 0) {
                                                    String MediaBrowserCompat$CustomActionResultReceiver4 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                                    StringBuilder sb4 = new StringBuilder();
                                                    sb4.append("faces.size() = ");
                                                    sb4.append(detect.size());
                                                    Log.d(MediaBrowserCompat$CustomActionResultReceiver4, sb4.toString());
                                                    CaptureFragment.MediaBrowserCompat$CustomActionResultReceiver(CaptureFragment.this, detect, createBitmap);
                                                    if (detect.size() > 1) {
                                                        boolean unused = CaptureFragment.this.ExpandedMenuView = true;
                                                        setRecipients.MediaMetadataCompat().Keep = null;
                                                        if (CaptureFragment.this.MediaBrowserCompat$SearchResultReceiver != null) {
                                                            CameraSource cameraSource = CaptureFragment.this.setItemInvoker.MediaBrowserCompat$ItemReceiver;
                                                            if (cameraSource != null) {
                                                                cameraSource.stop();
                                                            }
                                                            boolean unused2 = CaptureFragment.this.AppCompatViewInflater = true;
                                                            CaptureFragment.this.setTitle.setVisibility(0);
                                                            CaptureFragment.this.setTitle.setImageBitmap(createBitmap);
                                                        }
                                                        CaptureFragment.this.MediaBrowserCompat$MediaItem.setMessage("More than one face was detected");
                                                        CaptureFragment.this.MediaBrowserCompat$MediaItem.show();
                                                        CaptureFragment.this.ActionBarContainer.setText("");
                                                        CaptureFragment.this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "no face found");
                                                boolean unused3 = CaptureFragment.this.ExpandedMenuView = true;
                                                setRecipients.MediaMetadataCompat().Keep = null;
                                                if (CaptureFragment.this.MediaBrowserCompat$SearchResultReceiver != null) {
                                                    Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "mCameraSource release");
                                                    CameraSource cameraSource2 = CaptureFragment.this.setItemInvoker.MediaBrowserCompat$ItemReceiver;
                                                    if (cameraSource2 != null) {
                                                        cameraSource2.stop();
                                                    }
                                                    boolean unused4 = CaptureFragment.this.AppCompatViewInflater = true;
                                                    CaptureFragment.this.setTitle.setVisibility(0);
                                                    CaptureFragment.this.setTitle.setImageBitmap(createBitmap);
                                                }
                                                CaptureFragment.this.ActionBarContainer.setText("");
                                                CaptureFragment.this.MediaBrowserCompat$MediaItem.setMessage("No face was detected");
                                                CaptureFragment.this.MediaBrowserCompat$MediaItem.show();
                                                CaptureFragment.this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                                            } catch (Exception e2) {
                                                e2.printStackTrace();
                                            }
                                        }
                                    });
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }.start();
                    } else {
                        Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "FaceFirstChallenge");
                        CaptureFragment captureFragment2 = CaptureFragment.this;
                        Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "facefirst captureImage");
                        captureFragment2.MediaBrowserCompat$SearchResultReceiver.takePicture((CameraSource.ShutterCallback) null, new CameraSource.PictureCallback() {
                            public final void onPictureTaken(byte[] bArr) {
                                int i;
                                try {
                                    try {
                                        i = ((typeFromBitmap) AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((InputStream) new ByteArrayInputStream(bArr), -1).write(typeFromBitmap.class)).write();
                                    } catch (Exception e) {
                                        Log.i("io error", e.toString());
                                        e.printStackTrace();
                                        i = 0;
                                    }
                                    String MediaBrowserCompat$CustomActionResultReceiver = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(" Orientation facefirst capture(captureImage) ");
                                    sb.append(String.valueOf(i));
                                    Log.i(MediaBrowserCompat$CustomActionResultReceiver, sb.toString());
                                    Matrix matrix = new Matrix();
                                    switch (i) {
                                        case 2:
                                            matrix.postScale(-1.0f, 1.0f);
                                            break;
                                        case 3:
                                            matrix.postRotate(-180.0f);
                                            break;
                                        case 4:
                                            matrix.postScale(1.0f, -1.0f);
                                            break;
                                        case 5:
                                            matrix.postRotate(90.0f);
                                            matrix.postScale(-1.0f, 1.0f);
                                            break;
                                        case 6:
                                            matrix.postRotate(-90.0f);
                                            matrix.postScale(-1.0f, 1.0f);
                                            break;
                                        case 7:
                                            matrix.postRotate(-90.0f);
                                            matrix.postScale(-1.0f, 1.0f);
                                            break;
                                        case 8:
                                            matrix.postRotate(-90.0f);
                                            break;
                                    }
                                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                                    String MediaBrowserCompat$CustomActionResultReceiver2 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(" getConfig from Camera2222 ");
                                    sb2.append(createBitmap.getConfig());
                                    Log.e(MediaBrowserCompat$CustomActionResultReceiver2, sb2.toString());
                                    SparseArray detect = new FaceDetector.Builder(setRecipients.MediaMetadataCompat().MediaDescriptionCompat).setLandmarkType(1).setClassificationType(1).setTrackingEnabled(true).setMode(1).build().detect(new Frame.Builder().setBitmap(createBitmap).build());
                                    String MediaBrowserCompat$CustomActionResultReceiver3 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(">>>>++ facesize() = ");
                                    sb3.append(detect.size());
                                    Log.d(MediaBrowserCompat$CustomActionResultReceiver3, sb3.toString());
                                    if (detect.size() > 0) {
                                        String MediaBrowserCompat$CustomActionResultReceiver4 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("faces.size() = ");
                                        sb4.append(detect.size());
                                        Log.d(MediaBrowserCompat$CustomActionResultReceiver4, sb4.toString());
                                        CaptureFragment.MediaBrowserCompat$CustomActionResultReceiver(CaptureFragment.this, detect, createBitmap);
                                        if (detect.size() > 1) {
                                            boolean unused = CaptureFragment.this.ExpandedMenuView = true;
                                            setRecipients.MediaMetadataCompat().Keep = null;
                                            if (CaptureFragment.this.MediaBrowserCompat$SearchResultReceiver != null) {
                                                CameraSource cameraSource = CaptureFragment.this.setItemInvoker.MediaBrowserCompat$ItemReceiver;
                                                if (cameraSource != null) {
                                                    cameraSource.stop();
                                                }
                                                boolean unused2 = CaptureFragment.this.AppCompatViewInflater = true;
                                                CaptureFragment.this.setTitle.setVisibility(0);
                                                CaptureFragment.this.setTitle.setImageBitmap(createBitmap);
                                            }
                                            CaptureFragment.this.MediaBrowserCompat$MediaItem.setMessage("More than one face was detected");
                                            CaptureFragment.this.MediaBrowserCompat$MediaItem.show();
                                            CaptureFragment.this.ActionBarContainer.setText("");
                                            CaptureFragment.this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                                            return;
                                        }
                                        return;
                                    }
                                    Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "no face found");
                                    boolean unused3 = CaptureFragment.this.ExpandedMenuView = true;
                                    setRecipients.MediaMetadataCompat().Keep = null;
                                    if (CaptureFragment.this.MediaBrowserCompat$SearchResultReceiver != null) {
                                        Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "mCameraSource release");
                                        CameraSource cameraSource2 = CaptureFragment.this.setItemInvoker.MediaBrowserCompat$ItemReceiver;
                                        if (cameraSource2 != null) {
                                            cameraSource2.stop();
                                        }
                                        boolean unused4 = CaptureFragment.this.AppCompatViewInflater = true;
                                        CaptureFragment.this.setTitle.setVisibility(0);
                                        CaptureFragment.this.setTitle.setImageBitmap(createBitmap);
                                    }
                                    CaptureFragment.this.ActionBarContainer.setText("");
                                    CaptureFragment.this.MediaBrowserCompat$MediaItem.setMessage("No face was detected");
                                    CaptureFragment.this.MediaBrowserCompat$MediaItem.show();
                                    CaptureFragment.this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        });
                    }
                }

                public final void run() {
                    setRecipients.MediaMetadataCompat();
                    if (setRecipients.MediaMetadataCompat().AppCompatDialogFragment) {
                        Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "captureImgBtn FaceSpoof True");
                        CaptureFragment.this.MediaBrowserCompat$ItemReceiver();
                        return;
                    }
                    Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "captureImgBtn FaceSpoof False");
                    CaptureFragment captureFragment = CaptureFragment.this;
                    Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "facefirst captureImage");
                    captureFragment.MediaBrowserCompat$SearchResultReceiver.takePicture((CameraSource.ShutterCallback) null, new CameraSource.PictureCallback() {
                        public final void onPictureTaken(byte[] bArr) {
                            int i;
                            try {
                                try {
                                    i = ((typeFromBitmap) AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((InputStream) new ByteArrayInputStream(bArr), -1).write(typeFromBitmap.class)).write();
                                } catch (Exception e) {
                                    Log.i("io error", e.toString());
                                    e.printStackTrace();
                                    i = 0;
                                }
                                String MediaBrowserCompat$CustomActionResultReceiver2 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                StringBuilder sb = new StringBuilder();
                                sb.append(" Orientation facefirst capture(captureImage) ");
                                sb.append(String.valueOf(i));
                                Log.i(MediaBrowserCompat$CustomActionResultReceiver2, sb.toString());
                                Matrix matrix = new Matrix();
                                switch (i) {
                                    case 2:
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case 3:
                                        matrix.postRotate(-180.0f);
                                        break;
                                    case 4:
                                        matrix.postScale(1.0f, -1.0f);
                                        break;
                                    case 5:
                                        matrix.postRotate(90.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case 6:
                                        matrix.postRotate(-90.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case 7:
                                        matrix.postRotate(-90.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case 8:
                                        matrix.postRotate(-90.0f);
                                        break;
                                }
                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                                String MediaBrowserCompat$CustomActionResultReceiver3 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(" getConfig from Camera2222 ");
                                sb2.append(createBitmap.getConfig());
                                Log.e(MediaBrowserCompat$CustomActionResultReceiver3, sb2.toString());
                                ((ePIDMainActivity) CaptureFragment.this.setChecked).IconCompatParcelizer(createBitmap, ePIDMainActivity.write, (setQuestionMark) null);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    });
                }
            });
        }
        if (AppCompatRatingBar.MediaBrowserCompat$ItemReceiver(this.setChecked, "android.permission.CAMERA") == 0) {
            IconCompatParcelizer();
        } else {
            Log.w(MediaBrowserCompat$ItemReceiver, "Camera permission is not granted. Requesting permission");
            final String[] strArr = {"android.permission.CAMERA"};
            if (!AppCompatRatingBar.write(this.setChecked, "android.permission.CAMERA")) {
                AppCompatRatingBar.write(this.setChecked, strArr, 2);
            } else {
                new View.OnClickListener() {
                    public final void onClick(View view) {
                        AppCompatRatingBar.write(CaptureFragment.this.setChecked, strArr, 2);
                    }
                };
                Toast.makeText(this.setChecked.getApplicationContext(), setTvRemark.IconCompatParcelizer.permission_camera_rationale, 0).show();
            }
        }
        if (setRecipients.MediaMetadataCompat().MediaBrowserCompat$SearchResultReceiver && setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.challenge_first && setRecipients.MediaMetadataCompat().AppCompatDialogFragment) {
            new CountDownTimer() {
                public final void onTick(long j) {
                }

                public final void onFinish() {
                    if (CaptureFragment.this.MediaBrowserCompat$SearchResultReceiver != null) {
                        CaptureFragment.this.MediaBrowserCompat$CustomActionResultReceiver.callOnClick();
                    }
                }
            }.start();
        }
        return this.setCustomView;
    }

    public void onInit(int i) {
        this.setTabContainer.setLanguage(Locale.UK);
        if ((setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.face_first || (setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.challenge_first && !setRecipients.MediaMetadataCompat().AppCompatDialogFragment)) && setRecipients.MediaMetadataCompat().setContentView) {
            this.setTabContainer.speak("Please Look at the camera", 0, (HashMap) null);
        }
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$ItemReceiver() {
        synchronized (this) {
            this.ListMenuItemView = this.setForceShowIcon.nextInt(setRecipients.MediaMetadataCompat().IconCompatParcelizer.size());
            String str = MediaBrowserCompat$ItemReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("random challenge size ");
            sb.append(setRecipients.MediaMetadataCompat().IconCompatParcelizer.size());
            Log.i(str, sb.toString());
            Log.d(MediaBrowserCompat$ItemReceiver, "Synchronized challenge");
            if (this.AppCompatActivity < 0) {
                this.AppCompatActivity = this.ListMenuItemView;
            } else {
                while (this.AppCompatActivity == this.ListMenuItemView) {
                    this.ListMenuItemView = this.setForceShowIcon.nextInt(setRecipients.MediaMetadataCompat().IconCompatParcelizer.size());
                }
                this.AppCompatActivity = this.ListMenuItemView;
            }
            if (this.AppCompatActivity >= 0) {
                if (setRecipients.MediaMetadataCompat().PlaybackStateCompat$CustomAction) {
                    if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.blink) {
                        this.setPadding.setImageDrawable(this.setChecked.getResources().getDrawable(setTvRemark.read.closebotheyes));
                    }
                    if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.close_left_eye) {
                        this.setPadding.setImageDrawable(this.setChecked.getResources().getDrawable(setTvRemark.read.closelefteye));
                    }
                    if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.close_right_eye) {
                        this.setPadding.setImageDrawable(this.setChecked.getResources().getDrawable(setTvRemark.read.closerighteye));
                    }
                    if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.smile) {
                        this.setPadding.setImageDrawable(this.setChecked.getResources().getDrawable(setTvRemark.read.smile));
                    }
                    if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.turn_head_left) {
                        this.setPadding.setImageDrawable(this.setChecked.getResources().getDrawable(setTvRemark.read.tilttoleft));
                    }
                    if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.turn_head_right) {
                        this.setPadding.setImageDrawable(this.setChecked.getResources().getDrawable(setTvRemark.read.tilttoright));
                    }
                }
                if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.blink) {
                    TextView textView = this.ActionBarContainer;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Blink ");
                    sb2.append(this.f6396x50fd9e4a);
                    textView.setText(sb2.toString());
                }
                if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.close_left_eye) {
                    this.ActionBarContainer.setText("Close left eye");
                }
                if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.close_right_eye) {
                    this.ActionBarContainer.setText("Close right eye");
                }
                if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.smile) {
                    this.ActionBarContainer.setText("Smile with teeth showing");
                }
                if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.turn_head_left) {
                    this.ActionBarContainer.setText("Turn head to the left");
                }
                if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(this.AppCompatActivity) == setRecipients.write.turn_head_right) {
                    this.ActionBarContainer.setText("Turn head to the right");
                }
            }
            String str2 = MediaBrowserCompat$ItemReceiver;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("random Challenge OnChallenge1.");
            sb3.append(this.AppCompatActivity);
            Log.d(str2, sb3.toString());
            this.MenuItemImpl = true;
            MediaBrowserCompat$ItemReceiver(this.AppCompatActivity);
        }
    }

    private void MediaBrowserCompat$ItemReceiver(int i) {
        if (getActivity() != null) {
            Log.d(MediaBrowserCompat$ItemReceiver, "media player start");
            Log.i("random Challenge play2.", String.valueOf(i));
            if (setRecipients.MediaMetadataCompat().setContentView) {
                this.setTabContainer.speak(setRecipients.MediaMetadataCompat().IconCompatParcelizer.get(i).toString(), 0, (HashMap) null);
            }
            Log.d(MediaBrowserCompat$ItemReceiver, "count timer start");
            this.setGroupDividerEnabled.start();
        }
    }

    private void read(int i) {
        String str = MediaBrowserCompat$ItemReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append(" Call actionChallenge mCountChallenge ");
        sb.append(String.valueOf(this.setPopupCallback));
        sb.append(" challenge ");
        sb.append(String.valueOf(i));
        Log.i(str, sb.toString());
        String str2 = MediaBrowserCompat$ItemReceiver;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" Call actionChallenge repeatsuccessCount");
        sb2.append("0");
        Log.i(str2, sb2.toString());
        String str3 = MediaBrowserCompat$ItemReceiver;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(" Call actionChallenge statusChallenge1 ");
        sb3.append(this.AbsActionBarView);
        Log.e(str3, sb3.toString());
        PrintStream printStream = System.out;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(MediaBrowserCompat$ItemReceiver);
        sb4.append("statusChallenge1 = ");
        sb4.append(this.AbsActionBarView);
        printStream.println(sb4.toString());
        PrintStream printStream2 = System.out;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(MediaBrowserCompat$ItemReceiver);
        sb5.append("statusChallenge2 = ");
        sb5.append(this.setPrimaryBackground);
        printStream2.println(sb5.toString());
        this.setStackedBackground = false;
        if (!this.AbsActionBarView) {
            this.AbsActionBarView = true;
            if (setRecipients.MediaMetadataCompat().setContentView) {
                this.setTabContainer.speak("OK", 0, (HashMap) null);
            }
            this.setGroupDividerEnabled.cancel();
            this.MenuItemImpl = false;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(MediaBrowserCompat$ItemReceiver);
            sb6.append(" 1st Challeng1");
            Log.e(sb6.toString(), "dd");
        } else if (!this.setPrimaryBackground) {
            this.setPrimaryBackground = true;
            if (setRecipients.MediaMetadataCompat().setContentView) {
                this.setTabContainer.speak("OK", 0, (HashMap) null);
            }
            this.setGroupDividerEnabled.cancel();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(MediaBrowserCompat$ItemReceiver);
            sb7.append("2nd Challeng2");
            Log.e(sb7.toString(), "dd");
        }
        PrintStream printStream3 = System.out;
        StringBuilder sb8 = new StringBuilder();
        sb8.append(MediaBrowserCompat$ItemReceiver);
        sb8.append("statusChallenge1 = ");
        sb8.append(this.AbsActionBarView);
        printStream3.println(sb8.toString());
        PrintStream printStream4 = System.out;
        StringBuilder sb9 = new StringBuilder();
        sb9.append(MediaBrowserCompat$ItemReceiver);
        sb9.append("statusChallenge2 = ");
        sb9.append(this.setPrimaryBackground);
        printStream4.println(sb9.toString());
        String str4 = MediaBrowserCompat$ItemReceiver;
        StringBuilder sb10 = new StringBuilder();
        sb10.append(" Call actionChallenge startChallenge ");
        sb10.append(this.MenuItemImpl);
        Log.e(str4, sb10.toString());
    }

    public void onDestroy() {
        super.onDestroy();
        TextToSpeech textToSpeech = this.setTabContainer;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
        }
        AlertDialog alertDialog = this.MediaBrowserCompat$MediaItem;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        CameraSource cameraSource = this.MediaBrowserCompat$SearchResultReceiver;
        if (cameraSource != null) {
            cameraSource.release();
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 2) {
            String str = MediaBrowserCompat$ItemReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("Got unexpected permission result: ");
            sb.append(i);
            Log.d(str, sb.toString());
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else if (iArr.length == 0 || iArr[0] != 0) {
            String str2 = MediaBrowserCompat$ItemReceiver;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Permission not granted: results len = ");
            sb2.append(iArr.length);
            sb2.append(" Result code = ");
            sb2.append(iArr.length > 0 ? Integer.valueOf(iArr[0]) : "(empty)");
            Log.e(str2, sb2.toString());
            new AlertDialog.Builder(getActivity()).setTitle("ePID Client Demo").setMessage(setTvRemark.IconCompatParcelizer.no_camera_permission).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    CaptureFragment.this.getActivity().finish();
                }
            }).show();
        } else {
            Log.d(MediaBrowserCompat$ItemReceiver, "Camera permission granted - initialize the camera source");
            IconCompatParcelizer();
        }
    }

    private void IconCompatParcelizer() {
        Log.d(MediaBrowserCompat$ItemReceiver, "create CameraSource");
        Context context = setRecipients.MediaMetadataCompat().MediaDescriptionCompat;
        DocumentsUploadedSectionCustomView_ViewBinding documentsUploadedSectionCustomView_ViewBinding = new DocumentsUploadedSectionCustomView_ViewBinding(new FaceDetector.Builder(context).setClassificationType(1).setMode(1).setProminentFaceOnly(true).build());
        this.RatingCompat = documentsUploadedSectionCustomView_ViewBinding;
        documentsUploadedSectionCustomView_ViewBinding.setProcessor(new LargestFaceFocusingProcessor.Builder(documentsUploadedSectionCustomView_ViewBinding, new IconCompatParcelizer(this.setShortcut)).build());
        if (!this.RatingCompat.isOperational()) {
            Log.w(MediaBrowserCompat$ItemReceiver, "Face detector dependencies are not yet available.");
        }
        this.MediaBrowserCompat$SearchResultReceiver = new CameraSource.Builder(context, this.RatingCompat).setRequestedPreviewSize(1920, 1080).setFacing(1).setRequestedFps(30.0f).build();
    }

    /* renamed from: sg.nec.com.epid_sdk_master.fragment.CaptureFragment$IconCompatParcelizer */
    public class IconCompatParcelizer extends Tracker<Face> {
        private setAvatar MediaBrowserCompat$CustomActionResultReceiver;
        private GraphicOverlay write;

        public final /* bridge */ /* synthetic */ void onNewItem(int i, Object obj) {
        }

        public final /* synthetic */ void onUpdate(Detector.Detections detections, Object obj) {
            Face face = (Face) obj;
            GraphicOverlay graphicOverlay = this.write;
            setAvatar setavatar = this.MediaBrowserCompat$CustomActionResultReceiver;
            synchronized (graphicOverlay.IconCompatParcelizer) {
                graphicOverlay.MediaBrowserCompat$CustomActionResultReceiver.add(setavatar);
            }
            graphicOverlay.postInvalidate();
            setAvatar setavatar2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            setavatar2.MediaBrowserCompat$CustomActionResultReceiver = face;
            setavatar2.IconCompatParcelizer.postInvalidate();
            if (((double) face.getIsRightEyeOpenProbability()) >= 0.8d) {
                face.getIsLeftEyeOpenProbability();
            }
            String MediaBrowserCompat$CustomActionResultReceiver2 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("startChallenge onUpdate");
            sb.append(CaptureFragment.this.MenuItemImpl);
            Log.e(MediaBrowserCompat$CustomActionResultReceiver2, sb.toString());
            String MediaBrowserCompat$CustomActionResultReceiver3 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" isFinishCaptureAutomaticFaceFirst ");
            setRecipients.MediaMetadataCompat();
            sb2.append("false");
            Log.e(MediaBrowserCompat$CustomActionResultReceiver3, sb2.toString());
            if (CaptureFragment.this.MenuItemImpl) {
                String MediaBrowserCompat$CustomActionResultReceiver4 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("firstChallenge before click play button ");
                sb3.append(CaptureFragment.this.AppCompatActivity);
                Log.d(MediaBrowserCompat$CustomActionResultReceiver4, sb3.toString());
                String MediaBrowserCompat$CustomActionResultReceiver5 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("face.getEulerY() = ");
                sb4.append(face.getEulerY());
                Log.d(MediaBrowserCompat$CustomActionResultReceiver5, sb4.toString());
                if (CaptureFragment.this.AppCompatActivity >= 0) {
                    CaptureFragment captureFragment = CaptureFragment.this;
                    CaptureFragment.MediaBrowserCompat$ItemReceiver(captureFragment, face, captureFragment.AppCompatActivity);
                    Log.i("random Challenge Track3", String.valueOf(CaptureFragment.this.AppCompatActivity));
                }
            } else if (setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.face_first) {
                if (setRecipients.MediaMetadataCompat().MediaBrowserCompat$SearchResultReceiver) {
                    Log.i(CaptureFragment.MediaBrowserCompat$ItemReceiver, " start capture 01");
                    if (((double) face.getIsLeftEyeOpenProbability()) >= 0.6d && ((double) face.getIsRightEyeOpenProbability()) >= 0.6d) {
                        CaptureFragment.this.setChecked.runOnUiThread(new Runnable() {
                            public final void run() {
                                CaptureFragment.this.ActionBarContainer.setText("");
                            }
                        });
                        String MediaBrowserCompat$CustomActionResultReceiver6 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(" MyTarckerOnUpdate");
                        sb5.append(face.getIsLeftEyeOpenProbability());
                        sb5.append(" ");
                        sb5.append(face.getIsRightEyeOpenProbability());
                        Log.i(MediaBrowserCompat$CustomActionResultReceiver6, sb5.toString());
                        CaptureFragment.this.MediaBrowserCompat$CustomActionResultReceiver.callOnClick();
                    }
                }
            } else if (!setRecipients.MediaMetadataCompat().MediaBrowserCompat$SearchResultReceiver || setRecipients.MediaMetadataCompat().RatingCompat != setRecipients.IconCompatParcelizer.challenge_first || setRecipients.MediaMetadataCompat().AppCompatDialogFragment) {
                if (setRecipients.MediaMetadataCompat().MediaBrowserCompat$SearchResultReceiver && setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.challenge_first && setRecipients.MediaMetadataCompat().AppCompatDialogFragment && CaptureFragment.this.AppCompatDelegateImpl$ListMenuDecorView && ((double) face.getIsLeftEyeOpenProbability()) >= 0.6d && ((double) face.getIsRightEyeOpenProbability()) >= 0.6d && !CaptureFragment.this.setExpandedFormat) {
                    String MediaBrowserCompat$CustomActionResultReceiver7 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(" CaptureAutomatic after challenge first success");
                    sb6.append(face.getIsLeftEyeOpenProbability());
                    sb6.append(" ");
                    sb6.append(face.getIsRightEyeOpenProbability());
                    Log.e(MediaBrowserCompat$CustomActionResultReceiver7, sb6.toString());
                    boolean unused = CaptureFragment.this.setExpandedFormat = true;
                    boolean unused2 = CaptureFragment.this.AppCompatDelegateImpl$ListMenuDecorView = false;
                    CaptureFragment.read(CaptureFragment.this);
                }
            } else if (((double) face.getIsLeftEyeOpenProbability()) >= 0.6d && ((double) face.getIsRightEyeOpenProbability()) >= 0.6d) {
                CaptureFragment.this.setChecked.runOnUiThread(new Runnable() {
                    public final void run() {
                        CaptureFragment.this.ActionBarContainer.setText("");
                    }
                });
                if (!CaptureFragment.this.setExpandedFormat) {
                    String MediaBrowserCompat$CustomActionResultReceiver8 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(" MyTarckerOnUpdate");
                    sb7.append(face.getIsLeftEyeOpenProbability());
                    sb7.append(" ");
                    sb7.append(face.getIsRightEyeOpenProbability());
                    Log.i(MediaBrowserCompat$CustomActionResultReceiver8, sb7.toString());
                    boolean unused3 = CaptureFragment.this.setExpandedFormat = true;
                    CaptureFragment captureFragment2 = CaptureFragment.this;
                    Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "facefirst captureImage");
                    captureFragment2.MediaBrowserCompat$SearchResultReceiver.takePicture((CameraSource.ShutterCallback) null, new CameraSource.PictureCallback() {
                        public final void onPictureTaken(byte[] bArr) {
                            int i;
                            try {
                                try {
                                    i = ((typeFromBitmap) AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((InputStream) new ByteArrayInputStream(bArr), -1).write(typeFromBitmap.class)).write();
                                } catch (Exception e) {
                                    Log.i("io error", e.toString());
                                    e.printStackTrace();
                                    i = 0;
                                }
                                String MediaBrowserCompat$CustomActionResultReceiver2 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                StringBuilder sb = new StringBuilder();
                                sb.append(" Orientation facefirst capture(captureImage) ");
                                sb.append(String.valueOf(i));
                                Log.i(MediaBrowserCompat$CustomActionResultReceiver2, sb.toString());
                                Matrix matrix = new Matrix();
                                switch (i) {
                                    case 2:
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case 3:
                                        matrix.postRotate(-180.0f);
                                        break;
                                    case 4:
                                        matrix.postScale(1.0f, -1.0f);
                                        break;
                                    case 5:
                                        matrix.postRotate(90.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case 6:
                                        matrix.postRotate(-90.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case 7:
                                        matrix.postRotate(-90.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case 8:
                                        matrix.postRotate(-90.0f);
                                        break;
                                }
                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                                String MediaBrowserCompat$CustomActionResultReceiver3 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(" getConfig from Camera2222 ");
                                sb2.append(createBitmap.getConfig());
                                Log.e(MediaBrowserCompat$CustomActionResultReceiver3, sb2.toString());
                                ((ePIDMainActivity) CaptureFragment.this.setChecked).IconCompatParcelizer(createBitmap, ePIDMainActivity.write, (setQuestionMark) null);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    });
                }
            }
        }

        IconCompatParcelizer(GraphicOverlay graphicOverlay) {
            this.write = graphicOverlay;
            this.MediaBrowserCompat$CustomActionResultReceiver = new setAvatar(graphicOverlay);
        }

        public final void onMissing(Detector.Detections<Face> detections) {
            GraphicOverlay graphicOverlay = this.write;
            setAvatar setavatar = this.MediaBrowserCompat$CustomActionResultReceiver;
            synchronized (graphicOverlay.IconCompatParcelizer) {
                graphicOverlay.MediaBrowserCompat$CustomActionResultReceiver.remove(setavatar);
            }
            graphicOverlay.postInvalidate();
        }

        public final void onDone() {
            GraphicOverlay graphicOverlay = this.write;
            setAvatar setavatar = this.MediaBrowserCompat$CustomActionResultReceiver;
            synchronized (graphicOverlay.IconCompatParcelizer) {
                graphicOverlay.MediaBrowserCompat$CustomActionResultReceiver.remove(setavatar);
            }
            graphicOverlay.postInvalidate();
        }
    }

    public void onPause() {
        CameraSource cameraSource;
        TextToSpeech textToSpeech = this.setTabContainer;
        if (textToSpeech != null) {
            textToSpeech.stop();
            this.setTabContainer.shutdown();
        }
        CaptureFragment$MediaBrowserCompat$ItemReceiver captureFragment$MediaBrowserCompat$ItemReceiver = this.setGroupDividerEnabled;
        if (captureFragment$MediaBrowserCompat$ItemReceiver != null) {
            captureFragment$MediaBrowserCompat$ItemReceiver.cancel();
        }
        super.onPause();
        this.setChecked.setRequestedOrientation(10);
        CameraSourcePreview cameraSourcePreview = this.setItemInvoker;
        if (cameraSourcePreview != null && (cameraSource = cameraSourcePreview.MediaBrowserCompat$ItemReceiver) != null) {
            cameraSource.stop();
        }
    }

    public void onResume() {
        this.setChecked.setRequestedOrientation(1);
        super.onResume();
        Log.e(MediaBrowserCompat$ItemReceiver, "onresume");
        if (!this.AppCompatViewInflater) {
            read();
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.setChecked = activity;
    }

    /* access modifiers changed from: private */
    public void read() {
        Log.d(MediaBrowserCompat$ItemReceiver, "start CameraSource");
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(setRecipients.MediaMetadataCompat().MediaDescriptionCompat);
        if (isGooglePlayServicesAvailable != 0) {
            GoogleApiAvailability.getInstance().getErrorDialog(this.setChecked, isGooglePlayServicesAvailable, PlacesStatusCodes.USAGE_LIMIT_EXCEEDED).show();
        }
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            Log.e(MediaBrowserCompat$ItemReceiver, "camerasoure not null");
            try {
                this.setItemInvoker.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver, this.setShortcut);
            } catch (IOException e) {
                Log.e(MediaBrowserCompat$ItemReceiver, "Unable to start camera source.", e);
                this.MediaBrowserCompat$SearchResultReceiver.release();
                this.MediaBrowserCompat$SearchResultReceiver = null;
            }
        } else {
            Log.e(MediaBrowserCompat$ItemReceiver, "camerasoure null");
        }
    }

    /* renamed from: sg.nec.com.epid_sdk_master.fragment.CaptureFragment$read */
    class read extends AsyncTask<Void, Void, Void> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            super.onPostExecute((Void) obj);
        }

        read() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            Log.d("TestTask #", "doInBackground: entered, taskExecutionNumber = ");
            CaptureFragment.this.setChecked.runOnUiThread(new Runnable() {
                public final void run() {
                    String MediaBrowserCompat$CustomActionResultReceiver = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Image to submit server ");
                    sb.append(setRecipients.MediaMetadataCompat().Keep);
                    Log.e(MediaBrowserCompat$CustomActionResultReceiver, sb.toString());
                    new CustomRecipientsList_ViewBinding(CaptureFragment.this.setChecked, setRecipients.MediaMetadataCompat().Keep, setRecipients.MediaMetadataCompat().MediaSessionCompat$QueueItem).execute(new Void[0]);
                }
            });
            Log.d("TestTask #", "doInBackground: is about to finish, taskExecutionNumber = ");
            return null;
        }
    }

    static /* synthetic */ void read(CaptureFragment captureFragment) {
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append(MediaBrowserCompat$ItemReceiver);
        sb.append("Capture Image function");
        printStream.println(sb.toString());
        captureFragment.setIcon.sendEmptyMessage(100);
        if (setRecipients.MediaMetadataCompat().setContentView) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            captureFragment.setTabContainer.speak("Please Look at the camera", 0, (HashMap) null);
        }
    }

    static /* synthetic */ void write(CaptureFragment captureFragment, String str) {
        String str2 = MediaBrowserCompat$ItemReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("show alert error mActivity");
        sb.append(captureFragment.setChecked);
        Log.e(str2, sb.toString());
        Toast.makeText(captureFragment.setChecked, str, 0).show();
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(CaptureFragment captureFragment, SparseArray sparseArray, Bitmap bitmap) {
        CaptureFragment captureFragment2 = captureFragment;
        Bitmap bitmap2 = bitmap;
        for (int i = 0; i < sparseArray.size(); i++) {
            Face face = (Face) sparseArray.valueAt(i);
            for (Landmark next : face.getLandmarks()) {
                int type = next.getType();
                if (type == 0) {
                    next.getPosition();
                } else if (type == 4) {
                    PointF position = next.getPosition();
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append(">>>left Eye x = ");
                    sb.append(position.x);
                    printStream.println(sb.toString());
                    PrintStream printStream2 = System.out;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(">>>left Eye  y = ");
                    sb2.append(position.y);
                    printStream2.println(sb2.toString());
                    if (((double) captureFragment2.setCheckable) == 0.0d) {
                        captureFragment2.setCheckable = position.x;
                        captureFragment2.ActionMenuItemView = position.y;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(MediaBrowserCompat$ItemReceiver);
                        sb3.append("left eye position");
                        Log.e(sb3.toString(), String.valueOf(position));
                    }
                } else if (type == 10) {
                    PointF position2 = next.getPosition();
                    PrintStream printStream3 = System.out;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(">>>right Eye x = ");
                    sb4.append(position2.x);
                    printStream3.println(sb4.toString());
                    PrintStream printStream4 = System.out;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(">>>right Eye  y = ");
                    sb5.append(position2.y);
                    printStream4.println(sb5.toString());
                    if (((double) captureFragment2.setVisibility) == 0.0d) {
                        captureFragment2.setVisibility = position2.x;
                        captureFragment2.MenuItemWrapperICS$CollapsibleActionViewWrapper = position2.y;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(MediaBrowserCompat$ItemReceiver);
                        sb6.append("right eye position");
                        Log.e(sb6.toString(), String.valueOf(position2));
                    }
                }
            }
            if (sparseArray.size() == 1) {
                float isLeftEyeOpenProbability = face.getIsLeftEyeOpenProbability();
                float isRightEyeOpenProbability = face.getIsRightEyeOpenProbability();
                String str = MediaBrowserCompat$ItemReceiver;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(">>>>++leftEye = ");
                sb7.append(isLeftEyeOpenProbability);
                Log.d(str, sb7.toString());
                String str2 = MediaBrowserCompat$ItemReceiver;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(">>>>++rightEye = ");
                sb8.append(isRightEyeOpenProbability);
                Log.d(str2, sb8.toString());
                int i2 = (((double) isLeftEyeOpenProbability) > 0.3d ? 1 : (((double) isLeftEyeOpenProbability) == 0.3d ? 0 : -1));
                if (i2 < 0 && ((double) isRightEyeOpenProbability) < 0.3d) {
                    captureFragment2.ExpandedMenuView = true;
                    setRecipients.MediaMetadataCompat().Keep = null;
                    if (captureFragment2.MediaBrowserCompat$SearchResultReceiver != null) {
                        CameraSource cameraSource = captureFragment2.setItemInvoker.MediaBrowserCompat$ItemReceiver;
                        if (cameraSource != null) {
                            cameraSource.stop();
                        }
                        captureFragment2.AppCompatViewInflater = true;
                        captureFragment2.setTitle.setVisibility(0);
                        captureFragment2.setTitle.setImageBitmap(bitmap2);
                    }
                    captureFragment2.ActionBarContainer.setText("");
                    captureFragment2.MediaBrowserCompat$MediaItem.setMessage("Cannot recognize, Eyes closed!!!");
                    captureFragment2.MediaBrowserCompat$MediaItem.show();
                    captureFragment2.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                    return;
                } else if (i2 < 0) {
                    captureFragment2.ExpandedMenuView = true;
                    setRecipients.MediaMetadataCompat().Keep = null;
                    if (captureFragment2.MediaBrowserCompat$SearchResultReceiver != null) {
                        CameraSource cameraSource2 = captureFragment2.setItemInvoker.MediaBrowserCompat$ItemReceiver;
                        if (cameraSource2 != null) {
                            cameraSource2.stop();
                        }
                        captureFragment2.AppCompatViewInflater = true;
                        captureFragment2.setTitle.setVisibility(0);
                        captureFragment2.setTitle.setImageBitmap(bitmap2);
                    }
                    captureFragment2.ActionBarContainer.setText("");
                    captureFragment2.MediaBrowserCompat$MediaItem.setMessage("Cannot recognize, Left closed!!!");
                    captureFragment2.MediaBrowserCompat$MediaItem.show();
                    captureFragment2.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                    return;
                } else if (((double) isRightEyeOpenProbability) < 0.3d) {
                    captureFragment2.ExpandedMenuView = true;
                    setRecipients.MediaMetadataCompat().Keep = null;
                    if (captureFragment2.MediaBrowserCompat$SearchResultReceiver != null) {
                        CameraSource cameraSource3 = captureFragment2.setItemInvoker.MediaBrowserCompat$ItemReceiver;
                        if (cameraSource3 != null) {
                            cameraSource3.stop();
                        }
                        captureFragment2.AppCompatViewInflater = true;
                        captureFragment2.setTitle.setVisibility(0);
                        captureFragment2.setTitle.setImageBitmap(bitmap2);
                    }
                    captureFragment2.ActionBarContainer.setText("");
                    captureFragment2.MediaBrowserCompat$MediaItem.setMessage("Cannot recognize, Right closed!!!");
                    captureFragment2.MediaBrowserCompat$MediaItem.show();
                    captureFragment2.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                    return;
                } else {
                    double d = (double) captureFragment2.setCheckable;
                    if (d != 0.0d) {
                        double d2 = (double) captureFragment2.setVisibility;
                        if (d2 != 0.0d) {
                            double d3 = d - d2;
                            captureFragment2.setContentView = d3;
                            double d4 = d3 / 0.25d;
                            captureFragment2.ActionBarContextView = d4;
                            String str3 = "";
                            captureFragment2.AppCompatDialogFragment = d4 / 0.75d;
                            captureFragment2.setSplitBackground = (d4 - d3) / 2.0d;
                            String str4 = MediaBrowserCompat$ItemReceiver;
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(">>>>> leftEyeX ");
                            sb9.append((int) captureFragment2.setCheckable);
                            Log.d(str4, sb9.toString());
                            String str5 = MediaBrowserCompat$ItemReceiver;
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(">>>>> rightEyeX ");
                            sb10.append((int) captureFragment2.setVisibility);
                            Log.d(str5, sb10.toString());
                            String str6 = MediaBrowserCompat$ItemReceiver;
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(">>>>> d ");
                            sb11.append((int) captureFragment2.setContentView);
                            Log.d(str6, sb11.toString());
                            String str7 = MediaBrowserCompat$ItemReceiver;
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(">>>>> w  ");
                            sb12.append((int) captureFragment2.ActionBarContextView);
                            Log.d(str7, sb12.toString());
                            String str8 = MediaBrowserCompat$ItemReceiver;
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append(">>>>> top1  ");
                            sb13.append((int) captureFragment2.setSplitBackground);
                            Log.d(str8, sb13.toString());
                            captureFragment2.MediaSessionCompat$ResultReceiverWrapper = (captureFragment2.ActionBarContextView * 0.6d) + 1.0d;
                            String str9 = MediaBrowserCompat$ItemReceiver;
                            StringBuilder sb14 = new StringBuilder();
                            sb14.append(">>>>> bottom  ");
                            sb14.append((int) captureFragment2.MediaSessionCompat$ResultReceiverWrapper);
                            Log.d(str9, sb14.toString());
                            float f = captureFragment2.setVisibility;
                            float f2 = captureFragment2.setCheckable;
                            if (f < f2) {
                                captureFragment2.setTitleOptional = ((double) f) - captureFragment2.setSplitBackground;
                                String str10 = MediaBrowserCompat$ItemReceiver;
                                StringBuilder sb15 = new StringBuilder();
                                sb15.append("rightEyeX x1 ");
                                sb15.append(String.valueOf(captureFragment2.setTitleOptional));
                                Log.e(str10, sb15.toString());
                            } else if (f2 < f) {
                                captureFragment2.setTitleOptional = ((double) f2) - captureFragment2.setSplitBackground;
                                String str11 = MediaBrowserCompat$ItemReceiver;
                                StringBuilder sb16 = new StringBuilder();
                                sb16.append("leftEyeX x1 ");
                                sb16.append(String.valueOf(captureFragment2.setTitleOptional));
                                Log.e(str11, sb16.toString());
                            }
                            captureFragment2.setTransitioning = ((double) ((captureFragment2.MenuItemWrapperICS$CollapsibleActionViewWrapper + captureFragment2.ActionMenuItemView) / 2.0f)) - (captureFragment2.AppCompatDialogFragment - captureFragment2.MediaSessionCompat$ResultReceiverWrapper);
                            double d5 = captureFragment2.setTitleOptional;
                            if (d5 < 0.0d) {
                                captureFragment2.setTitleOptional = 10.0d;
                            } else {
                                captureFragment2.setTitleOptional = d5 + 10.0d;
                            }
                            double d6 = captureFragment2.setTransitioning;
                            if (d6 < 0.0d) {
                                captureFragment2.setTransitioning = 30.0d;
                            } else {
                                captureFragment2.setTransitioning = d6 + 30.0d;
                            }
                            if (captureFragment2.ActionBarContextView + captureFragment2.setTitleOptional > ((double) bitmap2.getWidth())) {
                                captureFragment2.ActionBarContextView = ((double) bitmap2.getWidth()) - captureFragment2.setTitleOptional;
                            }
                            if (captureFragment2.AppCompatDialogFragment + captureFragment2.setTransitioning > ((double) bitmap2.getHeight())) {
                                captureFragment2.AppCompatDialogFragment = ((double) bitmap2.getHeight()) - captureFragment2.setTransitioning;
                            }
                            double d7 = captureFragment2.ActionBarContextView;
                            if (d7 < 0.0d) {
                                Log.e("Catcha width <0", str3);
                                captureFragment2.ExpandedMenuView = true;
                                setRecipients.MediaMetadataCompat().Keep = null;
                                if (captureFragment2.MediaBrowserCompat$SearchResultReceiver != null) {
                                    CameraSource cameraSource4 = captureFragment2.setItemInvoker.MediaBrowserCompat$ItemReceiver;
                                    if (cameraSource4 != null) {
                                        cameraSource4.stop();
                                    }
                                    captureFragment2.AppCompatViewInflater = true;
                                    captureFragment2.setTitle.setVisibility(0);
                                    captureFragment2.setTitle.setImageBitmap(bitmap2);
                                }
                                captureFragment2.ActionBarContainer.setText(str3);
                                captureFragment2.MediaBrowserCompat$MediaItem.setMessage("Cannot recognize face!!!");
                                captureFragment2.MediaBrowserCompat$MediaItem.show();
                                captureFragment2.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                                return;
                            }
                            bitmap2 = Bitmap.createScaledBitmap(Bitmap.createBitmap(bitmap2, (int) captureFragment2.setTitleOptional, (int) captureFragment2.setTransitioning, (int) d7, (int) captureFragment2.AppCompatDialogFragment), C0608h.f1447Az, 640, false);
                            setRecipients.MediaMetadataCompat().Keep = setSelect.read(bitmap2, Bitmap.CompressFormat.JPEG);
                            Log.e(MediaBrowserCompat$ItemReceiver, "crop image done");
                            setRecipients.MediaMetadataCompat();
                            captureFragment.MediaBrowserCompat$ItemReceiver();
                            captureFragment2.MenuItemImpl = true;
                            captureFragment2.MediaDescriptionCompat.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                        }
                    }
                    String str12 = "";
                    Log.e("Catcha", str12);
                    captureFragment2.ExpandedMenuView = true;
                    setRecipients.MediaMetadataCompat().Keep = null;
                    if (captureFragment2.MediaBrowserCompat$SearchResultReceiver != null) {
                        CameraSource cameraSource5 = captureFragment2.setItemInvoker.MediaBrowserCompat$ItemReceiver;
                        if (cameraSource5 != null) {
                            cameraSource5.stop();
                        }
                        captureFragment2.AppCompatViewInflater = true;
                        captureFragment2.setTitle.setVisibility(0);
                        captureFragment2.setTitle.setImageBitmap(bitmap2);
                    }
                    captureFragment2.ActionBarContainer.setText(str12);
                    captureFragment2.MediaBrowserCompat$MediaItem.setMessage("Cannot recognize face!!!");
                    captureFragment2.MediaBrowserCompat$MediaItem.show();
                    captureFragment2.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                    return;
                }
            }
        }
    }
}
