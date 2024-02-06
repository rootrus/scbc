package com.scb.phone.view.activity.ndid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.C4119bv;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getBackImage;
import p040o.getKernelIDAdd;
import p040o.setRefocusBeforeCaptureEnabled;
import p040o.setTapText;
import p040o.useVideoPlayerCameraSourceProvider;

public class NdidIdpShareSuccessActivity extends BaseActivity implements getBackImage {
    private getKernelIDAdd MediaMetadataCompat = new getKernelIDAdd();
    @BindView
    TextView descriptionOne;
    @BindView
    TextView descriptionTwo;
    @HmlPinActivity
    public C4119bv presenter;
    @BindView
    TextView submitDateTime;

    public void onBackPressed() {
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, List<String> list) {
        Intent putStringArrayListExtra = new Intent(context, NdidIdpShareSuccessActivity.class).putExtra("submitdatetime", str).putStringArrayListExtra("remarks", new ArrayList(list));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, putStringArrayListExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79002131493125);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "ndid_idp_success_screen");
        C4119bv bvVar = this.presenter;
        useVideoPlayerCameraSourceProvider usevideoplayercamerasourceprovider = new useVideoPlayerCameraSourceProvider(getIntent().getStringExtra("submitdatetime"), getIntent().getStringArrayListExtra("remarks"));
        if (bvVar.RatingCompat != null) {
            usevideoplayercamerasourceprovider.IconCompatParcelizer(bvVar.RatingCompat);
        }
    }

    public final void write(String str, List<String> list) {
        this.submitDateTime.setText(str);
        if (!list.isEmpty()) {
            this.descriptionOne.setText(list.get(0));
        }
        if (list.size() > 1) {
            this.descriptionTwo.setText(list.get(1));
        }
    }

    @OnClick
    public void onReturnHomeButtonClick() {
        C4119bv bvVar = this.presenter;
        setRefocusBeforeCaptureEnabled setrefocusbeforecaptureenabled = setRefocusBeforeCaptureEnabled.MediaBrowserCompat$ItemReceiver;
        if (bvVar.RatingCompat != null) {
            setrefocusbeforecaptureenabled.IconCompatParcelizer(bvVar.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent IconCompatParcelizer = HomeActivity.IconCompatParcelizer((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
