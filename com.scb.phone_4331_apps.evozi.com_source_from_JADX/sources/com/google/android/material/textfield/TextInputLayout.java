package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.CheckableImageButton;
import p040o.ActionBarOverlayLayout;
import p040o.AlertController$RecycleListView;
import p040o.AppCompatDelegateImpl$ListMenuDecorView;
import p040o.FragmentBuilder_BindOnboardingSelectAccountFragment;
import p040o.Iterables;
import p040o.SwitchCompat;
import p040o.nAllocationSetSurface;
import p040o.nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver;
import p040o.nAllocationSetSurface$MediaSessionCompat$Token;
import p040o.nIncTypeCreate;
import p040o.nInvokeClosureCreate;
import p040o.setBaselineAligned;
import p040o.setIconifiedByDefault;
import p040o.setLastBaselineToBottomHeight;
import p040o.setNavigationContentDescription;
import p040o.setTextOn;
import p040o.setWindowTitle;
import p040o.zzlz;

public class TextInputLayout extends LinearLayout {
    private CharSequence AbsActionBarView;
    private Drawable ActionBarContainer;
    private boolean ActionBarContextView;
    private final int ActionMenuItemView;
    private float AlertController$RecycleListView;
    private final int AppCompatActivity;
    private final int AppCompatDelegateImpl$ListMenuDecorView;
    private int AppCompatDialogFragment;
    private ColorStateList AppCompatViewInflater;
    private boolean ExpandedMenuView;
    final FragmentBuilder_BindOnboardingSelectAccountFragment IconCompatParcelizer;
    private float Keep;
    private boolean ListMenuItemView;
    public EditText MediaBrowserCompat$CustomActionResultReceiver;
    TextView MediaBrowserCompat$ItemReceiver;
    public final nInvokeClosureCreate MediaBrowserCompat$MediaItem;
    CharSequence MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final int f50x50fd9e4a;
    boolean MediaDescriptionCompat;
    boolean MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private ValueAnimator MediaSessionCompat$Token;
    private boolean MenuItemImpl;
    private CharSequence MenuItemWrapperICS$CollapsibleActionViewWrapper;
    private GradientDrawable ParcelableVolumeInfo;
    private float PlaybackStateCompat;
    private final int PlaybackStateCompat$CustomAction;
    boolean RatingCompat;
    boolean read;
    private final int setBackgroundResource;
    private final int setCheckable;
    private final int setChecked;
    private Drawable setContentHeight;
    private int setContentView;
    private final Rect setCustomView;
    private int setExpandedFormat;
    private boolean setForceShowIcon;
    private final int setGroupDividerEnabled;
    private float setHasDecor;
    private Drawable setIcon;
    private boolean setItemInvoker;
    private ColorStateList setPadding;
    private int setPopupCallback;
    private Drawable setPrimaryBackground;
    private final int setShortcut;
    private ColorStateList setSplitBackground;
    private boolean setStackedBackground;
    private Typeface setSubtitle;
    private PorterDuff.Mode setTabContainer;
    private boolean setTitle;
    private final RectF setTitleOptional;
    private CheckableImageButton setTransitioning;
    private final FrameLayout setVisibility;
    boolean write;

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nAllocationSetSurface.read.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompat$MediaItem = new nInvokeClosureCreate(this);
        this.setCustomView = new Rect();
        this.setTitleOptional = new RectF();
        this.IconCompatParcelizer = new FragmentBuilder_BindOnboardingSelectAccountFragment(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.setVisibility = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.setVisibility);
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.IconCompatParcelizer;
        fragmentBuilder_BindOnboardingSelectAccountFragment.f3148x50fd9e4a = zzlz.IconCompatParcelizer;
        fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment2 = this.IconCompatParcelizer;
        fragmentBuilder_BindOnboardingSelectAccountFragment2.MediaBrowserCompat$MediaItem = zzlz.IconCompatParcelizer;
        fragmentBuilder_BindOnboardingSelectAccountFragment2.MediaBrowserCompat$ItemReceiver();
        FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment3 = this.IconCompatParcelizer;
        if (fragmentBuilder_BindOnboardingSelectAccountFragment3.read != 8388659) {
            fragmentBuilder_BindOnboardingSelectAccountFragment3.read = 8388659;
            fragmentBuilder_BindOnboardingSelectAccountFragment3.MediaBrowserCompat$ItemReceiver();
        }
        AlertController$RecycleListView.MediaDescriptionCompat IconCompatParcelizer2 = AlertController$RecycleListView.read.IconCompatParcelizer(context, attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout, i, nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.Widget_Design_TextInputLayout, new int[0]);
        this.MediaDescriptionCompat = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_hintEnabled, true);
        setHint(IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getText(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_android_hint));
        this.ExpandedMenuView = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_hintAnimationEnabled, true);
        this.f50x50fd9e4a = context.getResources().getDimensionPixelOffset(nAllocationSetSurface.IconCompatParcelizer.mtrl_textinput_box_bottom_offset);
        this.setBackgroundResource = context.getResources().getDimensionPixelOffset(nAllocationSetSurface.IconCompatParcelizer.mtrl_textinput_box_label_cutout_padding);
        this.PlaybackStateCompat$CustomAction = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.setHasDecor = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getDimension(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_boxCornerRadiusTopStart, BitmapDescriptorFactory.HUE_RED);
        this.AlertController$RecycleListView = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getDimension(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_boxCornerRadiusTopEnd, BitmapDescriptorFactory.HUE_RED);
        this.Keep = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getDimension(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_boxCornerRadiusBottomEnd, BitmapDescriptorFactory.HUE_RED);
        this.PlaybackStateCompat = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getDimension(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_boxCornerRadiusBottomStart, BitmapDescriptorFactory.HUE_RED);
        this.MediaSessionCompat$QueueItem = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getColor(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_boxBackgroundColor, 0);
        this.setPopupCallback = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getColor(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_boxStrokeColor, 0);
        this.AppCompatDelegateImpl$ListMenuDecorView = context.getResources().getDimensionPixelSize(nAllocationSetSurface.IconCompatParcelizer.mtrl_textinput_box_stroke_width_default);
        this.AppCompatActivity = context.getResources().getDimensionPixelSize(nAllocationSetSurface.IconCompatParcelizer.mtrl_textinput_box_stroke_width_focused);
        this.AppCompatDialogFragment = this.AppCompatDelegateImpl$ListMenuDecorView;
        setBoxBackgroundMode(IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getInt(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_boxBackgroundMode, 0));
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_android_textColorHint)) {
            ColorStateList MediaBrowserCompat$CustomActionResultReceiver2 = IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_android_textColorHint);
            this.setPadding = MediaBrowserCompat$CustomActionResultReceiver2;
            this.AppCompatViewInflater = MediaBrowserCompat$CustomActionResultReceiver2;
        }
        this.setChecked = setLastBaselineToBottomHeight.read(context, nAllocationSetSurface.write.mtrl_textinput_default_box_stroke_color);
        this.setShortcut = setLastBaselineToBottomHeight.read(context, nAllocationSetSurface.write.mtrl_textinput_disabled_color);
        this.setGroupDividerEnabled = setLastBaselineToBottomHeight.read(context, nAllocationSetSurface.write.mtrl_textinput_hovered_box_stroke_color);
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_hintTextAppearance, 0));
        }
        int resourceId = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_errorTextAppearance, 0);
        boolean z = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_errorEnabled, false);
        int resourceId2 = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_helperTextEnabled, false);
        CharSequence text = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getText(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_helperText);
        boolean z3 = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getInt(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_counterMaxLength, -1));
        this.setCheckable = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_counterTextAppearance, 0);
        this.ActionMenuItemView = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getResourceId(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_counterOverflowTextAppearance, 0);
        this.setStackedBackground = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_passwordToggleEnabled, false);
        this.ActionBarContainer = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_passwordToggleDrawable);
        this.AbsActionBarView = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getText(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_passwordToggleContentDescription);
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_passwordToggleTint)) {
            this.setItemInvoker = true;
            this.setSplitBackground = IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_passwordToggleTint);
        }
        if (IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.hasValue(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_passwordToggleTintMode)) {
            this.ListMenuItemView = true;
            this.setTabContainer = Iterables.C35273.read.read(IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.getInt(nAllocationSetSurface$MediaSessionCompat$Token.TextInputLayout_passwordToggleTintMode, -1));
        }
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.recycle();
        setHelperTextEnabled(z2);
        setHelperText(text);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z);
        setErrorTextAppearance(resourceId);
        setCounterEnabled(z3);
        read();
        SwitchCompat.write((View) this, 2);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.setVisibility.addView(view, layoutParams2);
            this.setVisibility.setLayoutParams(layoutParams);
            MediaSessionCompat$Token();
            EditText editText = (EditText) view;
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                if (!(editText instanceof TextInputEditText)) {
                    Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
                }
                this.MediaBrowserCompat$CustomActionResultReceiver = editText;
                MediaBrowserCompat$ItemReceiver();
                if (this.MediaSessionCompat$ResultReceiverWrapper != 0) {
                    MediaSessionCompat$Token();
                }
                MediaSessionCompat$ResultReceiverWrapper();
                setTextInputAccessibilityDelegate(new read(this));
                EditText editText2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (!(editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod))) {
                    FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.IconCompatParcelizer;
                    Typeface typeface = this.MediaBrowserCompat$CustomActionResultReceiver.getTypeface();
                    fragmentBuilder_BindOnboardingSelectAccountFragment.MediaDescriptionCompat = typeface;
                    fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver = typeface;
                    fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
                }
                FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment2 = this.IconCompatParcelizer;
                float textSize = this.MediaBrowserCompat$CustomActionResultReceiver.getTextSize();
                if (fragmentBuilder_BindOnboardingSelectAccountFragment2.MediaMetadataCompat != textSize) {
                    fragmentBuilder_BindOnboardingSelectAccountFragment2.MediaMetadataCompat = textSize;
                    fragmentBuilder_BindOnboardingSelectAccountFragment2.MediaBrowserCompat$ItemReceiver();
                }
                int gravity = this.MediaBrowserCompat$CustomActionResultReceiver.getGravity();
                FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment3 = this.IconCompatParcelizer;
                int i2 = (gravity & -113) | 48;
                if (fragmentBuilder_BindOnboardingSelectAccountFragment3.read != i2) {
                    fragmentBuilder_BindOnboardingSelectAccountFragment3.read = i2;
                    fragmentBuilder_BindOnboardingSelectAccountFragment3.MediaBrowserCompat$ItemReceiver();
                }
                FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment4 = this.IconCompatParcelizer;
                if (fragmentBuilder_BindOnboardingSelectAccountFragment4.MediaBrowserCompat$SearchResultReceiver != gravity) {
                    fragmentBuilder_BindOnboardingSelectAccountFragment4.MediaBrowserCompat$SearchResultReceiver = gravity;
                    fragmentBuilder_BindOnboardingSelectAccountFragment4.MediaBrowserCompat$ItemReceiver();
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.addTextChangedListener(new TextWatcher() {
                    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    public final void afterTextChanged(Editable editable) {
                        TextInputLayout textInputLayout = TextInputLayout.this;
                        textInputLayout.MediaBrowserCompat$ItemReceiver(!textInputLayout.RatingCompat, false);
                        if (TextInputLayout.this.write) {
                            TextInputLayout.this.write(editable.length());
                        }
                    }
                });
                if (this.AppCompatViewInflater == null) {
                    this.AppCompatViewInflater = this.MediaBrowserCompat$CustomActionResultReceiver.getHintTextColors();
                }
                if (this.MediaDescriptionCompat) {
                    if (TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver)) {
                        CharSequence hint = this.MediaBrowserCompat$CustomActionResultReceiver.getHint();
                        this.MenuItemWrapperICS$CollapsibleActionViewWrapper = hint;
                        setHint(hint);
                        this.MediaBrowserCompat$CustomActionResultReceiver.setHint((CharSequence) null);
                    }
                    this.MediaMetadataCompat = true;
                }
                if (this.MediaBrowserCompat$ItemReceiver != null) {
                    write(this.MediaBrowserCompat$CustomActionResultReceiver.getText().length());
                }
                this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver();
                m80x50fd9e4a();
                MediaBrowserCompat$ItemReceiver(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i, layoutParams);
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.MediaSessionCompat$ResultReceiverWrapper) {
            this.MediaSessionCompat$ResultReceiverWrapper = i;
            MediaBrowserCompat$ItemReceiver();
            if (this.MediaSessionCompat$ResultReceiverWrapper != 0) {
                MediaSessionCompat$Token();
            }
            MediaSessionCompat$ResultReceiverWrapper();
        }
    }

    private void MediaBrowserCompat$ItemReceiver() {
        int i = this.MediaSessionCompat$ResultReceiverWrapper;
        if (i == 0) {
            this.ParcelableVolumeInfo = null;
        } else if (i == 2 && this.MediaDescriptionCompat && !(this.ParcelableVolumeInfo instanceof nIncTypeCreate)) {
            this.ParcelableVolumeInfo = new nIncTypeCreate();
        } else if (!(this.ParcelableVolumeInfo instanceof GradientDrawable)) {
            this.ParcelableVolumeInfo = new GradientDrawable();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.setPopupCallback != i) {
            this.setPopupCallback = i;
            IconCompatParcelizer();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(setLastBaselineToBottomHeight.read(getContext(), i));
    }

    public void setBoxBackgroundColor(int i) {
        if (this.MediaSessionCompat$QueueItem != i) {
            this.MediaSessionCompat$QueueItem = i;
            write();
        }
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i3), getContext().getResources().getDimension(i4));
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        if (this.setHasDecor != f || this.AlertController$RecycleListView != f2 || this.Keep != f4 || this.PlaybackStateCompat != f3) {
            this.setHasDecor = f;
            this.AlertController$RecycleListView = f2;
            this.Keep = f4;
            this.PlaybackStateCompat = f3;
            write();
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.setSubtitle) {
            this.setSubtitle = typeface;
            FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.IconCompatParcelizer;
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaDescriptionCompat = typeface;
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver = typeface;
            fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
            nInvokeClosureCreate ninvokeclosurecreate = this.MediaBrowserCompat$MediaItem;
            if (typeface != ninvokeclosurecreate.MediaSessionCompat$Token) {
                ninvokeclosurecreate.MediaSessionCompat$Token = typeface;
                TextView textView = ninvokeclosurecreate.MediaMetadataCompat;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = ninvokeclosurecreate.ParcelableVolumeInfo;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.MediaBrowserCompat$ItemReceiver;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.MenuItemWrapperICS$CollapsibleActionViewWrapper == null || (editText = this.MediaBrowserCompat$CustomActionResultReceiver) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.MediaMetadataCompat;
        this.MediaMetadataCompat = false;
        CharSequence hint = editText.getHint();
        this.MediaBrowserCompat$CustomActionResultReceiver.setHint(this.MenuItemWrapperICS$CollapsibleActionViewWrapper);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.MediaBrowserCompat$CustomActionResultReceiver.setHint(hint);
            this.MediaMetadataCompat = z;
        }
    }

    private void MediaSessionCompat$Token() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.setVisibility.getLayoutParams();
        int MediaMetadataCompat2 = MediaMetadataCompat();
        if (MediaMetadataCompat2 != layoutParams.topMargin) {
            layoutParams.topMargin = MediaMetadataCompat2;
            this.setVisibility.requestLayout();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z3 = false;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (editText2 != null && editText2.hasFocus()) {
            z3 = true;
        }
        boolean read2 = this.MediaBrowserCompat$MediaItem.read();
        ColorStateList colorStateList2 = this.AppCompatViewInflater;
        if (colorStateList2 != null) {
            FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment = this.IconCompatParcelizer;
            if (fragmentBuilder_BindOnboardingSelectAccountFragment.write != colorStateList2) {
                fragmentBuilder_BindOnboardingSelectAccountFragment.write = colorStateList2;
                fragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$ItemReceiver();
            }
            FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment2 = this.IconCompatParcelizer;
            ColorStateList colorStateList3 = this.AppCompatViewInflater;
            if (fragmentBuilder_BindOnboardingSelectAccountFragment2.MediaBrowserCompat$ItemReceiver != colorStateList3) {
                fragmentBuilder_BindOnboardingSelectAccountFragment2.MediaBrowserCompat$ItemReceiver = colorStateList3;
                fragmentBuilder_BindOnboardingSelectAccountFragment2.MediaBrowserCompat$ItemReceiver();
            }
        }
        if (!isEnabled) {
            FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment3 = this.IconCompatParcelizer;
            ColorStateList valueOf = ColorStateList.valueOf(this.setShortcut);
            if (fragmentBuilder_BindOnboardingSelectAccountFragment3.write != valueOf) {
                fragmentBuilder_BindOnboardingSelectAccountFragment3.write = valueOf;
                fragmentBuilder_BindOnboardingSelectAccountFragment3.MediaBrowserCompat$ItemReceiver();
            }
            FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment4 = this.IconCompatParcelizer;
            ColorStateList valueOf2 = ColorStateList.valueOf(this.setShortcut);
            if (fragmentBuilder_BindOnboardingSelectAccountFragment4.MediaBrowserCompat$ItemReceiver != valueOf2) {
                fragmentBuilder_BindOnboardingSelectAccountFragment4.MediaBrowserCompat$ItemReceiver = valueOf2;
                fragmentBuilder_BindOnboardingSelectAccountFragment4.MediaBrowserCompat$ItemReceiver();
            }
        } else if (read2) {
            FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment5 = this.IconCompatParcelizer;
            TextView textView2 = this.MediaBrowserCompat$MediaItem.MediaMetadataCompat;
            ColorStateList textColors = textView2 != null ? textView2.getTextColors() : null;
            if (fragmentBuilder_BindOnboardingSelectAccountFragment5.write != textColors) {
                fragmentBuilder_BindOnboardingSelectAccountFragment5.write = textColors;
                fragmentBuilder_BindOnboardingSelectAccountFragment5.MediaBrowserCompat$ItemReceiver();
            }
        } else if (this.read && (textView = this.MediaBrowserCompat$ItemReceiver) != null) {
            FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment6 = this.IconCompatParcelizer;
            ColorStateList textColors2 = textView.getTextColors();
            if (fragmentBuilder_BindOnboardingSelectAccountFragment6.write != textColors2) {
                fragmentBuilder_BindOnboardingSelectAccountFragment6.write = textColors2;
                fragmentBuilder_BindOnboardingSelectAccountFragment6.MediaBrowserCompat$ItemReceiver();
            }
        } else if (z3 && (colorStateList = this.setPadding) != null) {
            FragmentBuilder_BindOnboardingSelectAccountFragment fragmentBuilder_BindOnboardingSelectAccountFragment7 = this.IconCompatParcelizer;
            if (fragmentBuilder_BindOnboardingSelectAccountFragment7.write != colorStateList) {
                fragmentBuilder_BindOnboardingSelectAccountFragment7.write = colorStateList;
                fragmentBuilder_BindOnboardingSelectAccountFragment7.MediaBrowserCompat$ItemReceiver();
            }
        }
        if (z4 || (isEnabled() && (z3 || read2))) {
            if (z2 || this.setTitle) {
                MediaBrowserCompat$ItemReceiver(z);
            }
        } else if (z2 || !this.setTitle) {
            MediaBrowserCompat$CustomActionResultReceiver(z);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.MediaDescriptionCompat) {
            write(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    private void write(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.MediaBrowserCompat$SearchResultReceiver)) {
            this.MediaBrowserCompat$SearchResultReceiver = charSequence;
            this.IconCompatParcelizer.read(charSequence);
            if (!this.setTitle) {
                MediaDescriptionCompat();
            }
        }
    }

    public void setHintEnabled(boolean z) {
        if (z != this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = z;
            if (!z) {
                this.MediaMetadataCompat = false;
                if (!TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver) && TextUtils.isEmpty(this.MediaBrowserCompat$CustomActionResultReceiver.getHint())) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.setHint(this.MediaBrowserCompat$SearchResultReceiver);
                }
                write((CharSequence) null);
            } else {
                CharSequence hint = this.MediaBrowserCompat$CustomActionResultReceiver.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver)) {
                        setHint(hint);
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver.setHint((CharSequence) null);
                }
                this.MediaMetadataCompat = true;
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                MediaSessionCompat$Token();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i);
        this.setPadding = this.IconCompatParcelizer.write;
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            MediaBrowserCompat$ItemReceiver(false, false);
            MediaSessionCompat$Token();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.AppCompatViewInflater = colorStateList;
        this.setPadding = colorStateList;
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            MediaBrowserCompat$ItemReceiver(false, false);
        }
    }

    public void setErrorEnabled(boolean z) {
        nInvokeClosureCreate ninvokeclosurecreate = this.MediaBrowserCompat$MediaItem;
        if (ninvokeclosurecreate.IconCompatParcelizer != z) {
            Animator animator = ninvokeclosurecreate.MediaBrowserCompat$ItemReceiver;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(ninvokeclosurecreate.write);
                ninvokeclosurecreate.MediaMetadataCompat = appCompatTextView;
                appCompatTextView.setId(nAllocationSetSurface.MediaDescriptionCompat.textinput_error);
                Typeface typeface = ninvokeclosurecreate.MediaSessionCompat$Token;
                if (typeface != null) {
                    ninvokeclosurecreate.MediaMetadataCompat.setTypeface(typeface);
                }
                int i = ninvokeclosurecreate.MediaBrowserCompat$SearchResultReceiver;
                ninvokeclosurecreate.MediaBrowserCompat$SearchResultReceiver = i;
                TextView textView = ninvokeclosurecreate.MediaMetadataCompat;
                if (textView != null) {
                    ninvokeclosurecreate.MediaSessionCompat$ResultReceiverWrapper.write(textView, i);
                }
                ninvokeclosurecreate.MediaMetadataCompat.setVisibility(4);
                SwitchCompat.IconCompatParcelizer((View) ninvokeclosurecreate.MediaMetadataCompat, 1);
                ninvokeclosurecreate.MediaBrowserCompat$ItemReceiver(ninvokeclosurecreate.MediaMetadataCompat, 0);
            } else {
                ninvokeclosurecreate.IconCompatParcelizer();
                ninvokeclosurecreate.read(ninvokeclosurecreate.MediaMetadataCompat, 0);
                ninvokeclosurecreate.MediaMetadataCompat = null;
                ninvokeclosurecreate.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver();
                ninvokeclosurecreate.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer();
            }
            ninvokeclosurecreate.IconCompatParcelizer = z;
        }
    }

    public void setErrorTextAppearance(int i) {
        nInvokeClosureCreate ninvokeclosurecreate = this.MediaBrowserCompat$MediaItem;
        ninvokeclosurecreate.MediaBrowserCompat$SearchResultReceiver = i;
        TextView textView = ninvokeclosurecreate.MediaMetadataCompat;
        if (textView != null) {
            ninvokeclosurecreate.MediaSessionCompat$ResultReceiverWrapper.write(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        TextView textView = this.MediaBrowserCompat$MediaItem.MediaMetadataCompat;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextTextAppearance(int i) {
        nInvokeClosureCreate ninvokeclosurecreate = this.MediaBrowserCompat$MediaItem;
        ninvokeclosurecreate.MediaSessionCompat$QueueItem = i;
        TextView textView = ninvokeclosurecreate.ParcelableVolumeInfo;
        if (textView != null) {
            setNavigationContentDescription.read(textView, i);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        nInvokeClosureCreate ninvokeclosurecreate = this.MediaBrowserCompat$MediaItem;
        if (ninvokeclosurecreate.MediaDescriptionCompat != z) {
            Animator animator = ninvokeclosurecreate.MediaBrowserCompat$ItemReceiver;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(ninvokeclosurecreate.write);
                ninvokeclosurecreate.ParcelableVolumeInfo = appCompatTextView;
                appCompatTextView.setId(nAllocationSetSurface.MediaDescriptionCompat.textinput_helper_text);
                Typeface typeface = ninvokeclosurecreate.MediaSessionCompat$Token;
                if (typeface != null) {
                    ninvokeclosurecreate.ParcelableVolumeInfo.setTypeface(typeface);
                }
                ninvokeclosurecreate.ParcelableVolumeInfo.setVisibility(4);
                SwitchCompat.IconCompatParcelizer((View) ninvokeclosurecreate.ParcelableVolumeInfo, 1);
                int i = ninvokeclosurecreate.MediaSessionCompat$QueueItem;
                ninvokeclosurecreate.MediaSessionCompat$QueueItem = i;
                TextView textView = ninvokeclosurecreate.ParcelableVolumeInfo;
                if (textView != null) {
                    setNavigationContentDescription.read(textView, i);
                }
                ninvokeclosurecreate.MediaBrowserCompat$ItemReceiver(ninvokeclosurecreate.ParcelableVolumeInfo, 1);
            } else {
                Animator animator2 = ninvokeclosurecreate.MediaBrowserCompat$ItemReceiver;
                if (animator2 != null) {
                    animator2.cancel();
                }
                if (ninvokeclosurecreate.MediaBrowserCompat$CustomActionResultReceiver == 2) {
                    ninvokeclosurecreate.read = 0;
                }
                ninvokeclosurecreate.write(ninvokeclosurecreate.MediaBrowserCompat$CustomActionResultReceiver, ninvokeclosurecreate.read, ninvokeclosurecreate.MediaBrowserCompat$CustomActionResultReceiver(ninvokeclosurecreate.ParcelableVolumeInfo, (CharSequence) null));
                ninvokeclosurecreate.read(ninvokeclosurecreate.ParcelableVolumeInfo, 1);
                ninvokeclosurecreate.ParcelableVolumeInfo = null;
                ninvokeclosurecreate.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver();
                ninvokeclosurecreate.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer();
            }
            ninvokeclosurecreate.MediaDescriptionCompat = z;
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.MediaBrowserCompat$MediaItem.MediaDescriptionCompat) {
                setHelperTextEnabled(true);
            }
            nInvokeClosureCreate ninvokeclosurecreate = this.MediaBrowserCompat$MediaItem;
            Animator animator = ninvokeclosurecreate.MediaBrowserCompat$ItemReceiver;
            if (animator != null) {
                animator.cancel();
            }
            ninvokeclosurecreate.MediaBrowserCompat$MediaItem = charSequence;
            ninvokeclosurecreate.ParcelableVolumeInfo.setText(charSequence);
            if (ninvokeclosurecreate.MediaBrowserCompat$CustomActionResultReceiver != 2) {
                ninvokeclosurecreate.read = 2;
            }
            ninvokeclosurecreate.write(ninvokeclosurecreate.MediaBrowserCompat$CustomActionResultReceiver, ninvokeclosurecreate.read, ninvokeclosurecreate.MediaBrowserCompat$CustomActionResultReceiver(ninvokeclosurecreate.ParcelableVolumeInfo, charSequence));
        } else if (this.MediaBrowserCompat$MediaItem.MediaDescriptionCompat) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        TextView textView = this.MediaBrowserCompat$MediaItem.ParcelableVolumeInfo;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.MediaBrowserCompat$MediaItem.IconCompatParcelizer) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            nInvokeClosureCreate ninvokeclosurecreate = this.MediaBrowserCompat$MediaItem;
            Animator animator = ninvokeclosurecreate.MediaBrowserCompat$ItemReceiver;
            if (animator != null) {
                animator.cancel();
            }
            ninvokeclosurecreate.RatingCompat = charSequence;
            ninvokeclosurecreate.MediaMetadataCompat.setText(charSequence);
            if (ninvokeclosurecreate.MediaBrowserCompat$CustomActionResultReceiver != 1) {
                ninvokeclosurecreate.read = 1;
            }
            ninvokeclosurecreate.write(ninvokeclosurecreate.MediaBrowserCompat$CustomActionResultReceiver, ninvokeclosurecreate.read, ninvokeclosurecreate.MediaBrowserCompat$CustomActionResultReceiver(ninvokeclosurecreate.MediaMetadataCompat, charSequence));
            return;
        }
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer();
    }

    public void setCounterEnabled(boolean z) {
        if (this.write != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.MediaBrowserCompat$ItemReceiver = appCompatTextView;
                appCompatTextView.setId(nAllocationSetSurface.MediaDescriptionCompat.textinput_counter);
                Typeface typeface = this.setSubtitle;
                if (typeface != null) {
                    this.MediaBrowserCompat$ItemReceiver.setTypeface(typeface);
                }
                this.MediaBrowserCompat$ItemReceiver.setMaxLines(1);
                write(this.MediaBrowserCompat$ItemReceiver, this.setCheckable);
                this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, 2);
                EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (editText == null) {
                    write(0);
                } else {
                    write(editText.getText().length());
                }
            } else {
                this.MediaBrowserCompat$MediaItem.read(this.MediaBrowserCompat$ItemReceiver, 2);
                this.MediaBrowserCompat$ItemReceiver = null;
            }
            this.write = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.setExpandedFormat != i) {
            if (i > 0) {
                this.setExpandedFormat = i;
            } else {
                this.setExpandedFormat = -1;
            }
            if (this.write) {
                EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver;
                write(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setEnabled(boolean z) {
        MediaBrowserCompat$CustomActionResultReceiver(this, z);
        super.setEnabled(z);
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) childAt, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(int i) {
        boolean z = this.read;
        if (this.setExpandedFormat == -1) {
            this.MediaBrowserCompat$ItemReceiver.setText(String.valueOf(i));
            this.MediaBrowserCompat$ItemReceiver.setContentDescription((CharSequence) null);
            this.read = false;
        } else {
            if (SwitchCompat.read(this.MediaBrowserCompat$ItemReceiver) == 1) {
                SwitchCompat.IconCompatParcelizer((View) this.MediaBrowserCompat$ItemReceiver, 0);
            }
            boolean z2 = i > this.setExpandedFormat;
            this.read = z2;
            if (z != z2) {
                write(this.MediaBrowserCompat$ItemReceiver, z2 ? this.ActionMenuItemView : this.setCheckable);
                if (this.read) {
                    SwitchCompat.IconCompatParcelizer((View) this.MediaBrowserCompat$ItemReceiver, 1);
                }
            }
            this.MediaBrowserCompat$ItemReceiver.setText(getContext().getString(nAllocationSetSurface.RatingCompat.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.setExpandedFormat)}));
            this.MediaBrowserCompat$ItemReceiver.setContentDescription(getContext().getString(nAllocationSetSurface.RatingCompat.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(this.setExpandedFormat)}));
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null && z != this.read) {
            MediaBrowserCompat$ItemReceiver(false, false);
            IconCompatParcelizer();
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    private void write(TextView textView, int i) {
        boolean z = true;
        try {
            setNavigationContentDescription.read(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            setNavigationContentDescription.read(textView, nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver.TextAppearance_AppCompat_Caption);
            textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), nAllocationSetSurface.write.design_error));
        }
    }

    private void MediaSessionCompat$ResultReceiverWrapper() {
        if (this.MediaSessionCompat$ResultReceiverWrapper != 0 && this.ParcelableVolumeInfo != null && this.MediaBrowserCompat$CustomActionResultReceiver != null && getRight() != 0) {
            int left = this.MediaBrowserCompat$CustomActionResultReceiver.getLeft();
            int RatingCompat2 = RatingCompat();
            int right = this.MediaBrowserCompat$CustomActionResultReceiver.getRight();
            int bottom = this.MediaBrowserCompat$CustomActionResultReceiver.getBottom() + this.f50x50fd9e4a;
            if (this.MediaSessionCompat$ResultReceiverWrapper == 2) {
                int i = this.AppCompatActivity / 2;
                left += i;
                RatingCompat2 -= i;
                right -= i;
                bottom += i;
            }
            this.ParcelableVolumeInfo.setBounds(left, RatingCompat2, right, bottom);
            write();
            ParcelableVolumeInfo();
        }
    }

    private int RatingCompat() {
        EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (editText == null) {
            return 0;
        }
        int i = this.MediaSessionCompat$ResultReceiverWrapper;
        if (i == 1) {
            return editText.getTop();
        }
        if (i != 2) {
            return 0;
        }
        return editText.getTop() + MediaMetadataCompat();
    }

    private int MediaMetadataCompat() {
        float f;
        if (!this.MediaDescriptionCompat) {
            return 0;
        }
        int i = this.MediaSessionCompat$ResultReceiverWrapper;
        if (i == 0 || i == 1) {
            f = this.IconCompatParcelizer.IconCompatParcelizer();
        } else if (i != 2) {
            return 0;
        } else {
            f = this.IconCompatParcelizer.IconCompatParcelizer() / 2.0f;
        }
        return (int) f;
    }

    private void ParcelableVolumeInfo() {
        Drawable background;
        EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (editText != null && (background = editText.getBackground()) != null) {
            if (setWindowTitle.IconCompatParcelizer(background)) {
                background = background.mutate();
            }
            Rect rect = new Rect();
            EditText editText2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            rect.set(0, 0, editText2.getWidth(), editText2.getHeight());
            Iterables.C35273.write.read((ViewGroup) this, (View) editText2, rect);
            Rect bounds = background.getBounds();
            if (bounds.left != bounds.right) {
                Rect rect2 = new Rect();
                background.getPadding(rect2);
                background.setBounds(bounds.left - rect2.left, bounds.top, bounds.right + (rect2.right << 1), this.MediaBrowserCompat$CustomActionResultReceiver.getBottom());
            }
        }
    }

    private void write() {
        float[] fArr;
        int i;
        Drawable drawable;
        if (this.ParcelableVolumeInfo != null) {
            int i2 = this.MediaSessionCompat$ResultReceiverWrapper;
            if (i2 == 1) {
                this.AppCompatDialogFragment = 0;
            } else if (i2 == 2 && this.setPopupCallback == 0) {
                this.setPopupCallback = this.setPadding.getColorForState(getDrawableState(), this.setPadding.getDefaultColor());
            }
            EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (editText != null && this.MediaSessionCompat$ResultReceiverWrapper == 2) {
                if (editText.getBackground() != null) {
                    this.setIcon = this.MediaBrowserCompat$CustomActionResultReceiver.getBackground();
                }
                SwitchCompat.IconCompatParcelizer((View) this.MediaBrowserCompat$CustomActionResultReceiver, (Drawable) null);
            }
            EditText editText2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (!(editText2 == null || this.MediaSessionCompat$ResultReceiverWrapper != 1 || (drawable = this.setIcon) == null)) {
                SwitchCompat.IconCompatParcelizer((View) editText2, drawable);
            }
            int i3 = this.AppCompatDialogFragment;
            if (i3 >= 0 && (i = this.setContentView) != 0) {
                this.ParcelableVolumeInfo.setStroke(i3, i);
            }
            GradientDrawable gradientDrawable = this.ParcelableVolumeInfo;
            if (!(SwitchCompat.m3079x50fd9e4a(this) == 1)) {
                float f = this.setHasDecor;
                float f2 = this.AlertController$RecycleListView;
                float f3 = this.Keep;
                float f4 = this.PlaybackStateCompat;
                fArr = new float[]{f, f, f2, f2, f3, f3, f4, f4};
            } else {
                float f5 = this.AlertController$RecycleListView;
                float f6 = this.setHasDecor;
                float f7 = this.PlaybackStateCompat;
                float f8 = this.Keep;
                fArr = new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
            }
            gradientDrawable.setCornerRadii(fArr);
            this.ParcelableVolumeInfo.setColor(this.MediaSessionCompat$QueueItem);
            invalidate();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Drawable background;
        TextView textView;
        EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (editText != null && (background = editText.getBackground()) != null) {
            MediaBrowserCompat$MediaItem();
            if (setWindowTitle.IconCompatParcelizer(background)) {
                background = background.mutate();
            }
            if (this.MediaBrowserCompat$MediaItem.read()) {
                TextView textView2 = this.MediaBrowserCompat$MediaItem.MediaMetadataCompat;
                background.setColorFilter(ActionBarOverlayLayout.MediaBrowserCompat$ItemReceiver(textView2 != null ? textView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
            } else if (!this.read || (textView = this.MediaBrowserCompat$ItemReceiver) == null) {
                setBaselineAligned.IconCompatParcelizer(background);
                this.MediaBrowserCompat$CustomActionResultReceiver.refreshDrawableState();
            } else {
                background.setColorFilter(ActionBarOverlayLayout.MediaBrowserCompat$ItemReceiver(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    private void MediaBrowserCompat$MediaItem() {
        Drawable background;
        int i = Build.VERSION.SDK_INT;
        if ((i == 21 || i == 22) && (background = this.MediaBrowserCompat$CustomActionResultReceiver.getBackground()) != null && !this.setForceShowIcon) {
            Drawable newDrawable = background.getConstantState().newDrawable();
            if (background instanceof DrawableContainer) {
                this.setForceShowIcon = AlertController$RecycleListView.write((DrawableContainer) background, newDrawable.getConstantState());
            }
            if (!this.setForceShowIcon) {
                SwitchCompat.IconCompatParcelizer((View) this.MediaBrowserCompat$CustomActionResultReceiver, newDrawable);
                this.setForceShowIcon = true;
                MediaBrowserCompat$ItemReceiver();
                if (this.MediaSessionCompat$ResultReceiverWrapper != 0) {
                    MediaSessionCompat$Token();
                }
                MediaSessionCompat$ResultReceiverWrapper();
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        CharSequence charSequence;
        TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver textInputLayout$MediaBrowserCompat$CustomActionResultReceiver = new TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver(super.onSaveInstanceState());
        if (this.MediaBrowserCompat$MediaItem.read()) {
            if (this.MediaBrowserCompat$MediaItem.IconCompatParcelizer) {
                charSequence = this.MediaBrowserCompat$MediaItem.RatingCompat;
            } else {
                charSequence = null;
            }
            textInputLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = charSequence;
        }
        textInputLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = this.ActionBarContextView;
        return textInputLayout$MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver textInputLayout$MediaBrowserCompat$CustomActionResultReceiver = (TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver) parcelable;
        super.onRestoreInstanceState(textInputLayout$MediaBrowserCompat$CustomActionResultReceiver.write);
        setError(textInputLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
        if (textInputLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) {
            read(true);
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.RatingCompat = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.RatingCompat = false;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.ExpandedMenuView = z;
    }

    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.ParcelableVolumeInfo;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.MediaDescriptionCompat) {
            this.IconCompatParcelizer.write(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m80x50fd9e4a();
        super.onMeasure(i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc  */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m80x50fd9e4a() {
        /*
            r7 = this;
            android.widget.EditText r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r1 = r7.setStackedBackground
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x0017
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto L_0x0017
            r0 = r2
            goto L_0x0018
        L_0x0017:
            r0 = r3
        L_0x0018:
            if (r0 != 0) goto L_0x001e
            boolean r0 = r7.ActionBarContextView
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = r2
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            r1 = 3
            r4 = 2
            if (r0 == 0) goto L_0x00cc
            com.google.android.material.internal.CheckableImageButton r0 = r7.setTransitioning
            if (r0 != 0) goto L_0x005a
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r5 = p040o.nAllocationSetSurface$MediaBrowserCompat$MediaItem.design_text_input_password_icon
            android.widget.FrameLayout r6 = r7.setVisibility
            android.view.View r0 = r0.inflate(r5, r6, r3)
            com.google.android.material.internal.CheckableImageButton r0 = (com.google.android.material.internal.CheckableImageButton) r0
            r7.setTransitioning = r0
            android.graphics.drawable.Drawable r5 = r7.ActionBarContainer
            r0.setImageDrawable(r5)
            com.google.android.material.internal.CheckableImageButton r0 = r7.setTransitioning
            java.lang.CharSequence r5 = r7.AbsActionBarView
            r0.setContentDescription(r5)
            android.widget.FrameLayout r0 = r7.setVisibility
            com.google.android.material.internal.CheckableImageButton r5 = r7.setTransitioning
            r0.addView(r5)
            com.google.android.material.internal.CheckableImageButton r0 = r7.setTransitioning
            com.google.android.material.textfield.TextInputLayout$5 r5 = new com.google.android.material.textfield.TextInputLayout$5
            r5.<init>()
            r0.setOnClickListener(r5)
        L_0x005a:
            android.widget.EditText r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x006f
            int r0 = p040o.SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(r0)
            if (r0 > 0) goto L_0x006f
            android.widget.EditText r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
            com.google.android.material.internal.CheckableImageButton r5 = r7.setTransitioning
            int r5 = p040o.SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(r5)
            r0.setMinimumHeight(r5)
        L_0x006f:
            com.google.android.material.internal.CheckableImageButton r0 = r7.setTransitioning
            r0.setVisibility(r3)
            com.google.android.material.internal.CheckableImageButton r0 = r7.setTransitioning
            boolean r5 = r7.ActionBarContextView
            r0.setChecked(r5)
            android.graphics.drawable.Drawable r0 = r7.setPrimaryBackground
            if (r0 != 0) goto L_0x0086
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r7.setPrimaryBackground = r0
        L_0x0086:
            android.graphics.drawable.Drawable r0 = r7.setPrimaryBackground
            com.google.android.material.internal.CheckableImageButton r5 = r7.setTransitioning
            int r5 = r5.getMeasuredWidth()
            r0.setBounds(r3, r3, r5, r2)
            android.widget.EditText r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
            android.graphics.drawable.Drawable[] r0 = p040o.setNavigationContentDescription.IconCompatParcelizer(r0)
            r5 = r0[r4]
            android.graphics.drawable.Drawable r6 = r7.setPrimaryBackground
            if (r5 == r6) goto L_0x00a1
            r4 = r0[r4]
            r7.setContentHeight = r4
        L_0x00a1:
            android.widget.EditText r4 = r7.MediaBrowserCompat$CustomActionResultReceiver
            r3 = r0[r3]
            r2 = r0[r2]
            android.graphics.drawable.Drawable r5 = r7.setPrimaryBackground
            r0 = r0[r1]
            p040o.setNavigationContentDescription.IconCompatParcelizer(r4, r3, r2, r5, r0)
            com.google.android.material.internal.CheckableImageButton r0 = r7.setTransitioning
            android.widget.EditText r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r1.getPaddingLeft()
            android.widget.EditText r2 = r7.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = r2.getPaddingTop()
            android.widget.EditText r3 = r7.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r3.getPaddingRight()
            android.widget.EditText r4 = r7.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r4.getPaddingBottom()
            r0.setPadding(r1, r2, r3, r4)
            return
        L_0x00cc:
            com.google.android.material.internal.CheckableImageButton r0 = r7.setTransitioning
            if (r0 == 0) goto L_0x00dd
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00dd
            com.google.android.material.internal.CheckableImageButton r0 = r7.setTransitioning
            r5 = 8
            r0.setVisibility(r5)
        L_0x00dd:
            android.graphics.drawable.Drawable r0 = r7.setPrimaryBackground
            if (r0 == 0) goto L_0x00fd
            android.widget.EditText r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
            android.graphics.drawable.Drawable[] r0 = p040o.setNavigationContentDescription.IconCompatParcelizer(r0)
            r4 = r0[r4]
            android.graphics.drawable.Drawable r5 = r7.setPrimaryBackground
            if (r4 != r5) goto L_0x00fd
            android.widget.EditText r4 = r7.MediaBrowserCompat$CustomActionResultReceiver
            r3 = r0[r3]
            r2 = r0[r2]
            android.graphics.drawable.Drawable r5 = r7.setContentHeight
            r0 = r0[r1]
            p040o.setNavigationContentDescription.IconCompatParcelizer(r4, r3, r2, r5, r0)
            r0 = 0
            r7.setPrimaryBackground = r0
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m80x50fd9e4a():void");
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.ActionBarContainer = drawable;
        CheckableImageButton checkableImageButton = this.setTransitioning;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.AbsActionBarView = charSequence;
        CheckableImageButton checkableImageButton = this.setTransitioning;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        EditText editText;
        if (this.setStackedBackground != z) {
            this.setStackedBackground = z;
            if (!z && this.ActionBarContextView && (editText = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.ActionBarContextView = false;
            m80x50fd9e4a();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.setSplitBackground = colorStateList;
        this.setItemInvoker = true;
        read();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.setTabContainer = mode;
        this.ListMenuItemView = true;
        read();
    }

    public final void read(boolean z) {
        if (this.setStackedBackground) {
            int selectionEnd = this.MediaBrowserCompat$CustomActionResultReceiver.getSelectionEnd();
            EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                this.MediaBrowserCompat$CustomActionResultReceiver.setTransformationMethod((TransformationMethod) null);
                this.ActionBarContextView = true;
            } else {
                this.MediaBrowserCompat$CustomActionResultReceiver.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.ActionBarContextView = false;
            }
            this.setTransitioning.setChecked(this.ActionBarContextView);
            if (z) {
                this.setTransitioning.jumpDrawablesToCurrentState();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.setSelection(selectionEnd);
        }
    }

    public void setTextInputAccessibilityDelegate(read read2) {
        EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (editText != null) {
            SwitchCompat.read((View) editText, (setIconifiedByDefault) read2);
        }
    }

    private void read() {
        Drawable drawable;
        if (this.ActionBarContainer == null) {
            return;
        }
        if (this.setItemInvoker || this.ListMenuItemView) {
            Drawable mutate = setBaselineAligned.MediaBrowserCompat$MediaItem(this.ActionBarContainer).mutate();
            this.ActionBarContainer = mutate;
            if (this.setItemInvoker) {
                setBaselineAligned.read(mutate, this.setSplitBackground);
            }
            if (this.ListMenuItemView) {
                setBaselineAligned.IconCompatParcelizer(this.ActionBarContainer, this.setTabContainer);
            }
            CheckableImageButton checkableImageButton = this.setTransitioning;
            if (checkableImageButton != null && checkableImageButton.getDrawable() != (drawable = this.ActionBarContainer)) {
                this.setTransitioning.setImageDrawable(drawable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EditText editText;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.ParcelableVolumeInfo != null) {
            MediaSessionCompat$ResultReceiverWrapper();
        }
        if (this.MediaDescriptionCompat && (editText = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            Rect rect = this.setCustomView;
            rect.set(0, 0, editText.getWidth(), editText.getHeight());
            Iterables.C35273.write.read((ViewGroup) this, (View) editText, rect);
            int compoundPaddingLeft = rect.left + this.MediaBrowserCompat$CustomActionResultReceiver.getCompoundPaddingLeft();
            int compoundPaddingRight = rect.right - this.MediaBrowserCompat$CustomActionResultReceiver.getCompoundPaddingRight();
            int i6 = this.MediaSessionCompat$ResultReceiverWrapper;
            if (i6 != 1) {
                if (i6 != 2) {
                    i5 = getPaddingTop();
                } else if (i6 == 1 || i6 == 2) {
                    i5 = this.ParcelableVolumeInfo.getBounds().top - MediaMetadataCompat();
                } else {
                    throw new IllegalStateException();
                }
            } else if (i6 == 1 || i6 == 2) {
                i5 = this.ParcelableVolumeInfo.getBounds().top + this.PlaybackStateCompat$CustomAction;
            } else {
                throw new IllegalStateException();
            }
            this.IconCompatParcelizer.IconCompatParcelizer(compoundPaddingLeft, rect.top + this.MediaBrowserCompat$CustomActionResultReceiver.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.MediaBrowserCompat$CustomActionResultReceiver.getCompoundPaddingBottom());
            this.IconCompatParcelizer.write(compoundPaddingLeft, i5, compoundPaddingRight, (i4 - i2) - getPaddingBottom());
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$SearchResultReceiver() && !this.setTitle) {
                MediaDescriptionCompat();
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(boolean z) {
        ValueAnimator valueAnimator = this.MediaSessionCompat$Token;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.MediaSessionCompat$Token.cancel();
        }
        if (!z || !this.ExpandedMenuView) {
            this.IconCompatParcelizer.write(1.0f);
        } else {
            MediaBrowserCompat$CustomActionResultReceiver(1.0f);
        }
        this.setTitle = false;
        if (MediaBrowserCompat$SearchResultReceiver()) {
            MediaDescriptionCompat();
        }
    }

    private boolean MediaBrowserCompat$SearchResultReceiver() {
        return this.MediaDescriptionCompat && !TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver) && (this.ParcelableVolumeInfo instanceof nIncTypeCreate);
    }

    private void MediaDescriptionCompat() {
        if (MediaBrowserCompat$SearchResultReceiver()) {
            RectF rectF = this.setTitleOptional;
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(rectF);
            write(rectF);
            ((nIncTypeCreate) this.ParcelableVolumeInfo).IconCompatParcelizer(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    private void write(RectF rectF) {
        rectF.left -= (float) this.setBackgroundResource;
        rectF.top -= (float) this.setBackgroundResource;
        rectF.right += (float) this.setBackgroundResource;
        rectF.bottom += (float) this.setBackgroundResource;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.MenuItemImpl
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.MenuItemImpl = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            boolean r2 = p040o.SwitchCompat.setCheckable(r4)
            r3 = 0
            if (r2 == 0) goto L_0x001f
            boolean r2 = r4.isEnabled()
            if (r2 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r2 = r0
            goto L_0x0020
        L_0x001f:
            r2 = r3
        L_0x0020:
            r4.MediaBrowserCompat$ItemReceiver(r2, r3)
            r4.MediaBrowserCompat$CustomActionResultReceiver()
            r4.MediaSessionCompat$ResultReceiverWrapper()
            r4.IconCompatParcelizer()
            o.FragmentBuilder_BindOnboardingSelectAccountFragment r2 = r4.IconCompatParcelizer
            if (r2 == 0) goto L_0x003c
            r2.RatingCompat = r1
            boolean r1 = r2.MediaBrowserCompat$CustomActionResultReceiver()
            if (r1 == 0) goto L_0x003c
            r2.MediaBrowserCompat$ItemReceiver()
            goto L_0x003d
        L_0x003c:
            r0 = r3
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r4.invalidate()
        L_0x0042:
            r4.MenuItemImpl = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final void IconCompatParcelizer() {
        TextView textView;
        if (this.ParcelableVolumeInfo != null && this.MediaSessionCompat$ResultReceiverWrapper != 0) {
            EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver;
            boolean z = false;
            boolean z2 = editText != null && editText.hasFocus();
            EditText editText2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (editText2 != null && editText2.isHovered()) {
                z = true;
            }
            if (this.MediaSessionCompat$ResultReceiverWrapper == 2) {
                if (!isEnabled()) {
                    this.setContentView = this.setShortcut;
                } else if (this.MediaBrowserCompat$MediaItem.read()) {
                    TextView textView2 = this.MediaBrowserCompat$MediaItem.MediaMetadataCompat;
                    this.setContentView = textView2 != null ? textView2.getCurrentTextColor() : -1;
                } else if (this.read && (textView = this.MediaBrowserCompat$ItemReceiver) != null) {
                    this.setContentView = textView.getCurrentTextColor();
                } else if (z2) {
                    this.setContentView = this.setPopupCallback;
                } else if (z) {
                    this.setContentView = this.setGroupDividerEnabled;
                } else {
                    this.setContentView = this.setChecked;
                }
                if ((z || z2) && isEnabled()) {
                    this.AppCompatDialogFragment = this.AppCompatActivity;
                } else {
                    this.AppCompatDialogFragment = this.AppCompatDelegateImpl$ListMenuDecorView;
                }
                write();
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        ValueAnimator valueAnimator = this.MediaSessionCompat$Token;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.MediaSessionCompat$Token.cancel();
        }
        if (!z || !this.ExpandedMenuView) {
            this.IconCompatParcelizer.write((float) BitmapDescriptorFactory.HUE_RED);
        } else {
            MediaBrowserCompat$CustomActionResultReceiver((float) BitmapDescriptorFactory.HUE_RED);
        }
        if (MediaBrowserCompat$SearchResultReceiver() && (!((nIncTypeCreate) this.ParcelableVolumeInfo).MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) && MediaBrowserCompat$SearchResultReceiver()) {
            ((nIncTypeCreate) this.ParcelableVolumeInfo).IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        this.setTitle = true;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(float f) {
        if (this.IconCompatParcelizer.IconCompatParcelizer != f) {
            if (this.MediaSessionCompat$Token == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.MediaSessionCompat$Token = valueAnimator;
                valueAnimator.setInterpolator(zzlz.read);
                this.MediaSessionCompat$Token.setDuration(167);
                this.MediaSessionCompat$Token.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TextInputLayout.this.IconCompatParcelizer.write(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
            }
            this.MediaSessionCompat$Token.setFloatValues(new float[]{this.IconCompatParcelizer.IconCompatParcelizer, f});
            this.MediaSessionCompat$Token.start();
        }
    }

    public static class read extends setIconifiedByDefault {
        private final TextInputLayout write;

        public read(TextInputLayout textInputLayout) {
            this.write = textInputLayout;
        }

        public void IconCompatParcelizer(View view, setTextOn settexton) {
            CharSequence charSequence;
            TextView textView;
            super.IconCompatParcelizer(view, settexton);
            EditText editText = this.write.MediaBrowserCompat$CustomActionResultReceiver;
            CharSequence charSequence2 = null;
            Editable text = editText != null ? editText.getText() : null;
            TextInputLayout textInputLayout = this.write;
            CharSequence charSequence3 = textInputLayout.MediaDescriptionCompat ? textInputLayout.MediaBrowserCompat$SearchResultReceiver : null;
            TextInputLayout textInputLayout2 = this.write;
            if (textInputLayout2.MediaBrowserCompat$MediaItem.IconCompatParcelizer) {
                charSequence = textInputLayout2.MediaBrowserCompat$MediaItem.RatingCompat;
            } else {
                charSequence = null;
            }
            TextInputLayout textInputLayout3 = this.write;
            if (textInputLayout3.write && textInputLayout3.read && (textView = textInputLayout3.MediaBrowserCompat$ItemReceiver) != null) {
                charSequence2 = textView.getContentDescription();
            }
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(charSequence3);
            boolean z3 = !TextUtils.isEmpty(charSequence);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(charSequence2);
            if (z) {
                settexton.MediaBrowserCompat$SearchResultReceiver((CharSequence) text);
            } else if (z2) {
                settexton.MediaBrowserCompat$SearchResultReceiver(charSequence3);
            }
            if (z2) {
                settexton.IconCompatParcelizer(charSequence3);
                if (!z && z2) {
                    z4 = true;
                }
                settexton.MediaSessionCompat$Token(z4);
            }
            if (z5) {
                if (!z3) {
                    charSequence = charSequence2;
                }
                settexton.MediaBrowserCompat$ItemReceiver(charSequence);
                settexton.MediaDescriptionCompat(true);
            }
        }

        public void write(View view, AccessibilityEvent accessibilityEvent) {
            super.write(view, accessibilityEvent);
            EditText editText = this.write.MediaBrowserCompat$CustomActionResultReceiver;
            CharSequence charSequence = null;
            CharSequence text = editText != null ? editText.getText() : null;
            if (TextUtils.isEmpty(text)) {
                TextInputLayout textInputLayout = this.write;
                if (textInputLayout.MediaDescriptionCompat) {
                    charSequence = textInputLayout.MediaBrowserCompat$SearchResultReceiver;
                }
                text = charSequence;
            }
            if (!TextUtils.isEmpty(text)) {
                accessibilityEvent.getText().add(text);
            }
        }
    }
}
