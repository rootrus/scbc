package com.scb.phone.view.fragment.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.C5567x38c86bfb;
import com.scb.phone.view.activity.cardmanagement.StatementChannelCommonActivity;
import com.scb.phone.view.activity.cardmanagement.TermAndConditionStatementChannelActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailLandingActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import p040o.AlertController$RecycleListView;
import p040o.ExtractorResponse;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.chain;
import p040o.createId;
import p040o.getModelType;
import p040o.getModelType$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getModelType$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class ChangeChannelStatementReviewFragment extends BaseFragment implements ExtractorResponse.read {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);
    private String IconCompatParcelizer;
    private String MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private chain MediaMetadataCompat;
    private ArrayList<chain> RatingCompat;
    @BindView
    public TextView changeAddressButton;
    @HmlPinActivity
    public getModelType presenter;
    @BindView
    public TextView tvAddress;
    @BindView
    public TextView tvAddressTitle;
    @BindView
    public TextView tvMaskCardNo;
    @BindView
    public TextView tvRemark;

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

    public final void onResume() {
        super.onResume();
        getModelType getmodeltype = this.presenter;
        if (getmodeltype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = getmodeltype.write;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("channel");
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.EMAIL.name())) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new getModelType.IconCompatParcelizer(getmodeltype);
            if (getmodeltype.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getmodeltype.RatingCompat);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f86112131493838, viewGroup, false);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.MediaDescriptionCompat = AlertController$RecycleListView.write(arguments, "EXTRA_CHANNEL_KEY");
            this.IconCompatParcelizer = AlertController$RecycleListView.write(arguments, "EXTRA_ADDRESS_KEY");
            chain chain = (chain) arguments.getParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY");
            if (chain != null) {
                onGetStartedClick.IconCompatParcelizer((Object) chain, "creditCard");
                this.MediaMetadataCompat = chain;
            }
            ArrayList<chain> parcelableArrayList = arguments.getParcelableArrayList("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY");
            if (parcelableArrayList != null) {
                onGetStartedClick.IconCompatParcelizer((Object) parcelableArrayList, "arrayCreditCard");
                this.RatingCompat = parcelableArrayList;
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ButterKnife.IconCompatParcelizer(this, view);
        getModelType getmodeltype = this.presenter;
        if (getmodeltype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getmodeltype.MediaBrowserCompat$ItemReceiver(this);
        getModelType getmodeltype2 = this.presenter;
        if (getmodeltype2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = this.MediaDescriptionCompat;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("channel");
        }
        chain chain = this.MediaMetadataCompat;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        ArrayList<chain> arrayList = this.RatingCompat;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplayList");
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("address");
        }
        onGetStartedClick.write((Object) str, "channel");
        onGetStartedClick.write((Object) chain, "ccd");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        onGetStartedClick.write((Object) str2, "address");
        getmodeltype2.MediaBrowserCompat$ItemReceiver = chain;
        getmodeltype2.read = arrayList;
        getmodeltype2.write = str;
        getmodeltype2.IconCompatParcelizer = str2;
        writeUInt64NoTag.IconCompatParcelizer read = new getModelType.read(getmodeltype2);
        if (getmodeltype2.RatingCompat != null) {
            read.IconCompatParcelizer(getmodeltype2.RatingCompat);
        }
    }

    @OnClick
    public final void onClickOk() {
        getModelType getmodeltype = this.presenter;
        if (getmodeltype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer getmodeltype_mediabrowsercompat_customactionresultreceiver = new getModelType$MediaBrowserCompat$CustomActionResultReceiver(getmodeltype);
        if (getmodeltype.RatingCompat != null) {
            getmodeltype_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(getmodeltype.RatingCompat);
        }
    }

    @OnClick
    public final void onClickChangeAddress() {
        getModelType getmodeltype = this.presenter;
        if (getmodeltype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer getmodeltype_mediabrowsercompat_itemreceiver = new getModelType$MediaBrowserCompat$ItemReceiver(getmodeltype);
        if (getmodeltype.RatingCompat != null) {
            getmodeltype_mediabrowsercompat_itemreceiver.IconCompatParcelizer(getmodeltype.RatingCompat);
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "address");
        TextView textView = this.tvAddress;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddress");
        }
        textView.setText(str);
        TextView textView2 = this.tvAddressTitle;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddressTitle");
        }
        textView2.setText(getString(R.string.mailing_address));
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        TextView textView = this.tvAddress;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddress");
        }
        textView.setText(str);
        TextView textView2 = this.tvAddressTitle;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddressTitle");
        }
        textView2.setText(getString(R.string.ccm_email_address));
    }

    public final void MediaMetadataCompat(String str) {
        onGetStartedClick.write((Object) str, "maskCard");
        this.MediaBrowserCompat$SearchResultReceiver = str;
        TextView textView = this.tvMaskCardNo;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMaskCardNo");
        }
        textView.setText(str);
    }

    public final void MediaDescriptionCompat(String str) {
        onGetStartedClick.write((Object) str, "remark");
        TextView textView = this.tvRemark;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
        }
        textView.setText(str);
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "btnName");
        TextView textView = this.changeAddressButton;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("changeAddressButton");
        }
        textView.setText(str);
        TextView textView2 = this.changeAddressButton;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("changeAddressButton");
        }
        textView2.setVisibility(4);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Context context = getContext();
        if (context != null) {
            StatementChannelCommonActivity.write write2 = StatementChannelCommonActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, StatementChannelCommonActivity.class);
            intent.putExtra("EXTRA_PAGE_TYPE_KEY", C5567x38c86bfb.EDIT_ADDRESS_PAGE);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                context.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write() {
        Context context = getContext();
        if (context != null) {
            Intent IconCompatParcelizer2 = ManageEmailLandingActivity.IconCompatParcelizer(context);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(IconCompatParcelizer2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(IconCompatParcelizer2, 119);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read(chain chain, ArrayList<chain> arrayList, String str, String str2, ArrayList<String> arrayList2) {
        onGetStartedClick.write((Object) chain, "ccd");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        onGetStartedClick.write((Object) str, "channel");
        onGetStartedClick.write((Object) str2, "address");
        onGetStartedClick.write((Object) arrayList2, "tempSelectCard");
        Context context = getContext();
        if (context != null) {
            TermAndConditionStatementChannelActivity.read read = TermAndConditionStatementChannelActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            String str3 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("maskCard");
            }
            Intent MediaBrowserCompat$ItemReceiver = TermAndConditionStatementChannelActivity.read.MediaBrowserCompat$ItemReceiver(context, "CHANGE_CHANNEL_STATEMENT", chain, arrayList, str, str2, str3, arrayList2);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, MediaBrowserCompat$ItemReceiver).read();
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

    public final void write(chain chain, ArrayList<chain> arrayList, String str, String str2) {
        onGetStartedClick.write((Object) chain, "ccd");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        onGetStartedClick.write((Object) str, "channel");
        onGetStartedClick.write((Object) str2, Scopes.EMAIL);
        Context context = getContext();
        if (context != null) {
            StatementChannelCommonActivity.write write2 = StatementChannelCommonActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            String str3 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("maskCard");
            }
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) chain, "ccd");
            onGetStartedClick.write((Object) arrayList, "ccdList");
            onGetStartedClick.write((Object) str, "channel");
            onGetStartedClick.write((Object) str2, "address");
            onGetStartedClick.write((Object) str3, "maskCard");
            Intent intent = new Intent(context, StatementChannelCommonActivity.class);
            intent.putExtra("EXTRA_CHANNEL_KEY", str);
            intent.putExtra("EXTRA_MASK_CARD_KEY", str3);
            intent.putExtra("EXTRA_ADDRESS_KEY", str2);
            intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
            intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY", arrayList);
            intent.putExtra("EXTRA_PAGE_TYPE_KEY", C5567x38c86bfb.APPLY_ALL);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                context.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read() {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("change_stmt_channel_review", zsyr2kArr);
        }
    }
}
