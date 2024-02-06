package com.scb.phone.view.fragment.easycash.landing;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashCreditPowerInputActivity;
import com.scb.phone.view.activity.easycash.EasycashLoanTrackActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashCommercialLoanIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashCreditCardIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashMCMCIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashMortgageIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashPurposefulLoanIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashSpeedyCashIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashSpeedyLoanIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashSpeedyLoanTopupIntroductionActivity;
import com.scb.phone.view.adapter.easycash.EasycashHeaderAdapter;
import com.scb.phone.view.adapter.easycash.EasycashLoanTrackingAdapter;
import com.scb.phone.view.adapter.easycash.EasycashProductAdapter;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Onboarding;
import p040o.SwitchCompat;
import p040o.ZSYR2K;
import p040o.forEachClear;
import p040o.getCropType;
import p040o.getLegacySharedPrefs;
import p040o.getProximitySensorEnabled;
import p040o.preValidation;
import p040o.resetPinVerifyByCreditCard;
import p040o.resetPinVerifyByFace;
import p040o.setCropType;
import p040o.setGuidelineEnd;
import p040o.setInputDocLongEdge;
import p040o.setTapText;

public class EasycashLandingProductsFragment extends EasycashBaseLandingFragment implements CheckExtractActivity_MembersInjector.AppCompatViewInflater {
    @BindView
    RecyclerView easycashHeaderRecyclerView;
    @HmlPinActivity
    public setInputDocLongEdge easycashProductsLandingPresenter;
    @BindView
    RecyclerView easycashProductsRecyclerView;
    @BindView
    RecyclerView easycashTrackingRecyclerView;
    @HmlPinActivity
    public forEachClear tracker;

    public static EasycashLandingProductsFragment IconCompatParcelizer(getProximitySensorEnabled getproximitysensorenabled, boolean z) {
        EasycashLandingProductsFragment easycashLandingProductsFragment = new EasycashLandingProductsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_PRODUCTS", getproximitysensorenabled);
        bundle.putBoolean("com.scb.phone.EXTRA_IS_BANK_CLIENT", z);
        easycashLandingProductsFragment.setArguments(bundle);
        return easycashLandingProductsFragment;
    }

