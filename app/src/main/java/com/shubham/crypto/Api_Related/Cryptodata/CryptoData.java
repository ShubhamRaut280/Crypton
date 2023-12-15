package com.shubham.crypto.Api_Related.Cryptodata;

import java.util.List;
import java.util.Map;

public class CryptoData {
    public List<CryptoItem> data;
    public Status status;

    public CryptoData(List<CryptoItem> data, Status status) {
        this.data = data;
        this.status = status;
    }

    public List<CryptoItem> getData() {
        return data;
    }

    public void setData(List<CryptoItem> data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

