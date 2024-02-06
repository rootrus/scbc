package p039io.beid.beidk.p086c;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.speech.tts.TextToSpeech;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.places.PlacesStatusCodes;
import com.google.firebase.p067ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p067ml.vision.face.FirebaseVisionFace;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p039io.beid.beidk.activity.FaceCaptureActivity;
import p039io.beid.beidk.p058ui.camera.CameraSourcePreview;
import p040o.CcSofReviewActivity;
import p040o.CcSofSuccessActivity;
import p040o.ChequeAnnouncementActivity;
import p040o.ChequeReviewActivity;
import p040o.ChequeStatusActivity;
import p040o.CloseAccountAmountDetailsActivity;
import p040o.CloseAccountConfirmationOtpActivity;
import p040o.CloseAccountSelectMainAccountActivity;
import p040o.CloseAccountSuccessActivity;
import p040o.ManageChequeActivity;
import p040o.lambda$setCustomActionBar$0$ContactUsActivity;
import p040o.onEmailUsClick;
import p040o.onEmailUsClick$MediaBrowserCompat$MediaItem;
import p040o.onSearchButtonClick;
import p040o.onSearchButtonClick$MediaBrowserCompat$ItemReceiver;

/* renamed from: io.beid.beidk.c.b */
public class C9632b extends Fragment implements TextToSpeech.OnInitListener, CcSofReviewActivity, ChequeStatusActivity {
    /* access modifiers changed from: package-private */
    public static final String write = C9632b.class.getName();
    /* access modifiers changed from: private */
    public ImageView AlertController$RecycleListView;
    /* access modifiers changed from: private */
    public TextView AppCompatActivity;
    /* access modifiers changed from: private */
    public Activity AppCompatDelegateImpl$ListMenuDecorView;
    private CameraSourcePreview AppCompatDialogFragment;
    private AlertDialog AppCompatViewInflater;
    public ManageChequeActivity IconCompatParcelizer;
    private View Keep;
    private lambda$setCustomActionBar$0$ContactUsActivity MediaBrowserCompat$CustomActionResultReceiver;
    public ChequeReviewActivity MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem = false;
    private boolean MediaBrowserCompat$SearchResultReceiver = false;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public ConstraintLayout f5460x50fd9e4a;
    private boolean MediaDescriptionCompat = false;
    /* access modifiers changed from: private */
    public SparseArray<ParcelFileDescriptor> MediaMetadataCompat;
    /* access modifiers changed from: private */
    public Integer MediaSessionCompat$QueueItem = 0;
    private int MediaSessionCompat$ResultReceiverWrapper = 10;
    /* access modifiers changed from: private */
    public TextView MediaSessionCompat$Token;
    private onEmailUsClick$MediaBrowserCompat$MediaItem ParcelableVolumeInfo;
    private ServiceConnection PlaybackStateCompat = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            CloseAccountSelectMainAccountActivity unused = C9632b.this.PlaybackStateCompat$CustomAction = CloseAccountSelectMainAccountActivity.read.write(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            CloseAccountSelectMainAccountActivity unused = C9632b.this.PlaybackStateCompat$CustomAction = null;
        }
    };
    /* access modifiers changed from: private */
    public CloseAccountSelectMainAccountActivity PlaybackStateCompat$CustomAction;
    /* access modifiers changed from: private */
    public int RatingCompat = -1;
    public Button read;
    /* access modifiers changed from: private */
    public onEmailUsClick setBackgroundResource = null;
    private int setCheckable = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaMetadataCompat;
    private TextToSpeech setContentView;
    private int setHasDecor;

    private String IconCompatParcelizer(String str, String str2) {
        try {
            Resources resources = this.AppCompatDelegateImpl$ListMenuDecorView.getResources();
            return resources.getString(resources.getIdentifier(str, "string", this.AppCompatDelegateImpl$ListMenuDecorView.getPackageName()));
        } catch (Resources.NotFoundException unused) {
            return str2;
        } catch (Exception e) {
            Log.e(getClass().getName(), "getText", e);
            return str2;
        }
    }

    /* access modifiers changed from: private */
    public void IconCompatParcelizer(Long l, final Runnable runnable) {
        this.f5460x50fd9e4a.setVisibility(0);
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                C9632b.this.f5460x50fd9e4a.setVisibility(4);
                runnable.run();
            }
        }, l.longValue());
    }

    private Drawable MediaBrowserCompat$CustomActionResultReceiver(String str) {
        try {
            Resources resources = this.AppCompatDelegateImpl$ListMenuDecorView.getResources();
            return resources.getDrawable(resources.getIdentifier(str, "drawable", this.AppCompatDelegateImpl$ListMenuDecorView.getPackageName()));
        } catch (Resources.NotFoundException unused) {
            return null;
        } catch (Exception e) {
            Log.e(getClass().getName(), "getDrawable", e);
            return null;
        }
    }

    public final boolean IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(FirebaseVisionFace firebaseVisionFace, Bitmap bitmap) throws IOException, RemoteException {
        Rect boundingBox = firebaseVisionFace.getBoundingBox();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        this.setHasDecor = this.PlaybackStateCompat$CustomAction.read(byteArrayInputStream.available());
        byte[] bArr = new byte[4096];
        while (true) {
            int read2 = byteArrayInputStream.read(bArr);
            if (read2 != -1) {
                String name = getClass().getName();
                StringBuilder sb = new StringBuilder();
                sb.append("readTakenData: transfering ");
                sb.append(read2);
                sb.append(" bytes");
                Log.i(name, sb.toString());
                this.PlaybackStateCompat$CustomAction.read(this.setHasDecor, bArr);
            } else {
                this.PlaybackStateCompat$CustomAction.IconCompatParcelizer(this.setHasDecor);
                byteArrayInputStream.close();
                this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.setHasDecor, boundingBox);
                Log.e(write, "crop image done");
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
                RatingCompat();
                this.MediaDescriptionCompat = true;
                return;
            }
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.AppCompatDelegateImpl$ListMenuDecorView = activity;
    }

    public void onDestroy() {
        super.onDestroy();
        TextToSpeech textToSpeech = this.setContentView;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
        }
        AlertDialog alertDialog = this.AppCompatViewInflater;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        onEmailUsClick onemailusclick = this.setBackgroundResource;
        if (onemailusclick != null) {
            onemailusclick.write();
            this.setBackgroundResource = null;
        }
        getActivity().unbindService(this.PlaybackStateCompat);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 2) {
            String str = write;
            StringBuilder sb = new StringBuilder();
            sb.append("Got unexpected permission result: ");
            sb.append(i);
            Log.d(str, sb.toString());
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else if (iArr.length == 0 || iArr[0] != 0) {
            String str2 = write;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Permission not granted: results len = ");
            sb2.append(iArr.length);
            sb2.append(" Result code = ");
            sb2.append(iArr.length > 0 ? Integer.valueOf(iArr[0]) : "(empty)");
            Log.e(str2, sb2.toString());
            new AlertDialog.Builder(getActivity()).setTitle("ePID Client Demo").setMessage(onSearchButtonClick$MediaBrowserCompat$ItemReceiver.beid_camera_permission).setPositiveButton(onSearchButtonClick$MediaBrowserCompat$ItemReceiver.f3171ok, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C9632b.this.getActivity().finish();
                }
            }).show();
        } else {
            Log.d(write, "Camera permission granted - initialize the camera source");
            MediaBrowserCompat$ItemReceiver(1);
        }
    }

    public void onResume() {
        this.AppCompatDelegateImpl$ListMenuDecorView.setRequestedOrientation(1);
        super.onResume();
        Log.e(write, "onresume");
        MediaDescriptionCompat();
    }

    public final int read() {
        return this.RatingCompat;
    }

    public final void read(Throwable th) {
        Log.e(write, th.getMessage());
        if ("timeout".equals(th.getMessage())) {
            IconCompatParcelizer((Long) 200L, (Runnable) new Runnable() {
                public final void run() {
                    C9632b.this.AlertController$RecycleListView.setVisibility(4);
                    C9632b.read(C9632b.this, new Runnable() {
                        public final void run() {
                            C9632b.this.AppCompatDelegateImpl$ListMenuDecorView.runOnUiThread(new Runnable() {
                                public final void run() {
                                    C9632b.MediaBrowserCompat$CustomActionResultReceiver(C9632b.this, C9632b.this.RatingCompat);
                                    C9632b.this.RatingCompat();
                                }
                            });
                        }
                    });
                }
            });
        }
    }

    public final onEmailUsClick$MediaBrowserCompat$MediaItem write() {
        return this.ParcelableVolumeInfo;
    }

    private void read(int i) {
        if (getActivity() != null) {
            Log.d(write, "media player start");
            Log.i("random Challenge play2.", String.valueOf(i));
            if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$SearchResultReceiver) {
                String obj = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$QueueItem.get(i).toString();
                this.setContentView.speak(IconCompatParcelizer(obj, obj), 0, (HashMap) null);
            }
            Log.d(write, "count timer start");
        }
    }

    static /* synthetic */ void read(C9632b bVar, Runnable runnable) {
        Long l = 2000L;
        bVar.AppCompatActivity.setText(bVar.IconCompatParcelizer("action_timeout", "Action Timeout"));
        if (l != null) {
            new Handler().postDelayed(runnable, l.longValue());
        }
    }

    static /* synthetic */ void read(C9632b bVar, String str, Long l, Runnable runnable) {
        bVar.AppCompatActivity.setText(str);
        if (l != null) {
            new Handler().postDelayed(runnable, l.longValue());
        }
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$ItemReceiver(int i) {
        Log.d(write, "create CameraSource");
        Context applicationContext = this.AppCompatDelegateImpl$ListMenuDecorView.getApplicationContext();
        this.MediaBrowserCompat$CustomActionResultReceiver = new lambda$setCustomActionBar$0$ContactUsActivity();
        this.MediaBrowserCompat$CustomActionResultReceiver.write = new CloseAccountAmountDetailsActivity(new CcSofSuccessActivity(this));
        this.AppCompatDelegateImpl$ListMenuDecorView.getApplicationContext().getResources().getDisplayMetrics();
        this.AppCompatDialogFragment.getWidth();
        this.AppCompatDialogFragment.getHeight();
        this.AppCompatDialogFragment.getWidth();
        this.AppCompatDialogFragment.getHeight();
        onEmailUsClick.write MediaBrowserCompat$ItemReceiver2 = new onEmailUsClick.write(applicationContext, this.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver(this.AppCompatDialogFragment.getWidth(), this.AppCompatDialogFragment.getHeight());
        String unused = MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper = "auto";
        String unused2 = MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer.RatingCompat = "continuous-picture";
        onEmailUsClick.write read2 = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver(1).read(30.0f);
        onEmailUsClick.IconCompatParcelizer unused3 = read2.IconCompatParcelizer.MediaSessionCompat$QueueItem = new onEmailUsClick.IconCompatParcelizer(read2.write);
        this.setBackgroundResource = read2.IconCompatParcelizer;
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C9632b bVar, int i) {
        StringBuilder sb;
        String str;
        String str2 = write;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" Call actionChallenge mCountChallenge ");
        sb2.append(String.valueOf(bVar.MediaSessionCompat$ResultReceiverWrapper));
        sb2.append(" challenge ");
        sb2.append(i);
        Log.i(str2, sb2.toString());
        String str3 = write;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(" Call actionChallenge repeatsuccessCount");
        sb3.append("0");
        Log.i(str3, sb3.toString());
        String str4 = write;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(" Call actionChallenge statusChallenge1 ");
        sb4.append(bVar.MediaBrowserCompat$MediaItem);
        Log.e(str4, sb4.toString());
        PrintStream printStream = System.out;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(write);
        sb5.append("statusChallenge1 = ");
        sb5.append(bVar.MediaBrowserCompat$MediaItem);
        printStream.println(sb5.toString());
        PrintStream printStream2 = System.out;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(write);
        sb6.append("statusChallenge2 = ");
        sb6.append(bVar.MediaBrowserCompat$SearchResultReceiver);
        printStream2.println(sb6.toString());
        if (!bVar.MediaBrowserCompat$MediaItem) {
            bVar.MediaBrowserCompat$MediaItem = true;
            if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$SearchResultReceiver) {
                bVar.setContentView.speak("OK", 0, (HashMap) null);
            }
            bVar.MediaDescriptionCompat = false;
            sb = new StringBuilder();
            sb.append(write);
            str = " 1st Challeng1";
        } else {
            if (!bVar.MediaBrowserCompat$SearchResultReceiver) {
                bVar.MediaBrowserCompat$SearchResultReceiver = true;
                if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$SearchResultReceiver) {
                    bVar.setContentView.speak("OK", 0, (HashMap) null);
                }
                sb = new StringBuilder();
                sb.append(write);
                str = "2nd Challeng2";
            }
            PrintStream printStream3 = System.out;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(write);
            sb7.append("statusChallenge1 = ");
            sb7.append(bVar.MediaBrowserCompat$MediaItem);
            printStream3.println(sb7.toString());
            PrintStream printStream4 = System.out;
            StringBuilder sb8 = new StringBuilder();
            sb8.append(write);
            sb8.append("statusChallenge2 = ");
            sb8.append(bVar.MediaBrowserCompat$SearchResultReceiver);
            printStream4.println(sb8.toString());
            String str5 = write;
            StringBuilder sb9 = new StringBuilder();
            sb9.append(" Call actionChallenge startChallenge ");
            sb9.append(bVar.MediaDescriptionCompat);
            Log.e(str5, sb9.toString());
        }
        sb.append(str);
        Log.e(sb.toString(), "dd");
        PrintStream printStream32 = System.out;
        StringBuilder sb72 = new StringBuilder();
        sb72.append(write);
        sb72.append("statusChallenge1 = ");
        sb72.append(bVar.MediaBrowserCompat$MediaItem);
        printStream32.println(sb72.toString());
        PrintStream printStream42 = System.out;
        StringBuilder sb82 = new StringBuilder();
        sb82.append(write);
        sb82.append("statusChallenge2 = ");
        sb82.append(bVar.MediaBrowserCompat$SearchResultReceiver);
        printStream42.println(sb82.toString());
        String str52 = write;
        StringBuilder sb92 = new StringBuilder();
        sb92.append(" Call actionChallenge startChallenge ");
        sb92.append(bVar.MediaDescriptionCompat);
        Log.e(str52, sb92.toString());
    }

    /* access modifiers changed from: private */
    public void RatingCompat() {
        synchronized (this) {
            int size = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo.size();
            this.ParcelableVolumeInfo = null;
            int i = this.RatingCompat + 1;
            this.RatingCompat = i;
            if (i >= size) {
                this.AppCompatDelegateImpl$ListMenuDecorView.runOnUiThread(new Runnable() {
                    public final void run() {
                        if (C9632b.this.getActivity() != null) {
                            FaceCaptureActivity faceCaptureActivity = (FaceCaptureActivity) C9632b.this.getActivity();
                            C9632b.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(C9632b.this.MediaMetadataCompat);
                            FaceCaptureActivity.IconCompatParcelizer iconCompatParcelizer = FaceCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver;
                            try {
                                faceCaptureActivity.MediaBrowserCompat$ItemReceiver = new C9628a();
                                String str = FaceCaptureActivity.IconCompatParcelizer;
                                StringBuilder sb = new StringBuilder();
                                sb.append("start FragmentTransaction with capture ");
                                sb.append(faceCaptureActivity.write);
                                Log.e(str, sb.toString());
                                FragmentTransaction beginTransaction = faceCaptureActivity.getFragmentManager().beginTransaction();
                                beginTransaction.remove(faceCaptureActivity.write);
                                String str2 = FaceCaptureActivity.IconCompatParcelizer;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("start FragmentTransaction capture remove ");
                                sb2.append(faceCaptureActivity.write);
                                Log.e(str2, sb2.toString());
                                faceCaptureActivity.write = null;
                                String str3 = FaceCaptureActivity.IconCompatParcelizer;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("start FragmentTransaction before confirm add ");
                                sb3.append(faceCaptureActivity.MediaBrowserCompat$ItemReceiver);
                                Log.e(str3, sb3.toString());
                                beginTransaction.add(onSearchButtonClick.IconCompatParcelizer.container, faceCaptureActivity.MediaBrowserCompat$ItemReceiver, "confirmationFragment");
                                String str4 = FaceCaptureActivity.IconCompatParcelizer;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("start FragmentTransaction finish confirm add ");
                                sb4.append(faceCaptureActivity.MediaBrowserCompat$ItemReceiver);
                                Log.e(str4, sb4.toString());
                                beginTransaction.show(faceCaptureActivity.MediaBrowserCompat$ItemReceiver);
                                beginTransaction.commit();
                                faceCaptureActivity.read = FaceCaptureActivity.write.CONFIRM;
                                Log.e(FaceCaptureActivity.IconCompatParcelizer, "finish FragmentTransaction");
                            } catch (Exception e) {
                                Log.e(faceCaptureActivity.getLocalClassName(), "showConfirmationFragment: ", e);
                            }
                        }
                    }
                });
                return;
            }
            if (i >= 0) {
                onEmailUsClick$MediaBrowserCompat$MediaItem onemailusclick_mediabrowsercompat_mediaitem = CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().ParcelableVolumeInfo.get(this.RatingCompat);
                this.ParcelableVolumeInfo = onemailusclick_mediabrowsercompat_mediaitem;
                if (onemailusclick_mediabrowsercompat_mediaitem == null) {
                    RatingCompat();
                    return;
                }
                this.AppCompatActivity.setText(IconCompatParcelizer(onemailusclick_mediabrowsercompat_mediaitem.read(), this.ParcelableVolumeInfo.read()));
                if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().write) {
                    try {
                        this.AlertController$RecycleListView.setVisibility(0);
                        this.AlertController$RecycleListView.setImageDrawable(MediaBrowserCompat$CustomActionResultReceiver(this.ParcelableVolumeInfo.read()));
                    } catch (Exception e) {
                        e.printStackTrace();
                        StringBuilder sb = new StringBuilder();
                        sb.append("err: ");
                        sb.append(e.getMessage());
                        Log.e("FaceCaptureFragment", sb.toString());
                    }
                }
                this.ParcelableVolumeInfo.read((ChequeStatusActivity) this);
                this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver();
            }
            String str = write;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("random Challenge OnChallenge1.");
            sb2.append(this.RatingCompat);
            Log.d(str, sb2.toString());
            this.MediaDescriptionCompat = true;
            read(this.RatingCompat);
        }
    }

    /* access modifiers changed from: private */
    public void MediaDescriptionCompat() {
        Log.d(write, "start CameraSource");
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().IconCompatParcelizer);
        if (isGooglePlayServicesAvailable != 0) {
            GoogleApiAvailability.getInstance().getErrorDialog(this.AppCompatDelegateImpl$ListMenuDecorView, isGooglePlayServicesAvailable, PlacesStatusCodes.USAGE_LIMIT_EXCEEDED).show();
        }
        if (this.setBackgroundResource != null) {
            Log.e(write, "camerasoure not null");
            try {
                this.AppCompatDialogFragment.read(this.setBackgroundResource);
            } catch (IOException e) {
                Log.e(write, "Unable to start camera source.", e);
                this.setBackgroundResource.write();
                this.setBackgroundResource = null;
            }
        } else {
            Log.e(write, "camerasoure null");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Message message) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Runtime.getRuntime().gc();
            } else {
                System.gc();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            lambda$setCustomActionBar$0$ContactUsActivity.write().getBitmapForDebugging().compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            int read2 = this.PlaybackStateCompat$CustomAction.read(byteArrayInputStream.available());
            byte[] bArr = new byte[4096];
            while (true) {
                int read3 = byteArrayInputStream.read(bArr);
                if (read3 != -1) {
                    String name = getClass().getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("readTakenData: transfering ");
                    sb.append(read3);
                    sb.append(" bytes");
                    Log.i(name, sb.toString());
                    this.PlaybackStateCompat$CustomAction.read(read2, bArr);
                } else {
                    this.PlaybackStateCompat$CustomAction.IconCompatParcelizer(read2);
                    byteArrayInputStream.close();
                    this.MediaBrowserCompat$ItemReceiver.write(read2);
                    this.AppCompatDelegateImpl$ListMenuDecorView.runOnUiThread(new Runnable() {
                        public final void run() {
                            C9632b.this.IconCompatParcelizer((Long) 200L, (Runnable) new Runnable() {
                                public final void run() {
                                    C9632b.this.AlertController$RecycleListView.setVisibility(4);
                                    C9632b.read(C9632b.this, "", 2000L, new Runnable() {
                                        public final void run() {
                                            Integer unused = C9632b.this.MediaSessionCompat$QueueItem = Integer.valueOf(C9632b.this.MediaSessionCompat$QueueItem.intValue() + 1);
                                            C9632b.MediaBrowserCompat$CustomActionResultReceiver(C9632b.this, C9632b.this.RatingCompat);
                                            C9632b.this.RatingCompat();
                                        }
                                    });
                                }
                            });
                        }
                    });
                    Log.i(write, message.toString());
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (!this.MediaDescriptionCompat) {
            this.AppCompatDelegateImpl$ListMenuDecorView.runOnUiThread(new Runnable() {
                public final void run() {
                    C9632b.this.read.setVisibility(0);
                }
            });
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (this.MediaDescriptionCompat) {
            this.IconCompatParcelizer.MediaBrowserCompat$MediaItem();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(getActivity(), CloseAccountSuccessActivity.class);
        intent.setAction(CloseAccountSelectMainAccountActivity.class.getName());
        getActivity().startService(intent);
        getActivity().bindService(intent, this.PlaybackStateCompat, 1);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        getActivity().getWindow().setFormat(3);
        this.AppCompatDelegateImpl$ListMenuDecorView = getActivity();
        this.MediaMetadataCompat = new SparseArray<>();
        this.AppCompatDelegateImpl$ListMenuDecorView.setRequestedOrientation(1);
        if (this.Keep == null) {
            View inflate = layoutInflater.inflate(onSearchButtonClick.read.fragment_face_capture, viewGroup, false);
            this.Keep = inflate;
            this.AppCompatDialogFragment = (CameraSourcePreview) inflate.findViewById(onSearchButtonClick.IconCompatParcelizer.preview);
            Log.i("Timer", String.valueOf(this.setCheckable));
            PreferenceManager.getDefaultSharedPreferences(this.AppCompatDelegateImpl$ListMenuDecorView);
            this.AppCompatActivity = (TextView) this.Keep.findViewById(onSearchButtonClick.IconCompatParcelizer.capture_fragment_txt_countdown);
            this.read = (Button) this.Keep.findViewById(onSearchButtonClick.IconCompatParcelizer.captureBtn);
            this.AlertController$RecycleListView = (ImageView) this.Keep.findViewById(onSearchButtonClick.IconCompatParcelizer.mediaimage);
            this.MediaSessionCompat$Token = (TextView) this.Keep.findViewById(onSearchButtonClick.IconCompatParcelizer.captureTextDefaultTextView);
            getActivity().getApplicationContext();
            this.AppCompatViewInflater = new AlertDialog.Builder(this.AppCompatDelegateImpl$ListMenuDecorView).setTitle("Error!").setPositiveButton("OK", (DialogInterface.OnClickListener) null).setCancelable(true).create();
            this.setContentView = new TextToSpeech(getActivity(), this);
            this.f5460x50fd9e4a = (ConstraintLayout) this.Keep.findViewById(onSearchButtonClick.IconCompatParcelizer.layoutBlackOut);
            if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$ResultReceiverWrapper > 1) {
                CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$Token) {
                this.read.setVisibility(8);
            }
            if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat == CloseAccountConfirmationOtpActivity.IconCompatParcelizer.face_first || (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat == CloseAccountConfirmationOtpActivity.IconCompatParcelizer.challenge_first && !CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().read)) {
                this.AppCompatActivity.setText(onSearchButtonClick$MediaBrowserCompat$ItemReceiver.look_at_the_camera);
            }
            this.Keep.findViewById(onSearchButtonClick.IconCompatParcelizer.noFaceFoundImageView);
            this.read.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    Log.i(C9632b.write, "ImageBtn Call On Click");
                    int i = 0;
                    C9632b.this.AppCompatActivity.setVisibility(0);
                    C9632b.this.MediaSessionCompat$Token.setVisibility(4);
                    C9632b.this.read.setVisibility(8);
                    C9632b bVar = C9632b.this;
                    try {
                        Log.e(C9632b.write, "facefirst captureImage");
                        List<ChequeAnnouncementActivity> MediaBrowserCompat$CustomActionResultReceiver = lambda$setCustomActionBar$0$ContactUsActivity.MediaBrowserCompat$CustomActionResultReceiver();
                        FirebaseVisionImage write = lambda$setCustomActionBar$0$ContactUsActivity.write();
                        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                            bVar.IconCompatParcelizer.MediaBrowserCompat$MediaItem();
                        } else if (MediaBrowserCompat$CustomActionResultReceiver.size() == 0) {
                            bVar.IconCompatParcelizer.MediaBrowserCompat$MediaItem();
                        } else if (MediaBrowserCompat$CustomActionResultReceiver.size() > 1) {
                            bVar.IconCompatParcelizer.MediaMetadataCompat();
                        } else {
                            while (i < MediaBrowserCompat$CustomActionResultReceiver.size()) {
                                try {
                                    ChequeAnnouncementActivity chequeAnnouncementActivity = MediaBrowserCompat$CustomActionResultReceiver.get(i);
                                    if (chequeAnnouncementActivity != null) {
                                        if ((chequeAnnouncementActivity.MediaBrowserCompat$ItemReceiver ? chequeAnnouncementActivity.IconCompatParcelizer.getRightEyeOpenProbability() : chequeAnnouncementActivity.IconCompatParcelizer.getLeftEyeOpenProbability()) >= 0.3f) {
                                            if ((chequeAnnouncementActivity.MediaBrowserCompat$ItemReceiver ? chequeAnnouncementActivity.IconCompatParcelizer.getLeftEyeOpenProbability() : chequeAnnouncementActivity.IconCompatParcelizer.getRightEyeOpenProbability()) >= 0.3f) {
                                                bVar.MediaBrowserCompat$CustomActionResultReceiver(chequeAnnouncementActivity.IconCompatParcelizer, write.getBitmapForDebugging());
                                                return;
                                            }
                                        }
                                        bVar.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver();
                                        return;
                                    }
                                    i++;
                                } catch (Exception e) {
                                    Log.i(bVar.getClass().getName(), e.getMessage());
                                }
                            }
                        }
                    } catch (OutOfMemoryError e2) {
                        Log.e(bVar.getClass().getName(), "faceFirstChallenge", e2);
                        bVar.IconCompatParcelizer.MediaBrowserCompat$MediaItem();
                    }
                }
            });
            this.read.setVisibility(8);
            this.Keep.findViewById(onSearchButtonClick.IconCompatParcelizer.circleOverlayView);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.AppCompatDelegateImpl$ListMenuDecorView.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
        }
        this.AppCompatDialogFragment.post(new Runnable() {
            public final void run() {
                C9632b.this.MediaBrowserCompat$ItemReceiver(1);
                C9632b.this.MediaDescriptionCompat();
            }
        });
        if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaSessionCompat$Token && CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat == CloseAccountConfirmationOtpActivity.IconCompatParcelizer.challenge_first && CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().read) {
            new CountDownTimer() {
                public final void onFinish() {
                    if (C9632b.this.setBackgroundResource != null) {
                        C9632b.this.read.callOnClick();
                    }
                }

                public final void onTick(long j) {
                }
            }.start();
        }
        return this.Keep;
    }

    public void onInit(int i) {
        this.setContentView.setLanguage(Locale.UK);
        if ((CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat == CloseAccountConfirmationOtpActivity.IconCompatParcelizer.face_first || (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat == CloseAccountConfirmationOtpActivity.IconCompatParcelizer.challenge_first && !CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().read)) && CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$SearchResultReceiver) {
            this.setContentView.speak(getString(onSearchButtonClick$MediaBrowserCompat$ItemReceiver.look_at_the_camera), 0, (HashMap) null);
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (Build.VERSION.SDK_INT >= 23) {
            Runtime.getRuntime().gc();
        } else {
            System.gc();
        }
    }

    public void onPause() {
        onEmailUsClick onemailusclick;
        TextToSpeech textToSpeech = this.setContentView;
        if (textToSpeech != null) {
            textToSpeech.stop();
            this.setContentView.shutdown();
        }
        super.onPause();
        this.AppCompatDelegateImpl$ListMenuDecorView.setRequestedOrientation(10);
        CameraSourcePreview cameraSourcePreview = this.AppCompatDialogFragment;
        if (cameraSourcePreview != null && (onemailusclick = cameraSourcePreview.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            onemailusclick.read();
        }
    }
}
