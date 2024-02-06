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
import p040o.C1424xf54be1d0;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.awaitEvent;
import p040o.onGetStartedClick;
import p040o.proxyGetOnDevicePassportDeserializer;
import p040o.setDisplayValue;
import p040o.setDisplayValue$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.writeUInt64NoTag;

public final class HmlDocumentReviewTutorialFragment extends BaseFragment implements proxyGetOnDevicePassportDeserializer.IconCompatParcelizer {
    public static final write IconCompatParcelizer = new write((byte) 0);
    @BindView
    public ImageView documentDoImage;
    @BindView
    public ImageView documentDontImage;
    @HmlPinActivity
    public setDisplayValue presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    @OnClick
    public final void onNextButtonClicked() {
        setDisplayValue setdisplayvalue = this.presenter;
        if (setdisplayvalue == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setDisplayValue$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        if (setdisplayvalue.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setdisplayvalue.RatingCompat);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86792131493906, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setDisplayValue setdisplayvalue = this.presenter;
        if (setdisplayvalue == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setdisplayvalue.MediaBrowserCompat$ItemReceiver(this);
        setDisplayValue setdisplayvalue2 = this.presenter;
        if (setdisplayvalue2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer read = new setDisplayValue.read(setdisplayvalue2);
        if (setdisplayvalue2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            read.IconCompatParcelizer(setdisplayvalue2.RatingCompat);
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(awaitEvent awaitevent) {
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

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
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
            proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer();
        }
    }

    public final void read() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof C1424xf54be1d0)) {
            activity = null;
        }
        C1424xf54be1d0 proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver = (C1424xf54be1d0) activity;
        if (proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver != null) {
            proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer("p10x1_document_salaryslip_review_tutorial");
        }
    }

    public final void onDestroy() {
        setDisplayValue setdisplayvalue = this.presenter;
        if (setdisplayvalue == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setdisplayvalue.onDestroy();
        super.onDestroy();
    }
}
