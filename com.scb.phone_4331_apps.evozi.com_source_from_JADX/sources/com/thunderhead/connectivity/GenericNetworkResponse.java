package com.thunderhead.connectivity;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface GenericNetworkResponse<T> {
    void close();

    InputStream getBodyAsStream() throws IOException;

    T getDataBody();

    NetworkOperationError getError();

    Map<String, List<String>> getHeaders();

    String getMessage();

    int getStatus();

    boolean isSuccessful();
}
