package com.scb.phone.view.fragment.remittance;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.remittance.C5712x6024113b;
import com.scb.phone.view.activity.remittance.RemittanceCoachmarkActivity;
import com.scb.phone.view.activity.remittance.RemittanceTermsAndConsActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AbstractBiMap;
import p040o.C5011nL;
import p040o.C5012nM;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.cancelLoadAllVariants;
import p040o.nL$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.nL$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class RemittanceLandingFragment extends BaseFragment implements cancelLoadAllVariants {
    public static final C6154x158bbeb6 MediaBrowserCompat$CustomActionResultReceiver = new C6154x158bbeb6((byte) 0);
    @HmlPinActivity
    public C5011nL presenter;
    @BindView
    public NestedScrollView rootView;

    private static final /* synthetic */ void IconCompatParcelizer(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((RemittanceLandingFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((RemittanceLandingFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f89422131494169, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    private static final /* synthetic */ void write(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((RemittanceLandingFragment) fragment).startActivityForResult(intent, 1002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C5011nL nLVar = this.presenter;
        if (nLVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nLVar.MediaBrowserCompat$ItemReceiver(this);
        C5011nL nLVar2 = this.presenter;
        if (nLVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (nLVar2.RatingCompat != null) {
            nLVar2.RatingCompat.AlertController$RecycleListView();
        }
        AbstractBiMap.EntrySet.C29881 r6 = nLVar2.write;
        C5011nL nLVar3 = nLVar2;
        r6.read(r6.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat(), new C5012nM(new C5011nL.MediaMetadataCompat(nLVar3)), new C5012nM(new C5011nL.RatingCompat(nLVar3)));
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("outward_remittance_start");
        }
    }

    public final void IconCompatParcelizer() {
        C5712x6024113b remittanceTermsAndConsActivity$MediaBrowserCompat$CustomActionResultReceiver = RemittanceTermsAndConsActivity.MediaBrowserCompat$SearchResultReceiver;
        Intent intent = new Intent(getContext(), RemittanceTermsAndConsActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r1 == null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver() {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L_0x0086
            android.os.Bundle r1 = r6.getArguments()
            r2 = 0
            if (r1 == 0) goto L_0x0022
            r3 = -1
            java.lang.String r4 = "STATE"
            int r1 = r1.getInt(r4, r3)
            if (r1 < 0) goto L_0x001d
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder[] r3 = p040o.C3092xce3d994b.Builder.values()
            r1 = r3[r1]
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder r1 = (p040o.C3092xce3d994b.Builder) r1
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder r1 = p040o.C3092xce3d994b.Builder.NORMAL
        L_0x0024:
            int[] r3 = p040o.ActivityBuilder_ContributePrepaidConfirmPinActivity.IconCompatParcelizer
            int r4 = r1.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L_0x0073
            r4 = 2
            java.lang.String r5 = "it"
            if (r3 == r4) goto L_0x005b
            android.os.Bundle r3 = r6.getArguments()
            if (r3 == 0) goto L_0x0042
            java.lang.String r2 = "INPUT_DISPLAY"
            android.os.Parcelable r2 = r3.getParcelable(r2)
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$1 r2 = (p040o.C3088x7e3e3ebd.C30891) r2
        L_0x0042:
            com.scb.phone.view.activity.remittance.RemittanceInputActivity$read r3 = com.scb.phone.view.activity.remittance.RemittanceInputActivity.MediaMetadataCompat
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r5)
            android.content.Intent r0 = com.scb.phone.view.activity.remittance.RemittanceInputActivity.read.IconCompatParcelizer(r0, r1, r2)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            MediaBrowserCompat$CustomActionResultReceiver(r6, r0)
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x0086
            r0.finish()
            return
        L_0x005b:
            com.scb.phone.view.activity.remittance.RemittanceAddFavouriteInputActivity$IconCompatParcelizer r1 = com.scb.phone.view.activity.remittance.RemittanceAddFavouriteInputActivity.MediaMetadataCompat
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r5)
            java.lang.String r1 = "context"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.scb.phone.view.activity.remittance.RemittanceAddFavouriteInputActivity> r2 = com.scb.phone.view.activity.remittance.RemittanceAddFavouriteInputActivity.class
            r1.<init>(r0, r2)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            write(r6, r1)
            return
        L_0x0073:
            android.content.Intent r0 = com.scb.phone.view.activity.transferandpay.FavouriteSelectedActivity.read(r0)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            IconCompatParcelizer(r6, r0)
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x0086
            r0.finish()
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceLandingFragment.MediaBrowserCompat$ItemReceiver():void");
    }

    public final void write() {
        RemittanceCoachmarkActivity.write write = RemittanceCoachmarkActivity.MediaBrowserCompat$MediaItem;
        Intent intent = new Intent(getContext(), RemittanceCoachmarkActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(intent, 1000);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity;
        switch (i) {
            case 1000:
                if (i2 == -1) {
                    C5011nL nLVar = this.presenter;
                    if (nLVar == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                    }
                    boolean z = true;
                    if (!nLVar.MediaBrowserCompat$ItemReceiver) {
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5011nL.write.IconCompatParcelizer;
                        if (nLVar.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            iconCompatParcelizer.IconCompatParcelizer(nLVar.RatingCompat);
                            break;
                        }
                    } else {
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = nL$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                        if (nLVar.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            iconCompatParcelizer2.IconCompatParcelizer(nLVar.RatingCompat);
                            break;
                        }
                    }
                }
                break;
            case 1001:
                if (i2 != -1) {
                    if (i2 == 0 && (activity = getActivity()) != null) {
                        activity.finish();
                        break;
                    }
                } else {
                    MediaBrowserCompat$ItemReceiver();
                    break;
                }
            case 1002:
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    activity2.setResult(i2);
                }
                FragmentActivity activity3 = getActivity();
                if (activity3 != null) {
                    activity3.finish();
                    break;
                }
                break;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        NestedScrollView nestedScrollView = this.rootView;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rootView");
        }
        nestedScrollView.setVisibility(0);
    }

    @OnClick
    public final void buttonGetStartedClick() {
        C5011nL nLVar = this.presenter;
        if (nLVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (!nLVar.write.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat()) {
            writeUInt64NoTag.IconCompatParcelizer nl_mediabrowsercompat_customactionresultreceiver = new nL$MediaBrowserCompat$CustomActionResultReceiver(nLVar);
            if (nLVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                nl_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(nLVar.RatingCompat);
            }
        } else if (nLVar.MediaBrowserCompat$ItemReceiver) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = nL$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (nLVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(nLVar.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C5011nL.write.IconCompatParcelizer;
            if (nLVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(nLVar.RatingCompat);
            }
        }
    }

    public final void onDestroyView() {
        C5011nL nLVar = this.presenter;
        if (nLVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nLVar.onDestroy();
        super.onDestroyView();
    }
}
