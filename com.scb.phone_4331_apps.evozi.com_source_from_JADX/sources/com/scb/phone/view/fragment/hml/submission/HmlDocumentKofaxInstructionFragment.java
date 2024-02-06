package com.scb.phone.view.fragment.hml.submission;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.VideoPlaybackActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C1424xf54be1d0;
import p040o.C7384x357a71ef;
import p040o.CrashlyticsController;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setIconType;
import p040o.setIconType$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;
import p040o.union;
import p040o.writeUInt64NoTag;

public final class HmlDocumentKofaxInstructionFragment extends BaseFragment implements C7384x357a71ef {
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read((byte) 0);
    @BindView
    public ImageView instructionVideoImage;
    @BindView
    public Button nextButton;
    @HmlPinActivity
    public setIconType presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    @OnClick
    public final void onNextButtonClicked() {
        setIconType seticontype = this.presenter;
        if (seticontype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (seticontype.read) {
            seticontype.write();
        } else if (!seticontype.write) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setIconType$MediaBrowserCompat$ItemReceiver.read;
            if (seticontype.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(seticontype.RatingCompat);
            }
        }
    }

    @OnClick
    public final void onVideoImageClicked() {
        setIconType seticontype = this.presenter;
        if (seticontype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        seticontype.write();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86772131493904, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setIconType seticontype = this.presenter;
        if (seticontype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        seticontype.MediaBrowserCompat$ItemReceiver(this);
        setIconType seticontype2 = this.presenter;
        if (seticontype2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        union union = seticontype2.MediaBrowserCompat$ItemReceiver;
        String MediaBrowserCompat$ItemReceiver = union.MediaBrowserCompat$ItemReceiver("/10X1/salarySlipKofax/instruction/videocover_th.png", "/10X1/salarySlipKofax/instruction/videocover_en.png");
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "transformCurrentLanguage…ng\"\n                    )");
        String MediaBrowserCompat$ItemReceiver2 = union.MediaBrowserCompat$ItemReceiver("/10X1/salarySlipKofax/instruction/instruction_th.mp4", "/10X1/salarySlipKofax/instruction/instruction_en.mp4");
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "transformCurrentLanguage…p4\"\n                    )");
        seticontype2.IconCompatParcelizer = new CrashlyticsController.CodedOutputStreamWriteAction(MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver2);
        writeUInt64NoTag.IconCompatParcelizer write = new setIconType.write(seticontype2);
        if (seticontype2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            write.IconCompatParcelizer(seticontype2.RatingCompat);
        }
        return inflate;
    }

    public final void IconCompatParcelizer() {
        setIconType seticontype = this.presenter;
        if (seticontype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setIconType.read.MediaBrowserCompat$ItemReceiver;
        if (seticontype.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(seticontype.RatingCompat);
        }
    }

    public final void read(CrashlyticsController.CodedOutputStreamWriteAction codedOutputStreamWriteAction) {
        onGetStartedClick.write((Object) codedOutputStreamWriteAction, "display");
        getContext();
        ImageView imageView = this.instructionVideoImage;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("instructionVideoImage");
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver((int) R.drawable.instruction_video_cover, imageView, codedOutputStreamWriteAction.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
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
            proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver.write();
        }
    }

    public final void read() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof C1424xf54be1d0)) {
            activity = null;
        }
        C1424xf54be1d0 proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver = (C1424xf54be1d0) activity;
        if (proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver != null) {
            proxygetondevicepassportdeserializer_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer("p10x1_document_salaryslip_kofax_instruction");
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "videoUrl");
        Context context = getContext();
        if (context != null) {
            VideoPlaybackActivity.write write = VideoPlaybackActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "videoUrl");
            Intent intent = new Intent(context, VideoPlaybackActivity.class);
            intent.putExtra("VIDEO_URL", str);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void RatingCompat() {
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setText(R.string.auto_kofax_instruction_watch);
    }

    public final void write() {
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setText(R.string.auto_kofax_instruction_next);
    }

    public final void onResume() {
        setIconType seticontype = this.presenter;
        if (seticontype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        seticontype.write = false;
        super.onResume();
    }

    public final void onDestroy() {
        setIconType seticontype = this.presenter;
        if (seticontype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        seticontype.onDestroy();
        super.onDestroy();
    }
}
