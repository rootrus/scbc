package com.scb.phone.view.fragment.additionaldocument;

import android.content.Context;
import android.content.Intent;
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
import java.util.List;
import kotlin.TypeCastException;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindDealsBuyReviewFragment;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.getTopLeftCornerHeight;
import p040o.logSettings;
import p040o.onGetStartedClick;
import p040o.zzwd;

public final class DocumentInstructionsFragment extends BaseFragment implements getTopLeftCornerHeight {
    private FragmentBuilder_BindDealsBuyReviewFragment IconCompatParcelizer;
    @BindView
    public TextView descriptionText;
    @BindView
    public LinearLayout detailsList;
    @BindView
    public TextView headerText;
    @BindView
    public TextView listTitle;
    @BindView
    public Button nextButton;
    @HmlPinActivity
    public logSettings presenter;
    @BindView
    public ImageView thumbnail;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        private read() {
        }

        public static DocumentInstructionsFragment write(boolean z, String str, zzwd zzwd) {
            onGetStartedClick.write((Object) str, "strategy");
            onGetStartedClick.write((Object) zzwd, "uploadMethod");
            Bundle bundle = new Bundle();
            bundle.putBoolean("SHOW_NEXT_BUTTON_KEY", z);
            bundle.putSerializable("UPLOAD_METHOD", zzwd);
            FragmentBuilder_BindDealsBuyReviewFragment.IconCompatParcelizer iconCompatParcelizer = FragmentBuilder_BindDealsBuyReviewFragment.Companion;
            bundle.putString(FragmentBuilder_BindDealsBuyReviewFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(), str);
            DocumentInstructionsFragment documentInstructionsFragment = new DocumentInstructionsFragment();
            documentInstructionsFragment.setArguments(bundle);
            return documentInstructionsFragment;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f88882131494115, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                logSettings logsettings = this.presenter;
                if (logsettings == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                logsettings.MediaBrowserCompat$ItemReceiver(this);
                logSettings logsettings2 = this.presenter;
                if (logsettings2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                Serializable serializable = arguments.getSerializable("UPLOAD_METHOD");
                if (serializable != null) {
                    zzwd zzwd = (zzwd) serializable;
                    onGetStartedClick.write((Object) zzwd, "uploadMethod");
                    logsettings2.read = zzwd;
                    FragmentBuilder_BindDealsBuyReviewFragment.IconCompatParcelizer iconCompatParcelizer = FragmentBuilder_BindDealsBuyReviewFragment.Companion;
                    this.IconCompatParcelizer = FragmentBuilder_BindDealsBuyReviewFragment.valueOf(AlertController$RecycleListView.write(arguments, FragmentBuilder_BindDealsBuyReviewFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver()));
                    Button button = this.nextButton;
                    if (button == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
                    }
                    button.setVisibility(!arguments.getBoolean("SHOW_NEXT_BUTTON_KEY") ? 8 : 0);
                    Context context = getContext();
                    if (context != null) {
                        FragmentBuilder_BindDealsBuyReviewFragment fragmentBuilder_BindDealsBuyReviewFragment = this.IconCompatParcelizer;
                        if (fragmentBuilder_BindDealsBuyReviewFragment == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("strategy");
                        }
                        onGetStartedClick.IconCompatParcelizer((Object) context, "context");
                        String MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindDealsBuyReviewFragment.MediaBrowserCompat$CustomActionResultReceiver(context);
                        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                            ParcelableVolumeInfo(MediaBrowserCompat$CustomActionResultReceiver);
                        }
                        FragmentBuilder_BindDealsBuyReviewFragment fragmentBuilder_BindDealsBuyReviewFragment2 = this.IconCompatParcelizer;
                        if (fragmentBuilder_BindDealsBuyReviewFragment2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("strategy");
                        }
                        ImageView imageView = this.thumbnail;
                        if (imageView == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("thumbnail");
                        }
                        TextView textView = this.headerText;
                        if (textView == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("headerText");
                        }
                        TextView textView2 = this.descriptionText;
                        if (textView2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("descriptionText");
                        }
                        fragmentBuilder_BindDealsBuyReviewFragment2.IconCompatParcelizer(context, imageView, textView, textView2);
                        FragmentBuilder_BindDealsBuyReviewFragment fragmentBuilder_BindDealsBuyReviewFragment3 = this.IconCompatParcelizer;
                        if (fragmentBuilder_BindDealsBuyReviewFragment3 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("strategy");
                        }
                        List<Futures.ListenableFutureAdapter> read2 = fragmentBuilder_BindDealsBuyReviewFragment3.read(context);
                        Context context2 = getContext();
                        if (context2 != null) {
                            LinearLayout linearLayout = this.detailsList;
                            if (linearLayout == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("detailsList");
                            }
                            linearLayout.removeAllViews();
                            for (Futures.ListenableFutureAdapter listenableFutureAdapter : read2) {
                                LinearLayout linearLayout2 = this.detailsList;
                                if (linearLayout2 == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("detailsList");
                                }
                                onGetStartedClick.IconCompatParcelizer((Object) context2, "context");
                                linearLayout2.addView(new DocumentInstructionsDetailCustomView(context2, listenableFutureAdapter));
                                Context context3 = getContext();
                                LinearLayout linearLayout3 = this.detailsList;
                                if (linearLayout3 == null) {
                                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("detailsList");
                                }
                                View.inflate(context3, R.layout.f84722131493699, linearLayout3);
                            }
                        }
                        FragmentBuilder_BindDealsBuyReviewFragment fragmentBuilder_BindDealsBuyReviewFragment4 = this.IconCompatParcelizer;
                        if (fragmentBuilder_BindDealsBuyReviewFragment4 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("strategy");
                        }
                        boolean read3 = fragmentBuilder_BindDealsBuyReviewFragment4.read();
                        TextView textView3 = this.listTitle;
                        if (textView3 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("listTitle");
                        }
                        if (!read3) {
                            i = 8;
                        }
                        textView3.setVisibility(i);
                        Button button2 = this.nextButton;
                        if (button2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
                        }
                        button2.setOnClickListener(new DocumentInstructionsFragment$MediaBrowserCompat$ItemReceiver(this));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.additionaldocument.UploadMethod");
                }
            }
            return inflate;
        }
        throw new IllegalArgumentException("Expression 'arguments' must not be null");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(zzwd zzwd) {
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, new Intent().putExtra("UPLOAD_METHOD", zzwd));
            activity.finish();
        }
    }

    public final void onDestroy() {
        logSettings logsettings = this.presenter;
        if (logsettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        logsettings.onDestroy();
        super.onDestroy();
    }
}
