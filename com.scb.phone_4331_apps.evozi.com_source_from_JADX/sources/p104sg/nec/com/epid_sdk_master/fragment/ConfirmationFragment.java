package p104sg.nec.com.epid_sdk_master.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import java.io.PrintStream;
import p040o.CustomRecipientsList_ViewBinding;
import p040o.setQuestionMark;
import p040o.setRecipients;
import p040o.setRemainingLimit;
import p040o.setSelect;
import p040o.setTvRemark;
import p040o.setTvRemark$MediaBrowserCompat$CustomActionResultReceiver;
import p104sg.nec.com.epid_sdk_master.ePIDMainActivity;

/* renamed from: sg.nec.com.epid_sdk_master.fragment.ConfirmationFragment */
public class ConfirmationFragment extends Fragment {
    /* access modifiers changed from: private */
    public static final String RatingCompat = ConfirmationFragment.class.getName();
    private double ActionMenuItemView;
    private PointF AlertController$RecycleListView;
    /* access modifiers changed from: private */
    public String AppCompatActivity;
    /* access modifiers changed from: private */
    public ePIDMainActivity AppCompatDelegateImpl$ListMenuDecorView;
    /* access modifiers changed from: private */
    public RelativeLayout AppCompatDialogFragment;
    private View AppCompatViewInflater;
    int IconCompatParcelizer;
    /* access modifiers changed from: private */
    public Activity Keep;
    public Bitmap MediaBrowserCompat$CustomActionResultReceiver;
    Context MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public ImageView MediaBrowserCompat$MediaItem;
    public Bitmap MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Bitmap f6397x50fd9e4a;
    public ePIDMainActivity.write MediaDescriptionCompat;
    public setQuestionMark MediaMetadataCompat;
    private double MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public boolean MediaSessionCompat$ResultReceiverWrapper = true;
    private double MediaSessionCompat$Token;
    private double ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public setRemainingLimit<String> PlaybackStateCompat;
    private float PlaybackStateCompat$CustomAction;
    ImageView read;
    private Paint setBackgroundResource = new Paint();
    private PointF setCheckable;
    private float setChecked;
    /* access modifiers changed from: private */
    public ImageView setContentView;
    private float setExpandedFormat;
    private float setHasDecor;
    private double setIcon;
    private double setItemInvoker;
    private double setPadding;
    byte[] write;

