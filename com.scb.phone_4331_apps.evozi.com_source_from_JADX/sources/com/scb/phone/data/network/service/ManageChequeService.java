package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.addAnimatorUpdateListener;
import p040o.connectEvictables;
import p040o.connectExpirables;
import p040o.copyEntry;
import p040o.discardingQueue;
import p040o.enqueueNotification;
import p040o.getComposition;
import p040o.getDuration;
import p040o.getFrame;
import p040o.getImageAssetsFolder;
import p040o.getRepeatCount;
import p040o.getRepeatMode;
import p040o.getScale;
import p040o.hasMasks;
import p040o.invalidateDrawable;
import p040o.unset;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ManageChequeService {
    @POST("/v1/deposits/cheque/activate/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<addAnimatorUpdateListener>> getActivateChequeConfirm(@Body copyEntry copyentry);

    @POST("/v1/deposits/cheque/activate/verification")
    DebitCardResetOtpActivity<SingleDataEntity<getDuration>> getActivateChequeVerification(@Body connectExpirables connectexpirables);

    @POST("/v2/deposits/cheque/issue/detail")
    DebitCardResetOtpActivity<getImageAssetsFolder> getChequeStatusIssueDetail(@Body discardingQueue discardingqueue);

    @POST("/v1/deposits/cheque/issue/summary")
    DebitCardResetOtpActivity<getFrame> getChequeStatusIssueSummary(@Body getRepeatMode getrepeatmode);

    @POST("/v1/deposits/cheque/receive/detail")
    DebitCardResetOtpActivity<getImageAssetsFolder> getChequeStatusReceiveDetail(@Body discardingQueue discardingqueue);

    @POST("/v1/deposits/cheque/receive/summary")
    DebitCardResetOtpActivity<getComposition> getChequeStatusReceiveSummary(@Body getRepeatMode getrepeatmode);

    @POST("/v1/deposits/cheque/order/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<addAnimatorUpdateListener>> getOrderChequeConfirm(@Body copyEntry copyentry);

    @GET("/v1/deposits/cheque/order/landing")
    DebitCardResetOtpActivity<SingleDataEntity<hasMasks>> getOrderChequeLanding();

    @POST("/v1/deposits/cheque/order/verification")
    DebitCardResetOtpActivity<SingleDataEntity<getScale>> getOrderChequeVerification(@Body connectEvictables connectevictables);

    @POST("/v1/deposits/cheque/stop/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<addAnimatorUpdateListener>> getStopChequeConfirm(@Body copyEntry copyentry);

    @POST("/v1/deposits/cheque/stop/detail")
    DebitCardResetOtpActivity<SingleDataEntity<getRepeatCount>> getStopChequeDetail(@Body unset unset);

    @POST("/v1/deposits/cheque/stop/verification")
    DebitCardResetOtpActivity<SingleDataEntity<invalidateDrawable>> getStopChequeVerification(@Body enqueueNotification enqueuenotification);
}
