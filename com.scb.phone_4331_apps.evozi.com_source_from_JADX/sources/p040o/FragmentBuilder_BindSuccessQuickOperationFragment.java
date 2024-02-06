package p040o;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.pingan.p031ai.face.common.PaFaceConstants;
import com.scb.phone.view.activity.deeplink.PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelServicesTabFragment;
import com.thunderhead.android.infrastructure.p057ui.views.TTFAppCompatTextView;
import java.lang.ref.WeakReference;
import p040o.CcSofHybridActivity_ViewBinding;
import p040o.DynamiteModule;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.GoogleApiManager;
import p040o.ImmutableSortedMap;
import p040o.PlaybackStateCompat;

/* renamed from: o.FragmentBuilder_BindSuccessQuickOperationFragment */
public final class FragmentBuilder_BindSuccessQuickOperationFragment implements FragmentBuilder_BindTempLimitReviewFragment {
    private TTFAppCompatTextView IconCompatParcelizer;
    private WindowManager.LayoutParams MediaBrowserCompat$CustomActionResultReceiver;
    private FragmentBuilder_BindVerifyIdentityFragment MediaBrowserCompat$ItemReceiver;
    private onAccountSummaryClick MediaBrowserCompat$MediaItem;
    private MutableContextWrapper MediaBrowserCompat$SearchResultReceiver;
    private Point MediaMetadataCompat;
    /* access modifiers changed from: private */
    public WeakReference<Activity> RatingCompat;
    private FrameLayout read;
    /* access modifiers changed from: private */
    public FragmentBuilder_BindTempLimitHomeFragment write;

