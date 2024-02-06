package p040o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p040o.AlertController$RecycleListView;
import p040o.ScbMapActivity_ViewBinding;
import p040o.ScrollingTabContainerView;

/* renamed from: o.FragmentBuilder_BindOnboardingSelectAccountFragment */
public final class FragmentBuilder_BindOnboardingSelectAccountFragment {
    private static final boolean MediaSessionCompat$ResultReceiverWrapper = (Build.VERSION.SDK_INT < 18);
    private boolean AbsActionBarView;
    private final View ActionBarContainer;
    private float ActionMenuItemView;
    private float AlertController$RecycleListView;
    private float AppCompatActivity;
    private float AppCompatDelegateImpl$ListMenuDecorView;
    private float AppCompatDialogFragment;
    private Typeface AppCompatViewInflater;
    private CharSequence ExpandedMenuView;
    public float IconCompatParcelizer;
    private int Keep;
    private final TextPaint ListMenuItemView;
    public Typeface MediaBrowserCompat$CustomActionResultReceiver;
    public ColorStateList MediaBrowserCompat$ItemReceiver;
    public TimeInterpolator MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public TimeInterpolator f3148x50fd9e4a;
    public Typeface MediaDescriptionCompat;
    public float MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    private final Rect MediaSessionCompat$Token;
    private float MenuItemImpl;
    private Paint MenuItemWrapperICS$CollapsibleActionViewWrapper;
    public CharSequence ParcelableVolumeInfo;
    private float PlaybackStateCompat;
    private float PlaybackStateCompat$CustomAction;
    public int[] RatingCompat;
    public int read;
    private float setBackgroundResource;
    private final Rect setCheckable;
    private boolean setChecked;
    private final TextPaint setContentHeight;
    private final RectF setContentView;
    private float setExpandedFormat;
    private Bitmap setForceShowIcon;
    private float setGroupDividerEnabled;
    private float setHasDecor;
    private float setIcon;
    private int setItemInvoker;
    private float setPadding;
    private float setPopupCallback;
    private float setShortcut;
    private boolean setTitle;
    private float setVisibility;
    public ColorStateList write;

    public FragmentBuilder_BindOnboardingSelectAccountFragment() {
    }

