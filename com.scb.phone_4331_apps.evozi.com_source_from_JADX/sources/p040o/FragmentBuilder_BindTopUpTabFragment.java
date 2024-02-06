package p040o;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.thunderhead.android.infrastructure.p057ui.views.TTFAppCompatRadioButton;
import com.thunderhead.android.infrastructure.server.entitys.InteractionData;
import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.PlaybackStateCompat;

/* renamed from: o.FragmentBuilder_BindTopUpTabFragment */
public final class FragmentBuilder_BindTopUpTabFragment implements FragmentBuilder_BindTouchPointInputCidFragment {
    private PopupWindow IconCompatParcelizer;
    private PopupWindow Keep;
    private final PopupWindow.OnDismissListener MediaBrowserCompat$CustomActionResultReceiver = new read(this);
    private onAccountSummaryClick MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public FragmentBuilder_BindTouchPointPinFragment MediaBrowserCompat$MediaItem;
    private RadioGroup.OnCheckedChangeListener MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer(this);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private RadioGroup f3153x50fd9e4a;
    /* access modifiers changed from: private */
    public TTFAppCompatRadioButton MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public TTFAppCompatRadioButton MediaMetadataCompat;
    private final View.OnClickListener MediaSessionCompat$QueueItem = new write(this);
    /* access modifiers changed from: private */
    public TTFAppCompatRadioButton MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private View ParcelableVolumeInfo;
    private WeakReference<Activity> PlaybackStateCompat$CustomAction;
    private final FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Integer> RatingCompat = new C6847x13951d62(this);
    private int read;
    private View write;

    public FragmentBuilder_BindTopUpTabFragment(FragmentBuilder_BindTouchPointPinFragment fragmentBuilder_BindTouchPointPinFragment) {
        this.MediaBrowserCompat$MediaItem = fragmentBuilder_BindTouchPointPinFragment;
        try {
            FragmentBuilder_BindTouchPointPinFragment fragmentBuilder_BindTouchPointPinFragment2 = this.MediaBrowserCompat$MediaItem;
            if (fragmentBuilder_BindTouchPointPinFragment2 != null) {
                fragmentBuilder_BindTouchPointPinFragment2.attach(this);
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.PANEL_INIT_ERROR);
        }
    }

