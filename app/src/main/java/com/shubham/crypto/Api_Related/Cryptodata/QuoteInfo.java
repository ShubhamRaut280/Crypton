package com.shubham.crypto.Api_Related.Cryptodata;

public class QuoteInfo {
    public double price;
    public double volume_24h;
    public double volume_change_24h;
    public double percent_change_1h;
    public double percent_change_24h;
    public double percent_change_7d;
    public double market_cap;
    public double market_cap_dominance;
    public double fully_diluted_market_cap;
    public String last_updated;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume_24h() {
        return volume_24h;
    }

    public void setVolume_24h(double volume_24h) {
        this.volume_24h = volume_24h;
    }

    public double getVolume_change_24h() {
        return volume_change_24h;
    }

    public void setVolume_change_24h(double volume_change_24h) {
        this.volume_change_24h = volume_change_24h;
    }

    public double getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(double percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public double getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(double percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public double getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(double percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public double getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(double market_cap) {
        this.market_cap = market_cap;
    }

    public double getMarket_cap_dominance() {
        return market_cap_dominance;
    }

    public void setMarket_cap_dominance(double market_cap_dominance) {
        this.market_cap_dominance = market_cap_dominance;
    }

    public double getFully_diluted_market_cap() {
        return fully_diluted_market_cap;
    }

    public void setFully_diluted_market_cap(double fully_diluted_market_cap) {
        this.fully_diluted_market_cap = fully_diluted_market_cap;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }
}
