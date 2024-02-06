package com.scb.phone.view.custom.common;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ForgotPinService;
import p040o.faceStatus;
import p040o.setupNewPin;
import p040o.verifyMethod;
import p040o.verifyOtpResetPin;
import p040o.verifyProfileForgotPinByAtm;
import p040o.verifyProfileForgotPinByCreditCard;

public class CustomDialog extends Dialog {
    @BindView
    LinearLayout mButtonHorizontalLayout;
    @BindView
    LinearLayout mButtonVerticalLayout;
    @BindView
    public Button mNegativeButton;
    @BindView
    Button mNegativeButtonV;
    @BindView
    Button mNeutralButton;
    @BindView
    Button mNeutralButtonV;
    @BindView
    public Button mPositiveButton;
    @BindView
    Button mPositiveButtonV;
    @BindView
    public TextView mTextTextView;
    @BindView
    public TextView mTitleTextView;
    public Context read;

    private CustomDialog(Context context) {
        super(context, R.style.f95602131820775);
        this.read = context;
        requestWindowFeature(1);
        setContentView(R.layout.f81662131493392);
        ButterKnife.write((Dialog) this);
        this.mTitleTextView.setTypeface(Typeface.createFromAsset(this.read.getAssets(), "fonts/db_heavent_medium.ttf"));
        this.mTextTextView.setTypeface(Typeface.createFromAsset(this.read.getAssets(), "fonts/db_heavent_regular.ttf"));
    }

    public static CustomDialog IconCompatParcelizer(Context context) {
        return new CustomDialog(context);
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        onClickListener.onClick(dialogInterface, i);
    }

    public final CustomDialog MediaBrowserCompat$ItemReceiver(int i) {
        String string = this.read.getString(i);
        if (true ^ (string == null || string.length() == 0)) {
            this.mTitleTextView.setVisibility(0);
            this.mTitleTextView.setText(string);
        }
        return this;
    }

    public final CustomDialog IconCompatParcelizer(int i) {
        String string = this.read.getString(i);
        if (true ^ (string == null || string.length() == 0)) {
            this.mTextTextView.setVisibility(0);
            this.mTextTextView.setText(string);
        }
        return this;
    }

    public final CustomDialog IconCompatParcelizer(String str, DialogInterface.OnClickListener onClickListener) {
        if (!(str == null || onClickListener == null)) {
            this.mPositiveButton.setVisibility(0);
            this.mPositiveButton.setText(str);
            this.mPositiveButton.setOnClickListener(new verifyProfileForgotPinByCreditCard(this, onClickListener));
        }
        return this;
    }

    public final CustomDialog MediaBrowserCompat$ItemReceiver(String str, DialogInterface.OnClickListener onClickListener) {
        if (!(str == null || onClickListener == null)) {
            this.mNegativeButton.setVisibility(0);
            this.mNegativeButton.setText(str);
            this.mNegativeButton.setOnClickListener(new verifyOtpResetPin(this, onClickListener));
        }
        return this;
    }

    public final CustomDialog write(String str, DialogInterface.OnClickListener onClickListener) {
        if (!(str == null || onClickListener == null)) {
            this.mNeutralButton.setVisibility(0);
            this.mNeutralButton.setText(str);
            this.mNeutralButton.setOnClickListener(new faceStatus(this, onClickListener));
        }
        return this;
    }

    public final CustomDialog RatingCompat(String str, DialogInterface.OnClickListener onClickListener) {
        if (str != null) {
            this.mButtonHorizontalLayout.setVisibility(8);
            this.mButtonVerticalLayout.setVisibility(0);
            this.mPositiveButtonV.setVisibility(0);
            this.mPositiveButtonV.setText(str);
            this.mPositiveButtonV.setOnClickListener(new ForgotPinService(this, onClickListener));
        }
        return this;
    }

    public final CustomDialog read(String str, DialogInterface.OnClickListener onClickListener) {
        if (!(str == null || onClickListener == null)) {
            this.mButtonHorizontalLayout.setVisibility(8);
            this.mButtonVerticalLayout.setVisibility(0);
            this.mNegativeButtonV.setVisibility(0);
            this.mNegativeButtonV.setText(str);
            this.mNegativeButtonV.setOnClickListener(new setupNewPin(this, onClickListener));
        }
        return this;
    }

    public final CustomDialog MediaBrowserCompat$CustomActionResultReceiver(String str, DialogInterface.OnClickListener onClickListener) {
        if (str != null) {
            this.mButtonHorizontalLayout.setVisibility(8);
            this.mButtonVerticalLayout.setVisibility(0);
            this.mNeutralButtonV.setVisibility(0);
            this.mNeutralButtonV.setText(str);
            this.mNeutralButtonV.setOnClickListener(new verifyProfileForgotPinByAtm(this, onClickListener));
        }
        return this;
    }

    public static CustomDialog IconCompatParcelizer(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        CustomDialog customDialog = new CustomDialog(context);
        if (TextUtils.isEmpty(str)) {
            str = context.getString(R.string.common_error);
        }
        if (!(str == null || str.length() == 0)) {
            customDialog.mTitleTextView.setVisibility(0);
            customDialog.mTitleTextView.setText(str);
        }
        if (!(str2 == null || str2.length() == 0)) {
            customDialog.mTextTextView.setVisibility(0);
            customDialog.mTextTextView.setText(str2);
        }
        CustomDialog IconCompatParcelizer = customDialog.IconCompatParcelizer(customDialog.read.getString(R.string.proceed), onClickListener);
        return IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.cancel), new verifyMethod(onClickListener2));
    }

    public final CustomDialog MediaBrowserCompat$ItemReceiver(String str) {
        if (true ^ (str == null || str.length() == 0)) {
            this.mTextTextView.setVisibility(0);
            this.mTextTextView.setText(str);
        }
        return this;
    }

    public final CustomDialog IconCompatParcelizer(String str) {
        if (true ^ (str == null || str.length() == 0)) {
            this.mTitleTextView.setVisibility(0);
            this.mTitleTextView.setText(str);
        }
        return this;
    }
}
