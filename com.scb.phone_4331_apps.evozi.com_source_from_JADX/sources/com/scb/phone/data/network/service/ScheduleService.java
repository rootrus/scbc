package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.ImmutableSortedMap;
import p040o.SchedulingModule;
import p040o.TimeModule;
import p040o.setAlignItems;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Query;

public interface ScheduleService {
    @HTTP(hasBody = true, method = "DELETE", path = "v1/schedules")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteScheduleTransaction(@Body ImmutableSortedMap.Values values);

    @GET("/v1/schedules/details")
    DebitCardResetOtpActivity<SingleDataEntity<setAlignItems>> getScheduleList(@Query("effectiveDate") String str);

    @GET("v1/schedules")
    DebitCardResetOtpActivity<SingleDataEntity<SchedulingModule>> getSchedules();

    @GET("v1/schedules/config")
    DebitCardResetOtpActivity<TimeModule> getSchedulesConfig();
}
