package com.scb.phone.data.network.api;

import com.scb.phone.data.network.service.GoogleSigninService;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.LottieAnimationView;
import p040o.createFromParcel;
import p040o.onGetStartedClick;
import retrofit2.http.Body;

public final class GoogleSigninApi {
    private final GoogleSigninService IconCompatParcelizer;

    @HmlPinActivity
    public GoogleSigninApi(GoogleSigninService googleSigninService) {
        onGetStartedClick.write((Object) googleSigninService, "googleSigninService");
        this.IconCompatParcelizer = googleSigninService;
    }

    public final DebitCardResetOtpActivity<createFromParcel> postGoogleSignin(@Body LottieAnimationView.C12323 r2) {
        onGetStartedClick.write((Object) r2, "body");
        return this.IconCompatParcelizer.postGoogleSignin(r2);
    }
}
