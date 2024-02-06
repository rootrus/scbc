package com.scb.phone.view.fragment.hml.submission;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.hml.CustomTutorialImageAndText;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C1424xf54be1d0;
import p040o.CrashlyticsController;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;
import p040o.proxyGetOnDevicePassportDeserializer;
import p040o.setFormTypeId;
import p040o.setFormTypeId$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setFormTypeId$MediaBrowserCompat$ItemReceiver;
import p040o.writeUInt64NoTag;

public final class HmlDocumentKofaxTutorialFragment extends BaseFragment implements proxyGetOnDevicePassportDeserializer.write {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    @BindView
    public ImageView documentDoImage;
    @BindView
    public CustomTutorialImageAndText dontImage1;
    @BindView
    public CustomTutorialImageAndText dontImage10;
    @BindView
    public CustomTutorialImageAndText dontImage2;
    @BindView
    public CustomTutorialImageAndText dontImage3;
    @BindView
    public CustomTutorialImageAndText dontImage4;
    @BindView
    public CustomTutorialImageAndText dontImage5;
    @BindView
    public CustomTutorialImageAndText dontImage6;
    @BindView
    public CustomTutorialImageAndText dontImage7;
    @BindView
    public CustomTutorialImageAndText dontImage8;
    @BindView
    public CustomTutorialImageAndText dontImage9;
    @BindView
    public ImageView perfectExampleImage;
    @HmlPinActivity
    public setFormTypeId presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    @OnClick
    public final void onNextButtonClicked() {
        setFormTypeId setformtypeid = this.presenter;
        if (setformtypeid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setFormTypeId$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        if (setformtypeid.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setformtypeid.RatingCompat);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86782131493905, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setFormTypeId setformtypeid = this.presenter;
        if (setformtypeid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setformtypeid.MediaBrowserCompat$ItemReceiver(this);
        setFormTypeId setformtypeid2 = this.presenter;
        if (setformtypeid2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer setformtypeid_mediabrowsercompat_itemreceiver = new setFormTypeId$MediaBrowserCompat$ItemReceiver(setformtypeid2);
        if (setformtypeid2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setformtypeid_mediabrowsercompat_itemreceiver.IconCompatParcelizer(setformtypeid2.RatingCompat);
        }
        return inflate;
    }

    public final void IconCompatParcelizer(CrashlyticsController.AnySessionPartFileFilter anySessionPartFileFilter) {
        onGetStartedClick.write((Object) anySessionPartFileFilter, "display");
        ImageView imageView = this.documentDoImage;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentDoImage");
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(getContext(), (int) R.drawable.document_tutorial_placeholder_big, imageView, anySessionPartFileFilter.MediaBrowserCompat$CustomActionResultReceiver);
        ImageView imageView2 = this.perfectExampleImage;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("perfectExampleImage");
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(getContext(), (int) R.drawable.document_tutorial_placeholder_big, imageView2, anySessionPartFileFilter.MediaSessionCompat$ResultReceiverWrapper);
        CustomTutorialImageAndText customTutorialImageAndText = this.dontImage1;
        if (customTutorialImageAndText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dontImage1");
        }
        customTutorialImageAndText.setImage(anySessionPartFileFilter.IconCompatParcelizer, R.drawable.document_tutorial_placeholder_small);
        CustomTutorialImageAndText customTutorialImageAndText2 = this.dontImage2;
        if (customTutorialImageAndText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dontImage2");
        }
        customTutorialImageAndText2.setImage(anySessionPartFileFilter.MediaBrowserCompat$ItemReceiver, R.drawable.document_tutorial_placeholder_small);
        CustomTutorialImageAndText customTutorialImageAndText3 = this.dontImage3;
        if (customTutorialImageAndText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dontImage3");
        }
        customTutorialImageAndText3.setImage(anySessionPartFileFilter.write, R.drawable.document_tutorial_placeholder_small);
        CustomTutorialImageAndText customTutorialImageAndText4 = this.dontImage4;
        if (customTutorialImageAndText4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dontImage4");
        }
        customTutorialImageAndText4.setImage(anySessionPartFileFilter.RatingCompat, R.drawable.document_tutorial_placeholder_small);
        CustomTutorialImageAndText customTutorialImageAndText5 = this.dontImage5;
        if (customTutorialImageAndText5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dontImage5");
        }
        customTutorialImageAndText5.setImage(anySessionPartFileFilter.MediaBrowserCompat$SearchResultReceiver, R.drawable.document_tutorial_placeholder_small);
        CustomTutorialImageAndText customTutorialImageAndText6 = this.dontImage6;
        if (customTutorialImageAndText6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dontImage6");
        }
        customTutorialImageAndText6.setImage(anySessionPartFileFilter.MediaDescriptionCompat, R.drawable.document_tutorial_placeholder_small);
        CustomTutorialImageAndText customTutorialImageAndText7 = this.dontImage7;
        if (customTutorialImageAndText7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dontImage7");
        }
        customTutorialImageAndText7.setImage(anySessionPartFileFilter.MediaBrowserCompat$MediaItem, R.drawable.document_tutorial_placeholder_small);
        CustomTutorialImageAndText customTutorialImageAndText8 = this.dontImage8;
        if (customTutorialImageAndText8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dontImage8");
        }
        customTutorialImageAndText8.setImage(anySessionPartFileFilter.MediaMetadataCompat, R.drawable.document_tutorial_placeholder_small);
        CustomTutorialImageAndText customTutorialImageAndText9 = this.dontImage9;
        if (customTutorialImageAndText9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dontImage9");
        }
        customTutorialImageAndText9.setImage(anySessionPartFileFilter.ParcelableVolumeInfo, R.drawable.document_tutorial_placeholder_small);
        CustomTutorialImageAndText customTutorialImageAndText10 = this.dontImage10;
        if (customTutorialImageAndText10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dontImage10");
        }
        customTutorialImageAndText10.setImage(anySessionPartFileFilter.read, R.drawable.document_tutorial_placeholder_small);
    }

    public final void IconCompatParcelizer() {
        setFormTypeId setformtypeid = this.presenter;
        if (setformtypeid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setFormTypeId.write.IconCompatParcelizer;
        if (setformtypeid.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setformtypeid.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void write() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof C1424xf54be1d0)) {
            activity = null;
        }
        C1424xf54be1d0 proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver = (C1424xf54be1d0) activity;
        if (proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver != null) {
            proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver.read();
        }
    }

    public final void read() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof C1424xf54be1d0)) {
            activity = null;
        }
        C1424xf54be1d0 proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver = (C1424xf54be1d0) activity;
        if (proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver != null) {
            proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer("p10x1_document_salaryslip_kofaxcamera_tutorial");
        }
    }

    public final void onDestroy() {
        setFormTypeId setformtypeid = this.presenter;
        if (setformtypeid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setformtypeid.onDestroy();
        super.onDestroy();
    }
}
