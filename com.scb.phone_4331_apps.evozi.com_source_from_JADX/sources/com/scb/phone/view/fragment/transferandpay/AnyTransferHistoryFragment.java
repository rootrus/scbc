package com.scb.phone.view.fragment.transferandpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.common.C5580xe75847fb;
import com.scb.phone.view.activity.common.ThirdPartySlipActivity;
import com.scb.phone.view.activity.transferandpay.FavouriteSelectedActivity;
import com.scb.phone.view.adapter.transferandpay.HistoryAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.C3080xc2f5febc;
import p040o.C5080ny;
import p040o.C5168qN;
import p040o.C7515tZ;
import p040o.CheckEligibilityActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindRegistrationNewPinFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.addInput;
import p040o.getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver;
import p040o.getWrappedCursor;
import p040o.isUidGoogleSigned;
import p040o.newListMultimap;
import p040o.onGetStartedClick;
import p040o.requestLocationUpdates;
import p040o.setBoundsBias;
import p040o.setFrames;
import p040o.setTapText;
import p040o.setWindow;
import p040o.standardToString;
import p040o.unbindServiceSafe;
import p040o.validateGER;
import p040o.validateGER$MediaBrowserCompat$ItemReceiver;
import p040o.validateHERK;
import p040o.zzcg;
import p040o.zzdy;

public abstract class AnyTransferHistoryFragment extends BaseFragment implements getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver, validateGER.write, validateGER$MediaBrowserCompat$ItemReceiver {
    public boolean IconCompatParcelizer;
    private HistoryAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private RecyclerView.IconCompatParcelizer<?> MediaDescriptionCompat;
    private validateGER MediaMetadataCompat;
    @BindView
    public RelativeLayout emptyCard;
    @BindView
    public TextView emptyDescription;
    @BindView
    public ImageView emptyImage;
    @BindView
    public TextView emptyTitle;
    @BindView
    public View historyView;
    @BindView
    public View loadingView;
    @BindView
    public TextView noHistoryDescriptionTextView;
    @BindView
    public View noHistoryDescriptionView;
    @BindView
    public RecyclerView recyclerView;

    public abstract void IconCompatParcelizer(setFrames setframes);

    public abstract void MediaBrowserCompat$ItemReceiver(setFrames setframes);

    public abstract C5168qN MediaDescriptionCompat();

