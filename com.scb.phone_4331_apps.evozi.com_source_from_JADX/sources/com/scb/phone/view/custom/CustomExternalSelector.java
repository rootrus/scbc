package com.scb.phone.view.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import kotlin.TypeCastException;
import org.bouncycastle.i18n.MessageBundle;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class CustomExternalSelector extends LinearLayout {
    private Integer MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public View container;
    @BindView
    public TextView iconArrow;
    @BindView
    public TextView labelTitle;
    @BindView
    public TextView mErrorTextView;
    private Integer read;
    @BindView
    public TextView selectedTextView;

    public final void setLabelTitle(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.labelTitle = textView;
    }

    public final void setSelectedTextView(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.selectedTextView = textView;
    }

    public final void setIconArrow(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.iconArrow = textView;
    }

    public final void setContainer(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.container = view;
    }

    public final void setMErrorTextView(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.mErrorTextView = textView;
    }

    public final void setFilledIconRes(Integer num) {
        this.read = num;
    }

    public final void setEmptyIconRes(Integer num) {
        this.MediaBrowserCompat$CustomActionResultReceiver = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomExternalSelector(Context context) {
        this(context, (AttributeSet) null);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomExternalSelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomExternalSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        onGetStartedClick.write((Object) context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f81922131493418, this, true);
            ButterKnife.IconCompatParcelizer(this);
            if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomExternalSelector, 0, 0)) != null) {
                String string = obtainStyledAttributes.getString(2);
                String string2 = obtainStyledAttributes.getString(0);
                int resourceId = obtainStyledAttributes.getResourceId(1, R.drawable.ic_expand_more_black_24dp_right);
                set$default(this, string, string2, (String) null, Integer.valueOf(resourceId), obtainStyledAttributes.getBoolean(3, true), 4, (Object) null);
                obtainStyledAttributes.recycle();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setErrorText(String str) {
        onGetStartedClick.write((Object) str, "error");
        TextView textView = this.mErrorTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mErrorTextView");
        }
        textView.setText(str);
    }

    public final void setTitle(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        TextView textView = this.labelTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("labelTitle");
        }
        textView.setText(str);
    }

    public final void setHint(String str) {
        onGetStartedClick.write((Object) str, "hint");
        TextView textView = this.selectedTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectedTextView");
        }
        textView.setHint(str);
    }

    public static /* synthetic */ void set$default(CustomExternalSelector customExternalSelector, String str, String str2, String str3, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        customExternalSelector.set(str, str2, str3, num, z);
    }

    public final void set(String str, String str2, String str3, Integer num, boolean z) {
        if (str != null) {
            TextView textView = this.labelTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("labelTitle");
            }
            textView.setText(str);
        }
        if (str2 != null) {
            TextView textView2 = this.selectedTextView;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectedTextView");
            }
            textView2.setHint(str2);
        }
        if (!(num == null || getContext() == null)) {
            TextView textView3 = this.iconArrow;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("iconArrow");
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(setLastBaselineToBottomHeight.write(getContext(), num.intValue()), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (str3 != null) {
            TextView textView4 = this.selectedTextView;
            if (textView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectedTextView");
            }
            textView4.setText(str3);
        }
        TextView textView5 = this.labelTitle;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("labelTitle");
        }
        textView5.setVisibility(z ? 0 : 8);
    }

    public final void setSelected(String str) {
        TextView textView = this.selectedTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectedTextView");
        }
        textView.setText(str != null ? str : "");
        Integer num = str != null ? this.read : this.MediaBrowserCompat$CustomActionResultReceiver;
        if (num != null) {
            int intValue = num.intValue();
            if (getContext() != null) {
                TextView textView2 = this.iconArrow;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("iconArrow");
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(setLastBaselineToBottomHeight.write(getContext(), intValue), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    public static /* synthetic */ void setDynamicIcons$default(CustomExternalSelector customExternalSelector, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        customExternalSelector.setDynamicIcons(num, num2);
    }

    public final void setDynamicIcons(Integer num, Integer num2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = num;
        this.read = num2;
    }

    public final void read(boolean z) {
        if (z) {
            TextView textView = this.mErrorTextView;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mErrorTextView");
            }
            textView.setVisibility(0);
            View view = this.container;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
            }
            view.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
            return;
        }
        TextView textView2 = this.mErrorTextView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mErrorTextView");
        }
        textView2.setVisibility(8);
        View view2 = this.container;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
        }
        view2.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
    }
}
