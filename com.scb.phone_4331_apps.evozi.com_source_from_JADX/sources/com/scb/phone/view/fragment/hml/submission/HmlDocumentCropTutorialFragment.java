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
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C10151xabe6d43c;
import p040o.C1424xf54be1d0;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.awaitEvent;
import p040o.onGetStartedClick;
import p040o.proxyGetOnDevicePassportDeserializer;
import p040o.setShortcutTypeOrdinal;
import p040o.writeUInt64NoTag;

public final class HmlDocumentCropTutorialFragment extends BaseFragment implements proxyGetOnDevicePassportDeserializer.read {
    public static final HmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new HmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    @BindView
    public ImageView documentDoImage;
    @BindView
    public ImageView documentDontImage;
    @HmlPinActivity
    public setShortcutTypeOrdinal presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @OnClick
    public final void onNextButtonClicked() {
        setShortcutTypeOrdinal setshortcuttypeordinal = this.presenter;
        if (setshortcuttypeordinal == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (setshortcuttypeordinal.IconCompatParcelizer) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C10151xabe6d43c.write;
            if (setshortcuttypeordinal.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(setshortcuttypeordinal.RatingCompat);
            }
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = setShortcutTypeOrdinal.IconCompatParcelizer.write;
        if (setshortcuttypeordinal.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(setshortcuttypeordinal.RatingCompat);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86762131493903, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setShortcutTypeOrdinal setshortcuttypeordinal = this.presenter;
        if (setshortcuttypeordinal == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setshortcuttypeordinal.MediaBrowserCompat$ItemReceiver(this);
        setShortcutTypeOrdinal setshortcuttypeordinal2 = this.presenter;
        if (setshortcuttypeordinal2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Bundle arguments = getArguments();
        setshortcuttypeordinal2.IconCompatParcelizer = arguments != null ? arguments.getBoolean("NAVIGATION_ENABLED_TAG", true) : true;
        writeUInt64NoTag.IconCompatParcelizer write = new setShortcutTypeOrdinal.write(setshortcuttypeordinal2);
        if (setshortcuttypeordinal2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            write.IconCompatParcelizer(setshortcuttypeordinal2.RatingCompat);
        }
        return inflate;
    }

    public final void read(awaitEvent awaitevent) {
        onGetStartedClick.write((Object) awaitevent, "display");
        ImageView imageView = this.documentDoImage;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentDoImage");
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(getContext(), (int) R.drawable.document_tutorial_placeholder_big, imageView, awaitevent.write);
        ImageView imageView2 = this.documentDontImage;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentDontImage");
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(getContext(), (int) R.drawable.document_tutorial_placeholder_big, imageView2, awaitevent.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer() {
        if (this.presenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
    }

    public final void write() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof C1424xf54be1d0)) {
            activity = null;
        }
        C1424xf54be1d0 proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver = (C1424xf54be1d0) activity;
        if (proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver != null) {
            proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void read() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof C1424xf54be1d0)) {
            activity = null;
        }
        C1424xf54be1d0 proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver = (C1424xf54be1d0) activity;
        if (proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver != null) {
            proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer("p10x1_document_salaryslip_crop_tutorial");
        }
    }

    public final void onDestroy() {
        setShortcutTypeOrdinal setshortcuttypeordinal = this.presenter;
        if (setshortcuttypeordinal == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setshortcuttypeordinal.onDestroy();
        super.onDestroy();
    }
}
