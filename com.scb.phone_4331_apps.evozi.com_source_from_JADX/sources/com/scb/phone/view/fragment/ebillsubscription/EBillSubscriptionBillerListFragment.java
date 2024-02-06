package com.scb.phone.view.fragment.ebillsubscription;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionInputActivity;
import com.scb.phone.view.adapter.transferandpay.BillerAdapter;
import com.scb.phone.view.fragment.transferandpay.BaseBillersFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import p040o.AccountTransferClient;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C10887sdkVersion;
import p040o.C4768hj;
import p040o.CrashlyticsReport;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.GoogleSigninService;
import p040o.HmlNationalIdActivity;
import p040o.HmlPinActivity;
import p040o.ImagePerfectionProfile;
import p040o.MyECouponActivity_ViewBinding;
import p040o.StreetViewPanoramaFragment;
import p040o.StreetViewPanoramaOptions;
import p040o.count$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getHoles;
import p040o.getTopLeftCornerWidth;
import p040o.isLockScreenSolved;
import p040o.lessThanUnsigned;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.readMapMaker;
import p040o.setChildDrawingOrderCallback;
import p040o.setInfoWindowAnchor;
import p040o.setTapText;
import p040o.writeBooleanList;
import p040o.writeBundle;
import p040o.writeByte;
import p040o.writeUInt64NoTag;

