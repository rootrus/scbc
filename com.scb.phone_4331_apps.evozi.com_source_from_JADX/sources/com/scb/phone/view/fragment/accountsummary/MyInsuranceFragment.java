package com.scb.phone.view.fragment.accountsummary;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.insurance.InsurancePortfolioActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C6983xe0e73acb;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setShowNotificationDialog;
import p040o.setTapText;

public final class MyInsuranceFragment extends BaseFragment implements C6983xe0e73acb {
    @BindView
    public ConstraintLayout csLayoutMyInsurance;
    @HmlPinActivity
    public setShowNotificationDialog presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f85522131493779, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        setShowNotificationDialog setshownotificationdialog = this.presenter;
        if (setshownotificationdialog == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setshownotificationdialog.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [o.toSoapObject] */
    /* JADX WARNING: type inference failed for: r0v7, types: [o.toSoapObject] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            super.onViewCreated(r4, r5)
            o.setShowNotificationDialog r4 = r3.presenter
            if (r4 != 0) goto L_0x0011
            java.lang.String r5 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x0011:
            o.zzmd$zzm$zzb$zza r5 = p040o.zzmd.zzm.zzb.zza.INDIVIDUAL
            o.LinkedListMultimap$4 r0 = r4.IconCompatParcelizer
            o.notNull r0 = r0.read
            o.zzmd$zzm$zzb$zza r0 = r0.IconCompatParcelizer()
            r1 = 1
            r2 = 0
            if (r5 != r0) goto L_0x0051
            o.LinkedListMultimap$4 r5 = r4.IconCompatParcelizer
            o.setTabRippleColorResource r5 = r5.write
            o.getFrontException r5 = r5.IconCompatParcelizer
            o.zzwi r5 = r5.write()
            if (r5 == 0) goto L_0x0032
            o.PlaceFilter$zzb r5 = r5.MediaSessionCompat$ResultReceiverWrapper
            if (r5 == 0) goto L_0x0032
            boolean r5 = r5.MediaDescriptionCompat
            goto L_0x0033
        L_0x0032:
            r5 = r2
        L_0x0033:
            if (r5 == 0) goto L_0x0051
            o.setShowNotificationDialog$MediaBrowserCompat$ItemReceiver r5 = p040o.setShowNotificationDialog$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver
            o.FundFactSheetActivity r5 = (p040o.FundFactSheetActivity) r5
            if (r5 == 0) goto L_0x0041
            o.toSoapObject r0 = new o.toSoapObject
            r0.<init>(r5)
            r5 = r0
        L_0x0041:
            o.writeUInt64NoTag$IconCompatParcelizer r5 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r5
            T r0 = r4.RatingCompat
            if (r0 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r1 = r2
        L_0x0049:
            if (r1 == 0) goto L_0x0050
            T r4 = r4.RatingCompat
            r5.IconCompatParcelizer(r4)
        L_0x0050:
            return
        L_0x0051:
            o.setShowNotificationDialog$write r5 = p040o.setShowNotificationDialog.write.IconCompatParcelizer
            o.FundFactSheetActivity r5 = (p040o.FundFactSheetActivity) r5
            if (r5 == 0) goto L_0x005d
            o.toSoapObject r0 = new o.toSoapObject
            r0.<init>(r5)
            r5 = r0
        L_0x005d:
            o.writeUInt64NoTag$IconCompatParcelizer r5 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r5
            T r0 = r4.RatingCompat
            if (r0 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            if (r1 == 0) goto L_0x006c
            T r4 = r4.RatingCompat
            r5.IconCompatParcelizer(r4)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.accountsummary.MyInsuranceFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [o.toSoapObject] */
    /* JADX WARNING: Multi-variable type inference failed */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClickInsurancePortfolio() {
        /*
            r5 = this;
            o.setShowNotificationDialog r0 = r5.presenter
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0009:
            o.LinkedListMultimap$4 r1 = r0.IconCompatParcelizer
            o.StreetViewPanoramaOrientation r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r1 = r1.write
            boolean r1 = r1.setShortcut()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0033
            o.setShowNotificationDialog$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.C10152xe755f3ff.MediaBrowserCompat$ItemReceiver
            o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
            if (r1 == 0) goto L_0x0023
            o.toSoapObject r4 = new o.toSoapObject
            r4.<init>(r1)
            r1 = r4
        L_0x0023:
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r4 = r0.RatingCompat
            if (r4 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r2 = r3
        L_0x002b:
            if (r2 == 0) goto L_0x0032
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x0032:
            return
        L_0x0033:
            o.setShowNotificationDialog$IconCompatParcelizer r1 = p040o.setShowNotificationDialog.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r4 = r0.RatingCompat
            if (r4 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0044
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.accountsummary.MyInsuranceFragment.onClickInsurancePortfolio():void");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        InsurancePortfolioActivity.IconCompatParcelizer iconCompatParcelizer = InsurancePortfolioActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, InsurancePortfolioActivity.class);
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

    static final class read implements DialogInterface.OnClickListener {
        private /* synthetic */ MyInsuranceFragment MediaBrowserCompat$CustomActionResultReceiver;

        read(MyInsuranceFragment myInsuranceFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = myInsuranceFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            MyInsuranceFragment.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            dialogInterface.dismiss();
        }
    }

    public final void write(int i) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(requireContext()).MediaBrowserCompat$ItemReceiver((int) R.string.auto_save_dialog_title).IconCompatParcelizer(i);
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.auto_save_dialog_go_settings), new read(this));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.auto_save_dialog_cancel), MyInsuranceFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    public final void write() {
        ConstraintLayout constraintLayout = this.csLayoutMyInsurance;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("csLayoutMyInsurance");
        }
        constraintLayout.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ConstraintLayout constraintLayout = this.csLayoutMyInsurance;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("csLayoutMyInsurance");
        }
        constraintLayout.setVisibility(0);
    }

    public static final /* synthetic */ void read(MyInsuranceFragment myInsuranceFragment) {
        Intent addFlags = new Intent(myInsuranceFragment.requireContext(), HomeActivity.class).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.more_options_tab).addFlags(603979776);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = myInsuranceFragment.getActivity();
            if (activity != null) {
                addFlags = setTapText.write(activity, addFlags).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(addFlags.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            myInsuranceFragment.startActivity(addFlags);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