    public abstract String MediaMetadataCompat();

    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<setFrames, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ AnyTransferHistoryFragment IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(AnyTransferHistoryFragment anyTransferHistoryFragment) {
            super(1);
            this.IconCompatParcelizer = anyTransferHistoryFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setFrames setframes = (setFrames) obj;
            onGetStartedClick.write((Object) setframes, "it");
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setframes);
            this.IconCompatParcelizer.MediaDescriptionCompat().write(setframes);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final class IconCompatParcelizer implements C7515tZ {
        private final C5080ny.write MediaBrowserCompat$ItemReceiver;
        public final isUidGoogleSigned read;
        private final FragmentBuilder_BindRegistrationNewPinFragment write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(C5080ny.write write2, isUidGoogleSigned isuidgooglesigned, FragmentBuilder_BindRegistrationNewPinFragment fragmentBuilder_BindRegistrationNewPinFragment) {
            this.MediaBrowserCompat$ItemReceiver = write2;
            this.read = isuidgooglesigned;
            this.write = fragmentBuilder_BindRegistrationNewPinFragment;
        }

        public final DebitCardResetOtpActivity<List<zzdy.zze>> MediaBrowserCompat$CustomActionResultReceiver() {
            return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.getPersonalLimit().flatMap(new unbindServiceSafe(this));
        }

        public final DebitCardResetOtpActivity<newListMultimap.write> read() {
            return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.getPersonalLimit().flatMap(new getWrappedCursor(this));
        }

        public final DebitCardResetOtpActivity<setBoundsBias> IconCompatParcelizer(String str, String str2) {
            return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.getPersonalLimitUsage(str, str2).flatMap(new setWindow(this));
        }

        public final standardToString write() {
            return this.write.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$ItemReceiver(String str, String str2, standardToString standardtostring) {
            return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.putPersonalLimit(str, str2, standardtostring).map(new zzcg(this.read));
        }

        public final void read(standardToString standardtostring) {
            this.write.MediaBrowserCompat$CustomActionResultReceiver = standardtostring;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f90122131494239, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        MediaDescriptionCompat().MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        validateGER validateger = new validateGER(bundle != null ? bundle.getParcelable("RecyclerViewExpandableItemManager") : null);
        this.MediaMetadataCompat = validateger;
        validateGER.write write2 = this;
        validateHERK validateherk = validateger.MediaDescriptionCompat;
        if (validateherk != null) {
            validateherk.MediaMetadataCompat = write2;
        } else {
            validateger.MediaBrowserCompat$CustomActionResultReceiver = write2;
        }
        validateGER validateger2 = this.MediaMetadataCompat;
        if (validateger2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mItemManager");
        }
        validateGER$MediaBrowserCompat$ItemReceiver validateger_mediabrowsercompat_itemreceiver = this;
        validateHERK validateherk2 = validateger2.MediaDescriptionCompat;
        if (validateherk2 != null) {
            validateherk2.RatingCompat = validateger_mediabrowsercompat_itemreceiver;
        } else {
            validateger2.MediaBrowserCompat$ItemReceiver = validateger_mediabrowsercompat_itemreceiver;
        }
        Context context = getContext();
        validateGER validateger3 = this.MediaMetadataCompat;
        if (validateger3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mItemManager");
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = new HistoryAdapter(context, validateger3, new AnyTransferHistoryFragment$MediaBrowserCompat$ItemReceiver(this), new write(this), new C6178xc0df1dfa(this));
        validateGER validateger4 = this.MediaMetadataCompat;
        if (validateger4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mItemManager");
        }
        HistoryAdapter historyAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (historyAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mHistoryAdapter");
        }
        RecyclerView.IconCompatParcelizer<?> MediaBrowserCompat$ItemReceiver = validateger4.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) historyAdapter);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "mItemManager.createWrappedAdapter(mHistoryAdapter)");
        this.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver;
        addInput addinput = new addInput();
        addinput.MediaSessionCompat$ResultReceiverWrapper = false;
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        RecyclerView.IconCompatParcelizer<?> iconCompatParcelizer = this.MediaDescriptionCompat;
        if (iconCompatParcelizer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mWrappedAdapter");
        }
        recyclerView3.setAdapter(iconCompatParcelizer);
        RecyclerView recyclerView4 = this.recyclerView;
        if (recyclerView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView4.setItemAnimator(addinput);
        RecyclerView recyclerView5 = this.recyclerView;
        if (recyclerView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView5.setHasFixedSize(false);
        RecyclerView recyclerView6 = this.recyclerView;
        if (recyclerView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView6.setNestedScrollingEnabled(false);
        validateGER validateger5 = this.MediaMetadataCompat;
        if (validateger5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mItemManager");
        }
        RecyclerView recyclerView7 = this.recyclerView;
        if (recyclerView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        validateger5.IconCompatParcelizer(recyclerView7);
        RelativeLayout relativeLayout = this.emptyCard;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("emptyCard");
        }
        relativeLayout.setOnClickListener(new read(this));
        TextView textView = this.noHistoryDescriptionTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("noHistoryDescriptionTextView");
        }
        textView.setText(MediaMetadataCompat());
        MediaDescriptionCompat().MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void onSaveInstanceState(Bundle bundle) {
        onGetStartedClick.write((Object) bundle, "outState");
        super.onSaveInstanceState(bundle);
        validateGER validateger = this.MediaMetadataCompat;
        if (validateger == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mItemManager");
        }
        bundle.putParcelable("RecyclerViewExpandableItemManager", validateger.read());
    }

    public void onDestroyView() {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.setItemAnimator((RecyclerView.MediaMetadataCompat) null);
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView3.setAdapter((RecyclerView.IconCompatParcelizer) null);
        super.onDestroyView();
    }

    public void onDestroy() {
        MediaDescriptionCompat().onDestroy();
        super.onDestroy();
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ AnyTransferHistoryFragment MediaBrowserCompat$ItemReceiver;

        read(AnyTransferHistoryFragment anyTransferHistoryFragment) {
            this.MediaBrowserCompat$ItemReceiver = anyTransferHistoryFragment;
        }

        public final void onClick(View view) {
            this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat().MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        View view = this.loadingView;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loadingView");
        }
        view.setVisibility(8);
        View view2 = this.historyView;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("historyView");
        }
        view2.setVisibility(8);
        View view3 = this.noHistoryDescriptionView;
        if (view3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("noHistoryDescriptionView");
        }
        view3.setVisibility(0);
    }

    public final void read() {
        this.IconCompatParcelizer = false;
        HistoryAdapter historyAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (historyAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mHistoryAdapter");
        }
        historyAdapter.write(HistoryAdapter.IconCompatParcelizer.ERROR);
        View view = this.loadingView;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loadingView");
        }
        view.setVisibility(8);
        View view2 = this.historyView;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("historyView");
        }
        view2.setVisibility(0);
    }