    public FragmentBuilder_BindSuccessQuickOperationFragment(FragmentBuilder_BindTempLimitHomeFragment fragmentBuilder_BindTempLimitHomeFragment) {
        this.write = fragmentBuilder_BindTempLimitHomeFragment;
        try {
            fragmentBuilder_BindTempLimitHomeFragment.attach(this);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.INIT_ERROR);
        }
    }

    public final void IconCompatParcelizer() {
        try {
            WeakReference<Activity> weakReference = this.RatingCompat;
            if (weakReference != null) {
                Activity activity = weakReference != null ? weakReference.get() : null;
                if (activity != null) {
                    Activity activity2 = activity;
                    FrameLayout frameLayout = this.read;
                    if (frameLayout == null) {
                        Point point = new Point();
                        WindowManager windowManager = activity2.getWindowManager();
                        onGetStartedClick.IconCompatParcelizer((Object) windowManager, "activity.windowManager");
                        windowManager.getDefaultDisplay().getSize(point);
                        this.MediaMetadataCompat = point;
                        MutableContextWrapper mutableContextWrapper = this.MediaBrowserCompat$SearchResultReceiver;
                        if (mutableContextWrapper == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        TTFAppCompatTextView tTFAppCompatTextView = new TTFAppCompatTextView(mutableContextWrapper);
                        Resources resources = mutableContextWrapper.getResources();
                        tTFAppCompatTextView.setId(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.thunderhead_one_poker_chip);
                        tTFAppCompatTextView.setTag(FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF);
                        tTFAppCompatTextView.setText(resources.getText(C6555xdccae8ee.th_icon_brand));
                        tTFAppCompatTextView.setTextSize(resources.getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_text_default));
                        tTFAppCompatTextView.setGravity(resources.getBoolean(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.read.th_pokerchip_center) ? 17 : 16);
                        float dimension = resources.getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_padding_left);
                        if (!Float.isNaN(dimension)) {
                            int round = Math.round(dimension);
                            float dimension2 = resources.getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_padding_right);
                            if (!Float.isNaN(dimension2)) {
                                int round2 = Math.round(dimension2);
                                float dimension3 = resources.getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_padding_top);
                                if (!Float.isNaN(dimension3)) {
                                    int round3 = Math.round(dimension3);
                                    float dimension4 = resources.getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_padding_bottom);
                                    if (!Float.isNaN(dimension4)) {
                                        tTFAppCompatTextView.setPadding(round, round3, round2, Math.round(dimension4));
                                        Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(resources.getDrawable(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_pokerchip_background));
                                        MediaBrowserCompat$MediaItem2.setColorFilter(resources.getColor(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_off_background), PorterDuff.Mode.SRC_IN);
                                        tTFAppCompatTextView.setBackground(MediaBrowserCompat$MediaItem2);
                                        tTFAppCompatTextView.setTextColor(resources.getColor(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_off_foreground));
                                        tTFAppCompatTextView.setOnClickListener((View.OnClickListener) null);
                                        tTFAppCompatTextView.setOnTouchListener(new read(this, activity2));
                                        this.IconCompatParcelizer = tTFAppCompatTextView;
                                        View view = tTFAppCompatTextView;
                                        MutableContextWrapper mutableContextWrapper2 = this.MediaBrowserCompat$SearchResultReceiver;
                                        if (mutableContextWrapper2 == null) {
                                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                                        }
                                        FrameLayout frameLayout2 = new FrameLayout(mutableContextWrapper2);
                                        frameLayout2.setClickable(false);
                                        frameLayout2.setFocusable(false);
                                        Resources resources2 = mutableContextWrapper2.getResources();
                                        frameLayout2.addView(view, new FrameLayout.LayoutParams(resources2.getDimensionPixelSize(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_width), resources2.getDimensionPixelSize(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_height), 17));
                                        frameLayout2.setOnTouchListener(new write(this));
                                        frameLayout2.setOnGenericMotionListener(new C6819x4a35f0d8(this));
                                        this.read = frameLayout2;
                                        TTFAppCompatTextView tTFAppCompatTextView2 = this.IconCompatParcelizer;
                                        if (tTFAppCompatTextView2 == null) {
                                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                                        }
                                        View view2 = tTFAppCompatTextView2;
                                        FrameLayout frameLayout3 = this.read;
                                        if (frameLayout3 == null) {
                                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                                        }
                                        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer(view2, frameLayout3, activity2);
                                        FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = this.MediaBrowserCompat$ItemReceiver;
                                        if (fragmentBuilder_BindVerifyIdentityFragment != null) {
                                            MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindVerifyIdentityFragment);
                                            return;
                                        }
                                        return;
                                    }
                                    throw new IllegalArgumentException("Cannot round NaN value.");
                                }
                                throw new IllegalArgumentException("Cannot round NaN value.");
                            }
                            throw new IllegalArgumentException("Cannot round NaN value.");
                        }
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    } else if (!SwitchCompat.setExpandedFormat(frameLayout)) {
                        TTFAppCompatTextView tTFAppCompatTextView3 = this.IconCompatParcelizer;
                        if (tTFAppCompatTextView3 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer(tTFAppCompatTextView3, frameLayout, activity2);
                    }
                } else {
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
                }
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.ATTACH_TO_WINDOW_ERROR);
        }
    }

    public final void write() {
        WindowManager MediaBrowserCompat$SearchResultReceiver2;
        try {
            FrameLayout frameLayout = this.read;
            if (!(frameLayout == null || !SwitchCompat.setExpandedFormat(frameLayout) || (MediaBrowserCompat$SearchResultReceiver2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaBrowserCompat$SearchResultReceiver()) == null)) {
                MediaBrowserCompat$SearchResultReceiver2.removeView(frameLayout);
            }
            onAccountSummaryClick onaccountsummaryclick = this.MediaBrowserCompat$MediaItem;
            if (onaccountsummaryclick != null) {
                PlaybackStateCompat.CustomAction customAction = onaccountsummaryclick.read;
                if (customAction != null) {
                    customAction.dismiss();
                    onaccountsummaryclick.read = null;
                }
                onaccountsummaryclick.MediaBrowserCompat$MediaItem = null;
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.DETACH_FROM_WINDOW_ERROR_REMOVE);
            try {
                WindowManager MediaBrowserCompat$SearchResultReceiver3 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaBrowserCompat$SearchResultReceiver();
                if (MediaBrowserCompat$SearchResultReceiver3 != null) {
                    MediaBrowserCompat$SearchResultReceiver3.removeViewImmediate(this.read);
                }
            } catch (Exception e2) {
                MyECouponActivity_ViewBinding.read(e2, FragmentBuilder_BindSuccessFragment.DETACH_FROM_WINDOW_ERROR_REMOVE_IMMEDIATELY);
            }
        } catch (Throwable th) {
            this.read = null;
            this.IconCompatParcelizer = null;
            this.RatingCompat = null;
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.MediaBrowserCompat$MediaItem = null;
            throw th;
        }
        this.read = null;
        this.IconCompatParcelizer = null;
        this.RatingCompat = null;
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.MediaBrowserCompat$MediaItem = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[Catch:{ Exception -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051 A[Catch:{ Exception -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060 A[Catch:{ Exception -> 0x0067 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(android.app.Activity r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r4.RatingCompat     // Catch:{ Exception -> 0x0067 }
            r1 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0067 }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x0067 }
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            boolean r0 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r5, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0067 }
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x006f
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x0067 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0067 }
            r4.RatingCompat = r0     // Catch:{ Exception -> 0x0067 }
            android.content.MutableContextWrapper r0 = r4.MediaBrowserCompat$SearchResultReceiver     // Catch:{ Exception -> 0x0067 }
            if (r0 == 0) goto L_0x0029
            r3 = r5
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ Exception -> 0x0067 }
            r0.setBaseContext(r3)     // Catch:{ Exception -> 0x0067 }
            if (r0 == 0) goto L_0x0029
            goto L_0x0039
        L_0x0029:
            if (r5 != 0) goto L_0x002e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0067 }
        L_0x002e:
            android.content.MutableContextWrapper r0 = new android.content.MutableContextWrapper     // Catch:{ Exception -> 0x0067 }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ Exception -> 0x0067 }
            android.content.Context r5 = p040o.AlertController$RecycleListView.MediaDescriptionCompat((android.content.Context) r5)     // Catch:{ Exception -> 0x0067 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0067 }
        L_0x0039:
            r4.MediaBrowserCompat$SearchResultReceiver = r0     // Catch:{ Exception -> 0x0067 }
            o.onAccountSummaryClick r5 = r4.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0067 }
            r0 = 0
            if (r5 == 0) goto L_0x004d
            o.PlaybackStateCompat$CustomAction r5 = r5.read     // Catch:{ Exception -> 0x0067 }
            if (r5 == 0) goto L_0x004b
            boolean r5 = r5.isShowing()     // Catch:{ Exception -> 0x0067 }
            if (r5 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r2 = r0
        L_0x004c:
            r0 = r2
        L_0x004d:
            o.onAccountSummaryClick r5 = r4.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0067 }
            if (r5 == 0) goto L_0x005c
            o.PlaybackStateCompat$CustomAction r2 = r5.read     // Catch:{ Exception -> 0x0067 }
            if (r2 == 0) goto L_0x005a
            r2.dismiss()     // Catch:{ Exception -> 0x0067 }
            r5.read = r1     // Catch:{ Exception -> 0x0067 }
        L_0x005a:
            r5.MediaBrowserCompat$MediaItem = r1     // Catch:{ Exception -> 0x0067 }
        L_0x005c:
            r4.MediaBrowserCompat$MediaItem = r1     // Catch:{ Exception -> 0x0067 }
            if (r0 == 0) goto L_0x0063
            r4.MediaBrowserCompat$ItemReceiver((boolean) r0)     // Catch:{ Exception -> 0x0067 }
        L_0x0063:
            r4.IconCompatParcelizer()     // Catch:{ Exception -> 0x0067 }
            return
        L_0x0067:
            r5 = move-exception
            o.FragmentBuilder_BindSuccessFragment r0 = p040o.FragmentBuilder_BindSuccessFragment.SET_ACTIVITY_ERROR
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r0 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r0
            p040o.MyECouponActivity_ViewBinding.read(r5, r0)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindSuccessQuickOperationFragment.MediaBrowserCompat$CustomActionResultReceiver(android.app.Activity):void");
    }

    public final void read() {
        try {
            FragmentBuilder_BindTempLimitHomeFragment fragmentBuilder_BindTempLimitHomeFragment = this.write;
            if (fragmentBuilder_BindTempLimitHomeFragment != null) {
                fragmentBuilder_BindTempLimitHomeFragment.detach();
            }
            onAccountSummaryClick onaccountsummaryclick = this.MediaBrowserCompat$MediaItem;
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
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.DESTROY_ERROR);
        } catch (Throwable th) {
            this.MediaBrowserCompat$MediaItem = null;
            this.IconCompatParcelizer = null;
            this.read = null;
            this.write = null;
            this.RatingCompat = null;
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.MediaMetadataCompat = null;
            throw th;
        }
        this.MediaBrowserCompat$MediaItem = null;
        this.IconCompatParcelizer = null;
        this.read = null;
        this.write = null;
        this.RatingCompat = null;
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.MediaMetadataCompat = null;
    }

    public final void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindVerifyIdentityFragment, "to");
        try {
            WeakReference<Activity> weakReference = this.RatingCompat;
            if (weakReference != null) {
                Activity activity = null;
                if (weakReference != null) {
                    activity = weakReference.get();
                }
                if (activity != null) {
                    FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment2 = this.MediaBrowserCompat$ItemReceiver;
                    this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindVerifyIdentityFragment;
                    MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindVerifyIdentityFragment);
                    if (fragmentBuilder_BindVerifyIdentityFragment2 != null) {
                        if (FragmentBuilder_BindUnbilledTabFragment.write().contains(fragmentBuilder_BindVerifyIdentityFragment2)) {
                            if (FragmentBuilder_BindUnbilledTabFragment.read().contains(fragmentBuilder_BindVerifyIdentityFragment)) {
                                MediaBrowserCompat$ItemReceiver();
                                return;
                            }
                        }
                        if (FragmentBuilder_BindUnbilledTabFragment.read().contains(fragmentBuilder_BindVerifyIdentityFragment2)) {
                            if (FragmentBuilder_BindUnbilledTabFragment.write().contains(fragmentBuilder_BindVerifyIdentityFragment)) {
                                MediaBrowserCompat$ItemReceiver();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.TRANSITION_ERROR);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            try {
                WeakReference<Activity> weakReference = this.RatingCompat;
                if (weakReference != null) {
                    Activity activity = null;
                    if (weakReference != null) {
                        activity = weakReference.get();
                    }
                    if (activity != null) {
                        Activity activity2 = activity;
                        if (this.MediaBrowserCompat$MediaItem == null) {
                            onAccountSummaryClick onaccountsummaryclick = new onAccountSummaryClick();
                            onaccountsummaryclick.write = true;
                            this.MediaBrowserCompat$MediaItem = onaccountsummaryclick;
                        }
                        onAccountSummaryClick onaccountsummaryclick2 = this.MediaBrowserCompat$MediaItem;
                        if (onaccountsummaryclick2 != null) {
                            onaccountsummaryclick2.MediaBrowserCompat$CustomActionResultReceiver(activity2);
                            return;
                        }
                        return;
                    }
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
                }
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.LOADING_ERROR);
            }
        } else {
            onAccountSummaryClick onaccountsummaryclick3 = this.MediaBrowserCompat$MediaItem;
            if (onaccountsummaryclick3 != null) {
                onaccountsummaryclick3.read();
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        try {
            WeakReference<Activity> weakReference = this.RatingCompat;
            if (weakReference != null) {
                Activity activity = null;
                if (weakReference != null) {
                    activity = weakReference.get();
                }
                if (activity != null) {
                    int i = z ? 0 : 4;
                    FrameLayout frameLayout = this.read;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(i);
                        return;
                    }
                    return;
                }
                MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.VISIBLE_ERROR);
        }
    }

    /* renamed from: o.FragmentBuilder_BindSuccessQuickOperationFragment$write */
    static final class write implements View.OnTouchListener {
        private /* synthetic */ FragmentBuilder_BindSuccessQuickOperationFragment MediaBrowserCompat$CustomActionResultReceiver;

        write(FragmentBuilder_BindSuccessQuickOperationFragment fragmentBuilder_BindSuccessQuickOperationFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSuccessQuickOperationFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
            WeakReference write = this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
            if (write != null) {
                Object obj = null;
                if (write != null) {
                    obj = write.get();
                }
                if (obj != null) {
                    ((Activity) obj).getWindow().superDispatchTouchEvent(motionEvent);
                } else {
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
                }
            }
            return false;
        }
    }

    private final WindowManager.LayoutParams IconCompatParcelizer(View view, View view2, Activity activity) {
        FragmentBuilder_BindTempLimitHomeFragment fragmentBuilder_BindTempLimitHomeFragment;
        int i = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth = view.getMeasuredWidth();
        int i2 = (int) ((((float) measuredWidth) * 1.5f) + 0.5f);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i2, (int) ((((float) measuredHeight) * 1.5f) + 0.5f), Build.VERSION.SDK_INT >= 26 ? 2038 : PaFaceConstants.EnvironmentalTips.NO_FACE, 552, -3);
        layoutParams.gravity = 51;
        Point point = this.MediaMetadataCompat;
        if (point != null) {
            i = point.x;
        }
        layoutParams.x = i - ((i2 - (((i2 - measuredWidth) + 1) >> 1)) + 3);
        layoutParams.y = measuredHeight;
        WindowManager MediaBrowserCompat$SearchResultReceiver2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaBrowserCompat$SearchResultReceiver();
        try {
            if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT == 26 || Settings.canDrawOverlays(activity)) {
                if (MediaBrowserCompat$SearchResultReceiver2 != null) {
                    MediaBrowserCompat$SearchResultReceiver2.addView(view2, layoutParams);
                }
                return layoutParams;
            }
            FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> read2 = FragmentBuilder_BindTempLimitConfirmationFragment.read();
            FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> customView = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView();
            onGetStartedClick.IconCompatParcelizer((Object) customView, "OneInternalProvider.getStateStore()");
            Boolean invoke = read2.invoke(customView.MediaBrowserCompat$ItemReceiver());
            if ((invoke == null || (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) invoke, (Object) Boolean.TRUE))) && (fragmentBuilder_BindTempLimitHomeFragment = this.write) != null) {
                fragmentBuilder_BindTempLimitHomeFragment.requestRequiredPermissions();
            }
            return layoutParams;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.ATTACH_TO_WINDOW_ERROR);
            if (MediaBrowserCompat$SearchResultReceiver2 != null) {
                try {
                    MediaBrowserCompat$SearchResultReceiver2.removeViewImmediate(view2);
                } catch (Exception e2) {
                    MyECouponActivity_ViewBinding.read(e2, FragmentBuilder_BindSuccessFragment.DETACH_FROM_WINDOW_ERROR_REMOVE_IMMEDIATELY);
                }
            }
        }
    }

    private final void MediaBrowserCompat$ItemReceiver() {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.IconCompatParcelizer, "scaleY", new float[]{1.5f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.IconCompatParcelizer, "scaleX", new float[]{1.5f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.IconCompatParcelizer, "scaleY", new float[]{1.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.IconCompatParcelizer, "scaleX", new float[]{1.0f});
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet2.play(ofFloat3).with(ofFloat4);
        animatorSet3.play(animatorSet2).after(animatorSet);
        animatorSet3.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (r1 != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0101, code lost:
        if (r1 != false) goto L_0x0105;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$CustomActionResultReceiver(p040o.FragmentBuilder_BindVerifyIdentityFragment r13) {
        /*
            r12 = this;
            android.content.MutableContextWrapper r0 = r12.MediaBrowserCompat$SearchResultReceiver
            if (r0 != 0) goto L_0x0007
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0007:
            android.content.res.Resources r0 = r0.getResources()
            int r1 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.read.th_pokerchip_center
            boolean r1 = r0.getBoolean(r1)
            int r2 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_padding_left
            float r2 = r0.getDimension(r2)
            boolean r3 = java.lang.Float.isNaN(r2)
            java.lang.String r4 = "Cannot round NaN value."
            if (r3 != 0) goto L_0x014f
            int r2 = java.lang.Math.round(r2)
            int r3 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_padding_right
            float r3 = r0.getDimension(r3)
            boolean r5 = java.lang.Float.isNaN(r3)
            if (r5 != 0) goto L_0x0147
            int r3 = java.lang.Math.round(r3)
            int r5 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_padding_top
            float r5 = r0.getDimension(r5)
            boolean r6 = java.lang.Float.isNaN(r5)
            if (r6 != 0) goto L_0x013f
            int r5 = java.lang.Math.round(r5)
            int r6 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_padding_bottom
            float r6 = r0.getDimension(r6)
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 != 0) goto L_0x0137
            int r4 = java.lang.Math.round(r6)
            int[] r6 = p040o.FragmentBuilder_BindSuitabilityQuestionsSummaryFragment.write
            int r7 = r13.ordinal()
            r6 = r6[r7]
            r7 = 17
            r8 = 1
            r9 = 16
            java.lang.String r10 = "resources.getText(R.string.th_icon_brand)"
            if (r6 == r8) goto L_0x00e6
            r8 = 2
            if (r6 == r8) goto L_0x00c8
            r8 = 3
            if (r6 == r8) goto L_0x00aa
            r8 = 4
            if (r6 == r8) goto L_0x008c
            int r6 = p040o.C6555xdccae8ee.th_icon_brand
            java.lang.CharSequence r6 = r0.getText(r6)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r10)
            int r8 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_off_foreground
            int r8 = r0.getColor(r8)
            int r10 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_off_background
            int r10 = r0.getColor(r10)
            int r11 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_text_default
            float r11 = r0.getDimension(r11)
            if (r1 == 0) goto L_0x0104
            goto L_0x0105
        L_0x008c:
            int r1 = p040o.C6555xdccae8ee.th_icon_cloud_release
            java.lang.CharSequence r6 = r0.getText(r1)
            java.lang.String r1 = "resources.getText(R.string.th_icon_cloud_release)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r1)
            int r1 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_preview_foreground
            int r8 = r0.getColor(r1)
            int r1 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_preview_background
            int r10 = r0.getColor(r1)
            int r1 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_text_live
            float r11 = r0.getDimension(r1)
            goto L_0x0105
        L_0x00aa:
            int r1 = p040o.C6555xdccae8ee.th_icon_rocketship
            java.lang.CharSequence r6 = r0.getText(r1)
            java.lang.String r1 = "resources.getText(R.string.th_icon_rocketship)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r1)
            int r1 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_preview_foreground
            int r8 = r0.getColor(r1)
            int r1 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_preview_background
            int r10 = r0.getColor(r1)
            int r1 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_text_launchpad
            float r11 = r0.getDimension(r1)
            goto L_0x0105
        L_0x00c8:
            int r1 = p040o.C6555xdccae8ee.th_icon_flask
            java.lang.CharSequence r6 = r0.getText(r1)
            java.lang.String r1 = "resources.getText(R.string.th_icon_flask)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r1)
            int r1 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_preview_foreground
            int r8 = r0.getColor(r1)
            int r1 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_preview_background
            int r10 = r0.getColor(r1)
            int r1 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_text_works
            float r11 = r0.getDimension(r1)
            goto L_0x0105
        L_0x00e6:
            int r6 = p040o.C6555xdccae8ee.th_icon_brand
            java.lang.CharSequence r6 = r0.getText(r6)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r10)
            int r8 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_on_foreground
            int r8 = r0.getColor(r8)
            int r10 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_pokerchip_on_background
            int r10 = r0.getColor(r10)
            int r11 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_pokerchip_text_default
            float r11 = r0.getDimension(r11)
            if (r1 == 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r7 = r9
        L_0x0105:
            com.thunderhead.android.infrastructure.ui.views.TTFAppCompatTextView r1 = r12.IconCompatParcelizer
            if (r1 == 0) goto L_0x0136
            r1.setTextSize(r11)
            r1.setText(r6)
            r1.setTextColor(r8)
            r1.setGravity(r7)
            if (r7 != r9) goto L_0x011b
            r1.setPadding(r2, r5, r3, r4)
            goto L_0x011f
        L_0x011b:
            r2 = 0
            r1.setPadding(r2, r2, r2, r2)
        L_0x011f:
            int r2 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_pokerchip_background
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            android.graphics.drawable.Drawable r0 = p040o.setBaselineAligned.MediaBrowserCompat$MediaItem(r0)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.setColorFilter(r10, r2)
            r1.setBackground(r0)
            java.lang.String r13 = r13.tag
            r1.setTag(r13)
        L_0x0136:
            return
        L_0x0137:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            throw r13
        L_0x013f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            throw r13
        L_0x0147:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            throw r13
        L_0x014f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindSuccessQuickOperationFragment.MediaBrowserCompat$CustomActionResultReceiver(o.FragmentBuilder_BindVerifyIdentityFragment):void");
    }

    /* renamed from: o.FragmentBuilder_BindSuccessQuickOperationFragment$read */
    public static final class read implements View.OnTouchListener {
        private int IconCompatParcelizer;
        private float MediaBrowserCompat$CustomActionResultReceiver;
        private float MediaBrowserCompat$ItemReceiver;
        private final C6820xdcdf989a MediaMetadataCompat = new C6820xdcdf989a(this);
        final /* synthetic */ FragmentBuilder_BindSuccessQuickOperationFragment read;
        private final GestureDetector write;

        read(FragmentBuilder_BindSuccessQuickOperationFragment fragmentBuilder_BindSuccessQuickOperationFragment, Activity activity) {
            this.read = fragmentBuilder_BindSuccessQuickOperationFragment;
            this.write = new GestureDetector(activity, this.MediaMetadataCompat);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.write.onTouchEvent(motionEvent)) {
                return true;
            }
            if (motionEvent != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.IconCompatParcelizer = (int) motionEvent.getRawX();
                    FragmentBuilder_BindSuccessQuickOperationFragment.MediaBrowserCompat$ItemReceiver(this.read, this.IconCompatParcelizer, (int) motionEvent.getRawY());
                    this.MediaBrowserCompat$CustomActionResultReceiver = motionEvent.getRawX();
                    this.MediaBrowserCompat$ItemReceiver = motionEvent.getRawY();
                } else if (action == 2) {
                    FragmentBuilder_BindSuccessQuickOperationFragment.MediaBrowserCompat$ItemReceiver(this.read, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    float rawX = motionEvent.getRawX();
                    float f = this.MediaBrowserCompat$CustomActionResultReceiver;
                    float rawY = motionEvent.getRawY();
                    float f2 = this.MediaBrowserCompat$ItemReceiver;
                    this.MediaBrowserCompat$CustomActionResultReceiver = motionEvent.getRawX();
                    this.MediaBrowserCompat$ItemReceiver = motionEvent.getRawY();
                    FragmentBuilder_BindSuccessQuickOperationFragment.write(this.read, rawX - f, rawY - f2);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: o.FragmentBuilder_BindSuccessQuickOperationFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements CcSofHybridActivity_ViewBinding.read {
        public final GoogleApiManager.zab MediaBrowserCompat$CustomActionResultReceiver;
        public final zabj read;
        private final PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver purchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver, zabj zabj, GoogleApiManager.zab zab) {
            this.write = purchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver;
            this.read = zabj;
            this.MediaBrowserCompat$CustomActionResultReceiver = zab;
        }

        public final DebitCardResetOtpActivity<Boolean> write(ImmutableSortedMap.Values values) {
            return this.write.MediaBrowserCompat$CustomActionResultReceiver.deleteScheduleTransaction(values).flatMap(getRemoteCreatorInstance.IconCompatParcelizer);
        }

        public final DebitCardResetOtpActivity<OnStreetViewPanoramaReadyCallback> read(String str) {
            return this.write.MediaBrowserCompat$CustomActionResultReceiver.getScheduleList(str).flatMap(new getLocalVersion(this));
        }

        public final DebitCardResetOtpActivity<PrepaidTravelServicesTabFragment.write> read() {
            return this.write.MediaBrowserCompat$CustomActionResultReceiver.getSchedules().flatMap(new DynamiteModule(this));
        }

        public final DebitCardResetOtpActivity<PrepaidTravelServicesTabFragment.write> MediaBrowserCompat$ItemReceiver() {
            return this.write.MediaBrowserCompat$CustomActionResultReceiver.getSchedulesConfig().flatMap(new DynamiteModule.DynamiteLoaderClassLoader(this));
        }
    }

    public static final /* synthetic */ void write(FragmentBuilder_BindSuccessQuickOperationFragment fragmentBuilder_BindSuccessQuickOperationFragment, float f, float f2) {
        TTFAppCompatTextView tTFAppCompatTextView = fragmentBuilder_BindSuccessQuickOperationFragment.IconCompatParcelizer;
        int width = tTFAppCompatTextView != null ? tTFAppCompatTextView.getWidth() : 1;
        TTFAppCompatTextView tTFAppCompatTextView2 = fragmentBuilder_BindSuccessQuickOperationFragment.IconCompatParcelizer;
        int height = tTFAppCompatTextView2 != null ? tTFAppCompatTextView2.getHeight() : 1;
        FrameLayout frameLayout = fragmentBuilder_BindSuccessQuickOperationFragment.read;
        int width2 = frameLayout != null ? frameLayout.getWidth() : 1;
        FrameLayout frameLayout2 = fragmentBuilder_BindSuccessQuickOperationFragment.read;
        int width3 = frameLayout2 != null ? frameLayout2.getWidth() : 1;
        WindowManager.LayoutParams layoutParams = fragmentBuilder_BindSuccessQuickOperationFragment.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        float f3 = (float) (layoutParams != null ? layoutParams.x : 0);
        WindowManager.LayoutParams layoutParams2 = fragmentBuilder_BindSuccessQuickOperationFragment.MediaBrowserCompat$CustomActionResultReceiver;
        float f4 = (float) (layoutParams2 != null ? layoutParams2.y : 0);
        float f5 = f + f3;
        float f6 = f2 + f4;
        float f7 = (float) (((width2 - width) + 1) >> 1);
        if (f5 + f7 < BitmapDescriptorFactory.HUE_RED) {
            f5 = f3;
        }
        float f8 = (float) (((width3 - height) + 1) >> 1);
        if (f6 + f8 < BitmapDescriptorFactory.HUE_RED) {
            f6 = f4;
        }
        Point point = fragmentBuilder_BindSuccessQuickOperationFragment.MediaMetadataCompat;
        int i2 = point != null ? point.x : 0;
        Point point2 = fragmentBuilder_BindSuccessQuickOperationFragment.MediaMetadataCompat;
        if (point2 != null) {
            i = point2.y;
        }
        if ((((float) width2) + f5) - f7 <= ((float) i2)) {
            f3 = f5;
        }
        if ((((float) width3) + f6) - f8 <= ((float) i)) {
            f4 = f6;
        }
        WindowManager.LayoutParams layoutParams3 = fragmentBuilder_BindSuccessQuickOperationFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (layoutParams3 != null) {
            layoutParams3.y = (int) (((double) f4) + 0.5d);
        }
        WindowManager.LayoutParams layoutParams4 = fragmentBuilder_BindSuccessQuickOperationFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (layoutParams4 != null) {
            layoutParams4.x = (int) (((double) f3) + 0.5d);
        }
        WindowManager MediaBrowserCompat$SearchResultReceiver2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaBrowserCompat$SearchResultReceiver();
        if (MediaBrowserCompat$SearchResultReceiver2 != null) {
            MediaBrowserCompat$SearchResultReceiver2.updateViewLayout(fragmentBuilder_BindSuccessQuickOperationFragment.read, fragmentBuilder_BindSuccessQuickOperationFragment.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            MyECouponActivity_ViewBinding.write("Could not update pokerchip window layout!");
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindSuccessQuickOperationFragment fragmentBuilder_BindSuccessQuickOperationFragment, int i, int i2) {
        Point point = fragmentBuilder_BindSuccessQuickOperationFragment.MediaMetadataCompat;
        if (point != null) {
            int i3 = point.x;
        }
        Point point2 = fragmentBuilder_BindSuccessQuickOperationFragment.MediaMetadataCompat;
        if (point2 != null) {
            int i4 = point2.y;
        }
    }
}
