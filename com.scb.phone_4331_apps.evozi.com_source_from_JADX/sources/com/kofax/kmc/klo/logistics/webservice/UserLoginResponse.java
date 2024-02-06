package com.kofax.kmc.klo.logistics.webservice;

import com.kofax.kmc.klo.logistics.service.KofaxWebServiceConnectorService;
import java.util.ArrayList;
import java.util.List;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class UserLoginResponse implements KofaxWebServiceResponseBase {
    private String correctCaseUserName;
    private String errorMessage;
    private List<WscDestination> personalShortCuts = new ArrayList();
    private int resultCode;
    private boolean userLoggedIn;

    public String getCorrectCaseUserName() {
        return this.correctCaseUserName;
    }

    public void setCorrectCaseUserName(String str) {
        this.correctCaseUserName = str;
    }

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

    public boolean isUserLoggedIn() {
        return this.userLoggedIn;
    }

    public void setUserLoggedIn(boolean z) {
        this.userLoggedIn = z;
    }

    public List<WscDestination> getPersonalShortCuts() {
        return this.personalShortCuts;
    }

    public void setPersonalShortCuts(List<WscDestination> list) {
        this.personalShortCuts = list;
    }

    public void addPersonalShortCut(WscDestination wscDestination) {
        this.personalShortCuts.add(wscDestination);
    }

    public static UserLoginResponse populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        UserLoginResponse userLoginResponse = new UserLoginResponse();
        userLoginResponse.setCorrectCaseUserName(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "correctCaseUserName", (String) null));
        userLoginResponse.setErrorMessage(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "errorMessage", (String) null));
        userLoginResponse.setResultCode(Integer.parseInt(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "resultCode", "-1")));
        userLoginResponse.setUserLoggedIn("true".equals(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "userLoggedIn", "false")));
        for (int i = 0; i < accountHeaderViewHolder_ViewBinding.getPropertyCount(); i++) {
            AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
            accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, accountRemarkViewHolder);
            if (accountRemarkViewHolder.MediaBrowserCompat$ItemReceiver() != null && accountRemarkViewHolder.f5805x50fd9e4a.equals("personalShortCuts")) {
                userLoginResponse.addPersonalShortCut(WscDestination.populateFromResponse((AccountHeaderViewHolder_ViewBinding) accountRemarkViewHolder.MediaBrowserCompat$ItemReceiver()));
            }
        }
        return userLoginResponse;
    }
}
