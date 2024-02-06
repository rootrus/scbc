package com.scb.phone.view.fragment.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
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
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.StatementChannelChooseAddressActivity;
import com.scb.phone.view.activity.cardmanagement.StatementChannelCommonActivity;
import com.scb.phone.view.custom.cardmanagement.CustomStatementChannelViewComponent;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.AnalyticsConnectorImpl;
import p040o.C3384x8e8d9aed;
import p040o.C9737xe50c52fd;
import p040o.Component;
import p040o.ExtractorResponse;
import p040o.FirebaseVisionCloudDocumentRecognizerOptions;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.chain;
import p040o.createId;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class StatementChannelLandingFragment extends BaseFragment implements ExtractorResponse.write, CustomStatementChannelViewComponent.IconCompatParcelizer {
    public static final read IconCompatParcelizer = new read((byte) 0);
    private chain MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$SearchResultReceiver = "";
    private ArrayList<chain> MediaDescriptionCompat;
    @BindView
    public Button btnNext;
    @BindView
    public LinearLayout itemChannelSelectLayout;
    @BindView
    public ImageView ivEmailEdit;
    @HmlPinActivity
    public FirebaseVisionCloudDocumentRecognizerOptions.Builder presenter;
    @BindView
    public LinearLayout remarkSelectLayout;
    @BindView
    public LinearLayout rootLayout;
    @BindView
    public LinearLayout sendToLayout;
    @BindView
    public TextView tvRemarkSelectNewChannel;
    @BindView
    public TextView tvSendTo;
    @BindView
    public TextView tvSendToTitle;
    @BindView
    public CustomTransferAndPayItem viewChannel;

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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f89982131494225, viewGroup, false);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            chain chain = (chain) arguments.getParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY");
            if (chain != null) {
                onGetStartedClick.IconCompatParcelizer((Object) chain, "creditCard");
                this.MediaBrowserCompat$CustomActionResultReceiver = chain;
            }
            ArrayList<chain> parcelableArrayList = arguments.getParcelableArrayList("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY");
            if (parcelableArrayList != null) {
                onGetStartedClick.IconCompatParcelizer((Object) parcelableArrayList, "arrayCreditCard");
                this.MediaDescriptionCompat = parcelableArrayList;
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ButterKnife.IconCompatParcelizer(this, view);
        FirebaseVisionCloudDocumentRecognizerOptions.Builder builder = this.presenter;
        if (builder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        builder.MediaBrowserCompat$ItemReceiver(this);
        chain chain = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        ArrayList<chain> arrayList = this.MediaDescriptionCompat;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplayList");
        }
        onGetStartedClick.write((Object) chain, "ccd");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        builder.write = chain;
        builder.MediaBrowserCompat$ItemReceiver = arrayList;
        writeUInt64NoTag.IconCompatParcelizer firebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$MediaItem = new C3384x8e8d9aed(builder);
        if (builder.RatingCompat != null) {
            firebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$MediaItem.IconCompatParcelizer(builder.RatingCompat);
        }
    }

    @OnClick
    public final void onClickEditEmail() {
        FirebaseVisionCloudDocumentRecognizerOptions.Builder builder = this.presenter;
        if (builder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer firebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$CustomActionResultReceiver = new C9737xe50c52fd(builder, createId.EMAIL.name());
        if (builder.RatingCompat != null) {
            firebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(builder.RatingCompat);
        }
    }

    @OnClick
    public final void onClickNext() {
        FirebaseVisionCloudDocumentRecognizerOptions.Builder builder = this.presenter;
        if (builder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) str, "userSelect");
        boolean z = true;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.EMAIL.name())) {
            writeUInt64NoTag.IconCompatParcelizer firebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$CustomActionResultReceiver = new C9737xe50c52fd(builder, str);
            if (builder.RatingCompat == null) {
                z = false;
            }
            if (z) {
                firebaseVisionCloudDocumentRecognizerOptions$Builder$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(builder.RatingCompat);
            }
        } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.PAPER.name())) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new FirebaseVisionCloudDocumentRecognizerOptions.Builder.IconCompatParcelizer(builder, str);
            if (builder.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(builder.RatingCompat);
            }
        }
    }

    public final void read(String str, chain chain, ArrayList<chain> arrayList, String str2) {
        onGetStartedClick.write((Object) str, "channel");
        onGetStartedClick.write((Object) chain, "ccd");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        onGetStartedClick.write((Object) str2, "address");
        Context context = getContext();
        if (context != null) {
            StatementChannelCommonActivity.write write = StatementChannelCommonActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            Intent IconCompatParcelizer2 = StatementChannelCommonActivity.write.IconCompatParcelizer(context, chain, arrayList, str, str2);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, IconCompatParcelizer2).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        LinearLayout linearLayout = this.rootLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rootLayout");
        }
        linearLayout.setVisibility(z ? 0 : 4);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "address");
        TextView textView = this.tvSendTo;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSendTo");
        }
        textView.setText(str);
        TextView textView2 = this.tvSendToTitle;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSendToTitle");
        }
        textView2.setText(getString(R.string.mailing_address));
        ImageView imageView = this.ivEmailEdit;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivEmailEdit");
        }
        imageView.setVisibility(4);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        TextView textView = this.tvSendTo;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSendTo");
        }
        textView.setText(str);
        TextView textView2 = this.tvSendToTitle;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSendToTitle");
        }
        textView2.setText(getString(R.string.ccm_email_address));
        ImageView imageView = this.ivEmailEdit;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivEmailEdit");
        }
        imageView.setVisibility(0);
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "channelName");
        CustomTransferAndPayItem customTransferAndPayItem = this.viewChannel;
        if (customTransferAndPayItem == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewChannel");
        }
        customTransferAndPayItem.setText(getString(R.string.channel));
        customTransferAndPayItem.setValue(str);
        customTransferAndPayItem.setFullDivider(false);
    }

    public final void read() {
        LinearLayout linearLayout = this.remarkSelectLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remarkSelectLayout");
        }
        linearLayout.setVisibility(0);
    }

    public final void write(List<AnalyticsConnectorImpl.C30121> list) {
        onGetStartedClick.write((Object) list, "channels");
        Context context = getContext();
        if (context != null) {
            LinearLayout linearLayout = this.itemChannelSelectLayout;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemChannelSelectLayout");
            }
            linearLayout.removeAllViews();
            int i = 0;
            for (Object next : list) {
                if (i >= 0) {
                    AnalyticsConnectorImpl.C30121 r5 = (AnalyticsConnectorImpl.C30121) next;
                    LinearLayout linearLayout2 = this.itemChannelSelectLayout;
                    if (linearLayout2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemChannelSelectLayout");
                    }
                    onGetStartedClick.IconCompatParcelizer((Object) context, "this");
                    boolean z = true;
                    if (i != list.size() - 1) {
                        z = false;
                    }
                    CustomStatementChannelViewComponent customStatementChannelViewComponent = new CustomStatementChannelViewComponent(context, (AttributeSet) null, 0);
                    customStatementChannelViewComponent.setKey(r5.write);
                    customStatementChannelViewComponent.setTitle(r5.IconCompatParcelizer);
                    customStatementChannelViewComponent.setRemark(r5.MediaBrowserCompat$CustomActionResultReceiver);
                    customStatementChannelViewComponent.IconCompatParcelizer(z);
                    customStatementChannelViewComponent.setSelect(this.MediaBrowserCompat$SearchResultReceiver);
                    customStatementChannelViewComponent.setListener(this);
                    linearLayout2.addView(customStatementChannelViewComponent);
                    i++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "key");
        this.MediaBrowserCompat$SearchResultReceiver = str;
        FirebaseVisionCloudDocumentRecognizerOptions.Builder builder = this.presenter;
        if (builder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) str2, "userSelect");
        Component component = builder.read;
        if (component != null) {
            writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new FirebaseVisionCloudDocumentRecognizerOptions.Builder.MediaDescriptionCompat(component, str2);
            if (builder.RatingCompat != null) {
                mediaDescriptionCompat.IconCompatParcelizer(builder.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        LinearLayout linearLayout = this.sendToLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("sendToLayout");
        }
        linearLayout.setVisibility(z ? 8 : 0);
    }

    public final void onDestroy() {
        FirebaseVisionCloudDocumentRecognizerOptions.Builder builder = this.presenter;
        if (builder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        builder.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, chain chain, ArrayList<chain> arrayList) {
        onGetStartedClick.write((Object) str, "channel");
        onGetStartedClick.write((Object) chain, "ccd");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        Context context = getContext();
        if (context != null) {
            StatementChannelChooseAddressActivity.write write = StatementChannelChooseAddressActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) chain, "ccd");
            onGetStartedClick.write((Object) arrayList, "ccdList");
            onGetStartedClick.write((Object) str, "channel");
            Intent intent = new Intent(context, StatementChannelChooseAddressActivity.class);
            intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
            intent.putExtra("EXTRA_CHANNEL_KEY", str);
            intent.putParcelableArrayListExtra("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY", arrayList);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write(boolean z) {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setVisibility(z ? 0 : 8);
    }

    public final void read(boolean z) {
        TextView textView = this.tvRemarkSelectNewChannel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemarkSelectNewChannel");
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public final void IconCompatParcelizer() {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", "services_tab")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("change_stmt_channel_landing", zsyr2kArr);
        }
    }
}
