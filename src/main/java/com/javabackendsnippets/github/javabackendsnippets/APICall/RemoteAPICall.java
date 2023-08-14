package com.javabackendsnippets.github.javabackendsnippets.APICall;

import okhttp3.*;

import java.io.IOException;

public class RemoteAPICall {

    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    public void doRemoteAPICall(String apiURL, String JSONBody) {
        OkHttpClient okHttpClient = new OkHttpClient();

        RequestBody body = RequestBody.create(JSONBody, JSON);

        Request request = new Request.Builder()
                .url(apiURL)
                .post(body)
                .build();

        try (Response response = okHttpClient.newCall(request).execute()) {
            System.out.println(response.body().string());
        } catch (IOException exception) {
            exception.getStackTrace();
        }
    }
}
