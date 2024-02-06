package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BindView;
import p040o.DebitCardResetOtpActivity;
import p040o.PolystarContent;
import p040o.column;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface AddressService {
    @GET("v1/customer/addresses/findByAnyAddress")
    DebitCardResetOtpActivity<SingleDataEntity<BindView>> findByAnyAddress(@Query("province") String str, @Query("district") String str2, @Query("subdistrict") String str3);

    @GET("v1/customer/addresses/province")
    DebitCardResetOtpActivity<SingleDataEntity<BindView>> getAddressProvince();

    @POST("v1/customer/address/validation")
    DebitCardResetOtpActivity<SingleDataEntity<PolystarContent>> validateAddress(@Body column column);
}