    private final void MediaBrowserCompat$ItemReceiver(C3080xc2f5febc.Builder builder) {
        HistoryAdapter historyAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (historyAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mHistoryAdapter");
        }
        historyAdapter.MediaBrowserCompat$ItemReceiver = builder.read;
        historyAdapter.IconCompatParcelizer.write();
    }

    public final void Keep() {
        View view = this.noHistoryDescriptionView;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("noHistoryDescriptionView");
        }
        view.setVisibility(8);
        RelativeLayout relativeLayout = this.emptyCard;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("emptyCard");
        }
        relativeLayout.setVisibility(8);
        View view2 = this.loadingView;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loadingView");
        }
        view2.setVisibility(0);
        View view3 = this.historyView;
        if (view3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("historyView");
        }
        view3.setVisibility(8);
    }

    public final void write() {
        HistoryAdapter historyAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (historyAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mHistoryAdapter");
        }
        historyAdapter.write(HistoryAdapter.IconCompatParcelizer.LOADING);
    }

    public final void IconCompatParcelizer() {
        HistoryAdapter historyAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (historyAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mHistoryAdapter");
        }
        historyAdapter.write(HistoryAdapter.IconCompatParcelizer.NONE);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        setFrames write2 = write(i);
        if (write2 != null) {
            write2.MediaDescriptionCompat = true;
        }
    }

    public final void read(int i) {
        setFrames write2 = write(i);
        if (write2 != null) {
            write2.MediaDescriptionCompat = false;
        }
    }

    private final setFrames write(int i) {
        HistoryAdapter historyAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (historyAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mHistoryAdapter");
        }
        List list = historyAdapter.read;
        if (i < list.size()) {
            return (setFrames) list.get(i);
        }
        return null;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(getContext(), FavouriteSelectedActivity.class);
        intent.putExtra("source", "repeat_transaction");
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

    public final void MediaBrowserCompat$ItemReceiver(String str, requestLocationUpdates requestlocationupdates) {
        onGetStartedClick.write((Object) str, "refId");
        onGetStartedClick.write((Object) requestlocationupdates, "function");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C5580xe75847fb thirdPartySlipActivity$MediaBrowserCompat$CustomActionResultReceiver = ThirdPartySlipActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) activity, "it");
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = C5580xe75847fb.MediaBrowserCompat$CustomActionResultReceiver(activity, str, requestlocationupdates);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity2, MediaBrowserCompat$CustomActionResultReceiver2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer(C3080xc2f5febc.Builder builder) {
        if (builder != null) {
            this.IconCompatParcelizer = !builder.MediaBrowserCompat$CustomActionResultReceiver;
            HistoryAdapter historyAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (historyAdapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mHistoryAdapter");
            }
            historyAdapter.write(HistoryAdapter.IconCompatParcelizer.NONE);
            View view = this.loadingView;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("loadingView");
            }
            view.setVisibility(8);
            View view2 = this.historyView;
            if (view2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("historyView");
            }
            view2.setVisibility(0);
            HistoryAdapter historyAdapter2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (historyAdapter2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mHistoryAdapter");
            }
            onGetStartedClick.write((Object) builder, "transactions");
            if (!builder.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                int size = historyAdapter2.read.size();
                int size2 = builder.MediaBrowserCompat$ItemReceiver.size();
                historyAdapter2.read.addAll(builder.MediaBrowserCompat$ItemReceiver);
                historyAdapter2.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(size, size2);
                historyAdapter2.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(size - 1, 1);
            }
            MediaBrowserCompat$ItemReceiver(builder);
            return;
        }
        read();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C3080xc2f5febc.Builder builder) {
        if (builder != null) {
            boolean z = true;
            if (builder.MediaBrowserCompat$CustomActionResultReceiver) {
                z = false;
            }
            this.IconCompatParcelizer = z;
            HistoryAdapter historyAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (historyAdapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mHistoryAdapter");
            }
            historyAdapter.write(HistoryAdapter.IconCompatParcelizer.NONE);
            View view = this.loadingView;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("loadingView");
            }
            view.setVisibility(8);
            View view2 = this.historyView;
            if (view2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("historyView");
            }
            view2.setVisibility(0);
            HistoryAdapter historyAdapter2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (historyAdapter2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mHistoryAdapter");
            }
            onGetStartedClick.write((Object) builder, "transactions");
            historyAdapter2.read.clear();
            historyAdapter2.read.addAll(builder.MediaBrowserCompat$ItemReceiver);
            historyAdapter2.IconCompatParcelizer.write();
            MediaBrowserCompat$ItemReceiver(builder);
            return;
        }
        read();
    }
}
