package com.scb.phone.view.fragment.ntb.ekyc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointFillInfoActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointTermsAndConditionsActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.lang.ref.WeakReference;
import kotlin.TypeCastException;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AbstractMultimap;
import p040o.C5417sp;
import p040o.CardView;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.FragmentBuilder_BindDepositMoreInfoFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.Lists;
import p040o.Lists$TwoPlusArrayList$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.ZTBSV;
import p040o.blend;
import p040o.containsRow;
import p040o.expiration;
import p040o.getICheckDeserializerRtti;
import p040o.immediateFailedFuture;
import p040o.initialCapacity;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.setTitleMarginStart;
import p040o.sp$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.sp$MediaBrowserCompat$ItemReceiver;
import p040o.toLongArray;
import p040o.writeUInt64NoTag;

public class EkycTermsAndConditionsFragment extends BaseFragment implements ServerProjectProvider.C70684.read, FragmentBuilder_BindCustomizeYourPageFragment {
    public static final write IconCompatParcelizer = new write((byte) 0);
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private blend MediaBrowserCompat$SearchResultReceiver = new blend();
    @HmlPinActivity
    public C5417sp presenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            blend blend = this.MediaBrowserCompat$SearchResultReceiver;
            C5417sp spVar = this.presenter;
            if (spVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String write2 = spVar.read.write();
            blend.read("source", str);
            if (write2 != null && "touchpoint".equals(str)) {
                blend.read("customer_group", write2);
            }
        }
        ZTBSV ztbsv = this.MediaBrowserCompat$SearchResultReceiver;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_savingaccount");
        }
        TermsAndConditionsFragment.write write3 = TermsAndConditionsFragment.IconCompatParcelizer;
        Fragment MediaBrowserCompat$CustomActionResultReceiver2 = TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture);
        onGetStartedClick.write((Object) this, "$this$replaceFragment");
        onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver2, "fragment");
        setTitleMarginStart childFragmentManager = getChildFragmentManager();
        onGetStartedClick.IconCompatParcelizer((Object) childFragmentManager, "childFragmentManager");
        CardView read = childFragmentManager.read();
        onGetStartedClick.IconCompatParcelizer((Object) read, "beginTransaction()");
        CardView MediaBrowserCompat$ItemReceiver = read.MediaBrowserCompat$ItemReceiver(R.id.frame_layout_terms_and_conditions, MediaBrowserCompat$CustomActionResultReceiver2);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "replace(frameId, fragment)");
        MediaBrowserCompat$ItemReceiver.write();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        C5417sp spVar = this.presenter;
        if (spVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        spVar.MediaBrowserCompat$ItemReceiver(this);
        View inflate = layoutInflater.inflate(R.layout.f86292131493856, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = null;
        String string = arguments != null ? arguments.getString("BUNDLE_PRODUCT_CODE") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("BUNDLE_OBJECTIVE_ID");
        }
        if (string != null && str != null) {
            C5417sp spVar = this.presenter;
            if (spVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) string, "productCode");
            onGetStartedClick.write((Object) str, "objectiveId");
            spVar.MediaBrowserCompat$ItemReceiver = string;
            spVar.IconCompatParcelizer = str;
            toLongArray tolongarray = spVar.MediaBrowserCompat$MediaItem;
            onGetStartedClick.write((Object) string, "productCode");
            String MediaBrowserCompat$CustomActionResultReceiver2 = AbstractMultimap.MediaBrowserCompat$CustomActionResultReceiver("EKYC", string);
            onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver2, "path");
            String read = getICheckDeserializerRtti.read(MediaBrowserCompat$CustomActionResultReceiver2, tolongarray.read);
            onGetStartedClick.IconCompatParcelizer((Object) read, "Utilities.transformAssetUrl(path, baseStaticURL)");
            immediateFailedFuture MediaBrowserCompat$CustomActionResultReceiver3 = toLongArray.MediaBrowserCompat$CustomActionResultReceiver(spVar.MediaBrowserCompat$MediaItem, read, (String) null, (String) null, (String) null, true, false, (String) null, 72);
            boolean z = true;
            MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver = true;
            writeUInt64NoTag.IconCompatParcelizer sp_mediabrowsercompat_customactionresultreceiver = new sp$MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver3);
            if (spVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                sp_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(spVar.RatingCompat);
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = (KtaJsonCheck.MediaDescriptionCompat) context;
            this.MediaBrowserCompat$CustomActionResultReceiver = mediaDescriptionCompat != null ? mediaDescriptionCompat.read() : null;
        } else if (context instanceof TouchPointTermsAndConditionsActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = TouchPointTermsAndConditionsActivity.m3335x50fd9e4a();
        }
    }

    public final void IconCompatParcelizer() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (activity != null) {
            FragmentBuilder_BindDepositMoreInfoFragment.write((WeakReference<BaseActivity>) new WeakReference((BaseActivity) activity));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.activity.BaseActivity");
    }

    public void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "productCode");
        onGetStartedClick.write((Object) str2, "objectiveId");
        TouchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver touchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver = TouchPointFillInfoActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        Intent write2 = TouchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver.write(requireContext, DiskLruCache.VERSION_1);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write2 = setTapText.write(activity, write2).read();
            }
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(write2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroyView() {
        C5417sp spVar = this.presenter;
        if (spVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        spVar.onDestroy();
        super.onDestroyView();
    }

    public final void IconCompatParcelizer(String str) {
        C5417sp spVar = this.presenter;
        if (spVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (spVar.RatingCompat != null) {
            spVar.RatingCompat.AlertController$RecycleListView();
        }
        Lists.TwoPlusArrayList twoPlusArrayList = spVar.write;
        FundFactSheetActivity sp_mediabrowsercompat_itemreceiver = new sp$MediaBrowserCompat$ItemReceiver(spVar);
        FundFactSheetActivity write2 = new C5417sp.write(spVar);
        containsRow containsrow = new containsRow();
        initialCapacity IconCompatParcelizer2 = initialCapacity.IconCompatParcelizer();
        String str2 = spVar.MediaBrowserCompat$ItemReceiver;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productCode");
        }
        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = str2;
        containsrow.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer2;
        expiration MediaBrowserCompat$ItemReceiver = expiration.MediaBrowserCompat$ItemReceiver();
        String str3 = spVar.IconCompatParcelizer;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("objectiveId");
        }
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = str3;
        containsrow.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) containsrow, "EkycRequest()\n          …ObjectiveId(objectiveId))");
        onGetStartedClick.write((Object) sp_mediabrowsercompat_itemreceiver, "onSuccess");
        onGetStartedClick.write((Object) write2, "onError");
        onGetStartedClick.write((Object) containsrow, "request");
        twoPlusArrayList.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(containsrow);
        twoPlusArrayList.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(new Lists$TwoPlusArrayList$MediaBrowserCompat$ItemReceiver(write2, sp_mediabrowsercompat_itemreceiver));
    }

    public final void write(String str) {
        C5417sp spVar = this.presenter;
        if (spVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5417sp.read.MediaBrowserCompat$ItemReceiver;
        if (spVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(spVar.RatingCompat);
        }
    }

    public final void setContentView() {
        requireActivity().finish();
    }

    public static Bundle MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "depositProductCode");
        onGetStartedClick.write((Object) str2, "objectiveId");
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_PRODUCT_CODE", str);
        bundle.putString("BUNDLE_OBJECTIVE_ID", str2);
        return bundle;
    }
}
