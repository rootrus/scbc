package com.scb.phone.view.fragment.etb;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C6404xb2f77424;
import p040o.C9924f;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$1900;
import p040o.deleteSessionPartFilesFor;
import p040o.immediateFailedFuture;
import p040o.nativeFinalize;
import p040o.setTapText;

public class ETBProductTermConditionFragment extends BaseEtbFragment implements C6404xb2f77424, FragmentBuilder_BindCustomizeYourPageFragment {
    @HmlPinActivity
    public C9924f.C43921 etbProductTermAndConditionPresenter;

    public final int ParcelableVolumeInfo() {
        return 0;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public static ETBProductTermConditionFragment IconCompatParcelizer(access$1900 access_1900, deleteSessionPartFilesFor deletesessionpartfilesfor, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT", access_1900);
        bundle.putParcelable("com.scb.phone.view.fragment.etb.ARG_PRODUCT", deletesessionpartfilesfor);
        bundle.putString("com.scb.phone.view.fragment.etb.ARG_PRODUCT_CODE", str);
        ETBProductTermConditionFragment eTBProductTermConditionFragment = new ETBProductTermConditionFragment();
        eTBProductTermConditionFragment.setArguments(bundle);
        return eTBProductTermConditionFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86292131493856, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        this.etbProductTermAndConditionPresenter.MediaBrowserCompat$ItemReceiver(this);
        String string = getArguments().getString("com.scb.phone.view.fragment.etb.ARG_PRODUCT_CODE");
        C9924f.C43921 r0 = this.etbProductTermAndConditionPresenter;
        nativeFinalize nativefinalize = new nativeFinalize(r0, string);
        if (r0.RatingCompat != null) {
            z = true;
        }
        if (z) {
            nativefinalize.IconCompatParcelizer(r0.RatingCompat);
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.etbProductTermAndConditionPresenter.onDestroy();
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.etb_term_condition_title);
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_layout_terms_and_conditions, TermsAndConditionsFragment.read(immediatefailedfuture)).write();
    }

    public final void IconCompatParcelizer(String str) {
        Bundle arguments = getArguments();
        this.MediaMetadataCompat.write(ETBCheckIdentityFragment.read((access$1900) arguments.getParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT"), (deleteSessionPartFilesFor) arguments.getParcelable("com.scb.phone.view.fragment.etb.ARG_PRODUCT")));
    }

    public final void write(String str) {
        Intent intent = new Intent(getContext(), HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab);
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
    }

    public final void setContentView() {
        getChildFragmentManager().RatingCompat();
        if (getActivity() != null && getActivity().getSupportFragmentManager() != null) {
            getActivity().getSupportFragmentManager().RatingCompat();
        }
    }
}
