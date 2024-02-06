package com.scb.phone.view.custom.hml;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomEditText;
import p040o.onGetStartedClick;

public final class CustomDecimalAmountVerification extends LinearLayout {
    @BindView
    public LinearLayout container;
    @BindView
    public CustomEditText editText;
    /* access modifiers changed from: private */
    public IconCompatParcelizer read;

    public interface IconCompatParcelizer {
        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(String str, boolean z);

        void read(boolean z);
    }

    public final void setContainer(LinearLayout linearLayout) {
        onGetStartedClick.write((Object) linearLayout, "<set-?>");
        this.container = linearLayout;
    }

    public final void setEditText(CustomEditText customEditText) {
        onGetStartedClick.write((Object) customEditText, "<set-?>");
        this.editText = customEditText;
    }

    public CustomDecimalAmountVerification(Context context) {
        super(context);
        MediaBrowserCompat$ItemReceiver();
    }

    public CustomDecimalAmountVerification(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MediaBrowserCompat$ItemReceiver();
    }

    public CustomDecimalAmountVerification(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MediaBrowserCompat$ItemReceiver();
    }

    private final void MediaBrowserCompat$ItemReceiver() {
        LayoutInflater.from(getContext()).inflate(R.layout.f81612131493387, this, true);
        ButterKnife.IconCompatParcelizer(this, this);
        IconCompatParcelizer();
    }

    private final void IconCompatParcelizer() {
        CustomEditText customEditText = this.editText;
        if (customEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editText");
        }
        customEditText.setLongClickable(false);
        CustomEditText customEditText2 = this.editText;
        if (customEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editText");
        }
        customEditText2.setTextIsSelectable(true);
        CustomEditText customEditText3 = this.editText;
        if (customEditText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editText");
        }
        customEditText3.setFocusable(true);
        CustomEditText customEditText4 = this.editText;
        if (customEditText4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editText");
        }
        customEditText4.setImeOptions(6);
        CustomEditText customEditText5 = this.editText;
        if (customEditText5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editText");
        }
        customEditText5.setOnKeyListener(new read(this));
        CustomEditText customEditText6 = this.editText;
        if (customEditText6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editText");
        }
        customEditText6.setOnEditorActionListener(new C8947xec732080(this));
        CustomEditText customEditText7 = this.editText;
        if (customEditText7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editText");
        }
        customEditText7.addTextChangedListener(new CustomDecimalAmountVerification$MediaBrowserCompat$ItemReceiver(this));
        CustomEditText customEditText8 = this.editText;
        if (customEditText8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editText");
        }
        customEditText8.setOnFocusChangeListener(new write(this));
    }

    static final class read implements View.OnKeyListener {
        private /* synthetic */ CustomDecimalAmountVerification write;

        read(CustomDecimalAmountVerification customDecimalAmountVerification) {
            this.write = customDecimalAmountVerification;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            IconCompatParcelizer IconCompatParcelizer;
            if (keyEvent == null || keyEvent.getAction() != 1) {
                return false;
            }
            if ((keyEvent.getKeyCode() != 16 && keyEvent.getKeyCode() != 4) || (IconCompatParcelizer = this.write.read) == null) {
                return false;
            }
            IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            return false;
        }
    }

    static final class write implements View.OnFocusChangeListener {
        private /* synthetic */ CustomDecimalAmountVerification write;

        write(CustomDecimalAmountVerification customDecimalAmountVerification) {
            this.write = customDecimalAmountVerification;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                IconCompatParcelizer IconCompatParcelizer = this.write.read;
                if (IconCompatParcelizer != null) {
                    IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
                    return;
                }
                return;
            }
            IconCompatParcelizer IconCompatParcelizer2 = this.write.read;
            if (IconCompatParcelizer2 != null) {
                CustomEditText customEditText = this.write.editText;
                if (customEditText == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("editText");
                }
                IconCompatParcelizer2.read(String.valueOf(customEditText.getText()).length() == 2);
            }
        }
    }

    public final void setInputCodeListener(IconCompatParcelizer iconCompatParcelizer) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "l");
        this.read = iconCompatParcelizer;
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            LinearLayout linearLayout = this.container;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
            }
            linearLayout.setBackgroundResource(R.drawable.bg_error_line_rounded_corners);
            return;
        }
        LinearLayout linearLayout2 = this.container;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
        }
        linearLayout2.setBackgroundResource(R.drawable.bg_lightgray_line_rounded_corners);
    }
}
