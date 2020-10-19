package com.superbiz.jaxrs;

import org.apache.catalina.realm.JAASRealm;
import org.apache.meecrowave.Meecrowave;

public class Start {
    public static void main(String[] args) {
        new Meecrowave(new Meecrowave.Builder() {{
            setHttpPort(8888);
            setTomcatScanning(false);
            setTomcatAutoSetup(false);
            setRealm(new JAASRealm());
            user("admin", "secret");
        }})

                .bake()
                .await();
    }
}
