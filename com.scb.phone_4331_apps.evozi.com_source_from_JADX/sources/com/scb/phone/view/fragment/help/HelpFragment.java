package com.scb.phone.view.fragment.help;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.contactus.ContactUsActivity;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.scb.phone.view.adapter.help.HelpAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.HmlPinActivity;
import p040o.ModifyQuickTopUpReviewActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SessionProtobufHelper;
import p040o.SessionProtobufHelper$MediaBrowserCompat$ItemReceiver;
import p040o.getCheckIQAData;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzmd;
import p040o.zzwi;
import p040o.zzwl;

public class HelpFragment extends BaseFragment implements FragmentBuilder_BindCcSofBillPaymentOnlyFragment, getCheckIQAData {
    @HmlPinActivity
    public SessionProtobufHelper helpPresenter;
    @BindView
    RecyclerView mRecyclerView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zzmd.zzm.zzb.zza zza;
        View inflate = layoutInflater.inflate(R.layout.f87732131494000, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.helpPresenter.MediaBrowserCompat$ItemReceiver(this);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
        ParcelableVolumeInfo(getString(R.string.help));
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView = this.mRecyclerView;
        Context context = getContext();
        SessionProtobufHelper sessionProtobufHelper = this.helpPresenter;
        if (getActivity() instanceof PreLoadCheckActivity) {
            zza = ((PreLoadCheckActivity) getActivity()).setTitleOptional();
        } else {
            zza = null;
        }
        recyclerView.setAdapter(new HelpAdapter(context, this, sessionProtobufHelper.IconCompatParcelizer(zza)));
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
        ParcelableVolumeInfo(getString(R.string.help));
    }

    public final void read(String str) {
        if (!ModifyQuickTopUpReviewActivity.write(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                try {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        intent = setTapText.write(activity, intent).read();
                    }
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                    sb.append(intent.getData());
                    sb.append("\n with context ");
                    sb.append(activity.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                    startActivity(intent);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (ActivityNotFoundException | NullPointerException e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            }
        }
    }

    public final void read(int i) {
        zzwl zzwl;
        String str;
        Intent intent = null;
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                intent = new Intent(getContext(), FindUsActivity.class);
            } else if (i == 2) {
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("how_to_use_app_more_option");
                }
                SessionProtobufHelper sessionProtobufHelper = this.helpPresenter;
                String stackedBackground = setStackedBackground();
                onGetStartedClick.write((Object) stackedBackground, "language");
                zzwi write = sessionProtobufHelper.IconCompatParcelizer.write.write();
                if (write != null) {
                    zzwl = write.write;
                } else {
                    zzwl = null;
                }
                if (zzwl != null) {
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "th", (Object) stackedBackground)) {
                        str = zzwl.IconCompatParcelizer;
                    } else {
                        str = zzwl.read;
                    }
                    if (str != null) {
                        writeUInt64NoTag.IconCompatParcelizer sessionProtobufHelper$MediaBrowserCompat$ItemReceiver = new SessionProtobufHelper$MediaBrowserCompat$ItemReceiver(str);
                        if (sessionProtobufHelper.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            sessionProtobufHelper$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(sessionProtobufHelper.RatingCompat);
                        }
                    }
                }
            }
        } else {
            intent = new Intent(getContext(), ContactUsActivity.class);
        }
        if (intent != null) {
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
}
