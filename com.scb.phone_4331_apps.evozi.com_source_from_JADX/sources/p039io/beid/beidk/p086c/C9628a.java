package p039io.beid.beidk.p086c;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import p040o.CloseAccountConfirmationOtpActivity;
import p040o.onSearchButtonClick;

/* renamed from: io.beid.beidk.c.a */
public class C9628a extends Fragment {
    private static final String MediaBrowserCompat$CustomActionResultReceiver = C9628a.class.getName();
    private View IconCompatParcelizer;
    private Paint MediaBrowserCompat$ItemReceiver = new Paint();
    /* access modifiers changed from: private */
    public String read;
    /* access modifiers changed from: private */
    public Activity write;

    public C9628a() {
        new Handler(new Handler.Callback() {
            public final boolean handleMessage(Message message) {
                if (message.what != 0) {
                    return false;
                }
                C9628a.read();
                C9628a.MediaBrowserCompat$CustomActionResultReceiver().setVisibility(8);
                String unused = C9628a.this.read = "Verification error, please try again";
                C9628a aVar = C9628a.this;
                new Thread(aVar.read) {
                    public final void run() {
                        C9628a.this.write.runOnUiThread(new Runnable() {
                            public final void run() {
                                Toast.makeText((Context) null, "Cannot recognize face!!!", 0).show();
                            }
                        });
                    }
                }.start();
                return false;
            }
        });
    }

    static /* synthetic */ RelativeLayout MediaBrowserCompat$CustomActionResultReceiver() {
        return null;
    }

    static /* synthetic */ boolean read() {
        return false;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.write = activity;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Log.e(MediaBrowserCompat$CustomActionResultReceiver, "OnCreateView ");
        getActivity();
        PreferenceManager.getDefaultSharedPreferences(getActivity());
        this.write = getActivity();
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = layoutInflater.inflate(onSearchButtonClick.read.fragment_confirmation, viewGroup, false);
        }
        return this.IconCompatParcelizer;
    }

    public void onPause() {
        super.onPause();
        this.write.setRequestedOrientation(10);
    }

    public void onStart() {
        super.onStart();
        Log.e(MediaBrowserCompat$CustomActionResultReceiver, "onStart created");
    }

    public void onResume() {
        this.write.setRequestedOrientation(1);
        super.onResume();
        if (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat == CloseAccountConfirmationOtpActivity.IconCompatParcelizer.challenge_first || (CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat == CloseAccountConfirmationOtpActivity.IconCompatParcelizer.face_first && !CloseAccountConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().read)) {
            this.read = "Cannot recognize face!!!";
            new Thread("Cannot recognize face!!!") {
                public final void run() {
                    C9628a.this.write.runOnUiThread(new Runnable() {
                        public final void run() {
                            Toast.makeText((Context) null, "Cannot recognize face!!!", 0).show();
                        }
                    });
                }
            }.start();
        }
    }
}
