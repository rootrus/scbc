package com.scb.phone.view.fragment.bulktransfer;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.bulktransfer.ManageRecipientGroupActivity;
import com.scb.phone.view.custom.common.CounterEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.regex.Pattern;
import p040o.ComputingConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.getResponseCode;
import p040o.proxyGetICheckDeserializerRtti;
import p040o.readPersistedInstallationEntryValue;
import p040o.setExpiresInSecs;
import p040o.setLastBaselineToBottomHeight;

public class CreateGroupFragment extends BaseFragment implements proxyGetICheckDeserializerRtti.MediaMetadataCompat {
    @BindView
    DefaultButton createGroupButton;
    @BindView
    CounterEditText createGroupEditText;
    @HmlPinActivity
    public getResponseCode createRecipientGroupPresenter;

    public static CreateGroupFragment write() {
        return new CreateGroupFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86312131493858, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.createRecipientGroupPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.createGroupEditText.setDefaultButton(this.createGroupButton);
        return inflate;
    }

    @OnClick
    public void onCreateButtonClick() {
        getResponseCode getresponsecode = this.createRecipientGroupPresenter;
        String obj = this.createGroupEditText.editText.getText().toString();
        boolean z = true;
        if (!Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(obj).matches()) {
            setExpiresInSecs setexpiresinsecs = setExpiresInSecs.write;
            if (getresponsecode.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setexpiresinsecs.IconCompatParcelizer(getresponsecode.RatingCompat);
            }
        } else if (!getresponsecode.read) {
            getresponsecode.read = true;
            readPersistedInstallationEntryValue readpersistedinstallationentryvalue = readPersistedInstallationEntryValue.write;
            if (getresponsecode.RatingCompat != null) {
                readpersistedinstallationentryvalue.IconCompatParcelizer(getresponsecode.RatingCompat);
            }
            if (getresponsecode.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getresponsecode.RatingCompat.AlertController$RecycleListView();
            }
            ComputingConcurrentHashMap.ComputingSegment read = ComputingConcurrentHashMap.ComputingSegment.read();
            read.write = obj;
            getresponsecode.MediaBrowserCompat$ItemReceiver.write(read);
            getresponsecode.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getResponseCode.IconCompatParcelizer(getresponsecode, (byte) 0));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.createRecipientGroupPresenter.onDestroy();
    }

    public final void IconCompatParcelizer() {
        CounterEditText counterEditText = this.createGroupEditText;
        counterEditText.errorText.setVisibility(0);
        counterEditText.editText.setBackground(setLastBaselineToBottomHeight.write(counterEditText.getContext(), R.drawable.shape_red_reounded_reactangle_border));
    }

    public final void IconCompatParcelizer(String str) {
        ManageRecipientGroupActivity.MediaBrowserCompat$ItemReceiver(getContext(), str, "com.scb.phone/BROADCAST_RELOAD_BULK_TRANSFER");
        getActivity().finish();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.createRecipientGroupPresenter.read = false;
    }
}
