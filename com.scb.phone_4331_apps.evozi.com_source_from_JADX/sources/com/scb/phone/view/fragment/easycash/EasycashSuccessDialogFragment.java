package com.scb.phone.view.fragment.easycash;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import com.scb.phone.R;
import p040o.serializeEvent;

public class EasycashSuccessDialogFragment extends DialogFragment {
    private read IconCompatParcelizer;
    @BindView
    protected Button buttonDone;
    @BindView
    protected Button buttonPurple;
    @BindView
    protected TextView secondaryButton;
    @BindView
    protected TextView subTitle;
    @BindView
    protected TextView title;

    public interface read {
        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        void mo14259x50fd9e4a();

        void MediaSessionCompat$QueueItem();
    }

    public static EasycashSuccessDialogFragment write(serializeEvent serializeevent) {
        EasycashSuccessDialogFragment easycashSuccessDialogFragment = new EasycashSuccessDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_EASYCASH_SUCCESS", serializeevent);
        bundle.putBoolean("com.scb.phone.EXTRA_EASYCASH_SUCCESS_CANCELABLE", false);
        easycashSuccessDialogFragment.setArguments(bundle);
        return easycashSuccessDialogFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f84912131493718, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setCancelable(getArguments().getBoolean("com.scb.phone.EXTRA_EASYCASH_SUCCESS_CANCELABLE"));
        serializeEvent serializeevent = (serializeEvent) getArguments().getParcelable("com.scb.phone.EXTRA_EASYCASH_SUCCESS");
        if (!TextUtils.isEmpty(serializeevent.RatingCompat)) {
            String str = serializeevent.RatingCompat;
            this.title.setVisibility(0);
            this.title.setText(str);
        }
        if (!TextUtils.isEmpty(serializeevent.IconCompatParcelizer)) {
            String str2 = serializeevent.IconCompatParcelizer;
            this.subTitle.setVisibility(0);
            this.subTitle.setText(str2);
        }
        if (!TextUtils.isEmpty(serializeevent.read)) {
            String str3 = serializeevent.read;
            this.buttonDone.setVisibility(0);
            this.buttonDone.setText(str3);
        }
        if (!TextUtils.isEmpty(serializeevent.MediaBrowserCompat$ItemReceiver)) {
            String str4 = serializeevent.MediaBrowserCompat$ItemReceiver;
            this.secondaryButton.setVisibility(0);
            this.secondaryButton.setText(str4);
        }
        if (!TextUtils.isEmpty(serializeevent.MediaBrowserCompat$CustomActionResultReceiver)) {
            String str5 = serializeevent.MediaBrowserCompat$CustomActionResultReceiver;
            this.buttonPurple.setVisibility(0);
            this.buttonPurple.setText(str5);
        }
        return inflate;
    }

    @OnClick
    public void onClick() {
        dismiss();
        this.IconCompatParcelizer.mo14259x50fd9e4a();
    }

    @OnClick
    @Optional
    public void onPurpleButtonClick() {
        dismiss();
        this.IconCompatParcelizer.MediaSessionCompat$QueueItem();
    }

    @OnClick
    @Optional
    public void onSecondaryButtonClick() {
        dismiss();
        this.IconCompatParcelizer.MediaSessionCompat$QueueItem();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        setStyle(1, R.style.f95602131820775);
        return new Dialog(getActivity(), getTheme()) {
            public final void onBackPressed() {
                EasycashSuccessDialogFragment.this.onClick();
            }
        };
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof read) {
            this.IconCompatParcelizer = (read) getParentFragment();
        } else if (context instanceof read) {
            this.IconCompatParcelizer = (read) context;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement OnEasyCashSuccessDialogListener");
            throw new ClassCastException(sb.toString());
        }
    }

    public void onDestroy() {
        this.IconCompatParcelizer = null;
        super.onDestroy();
    }
}
