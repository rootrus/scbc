package com.scb.phone.view.fragment.sme.gifting;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.landingpage.PartnerWebViewActivity;
import com.scb.phone.view.activity.sme.gifting.GiftRecipientActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.regex.Pattern;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.C10004hT;
import p040o.C10111qG;
import p040o.C4733hS;
import p040o.CheckParameters_MembersInjector;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SquareCap;
import p040o.captureImage;
import p040o.getZoomOutMsg;
import p040o.setCapturedMsg;
import p040o.setCurrentSession;
import p040o.setTapText;
import p040o.setZoomOutMsg;
import p040o.setZoomOutMsg$MediaBrowserCompat$ItemReceiver;
import p040o.unsetLiveEntry;

public class GiftingPresentTransferInputFragment extends BaseGiftTransferInputFragment implements CheckParameters_MembersInjector.read {
    @HmlPinActivity
    public setZoomOutMsg giftPresentTransferInputPresenter;

    public static GiftingPresentTransferInputFragment read(AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("GIFT_TRANSFER_DISPLAY", r2);
        GiftingPresentTransferInputFragment giftingPresentTransferInputFragment = new GiftingPresentTransferInputFragment();
        giftingPresentTransferInputFragment.setArguments(bundle);
        return giftingPresentTransferInputFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.giftPresentTransferInputPresenter.MediaBrowserCompat$ItemReceiver(this);
        setZoomOutMsg setzoomoutmsg = this.giftPresentTransferInputPresenter;
        AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r6 = (AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991) getArguments().getParcelable("GIFT_TRANSFER_DISPLAY");
        setzoomoutmsg.MediaBrowserCompat$ItemReceiver = r6;
        boolean z = true;
        if (setzoomoutmsg.RatingCompat != null) {
            C4733hS hSVar = new C4733hS(r6);
            if (setzoomoutmsg.RatingCompat == null) {
                z = false;
            }
            if (z) {
                hSVar.IconCompatParcelizer(setzoomoutmsg.RatingCompat);
            }
        }
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder) {
        setZoomOutMsg setzoomoutmsg = this.giftPresentTransferInputPresenter;
        setzoomoutmsg.write = builder;
        boolean z = true;
        if (builder != null) {
            if (setzoomoutmsg.RatingCompat != null) {
                captureImage captureimage = new captureImage(builder);
                if (setzoomoutmsg.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    captureimage.IconCompatParcelizer(setzoomoutmsg.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        if (setzoomoutmsg.RatingCompat != null) {
            setCapturedMsg setcapturedmsg = setCapturedMsg.MediaBrowserCompat$CustomActionResultReceiver;
            if (setzoomoutmsg.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setcapturedmsg.IconCompatParcelizer(setzoomoutmsg.RatingCompat);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$SearchResultReceiver() {
        setZoomOutMsg setzoomoutmsg = this.giftPresentTransferInputPresenter;
        boolean isEnabled = this.sendGiftButton.isEnabled();
        boolean z = true;
        if (setzoomoutmsg.RatingCompat != null) {
            if (isEnabled != (setzoomoutmsg.write != null)) {
                getZoomOutMsg getzoomoutmsg = getZoomOutMsg.MediaBrowserCompat$ItemReceiver;
                if (setzoomoutmsg.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getzoomoutmsg.IconCompatParcelizer(setzoomoutmsg.RatingCompat);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void RatingCompat() {
        boolean z;
        setZoomOutMsg setzoomoutmsg = this.giftPresentTransferInputPresenter;
        String obj = this.noteEditText.mNoteEditText.getText().toString();
        boolean z2 = true;
        if (TextUtils.isEmpty(obj) || Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(obj).matches()) {
            z = true;
        } else {
            if (setzoomoutmsg.RatingCompat != null) {
                C10111qG qGVar = C10111qG.MediaBrowserCompat$ItemReceiver;
                if (setzoomoutmsg.RatingCompat != null) {
                    qGVar.IconCompatParcelizer(setzoomoutmsg.RatingCompat);
                }
            }
            z = false;
        }
        if (z) {
            setzoomoutmsg.MediaBrowserCompat$MediaItem = obj;
            if (setzoomoutmsg.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                setzoomoutmsg.RatingCompat.AlertController$RecycleListView();
            }
            SquareCap squareCap = setzoomoutmsg.read;
            unsetLiveEntry MediaBrowserCompat$ItemReceiver = unsetLiveEntry.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.write = setzoomoutmsg.write.MediaBrowserCompat$ItemReceiver;
            squareCap.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver);
            setzoomoutmsg.read.IconCompatParcelizer(new setZoomOutMsg$MediaBrowserCompat$ItemReceiver(setzoomoutmsg, (byte) 0));
        }
    }

    /* access modifiers changed from: protected */
    public void onPreviewButtonClicked() {
        ((BaseActivity) getActivity()).mo13676d_("gifting_input_preview");
        setZoomOutMsg setzoomoutmsg = this.giftPresentTransferInputPresenter;
        String obj = this.noteEditText.mNoteEditText.getText().toString();
        boolean z = true;
        if (setzoomoutmsg.RatingCompat != null) {
            C10004hT hTVar = new C10004hT(setzoomoutmsg, obj);
            if (setzoomoutmsg.RatingCompat == null) {
                z = false;
            }
            if (z) {
                hTVar.IconCompatParcelizer(setzoomoutmsg.RatingCompat);
            }
        }
    }

    public final void read(setCurrentSession setcurrentsession) {
        Intent putExtra = new Intent(getActivity(), PartnerWebViewActivity.class).putExtra("com.scb.phone.EXTRA_DISPLAY", setcurrentsession);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putExtra = setTapText.write(activity, putExtra).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(putExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(putExtra);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        Intent intent = new Intent(getActivity(), GiftRecipientActivity.class);
        intent.putExtra("RECIPIENT_TYPE", "present");
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
            startActivityForResult(intent, 100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.giftPresentTransferInputPresenter.onDestroy();
        if (this.IconCompatParcelizer != null && !this.IconCompatParcelizer.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
    }
}
