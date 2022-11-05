package com.bca.model;

import java.io.Serializable;

public class AvaloqIngestRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String data;

    public AvaloqIngestRequest() {
    }

    public AvaloqIngestRequest(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public static class AvaloqIngestRequestBuilder {
        private String data;

        public AvaloqIngestRequestBuilder setOtp(String data) {
            this.data = data;
            return this;
        }

        public AvaloqIngestRequest build() {
            return new AvaloqIngestRequest(data);
        }
    }

    public static AvaloqIngestRequestBuilder newBuilder() {
        return new AvaloqIngestRequestBuilder();
    }
}
