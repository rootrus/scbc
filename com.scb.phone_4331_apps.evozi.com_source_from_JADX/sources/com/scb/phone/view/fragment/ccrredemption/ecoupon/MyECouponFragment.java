package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.C5573x211f1f83;
import com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponRedemptionDetailActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.MyECouponActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import p040o.AlertController$RecycleListView;
import p040o.C10891verifyOtp;
import p040o.C7196kS;
import p040o.FieldNamingStrategy;
import p040o.FieldNamingStrategy$MediaSessionCompat$ResultReceiverWrapper;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getFirstName;
import p040o.isAlwaysEager;
import p040o.onGetStartedClick;
import p040o.postProductList;
import p040o.setTapText;
import p040o.verifyBusinessPin;
import p040o.verifyResetPin;
import p040o.writeUInt64NoTag;

public final class MyECouponFragment extends BaseFragment implements getFirstName.MediaDescriptionCompat, verifyBusinessPin, C7196kS, verifyResetPin {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    private C10891verifyOtp MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver = true;
    private boolean MediaDescriptionCompat;
    private String MediaMetadataCompat;
    @BindView
    public ImageView ivErrorIcon;
    @BindView
    public ViewGroup llErrorLayout;
    @HmlPinActivity
    public FieldNamingStrategy presenter;
    @BindView
    public RecyclerView rvCouponList;
    @BindView
    public TextView tvErrorGeneric;
    @BindView
    public TextView tvErrorTitle;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static MyECouponFragment MediaBrowserCompat$CustomActionResultReceiver(String str, boolean z, boolean z2) {
            onGetStartedClick.write((Object) str, "cardRef");
            MyECouponFragment myECouponFragment = new MyECouponFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_MY_E_COUPON_CARD_REF_KEY", str);
            bundle.putBoolean("EXTRA_MY_E_COUPON_IS_VALID_KEY", z);
            bundle.putBoolean("EXTRA_E_COUPON_IS_FROM_DEEP_LINK_FLOW", z2);
            myECouponFragment.setArguments(bundle);
            return myECouponFragment;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.MediaMetadataCompat = AlertController$RecycleListView.write(arguments, "EXTRA_MY_E_COUPON_CARD_REF_KEY");
            this.MediaBrowserCompat$SearchResultReceiver = arguments.getBoolean("EXTRA_MY_E_COUPON_IS_VALID_KEY");
            this.MediaDescriptionCompat = arguments.getBoolean("EXTRA_E_COUPON_IS_FROM_DEEP_LINK_FLOW");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f88582131494085, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ButterKnife.IconCompatParcelizer(this, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = new C10891verifyOtp(this);
    }

    public final void onStart() {
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C7196kS kSVar = this;
            onGetStartedClick.write((Object) kSVar, "myECouponViewPagerListener");
            ((MyECouponActivity) activity).MediaBrowserCompat$MediaItem = kSVar;
            FieldNamingStrategy fieldNamingStrategy = this.presenter;
            if (fieldNamingStrategy == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            fieldNamingStrategy.MediaBrowserCompat$ItemReceiver(this);
            String str = this.MediaMetadataCompat;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardRef");
            }
            boolean z = this.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.write((Object) str, "cardRef");
            fieldNamingStrategy.IconCompatParcelizer = str;
            fieldNamingStrategy.MediaBrowserCompat$ItemReceiver = z;
            writeUInt64NoTag.IconCompatParcelizer fieldNamingStrategy$MediaSessionCompat$ResultReceiverWrapper = new FieldNamingStrategy$MediaSessionCompat$ResultReceiverWrapper(fieldNamingStrategy);
            if (fieldNamingStrategy.RatingCompat != null) {
                fieldNamingStrategy$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(fieldNamingStrategy.RatingCompat);
            }
            MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.activity.ccrredemption.ecoupon.MyECouponActivity");
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && isResumed()) {
            MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, 0);
        }
    }

    public final void MediaMetadataCompat() {
        ViewGroup viewGroup = this.llErrorLayout;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llErrorLayout");
        }
        viewGroup.setVisibility(0);
        ImageView imageView = this.ivErrorIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivErrorIcon");
        }
        imageView.setImageResource(R.drawable.ic_yellow_warning);
        TextView textView = this.tvErrorTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorTitle");
        }
        textView.setText(getString(R.string.my_e_coupon_error_title));
        TextView textView2 = this.tvErrorGeneric;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorGeneric");
        }
        textView2.setText(getString(R.string.my_e_coupon_error_generic));
    }

    public final void RatingCompat() {
        ViewGroup viewGroup = this.llErrorLayout;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llErrorLayout");
        }
        viewGroup.setVisibility(0);
        ImageView imageView = this.ivErrorIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivErrorIcon");
        }
        imageView.setImageResource(R.drawable.box_empty);
        TextView textView = this.tvErrorTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorTitle");
        }
        textView.setText(getString(R.string.my_e_coupon_no_coupon_title));
        TextView textView2 = this.tvErrorGeneric;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorGeneric");
        }
        textView2.setText(getString(R.string.my_e_coupon_no_coupon_generic));
    }

    public final void IconCompatParcelizer() {
        RecyclerView recyclerView = this.rvCouponList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCouponList");
        }
        C10891verifyOtp verifyotp = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (verifyotp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        verifyotp.write = this.MediaBrowserCompat$SearchResultReceiver;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C10891verifyOtp verifyotp2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (verifyotp2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        recyclerView.setAdapter(verifyotp2);
    }

    public static final class write extends RecyclerView.ParcelableVolumeInfo {
        private /* synthetic */ MyECouponFragment MediaBrowserCompat$ItemReceiver;

        write(MyECouponFragment myECouponFragment) {
            this.MediaBrowserCompat$ItemReceiver = myECouponFragment;
        }

        public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            onGetStartedClick.write((Object) recyclerView, "recyclerView");
            super.IconCompatParcelizer(recyclerView, i, i2);
            if (i != 0 || i2 != 0) {
                RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = recyclerView.AppCompatActivity;
                if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null) {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                } else if (MyECouponFragment.write(recyclerView, (LinearLayoutManager) recyclerView$MediaBrowserCompat$SearchResultReceiver)) {
                    FieldNamingStrategy fieldNamingStrategy = this.MediaBrowserCompat$ItemReceiver.presenter;
                    if (fieldNamingStrategy == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                    }
                    fieldNamingStrategy.read();
                }
            }
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        RecyclerView recyclerView = this.rvCouponList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCouponList");
        }
        RecyclerView.ParcelableVolumeInfo write2 = new write(this);
        if (recyclerView.setGroupDividerEnabled == null) {
            recyclerView.setGroupDividerEnabled = new ArrayList();
        }
        recyclerView.setGroupDividerEnabled.add(write2);
    }

    public final void IconCompatParcelizer(List<isAlwaysEager> list) {
        onGetStartedClick.write((Object) list, "transactions");
        C10891verifyOtp verifyotp = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (verifyotp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        onGetStartedClick.write((Object) list, "transactions");
        verifyotp.read.addAll(list);
        verifyotp.IconCompatParcelizer.write();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo36400x50fd9e4a() {
        C10891verifyOtp verifyotp = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (verifyotp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        verifyotp.MediaDescriptionCompat = true;
        verifyotp.MediaMetadataCompat = postProductList.SHOWING_LOADER;
        verifyotp.MediaBrowserCompat$CustomActionResultReceiver();
        verifyotp.IconCompatParcelizer.write();
        MediaSessionCompat$QueueItem();
    }

    public final void MediaDescriptionCompat() {
        C10891verifyOtp verifyotp = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (verifyotp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        verifyotp.MediaDescriptionCompat = false;
        verifyotp.MediaMetadataCompat = postProductList.HIDDEN_LOADER;
        verifyotp.MediaBrowserCompat$CustomActionResultReceiver();
        verifyotp.IconCompatParcelizer.write();
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ MyECouponFragment MediaBrowserCompat$ItemReceiver;

        read(MyECouponFragment myECouponFragment) {
            this.MediaBrowserCompat$ItemReceiver = myECouponFragment;
        }

        public final void onClick(View view) {
            FieldNamingStrategy fieldNamingStrategy = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (fieldNamingStrategy == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            fieldNamingStrategy.read();
        }
    }

    public final void MediaSessionCompat$Token() {
        C10891verifyOtp verifyotp = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (verifyotp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        verifyotp.MediaDescriptionCompat = true;
        verifyotp.MediaBrowserCompat$SearchResultReceiver = new read(this);
        verifyotp.MediaMetadataCompat = postProductList.SHOWING_ERROR;
        verifyotp.MediaBrowserCompat$CustomActionResultReceiver();
        verifyotp.IconCompatParcelizer.write();
        MediaSessionCompat$QueueItem();
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        C10891verifyOtp verifyotp = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (verifyotp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        verifyotp.MediaDescriptionCompat = false;
        verifyotp.MediaMetadataCompat = postProductList.HIDDEN_ERROR;
        verifyotp.MediaBrowserCompat$CustomActionResultReceiver();
        verifyotp.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$ItemReceiver(isAlwaysEager isalwayseager) {
        onGetStartedClick.write((Object) isalwayseager, "transaction");
        Context context = getContext();
        if (context != null) {
            C5573x211f1f83 eCouponRedemptionDetailActivity$MediaBrowserCompat$CustomActionResultReceiver = ECouponRedemptionDetailActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            String str = this.MediaMetadataCompat;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardRef");
            }
            Intent MediaBrowserCompat$ItemReceiver = C5573x211f1f83.MediaBrowserCompat$ItemReceiver(context, str, isalwayseager.ParcelableVolumeInfo, isalwayseager.MediaBrowserCompat$SearchResultReceiver, isalwayseager.f2871x50fd9e4a, this.MediaDescriptionCompat);
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

    public final void write(isAlwaysEager isalwayseager) {
        onGetStartedClick.write((Object) isalwayseager, "transaction");
        FieldNamingStrategy fieldNamingStrategy = this.presenter;
        if (fieldNamingStrategy == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) isalwayseager, "transaction");
        writeUInt64NoTag.IconCompatParcelizer ratingCompat = new FieldNamingStrategy.RatingCompat(isalwayseager);
        if (fieldNamingStrategy.RatingCompat != null) {
            ratingCompat.IconCompatParcelizer(fieldNamingStrategy.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        C10891verifyOtp verifyotp = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (verifyotp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        verifyBusinessPin verifybusinesspin = this;
        onGetStartedClick.write((Object) verifybusinesspin, "navigator");
        verifyotp.MediaBrowserCompat$ItemReceiver = verifybusinesspin;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        C10891verifyOtp verifyotp = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (verifyotp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        verifyotp.read.clear();
        verifyotp.IconCompatParcelizer.write();
    }

    public final void onDestroy() {
        RecyclerView recyclerView = this.rvCouponList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCouponList");
        }
        recyclerView.setAdapter((RecyclerView.IconCompatParcelizer) null);
        FieldNamingStrategy fieldNamingStrategy = this.presenter;
        if (fieldNamingStrategy == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        fieldNamingStrategy.onDestroy();
        super.onDestroy();
    }

    public final void write() {
        ViewGroup viewGroup = this.llErrorLayout;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llErrorLayout");
        }
        viewGroup.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        C10891verifyOtp verifyotp = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (verifyotp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        verifyotp.read.remove(i);
        verifyotp.IconCompatParcelizer.write();
    }

    public final void IconCompatParcelizer(int i) {
        FieldNamingStrategy fieldNamingStrategy = this.presenter;
        if (fieldNamingStrategy == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new FieldNamingStrategy.write(i);
        if (fieldNamingStrategy.RatingCompat != null) {
            write2.IconCompatParcelizer(fieldNamingStrategy.RatingCompat);
        }
        fieldNamingStrategy.read.remove(i);
    }

    private final void MediaSessionCompat$QueueItem() {
        RecyclerView recyclerView = this.rvCouponList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCouponList");
        }
        recyclerView.postDelayed(new MyECouponFragment$MediaBrowserCompat$CustomActionResultReceiver(this), 100);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if ((!r0.MediaBrowserCompat$ItemReceiver && r6 == 1 && r7 == 0) == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$ItemReceiver(int r6, int r7) {
        /*
            r5 = this;
            o.FieldNamingStrategy r0 = r5.presenter
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0009:
            o.FieldNamingStrategy$MediaBrowserCompat$ItemReceiver r1 = p040o.FieldNamingStrategy$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r2 = r0.RatingCompat
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0015
            r2 = r4
            goto L_0x0016
        L_0x0015:
            r2 = r3
        L_0x0016:
            if (r2 == 0) goto L_0x001d
            T r2 = r0.RatingCompat
            r1.IconCompatParcelizer(r2)
        L_0x001d:
            boolean r1 = r0.MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x0027
            if (r6 != 0) goto L_0x0027
            if (r7 != 0) goto L_0x0027
            r1 = r4
            goto L_0x0028
        L_0x0027:
            r1 = r3
        L_0x0028:
            if (r1 != 0) goto L_0x0039
            boolean r1 = r0.MediaBrowserCompat$ItemReceiver
            if (r1 != 0) goto L_0x0035
            if (r6 != r4) goto L_0x0035
            if (r7 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r6 = r4
            goto L_0x0036
        L_0x0035:
            r6 = r3
        L_0x0036:
            if (r6 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r3 = r4
        L_0x003a:
            o.FieldNamingStrategy$ParcelableVolumeInfo r6 = new o.FieldNamingStrategy$ParcelableVolumeInfo
            r6.<init>(r0)
            o.writeUInt64NoTag$IconCompatParcelizer r6 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r6
            r0.write(r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ccrredemption.ecoupon.MyECouponFragment.MediaBrowserCompat$ItemReceiver(int, int):void");
    }

    public static final /* synthetic */ int MediaBrowserCompat$ItemReceiver(MyECouponFragment myECouponFragment) {
        RecyclerView recyclerView = myECouponFragment.rvCouponList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCouponList");
        }
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = recyclerView.AppCompatActivity;
        int MediaSessionCompat$ResultReceiverWrapper = recyclerView$MediaBrowserCompat$SearchResultReceiver != null ? recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$ResultReceiverWrapper() : 0;
        RecyclerView recyclerView2 = myECouponFragment.rvCouponList;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCouponList");
        }
        View childAt = recyclerView2.getChildAt(MediaSessionCompat$ResultReceiverWrapper - 2);
        if (childAt != null) {
            return childAt.getHeight();
        }
        return 0;
    }

    public static final /* synthetic */ boolean write(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
        return recyclerView.isShown() && !recyclerView.canScrollVertically(1) && linearLayoutManager.RatingCompat() == linearLayoutManager.MediaSessionCompat$QueueItem() - 1;
    }

    public final void write(int i, int i2) {
        ViewGroup viewGroup = this.llErrorLayout;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llErrorLayout");
        }
        viewGroup.setVisibility(8);
        MediaBrowserCompat$ItemReceiver(i, i2);
        this.MediaBrowserCompat$MediaItem = i;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("myecoupon_landing_invalid");
        }
    }

    public final void read() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("myecoupon_landing_valid");
        }
    }
}
