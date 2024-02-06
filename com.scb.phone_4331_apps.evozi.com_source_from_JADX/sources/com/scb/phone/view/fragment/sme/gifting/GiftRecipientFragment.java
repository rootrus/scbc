package com.scb.phone.view.fragment.sme.gifting;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferToPromptPayStep1Fragment;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.C5189rE;
import p040o.CheckParameters_MembersInjector;
import p040o.HmlPinActivity;
import p040o.SelfieOverlayView;
import p040o.getHoldParallelMsg;
import p040o.removeDependent;
import p040o.removeIfFromRandomAccessList;
import p040o.setDetectorOperationState;
import p040o.setOverlayAspectRatio;
import p040o.setPaddingPercent;
import p040o.startBlink;
import p040o.startCapturedMessage;
import p040o.startRotateMessage;
import p040o.startSteadyMessage;
import p040o.stopMessages;

public class GiftRecipientFragment extends TransferToPromptPayStep1Fragment implements CheckParameters_MembersInjector.MediaDescriptionCompat {
    @HmlPinActivity
    public startRotateMessage giftingSelectRecipientFromPromptPayPresenter;

    public static GiftRecipientFragment read(String str) {
        GiftRecipientFragment giftRecipientFragment = new GiftRecipientFragment();
        Bundle bundle = new Bundle();
        bundle.putString("RECIPIENT_TYPE", str);
        giftRecipientFragment.setArguments(bundle);
        return giftRecipientFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.giftingSelectRecipientFromPromptPayPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getArguments() != null) {
            startRotateMessage startrotatemessage = this.giftingSelectRecipientFromPromptPayPresenter;
            startrotatemessage.read = getArguments().getString("RECIPIENT_TYPE");
            boolean z = true;
            if ("money".equalsIgnoreCase(startrotatemessage.read)) {
                setDetectorOperationState setdetectoroperationstate = setDetectorOperationState.MediaBrowserCompat$ItemReceiver;
                if (startrotatemessage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setdetectoroperationstate.IconCompatParcelizer(startrotatemessage.RatingCompat);
                }
            } else {
                C5189rE rEVar = C5189rE.read;
                if (startrotatemessage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    rEVar.IconCompatParcelizer(startrotatemessage.RatingCompat);
                }
            }
        }
        if (this.mContinueButton != null) {
            this.mContinueButton.setText(getString(R.string.confirm));
        }
        return onCreateView;
    }

    public final void write(int i) {
        int i2;
        if (i == 0) {
            i2 = R.string.select_recipient_gift_promptpay;
        } else if (i == 1) {
            i2 = R.string.gift_send_recipient_hint;
        } else {
            throw new IllegalArgumentException("Illegal promptpay hint");
        }
        this.mCustomProxyNumber.setProxyHint(getString(i2));
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.mCustomProxyNumber.setMaxLength(i);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.mCustomProxyNumber.setProxyLabel(getString(R.string.gift_send_recipient_gift_to));
    }

    public final void MediaBrowserCompat$ItemReceiver(removeDependent removedependent) {
        this.giftingSelectRecipientFromPromptPayPresenter.IconCompatParcelizer = removedependent;
    }

    public void onNextButtonClick() {
        startRotateMessage startrotatemessage = this.giftingSelectRecipientFromPromptPayPresenter;
        startSteadyMessage startsteadymessage = new startSteadyMessage(startrotatemessage);
        if (startrotatemessage.RatingCompat != null) {
            startsteadymessage.IconCompatParcelizer(startrotatemessage.RatingCompat);
        }
    }

    public final void write() {
        this.mCustomProxyNumber.setErrorValidationVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2;
        if (i == 0) {
            i2 = R.string.incomplete_information;
        } else if (i == 1) {
            i2 = R.string.error_prompt_pay_validation;
        } else if (i == 2) {
            i2 = R.string.error_prompt_pay_mobile_validation;
        } else {
            throw new IllegalArgumentException("Illegal promptpay error");
        }
        this.mCustomProxyNumber.setErrorInLine(i2);
        this.mCustomProxyNumber.setErrorValidationVisibility(0);
    }

    public final void write(String str) {
        startRotateMessage startrotatemessage = this.giftingSelectRecipientFromPromptPayPresenter;
        boolean z = true;
        if (TextUtils.isEmpty(str)) {
            SelfieOverlayView selfieOverlayView = SelfieOverlayView.MediaBrowserCompat$CustomActionResultReceiver;
            if (startrotatemessage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                selfieOverlayView.IconCompatParcelizer(startrotatemessage.RatingCompat);
            }
        } else if ("money".equalsIgnoreCase(startrotatemessage.read)) {
            if (removeIfFromRandomAccessList.write(str) || removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(str)) {
                startBlink startblink = startBlink.read;
                if (startrotatemessage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    startblink.IconCompatParcelizer(startrotatemessage.RatingCompat);
                }
                startrotatemessage.MediaBrowserCompat$ItemReceiver(str, (String) null);
                return;
            }
            getHoldParallelMsg getholdparallelmsg = getHoldParallelMsg.MediaBrowserCompat$CustomActionResultReceiver;
            if (startrotatemessage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getholdparallelmsg.IconCompatParcelizer(startrotatemessage.RatingCompat);
            }
        } else if (!removeIfFromRandomAccessList.write(str)) {
            setOverlayAspectRatio setoverlayaspectratio = setOverlayAspectRatio.MediaBrowserCompat$CustomActionResultReceiver;
            if (startrotatemessage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setoverlayaspectratio.IconCompatParcelizer(startrotatemessage.RatingCompat);
            }
        } else {
            startCapturedMessage startcapturedmessage = startCapturedMessage.MediaBrowserCompat$CustomActionResultReceiver;
            if (startrotatemessage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                startcapturedmessage.IconCompatParcelizer(startrotatemessage.RatingCompat);
            }
            startrotatemessage.MediaBrowserCompat$ItemReceiver(str, (String) null);
        }
    }

    public final void IconCompatParcelizer(String str) {
        int i;
        startRotateMessage startrotatemessage = this.giftingSelectRecipientFromPromptPayPresenter;
        String obj = this.mCustomProxyNumber.proxyNumberField.getText().toString();
        String str2 = this.mCustomProxyNumber.write;
        boolean z = true;
        if (TextUtils.isEmpty(obj)) {
            i = 0;
        } else {
            if (!removeIfFromRandomAccessList.write(obj) || !removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(obj)) {
                if ("money".equalsIgnoreCase(startrotatemessage.read)) {
                    if (!removeIfFromRandomAccessList.write(obj) && !removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(obj)) {
                        i = 1;
                    }
                } else if (!removeIfFromRandomAccessList.write(obj)) {
                    i = 2;
                }
            }
            i = -1;
        }
        if (i >= 0) {
            setPaddingPercent setpaddingpercent = new setPaddingPercent(i);
            if (startrotatemessage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setpaddingpercent.IconCompatParcelizer(startrotatemessage.RatingCompat);
                return;
            }
            return;
        }
        startrotatemessage.MediaBrowserCompat$ItemReceiver(obj, str2);
        stopMessages stopmessages = stopMessages.write;
        if (startrotatemessage.RatingCompat == null) {
            z = false;
        }
        if (z) {
            stopmessages.IconCompatParcelizer(startrotatemessage.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder) {
        Intent intent = new Intent();
        intent.putExtra("GIFT_RECIPIENT_INFO", builder);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.giftingSelectRecipientFromPromptPayPresenter.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        read(z);
    }
}