public final class EBillSubscriptionBillerListFragment extends BaseBillersFragment implements getTopLeftCornerWidth.MediaMetadataCompat {
    private final String MediaBrowserCompat$CustomActionResultReceiver = "^[0-9a-zA-Z\\u0E00-\\u0E7F _*'\"#&()@.,/:-]+$";
    private BulkTransferDeepLinkActivity MediaMetadataCompat;
    @HmlPinActivity
    public ImagePerfectionProfile.UseMRZPassportDetection eBillSubscriptionBillerListPresenter;
    @BindView
    public TextView mRecommendedBillersTextView;
    @BindView
    public Button mSearchButton;
    @BindView
    public EditText mSearchEditText;
    @BindView
    public View mViewBillerNotFound;
    @BindView
    public View searchBarLayout;
    @BindView
    public ImageButton searchEditClear;

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        onGetStartedClick.write((Object) execution, "billPaymentBillerDisplay");
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    static final class read<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            onCheckBoxClick.write((Throwable) obj);
        }
    }

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<Intent> {
        private /* synthetic */ EBillSubscriptionBillerListFragment IconCompatParcelizer;

        write(EBillSubscriptionBillerListFragment eBillSubscriptionBillerListFragment) {
            this.IconCompatParcelizer = eBillSubscriptionBillerListFragment;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            EBillSubscriptionBillerListFragment eBillSubscriptionBillerListFragment = this.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) (Intent) obj, "it");
            EBillSubscriptionBillerListFragment.MediaBrowserCompat$CustomActionResultReceiver(eBillSubscriptionBillerListFragment);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f87182131493945, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        MediaBrowserCompat$CustomActionResultReceiver(this, view);
        ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.eBillSubscriptionBillerListPresenter;
        if (useMRZPassportDetection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("eBillSubscriptionBillerListPresenter");
        }
        useMRZPassportDetection.MediaBrowserCompat$ItemReceiver(this);
        this.IconCompatParcelizer = new BillerAdapter(getContext(), new ArrayList(), this);
        EditText editText = this.mSearchEditText;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        editText.addTextChangedListener(new C5946xa046d547(this));
        View view2 = this.searchBarLayout;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchBarLayout");
        }
        view2.setVisibility(8);
        EditText editText2 = this.mSearchEditText;
        if (editText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        editText2.setHint(getString(R.string.search_biller));
        Button button = this.mSearchButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchButton");
        }
        button.setEnabled(false);
        Button button2 = this.mSearchButton;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchButton");
        }
        button2.setAllCaps(true);
        Button button3 = this.mSearchButton;
        if (button3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchButton");
        }
        button3.setText(getString(R.string.search));
        EditText editText3 = this.mSearchEditText;
        if (editText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        editText3.setFilters(new InputFilter[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment(this.MediaBrowserCompat$CustomActionResultReceiver)});
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.eBillSubscriptionBillerListPresenter;
        if (useMRZPassportDetection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("eBillSubscriptionBillerListPresenter");
        }
        useMRZPassportDetection.write();
    }

    public final void IconCompatParcelizer(List<? extends CrashlyticsReport.Session.Builder> list) {
        onGetStartedClick.write((Object) list, "billerDisplayList");
        super.IconCompatParcelizer(list);
        View view = this.searchBarLayout;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchBarLayout");
        }
        view.setVisibility(0);
    }

    public final void onStart() {
        super.onStart();
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("FAVORITE")).subscribe(new write(this), read.IconCompatParcelizer);
    }

    public final void onStop() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity;
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.MediaMetadataCompat;
        if (!(bulkTransferDeepLinkActivity2 == null || bulkTransferDeepLinkActivity2.isDisposed() || (bulkTransferDeepLinkActivity = this.MediaMetadataCompat) == null)) {
            bulkTransferDeepLinkActivity.dispose();
        }
        super.onStop();
    }

    public final void onDestroy() {
        ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.eBillSubscriptionBillerListPresenter;
        if (useMRZPassportDetection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("eBillSubscriptionBillerListPresenter");
        }
        useMRZPassportDetection.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer() {
        super.IconCompatParcelizer();
        EditText editText = this.mSearchEditText;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        editText.setVisibility(8);
        TextView textView = this.mRecommendedBillersTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecommendedBillersTextView");
        }
        textView.setVisibility(8);
        RecyclerView recyclerView = this.mRecyclerView;
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "mRecyclerView");
        recyclerView.setVisibility(8);
        Button button = this.mSearchButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchButton");
        }
        button.setVisibility(8);
        ImageButton imageButton = this.searchEditClear;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchEditClear");
        }
        imageButton.setVisibility(8);
    }

    public final void write() {
        TextView textView = this.mRecommendedBillersTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecommendedBillersTextView");
        }
        textView.setVisibility(0);
        EditText editText = this.mSearchEditText;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        editText.setVisibility(0);
        Button button = this.mSearchButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchButton");
        }
        button.setVisibility(0);
        RecyclerView recyclerView = this.mRecyclerView;
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "mRecyclerView");
        recyclerView.setVisibility(0);
        ImageButton imageButton = this.searchEditClear;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchEditClear");
        }
        imageButton.setVisibility(0);
        View view = this.mViewBillerNotFound;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewBillerNotFound");
        }
        view.setVisibility(8);
    }

    public final void read() {
        ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.eBillSubscriptionBillerListPresenter;
        if (useMRZPassportDetection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("eBillSubscriptionBillerListPresenter");
        }
        useMRZPassportDetection.write((int) R.string.biller_not_found);
    }

    @OnEditorAction
    public final boolean onSearchAction(int i) {
        if (i != 3) {
            return false;
        }
        EditText editText = this.mSearchEditText;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        if (editText.getText().toString().length() < 3) {
            return false;
        }
        searchButtonClicked();
        PlaybackStateCompat$CustomAction();
        return true;
    }

    @OnClick
    public final void searchButtonClicked() {
        EditText editText = this.mSearchEditText;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        String obj = editText.getText().toString();
        if (obj.length() > 0) {
            List list = HmlNationalIdActivity.IconCompatParcelizer;
            onGetStartedClick.write((Object) list, "billerDisplayList");
            super.IconCompatParcelizer(list);
            View view = this.searchBarLayout;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchBarLayout");
            }
            view.setVisibility(0);
            write();
            ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.eBillSubscriptionBillerListPresenter;
            if (useMRZPassportDetection == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("eBillSubscriptionBillerListPresenter");
            }
            useMRZPassportDetection.MediaBrowserCompat$ItemReceiver(obj, "", true);
        }
    }

    @OnClick
    public final void onClickClear() {
        EditText editText = this.mSearchEditText;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        editText.setText("");
    }

    public final void read(int i) {
        super.read(i);
        CrashlyticsReport.Session.Builder IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(i);
        if (IconCompatParcelizer2 != null) {
            Intent write2 = EBillSubscriptionInputActivity.write(getContext(), (CrashlyticsReport.Session.Event.Application.Execution) IconCompatParcelizer2);
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
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.transferandpay.billpayment.BillPaymentBillerDisplay");
        }
    }

    public final void onEmptyLayoutClick() {
        super.onEmptyLayoutClick();
        ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = this.eBillSubscriptionBillerListPresenter;
        if (useMRZPassportDetection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("eBillSubscriptionBillerListPresenter");
        }
        useMRZPassportDetection.write();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RecyclerView recyclerView = this.mRecyclerView;
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "mRecyclerView");
        recyclerView.setVisibility(8);
        View view = this.mViewBillerNotFound;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewBillerNotFound");
        }
        view.setVisibility(0);
        TextView textView = this.mRecommendedBillersTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecommendedBillersTextView");
        }
        textView.setText(R.string.search_biller);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        C5945x7c496478 eBillSubscriptionBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver = new C5945x7c496478(this, linearLayoutManager);
        this.mRecyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        RecyclerView recyclerView = this.mRecyclerView;
        RecyclerView.ParcelableVolumeInfo parcelableVolumeInfo = eBillSubscriptionBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver;
        if (recyclerView.setGroupDividerEnabled == null) {
            recyclerView.setGroupDividerEnabled = new ArrayList();
        }
        recyclerView.setGroupDividerEnabled.add(parcelableVolumeInfo);
        RecyclerView recyclerView2 = this.mRecyclerView;
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView2, "mRecyclerView");
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = linearLayoutManager;
        recyclerView2.setLayoutManager(recyclerView$MediaBrowserCompat$SearchResultReceiver);
        BillerAdapter billerAdapter = this.IconCompatParcelizer;
        billerAdapter.MediaBrowserCompat$ItemReceiver = recyclerView$MediaBrowserCompat$SearchResultReceiver;
        billerAdapter.write = false;
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver2 = billerAdapter.MediaBrowserCompat$ItemReceiver;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver2 == null || (recyclerView$MediaBrowserCompat$SearchResultReceiver2 instanceof GridLayoutManager)) {
            billerAdapter.write = true;
        }
        billerAdapter.IconCompatParcelizer.write();
        TextView textView = this.mRecommendedBillersTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecommendedBillersTextView");
        }
        textView.setText(R.string.search_biller);
        RecyclerView recyclerView3 = this.mRecyclerView;
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView3, "mRecyclerView");
        recyclerView3.setVisibility(0);
    }

    public static final class IconCompatParcelizer implements C10887sdkVersion {
        private final isLockScreenSolved IconCompatParcelizer;
        private final C4768hj.write MediaBrowserCompat$ItemReceiver;
        private final count$MediaBrowserCompat$CustomActionResultReceiver read;
        public final AccountTransferClient.zzc write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(C4768hj.write write2, isLockScreenSolved islockscreensolved, AccountTransferClient.zzc zzc, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
            this.MediaBrowserCompat$ItemReceiver = write2;
            this.IconCompatParcelizer = islockscreensolved;
            this.write = zzc;
            this.read = count_mediabrowsercompat_customactionresultreceiver;
        }

        public final void read() {
            this.read.MediaBrowserCompat$CustomActionResultReceiver.edit().putString("com.scb.phone.pref.key.API_REFRESH", "").commit();
        }

        public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$CustomActionResultReceiver(readMapMaker readmapmaker) {
            return this.MediaBrowserCompat$ItemReceiver.read.deleteDevice(readmapmaker).flatMap(writeBooleanList.MediaBrowserCompat$ItemReceiver);
        }

        public final String MediaBrowserCompat$CustomActionResultReceiver() {
            return this.read.MediaBrowserCompat$CustomActionResultReceiver.getString("com.scb.phone.pref.key.API_REFRESH", "");
        }

        public final DebitCardResetOtpActivity<List<setInfoWindowAnchor>> write() {
            return this.MediaBrowserCompat$ItemReceiver.read.getDevices().flatMap(new writeByte(this));
        }

        public final DebitCardResetOtpActivity<getHoles> MediaBrowserCompat$ItemReceiver(CustomConcurrentHashMap.EntryFactory entryFactory) {
            return this.MediaBrowserCompat$ItemReceiver.read.updateDevice(entryFactory).flatMap(new writeBundle(this));
        }
    }

    public static final /* synthetic */ String MediaBrowserCompat$ItemReceiver(EBillSubscriptionBillerListFragment eBillSubscriptionBillerListFragment) {
        EditText editText = eBillSubscriptionBillerListFragment.mSearchEditText;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSearchEditText");
        }
        return editText.getText().toString();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(EBillSubscriptionBillerListFragment eBillSubscriptionBillerListFragment) {
        List<StreetViewPanoramaOptions> list;
        ImagePerfectionProfile.UseMRZPassportDetection useMRZPassportDetection = eBillSubscriptionBillerListFragment.eBillSubscriptionBillerListPresenter;
        if (useMRZPassportDetection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("eBillSubscriptionBillerListPresenter");
        }
        StreetViewPanoramaFragment.zza zza = useMRZPassportDetection.read;
        if (zza != null) {
            lessThanUnsigned lessthanunsigned = useMRZPassportDetection.write;
            if (zza != null) {
                list = zza.write;
            } else {
                list = null;
            }
            CrashlyticsReport.Session.Event.Application.Execution write2 = lessthanunsigned.write(list, useMRZPassportDetection.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.write(), useMRZPassportDetection.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setCheckable());
            boolean z = true;
            if (write2 != null) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new ImagePerfectionProfile.UseMRZPassportDetection.IconCompatParcelizer(write2);
                if (useMRZPassportDetection.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(useMRZPassportDetection.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = ImagePerfectionProfile.UseMRZPassportDetection.write.MediaBrowserCompat$ItemReceiver;
            if (useMRZPassportDetection.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(useMRZPassportDetection.RatingCompat);
            }
        }
    }
}