    public ConfirmationFragment() {
        new Handler(new Handler.Callback() {
            public final boolean handleMessage(Message message) {
                if (message.what != 0) {
                    return false;
                }
                boolean unused = ConfirmationFragment.this.MediaSessionCompat$ResultReceiverWrapper = false;
                ConfirmationFragment.this.AppCompatDialogFragment.setVisibility(8);
                String unused2 = ConfirmationFragment.this.AppCompatActivity = "Verification error, please try again";
                ConfirmationFragment confirmationFragment = ConfirmationFragment.this;
                new Thread(confirmationFragment.AppCompatActivity) {
                    public final void run() {
                        ConfirmationFragment.this.Keep.runOnUiThread(new Runnable() {
                            public final void run() {
                                Toast.makeText(ConfirmationFragment.this.MediaBrowserCompat$ItemReceiver, "Cannot recognize face!!!", 0).show();
                            }
                        });
                    }
                }.start();
                return false;
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Log.e(RatingCompat, "OnCreateView ");
        this.AppCompatDelegateImpl$ListMenuDecorView = (ePIDMainActivity) getActivity();
        PreferenceManager.getDefaultSharedPreferences(getActivity());
        this.Keep = getActivity();
        if (this.AppCompatViewInflater == null) {
            View inflate = layoutInflater.inflate(setTvRemark$MediaBrowserCompat$CustomActionResultReceiver.confirmation_fragment, viewGroup, false);
            this.AppCompatViewInflater = inflate;
            inflate.findViewById(setTvRemark.write.progressBar);
            this.AppCompatViewInflater.findViewById(setTvRemark.write.myTextProgress);
            this.AppCompatDialogFragment = (RelativeLayout) this.AppCompatViewInflater.findViewById(setTvRemark.write.progressBarRelativeLayout);
            this.MediaBrowserCompat$MediaItem = (ImageView) this.AppCompatViewInflater.findViewById(setTvRemark.write.backBtn);
            this.read = (ImageView) this.AppCompatViewInflater.findViewById(setTvRemark.write.capturedImg);
            this.MediaBrowserCompat$ItemReceiver = getActivity().getApplicationContext();
            this.MediaBrowserCompat$MediaItem.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ConfirmationFragment.this.MediaBrowserCompat$MediaItem.performHapticFeedback(1);
                    if (setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.face_first) {
                        setRecipients.MediaMetadataCompat();
                    }
                    ePIDMainActivity IconCompatParcelizer = ConfirmationFragment.this.AppCompatDelegateImpl$ListMenuDecorView;
                    CaptureFragment captureFragment = new CaptureFragment();
                    IconCompatParcelizer.IconCompatParcelizer = captureFragment;
                    captureFragment.write = IconCompatParcelizer;
                    FragmentTransaction beginTransaction = IconCompatParcelizer.getFragmentManager().beginTransaction();
                    beginTransaction.remove(IconCompatParcelizer.read);
                    IconCompatParcelizer.read = null;
                    beginTransaction.add(setTvRemark.write.container, IconCompatParcelizer.IconCompatParcelizer, "captureFragment");
                    beginTransaction.show(IconCompatParcelizer.IconCompatParcelizer);
                    beginTransaction.commit();
                    IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = ePIDMainActivity.IconCompatParcelizer.CAPTURE;
                }
            });
            ImageView imageView = (ImageView) this.AppCompatViewInflater.findViewById(setTvRemark.write.nextBtn);
            this.setContentView = imageView;
            imageView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ConfirmationFragment.this.setContentView.performHapticFeedback(1);
                    setRecipients.MediaMetadataCompat();
                    ConfirmationFragment.this.IconCompatParcelizer++;
                    Log.i("Click Submit Button ", String.valueOf(ConfirmationFragment.this.IconCompatParcelizer));
                    if (ConfirmationFragment.this.MediaSessionCompat$ResultReceiverWrapper) {
                        Log.i(" flagFaceSuccess", " True");
                        boolean unused = ConfirmationFragment.this.MediaSessionCompat$ResultReceiverWrapper = false;
                        ConfirmationFragment.this.AppCompatDialogFragment.setVisibility(0);
                        if (setRecipients.MediaMetadataCompat().AlertController$RecycleListView) {
                            Log.e(ConfirmationFragment.RatingCompat, "Capture Only Next Button Call");
                            setRemainingLimit unused2 = ConfirmationFragment.this.PlaybackStateCompat = setRecipients.MediaMetadataCompat().MediaSessionCompat$QueueItem;
                            String MediaBrowserCompat$ItemReceiver = ConfirmationFragment.RatingCompat;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Capture Only ePID Response Listener ");
                            sb.append(ConfirmationFragment.this.PlaybackStateCompat);
                            Log.e(MediaBrowserCompat$ItemReceiver, sb.toString());
                            if (setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.challenge_first) {
                                ConfirmationFragment confirmationFragment = ConfirmationFragment.this;
                                Bitmap unused3 = confirmationFragment.f6397x50fd9e4a = Bitmap.createScaledBitmap(confirmationFragment.f6397x50fd9e4a, C0608h.f1447Az, 640, false);
                                ConfirmationFragment confirmationFragment2 = ConfirmationFragment.this;
                                confirmationFragment2.write = setSelect.read(confirmationFragment2.f6397x50fd9e4a, Bitmap.CompressFormat.JPEG);
                                long length = (long) (ConfirmationFragment.this.write.length / 1024);
                                String MediaBrowserCompat$ItemReceiver2 = ConfirmationFragment.RatingCompat;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("imagesize send to server= ");
                                sb2.append(length);
                                sb2.append("KB");
                                Log.e(MediaBrowserCompat$ItemReceiver2, sb2.toString());
                                setRecipients.MediaMetadataCompat().Keep = ConfirmationFragment.this.write;
                            }
                            String MediaBrowserCompat$ItemReceiver3 = ConfirmationFragment.RatingCompat;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Capture Only ImageData ");
                            sb3.append(setRecipients.MediaMetadataCompat().Keep.toString());
                            Log.e(MediaBrowserCompat$ItemReceiver3, sb3.toString());
                            ConfirmationFragment.this.PlaybackStateCompat.write("Pass Image as String");
                        } else if (setRecipients.MediaMetadataCompat().RatingCompat != setRecipients.IconCompatParcelizer.face_first || !setRecipients.MediaMetadataCompat().AppCompatDialogFragment) {
                            ConfirmationFragment confirmationFragment3 = ConfirmationFragment.this;
                            Bitmap unused4 = confirmationFragment3.f6397x50fd9e4a = Bitmap.createScaledBitmap(confirmationFragment3.f6397x50fd9e4a, C0608h.f1447Az, 640, false);
                            String MediaBrowserCompat$ItemReceiver4 = ConfirmationFragment.RatingCompat;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("getConfig1");
                            sb4.append(ConfirmationFragment.this.f6397x50fd9e4a.getConfig());
                            Log.e(MediaBrowserCompat$ItemReceiver4, sb4.toString());
                            String MediaBrowserCompat$ItemReceiver5 = ConfirmationFragment.RatingCompat;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("getConfig2");
                            sb5.append(ConfirmationFragment.this.f6397x50fd9e4a.getConfig());
                            Log.e(MediaBrowserCompat$ItemReceiver5, sb5.toString());
                            ConfirmationFragment confirmationFragment4 = ConfirmationFragment.this;
                            confirmationFragment4.write = setSelect.read(confirmationFragment4.f6397x50fd9e4a, Bitmap.CompressFormat.JPEG);
                            long length2 = (long) (ConfirmationFragment.this.write.length / 1024);
                            String MediaBrowserCompat$ItemReceiver6 = ConfirmationFragment.RatingCompat;
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("imagesize send to server= ");
                            sb6.append(length2);
                            sb6.append("KB");
                            Log.d(MediaBrowserCompat$ItemReceiver6, sb6.toString());
                            setRecipients.MediaMetadataCompat().Keep = ConfirmationFragment.this.write;
                            String MediaBrowserCompat$ItemReceiver7 = ConfirmationFragment.RatingCompat;
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(">>>>> currentImageCapture ");
                            sb7.append(setRecipients.MediaMetadataCompat().Keep);
                            Log.d(MediaBrowserCompat$ItemReceiver7, sb7.toString());
                            new CustomRecipientsList_ViewBinding(ConfirmationFragment.this.Keep, ConfirmationFragment.this.write, setRecipients.MediaMetadataCompat().MediaSessionCompat$QueueItem).execute(new Void[0]);
                        } else {
                            ConfirmationFragment.this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(true);
                        }
                    } else if (!TextUtils.isEmpty(ConfirmationFragment.this.AppCompatActivity)) {
                        ConfirmationFragment confirmationFragment5 = ConfirmationFragment.this;
                        new Thread(confirmationFragment5.AppCompatActivity) {
                            public final void run() {
                                ConfirmationFragment.this.Keep.runOnUiThread(new Runnable() {
                                    public final void run() {
                                        Toast.makeText(ConfirmationFragment.this.MediaBrowserCompat$ItemReceiver, "Cannot recognize face!!!", 0).show();
                                    }
                                });
                            }
                        }.start();
                    }
                    Log.i(" After Clickcount", String.valueOf(ConfirmationFragment.this.IconCompatParcelizer));
                }
            });
            if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                Log.e(RatingCompat, "set image");
                this.read.setImageBitmap(this.MediaBrowserCompat$CustomActionResultReceiver);
                this.f6397x50fd9e4a = Bitmap.createBitmap(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            if (setRecipients.MediaMetadataCompat().Keep != null && setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.face_first) {
                Log.e(RatingCompat, "set image");
                this.read.setImageBitmap(BitmapFactory.decodeByteArray(setRecipients.MediaMetadataCompat().Keep, 0, setRecipients.MediaMetadataCompat().Keep.length));
                if (setRecipients.MediaMetadataCompat().MediaBrowserCompat$SearchResultReceiver) {
                    this.MediaBrowserCompat$MediaItem.setVisibility(8);
                    this.setContentView.setVisibility(8);
                    this.setContentView.callOnClick();
                }
            }
        }
        return this.AppCompatViewInflater;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        String str = RatingCompat;
        StringBuilder sb = new StringBuilder();
        sb.append("OnAttach ");
        sb.append(this.MediaMetadataCompat);
        Log.e(str, sb.toString());
        this.Keep = activity;
    }

    public void onStart() {
        super.onStart();
        Log.e(RatingCompat, "onStart created");
    }

    public void onResume() {
        String str = RatingCompat;
        StringBuilder sb = new StringBuilder();
        sb.append(" call OnResume");
        sb.append(this.MediaMetadataCompat);
        Log.e(str, sb.toString());
        this.Keep.setRequestedOrientation(1);
        super.onResume();
        if (setRecipients.MediaMetadataCompat().RatingCompat != setRecipients.IconCompatParcelizer.challenge_first && (setRecipients.MediaMetadataCompat().RatingCompat != setRecipients.IconCompatParcelizer.face_first || setRecipients.MediaMetadataCompat().AppCompatDialogFragment)) {
            return;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            Log.e(RatingCompat, " startcall loadCropImage");
            new ConfirmationFragment$MediaBrowserCompat$ItemReceiver(this, (byte) 0).execute(new Void[0]);
            return;
        }
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        this.AppCompatActivity = "Cannot recognize face!!!";
        new Thread("Cannot recognize face!!!") {
            public final void run() {
                ConfirmationFragment.this.Keep.runOnUiThread(new Runnable() {
                    public final void run() {
                        Toast.makeText(ConfirmationFragment.this.MediaBrowserCompat$ItemReceiver, "Cannot recognize face!!!", 0).show();
                    }
                });
            }
        }.start();
    }

    public void onPause() {
        super.onPause();
        String str = RatingCompat;
        StringBuilder sb = new StringBuilder();
        sb.append("OnPause ");
        sb.append(this.MediaMetadataCompat);
        Log.e(str, sb.toString());
        this.Keep.setRequestedOrientation(10);
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ConfirmationFragment confirmationFragment, SparseArray sparseArray) {
        int i = 0;
        confirmationFragment.MediaSessionCompat$ResultReceiverWrapper = false;
        confirmationFragment.setBackgroundResource.setColor(-65536);
        confirmationFragment.setBackgroundResource.setStyle(Paint.Style.STROKE);
        confirmationFragment.setBackgroundResource.setStrokeWidth(5.0f);
        while (i < sparseArray.size()) {
            Face face = (Face) sparseArray.valueAt(i);
            for (Landmark next : face.getLandmarks()) {
                int type = next.getType();
                if (type == 0) {
                    next.getPosition();
                } else if (type == 4) {
                    confirmationFragment.AlertController$RecycleListView = next.getPosition();
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append(">>>left Eye x = ");
                    sb.append(confirmationFragment.AlertController$RecycleListView.x);
                    printStream.println(sb.toString());
                    PrintStream printStream2 = System.out;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(">>>left Eye  y = ");
                    sb2.append(confirmationFragment.AlertController$RecycleListView.y);
                    printStream2.println(sb2.toString());
                    if (((double) confirmationFragment.PlaybackStateCompat$CustomAction) == 0.0d) {
                        confirmationFragment.PlaybackStateCompat$CustomAction = confirmationFragment.AlertController$RecycleListView.x;
                        confirmationFragment.setHasDecor = confirmationFragment.AlertController$RecycleListView.y;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(RatingCompat);
                        sb3.append("left eye position");
                        Log.e(sb3.toString(), String.valueOf(confirmationFragment.AlertController$RecycleListView));
                    }
                } else if (type == 10) {
                    confirmationFragment.setCheckable = next.getPosition();
                    PrintStream printStream3 = System.out;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(">>>right Eye x = ");
                    sb4.append(confirmationFragment.setCheckable.x);
                    printStream3.println(sb4.toString());
                    PrintStream printStream4 = System.out;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(">>>right Eye  y = ");
                    sb5.append(confirmationFragment.setCheckable.y);
                    printStream4.println(sb5.toString());
                    if (((double) confirmationFragment.setExpandedFormat) == 0.0d) {
                        confirmationFragment.setExpandedFormat = confirmationFragment.setCheckable.x;
                        confirmationFragment.setChecked = confirmationFragment.setCheckable.y;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(RatingCompat);
                        sb6.append("right eye position");
                        Log.e(sb6.toString(), String.valueOf(confirmationFragment.setCheckable));
                    }
                }
            }
            if (confirmationFragment.MediaBrowserCompat$CustomActionResultReceiver == null || confirmationFragment.MediaBrowserCompat$SearchResultReceiver == null || sparseArray.size() != 1) {
                i++;
            } else {
                float isLeftEyeOpenProbability = face.getIsLeftEyeOpenProbability();
                float isRightEyeOpenProbability = face.getIsRightEyeOpenProbability();
                String str = RatingCompat;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(">>>>++leftEye = ");
                sb7.append(isLeftEyeOpenProbability);
                Log.d(str, sb7.toString());
                String str2 = RatingCompat;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(">>>>++rightEye = ");
                sb8.append(isRightEyeOpenProbability);
                Log.d(str2, sb8.toString());
                int i2 = (((double) isLeftEyeOpenProbability) > 0.3d ? 1 : (((double) isLeftEyeOpenProbability) == 0.3d ? 0 : -1));
                if (i2 < 0 && ((double) isRightEyeOpenProbability) < 0.3d) {
                    confirmationFragment.AppCompatActivity = "Cannot recognize, Eyes closed!!!";
                    new Thread("Cannot recognize, Eyes closed!!!") {
                        public final void run() {
                            ConfirmationFragment.this.Keep.runOnUiThread(new Runnable() {
                                public final void run() {
                                    Toast.makeText(ConfirmationFragment.this.MediaBrowserCompat$ItemReceiver, "Cannot recognize face!!!", 0).show();
                                }
                            });
                        }
                    }.start();
                    return;
                } else if (i2 < 0) {
                    confirmationFragment.AppCompatActivity = "Cannot recognize, Left eye closed!!!";
                    new Thread("Cannot recognize, Left eye closed!!!") {
                        public final void run() {
                            ConfirmationFragment.this.Keep.runOnUiThread(new Runnable() {
                                public final void run() {
                                    Toast.makeText(ConfirmationFragment.this.MediaBrowserCompat$ItemReceiver, "Cannot recognize face!!!", 0).show();
                                }
                            });
                        }
                    }.start();
                    return;
                } else if (((double) isRightEyeOpenProbability) < 0.3d) {
                    confirmationFragment.AppCompatActivity = "Cannot recognize, Right eye closed!!!";
                    new Thread("Cannot recognize, Right eye closed!!!") {
                        public final void run() {
                            ConfirmationFragment.this.Keep.runOnUiThread(new Runnable() {
                                public final void run() {
                                    Toast.makeText(ConfirmationFragment.this.MediaBrowserCompat$ItemReceiver, "Cannot recognize face!!!", 0).show();
                                }
                            });
                        }
                    }.start();
                    return;
                } else {
                    double d = (double) confirmationFragment.PlaybackStateCompat$CustomAction;
                    if (d != 0.0d) {
                        double d2 = (double) confirmationFragment.setExpandedFormat;
                        if (d2 != 0.0d) {
                            double d3 = d - d2;
                            confirmationFragment.MediaSessionCompat$QueueItem = d3;
                            double d4 = d3 / 0.25d;
                            confirmationFragment.setItemInvoker = d4;
                            confirmationFragment.ParcelableVolumeInfo = d4 / 0.75d;
                            confirmationFragment.ActionMenuItemView = (d4 - d3) / 2.0d;
                            String str3 = RatingCompat;
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(">>>>> leftEyeX ");
                            sb9.append((int) confirmationFragment.PlaybackStateCompat$CustomAction);
                            Log.d(str3, sb9.toString());
                            String str4 = RatingCompat;
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(">>>>> rightEyeX ");
                            sb10.append((int) confirmationFragment.setExpandedFormat);
                            Log.d(str4, sb10.toString());
                            String str5 = RatingCompat;
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(">>>>> d ");
                            sb11.append((int) confirmationFragment.MediaSessionCompat$QueueItem);
                            Log.d(str5, sb11.toString());
                            String str6 = RatingCompat;
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(">>>>> w  ");
                            sb12.append((int) confirmationFragment.setItemInvoker);
                            Log.d(str6, sb12.toString());
                            String str7 = RatingCompat;
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append(">>>>> bitmaptemp w  ");
                            sb13.append(confirmationFragment.f6397x50fd9e4a.getWidth());
                            Log.d(str7, sb13.toString());
                            String str8 = RatingCompat;
                            StringBuilder sb14 = new StringBuilder();
                            sb14.append(">>>>> top1  ");
                            sb14.append((int) confirmationFragment.ActionMenuItemView);
                            Log.d(str8, sb14.toString());
                            confirmationFragment.MediaSessionCompat$Token = (confirmationFragment.setItemInvoker * 0.6d) + 1.0d;
                            String str9 = RatingCompat;
                            StringBuilder sb15 = new StringBuilder();
                            sb15.append(">>>>> bottom  ");
                            sb15.append((int) confirmationFragment.MediaSessionCompat$Token);
                            Log.d(str9, sb15.toString());
                            float f = confirmationFragment.setExpandedFormat;
                            float f2 = confirmationFragment.PlaybackStateCompat$CustomAction;
                            if (f < f2) {
                                confirmationFragment.setPadding = ((double) f) - confirmationFragment.ActionMenuItemView;
                                String str10 = RatingCompat;
                                StringBuilder sb16 = new StringBuilder();
                                sb16.append("rightEyeX x1 ");
                                sb16.append(String.valueOf(confirmationFragment.setPadding));
                                Log.e(str10, sb16.toString());
                            } else if (f2 < f) {
                                confirmationFragment.setPadding = ((double) f2) - confirmationFragment.ActionMenuItemView;
                                String str11 = RatingCompat;
                                StringBuilder sb17 = new StringBuilder();
                                sb17.append("leftEyeX x1 ");
                                sb17.append(String.valueOf(confirmationFragment.setPadding));
                                Log.e(str11, sb17.toString());
                            }
                            confirmationFragment.setIcon = ((double) ((confirmationFragment.setChecked + confirmationFragment.setHasDecor) / 2.0f)) - (confirmationFragment.ParcelableVolumeInfo - confirmationFragment.MediaSessionCompat$Token);
                            double d5 = confirmationFragment.setPadding;
                            if (d5 < 0.0d) {
                                confirmationFragment.setPadding = 10.0d;
                            } else {
                                confirmationFragment.setPadding = d5 + 10.0d;
                            }
                            double d6 = confirmationFragment.setIcon;
                            if (d6 < 0.0d) {
                                confirmationFragment.setIcon = 30.0d;
                            } else {
                                confirmationFragment.setIcon = d6 + 30.0d;
                            }
                            if (confirmationFragment.setItemInvoker + confirmationFragment.setPadding > ((double) confirmationFragment.MediaBrowserCompat$CustomActionResultReceiver.getWidth())) {
                                confirmationFragment.setItemInvoker = ((double) confirmationFragment.MediaBrowserCompat$CustomActionResultReceiver.getWidth()) - confirmationFragment.setPadding;
                            }
                            if (confirmationFragment.ParcelableVolumeInfo + confirmationFragment.setIcon > ((double) confirmationFragment.MediaBrowserCompat$CustomActionResultReceiver.getHeight())) {
                                confirmationFragment.ParcelableVolumeInfo = ((double) confirmationFragment.MediaBrowserCompat$CustomActionResultReceiver.getHeight()) - confirmationFragment.setIcon;
                            }
                            String str12 = RatingCompat;
                            StringBuilder sb18 = new StringBuilder();
                            sb18.append(">>>>> rightEyeY  ");
                            sb18.append((int) confirmationFragment.setChecked);
                            Log.d(str12, sb18.toString());
                            String str13 = RatingCompat;
                            StringBuilder sb19 = new StringBuilder();
                            sb19.append(">>>>> leftEyeY  ");
                            sb19.append((int) confirmationFragment.setHasDecor);
                            Log.d(str13, sb19.toString());
                            String str14 = RatingCompat;
                            StringBuilder sb20 = new StringBuilder();
                            sb20.append(">>>>> h  ");
                            sb20.append((int) confirmationFragment.ParcelableVolumeInfo);
                            Log.d(str14, sb20.toString());
                            String str15 = RatingCompat;
                            StringBuilder sb21 = new StringBuilder();
                            sb21.append(">>>>> y  ");
                            sb21.append((int) confirmationFragment.setIcon);
                            Log.d(str15, sb21.toString());
                            String str16 = RatingCompat;
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append(">>>>> x ");
                            sb22.append((int) confirmationFragment.setPadding);
                            Log.d(str16, sb22.toString());
                            String str17 = RatingCompat;
                            StringBuilder sb23 = new StringBuilder();
                            sb23.append(">>>>> width");
                            sb23.append((int) confirmationFragment.setItemInvoker);
                            Log.d(str17, sb23.toString());
                            String str18 = RatingCompat;
                            StringBuilder sb24 = new StringBuilder();
                            sb24.append(">>>>> currentImg width");
                            sb24.append(confirmationFragment.MediaBrowserCompat$CustomActionResultReceiver.getWidth());
                            Log.d(str18, sb24.toString());
                            String str19 = RatingCompat;
                            StringBuilder sb25 = new StringBuilder();
                            sb25.append(">>>>> height");
                            sb25.append((int) confirmationFragment.ParcelableVolumeInfo);
                            Log.d(str19, sb25.toString());
                            confirmationFragment.f6397x50fd9e4a = Bitmap.createBitmap(confirmationFragment.f6397x50fd9e4a, (int) confirmationFragment.setPadding, (int) confirmationFragment.setIcon, (int) confirmationFragment.setItemInvoker, (int) confirmationFragment.ParcelableVolumeInfo);
                            if (setRecipients.MediaMetadataCompat().MediaBrowserCompat$SearchResultReceiver) {
                                new Thread() {
                                    public final void run() {
                                        ConfirmationFragment.this.Keep.runOnUiThread(new Runnable() {
                                            public final void run() {
                                                ConfirmationFragment.this.read.setImageBitmap(ConfirmationFragment.this.f6397x50fd9e4a);
                                                ConfirmationFragment.this.MediaBrowserCompat$MediaItem.setVisibility(8);
                                                ConfirmationFragment.this.setContentView.setVisibility(8);
                                                ConfirmationFragment.this.setContentView.callOnClick();
                                            }
                                        });
                                    }
                                }.start();
                            } else {
                                new Thread() {
                                    public final void run() {
                                        ConfirmationFragment.this.Keep.runOnUiThread(new Runnable() {
                                            public final void run() {
                                                ConfirmationFragment.this.read.setImageBitmap(ConfirmationFragment.this.f6397x50fd9e4a);
                                            }
                                        });
                                    }
                                }.start();
                            }
                            confirmationFragment.MediaSessionCompat$ResultReceiverWrapper = true;
                            return;
                        }
                    }
                    Log.e("Catcha", "");
                    confirmationFragment.AppCompatActivity = "Cannot recognize face!!!";
                    new Thread("Cannot recognize face!!!") {
                        public final void run() {
                            ConfirmationFragment.this.Keep.runOnUiThread(new Runnable() {
                                public final void run() {
                                    Toast.makeText(ConfirmationFragment.this.MediaBrowserCompat$ItemReceiver, "Cannot recognize face!!!", 0).show();
                                }
                            });
                        }
                    }.start();
                    return;
                }
            }
        }
    }
}
