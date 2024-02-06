package com.scb.phone.view.fragment.profilemanagement;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.bscanc.ManageQrToPayActivity;
import com.scb.phone.view.activity.customizeyourpages.CustomizeYourPageActivity;
import com.scb.phone.view.activity.device.DeviceSettingsActivity;
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailLandingActivity;
import com.scb.phone.view.activity.fastpay.ManageFastPayQrScanActivity;
import com.scb.phone.view.activity.friends.FriendsLandingActivity;
import com.scb.phone.view.activity.mailingaddress.GoodToKnowActivity;
import com.scb.phone.view.activity.mediaimage.MediaImagePreviewActivity;
import com.scb.phone.view.activity.personallimit.PersonalLimitActivity;
import com.scb.phone.view.activity.pinchange.PinChangeActivity;
import com.scb.phone.view.activity.profile_management.manageaccountinbound.ManageAccountInboundActivity;
import com.scb.phone.view.activity.profilemanagement.ManageNotificationsActivity;
import com.scb.phone.view.activity.profilemanagement.ProfileManagementActivity;
import com.scb.phone.view.activity.profilemanagement.manageaccounts.AccountManagementActivity;
import com.scb.phone.view.activity.profilemanagement.promptpay.PromptPayTermsAndConditionsLandingActivity;
import com.scb.phone.view.activity.transferandpay.EditFavouriteActivity;
import com.scb.phone.view.adapter.profilemanagement.ProfileManagementAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesMCMCInformationFragment;
import com.scb.phone.view.fragment.hml.HmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.ActivityBuilder_ContributeHmlVerifyEmailSuccessfulActivity;
import p040o.ActivityBuilder_ContributeHmlVerifyIdentifyActivity;
import p040o.ActivityBuilder_ContributeHmlVerifyPhoneReviewActivity;
import p040o.ActivityBuilder_ContributeHmlVerifyPhoneTermsConditionsActivity;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Log;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.C4096be;
import p040o.C4097bf;
import p040o.C4727hJ;
import p040o.C4728hK;
import p040o.C4797ij;
import p040o.C4798ik;
import p040o.C4900kf;
import p040o.C4901kg;
import p040o.C9946g;
import p040o.ComponentsInitAndBusRegister;
import p040o.FragmentBuilder_BindCheckScbsEligibilityFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.Futures;
import p040o.GoogleMap;
import p040o.HmlPinActivity;
import p040o.IBase64ImageDecoder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TouchPointInstructionActivity;
import p040o.VideoPlayerCameraPlayer;
import p040o.VideoPlayerCameraSourceType;
import p040o.access$210;
import p040o.forEachAdd;
import p040o.forEachDstAtop;
import p040o.getBlackStreakMaxHeight;
import p040o.getDateOfExpirationFieldName;
import p040o.getDateOfIssueFieldName;
import p040o.getIsBarcodeReadFieldName;
import p040o.getLastNameFieldName;
import p040o.getWeightFieldName;
import p040o.getZipFieldName;
import p040o.insert;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setChildDrawingOrderCallback;
import p040o.setJson;
import p040o.setTapText;
import p040o.zzmd;
import p040o.zzwi;

