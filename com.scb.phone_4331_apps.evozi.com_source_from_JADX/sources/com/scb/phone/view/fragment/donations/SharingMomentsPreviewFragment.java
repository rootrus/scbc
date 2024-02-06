package com.scb.phone.view.fragment.donations;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import org.jmrtd.lds.ImageInfo;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.XVrsBinarization;
import p040o.XVrsDocument;
import p040o.access$2300;
import p040o.getDeviceFile;
import p040o.getDocumentInstructions;
import p040o.getImageTooLight;
import p040o.nativeDetect;
import p040o.setTapText;

public class SharingMomentsPreviewFragment extends BaseFragment implements getImageTooLight {
    @BindView
    ImageView mSharingImage;
    @BindView
    ImageView mSharingLogo;
    @BindView
    TextView mSubText;
    @BindView
    TextView mTitle;
    @HmlPinActivity
    public XVrsDocument sharingMomentPreviewPresenter;

    public static SharingMomentsPreviewFragment read(getDeviceFile getdevicefile) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_SHARING_PREVIEW_DISPLAY", getdevicefile);
        SharingMomentsPreviewFragment sharingMomentsPreviewFragment = new SharingMomentsPreviewFragment();
        sharingMomentsPreviewFragment.setArguments(bundle);
        return sharingMomentsPreviewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86812131493908, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setTransitioning();
        this.sharingMomentPreviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        XVrsDocument xVrsDocument = this.sharingMomentPreviewPresenter;
        xVrsDocument.write = (getDeviceFile) getArguments().getParcelable("com.scb.phone.EXTRA_SHARING_PREVIEW_DISPLAY");
        XVrsBinarization xVrsBinarization = new XVrsBinarization(xVrsDocument);
        if (xVrsDocument.RatingCompat != null) {
            z = true;
        }
        if (z) {
            xVrsBinarization.IconCompatParcelizer(xVrsDocument.RatingCompat);
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(getDeviceFile getdevicefile) {
        this.mTitle.setText(getdevicefile.MediaBrowserCompat$CustomActionResultReceiver);
        this.mSubText.setText(getdevicefile.IconCompatParcelizer);
        Picasso.read().write(getdevicefile.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.donations_place_holder).read(this.mSharingImage, (FragmentBuilder_BindEkycFragment) null);
        getContext();
        FragmentBuilder_BindDepositSelectorFragment.read((int) R.drawable.donations_place_holder_logo, this.mSharingLogo, getdevicefile.read);
    }

    public final void write() {
        this.sharingMomentPreviewPresenter.MediaBrowserCompat$ItemReceiver(R.string.share_error, access$2300.write.NAVIGATE_BACK);
    }

    @OnClick
    public void shareMoment() {
        getDocumentInstructions.MediaBrowserCompat$ItemReceiver(this);
    }

    public static /* synthetic */ void read(SharingMomentsPreviewFragment sharingMomentsPreviewFragment, Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", uri);
        Intent createChooser = Intent.createChooser(intent, sharingMomentsPreviewFragment.getString(R.string.share));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = sharingMomentsPreviewFragment.getActivity();
            if (activity != null) {
                createChooser = setTapText.write(activity, createChooser).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(createChooser.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            sharingMomentsPreviewFragment.startActivity(createChooser);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void read(SharingMomentsPreviewFragment sharingMomentsPreviewFragment) {
        XVrsDocument xVrsDocument = sharingMomentsPreviewFragment.sharingMomentPreviewPresenter;
        nativeDetect nativedetect = nativeDetect.read;
        if (xVrsDocument.RatingCompat != null) {
            nativedetect.IconCompatParcelizer(xVrsDocument.RatingCompat);
        }
    }
}
