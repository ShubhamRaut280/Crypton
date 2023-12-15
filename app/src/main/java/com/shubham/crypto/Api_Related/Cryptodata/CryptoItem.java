package com.shubham.crypto.Api_Related.Cryptodata;

import java.util.List;

public class CryptoItem {
    public int id;
    public String name;
    public String symbol;
    public String slug;
    public int cmc_rank;
    public int num_market_pairs;
    public double circulating_supply;
    public double total_supply;
    public double max_supply;
    public boolean infinite_supply;
    public String last_updated;
    public String date_added;
    public List<String> tags;
    public Object platform; // You can replace Object with the appropriate type
    public Object self_reported_circulating_supply; // You can replace Object with the appropriate type
    public Object self_reported_market_cap; // You can replace Object with the appropriate type
    public Quote quote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getCmc_rank() {
        return cmc_rank;
    }

    public void setCmc_rank(int cmc_rank) {
        this.cmc_rank = cmc_rank;
    }

    public int getNum_market_pairs() {
        return num_market_pairs;
    }

    public void setNum_market_pairs(int num_market_pairs) {
        this.num_market_pairs = num_market_pairs;
    }

    public double getCirculating_supply() {
        return circulating_supply;
    }

    public void setCirculating_supply(double circulating_supply) {
        this.circulating_supply = circulating_supply;
    }

    public double getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(double total_supply) {
        this.total_supply = total_supply;
    }

    public double getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(long max_supply) {
        this.max_supply = max_supply;
    }

    public boolean isInfinite_supply() {
        return infinite_supply;
    }

    public void setInfinite_supply(boolean infinite_supply) {
        this.infinite_supply = infinite_supply;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Object getPlatform() {
        return platform;
    }

    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    public Object getSelf_reported_circulating_supply() {
        return self_reported_circulating_supply;
    }

    public void setSelf_reported_circulating_supply(Object self_reported_circulating_supply) {
        this.self_reported_circulating_supply = self_reported_circulating_supply;
    }

    public Object getSelf_reported_market_cap() {
        return self_reported_market_cap;
    }

    public void setSelf_reported_market_cap(Object self_reported_market_cap) {
        this.self_reported_market_cap = self_reported_market_cap;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}