    /* renamed from: o.FragmentBuilder_BindTopUpTabFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer implements RadioGroup.OnCheckedChangeListener {
        private /* synthetic */ FragmentBuilder_BindTopUpTabFragment MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(FragmentBuilder_BindTopUpTabFragment fragmentBuilder_BindTopUpTabFragment) {
            this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindTopUpTabFragment;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            FragmentBuilder_BindTouchPointPinFragment MediaBrowserCompat$ItemReceiver2;
            if (i == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_panel_bottom_radiobutton_exit) {
                FragmentBuilder_BindTouchPointPinFragment MediaBrowserCompat$ItemReceiver3 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
                if (MediaBrowserCompat$ItemReceiver3 != null) {
                    MediaBrowserCompat$ItemReceiver3.exit();
                }
            } else if (i == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_panel_bottom_radiobutton_launchpad) {
                FragmentBuilder_BindTouchPointPinFragment MediaBrowserCompat$ItemReceiver4 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
                if (MediaBrowserCompat$ItemReceiver4 != null) {
                    MediaBrowserCompat$ItemReceiver4.selectLaunchpad();
                }
            } else if (i == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_panel_bottom_radiobutton_works) {
                FragmentBuilder_BindTouchPointPinFragment MediaBrowserCompat$ItemReceiver5 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
                if (MediaBrowserCompat$ItemReceiver5 != null) {
                    MediaBrowserCompat$ItemReceiver5.selectInTheWorks();
                }
            } else if (i == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_panel_bottom_radiobutton_live && (MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem) != null) {
                MediaBrowserCompat$ItemReceiver2.selectLive();
            }
        }
    }

    /* renamed from: o.FragmentBuilder_BindTopUpTabFragment$write */
    static final class write implements View.OnClickListener {
        private /* synthetic */ FragmentBuilder_BindTopUpTabFragment MediaBrowserCompat$CustomActionResultReceiver;

        write(FragmentBuilder_BindTopUpTabFragment fragmentBuilder_BindTopUpTabFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindTopUpTabFragment;
        }

        public final void onClick(View view) {
            FragmentBuilder_BindTouchPointPinFragment MediaBrowserCompat$ItemReceiver;
            TTFAppCompatRadioButton tTFAppCompatRadioButton = (TTFAppCompatRadioButton) (!(view instanceof TTFAppCompatRadioButton) ? null : view);
            if (tTFAppCompatRadioButton != null && !tTFAppCompatRadioButton.isChecked()) {
                return;
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) view, (Object) this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat)) {
                FragmentBuilder_BindTouchPointPinFragment MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
                if (MediaBrowserCompat$ItemReceiver2 != null) {
                    MediaBrowserCompat$ItemReceiver2.selectInTheWorks();
                }
            } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) view, (Object) this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat)) {
                FragmentBuilder_BindTouchPointPinFragment MediaBrowserCompat$ItemReceiver3 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
                if (MediaBrowserCompat$ItemReceiver3 != null) {
                    MediaBrowserCompat$ItemReceiver3.selectLaunchpad();
                }
            } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) view, (Object) this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper) && (MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem) != null) {
                MediaBrowserCompat$ItemReceiver.selectLive();
            }
        }
    }

    /* renamed from: o.FragmentBuilder_BindTopUpTabFragment$read */
    static final class read implements PopupWindow.OnDismissListener {
        private /* synthetic */ FragmentBuilder_BindTopUpTabFragment IconCompatParcelizer;

        read(FragmentBuilder_BindTopUpTabFragment fragmentBuilder_BindTopUpTabFragment) {
            this.IconCompatParcelizer = fragmentBuilder_BindTopUpTabFragment;
        }

        public final void onDismiss() {
            FragmentBuilder_BindTouchPointPinFragment MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
            if (MediaBrowserCompat$ItemReceiver != null) {
                MediaBrowserCompat$ItemReceiver.dismiss();
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Activity activity) {
        onGetStartedClick.write((Object) activity, "activity");
        try {
            this.PlaybackStateCompat$CustomAction = new WeakReference<>(activity);
            LayoutInflater from = LayoutInflater.from(AlertController$RecycleListView.MediaDescriptionCompat((Context) activity));
            onGetStartedClick.IconCompatParcelizer((Object) from, "ThemingUtil.getOneThemedLayoutInflater(activity)");
            RadioGroup radioGroup = null;
            View inflate = from.inflate(C6554xc460715d.th_layout_preview_panel_bottom_bar, (ViewGroup) null);
            if (inflate != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                inflate.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = inflate.getMeasuredHeight();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.height = measuredHeight;
                inflate.setLayoutParams(layoutParams);
            } else {
                inflate = null;
            }
            this.write = inflate;
            this.ParcelableVolumeInfo = from.inflate(C6554xc460715d.th_layout_preview_panel_top_bar, (ViewGroup) null);
            View view = this.write;
            TTFAppCompatRadioButton tTFAppCompatRadioButton = view != null ? (TTFAppCompatRadioButton) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_panel_bottom_radiobutton_works) : null;
            if (!(tTFAppCompatRadioButton instanceof TTFAppCompatRadioButton)) {
                tTFAppCompatRadioButton = null;
            }
            if (tTFAppCompatRadioButton != null) {
                tTFAppCompatRadioButton.setText(write(C6555xdccae8ee.th_works_label, C6555xdccae8ee.th_works_sub_text));
                tTFAppCompatRadioButton.setOnClickListener(this.MediaSessionCompat$QueueItem);
            } else {
                tTFAppCompatRadioButton = null;
            }
            this.MediaMetadataCompat = tTFAppCompatRadioButton;
            View view2 = this.write;
            TTFAppCompatRadioButton tTFAppCompatRadioButton2 = view2 != null ? (TTFAppCompatRadioButton) view2.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_panel_bottom_radiobutton_launchpad) : null;
            if (!(tTFAppCompatRadioButton2 instanceof TTFAppCompatRadioButton)) {
                tTFAppCompatRadioButton2 = null;
            }
            if (tTFAppCompatRadioButton2 != null) {
                tTFAppCompatRadioButton2.setText(write(C6555xdccae8ee.th_launchpad_label, C6555xdccae8ee.th_works_sub_text));
                tTFAppCompatRadioButton2.setOnClickListener(this.MediaSessionCompat$QueueItem);
            } else {
                tTFAppCompatRadioButton2 = null;
            }
            this.MediaDescriptionCompat = tTFAppCompatRadioButton2;
            View view3 = this.write;
            TTFAppCompatRadioButton tTFAppCompatRadioButton3 = view3 != null ? (TTFAppCompatRadioButton) view3.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_panel_bottom_radiobutton_live) : null;
            if (!(tTFAppCompatRadioButton3 instanceof TTFAppCompatRadioButton)) {
                tTFAppCompatRadioButton3 = null;
            }
            if (tTFAppCompatRadioButton3 != null) {
                tTFAppCompatRadioButton3.setText(write(C6555xdccae8ee.th_live_label, C6555xdccae8ee.th_works_sub_text));
                tTFAppCompatRadioButton3.setOnClickListener(this.MediaSessionCompat$QueueItem);
            } else {
                tTFAppCompatRadioButton3 = null;
            }
            this.MediaSessionCompat$ResultReceiverWrapper = tTFAppCompatRadioButton3;
            View view4 = this.write;
            AppCompatRadioButton appCompatRadioButton = view4 != null ? (AppCompatRadioButton) view4.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_panel_bottom_radiobutton_exit) : null;
            if (!(appCompatRadioButton instanceof AppCompatRadioButton)) {
                appCompatRadioButton = null;
            }
            if (appCompatRadioButton != null) {
                appCompatRadioButton.setAllCaps(true);
            }
            View view5 = this.write;
            RadioGroup radioGroup2 = view5 != null ? (RadioGroup) view5.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_panel_bottom_radiogroup_modes) : null;
            if (!(radioGroup2 instanceof RadioGroup)) {
                radioGroup2 = null;
            }
            if (radioGroup2 != null) {
                radioGroup2.setOnCheckedChangeListener(this.MediaBrowserCompat$SearchResultReceiver);
                radioGroup = radioGroup2;
            }
            this.f3153x50fd9e4a = radioGroup;
            PopupWindow popupWindow = new PopupWindow(this.write, -1, -2);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            if (Build.VERSION.SDK_INT <= 26) {
                popupWindow.setBackgroundDrawable(new BitmapDrawable());
            }
            popupWindow.setAnimationStyle(C1189xa6547b7b.thLegacyPreviewPanelAnimationBottom);
            popupWindow.setOnDismissListener(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.IconCompatParcelizer = popupWindow;
            PopupWindow popupWindow2 = new PopupWindow(this.ParcelableVolumeInfo, -1, -2);
            popupWindow2.setOutsideTouchable(false);
            popupWindow2.setFocusable(false);
            popupWindow2.setAnimationStyle(C1189xa6547b7b.thLegacyPreviewPanelAnimationTop);
            this.Keep = popupWindow2;
            FragmentBuilder_BindHmlNTBApplyLoanEntryFragment tabContainer = FragmentBuilder_BindHmlIssuerLandingFragment.setTabContainer();
            if (tabContainer != null) {
                FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Integer> fragmentBuilder_BindHowToAddFavouriteTopUpFragment = this.RatingCompat;
                tabContainer.MediaMetadataCompat.add(fragmentBuilder_BindHowToAddFavouriteTopUpFragment);
                FragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment = tabContainer.MediaBrowserCompat$MediaItem;
                if (fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment != null) {
                    fragmentBuilder_BindHowToAddFavouriteTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver(Integer.valueOf(fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment.read));
                    fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment.IconCompatParcelizer.add(fragmentBuilder_BindHowToAddFavouriteTopUpFragment);
                }
            }
            MediaBrowserCompat$ItemReceiver();
            ViewGroup read2 = BondSelectionActivity.read(activity);
            PopupWindow popupWindow3 = this.IconCompatParcelizer;
            if (popupWindow3 != null) {
                View view6 = read2;
                int i = this.read;
                View view7 = this.write;
                popupWindow3.showAtLocation(view6, 0, 0, i - (view7 != null ? view7.getMeasuredHeight() : 0));
            }
            PopupWindow popupWindow4 = this.Keep;
            if (popupWindow4 != null) {
                popupWindow4.showAtLocation(BondSelectionActivity.read(activity), 0, 0, this.MediaSessionCompat$Token);
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.PANEL_INIT_ERROR);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        try {
            FragmentBuilder_BindTouchPointPinFragment fragmentBuilder_BindTouchPointPinFragment = this.MediaBrowserCompat$MediaItem;
            if (fragmentBuilder_BindTouchPointPinFragment != null) {
                fragmentBuilder_BindTouchPointPinFragment.detach();
            }
            onAccountSummaryClick onaccountsummaryclick = this.MediaBrowserCompat$ItemReceiver;
            if (onaccountsummaryclick != null) {
                PlaybackStateCompat.CustomAction customAction = onaccountsummaryclick.read;
                if (customAction != null) {
                    customAction.dismiss();
                    onaccountsummaryclick.read = null;
                }
                onaccountsummaryclick.MediaBrowserCompat$MediaItem = null;
            }
            write();
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.DESTROY_ERROR);
        } catch (Throwable th) {
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaBrowserCompat$ItemReceiver = null;
            throw th;
        }
        this.MediaBrowserCompat$MediaItem = null;
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    public final void write(String str) {
        View findViewById;
        try {
            WeakReference<Activity> weakReference = this.PlaybackStateCompat$CustomAction;
            if (weakReference != null) {
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = null;
                Activity activity = weakReference != null ? weakReference.get() : null;
                if (activity != null) {
                    View.OnClickListener fragmentBuilder_BindTopUpTabFragment$MediaBrowserCompat$MediaItem = str != null ? new C6848x5f44fdd7(activity, str) : null;
                    View view = this.ParcelableVolumeInfo;
                    if (!(view == null || (findViewById = view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_panel_tid_text)) == null)) {
                        findViewById.setOnClickListener(fragmentBuilder_BindTopUpTabFragment$MediaBrowserCompat$MediaItem);
                        hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    }
                } else {
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
                }
                if (hmlVerifyPhoneValidateOtpActivity != null) {
                    return;
                }
            }
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.NULL_CONTEXT);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.SET_MONITOR_URL_ERROR);
        }
    }

    public final void IconCompatParcelizer(String str) {
        try {
            int i = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_panel_tid_text;
            StringBuilder sb = new StringBuilder();
            sb.append("TID:  ");
            sb.append(str);
            MediaBrowserCompat$CustomActionResultReceiver(i, sb.toString());
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.SET_TID_ERROR);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindTransferHistoryFragment fragmentBuilder_BindTransferHistoryFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindTransferHistoryFragment, "previewPanelVisibleInformation");
        try {
            TTFAppCompatRadioButton tTFAppCompatRadioButton = this.MediaMetadataCompat;
            if (tTFAppCompatRadioButton != null) {
                tTFAppCompatRadioButton.setEnabled(fragmentBuilder_BindTransferHistoryFragment.IconCompatParcelizer);
            }
            if (!fragmentBuilder_BindTransferHistoryFragment.MediaBrowserCompat$ItemReceiver) {
                TTFAppCompatRadioButton tTFAppCompatRadioButton2 = this.MediaDescriptionCompat;
                if (tTFAppCompatRadioButton2 != null) {
                    tTFAppCompatRadioButton2.setEnabled(false);
                }
                Spanned write2 = write(C6555xdccae8ee.th_launchpad_label, C6555xdccae8ee.th_empty_launchpad_description);
                TTFAppCompatRadioButton tTFAppCompatRadioButton3 = this.MediaDescriptionCompat;
                if (tTFAppCompatRadioButton3 != null) {
                    tTFAppCompatRadioButton3.setText(write2);
                }
            }
            if (!fragmentBuilder_BindTransferHistoryFragment.write) {
                TTFAppCompatRadioButton tTFAppCompatRadioButton4 = this.MediaSessionCompat$ResultReceiverWrapper;
                if (tTFAppCompatRadioButton4 != null) {
                    tTFAppCompatRadioButton4.setEnabled(false);
                }
                Spanned write3 = write(C6555xdccae8ee.th_empty_live_description, -1);
                TTFAppCompatRadioButton tTFAppCompatRadioButton5 = this.MediaSessionCompat$ResultReceiverWrapper;
                if (tTFAppCompatRadioButton5 != null) {
                    tTFAppCompatRadioButton5.setText(write3);
                }
            }
        } catch (Exception unused) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.SET_VISIBLE_INFO_ERROR);
        }
    }

    public final void read(FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment) {
        TTFAppCompatRadioButton tTFAppCompatRadioButton;
        View findViewById;
        View findViewById2;
        onGetStartedClick.write((Object) fragmentBuilder_BindVerifyIdentityFragment, "sdkMode");
        try {
            int i = FragmentBuilder_BindTopUpTargetTabFragment.MediaBrowserCompat$ItemReceiver[fragmentBuilder_BindVerifyIdentityFragment.ordinal()];
            int i2 = 8;
            if (i == 1) {
                i2 = 0;
                tTFAppCompatRadioButton = this.MediaMetadataCompat;
            } else if (i == 2) {
                tTFAppCompatRadioButton = this.MediaDescriptionCompat;
            } else if (i == 3) {
                tTFAppCompatRadioButton = this.MediaSessionCompat$ResultReceiverWrapper;
            } else {
                return;
            }
            RadioGroup radioGroup = this.f3153x50fd9e4a;
            if (radioGroup != null) {
                radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
            }
            if (tTFAppCompatRadioButton != null) {
                tTFAppCompatRadioButton.setChecked(true);
            }
            RadioGroup radioGroup2 = this.f3153x50fd9e4a;
            if (radioGroup2 != null) {
                radioGroup2.setOnCheckedChangeListener(this.MediaBrowserCompat$SearchResultReceiver);
            }
            View view = this.ParcelableVolumeInfo;
            if (!(view == null || (findViewById2 = view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_top_panel_separator)) == null)) {
                findViewById2.setVisibility(i2);
            }
            View view2 = this.ParcelableVolumeInfo;
            if (view2 != null && (findViewById = view2.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.preview_top_panel_content)) != null) {
                findViewById.setVisibility(i2);
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.SET_MODE_ERROR);
        }
    }

    public final void read(String str, String str2) {
        onGetStartedClick.write((Object) str, "launchpadName");
        onGetStartedClick.write((Object) str2, "launchpadDate");
        try {
            WeakReference<Activity> weakReference = this.PlaybackStateCompat$CustomAction;
            if (weakReference != null) {
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = null;
                Activity activity = weakReference != null ? weakReference.get() : null;
                if (activity != null) {
                    Activity activity2 = activity;
                    TTFAppCompatRadioButton tTFAppCompatRadioButton = this.MediaDescriptionCompat;
                    if (tTFAppCompatRadioButton != null) {
                        tTFAppCompatRadioButton.addOnLayoutChangeListener(tTFAppCompatRadioButton);
                        StringBuilder sb = new StringBuilder();
                        sb.append(activity2.getString(C6555xdccae8ee.th_launchpad_label));
                        sb.append("  ");
                        sb.append(str);
                        String obj = sb.toString();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(activity2.getString(C6555xdccae8ee.th_snapshot_taken));
                        sb2.append(' ');
                        sb2.append(str2);
                        tTFAppCompatRadioButton.setText(IconCompatParcelizer(obj, sb2.toString()));
                        tTFAppCompatRadioButton.setEnabled(true);
                    }
                    hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                } else {
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
                }
                if (hmlVerifyPhoneValidateOtpActivity != null) {
                    return;
                }
            }
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.NULL_CONTEXT);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.SET_LAUNCHPAD_ERROR);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "liveName");
        onGetStartedClick.write((Object) str2, "liveDate");
        try {
            WeakReference<Activity> weakReference = this.PlaybackStateCompat$CustomAction;
            if (weakReference != null) {
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = null;
                Activity activity = weakReference != null ? weakReference.get() : null;
                if (activity != null) {
                    Activity activity2 = activity;
                    TTFAppCompatRadioButton tTFAppCompatRadioButton = this.MediaSessionCompat$ResultReceiverWrapper;
                    if (tTFAppCompatRadioButton != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(activity2.getString(C6555xdccae8ee.th_live_label));
                        sb.append(' ');
                        sb.append(str);
                        String obj = sb.toString();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(activity2.getString(C6555xdccae8ee.th_published));
                        sb2.append(' ');
                        sb2.append(str2);
                        tTFAppCompatRadioButton.setText(IconCompatParcelizer(obj, sb2.toString()));
                        tTFAppCompatRadioButton.setEnabled(true);
                        hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    }
                } else {
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
                }
                if (hmlVerifyPhoneValidateOtpActivity != null) {
                    return;
                }
            }
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.NULL_CONTEXT);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.SET_LIVE_ERROR);
        }
    }

    public final void write() {
        try {
            PopupWindow popupWindow = this.IconCompatParcelizer;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            PopupWindow popupWindow2 = this.Keep;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            FragmentBuilder_BindHmlNTBApplyLoanEntryFragment tabContainer = FragmentBuilder_BindHmlIssuerLandingFragment.setTabContainer();
            if (tabContainer != null) {
                FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Integer> fragmentBuilder_BindHowToAddFavouriteTopUpFragment = this.RatingCompat;
                tabContainer.MediaMetadataCompat.remove(fragmentBuilder_BindHowToAddFavouriteTopUpFragment);
                FragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment = tabContainer.MediaBrowserCompat$MediaItem;
                if (fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment != null) {
                    fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment.IconCompatParcelizer.remove(fragmentBuilder_BindHowToAddFavouriteTopUpFragment);
                }
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.HIDE_ERROR);
        } catch (Throwable th) {
            this.write = null;
            this.ParcelableVolumeInfo = null;
            this.MediaMetadataCompat = null;
            this.MediaDescriptionCompat = null;
            this.MediaSessionCompat$ResultReceiverWrapper = null;
            this.IconCompatParcelizer = null;
            this.Keep = null;
            this.f3153x50fd9e4a = null;
            this.PlaybackStateCompat$CustomAction = null;
            throw th;
        }
        this.write = null;
        this.ParcelableVolumeInfo = null;
        this.MediaMetadataCompat = null;
        this.MediaDescriptionCompat = null;
        this.MediaSessionCompat$ResultReceiverWrapper = null;
        this.IconCompatParcelizer = null;
        this.Keep = null;
        this.f3153x50fd9e4a = null;
        this.PlaybackStateCompat$CustomAction = null;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z, Activity activity) {
        if (!z) {
            onAccountSummaryClick onaccountsummaryclick = this.MediaBrowserCompat$ItemReceiver;
            if (onaccountsummaryclick != null) {
                PlaybackStateCompat.CustomAction customAction = onaccountsummaryclick.read;
                if (customAction != null) {
                    customAction.dismiss();
                    onaccountsummaryclick.read = null;
                }
                onaccountsummaryclick.MediaBrowserCompat$MediaItem = null;
            }
            this.MediaBrowserCompat$ItemReceiver = null;
        } else if (activity != null) {
            try {
                onAccountSummaryClick onaccountsummaryclick2 = this.MediaBrowserCompat$ItemReceiver;
                if (onaccountsummaryclick2 != null) {
                    PlaybackStateCompat.CustomAction customAction2 = onaccountsummaryclick2.read;
                    if (!(customAction2 != null && customAction2.isShowing())) {
                        onaccountsummaryclick2.MediaBrowserCompat$CustomActionResultReceiver(activity);
                    }
                    if (onaccountsummaryclick2 != null) {
                        this.MediaBrowserCompat$ItemReceiver = onaccountsummaryclick2;
                    }
                }
                onaccountsummaryclick2 = new onAccountSummaryClick();
                onaccountsummaryclick2.write = true;
                onaccountsummaryclick2.MediaBrowserCompat$CustomActionResultReceiver(activity);
                this.MediaBrowserCompat$ItemReceiver = onaccountsummaryclick2;
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.SHOW_LOADING_ERROR);
            }
        }
    }

    public final void read(int i) {
        this.MediaSessionCompat$Token = i;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.read = i;
    }

    private final Spanned write(int i, int i2) {
        String str;
        WeakReference<Activity> weakReference = this.PlaybackStateCompat$CustomAction;
        if (weakReference == null) {
            return null;
        }
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity != null) {
            Activity activity2 = activity;
            String str2 = "";
            if (i == -1) {
                str = str2;
            } else {
                str = activity2.getString(i);
                onGetStartedClick.IconCompatParcelizer((Object) str, "context.getString(labelId)");
            }
            if (i2 != -1) {
                str2 = activity2.getString(i2);
                onGetStartedClick.IconCompatParcelizer((Object) str2, "context.getString(captionId)");
            }
            return IconCompatParcelizer(str, str2);
        }
        MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
        return null;
    }

    private final Spanned IconCompatParcelizer(String str, String str2) {
        WeakReference<Activity> weakReference = this.PlaybackStateCompat$CustomAction;
        SpannableStringBuilder spannableStringBuilder = null;
        if (weakReference != null) {
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity != null) {
                Activity activity2 = activity;
                int length = str.length();
                int length2 = str.length();
                CharSequence charSequence = str2;
                boolean z = true;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('|');
                    sb.append(str);
                    sb.append("\n               |");
                    sb.append(str2);
                    sb.append("\n            ");
                    str = GoodToKnowActivity.IconCompatParcelizer(sb.toString());
                    length = GoodToKnowActivity.read((CharSequence) str, 10, 0, false, 6);
                    length2 = str.length();
                }
                Context context = activity2;
                TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, C1189xa6547b7b.ThunderheadPreview_ListItem_TextSpannable_Label);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                spannableStringBuilder2.setSpan(textAppearanceSpan, 0, length, 0);
                spannableStringBuilder2.setSpan(new C6846x3f1de153(activity2.getResources().getDimensionPixelSize(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_preview_bottom_list_item_line_height_extra)), 0, length, 0);
                if (!(charSequence == null || charSequence.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    spannableStringBuilder2.setSpan(new TextAppearanceSpan(context, C1189xa6547b7b.ThunderheadPreview_ListItem_TextSpannable_Caption), length, length2, 0);
                }
                spannableStringBuilder = spannableStringBuilder2;
            } else {
                MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
            }
        }
        return spannableStringBuilder;
    }

    /* access modifiers changed from: private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, String str) {
        View view = this.ParcelableVolumeInfo;
        KeyEvent.Callback callback = null;
        KeyEvent.Callback findViewById = view != null ? view.findViewById(i) : null;
        if (findViewById instanceof AppCompatTextView) {
            callback = findViewById;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) callback;
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
    }

    private final void MediaBrowserCompat$ItemReceiver() {
        WeakReference<Activity> weakReference = this.PlaybackStateCompat$CustomAction;
        if (weakReference != null) {
            Activity activity = null;
            if (weakReference != null) {
                activity = weakReference.get();
            }
            if (activity != null) {
                Activity activity2 = activity;
                if (FragmentBuilder_BindHmlIssuerLandingFragment.IconCompatParcelizer() != null) {
                    FragmentBuilder_BindHmlAboutFragment read2 = FragmentBuilder_BindHmlIssuerLandingFragment.read();
                    onGetStartedClick.IconCompatParcelizer((Object) read2, "OneInternalProvider.getAdminModeWebCache()");
                    Set<String> write2 = AlertController$RecycleListView.write(activity2, FragmentBuilder_BindHmlIssuerLandingFragment.setBackgroundResource());
                    onGetStartedClick.IconCompatParcelizer((Object) write2, "interactions");
                    Collection arrayList = new ArrayList();
                    for (String MediaBrowserCompat$ItemReceiver2 : write2) {
                        InteractionRegionResponse MediaBrowserCompat$ItemReceiver3 = read2.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
                        if (MediaBrowserCompat$ItemReceiver3 != null) {
                            arrayList.add(MediaBrowserCompat$ItemReceiver3);
                        }
                    }
                    for (InteractionRegionResponse interactionRegionResponse : (List) arrayList) {
                        InteractionData data = interactionRegionResponse.getData();
                        onGetStartedClick.IconCompatParcelizer((Object) data, "it.data");
                        MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.track_count, String.valueOf(data.getTrackingPoints().length));
                        InteractionData data2 = interactionRegionResponse.getData();
                        onGetStartedClick.IconCompatParcelizer((Object) data2, "it.data");
                        MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.capture_count, String.valueOf(data2.getCapturePoints().length));
                        InteractionData data3 = interactionRegionResponse.getData();
                        onGetStartedClick.IconCompatParcelizer((Object) data3, "it.data");
                        MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.optimise_count, String.valueOf(data3.getOptimizationPoints().length));
                    }
                    return;
                }
                return;
            }
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
        }
    }
}
