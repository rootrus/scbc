package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;

public class NoteEditTextWithButton extends NoteEditText {
    @BindView
    Button buttonDone;
    private IconCompatParcelizer read;

    public interface IconCompatParcelizer {
        void IconCompatParcelizer();
    }

    /* access modifiers changed from: protected */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return R.layout.f80662131493291;
    }

    public NoteEditTextWithButton(Context context) {
        super(context);
    }

    public NoteEditTextWithButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoteEditTextWithButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setDoneButtonText(String str) {
        this.buttonDone.setText(str);
    }

    public void setDoneButtonEnable(boolean z) {
        this.buttonDone.setEnabled(z);
    }

    public void setOnDoneButtonListener(IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    @OnClick
    public void onDoneButtonClick(View view) {
        this.read.IconCompatParcelizer();
    }
}
