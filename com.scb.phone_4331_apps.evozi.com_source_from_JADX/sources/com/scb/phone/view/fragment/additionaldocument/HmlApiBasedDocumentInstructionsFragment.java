package com.scb.phone.view.fragment.additionaldocument;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.additionaldocument.DocumentInstructionsDetailCustomView;
import com.scb.phone.view.fragment.BaseFragment;
import java.io.Serializable;
import kotlin.TypeCastException;
import p040o.C4599x24f763ea;
import p040o.CrashlyticsController;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.ListenableFuture;
import p040o.getJsonTransformForVersion;
import p040o.getJsonTransformForVersion$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setItemIconPadding$MediaBrowserCompat$ItemReceiver;
import p040o.setLastBaselineToBottomHeight;
import p040o.writeUInt64NoTag;
import p040o.zzwd;
import p040o.zzwf;

public final class HmlApiBasedDocumentInstructionsFragment extends BaseFragment implements KtaJsonCheck.C6929b {
    @BindView
    public TextView descriptionText;
    @BindView
    public LinearLayout detailsList;
    @BindView
    public TextView headerText;
    @BindView
    public Button nextButton;
    @HmlPinActivity
    public getJsonTransformForVersion<KtaJsonCheck.C6929b> presenter;
    @BindView
    public ImageView thumbnail;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f88882131494115, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                getJsonTransformForVersion<KtaJsonCheck.C6929b> getjsontransformforversion = this.presenter;
                if (getjsontransformforversion == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                getjsontransformforversion.MediaBrowserCompat$ItemReceiver(this);
                getJsonTransformForVersion<KtaJsonCheck.C6929b> getjsontransformforversion2 = this.presenter;
                if (getjsontransformforversion2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                Serializable serializable = arguments.getSerializable("UPLOAD_METHOD");
                if (serializable != null) {
                    zzwd zzwd = (zzwd) serializable;
                    Serializable serializable2 = arguments.getSerializable("CAMERA_TYPE");
                    if (serializable2 != null) {
                        zzwf zzwf = (zzwf) serializable2;
                        String string = arguments.getString("DOCUMENT_CODE");
                        if (string != null) {
                            onGetStartedClick.write((Object) zzwd, "uploadMethod");
                            onGetStartedClick.write((Object) zzwf, "cameraType");
                            onGetStartedClick.write((Object) string, "documentCode");
                            getjsontransformforversion2.read = zzwd;
                            getjsontransformforversion2.write = zzwf;
                            if (getjsontransformforversion2.RatingCompat != null) {
                                getjsontransformforversion2.RatingCompat.AlertController$RecycleListView();
                            }
                            getjsontransformforversion2.IconCompatParcelizer.read(new C4599x24f763ea(getjsontransformforversion2), new getJsonTransformForVersion.write(getjsontransformforversion2), new setItemIconPadding$MediaBrowserCompat$ItemReceiver(string), new getJsonTransformForVersion.IconCompatParcelizer(getjsontransformforversion2), getjsontransformforversion2.MediaBrowserCompat$ItemReceiver);
                            Button button = this.nextButton;
                            if (button == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
                            }
                            if (!arguments.getBoolean("SHOW_NEXT_BUTTON_KEY")) {
                                i = 8;
                            }
                            button.setVisibility(i);
                            Button button2 = this.nextButton;
                            if (button2 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
                            }
                            button2.setOnClickListener(new read(this));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.additionaldocument.CameraType");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.additionaldocument.UploadMethod");
                }
            }
            return inflate;
        }
        throw new IllegalArgumentException("Expression 'arguments' must not be null");
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ HmlApiBasedDocumentInstructionsFragment write;

        read(HmlApiBasedDocumentInstructionsFragment hmlApiBasedDocumentInstructionsFragment) {
            this.write = hmlApiBasedDocumentInstructionsFragment;
        }

        public final void onClick(View view) {
            getJsonTransformForVersion<KtaJsonCheck.C6929b> getjsontransformforversion = this.write.presenter;
            if (getjsontransformforversion == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer getjsontransformforversion_mediabrowsercompat_itemreceiver = new getJsonTransformForVersion$MediaBrowserCompat$ItemReceiver(getjsontransformforversion);
            if (getjsontransformforversion.RatingCompat != null) {
                getjsontransformforversion_mediabrowsercompat_itemreceiver.IconCompatParcelizer(getjsontransformforversion.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer(zzwd zzwd, zzwf zzwf) {
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        onGetStartedClick.write((Object) zzwf, "cameraType");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("UPLOAD_METHOD", zzwd);
            intent.putExtra("CAMERA_TYPE", zzwf);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public final void onDestroy() {
        getJsonTransformForVersion<KtaJsonCheck.C6929b> getjsontransformforversion = this.presenter;
        if (getjsontransformforversion == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getjsontransformforversion.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsController.C32367 r7) {
        onGetStartedClick.write((Object) r7, "display");
        ParcelableVolumeInfo(r7.read);
        Context context = getContext();
        if (context != null) {
            LinearLayout linearLayout = this.detailsList;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("detailsList");
            }
            linearLayout.removeAllViews();
            for (ListenableFuture listenableFuture : r7.IconCompatParcelizer) {
                LinearLayout linearLayout2 = this.detailsList;
                if (linearLayout2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("detailsList");
                }
                onGetStartedClick.IconCompatParcelizer((Object) context, "context");
                linearLayout2.addView(new DocumentInstructionsDetailCustomView(context, listenableFuture));
                Context context2 = getContext();
                LinearLayout linearLayout3 = this.detailsList;
                if (linearLayout3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("detailsList");
                }
                View.inflate(context2, R.layout.f84722131493699, linearLayout3);
            }
            TextView textView = this.headerText;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("headerText");
            }
            textView.setVisibility(8);
            TextView textView2 = this.descriptionText;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("descriptionText");
            }
            textView2.setText(r7.write.write);
            Drawable write = setLastBaselineToBottomHeight.write(context, R.drawable.document_thumbnail_placeholder);
            ImageView imageView = this.thumbnail;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("thumbnail");
            }
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(write, imageView, r7.write.read);
        }
    }
}
