package com.univocity.trader.exchange.binance.futures.examples.websocket;

import com.univocity.trader.exchange.binance.futures.SubscriptionClient;
import com.univocity.trader.exchange.binance.futures.examples.constants.PrivateConfig;

public class SubscribeSymbolTicker {

    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
   
        client.subscribeSymbolTickerEvent("btcusdt", ((event) -> {
            System.out.println(event);
            client.unsubscribeAll();
        }));

    }

}
