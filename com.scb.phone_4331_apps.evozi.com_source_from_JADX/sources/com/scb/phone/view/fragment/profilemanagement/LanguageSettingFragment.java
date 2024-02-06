package com.scb.phone.view.fragment.profilemanagement;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
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
import com.scb.phone.view.activity.profilemanagement.ProfileManagementActivity;
import com.scb.phone.view.adapter.profilemanagement.LanguageSettingAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import p040o.C4897kd;
import p040o.FragmentBuilder_BindCloseAccountSuccessFragment;
import p040o.GoogleMap;
import p040o.HmlPinActivity;
import p040o.ImmutableMultiset;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getBlackStreakMaxHeight;
import p040o.getCompatIPv4Address;
import p040o.setCustomAttributes;
import p040o.setTapText;

public class LanguageSettingFragment extends BaseFragment implements getBlackStreakMaxHeight.write {
    private FragmentBuilder_BindCloseAccountSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public C4897kd languageSettingPresenter;
    @BindView
    RecyclerView mRecyclerView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88262131494053, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.languageSettingPresenter.MediaBrowserCompat$ItemReceiver(this);
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        RecyclerView recyclerView = this.mRecyclerView;
        getCompatIPv4Address getcompatipv4address = this.languageSettingPresenter.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        setCustomAttributes IconCompatParcelizer = setCustomAttributes.IconCompatParcelizer();
        IconCompatParcelizer.read = "th";
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = getcompatipv4address.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.th_title);
        arrayList.add(IconCompatParcelizer);
        setCustomAttributes IconCompatParcelizer2 = setCustomAttributes.IconCompatParcelizer();
        IconCompatParcelizer2.read = "en";
        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = getcompatipv4address.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.en_title);
        arrayList.add(IconCompatParcelizer2);
        recyclerView.setAdapter(new LanguageSettingAdapter(arrayList, this.languageSettingPresenter.write.read.setCheckable(), this));
        return inflate;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCloseAccountSuccessFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindCloseAccountSuccessFragment) context;
        }
    }

    public final void write(String str) {
        String str2;
        C4897kd kdVar = this.languageSettingPresenter;
        if (kdVar.RatingCompat != null) {
            kdVar.RatingCompat.AlertController$RecycleListView();
        }
        ImmutableMultiset immutableMultiset = new ImmutableMultiset(str);
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = kdVar.write.read.AppCompatDelegateImpl$ListMenuDecorView();
        if (str != null) {
            str2 = str.toLowerCase();
        } else {
            str2 = "";
        }
        AppCompatDelegateImpl$ListMenuDecorView.f2719x50fd9e4a = str2;
        kdVar.write.MediaBrowserCompat$ItemReceiver(immutableMultiset);
        kdVar.write.IconCompatParcelizer(new C4897kd.write(str));
    }

    public final void read(String str) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null && getActivity() != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str);
            ActivityOptions makeCustomAnimation = ActivityOptions.makeCustomAnimation(getActivity(), R.anim.f64132130771980, R.anim.f64142130771981);
            Intent MediaBrowserCompat$ItemReceiver = ProfileManagementActivity.MediaBrowserCompat$ItemReceiver(getActivity());
            MediaBrowserCompat$ItemReceiver.addFlags(67108864);
            Bundle bundle = makeCustomAnimation.toBundle();
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent, Bundle), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$ItemReceiver, bundle);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            getActivity().finish();
        }
    }
}
