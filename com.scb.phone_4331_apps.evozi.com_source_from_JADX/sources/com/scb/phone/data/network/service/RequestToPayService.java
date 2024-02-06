package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.CctBackendFactory;
import p040o.DebitCardResetOtpActivity;
import p040o.EventStoreModule;
import p040o.ImmutableSortedMap;
import p040o.setDrawWeb;
import p040o.setSkipWebLineCount;
import p040o.setWebAlpha;
import p040o.setWebColorInner;
import p040o.setWebLineWidth;
import p040o.sortEntries;
import p040o.unsafeComparator;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RequestToPayService {
    @POST("v1/rtp/pay/confirm")
    DebitCardResetOtpActivity<SingleDataEntity<setWebAlpha>> confirmPayer(@Body unsafeComparator unsafecomparator);

    @POST("v1/rtp/request/confirm")
    DebitCardResetOtpActivity<SingleDataEntity<setWebColorInner>> confirmRequester(@Body sortEntries sortentries);

    @GET("v1/rtp/request/landing")
    DebitCardResetOtpActivity<SingleDataEntity<setDrawWeb>> getLanding();

    @POST("v1/rtp/inquiry/incoming")
    @Headers({"serviceName:RTPPayerInquiry"})
    DebitCardResetOtpActivity<SingleDataEntity<setSkipWebLineCount>> incomingSummary(@Body ImmutableSortedMap.SerializedForm serializedForm);

    @POST("v2/rtp/inquiry/incoming")
    @Headers({"serviceName:RTPPayerInquiry"})
    DebitCardResetOtpActivity<SingleDataEntity<setSkipWebLineCount>> newIncomingSummary(@Body ImmutableSortedMap.SerializedForm serializedForm);

    @POST("v2/rtp/inquiry/outgoing")
    @Headers({"serviceName:RTPPayeeInquiry"})
    DebitCardResetOtpActivity<SingleDataEntity<setWebLineWidth>> newOutgoingSummary(@Body ImmutableSortedMap.SerializedForm serializedForm);

    @POST("v1/rtp/inquiry/outgoing")
    @Headers({"serviceName:RTPPayeeInquiry"})
    DebitCardResetOtpActivity<SingleDataEntity<setWebLineWidth>> outgoingSummary(@Body ImmutableSortedMap.SerializedForm serializedForm);

    @POST("v1/rtp/pay/review")
    DebitCardResetOtpActivity<SingleDataEntity<CctBackendFactory>> reviewPayer(@Body ImmutableSortedMap.C35104 r1);

    @POST("v1/rtp/request/review")
    DebitCardResetOtpActivity<SingleDataEntity<EventStoreModule>> reviewRequester(@Body ImmutableSortedMap.C35092 r1);
}
