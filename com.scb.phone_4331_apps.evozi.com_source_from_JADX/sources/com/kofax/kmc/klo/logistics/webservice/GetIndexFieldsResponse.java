package com.kofax.kmc.klo.logistics.webservice;

import com.kofax.kmc.klo.logistics.service.KofaxWebServiceConnectorService;
import java.util.ArrayList;
import java.util.List;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class GetIndexFieldsResponse implements KofaxWebServiceResponseBase {
    private String errorMessage;
    private List<WscIndexField> indexFields = new ArrayList();
    private int resultCode;
    private String wscClientIp;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public String getWscClientIp() {
        return this.wscClientIp;
    }

    public void setWscClientIp(String str) {
        this.wscClientIp = str;
    }

    public List<WscIndexField> getIndexFields() {
        return this.indexFields;
    }

    public void setIndexFields(List<WscIndexField> list) {
        this.indexFields = list;
    }

    public static KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        GetIndexFieldsResponse getIndexFieldsResponse = new GetIndexFieldsResponse();
        getIndexFieldsResponse.setErrorMessage(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "errorMessage", (String) null));
        getIndexFieldsResponse.setResultCode(Integer.parseInt(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "resultCode", "-1")));
        getIndexFieldsResponse.setWscClientIp(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "wscClientIp", (String) null));
        for (int i = 0; i < accountHeaderViewHolder_ViewBinding.getPropertyCount(); i++) {
            AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
            accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, accountRemarkViewHolder);
            if (accountRemarkViewHolder.MediaBrowserCompat$ItemReceiver() != null && accountRemarkViewHolder.f5805x50fd9e4a.equals("indexFields")) {
                getIndexFieldsResponse.indexFields.add(WscIndexField.populateFromResponse((AccountHeaderViewHolder_ViewBinding) accountRemarkViewHolder.MediaBrowserCompat$ItemReceiver()));
            }
        }
        return getIndexFieldsResponse;
    }
}
