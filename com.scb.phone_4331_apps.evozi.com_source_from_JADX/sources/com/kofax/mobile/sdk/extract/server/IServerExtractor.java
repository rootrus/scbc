package com.kofax.mobile.sdk.extract.server;

import com.kofax.mobile.sdk.extract.p018id.ICompletionListener;

public interface IServerExtractor {
    void cancelExtraction();

    void extractData(ServerExtractionParameters serverExtractionParameters, ICompletionListener<String> iCompletionListener);

    void login(LoginCredentials loginCredentials, ICompletionListener<String> iCompletionListener);
}
