package p104sg.nec.com.epid_sdk_master.fragment;

import android.os.CountDownTimer;
import android.util.Log;
import com.google.android.gms.vision.CameraSource;
import p040o.setRecipients;

/* renamed from: sg.nec.com.epid_sdk_master.fragment.CaptureFragment$MediaBrowserCompat$ItemReceiver */
public class CaptureFragment$MediaBrowserCompat$ItemReceiver extends CountDownTimer {
    private /* synthetic */ CaptureFragment read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptureFragment$MediaBrowserCompat$ItemReceiver(CaptureFragment captureFragment, long j) {
        super(j, 1000);
        this.read = captureFragment;
    }

    public final void onFinish() {
        CameraSource cameraSource;
        CameraSource cameraSource2;
        CameraSource cameraSource3;
        CameraSource cameraSource4;
        CameraSource cameraSource5;
        CameraSource cameraSource6;
        Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, " MyCountDownTimer onFinish ");
        this.read.setIcon.sendEmptyMessage(99);
        if (setRecipients.MediaMetadataCompat().RatingCompat == setRecipients.IconCompatParcelizer.challenge_first) {
            if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.size() == 1) {
                if (setRecipients.MediaMetadataCompat().AppCompatActivity) {
                    this.read.read.add(this.read.RatingCompat.MediaBrowserCompat$ItemReceiver());
                    String MediaBrowserCompat$CustomActionResultReceiver = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                    StringBuilder sb = new StringBuilder();
                    sb.append("actionImage Size=");
                    sb.append(this.read.read.size());
                    Log.e(MediaBrowserCompat$CustomActionResultReceiver, sb.toString());
                    this.read.MediaMetadataCompat.write(this.read.read);
                    return;
                }
                if (!(this.read.setItemInvoker == null || (cameraSource6 = this.read.setItemInvoker.MediaBrowserCompat$ItemReceiver) == null)) {
                    cameraSource6.stop();
                }
                CaptureFragment.write(this.read, "Please try again!!!!!");
            } else if (!this.read.AbsActionBarView) {
                if (this.read.AlertController$RecycleListView == 0) {
                    CaptureFragment captureFragment = this.read;
                    int unused = captureFragment.AlertController$RecycleListView = captureFragment.AlertController$RecycleListView + 1;
                    if (setRecipients.MediaMetadataCompat().AppCompatActivity) {
                        this.read.read.add(this.read.RatingCompat.MediaBrowserCompat$ItemReceiver());
                        String MediaBrowserCompat$CustomActionResultReceiver2 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("actionImage Size=");
                        sb2.append(this.read.read.size());
                        Log.e(MediaBrowserCompat$CustomActionResultReceiver2, sb2.toString());
                    }
                    this.read.MediaBrowserCompat$ItemReceiver();
                } else if (setRecipients.MediaMetadataCompat().AppCompatActivity) {
                    this.read.read.add(this.read.RatingCompat.MediaBrowserCompat$ItemReceiver());
                    String MediaBrowserCompat$CustomActionResultReceiver3 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("actionImage Size=");
                    sb3.append(this.read.read.size());
                    Log.e(MediaBrowserCompat$CustomActionResultReceiver3, sb3.toString());
                    this.read.MediaMetadataCompat.write(this.read.read);
                } else {
                    if (!(this.read.setItemInvoker == null || (cameraSource5 = this.read.setItemInvoker.MediaBrowserCompat$ItemReceiver) == null)) {
                        cameraSource5.stop();
                    }
                    CaptureFragment.write(this.read, "Please try again!!!!!");
                }
            } else if (!this.read.setPrimaryBackground) {
                if (this.read.AlertController$RecycleListView == 1) {
                    CaptureFragment captureFragment2 = this.read;
                    int unused2 = captureFragment2.setBackgroundResource = captureFragment2.setBackgroundResource + 1;
                }
                if (this.read.setBackgroundResource == 0) {
                    CaptureFragment captureFragment3 = this.read;
                    int unused3 = captureFragment3.setBackgroundResource = captureFragment3.setBackgroundResource + 1;
                    if (setRecipients.MediaMetadataCompat().AppCompatActivity) {
                        this.read.read.add(this.read.RatingCompat.MediaBrowserCompat$ItemReceiver());
                        String MediaBrowserCompat$CustomActionResultReceiver4 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("actionImage Size=");
                        sb4.append(this.read.read.size());
                        Log.e(MediaBrowserCompat$CustomActionResultReceiver4, sb4.toString());
                    }
                    this.read.MediaBrowserCompat$ItemReceiver();
                } else if (setRecipients.MediaMetadataCompat().AppCompatActivity) {
                    this.read.read.add(this.read.RatingCompat.MediaBrowserCompat$ItemReceiver());
                    String MediaBrowserCompat$CustomActionResultReceiver5 = CaptureFragment.MediaBrowserCompat$ItemReceiver;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("actionImage Size=");
                    sb5.append(this.read.read.size());
                    Log.e(MediaBrowserCompat$CustomActionResultReceiver5, sb5.toString());
                    this.read.MediaMetadataCompat.write(this.read.read);
                } else {
                    if (!(this.read.setItemInvoker == null || (cameraSource4 = this.read.setItemInvoker.MediaBrowserCompat$ItemReceiver) == null)) {
                        cameraSource4.stop();
                    }
                    CaptureFragment.write(this.read, "Please try again!!!!!");
                }
            }
        } else if (setRecipients.MediaMetadataCompat().IconCompatParcelizer.size() == 1) {
            if (!(this.read.setItemInvoker == null || (cameraSource3 = this.read.setItemInvoker.MediaBrowserCompat$ItemReceiver) == null)) {
                cameraSource3.stop();
            }
            CaptureFragment.write(this.read, "Please try again!!!!!");
            this.read.MediaDescriptionCompat.cancel(true);
            this.read.write.MediaBrowserCompat$ItemReceiver(false);
        } else if (!this.read.AbsActionBarView) {
            if (this.read.AlertController$RecycleListView == 0) {
                CaptureFragment captureFragment4 = this.read;
                int unused4 = captureFragment4.AlertController$RecycleListView = captureFragment4.AlertController$RecycleListView + 1;
                this.read.MediaBrowserCompat$ItemReceiver();
                return;
            }
            Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "user fails first two time continuously countChallenge1");
            if (!(this.read.setItemInvoker == null || (cameraSource2 = this.read.setItemInvoker.MediaBrowserCompat$ItemReceiver) == null)) {
                cameraSource2.stop();
            }
            CaptureFragment.write(this.read, "Please try again!!!!!");
            this.read.MediaDescriptionCompat.cancel(true);
            this.read.write.MediaBrowserCompat$ItemReceiver(false);
        } else if (!this.read.setPrimaryBackground) {
            if (this.read.AlertController$RecycleListView == 1) {
                CaptureFragment captureFragment5 = this.read;
                int unused5 = captureFragment5.setBackgroundResource = captureFragment5.setBackgroundResource + 1;
                Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "user first time fail and third time fail then turn out go to user last time fail two time");
            }
            if (this.read.setBackgroundResource == 0) {
                CaptureFragment captureFragment6 = this.read;
                int unused6 = captureFragment6.setBackgroundResource = captureFragment6.setBackgroundResource + 1;
                this.read.MediaBrowserCompat$ItemReceiver();
                return;
            }
            Log.e(CaptureFragment.MediaBrowserCompat$ItemReceiver, "user fails last two time continuously countChallenge2");
            if (!(this.read.setItemInvoker == null || (cameraSource = this.read.setItemInvoker.MediaBrowserCompat$ItemReceiver) == null)) {
                cameraSource.stop();
            }
            CaptureFragment.write(this.read, "Please try again!!!");
            this.read.MediaDescriptionCompat.cancel(true);
            this.read.write.MediaBrowserCompat$ItemReceiver(false);
        }
    }

    public final void onTick(long j) {
        this.read.ActionBarContainer.setVisibility(0);
    }
}
