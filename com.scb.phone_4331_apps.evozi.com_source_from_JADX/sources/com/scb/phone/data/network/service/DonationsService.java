package com.scb.phone.data.network.service;

import p040o.DebitCardResetOtpActivity;
import p040o.fromRawResSync;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface DonationsService {
    @GET
    DebitCardResetOtpActivity<fromRawResSync> getDonationList(@Url String str, @Query(encoded = true, value = "path") String str2);
}