public class ProfileManagementFragment extends BaseFragment implements getBlackStreakMaxHeight, FragmentBuilder_BindCheckScbsEligibilityFragment {
    public boolean IconCompatParcelizer = false;
    @BindView
    ImageView avatarImageView;
    @BindView
    public RecyclerView mRecyclerView;
    @HmlPinActivity
    public VideoPlayerCameraSourceType profileManagementPresenter;
    @BindView
    TextView userNameTextView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89062131494133, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.profileManagementPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_PROFILE_UPDATED")).subscribe(new ActivityBuilder_ContributeHmlVerifyIdentifyActivity(this), ActivityBuilder_ContributeHmlVerifyPhoneReviewActivity.MediaBrowserCompat$ItemReceiver);
        setShortcut();
        return inflate;
    }

    /* access modifiers changed from: private */
    public void setShortcut() {
        zzmd.zzm.zzb.zza zza;
        EasycashFeaturesMCMCInformationFragment.write write;
        boolean z;
        boolean z2;
        VideoPlayerCameraSourceType videoPlayerCameraSourceType = this.profileManagementPresenter;
        zzmd.zzm.zzb.zza zza2 = zzmd.zzm.zzb.zza.JURISTIC;
        if (getActivity() instanceof PreLoadCheckActivity) {
            zza = ((PreLoadCheckActivity) getActivity()).setTitleOptional();
        } else {
            zza = null;
        }
        boolean z3 = true;
        boolean z4 = zza2 == zza;
        if (videoPlayerCameraSourceType.RatingCompat != null) {
            videoPlayerCameraSourceType.RatingCompat.AlertController$RecycleListView();
        }
        boolean read = Build.VERSION.SDK_INT >= 23 ? videoPlayerCameraSourceType.write.get().read() : false;
        access$210 access_210 = videoPlayerCameraSourceType.MediaDescriptionCompat;
        insert insert = videoPlayerCameraSourceType.MediaBrowserCompat$MediaItem;
        zzwi write2 = insert.IconCompatParcelizer.write();
        boolean z5 = (write2 != null && write2.MediaSessionCompat$ResultReceiverWrapper != null) && insert.IconCompatParcelizer.write().MediaSessionCompat$ResultReceiverWrapper.AppCompatDialogFragment;
        if (!z4) {
            write = new EasycashFeaturesMCMCInformationFragment.write(read, read && access_210.read.setPopupCallback());
        } else {
            write = null;
        }
        boolean itemInvoker = access_210.read.setItemInvoker();
        boolean shortcut = access_210.read.setShortcut();
        boolean IconCompatParcelizer2 = access_210.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        TouchPointInstructionActivity AppCompatActivity = access_210.read.AppCompatActivity();
        if (access_210.MediaBrowserCompat$ItemReceiver.write() == null || access_210.MediaBrowserCompat$ItemReceiver.write().MediaSessionCompat$ResultReceiverWrapper == null) {
            z = false;
        } else {
            z = access_210.MediaBrowserCompat$ItemReceiver.write().MediaSessionCompat$ResultReceiverWrapper.PlaybackStateCompat$CustomAction;
        }
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = access_210.read.AppCompatDelegateImpl$ListMenuDecorView();
        zzwi write3 = access_210.MediaBrowserCompat$ItemReceiver.write();
        boolean z6 = (write3 == null || write3.MediaSessionCompat$ResultReceiverWrapper == null || !write3.MediaSessionCompat$ResultReceiverWrapper.PlaybackStateCompat) ? false : true;
        zzwi write4 = access_210.MediaBrowserCompat$ItemReceiver.write();
        if (write4 == null || write4.MediaSessionCompat$ResultReceiverWrapper == null) {
            z2 = false;
        } else {
            z2 = write4.MediaSessionCompat$ResultReceiverWrapper.AlertController$RecycleListView;
        }
        HmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver hmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver = new HmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver(AppCompatActivity, AppCompatDelegateImpl$ListMenuDecorView, itemInvoker, write, shortcut, z, z4, IconCompatParcelizer2, z5, z6, z2);
        videoPlayerCameraSourceType.MediaBrowserCompat$ItemReceiver = hmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver;
        AutoValue_CrashlyticsReport_Session_Event_Log.Builder write5 = videoPlayerCameraSourceType.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(hmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver);
        videoPlayerCameraSourceType.read = write5;
        if (write5 != null) {
            videoPlayerCameraSourceType.write(write5.IconCompatParcelizer != null, new ComponentsInitAndBusRegister(videoPlayerCameraSourceType));
            videoPlayerCameraSourceType.write(videoPlayerCameraSourceType.read.read != null, new C4096be(videoPlayerCameraSourceType));
        }
        if (videoPlayerCameraSourceType.RatingCompat == null) {
            z3 = false;
        }
        if (z3) {
            videoPlayerCameraSourceType.RatingCompat.aj_();
        }
    }

    public final void read(Futures.C34104 r3) {
        this.userNameTextView.setText(r3.IconCompatParcelizer);
        Context context = getContext();
        if (context != null) {
            FragmentBuilder_BindDepositSelectorFragment.read(AlertController$RecycleListView.read(context), this.avatarImageView, r3.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void write(List<AutoValue_CrashlyticsReport_Session_OperatingSystem> list) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        this.mRecyclerView.setFocusable(false);
        this.mRecyclerView.setAdapter(new ProfileManagementAdapter(list, this, getContext()));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        VideoPlayerCameraSourceType videoPlayerCameraSourceType = this.profileManagementPresenter;
        boolean z = true;
        switch (i) {
            case 0:
                VideoPlayerCameraPlayer.C3942a aVar = VideoPlayerCameraPlayer.C3942a.MediaBrowserCompat$ItemReceiver;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    aVar.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 1:
                VideoPlayerCameraPlayer.C39395 r5 = VideoPlayerCameraPlayer.C39395.IconCompatParcelizer;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    r5.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 2:
                C4798ik ikVar = C4798ik.MediaBrowserCompat$ItemReceiver;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    ikVar.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 4:
                IBase64ImageDecoder iBase64ImageDecoder = IBase64ImageDecoder.read;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iBase64ImageDecoder.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 5:
                C4097bf bfVar = C4097bf.IconCompatParcelizer;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    bfVar.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 6:
                getDateOfIssueFieldName getdateofissuefieldname = getDateOfIssueFieldName.MediaBrowserCompat$ItemReceiver;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getdateofissuefieldname.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 7:
                C4901kg kgVar = C4901kg.MediaBrowserCompat$ItemReceiver;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    kgVar.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 12:
                VideoPlayerCameraPlayer.C39384 r52 = VideoPlayerCameraPlayer.C39384.read;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    r52.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 13:
                VideoPlayerCameraPlayer videoPlayerCameraPlayer = VideoPlayerCameraPlayer.read;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    videoPlayerCameraPlayer.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 14:
                getIsBarcodeReadFieldName getisbarcodereadfieldname = getIsBarcodeReadFieldName.write;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getisbarcodereadfieldname.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 16:
                C4900kf kfVar = C4900kf.read;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    kfVar.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 17:
                getDateOfExpirationFieldName getdateofexpirationfieldname = getDateOfExpirationFieldName.IconCompatParcelizer;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getdateofexpirationfieldname.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 18:
                VideoPlayerCameraPlayer.C39373 r53 = VideoPlayerCameraPlayer.C39373.MediaBrowserCompat$CustomActionResultReceiver;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    r53.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 19:
                getWeightFieldName getweightfieldname = new getWeightFieldName(videoPlayerCameraSourceType);
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getweightfieldname.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 21:
                C4728hK hKVar = C4728hK.read;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    hKVar.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 22:
                setJson setjson = new setJson(videoPlayerCameraSourceType);
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setjson.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 23:
                getLastNameFieldName getlastnamefieldname = getLastNameFieldName.IconCompatParcelizer;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getlastnamefieldname.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 24:
                C4727hJ hJVar = C4727hJ.MediaBrowserCompat$CustomActionResultReceiver;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    hJVar.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 25:
                VideoPlayerCameraPlayer.C39351 r54 = VideoPlayerCameraPlayer.C39351.IconCompatParcelizer;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    r54.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            case 26:
                VideoPlayerCameraPlayer.C39362 r55 = VideoPlayerCameraPlayer.C39362.MediaBrowserCompat$CustomActionResultReceiver;
                if (videoPlayerCameraSourceType.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    r55.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z, int i) {
        VideoPlayerCameraSourceType videoPlayerCameraSourceType = this.profileManagementPresenter;
        boolean z2 = true;
        if (i == 8) {
            C9946g.C4444a aVar = new C9946g.C4444a(z);
            if (videoPlayerCameraSourceType.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                aVar.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
            }
        } else if (i == 10) {
            getZipFieldName getzipfieldname = new getZipFieldName(z);
            if (videoPlayerCameraSourceType.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                getzipfieldname.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
            }
        } else if (i == 11) {
            C4797ij ijVar = new C4797ij(z);
            if (videoPlayerCameraSourceType.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                ijVar.IconCompatParcelizer(videoPlayerCameraSourceType.RatingCompat);
            }
        }
    }

    public final void write() {
        if (getActivity() != null) {
            ProfileManagementActivity profileManagementActivity = (ProfileManagementActivity) getActivity();
            profileManagementActivity.MediaSessionCompat$QueueItem(profileManagementActivity.getString(R.string.settings_language_setting));
            profileManagementActivity.getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver("LANGUAGE_FRAGMENT_TAG").IconCompatParcelizer(R.id.fragment_profile_management, new LanguageSettingFragment(), "LANGUAGE_FRAGMENT_TAG").write();
        }
    }

    public final void MediaSessionCompat$Token() {
        Intent MediaBrowserCompat$ItemReceiver = DeviceSettingsActivity.MediaBrowserCompat$ItemReceiver(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaMetadataCompat() {
        Intent intent = new Intent(getContext(), ManageEmailLandingActivity.class);
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
            startActivityForResult(intent, 10004);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        Intent intent = new Intent(getContext(), PinChangeActivity.class);
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

    public final void MediaDescriptionCompat() {
        AccountManagementActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        PromptPayTermsAndConditionsLandingActivity.read(getContext());
    }

    public final void setChecked() {
        Intent intent = new Intent(getContext(), PersonalLimitActivity.class);
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

    public final void AppCompatActivity() {
        ManageNotificationsActivity.read(getContext());
    }

    public final void setCheckable() {
        Intent intent = new Intent(getContext(), CustomizeYourPageActivity.class);
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

    public final void AppCompatViewInflater() {
        Intent intent = new Intent(getContext(), EditFavouriteActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TITLE", getString(R.string.favorite_top_up_empty));
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TAG", "TOPUP");
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

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo39205x50fd9e4a() {
        Intent intent = new Intent(getContext(), EditFavouriteActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TITLE", getString(R.string.favorite_bill_payment_empty));
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TAG", "BILLPAYMENT");
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

    public final void ActionMenuItemView() {
        Intent intent = new Intent(getContext(), EditFavouriteActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TITLE", getString(R.string.favorite_transfer_empty));
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TAG", "TRANSFER");
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

    public final void setExpandedFormat() {
        Intent intent = new Intent(getContext(), EditFavouriteActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TITLE", getString(R.string.favorite_remittance_title));
        intent.putExtra("com.scb.phone.EXTRA_EDIT_FAVOURITE_TAG", "REMITTANCE");
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

    public final void AppCompatDialogFragment() {
        forEachAdd foreachadd = new forEachAdd();
        if (getActivity() != null) {
            foreachadd.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "fastpay_managefastpay");
        }
        Intent intent = new Intent(getContext(), ManageFastPayQrScanActivity.class);
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
            startActivityForResult(intent, 10005);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setContentView() {
        Intent MediaBrowserCompat$ItemReceiver = ManageQrToPayActivity.MediaBrowserCompat$ItemReceiver(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        if (getContext() != null) {
            Intent IconCompatParcelizer2 = GoodToKnowActivity.IconCompatParcelizer(getContext());
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(IconCompatParcelizer2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(IconCompatParcelizer2, 10004);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaSessionCompat$QueueItem() {
        ManageAccountInboundActivity.read(getContext());
    }

    public final void RatingCompat() {
        Intent intent = new Intent(getContext(), EBillSubscriptionActivity.class);
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

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Context context = getContext();
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, FriendsLandingActivity.class);
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
        forEachDstAtop foreachdstatop = new forEachDstAtop();
        if (getActivity() != null) {
            foreachdstatop.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "settings_friends_get_friends");
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_ContributeHmlVerifyPhoneTermsConditionsActivity.write(this, i, iArr);
    }

    public final void setIcon() {
        this.profileManagementPresenter.MediaDescriptionCompat.read.MediaBrowserCompat$CustomActionResultReceiver(false);
    }

    public final void setPadding() {
        this.IconCompatParcelizer = true;
        ActivityBuilder_ContributeHmlVerifyPhoneTermsConditionsActivity.read(this);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.profileManagementPresenter.read(true);
    }

    public final void IconCompatParcelizer() {
        this.profileManagementPresenter.read(false);
    }

    public final void read() {
        this.profileManagementPresenter.IconCompatParcelizer(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.profileManagementPresenter.IconCompatParcelizer(false);
    }

    public final void setItemInvoker() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
        VideoPlayerCameraSourceType videoPlayerCameraSourceType = this.profileManagementPresenter;
        videoPlayerCameraSourceType.MediaDescriptionCompat.read.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
    }

    @OnClick
    public void onSelectImageClicked() {
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
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
            startActivityForResult(intent, 10003);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10003 && i2 == -1) {
            if (!intent.getBooleanExtra("isCropped", false)) {
                Intent intent2 = new Intent(getContext(), MediaImagePreviewActivity.class);
                intent2.putExtra("imageUri", intent.getData());
                intent2.putExtra("maxWidth", TitleChanger.DEFAULT_ANIMATION_DELAY);
                intent2.putExtra("maxHeight", TitleChanger.DEFAULT_ANIMATION_DELAY);
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                try {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        intent2 = setTapText.write(activity, intent2).read();
                    }
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                    sb.append(intent2.getData());
                    sb.append("\n with context ");
                    sb.append(activity.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                    startActivityForResult(intent2, 10003);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                getContext().sendBroadcast(new Intent("com.scb.phone/BROADCAST_PROFILE_UPDATED"));
            }
        } else if (i == 10004) {
            setShortcut();
        } else if (i == 10005) {
            int verticalScrollbarPosition = this.mRecyclerView.getVerticalScrollbarPosition();
            setShortcut();
            this.mRecyclerView.post(new ActivityBuilder_ContributeHmlVerifyEmailSuccessfulActivity(this, verticalScrollbarPosition));
        }
    }

    public final void read(String str) {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("settings_scb_connect");
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(603979776);
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
        } catch (ActivityNotFoundException | NullPointerException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }
}
