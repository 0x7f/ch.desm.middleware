package ch.desm.middleware.app.module.simulation.zusi.map;

import ch.desm.middleware.app.core.component.ComponentMapBase;

import java.util.Map;

/**
 * Created by Sebastian on 28.11.2014.
 */
public class ZusiMapFahrpultInit extends ComponentMapBase {

    @Override
    protected void init(){
        map.put("0100-0200::0100", "0100-0200::0100;;;command;ack_hello;zusi_version;zusi_fahrpult;s;?;#");
        map.put("0100-0200::0100", "0100-0200::0100;;;command;ack_hello;zusi_verbindungsinfo;zusi_fahrpult;s;?;#");
        map.put("0100-0200::0100", "0100-0200::0100;;;command;ack_hello;client_akzeptiert;zusi_fahrpult;s;?;#");
        map.put("0200-0400::0100", "0200-0400::0100;;;command;ack_needed_data;client_data_ack;zusi_fahrpult;s;?;#");
    }

}
