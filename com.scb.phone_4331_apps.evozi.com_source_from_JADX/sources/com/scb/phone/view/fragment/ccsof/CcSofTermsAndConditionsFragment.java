package com.scb.phone.view.fragment.ccsof;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import p040o.C5409sj;
import p040o.C7083xf48138e2;
import p040o.CardView;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.sj$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.toLongArray;
import p040o.writeUInt64NoTag;

public final class CcSofTermsAndConditionsFragment extends BaseFragment implements C7083xf48138e2, FragmentBuilder_BindCustomizeYourPageFragment {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    @HmlPinActivity
    public C5409sj presenter;

    public final void IconCompatParcelizer(String str) {
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void write(String str) {
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        TermsAndConditionsFragment.write write = TermsAndConditionsFragment.IconCompatParcelizer;
        TermsAndConditionsFragment MediaBrowserCompat$CustomActionResultReceiver = TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture);
        CardView read = getChildFragmentManager().read();
        onGetStartedClick.IconCompatParcelizer((Object) read, "childFragmentManager.beginTransaction()");
        read.MediaBrowserCompat$ItemReceiver(R.id.frame_layout_terms_and_conditions, MediaBrowserCompat$CustomActionResultReceiver).write();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        C5409sj sjVar = this.presenter;
        if (sjVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        sjVar.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C5409sj sjVar2 = this.presenter;
            if (sjVar2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            int i = arguments.getInt("EXTRA_CARD_TYPE");
            writeUInt64NoTag.IconCompatParcelizer sj_mediabrowsercompat_customactionresultreceiver = new sj$MediaBrowserCompat$CustomActionResultReceiver(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(sjVar2.IconCompatParcelizer, (String) null, i != 101 ? i != 102 ? null : "CC_SOF_SPEEDY_CASH" : "CC_SOF_CREDIT_CARD", (String) null, (String) null, false, false, (String) null, 72));
            if (sjVar2.RatingCompat != null) {
                sj_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(sjVar2.RatingCompat);
            }
        }
        View inflate = layoutInflater.inflate(R.layout.f86292131493856, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void setContentView() {
        requireActivity().finish();
    }
}
