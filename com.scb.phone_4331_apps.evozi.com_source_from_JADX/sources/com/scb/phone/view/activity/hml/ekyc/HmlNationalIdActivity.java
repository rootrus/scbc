package com.scb.phone.view.activity.hml.ekyc;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.ntb.ekyc.NationalIdActivity;
import com.scb.phone.view.custom.common.DateInputText;
import java.io.File;
import kotlin.TypeCastException;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;
import p040o.CheckCaptureActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.KtaJsonCheck;
import p040o.onGetStartedClick;

public final class HmlNationalIdActivity extends NationalIdActivity implements KtaJsonCheck.C6928a {
    public static final HmlNationalIdActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new HmlNationalIdActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    @BindView
    public TextView scanNationalIdLabel;

    public final String MediaSessionCompat$Token() {
        return "your_loan";
    }

    static final class read<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ HmlNationalIdActivity MediaBrowserCompat$ItemReceiver;

        read(HmlNationalIdActivity hmlNationalIdActivity) {
            this.MediaBrowserCompat$ItemReceiver = hmlNationalIdActivity;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$ItemReceiver.nationalIdPresenter.MediaMetadataCompat((Throwable) obj);
        }
    }

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<File> {
        private /* synthetic */ HmlNationalIdActivity MediaBrowserCompat$CustomActionResultReceiver;

        write(HmlNationalIdActivity hmlNationalIdActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlNationalIdActivity;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$CustomActionResultReceiver.nationalIdPresenter.MediaBrowserCompat$ItemReceiver((File) obj);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView textView = this.scanNationalIdLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("scanNationalIdLabel");
        }
        textView.setText(getString(R.string.hml_national_id_label));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        DateInputText dateInputText = this.dateEditText;
        onGetStartedClick.IconCompatParcelizer((Object) dateInputText, "dateEditText");
        dateInputText.setEnabled(false);
        EditText editText = this.laserIdFirst;
        onGetStartedClick.IconCompatParcelizer((Object) editText, "laserIdFirst");
        editText.setEnabled(false);
        EditText editText2 = this.laserIdSecond;
        onGetStartedClick.IconCompatParcelizer((Object) editText2, "laserIdSecond");
        editText2.setEnabled(false);
        EditText editText3 = this.laserIdThird;
        onGetStartedClick.IconCompatParcelizer((Object) editText3, "laserIdThird");
        editText3.setEnabled(false);
    }

    public final void read(AutoValue_CrashlyticsReport_FilesPayload.Builder builder) {
        onGetStartedClick.write((Object) builder, "display");
        DateInputText dateInputText = this.dateEditText;
        onGetStartedClick.IconCompatParcelizer((Object) dateInputText, "dateEditText");
        dateInputText.setText(CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(builder.MediaSessionCompat$Token, "yyyy-MM-dd", "dd/MM/yyyy", false));
        EditText editText = this.laserIdFirst;
        String str = builder.f2673x50fd9e4a;
        onGetStartedClick.IconCompatParcelizer((Object) str, "display.laserCode");
        if (str != null) {
            String substring = str.substring(0, 3);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            editText.setText(substring);
            EditText editText2 = this.laserIdSecond;
            String str2 = builder.f2673x50fd9e4a;
            onGetStartedClick.IconCompatParcelizer((Object) str2, "display.laserCode");
            if (str2 != null) {
                String substring2 = str2.substring(3, 10);
                onGetStartedClick.IconCompatParcelizer((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                editText2.setText(substring2);
                EditText editText3 = this.laserIdThird;
                String str3 = builder.f2673x50fd9e4a;
                onGetStartedClick.IconCompatParcelizer((Object) str3, "display.laserCode");
                if (str3 != null) {
                    String substring3 = str3.substring(10, 12);
                    onGetStartedClick.IconCompatParcelizer((Object) substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    editText3.setText(substring3);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, int i) {
        onGetStartedClick.write((Object) str, "nationalIdImageUri");
        FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(str, i).write(new write(this), new read(this));
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        super.MediaBrowserCompat$ItemReceiver(z);
    }
}
