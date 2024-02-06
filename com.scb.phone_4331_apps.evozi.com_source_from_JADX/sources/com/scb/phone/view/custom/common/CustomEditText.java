package com.scb.phone.view.custom.common;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.Arrays;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.setLastBaselineToBottomHeight;

public class CustomEditText extends AppCompatEditText {
    private write MediaBrowserCompat$ItemReceiver;
    private IconCompatParcelizer write;

    public interface IconCompatParcelizer {
        boolean IconCompatParcelizer(CustomEditText customEditText, String str);
    }

    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver();
    }

    public CustomEditText(Context context) {
        super(context);
    }

    public CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        write write2;
        if (i == 4 && keyEvent.getAction() == 1 && (write2 = this.MediaBrowserCompat$ItemReceiver) != null) {
            write2.MediaBrowserCompat$CustomActionResultReceiver();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setOnBackListener(write write2) {
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (!(this.write == null || primaryClip == null)) {
                return this.write.IconCompatParcelizer(this, primaryClip.getItemAt(0).coerceToText(getContext()).toString());
            }
        }
        return super.onTextContextMenuItem(i);
    }

    public void setOnPasteListener(IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public void setFilter(String str) {
        if (str != null) {
            FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment fragmentBuilder_BindEasycashFeaturesAccountDynamicFragment = new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment(str);
            if (getFilters() != null) {
                ArrayList arrayList = new ArrayList(Arrays.asList(getFilters()));
                arrayList.add(fragmentBuilder_BindEasycashFeaturesAccountDynamicFragment);
                setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
                return;
            }
            setFilters(new InputFilter[]{fragmentBuilder_BindEasycashFeaturesAccountDynamicFragment});
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
        } else {
            setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
        }
    }
}
