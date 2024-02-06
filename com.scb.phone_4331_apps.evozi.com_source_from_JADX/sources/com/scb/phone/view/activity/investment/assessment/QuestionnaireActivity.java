package com.scb.phone.view.activity.investment.assessment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.ErrorFragment;
import com.scb.phone.view.fragment.investment.assessment.RegalQuestionnaireFragment;
import p040o.ForwardingCheckedFuture;
import p040o.doBackgroundInitialization;
import p040o.onGetStartedClick;

public final class QuestionnaireActivity extends BaseActivityWithFragment {
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        Bundle extras;
        doBackgroundInitialization dobackgroundinitialization;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (dobackgroundinitialization = (doBackgroundInitialization) extras.getParcelable("DISPLAY_TAG")) == null) {
            ErrorFragment MediaBrowserCompat$CustomActionResultReceiver = ErrorFragment.MediaBrowserCompat$CustomActionResultReceiver(new ForwardingCheckedFuture(ForwardingCheckedFuture.MediaBrowserCompat$CustomActionResultReceiver(), (byte) 0));
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "ErrorFragment.newInstanc…lay.newBuilder().build())");
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        String string = extras.getString("NAME_TAG", "");
        String string2 = extras.getString("EXTRA_EVENT_NAME", "");
        RegalQuestionnaireFragment.IconCompatParcelizer iconCompatParcelizer = RegalQuestionnaireFragment.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) string, "fromPage");
        onGetStartedClick.IconCompatParcelizer((Object) dobackgroundinitialization, "fundVerifyDisplay");
        onGetStartedClick.IconCompatParcelizer((Object) string2, "eventName");
        onGetStartedClick.write((Object) string, "fromPage");
        onGetStartedClick.write((Object) dobackgroundinitialization, "fundVerifyDisplay");
        onGetStartedClick.write((Object) string2, "eventName");
        RegalQuestionnaireFragment regalQuestionnaireFragment = new RegalQuestionnaireFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("display", dobackgroundinitialization);
        bundle.putString("name", string);
        bundle.putString("EXTRA_EVENT_NAME", string2);
        regalQuestionnaireFragment.setArguments(bundle);
        return regalQuestionnaireFragment;
    }

    public final String au_() {
        String string = getString(R.string.regal_investment_exprience_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.regal…vestment_exprience_title)");
        return string;
    }

    public static final Intent IconCompatParcelizer(Context context, String str, doBackgroundInitialization dobackgroundinitialization, String str2) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "fromPage");
        onGetStartedClick.write((Object) dobackgroundinitialization, "fundVerifyDisplay");
        onGetStartedClick.write((Object) str2, "eventName");
        Intent intent = new Intent(context, QuestionnaireActivity.class);
        intent.putExtra("NAME_TAG", str);
        intent.putExtra("DISPLAY_TAG", dobackgroundinitialization);
        intent.putExtra("EXTRA_EVENT_NAME", str2);
        return intent;
    }
}
