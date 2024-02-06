package com.thunderhead.android.domain.authentication;

import p040o.GoodToKnowActivity;
import p040o.MyECouponActivity_ViewBinding;

public final class AuthenticationUtilsKt {
    public static final ClientCredentials clientCredentials(String str, String str2, String str3, String str4) {
        if (str != null && str2 != null && str3 != null && str4 != null) {
            return new ClientCredentials(str, str2, str3, str4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n        |Attempted to create credentials with null inputs:\n        |user = ");
        sb.append(str);
        sb.append("\n        |password = ");
        sb.append(str2);
        sb.append("\n        |siteKey = ");
        sb.append(str3);
        sb.append("\n        |hostName = ");
        sb.append(str4);
        sb.append("\n    ");
        MyECouponActivity_ViewBinding.write(GoodToKnowActivity.IconCompatParcelizer(sb.toString()));
        return null;
    }
}
