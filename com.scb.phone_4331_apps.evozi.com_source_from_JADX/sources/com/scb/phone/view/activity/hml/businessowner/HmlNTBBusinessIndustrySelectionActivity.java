package com.scb.phone.view.activity.hml.businessowner;

import com.scb.phone.data.network.service.easycash.EasycashCommercialInfoService;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;

public final class HmlNTBBusinessIndustrySelectionActivity extends HmlBusinessIndustrySelectionActivity {

    public static final class IconCompatParcelizer {
        public final EasycashCommercialInfoService write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(EasycashCommercialInfoService easycashCommercialInfoService) {
            onGetStartedClick.write((Object) easycashCommercialInfoService, "easycashCommercialInfoService");
            this.write = easycashCommercialInfoService;
        }
    }
}