    /* renamed from: o.FragmentBuilder_BindOnboardingSelectAccountFragment$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<ScbMapActivity_ViewBinding<OnBoardingTutorialActivity, FragmentBuilder_BindHmlNoDepositAccountFragment>, HmlVerifyPhoneValidateOtpActivity> {
        public static final read read = new read();

        read() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ScbMapActivity_ViewBinding scbMapActivity_ViewBinding = (ScbMapActivity_ViewBinding) obj;
            onGetStartedClick.write((Object) scbMapActivity_ViewBinding, "$receiver");
            FundFactSheetActivity fundFactSheetActivity = C66241.read;
            onGetStartedClick.write((Object) fundFactSheetActivity, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            scbMapActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = (String) fundFactSheetActivity.invoke(scbMapActivity_ViewBinding);
            ScbMapActivity_ViewBinding.write(scbMapActivity_ViewBinding, new BaseDiscoverDisclaimerActivity<ScbMapActivity_ViewBinding<OnBoardingTutorialActivity, FragmentBuilder_BindHmlNoDepositAccountFragment>.write, CaptureDocumentActivity<OnBoardingTutorialActivity>, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>, Object>((HmlNTBPromptPayNotFoundActivity) null) {
                private CaptureDocumentActivity IconCompatParcelizer;

                public final Object write(Object obj, Object obj2, Object obj3) {
                    CaptureDocumentActivity captureDocumentActivity = (CaptureDocumentActivity) obj2;
                    HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity = (HmlNTBPromptPayNotFoundActivity) obj3;
                    onGetStartedClick.write((Object) (ScbMapActivity_ViewBinding.write) obj, "$this$create");
                    onGetStartedClick.write((Object) captureDocumentActivity, "<name for destructuring parameter 0>");
                    onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "continuation");
                    C66255 r2 = 

                    public static int MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment, float f, float f2) {
                        int i;
                        int i2 = fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
                        int i3 = fragmentBuilder_BindOthersTabFragment.PlaybackStateCompat;
                        int i4 = fragmentBuilder_BindOthersTabFragment.setContentView;
                        int i5 = fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$ResultReceiverWrapper;
                        if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
                            fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
                        }
                        if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                            i = fragmentBuilder_BindOthersTabFragment.RatingCompat;
                        } else {
                            i = fragmentBuilder_BindOthersTabFragment.setCheckable;
                        }
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < i2) {
                            boolean z = true;
                            int i8 = (i3 << 1) + (i4 / 2) + (i6 > 0 ? i5 : i5 / 2) + i7;
                            boolean z2 = f >= ((float) i7) && f <= ((float) i8);
                            if (f2 < BitmapDescriptorFactory.HUE_RED || f2 > ((float) i)) {
                                z = false;
                            }
                            if (z2 && z) {
                                return i6;
                            }
                            i6++;
                            i7 = i8;
                        }
                        return -1;
                    }

                    private static int MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment, int i) {
                        int i2 = fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
                        int i3 = fragmentBuilder_BindOthersTabFragment.PlaybackStateCompat;
                        int i4 = fragmentBuilder_BindOthersTabFragment.setContentView;
                        int i5 = fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$ResultReceiverWrapper;
                        int i6 = 0;
                        for (int i7 = 0; i7 < i2; i7++) {
                            int i8 = i4 / 2;
                            int i9 = i6 + i3 + i8;
                            if (i == i7) {
                                return i9;
                            }
                            i6 = i9 + i3 + i5 + i8;
                        }
                        if (fragmentBuilder_BindOthersTabFragment.write == null) {
                            fragmentBuilder_BindOthersTabFragment.write = DTRMM.NONE;
                        }
                        return fragmentBuilder_BindOthersTabFragment.write == DTRMM.DROP ? i6 + (i3 << 1) : i6;
                    }

                    public static int MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment, int i) {
                        int i2;
                        if (fragmentBuilder_BindOthersTabFragment == null) {
                            return 0;
                        }
                        if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
                            fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
                        }
                        if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                            i2 = MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindOthersTabFragment, i);
                        } else {
                            i2 = fragmentBuilder_BindOthersTabFragment.PlaybackStateCompat;
                            if (fragmentBuilder_BindOthersTabFragment.write == null) {
                                fragmentBuilder_BindOthersTabFragment.write = DTRMM.NONE;
                            }
                            if (fragmentBuilder_BindOthersTabFragment.write == DTRMM.DROP) {
                                i2 *= 3;
                            }
                        }
                        return i2 + fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$QueueItem;
                    }

                    public static int read(FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment, int i) {
                        int i2;
                        if (fragmentBuilder_BindOthersTabFragment == null) {
                            return 0;
                        }
                        if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
                            fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
                        }
                        if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                            i2 = fragmentBuilder_BindOthersTabFragment.PlaybackStateCompat;
                            if (fragmentBuilder_BindOthersTabFragment.write == null) {
                                fragmentBuilder_BindOthersTabFragment.write = DTRMM.NONE;
                            }
                            if (fragmentBuilder_BindOthersTabFragment.write == DTRMM.DROP) {
                                i2 *= 3;
                            }
                        } else {
                            i2 = MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindOthersTabFragment, i);
                        }
                        return i2 + fragmentBuilder_BindOthersTabFragment.Keep;
                    }

                    public FragmentBuilder_BindOnboardingSelectAccountFragment(View view) {
                        this.MediaBrowserCompat$SearchResultReceiver = 16;
                        this.read = 16;
                        this.MediaMetadataCompat = 15.0f;
                        this.AppCompatDialogFragment = 15.0f;
                        this.ActionBarContainer = view;
                        this.ListMenuItemView = new TextPaint(129);
                        this.setContentHeight = new TextPaint(this.ListMenuItemView);
                        this.MediaSessionCompat$Token = new Rect();
                        this.setCheckable = new Rect();
                        this.setContentView = new RectF();
                    }

                    private static int MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, float f) {
                        float f2 = 1.0f - f;
                        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
                    }

                    private void read() {
                        float f = this.ActionMenuItemView;
                        IconCompatParcelizer(this.AppCompatDialogFragment);
                        CharSequence charSequence = this.ExpandedMenuView;
                        float f2 = BitmapDescriptorFactory.HUE_RED;
                        float measureText = charSequence != null ? this.ListMenuItemView.measureText(charSequence, 0, charSequence.length()) : 0.0f;
                        int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(this.read, this.setTitle ? 1 : 0);
                        int i = MediaBrowserCompat$CustomActionResultReceiver2 & 112;
                        if (i == 48) {
                            this.AlertController$RecycleListView = ((float) this.MediaSessionCompat$Token.top) - this.ListMenuItemView.ascent();
                        } else if (i != 80) {
                            this.AlertController$RecycleListView = ((float) this.MediaSessionCompat$Token.centerY()) + (((this.ListMenuItemView.descent() - this.ListMenuItemView.ascent()) / 2.0f) - this.ListMenuItemView.descent());
                        } else {
                            this.AlertController$RecycleListView = (float) this.MediaSessionCompat$Token.bottom;
                        }
                        int i2 = MediaBrowserCompat$CustomActionResultReceiver2 & 8388615;
                        if (i2 == 1) {
                            this.PlaybackStateCompat = ((float) this.MediaSessionCompat$Token.centerX()) - (measureText / 2.0f);
                        } else if (i2 != 5) {
                            this.PlaybackStateCompat = (float) this.MediaSessionCompat$Token.left;
                        } else {
                            this.PlaybackStateCompat = ((float) this.MediaSessionCompat$Token.right) - measureText;
                        }
                        IconCompatParcelizer(this.MediaMetadataCompat);
                        CharSequence charSequence2 = this.ExpandedMenuView;
                        if (charSequence2 != null) {
                            f2 = this.ListMenuItemView.measureText(charSequence2, 0, charSequence2.length());
                        }
                        int MediaBrowserCompat$CustomActionResultReceiver3 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver, this.setTitle ? 1 : 0);
                        int i3 = MediaBrowserCompat$CustomActionResultReceiver3 & 112;
                        if (i3 == 48) {
                            this.setPopupCallback = ((float) this.setCheckable.top) - this.ListMenuItemView.ascent();
                        } else if (i3 != 80) {
                            this.setPopupCallback = ((float) this.setCheckable.centerY()) + (((this.ListMenuItemView.descent() - this.ListMenuItemView.ascent()) / 2.0f) - this.ListMenuItemView.descent());
                        } else {
                            this.setPopupCallback = (float) this.setCheckable.bottom;
                        }
                        int i4 = MediaBrowserCompat$CustomActionResultReceiver3 & 8388615;
                        if (i4 == 1) {
                            this.setExpandedFormat = ((float) this.setCheckable.centerX()) - (f2 / 2.0f);
                        } else if (i4 != 5) {
                            this.setExpandedFormat = (float) this.setCheckable.left;
                        } else {
                            this.setExpandedFormat = ((float) this.setCheckable.right) - f2;
                        }
                        Bitmap bitmap = this.setForceShowIcon;
                        if (bitmap != null) {
                            bitmap.recycle();
                            this.setForceShowIcon = null;
                        }
                        MediaBrowserCompat$CustomActionResultReceiver(f);
                    }

                    private boolean IconCompatParcelizer(CharSequence charSequence) {
                        boolean z = true;
                        if (SwitchCompat.m3079x50fd9e4a(this.ActionBarContainer) != 1) {
                            z = false;
                        }
                        return (z ? ScrollingTabContainerView.TabView.read : ScrollingTabContainerView.TabView.write).MediaBrowserCompat$ItemReceiver(charSequence, 0, charSequence.length());
                    }

                    private void read(float f) {
                        float f2;
                        float f3;
                        float f4;
                        float f5;
                        float f6;
                        float f7;
                        float f8;
                        int i;
                        TextPaint textPaint;
                        int i2;
                        int i3;
                        int i4;
                        RectF rectF = this.setContentView;
                        float f9 = (float) this.setCheckable.left;
                        float f10 = (float) this.MediaSessionCompat$Token.left;
                        TimeInterpolator timeInterpolator = this.MediaBrowserCompat$MediaItem;
                        if (timeInterpolator != null) {
                            f2 = timeInterpolator.getInterpolation(f);
                        } else {
                            f2 = f;
                        }
                        rectF.left = f9 + (f2 * (f10 - f9));
                        RectF rectF2 = this.setContentView;
                        float f11 = this.setPopupCallback;
                        float f12 = this.AlertController$RecycleListView;
                        TimeInterpolator timeInterpolator2 = this.MediaBrowserCompat$MediaItem;
                        if (timeInterpolator2 != null) {
                            f3 = timeInterpolator2.getInterpolation(f);
                        } else {
                            f3 = f;
                        }
                        rectF2.top = f11 + (f3 * (f12 - f11));
                        RectF rectF3 = this.setContentView;
                        float f13 = (float) this.setCheckable.right;
                        float f14 = (float) this.MediaSessionCompat$Token.right;
                        TimeInterpolator timeInterpolator3 = this.MediaBrowserCompat$MediaItem;
                        if (timeInterpolator3 != null) {
                            f4 = timeInterpolator3.getInterpolation(f);
                        } else {
                            f4 = f;
                        }
                        rectF3.right = f13 + (f4 * (f14 - f13));
                        RectF rectF4 = this.setContentView;
                        float f15 = (float) this.setCheckable.bottom;
                        float f16 = (float) this.MediaSessionCompat$Token.bottom;
                        TimeInterpolator timeInterpolator4 = this.MediaBrowserCompat$MediaItem;
                        if (timeInterpolator4 != null) {
                            f5 = timeInterpolator4.getInterpolation(f);
                        } else {
                            f5 = f;
                        }
                        rectF4.bottom = f15 + (f5 * (f16 - f15));
                        float f17 = this.setExpandedFormat;
                        float f18 = this.PlaybackStateCompat;
                        TimeInterpolator timeInterpolator5 = this.MediaBrowserCompat$MediaItem;
                        if (timeInterpolator5 != null) {
                            f6 = timeInterpolator5.getInterpolation(f);
                        } else {
                            f6 = f;
                        }
                        this.AppCompatDelegateImpl$ListMenuDecorView = f17 + (f6 * (f18 - f17));
                        float f19 = this.setPopupCallback;
                        float f20 = this.AlertController$RecycleListView;
                        TimeInterpolator timeInterpolator6 = this.MediaBrowserCompat$MediaItem;
                        if (timeInterpolator6 != null) {
                            f7 = timeInterpolator6.getInterpolation(f);
                        } else {
                            f7 = f;
                        }
                        this.AppCompatActivity = f19 + (f7 * (f20 - f19));
                        float f21 = this.MediaMetadataCompat;
                        float f22 = this.AppCompatDialogFragment;
                        TimeInterpolator timeInterpolator7 = this.f3148x50fd9e4a;
                        if (timeInterpolator7 != null) {
                            f8 = timeInterpolator7.getInterpolation(f);
                        } else {
                            f8 = f;
                        }
                        MediaBrowserCompat$CustomActionResultReceiver(f21 + (f8 * (f22 - f21)));
                        ColorStateList colorStateList = this.write;
                        ColorStateList colorStateList2 = this.MediaBrowserCompat$ItemReceiver;
                        if (colorStateList != colorStateList2) {
                            textPaint = this.ListMenuItemView;
                            int[] iArr = this.RatingCompat;
                            if (iArr != null) {
                                i3 = colorStateList2.getColorForState(iArr, 0);
                            } else {
                                i3 = colorStateList2.getDefaultColor();
                            }
                            int[] iArr2 = this.RatingCompat;
                            if (iArr2 != null) {
                                i4 = this.write.getColorForState(iArr2, 0);
                            } else {
                                i4 = this.write.getDefaultColor();
                            }
                            i = MediaBrowserCompat$CustomActionResultReceiver(i3, i4, f);
                        } else {
                            TextPaint textPaint2 = this.ListMenuItemView;
                            int[] iArr3 = this.RatingCompat;
                            if (iArr3 != null) {
                                i2 = colorStateList.getColorForState(iArr3, 0);
                            } else {
                                i2 = colorStateList.getDefaultColor();
                            }
                            TextPaint textPaint3 = textPaint2;
                            i = i2;
                            textPaint = textPaint3;
                        }
                        textPaint.setColor(i);
                        TextPaint textPaint4 = this.ListMenuItemView;
                        float f23 = this.setPadding;
                        float f24 = f23 + ((this.setBackgroundResource - f23) * f);
                        float f25 = this.setShortcut;
                        float f26 = f25 + ((this.PlaybackStateCompat$CustomAction - f25) * f);
                        float f27 = this.setIcon;
                        textPaint4.setShadowLayer(f24, f26, f27 + ((this.setHasDecor - f27) * f), MediaBrowserCompat$CustomActionResultReceiver(this.setItemInvoker, this.Keep, f));
                        SwitchCompat.setItemInvoker(this.ActionBarContainer);
                    }

                    private void IconCompatParcelizer(float f) {
                        float f2;
                        boolean z;
                        if (this.ParcelableVolumeInfo != null) {
                            float width = (float) this.MediaSessionCompat$Token.width();
                            float width2 = (float) this.setCheckable.width();
                            boolean z2 = true;
                            if (Math.abs(f - this.AppCompatDialogFragment) < 0.001f) {
                                f2 = this.AppCompatDialogFragment;
                                this.setGroupDividerEnabled = 1.0f;
                                Typeface typeface = this.AppCompatViewInflater;
                                Typeface typeface2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                                if (typeface != typeface2) {
                                    this.AppCompatViewInflater = typeface2;
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                float f3 = this.MediaMetadataCompat;
                                Typeface typeface3 = this.AppCompatViewInflater;
                                Typeface typeface4 = this.MediaDescriptionCompat;
                                if (typeface3 != typeface4) {
                                    this.AppCompatViewInflater = typeface4;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (Math.abs(f - this.MediaMetadataCompat) < 0.001f) {
                                    this.setGroupDividerEnabled = 1.0f;
                                } else {
                                    this.setGroupDividerEnabled = f / this.MediaMetadataCompat;
                                }
                                float f4 = this.AppCompatDialogFragment / this.MediaMetadataCompat;
                                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                                f2 = f3;
                            }
                            if (width > BitmapDescriptorFactory.HUE_RED) {
                                z = this.ActionMenuItemView != f2 || this.MediaSessionCompat$QueueItem || z;
                                this.ActionMenuItemView = f2;
                                this.MediaSessionCompat$QueueItem = false;
                            }
                            if (this.ExpandedMenuView == null || z) {
                                this.ListMenuItemView.setTextSize(this.ActionMenuItemView);
                                this.ListMenuItemView.setTypeface(this.AppCompatViewInflater);
                                TextPaint textPaint = this.ListMenuItemView;
                                if (this.setGroupDividerEnabled == 1.0f) {
                                    z2 = false;
                                }
                                textPaint.setLinearText(z2);
                                CharSequence ellipsize = TextUtils.ellipsize(this.ParcelableVolumeInfo, this.ListMenuItemView, width, TextUtils.TruncateAt.END);
                                if (!TextUtils.equals(ellipsize, this.ExpandedMenuView)) {
                                    this.ExpandedMenuView = ellipsize;
                                    this.setTitle = IconCompatParcelizer(ellipsize);
                                }
                            }
                        }
                    }

                    private void write() {
                        if (this.setForceShowIcon == null && !this.setCheckable.isEmpty() && !TextUtils.isEmpty(this.ExpandedMenuView)) {
                            read((float) BitmapDescriptorFactory.HUE_RED);
                            this.setVisibility = this.ListMenuItemView.ascent();
                            this.MenuItemImpl = this.ListMenuItemView.descent();
                            TextPaint textPaint = this.ListMenuItemView;
                            CharSequence charSequence = this.ExpandedMenuView;
                            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
                            int round2 = Math.round(this.MenuItemImpl - this.setVisibility);
                            if (round > 0 && round2 > 0) {
                                this.setForceShowIcon = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(this.setForceShowIcon);
                                CharSequence charSequence2 = this.ExpandedMenuView;
                                canvas.drawText(charSequence2, 0, charSequence2.length(), BitmapDescriptorFactory.HUE_RED, ((float) round2) - this.ListMenuItemView.descent(), this.ListMenuItemView);
                                if (this.MenuItemWrapperICS$CollapsibleActionViewWrapper == null) {
                                    this.MenuItemWrapperICS$CollapsibleActionViewWrapper = new Paint(3);
                                }
                            }
                        }
                    }

                    private Typeface read(int i) {
                        TypedArray obtainStyledAttributes = this.ActionBarContainer.getContext().obtainStyledAttributes(i, new int[]{16843692});
                        try {
                            String string = obtainStyledAttributes.getString(0);
                            if (string != null) {
                                return Typeface.create(string, 0);
                            }
                            obtainStyledAttributes.recycle();
                            return null;
                        } finally {
                            obtainStyledAttributes.recycle();
                        }
                    }

                    private static boolean read(Rect rect, int i, int i2, int i3, int i4) {
                        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
                    }

                    private void MediaBrowserCompat$CustomActionResultReceiver(float f) {
                        IconCompatParcelizer(f);
                        boolean z = MediaSessionCompat$ResultReceiverWrapper && this.setGroupDividerEnabled != 1.0f;
                        this.AbsActionBarView = z;
                        if (z) {
                            write();
                        }
                        SwitchCompat.setItemInvoker(this.ActionBarContainer);
                    }

                    private float MediaBrowserCompat$MediaItem() {
                        if (this.ParcelableVolumeInfo == null) {
                            return BitmapDescriptorFactory.HUE_RED;
                        }
                        TextPaint textPaint = this.setContentHeight;
                        textPaint.setTextSize(this.AppCompatDialogFragment);
                        textPaint.setTypeface(this.MediaBrowserCompat$CustomActionResultReceiver);
                        TextPaint textPaint2 = this.setContentHeight;
                        CharSequence charSequence = this.ParcelableVolumeInfo;
                        return textPaint2.measureText(charSequence, 0, charSequence.length());
                    }

                    public final void write(Canvas canvas) {
                        float f;
                        int save = canvas.save();
                        if (this.ExpandedMenuView != null && this.setChecked) {
                            float f2 = this.AppCompatDelegateImpl$ListMenuDecorView;
                            float f3 = this.AppCompatActivity;
                            boolean z = this.AbsActionBarView && this.setForceShowIcon != null;
                            if (z) {
                                f = this.setVisibility * this.setGroupDividerEnabled;
                            } else {
                                this.ListMenuItemView.ascent();
                                f = BitmapDescriptorFactory.HUE_RED;
                                this.ListMenuItemView.descent();
                            }
                            if (z) {
                                f3 += f;
                            }
                            float f4 = f3;
                            float f5 = this.setGroupDividerEnabled;
                            if (f5 != 1.0f) {
                                canvas.scale(f5, f5, f2, f4);
                            }
                            if (z) {
                                canvas.drawBitmap(this.setForceShowIcon, f2, f4, this.MenuItemWrapperICS$CollapsibleActionViewWrapper);
                            } else {
                                CharSequence charSequence = this.ExpandedMenuView;
                                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.ListMenuItemView);
                            }
                        }
                        canvas.restoreToCount(save);
                    }

                    public final void MediaBrowserCompat$ItemReceiver(RectF rectF) {
                        float f;
                        boolean IconCompatParcelizer2 = IconCompatParcelizer(this.ParcelableVolumeInfo);
                        Rect rect = this.MediaSessionCompat$Token;
                        if (!IconCompatParcelizer2) {
                            f = (float) rect.left;
                        } else {
                            f = ((float) rect.right) - MediaBrowserCompat$MediaItem();
                        }
                        rectF.left = f;
                        rectF.top = (float) this.MediaSessionCompat$Token.top;
                        rectF.right = !IconCompatParcelizer2 ? rectF.left + MediaBrowserCompat$MediaItem() : (float) this.MediaSessionCompat$Token.right;
                        rectF.bottom = ((float) this.MediaSessionCompat$Token.top) + IconCompatParcelizer();
                    }

                    public final float IconCompatParcelizer() {
                        TextPaint textPaint = this.setContentHeight;
                        textPaint.setTextSize(this.AppCompatDialogFragment);
                        textPaint.setTypeface(this.MediaBrowserCompat$CustomActionResultReceiver);
                        return -this.setContentHeight.ascent();
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
                        r0 = r1.MediaBrowserCompat$ItemReceiver;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
                        /*
                            r1 = this;
                            android.content.res.ColorStateList r0 = r1.write
                            if (r0 == 0) goto L_0x000a
                            boolean r0 = r0.isStateful()
                            if (r0 != 0) goto L_0x0014
                        L_0x000a:
                            android.content.res.ColorStateList r0 = r1.MediaBrowserCompat$ItemReceiver
                            if (r0 == 0) goto L_0x0016
                            boolean r0 = r0.isStateful()
                            if (r0 == 0) goto L_0x0016
                        L_0x0014:
                            r0 = 1
                            goto L_0x0017
                        L_0x0016:
                            r0 = 0
                        L_0x0017:
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver():boolean");
                    }

                    private void MediaDescriptionCompat() {
                        this.setChecked = this.MediaSessionCompat$Token.width() > 0 && this.MediaSessionCompat$Token.height() > 0 && this.setCheckable.width() > 0 && this.setCheckable.height() > 0;
                    }

                    public final void MediaBrowserCompat$ItemReceiver() {
                        if (this.ActionBarContainer.getHeight() > 0 && this.ActionBarContainer.getWidth() > 0) {
                            read();
                            read(this.IconCompatParcelizer);
                        }
                    }

                    public final void write(int i, int i2, int i3, int i4) {
                        if (!read(this.MediaSessionCompat$Token, i, i2, i3, i4)) {
                            this.MediaSessionCompat$Token.set(i, i2, i3, i4);
                            this.MediaSessionCompat$QueueItem = true;
                            MediaDescriptionCompat();
                        }
                    }

                    public final void MediaBrowserCompat$ItemReceiver(int i) {
                        Context context = this.ActionBarContainer.getContext();
                        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(i, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance));
                        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor)) {
                            this.write = mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor);
                        }
                        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textSize)) {
                            this.AppCompatDialogFragment = (float) mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textSize, (int) this.AppCompatDialogFragment);
                        }
                        this.Keep = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_shadowColor, 0);
                        this.PlaybackStateCompat$CustomAction = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getFloat(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_shadowDx, BitmapDescriptorFactory.HUE_RED);
                        this.setHasDecor = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getFloat(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_shadowDy, BitmapDescriptorFactory.HUE_RED);
                        this.setBackgroundResource = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getFloat(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_shadowRadius, BitmapDescriptorFactory.HUE_RED);
                        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.MediaBrowserCompat$CustomActionResultReceiver = read(i);
                        }
                        MediaBrowserCompat$ItemReceiver();
                    }

                    public final void IconCompatParcelizer(int i, int i2, int i3, int i4) {
                        if (!read(this.setCheckable, i, i2, i3, i4)) {
                            this.setCheckable.set(i, i2, i3, i4);
                            this.MediaSessionCompat$QueueItem = true;
                            MediaDescriptionCompat();
                        }
                    }

                    public final void IconCompatParcelizer(int i) {
                        Context context = this.ActionBarContainer.getContext();
                        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(i, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance));
                        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor)) {
                            this.MediaBrowserCompat$ItemReceiver = mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textColor);
                        }
                        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textSize)) {
                            this.MediaMetadataCompat = (float) mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_textSize, (int) this.MediaMetadataCompat);
                        }
                        this.setItemInvoker = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_shadowColor, 0);
                        this.setShortcut = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getFloat(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_shadowDx, BitmapDescriptorFactory.HUE_RED);
                        this.setIcon = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getFloat(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_shadowDy, BitmapDescriptorFactory.HUE_RED);
                        this.setPadding = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getFloat(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.TextAppearance_android_shadowRadius, BitmapDescriptorFactory.HUE_RED);
                        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.MediaDescriptionCompat = read(i);
                        }
                        MediaBrowserCompat$ItemReceiver();
                    }

                    public final void write(float f) {
                        if (f < BitmapDescriptorFactory.HUE_RED) {
                            f = 0.0f;
                        } else if (f > 1.0f) {
                            f = 1.0f;
                        }
                        if (f != this.IconCompatParcelizer) {
                            this.IconCompatParcelizer = f;
                            read(f);
                        }
                    }

                    public final void read(CharSequence charSequence) {
                        if (charSequence == null || !charSequence.equals(this.ParcelableVolumeInfo)) {
                            this.ParcelableVolumeInfo = charSequence;
                            this.ExpandedMenuView = null;
                            Bitmap bitmap = this.setForceShowIcon;
                            if (bitmap != null) {
                                bitmap.recycle();
                                this.setForceShowIcon = null;
                            }
                            MediaBrowserCompat$ItemReceiver();
                        }
                    }
                }
