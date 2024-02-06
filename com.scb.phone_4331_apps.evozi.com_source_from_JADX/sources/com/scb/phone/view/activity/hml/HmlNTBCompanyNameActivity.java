package com.scb.phone.view.activity.hml;

import com.scb.phone.data.network.service.easycash.EasycashCardService;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;

public final class HmlNTBCompanyNameActivity extends HmlCompanyNameActivity {

    public static final class IconCompatParcelizer {
        public final EasycashCardService IconCompatParcelizer;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(EasycashCardService easycashCardService) {
            onGetStartedClick.write((Object) easycashCardService, "easycashCardService");
            this.IconCompatParcelizer = easycashCardService;
        }
    }
}
