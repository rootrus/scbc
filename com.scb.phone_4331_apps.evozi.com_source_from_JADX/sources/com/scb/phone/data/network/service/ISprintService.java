package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ExplicitOrderedImmutableSortedSet;
import p040o.NetworkFetcher;
import p040o.fetchSync;
import p040o.findSubsetIndex;
import p040o.rank;
import p040o.rankMap;
import p040o.setCurrentItemInternal;
import p040o.writeTempCacheFile;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ISprintService {
    @POST("v1/failovernotification/userlog")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> failOverNotificationUserLog(@Body rank rank);

    @POST("isprint/soap/preAuth")
    DebitCardResetOtpActivity<fetchSync> preauthenticate(@Body findSubsetIndex findsubsetindex);

    @POST("v1/authorization/preAuth")
    DebitCardResetOtpActivity<SingleDataEntity<NetworkFetcher>> preauthorization(@Body ExplicitOrderedImmutableSortedSet.SerializedForm serializedForm);

    @POST("isprint/soap/dpParams")
    DebitCardResetOtpActivity<writeTempCacheFile> requestDpParams(@Body rankMap rankmap);
}