    public static EasycashLandingProductsFragment MediaDescriptionCompat(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r4) {
        EasycashLandingProductsFragment easycashLandingProductsFragment = new EasycashLandingProductsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE", getlegacysharedprefs);
        bundle.putParcelable("com.scb.phone.view.activity.easycash.EXTRA_INTRODUCTION", r4);
        easycashLandingProductsFragment.setArguments(bundle);
        return easycashLandingProductsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.easycashProductsLandingPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = this.easycashProductsLandingPresenter;
        if (getArguments() != null) {
            boolean z = true;
            if (getArguments().getParcelable("com.scb.phone.EXTRA_PRODUCTS") != null) {
                setInputDocLongEdge setinputdoclongedge = this.easycashProductsLandingPresenter;
                getProximitySensorEnabled getproximitysensorenabled = (getProximitySensorEnabled) getArguments().getParcelable("com.scb.phone.EXTRA_PRODUCTS");
                setinputdoclongedge.read = getArguments().getBoolean("com.scb.phone.EXTRA_IS_BANK_CLIENT");
                if (getproximitysensorenabled != null) {
                    setCropType setcroptype = new setCropType(getproximitysensorenabled);
                    if (setinputdoclongedge.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setcroptype.IconCompatParcelizer(setinputdoclongedge.RatingCompat);
                    }
                    setinputdoclongedge.MediaBrowserCompat$CustomActionResultReceiver(getproximitysensorenabled.MediaBrowserCompat$CustomActionResultReceiver);
                }
            } else if (getArguments().getParcelable("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE") != null) {
                setInputDocLongEdge setinputdoclongedge2 = this.easycashProductsLandingPresenter;
                getLegacySharedPrefs getlegacysharedprefs = (getLegacySharedPrefs) getArguments().getParcelable("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE");
                Onboarding.C37171 r2 = (Onboarding.C37171) getArguments().getParcelable("com.scb.phone.view.activity.easycash.EXTRA_INTRODUCTION");
                if (getlegacysharedprefs != null) {
                    getCropType getcroptype = new getCropType(getlegacysharedprefs, r2);
                    if (setinputdoclongedge2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getcroptype.IconCompatParcelizer(setinputdoclongedge2.RatingCompat);
                    }
                }
            }
        }
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    public final View MediaBrowserCompat$ItemReceiver(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f87042131493931, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.easycashProductsLandingPresenter.onDestroy();
    }

    public final void read(List<getLegacySharedPrefs> list) {
        if (list != null && !list.isEmpty()) {
            SwitchCompat.IconCompatParcelizer((View) this.easycashTrackingRecyclerView, false);
            this.easycashTrackingRecyclerView.setVisibility(0);
            EasycashLoanTrackingAdapter easycashLoanTrackingAdapter = new EasycashLoanTrackingAdapter(list, new resetPinVerifyByCreditCard(this));
            getContext();
            this.easycashTrackingRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            this.easycashTrackingRecyclerView.setAdapter(easycashLoanTrackingAdapter);
            new setGuidelineEnd().MediaBrowserCompat$CustomActionResultReceiver(this.easycashTrackingRecyclerView);
        }
    }

    public final void write(List<getLegacySharedPrefs> list) {
        if (list == null || list.isEmpty()) {
            this.easycashHeaderRecyclerView.setVisibility(8);
            return;
        }
        SwitchCompat.IconCompatParcelizer((View) this.easycashHeaderRecyclerView, false);
        this.easycashHeaderRecyclerView.setVisibility(0);
        EasycashHeaderAdapter easycashHeaderAdapter = new EasycashHeaderAdapter(list, new resetPinVerifyByFace(this));
        getContext();
        this.easycashHeaderRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.easycashHeaderRecyclerView.setAdapter(easycashHeaderAdapter);
        new setGuidelineEnd().MediaBrowserCompat$CustomActionResultReceiver(this.easycashHeaderRecyclerView);
    }

    public final void IconCompatParcelizer(List<getLegacySharedPrefs> list) {
        SwitchCompat.IconCompatParcelizer((View) this.easycashProductsRecyclerView, false);
        EasycashProductAdapter easycashProductAdapter = new EasycashProductAdapter(list, MediaBrowserCompat$CustomActionResultReceiver(list), new preValidation(this));
        this.easycashProductsRecyclerView.setHasFixedSize(true);
        this.easycashProductsRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.easycashProductsRecyclerView.setAdapter(easycashProductAdapter);
    }

    public final void read(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r6) {
        forEachClear foreachclear = this.tracker;
        foreachclear.IconCompatParcelizer.edit().putString("product_type", "CREDIT_CARD").apply();
        foreachclear.write();
        forEachClear foreachclear2 = this.tracker;
        if (getActivity() != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_product");
        }
        Intent read = EasycashCreditCardIntroductionActivity.read(getContext(), getlegacysharedprefs, r6);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 347);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r6) {
        forEachClear foreachclear = this.tracker;
        foreachclear.IconCompatParcelizer.edit().putString("product_type", "SPEEDY_CASH").apply();
        foreachclear.write();
        forEachClear foreachclear2 = this.tracker;
        if (getActivity() != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_product");
        }
        Intent write = EasycashSpeedyCashIntroductionActivity.write(getContext(), getlegacysharedprefs, r6);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(write, 347);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaMetadataCompat(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r6) {
        forEachClear foreachclear = this.tracker;
        foreachclear.IconCompatParcelizer.edit().putString("product_type", "SPEEDY_LOAN").apply();
        foreachclear.write();
        forEachClear foreachclear2 = this.tracker;
        if (getActivity() != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_product");
        }
        Intent write = EasycashSpeedyLoanIntroductionActivity.write(getContext(), getlegacysharedprefs, r6);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(write, 347);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void RatingCompat(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r6) {
        forEachClear foreachclear = this.tracker;
        foreachclear.IconCompatParcelizer.edit().putString("product_type", "SPEEDY_LOAN_TOP_UP").apply();
        foreachclear.write();
        forEachClear foreachclear2 = this.tracker;
        if (getActivity() != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_product");
        }
        Intent MediaBrowserCompat$ItemReceiver = EasycashSpeedyLoanTopupIntroductionActivity.MediaBrowserCompat$ItemReceiver(getContext(), getlegacysharedprefs, r6);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 347);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r6) {
        forEachClear foreachclear = this.tracker;
        foreachclear.IconCompatParcelizer.edit().putString("product_type", "PURPOSEFUL_LOAN").apply();
        foreachclear.write();
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", "REFERRAL"));
        forEachClear foreachclear2 = this.tracker;
        if (getActivity() != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_product");
        }
        Intent MediaBrowserCompat$ItemReceiver = EasycashPurposefulLoanIntroductionActivity.MediaBrowserCompat$ItemReceiver(getContext(), getlegacysharedprefs, r6);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 347);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r6) {
        forEachClear foreachclear = this.tracker;
        foreachclear.IconCompatParcelizer.edit().putString("product_type", "BUSINESS_LOAN").apply();
        foreachclear.write();
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", getlegacysharedprefs.MediaMetadataCompat));
        forEachClear foreachclear2 = this.tracker;
        if (getActivity() != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_product");
        }
        Intent IconCompatParcelizer = EasycashCommercialLoanIntroductionActivity.IconCompatParcelizer(getContext(), getlegacysharedprefs, r6);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(IconCompatParcelizer, 347);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r6) {
        forEachClear foreachclear = this.tracker;
        foreachclear.IconCompatParcelizer.edit().putString("product_type", "MCMC").apply();
        foreachclear.write();
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", "REFERRAL"));
        forEachClear foreachclear2 = this.tracker;
        if (getActivity() != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_product");
        }
        Intent write = EasycashMCMCIntroductionActivity.write(getContext(), getlegacysharedprefs, r6);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(write, 347);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r6) {
        forEachClear foreachclear = this.tracker;
        foreachclear.IconCompatParcelizer.edit().putString("product_type", getlegacysharedprefs.MediaDescriptionCompat).apply();
        foreachclear.write();
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", getlegacysharedprefs.MediaMetadataCompat));
        forEachClear foreachclear2 = this.tracker;
        if (getActivity() != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_product");
        }
        Intent read = EasycashMortgageIntroductionActivity.read(getContext(), getlegacysharedprefs, r6);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 347);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", "REFERRAL"));
        this.tracker.IconCompatParcelizer.edit().remove("entry_point").apply();
        forEachClear foreachclear = this.tracker;
        if (getActivity() != null) {
            foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_credit_power");
        }
        Intent write = EasycashCreditPowerInputActivity.write(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private int MediaBrowserCompat$CustomActionResultReceiver(List<getLegacySharedPrefs> list) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.f82662131493492, (ViewGroup) null, false);
        View findViewById = inflate.findViewById(R.id.card);
        TextView textView = (TextView) inflate.findViewById(R.id.easycash_product_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.easycash_product_description);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.credit_limit_layout);
        TextView textView3 = (TextView) inflate.findViewById(R.id.credit_limit_text);
        TextView textView4 = (TextView) inflate.findViewById(R.id.up_to_text);
        Point point = new Point();
        getActivity().getWindowManager().getDefaultDisplay().getSize(point);
        int i = 0;
        for (getLegacySharedPrefs next : list) {
            textView.setText(next.MediaBrowserCompat$MediaItem);
            textView2.setText(next.MediaBrowserCompat$ItemReceiver);
            if (next.MediaBrowserCompat$CustomActionResultReceiver != null) {
                textView4.setVisibility(0);
                linearLayout.setVisibility(0);
                textView3.setText(next.MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                linearLayout.setVisibility(8);
            }
            findViewById.measure(View.MeasureSpec.makeMeasureSpec((((point.x / 2) - inflate.getPaddingLeft()) - inflate.getPaddingRight()) - ((LinearLayout.LayoutParams) this.easycashProductsRecyclerView.getLayoutParams()).leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(point.y, PKIFailureInfo.systemUnavail));
            if (i <= findViewById.getMeasuredHeight()) {
                i = findViewById.getMeasuredHeight();
            }
        }
        return i;
    }

    public final void write() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("apply_loan_tracking");
        }
        EasycashLoanTrackActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
    }
}
