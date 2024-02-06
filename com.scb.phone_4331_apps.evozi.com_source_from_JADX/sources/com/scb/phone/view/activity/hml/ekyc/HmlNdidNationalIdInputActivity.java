package com.scb.phone.view.activity.hml.ekyc;

import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import com.scb.phone.R;
import com.scb.phone.view.activity.ndid.NdidNationalIdInputActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Collections;
import java.util.List;
import kotlin.TypeCastException;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AutoValue_CrashlyticsReport;
import p040o.GoodToKnowActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNdidNationalIdInputActivity extends NdidNationalIdInputActivity {
    public final String MediaSessionCompat$ResultReceiverWrapper() {
        return "your_loan";
    }

    public final void write(AutoValue_CrashlyticsReport.Builder builder) {
        String str;
        onGetStartedClick.write((Object) builder, "ndidNationalIdInputDisplay");
        CustomSpinnerWithTitle customSpinnerWithTitle = this.spinnerTitle;
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(mo3026D_(), "th", true)) {
            str = builder.MediaDescriptionCompat;
        } else {
            str = builder.MediaBrowserCompat$SearchResultReceiver;
        }
        List singletonList = Collections.singletonList(str);
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        customSpinnerWithTitle.setItems(singletonList, false, false);
        String str2 = builder.f2673x50fd9e4a;
        CommonInputViewGroup commonInputViewGroup = this.ivpFirstNameThai;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup, "ivpFirstNameThai");
        commonInputViewGroup.setText(builder.MediaBrowserCompat$CustomActionResultReceiver);
        CommonInputViewGroup commonInputViewGroup2 = this.ivpLastNameThai;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup2, "ivpLastNameThai");
        commonInputViewGroup2.setText(builder.RatingCompat);
        CommonInputViewGroup commonInputViewGroup3 = this.ivpFirstNameEnglish;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup3, "ivpFirstNameEnglish");
        commonInputViewGroup3.setText(builder.read);
        CommonInputViewGroup commonInputViewGroup4 = this.ivpLastNameEnglish;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup4, "ivpLastNameEnglish");
        commonInputViewGroup4.setText(builder.MediaMetadataCompat);
        CommonInputViewGroup commonInputViewGroup5 = this.ivpNationalIdNumber;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup5, "ivpNationalIdNumber");
        commonInputViewGroup5.setText(builder.IconCompatParcelizer);
        CommonInputViewGroup commonInputViewGroup6 = this.dateOfBirthViewGroup;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup6, "dateOfBirthViewGroup");
        commonInputViewGroup6.setText(builder.MediaBrowserCompat$ItemReceiver);
        CommonInputViewGroup commonInputViewGroup7 = this.dateOfIssuedViewGroup;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup7, "dateOfIssuedViewGroup");
        commonInputViewGroup7.setText(builder.MediaSessionCompat$Token);
        EditText editText = this.laserIdFirst;
        onGetStartedClick.IconCompatParcelizer((Object) str2, "laserCode");
        if (str2 != null) {
            String substring = str2.substring(0, 3);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            editText.setText(substring);
            EditText editText2 = this.laserIdSecond;
            String substring2 = str2.substring(3, 10);
            onGetStartedClick.IconCompatParcelizer((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            editText2.setText(substring2);
            EditText editText3 = this.laserIdThird;
            String substring3 = str2.substring(10, 12);
            onGetStartedClick.IconCompatParcelizer((Object) substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            editText3.setText(substring3);
            this.spinnerCountry.setDisabledText(builder.MediaBrowserCompat$MediaItem);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CustomSpinnerWithTitle customSpinnerWithTitle = this.spinnerTitle;
        onGetStartedClick.IconCompatParcelizer((Object) customSpinnerWithTitle, "spinnerTitle");
        customSpinnerWithTitle.setEnabled(false);
        CommonInputViewGroup commonInputViewGroup = this.ivpFirstNameThai;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup, "ivpFirstNameThai");
        commonInputViewGroup.setEnabled(false);
        CommonInputViewGroup commonInputViewGroup2 = this.ivpLastNameThai;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup2, "ivpLastNameThai");
        commonInputViewGroup2.setEnabled(false);
        CommonInputViewGroup commonInputViewGroup3 = this.ivpFirstNameEnglish;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup3, "ivpFirstNameEnglish");
        commonInputViewGroup3.setEnabled(false);
        CommonInputViewGroup commonInputViewGroup4 = this.ivpLastNameEnglish;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup4, "ivpLastNameEnglish");
        commonInputViewGroup4.setEnabled(false);
        CommonInputViewGroup commonInputViewGroup5 = this.ivpNationalIdNumber;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup5, "ivpNationalIdNumber");
        commonInputViewGroup5.setEnabled(false);
        CommonInputViewGroup commonInputViewGroup6 = this.dateOfBirthViewGroup;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup6, "dateOfBirthViewGroup");
        commonInputViewGroup6.setEnabled(false);
        CommonInputViewGroup commonInputViewGroup7 = this.dateOfIssuedViewGroup;
        onGetStartedClick.IconCompatParcelizer((Object) commonInputViewGroup7, "dateOfIssuedViewGroup");
        commonInputViewGroup7.setEnabled(false);
        EditText editText = this.laserIdFirst;
        onGetStartedClick.IconCompatParcelizer((Object) editText, "laserIdFirst");
        editText.setEnabled(false);
        EditText editText2 = this.laserIdSecond;
        onGetStartedClick.IconCompatParcelizer((Object) editText2, "laserIdSecond");
        editText2.setEnabled(false);
        EditText editText3 = this.laserIdThird;
        onGetStartedClick.IconCompatParcelizer((Object) editText3, "laserIdThird");
        editText3.setEnabled(false);
        CustomSpinnerWithTitle customSpinnerWithTitle2 = this.spinnerCountry;
        onGetStartedClick.IconCompatParcelizer((Object) customSpinnerWithTitle2, "spinnerCountry");
        customSpinnerWithTitle2.setEnabled(false);
    }

    public final void RatingCompat() {
        C5631x201a62d1 hmlNationalIdHelpActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNationalIdHelpActivity.MediaMetadataCompat;
        Context context = this;
        String string = getString(R.string.laser_id_help_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.laser_id_help_title)");
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) string, MessageBundle.TITLE_ENTRY);
        Intent intent = new Intent(context, HmlNationalIdHelpActivity.class);
        intent.putExtra(MessageBundle.TITLE_ENTRY, string);
        intent.putExtra("content", R.layout.f85362131493763);
        intent.addFlags(268435456);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
