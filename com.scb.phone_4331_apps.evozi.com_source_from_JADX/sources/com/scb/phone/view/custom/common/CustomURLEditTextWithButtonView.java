package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class CustomURLEditTextWithButtonView extends LinearLayout {
    @BindView
    public ImageView clearButtonImageView;
    @BindView
    public LinearLayout componentBaseLinearLayout;
    @BindView
    public ImageView deleteUrlImageView;
    @BindView
    public Button previewBt;
    @BindView
    public TextView urlErrorMsgTv;
    @BindView
    public EditText urlEt;
    @BindView
    public TextView urlTitle;

    public CustomURLEditTextWithButtonView(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public CustomURLEditTextWithButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomURLEditTextWithButtonView(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomURLEditTextWithButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        boolean z = true;
        LayoutInflater.from(context).inflate(R.layout.f92022131494429, this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomURLEditTextWithButtonView, 0, 0);
            String string = obtainStyledAttributes.getString(3);
            String string2 = obtainStyledAttributes.getString(1);
            String string3 = obtainStyledAttributes.getString(0);
            string3 = string3 == null ? context.getString(R.string.hml_business_url_info_preview_btn) : string3;
            onGetStartedClick.IconCompatParcelizer((Object) string3, "a.getString(R.styleable.…ess_url_info_preview_btn)");
            String string4 = obtainStyledAttributes.getString(2);
            String string5 = obtainStyledAttributes.getString(4);
            string5 = string5 == null ? context.getString(R.string.hml_business_url_info_url_invalid_error) : string5;
            onGetStartedClick.IconCompatParcelizer((Object) string5, "a.getString(R.styleable.…l_info_url_invalid_error)");
            obtainStyledAttributes.recycle();
            if (string != null) {
                CharSequence charSequence = string;
                if (charSequence.length() > 0) {
                    TextView textView = this.urlTitle;
                    if (textView == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlTitle");
                    }
                    textView.setText(charSequence);
                }
            }
            if (string2 != null) {
                CharSequence charSequence2 = string2;
                if (charSequence2.length() > 0) {
                    EditText editText = this.urlEt;
                    if (editText == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
                    }
                    editText.setHint(charSequence2);
                }
            }
            if (string4 != null) {
                CharSequence charSequence3 = string4;
                if (charSequence3.length() > 0) {
                    EditText editText2 = this.urlEt;
                    if (editText2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
                    }
                    editText2.setText(charSequence3);
                }
            }
            if (string3 != null) {
                CharSequence charSequence4 = string3;
                if (charSequence4.length() > 0) {
                    Button button = this.previewBt;
                    if (button == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("previewBt");
                    }
                    button.setText(charSequence4);
                }
            }
            if (string5 != null) {
                CharSequence charSequence5 = string5;
                if (charSequence5.length() <= 0 ? false : z) {
                    TextView textView2 = this.urlErrorMsgTv;
                    if (textView2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlErrorMsgTv");
                    }
                    textView2.setText(charSequence5);
                }
            }
        }
        Button button2 = this.previewBt;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("previewBt");
        }
        button2.setOnClickListener(new View.OnClickListener(this) {
            private /* synthetic */ CustomURLEditTextWithButtonView MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final void onClick(View view) {
                this.MediaBrowserCompat$ItemReceiver.write(false);
            }
        });
        ImageView imageView = this.clearButtonImageView;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clearButtonImageView");
        }
        imageView.setOnClickListener(new View.OnClickListener(this) {
            private /* synthetic */ CustomURLEditTextWithButtonView read;

            {
                this.read = r1;
            }

            public final void onClick(View view) {
                EditText editText = this.read.urlEt;
                if (editText == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
                }
                editText.setText("");
            }
        });
        EditText editText3 = this.urlEt;
        if (editText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
        }
        editText3.addTextChangedListener(new FragmentBuilder_BindCreditLimitDisplayFragment(this) {
            private /* synthetic */ CustomURLEditTextWithButtonView IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final void afterTextChanged(Editable editable) {
                onGetStartedClick.write((Object) editable, "editable");
                this.IconCompatParcelizer.IconCompatParcelizer(true);
            }
        });
    }

    public final void setComponentBaseLinearLayout(LinearLayout linearLayout) {
        onGetStartedClick.write((Object) linearLayout, "<set-?>");
        this.componentBaseLinearLayout = linearLayout;
    }

    public final void setUrlTitle(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.urlTitle = textView;
    }

    public final void setUrlEt(EditText editText) {
        onGetStartedClick.write((Object) editText, "<set-?>");
        this.urlEt = editText;
    }

    public final void setPreviewBt(Button button) {
        onGetStartedClick.write((Object) button, "<set-?>");
        this.previewBt = button;
    }

    public final void setUrlErrorMsgTv(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.urlErrorMsgTv = textView;
    }

    public final void setDeleteUrlImageView(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.deleteUrlImageView = imageView;
    }

    public final void setClearButtonImageView(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.clearButtonImageView = imageView;
    }

    public final void setUrlTitle(String str) {
        onGetStartedClick.write((Object) str, "text");
        TextView textView = this.urlTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlTitle");
        }
        textView.setText(str);
    }

    public final void setUrlEditText(String str) {
        onGetStartedClick.write((Object) str, "text");
        EditText editText = this.urlEt;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
        }
        editText.setText(str);
        ImageView imageView = this.clearButtonImageView;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clearButtonImageView");
        }
        View view = imageView;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(8);
    }

    public final void setUrlEditTextHint(String str) {
        onGetStartedClick.write((Object) str, "text");
        EditText editText = this.urlEt;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
        }
        editText.setHint(str);
    }

    public final void setButtonText(String str) {
        onGetStartedClick.write((Object) str, "text");
        Button button = this.previewBt;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("previewBt");
        }
        button.setText(str);
    }

    public final void setButtonEnabled(boolean z) {
        Button button = this.previewBt;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("previewBt");
        }
        button.setEnabled(z);
    }

    public final void setErrorMessage(String str) {
        onGetStartedClick.write((Object) str, "text");
        TextView textView = this.urlErrorMsgTv;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlErrorMsgTv");
        }
        textView.setText(str);
    }

    public final void write(boolean z) {
        TextView textView = this.urlErrorMsgTv;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlErrorMsgTv");
        }
        textView.setVisibility(z ? 8 : 0);
        int i = z ? R.drawable.shape_gray_rounded_rectangle : R.drawable.shape_red_reounded_reactangle_border;
        EditText editText = this.urlEt;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
        }
        editText.setBackground(setLastBaselineToBottomHeight.write(getContext(), i));
        if (z) {
            EditText editText2 = this.urlEt;
            if (editText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
            }
            editText2.setTextColor(-16777216);
        } else {
            EditText editText3 = this.urlEt;
            if (editText3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
            }
            editText3.setTextColor(setLastBaselineToBottomHeight.IconCompatParcelizer(getContext(), R.color.f67152131099871));
        }
        setButtonEnabled(z);
        requestLayout();
        invalidate();
    }

    public final void read(View.OnFocusChangeListener onFocusChangeListener) {
        onGetStartedClick.write((Object) onFocusChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        EditText editText = this.urlEt;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
        }
        editText.setOnFocusChangeListener(onFocusChangeListener);
        LinearLayout linearLayout = this.componentBaseLinearLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("componentBaseLinearLayout");
        }
        linearLayout.setOnClickListener(new IconCompatParcelizer(this));
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ CustomURLEditTextWithButtonView read;

        IconCompatParcelizer(CustomURLEditTextWithButtonView customURLEditTextWithButtonView) {
            this.read = customURLEditTextWithButtonView;
        }

        public final void onClick(View view) {
            TextView textView = this.read.urlTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlTitle");
            }
            View view2 = textView;
            onGetStartedClick.write((Object) view2, "$this$clearInputFocus");
            view2.setFocusable(true);
            view2.setFocusableInTouchMode(true);
            view2.requestFocus();
            TextView textView2 = this.read.urlTitle;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlTitle");
            }
            View view3 = textView2;
            if (view3 != null) {
                ((InputMethodManager) view3.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view3.getWindowToken(), 0);
            }
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        ImageView imageView = this.clearButtonImageView;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("clearButtonImageView");
        }
        View view = imageView;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
    }
}
