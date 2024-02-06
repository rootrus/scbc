package com.scb.phone.view.fragment.easycash.financialinformation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.easycash.EasycashAdditionalDocumentTypeActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.easycash.BaseTakePhotoFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C6390x3b6ff3c3;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.ImageProcessor;
import p040o.JuristicService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PrepaidTravelService;
import p040o.getPrepaidTravelBlockStatus;
import p040o.imageOut;
import p040o.setAutoFocusEnabled;
import p040o.setTapText;

public class AdditionDocumentTakePhotoFragment extends BaseTakePhotoFragment implements C6390x3b6ff3c3.read {
    setAutoFocusEnabled.IconCompatParcelizer IconCompatParcelizer;
    private C5925xb5b84be0 MediaBrowserCompat$MediaItem;
    private IOrientationGuidanceCalculator MediaBrowserCompat$SearchResultReceiver;
    @BindView
    Button btnTakePhoto;
    @BindView
    Button btnUploadPhoto;
    @HmlPinActivity
    public ImageProcessor.IpProgressClient.C34831 presenter;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C5925xb5b84be0) {
            this.MediaBrowserCompat$MediaItem = (C5925xb5b84be0) context;
        } else if (getParentFragment() instanceof C5925xb5b84be0) {
            this.MediaBrowserCompat$MediaItem = (C5925xb5b84be0) getParentFragment();
        }
        if (context instanceof IOrientationGuidanceCalculator) {
            this.MediaBrowserCompat$SearchResultReceiver = (IOrientationGuidanceCalculator) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87142131493941, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && getActivity() != null) {
            boolean z = true;
            if (i == 107) {
                String stringExtra = intent.getStringExtra("EXTRA_RESULT_ADDITION_DOCUMENT_TYPE");
                String stringExtra2 = intent.getStringExtra("EXTRA_RESULT_ADDITION_DOCUMENT_DESC");
                ImageProcessor.IpProgressClient.C34831 r11 = this.presenter;
                String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                String read = FragmentBuilder_BindDepositSelectorFragment.read(this.MediaBrowserCompat$CustomActionResultReceiver);
                String read2 = this.MediaBrowserCompat$SearchResultReceiver.read();
                String MediaBrowserCompat$SearchResultReceiver2 = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver();
                String write = this.MediaBrowserCompat$SearchResultReceiver.write();
                if (r11.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    r11.RatingCompat.AlertController$RecycleListView();
                }
                r11.read.MediaBrowserCompat$CustomActionResultReceiver("documentFile", str, stringExtra, read2, MediaBrowserCompat$SearchResultReceiver2, write);
                r11.read.IconCompatParcelizer(new ImageProcessor.IpProgressClient.C34831.write(read, stringExtra2));
            } else if (i == 10003 || i == 10005) {
                try {
                    ImageProcessor.IpProgressClient.C34831 r10 = this.presenter;
                    if (FragmentBuilder_BindDepositSelectorFragment.write(this.MediaBrowserCompat$CustomActionResultReceiver) > 7340032) {
                        imageOut imageout = imageOut.MediaBrowserCompat$ItemReceiver;
                        if (r10.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            imageout.IconCompatParcelizer(r10.RatingCompat);
                            return;
                        }
                        return;
                    }
                    ImageProcessor.AnalysisCompleteListener analysisCompleteListener = ImageProcessor.AnalysisCompleteListener.MediaBrowserCompat$CustomActionResultReceiver;
                    if (r10.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        analysisCompleteListener.IconCompatParcelizer(r10.RatingCompat);
                    }
                } catch (RuntimeException unused) {
                    CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.unable_to_proceed_error_title).MediaBrowserCompat$ItemReceiver("Could not upload photo");
                    MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), PrepaidTravelService.IconCompatParcelizer).show();
                }
            }
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.unable_to_proceed_error_title).IconCompatParcelizer((int) R.string.addition_document_image_size_exceed);
        IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.ok), getPrepaidTravelBlockStatus.write).show();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$MediaItem.RatingCompat();
    }

    public final void write() {
        this.MediaBrowserCompat$MediaItem.MediaMetadataCompat();
    }

    public final void IconCompatParcelizer() {
        this.btnTakePhoto.setEnabled(true);
        this.btnUploadPhoto.setEnabled(true);
    }

    public final void read() {
        this.btnTakePhoto.setEnabled(false);
        this.btnUploadPhoto.setEnabled(false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent read = EasycashAdditionalDocumentTypeActivity.read(getContext(), this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver(), this.IconCompatParcelizer);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 107);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.presenter.onDestroy();
        super.onDestroy();
    }

    @OnClick
    public void onSelectImageClicked() {
        JuristicService.read(this);
    }

    @OnClick
    public void onTakePhotoButtonClicked() {
        JuristicService.MediaBrowserCompat$ItemReceiver(this);
    }
}
