package com.scb.phone.view.activity.personalinfo;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.CustomExternalSelector;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.onCreateDialog;
import p040o.onStart;

public class BasePersonalInfoActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaDescriptionCompat;
    private BasePersonalInfoActivity write;

    public BasePersonalInfoActivity_ViewBinding(final BasePersonalInfoActivity basePersonalInfoActivity, View view) {
        super(basePersonalInfoActivity, view);
        this.write = basePersonalInfoActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.tab_citizen_id, "field 'btnTabCitizenId' and method 'onCitizenTabClicked'");
        basePersonalInfoActivity.btnTabCitizenId = (Button) onStart.write(IconCompatParcelizer2, R.id.tab_citizen_id, "field 'btnTabCitizenId'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BasePersonalInfoActivity.this.onCitizenTabClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.tab_passport, "field 'btnTabPassport' and method 'onPassportTabClicked'");
        basePersonalInfoActivity.btnTabPassport = (Button) onStart.write(IconCompatParcelizer3, R.id.tab_passport, "field 'btnTabPassport'", Button.class);
        this.MediaDescriptionCompat = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BasePersonalInfoActivity.this.onPassportTabClicked();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.tab_alien_card, "field 'btnTabAlienCard' and method 'onAlienCardTabClicked'");
        basePersonalInfoActivity.btnTabAlienCard = (Button) onStart.write(IconCompatParcelizer4, R.id.tab_alien_card, "field 'btnTabAlienCard'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BasePersonalInfoActivity.this.onAlienCardTabClicked();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.btn_submit, "field 'btnSubmit' and method 'onSubmit'");
        basePersonalInfoActivity.btnSubmit = (Button) onStart.write(IconCompatParcelizer5, R.id.btn_submit, "field 'btnSubmit'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BasePersonalInfoActivity.this.onSubmit();
            }
        });
        basePersonalInfoActivity.layoutCitizen = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_citizen, "field 'layoutCitizen'", LinearLayout.class);
        basePersonalInfoActivity.ivpCitizenCardNo = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_citizen_card_no, "field 'ivpCitizenCardNo'", CommonInputViewGroup.class);
        basePersonalInfoActivity.ivpCitizenDob = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_citizen_dob, "field 'ivpCitizenDob'", CommonInputViewGroup.class);
        basePersonalInfoActivity.layoutPassport = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_passport, "field 'layoutPassport'", LinearLayout.class);
        basePersonalInfoActivity.countrySelector = (CustomExternalSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_selector_country, "field 'countrySelector'", CustomExternalSelector.class);
        basePersonalInfoActivity.ivpPassportNo = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_passort_no, "field 'ivpPassportNo'", CommonInputViewGroup.class);
        basePersonalInfoActivity.ivpPassportDob = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_passort_dob, "field 'ivpPassportDob'", CommonInputViewGroup.class);
        basePersonalInfoActivity.layoutAlien = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_alien, "field 'layoutAlien'", LinearLayout.class);
        basePersonalInfoActivity.ivpAlienNo = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_alien_no, "field 'ivpAlienNo'", CommonInputViewGroup.class);
        basePersonalInfoActivity.ivpAlienDob = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_alien_dob, "field 'ivpAlienDob'", CommonInputViewGroup.class);
    }

    public final void read() {
        BasePersonalInfoActivity basePersonalInfoActivity = this.write;
        if (basePersonalInfoActivity != null) {
            this.write = null;
            basePersonalInfoActivity.btnTabCitizenId = null;
            basePersonalInfoActivity.btnTabPassport = null;
            basePersonalInfoActivity.btnTabAlienCard = null;
            basePersonalInfoActivity.btnSubmit = null;
            basePersonalInfoActivity.layoutCitizen = null;
            basePersonalInfoActivity.ivpCitizenCardNo = null;
            basePersonalInfoActivity.ivpCitizenDob = null;
            basePersonalInfoActivity.layoutPassport = null;
            basePersonalInfoActivity.countrySelector = null;
            basePersonalInfoActivity.ivpPassportNo = null;
            basePersonalInfoActivity.ivpPassportDob = null;
            basePersonalInfoActivity.layoutAlien = null;
            basePersonalInfoActivity.ivpAlienNo = null;
            basePersonalInfoActivity.ivpAlienDob = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
