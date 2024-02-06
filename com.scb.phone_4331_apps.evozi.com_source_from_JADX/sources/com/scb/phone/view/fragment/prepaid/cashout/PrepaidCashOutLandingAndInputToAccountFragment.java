package com.scb.phone.view.fragment.prepaid.cashout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import kotlin.TypeCastException;
import p040o.GoogleSigninService;
import p040o.onGetStartedClick;
import p040o.setDynamicHeightEnabled;
import p040o.setRam;

public final class PrepaidCashOutLandingAndInputToAccountFragment extends BaseFragment implements setDynamicHeightEnabled.write {
    public static final C6125x6d7cfb51 IconCompatParcelizer = new C6125x6d7cfb51((byte) 0);
    private setDynamicHeightEnabled MediaBrowserCompat$CustomActionResultReceiver;
    private ArrayList<setRam> MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public read MediaMetadataCompat;
    @BindView
    public RecyclerView mRecyclerView;

    public interface read {
        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        void mo15161x50fd9e4a();

        void write(setRam setram);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f88942131494121, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        Bundle arguments = getArguments();
        Object obj = arguments != null ? arguments.get("EXTRA_ACCOUNT_SOURCE_DISPLAY_LIST") : null;
        if (obj != null) {
            this.MediaBrowserCompat$SearchResultReceiver = (ArrayList) obj;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecyclerView");
            }
            getActivity();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
            ArrayList<setRam> arrayList = this.MediaBrowserCompat$SearchResultReceiver;
            if (arrayList == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mToAccounts");
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = new setDynamicHeightEnabled(arrayList, this);
            RecyclerView recyclerView2 = this.mRecyclerView;
            if (recyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecyclerView");
            }
            setDynamicHeightEnabled setdynamicheightenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (setdynamicheightenabled == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
            }
            recyclerView2.setAdapter(setdynamicheightenabled);
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.scb.phone.presentation.model.display.prepaid.cashout.PrepaidCashOutLandingToAccountDisplay> /* = java.util.ArrayList<com.scb.phone.presentation.model.display.prepaid.cashout.PrepaidCashOutLandingToAccountDisplay> */");
    }

    public final void write(setRam setram) {
        onGetStartedClick.write((Object) setram, "prepaidCashOutLandingToAccountDisplay");
        read read2 = this.MediaMetadataCompat;
        if (read2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mListener");
        }
        read2.write(setram);
    }

    public final void IconCompatParcelizer() {
        read read2 = this.MediaMetadataCompat;
        if (read2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mListener");
        }
        read2.mo15161x50fd9e4a();
    }
}
