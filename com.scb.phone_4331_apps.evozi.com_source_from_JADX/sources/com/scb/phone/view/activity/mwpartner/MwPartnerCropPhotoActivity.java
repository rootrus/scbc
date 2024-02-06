package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import com.lyft.android.scissors.CropView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import java.io.File;
import p040o.CTRSV$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.CameraSource;
import p040o.CustomCheckboxView_ViewBinding;
import p040o.CustomProfileImageView;
import p040o.CustomProfileImageView_ViewBinding;
import p040o.FragmentBuilder_BindDirectDebitReviewFragment;
import p040o.HmlPinActivity;
import p040o.KtaCheckExtractor_Factory;
import p040o.TaskRunner;
import p040o.getYear;
import p040o.isAfter;
import p040o.isBefore;
import p040o.isInstanceOfView;
import p040o.onCheckBoxClick;
import p040o.setBorderWidth;
import p040o.setLinkText;

public class MwPartnerCropPhotoActivity extends BaseActivity implements KtaCheckExtractor_Factory {
    @BindView
    public CropView cropView;
    @HmlPinActivity
    public TaskRunner.C3843b presenter;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
        return new Intent(context, MwPartnerCropPhotoActivity.class).putExtra("PHOTO_PATH", str);
    }

    public static String read(Intent intent) {
        return intent.getStringExtra("PHOTO_PATH");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78902131493115);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        try {
            Uri parse = Uri.parse(getIntent().getExtras().getString("PHOTO_PATH"));
            CropView cropView2 = this.cropView;
            if (cropView2.IconCompatParcelizer == null) {
                cropView2.IconCompatParcelizer = new CropView.IconCompatParcelizer(cropView2);
            }
            CropView.IconCompatParcelizer iconCompatParcelizer = cropView2.IconCompatParcelizer;
            FragmentBuilder_BindDirectDebitReviewFragment fragmentBuilder_BindDirectDebitReviewFragment = new FragmentBuilder_BindDirectDebitReviewFragment(Glide.MediaBrowserCompat$ItemReceiver(this.cropView.getContext()));
            CTRSV$MediaBrowserCompat$CustomActionResultReceiver cTRSV$MediaBrowserCompat$CustomActionResultReceiver = new CTRSV$MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer.IconCompatParcelizer);
            cTRSV$MediaBrowserCompat$CustomActionResultReceiver.write = fragmentBuilder_BindDirectDebitReviewFragment;
            if (cTRSV$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.getWidth() == 0 && cTRSV$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.getHeight() == 0) {
                cTRSV$MediaBrowserCompat$CustomActionResultReceiver.write(parse);
            } else {
                cTRSV$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(parse);
            }
        } catch (NullPointerException | OutOfMemoryError e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            setResult(0, new Intent());
            finish();
        }
    }

    @OnClick
    public void cancelClick() {
        finish();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        isInstanceOfView.read(this, i, iArr);
    }

    @OnClick
    public void usePhotoClick() {
        isInstanceOfView.MediaBrowserCompat$ItemReceiver(this);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14870x50fd9e4a() {
        CameraSource.CameraSourceException IconCompatParcelizer = CameraSource.CameraSourceException.MediaBrowserCompat$ItemReceiver(new isBefore(this, new File(getCacheDir(), "scb_merchant_crop.jpg"))).MediaBrowserCompat$ItemReceiver(setLinkText.write()).IconCompatParcelizer(CustomCheckboxView_ViewBinding.write(), CustomProfileImageView_ViewBinding.IconCompatParcelizer);
        getYear getyear = new getYear(this);
        isAfter isafter = isAfter.IconCompatParcelizer;
        if (isafter != null) {
            CameraSource.CameraSourceException.read(new CustomProfileImageView(getyear, isafter, setBorderWidth.read()), IconCompatParcelizer);
            return;
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public static void MediaSessionCompat$Token() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    public final void read(String str) {
        Intent intent = new Intent();
        intent.putExtra("PHOTO_PATH", str);
        setResult(-1, intent);
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        setResult(0, new Intent());
        finish();
    }
}
